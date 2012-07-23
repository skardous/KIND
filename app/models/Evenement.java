package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import play.db.ebean.Model;

import java.util.*;

import javax.validation.*;

import com.avaje.ebean.Ebean;

import play.data.validation.Constraints.*;

@SuppressWarnings("serial")
@Entity
public class Evenement extends Model {

	@Id
	public Long id;	

	@Required(message = "Vous devez saisir un titre.") 
	public String titre;	

	public String lieu;

	public String descriptif;	

	@Required(message = "Vous devez saisir un nom de créateur.") 
	public String createur;	
	
	@Required
	@Email
	public String email;	

	public String mailSentList;

	public String passAdmin;

	@Valid
	@ManyToMany(cascade=CascadeType.REMOVE)
	public List<Personne> participants = new ArrayList<Personne>();
	
	@Valid
	@ManyToMany(cascade=CascadeType.REMOVE)
	public List<Jour> jours = new ArrayList<Jour>();

	public static Finder<Long, Evenement> findEvt = new Finder(Long.class,
			Evenement.class);

	public static List<Evenement> all() {		
		return findEvt.all();
	}

	public static void create(Evenement evt) {
		evt.save();
	}

	
	
	
	public static void updateElement(Evenement evt, Long id) {		

		for (Personne participant : evt.participants) {
			participant.save();
		}
		evt.update(id);
		Ebean.saveManyToManyAssociations(evt, "participants");
	}

	//Manipulation de Jours

	public static Long addJour(Evenement evt, Long id, String date) {
		Boolean exists = false;
		if (evt.jours != null) {
			for (Jour j : evt.jours) {
				if (j.date.equals(date)) {	
					evt.jours.remove(Jour.findJour.ref(j.id));
					evt.saveManyToManyAssociations("jours");
					exists = true;
					break;
				}			
			}
		}
		if (!exists) {
			evt.jours.add(new Jour(date));
			evt.jours.get(evt.jours.size() - 1).save();
		}
		evt.update(id);
		Ebean.saveManyToManyAssociations(evt, "jours");
		return (evt.jours.get(evt.jours.size() - 1)).id;
	}

	
	public static void removeJour(Long eventId, Long idDate) {
		Evenement evt = Evenement.findEvt.ref(eventId);
		Jour j = Jour.findJour.ref(idDate);
		
		evt.jours.remove(j);
		evt.saveManyToManyAssociations("jours");		

		j.delete();
	}

	//Manupilation de Personnes

	public static Long addPersonne(Evenement evt, Long id, String name, String locked, String pwd) {
		Personne p = new Personne(name, locked, pwd);
		evt.participants.add(p);
		p.save();
		
		evt.update(id);
		Ebean.saveManyToManyAssociations(evt, "participants");
		return p.id;
	}

	public static void removeParticipant(Long eventId, Long participId) {
		Evenement e = Evenement.findEvt.ref(eventId);
		e.participants.remove(Personne.findPers.ref(participId));		
		e.saveManyToManyAssociations("participants");
		Personne.findPers.ref(participId).delete();
	}
	
	public static void updateParticipant(Long eventId, Long participId, String participNom) {
		Evenement e = Evenement.findEvt.ref(eventId);
		int index = e.participants.indexOf(Personne.findPers.ref(participId));
		Personne p = e.participants.get(index);
		p.setNom(participNom);		
		e.participants.set(index, p);
		
		for (Personne participant : e.participants) {
			participant.save();
		}
		e.update(eventId);
		
		e.saveManyToManyAssociations("participants");
	}

	public static void delete(Long id) {
		Evenement e = findEvt.ref(id);
		
		List<Jour> tempJourEvt = new ArrayList<Jour>();
		List<Jour> tempJourPersonne = new ArrayList<Jour>();
		List<Horaire> tempHoraireJour = new ArrayList<Horaire>();
		List<Horaire> tempHorairePersonne = new ArrayList<Horaire>();
		List<Personne> tempPersonne = new ArrayList<Personne>();
		
		for (Jour j : e.jours) {
			tempJourEvt.add(j);			
		}	
		for (Jour jr : tempJourEvt) {
			e.jours.remove(jr);			
			e.saveManyToManyAssociations("jours");	
			for (Horaire h : jr.horaires) {
				tempHoraireJour.add(h);			
			}	
			for (Horaire hr : tempHoraireJour) {
				jr.horaires.remove(hr);			
				jr.saveManyToManyAssociations("horaires");					
			}
				
		}
		
		
		for (Personne p : e.participants) {
			tempPersonne.add(p);			
		}	
		for (Personne p : tempPersonne) {
			e.participants.remove(p);			
			e.saveManyToManyAssociations("participants");
			
			for (Horaire h : p.inscriptionsHoraires) {
				tempHorairePersonne.add(h);			
			}	
			for (Horaire hr : tempHorairePersonne) {
				p.inscriptionsHoraires.remove(hr);			
				p.saveManyToManyAssociations("inscriptionsHoraires");					
			}
			
			for (Jour j : p.inscriptionsJours) {
				tempJourPersonne.add(j);			
			}
			for (Jour j : tempJourPersonne) {
				p.inscriptionsJours.remove(j);			
				p.saveManyToManyAssociations("inscriptionsJours");
			}
			
			p.delete();
		}
		
		
		
		for (Horaire hr : tempHorairePersonne) {
			if (!tempHoraireJour.contains(hr)) {
				hr.delete();
			}
		}
		
		for (Horaire hr : tempHoraireJour) {
			hr.delete();
		}
		
		for (Jour j: tempJourEvt) {
			j.delete();
		}
		for (Jour jr: tempJourPersonne) {
			if (!tempJourEvt.contains(jr)) {
				jr.delete();
			}
		}

		
		
		e.delete();

	}

	public static void updateDate(Long idhoraire, String debut,
			String fin) {
		
		Horaire h = Horaire.findHoraire.ref(idhoraire);
				
		h.setDebut(debut);
		h.setFin(fin);
		h.update(idhoraire);
		
		
	}

	public static Long newHoraire(Long idEvt, Long jour) {
		Jour j = Jour.findJour.ref(jour);
		Horaire hr = new Horaire ("08h00","17h00");
		
		j.horaires.add(hr);
		hr.save();		
		j.saveManyToManyAssociations("horaires");
		
		return hr.getId();	
	}

	public static void deleteHoraire(Long idjour, Long idhoraire) {
		Jour j = Jour.findJour.ref(idjour);

		j.horaires.remove(Horaire.findHoraire.where().idEq(idhoraire).findUnique());
		j.saveManyToManyAssociations("horaires");

		(Horaire.findHoraire.where().idEq(idhoraire).findUnique()).delete();		
		
	}

}