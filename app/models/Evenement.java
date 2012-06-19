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

	@Required
	public String titre;	

	public String lieu;

	public String descriptif;	

	@Required
	public String createur;	
	
	@Email
	public String mail;	

	@Valid
	@ManyToMany(cascade=CascadeType.ALL)
	public List<Personne> participants = new ArrayList<Personne>();
	
	@Valid
	@ManyToMany(cascade=CascadeType.ALL)
	public List<Jour> jours = new ArrayList<Jour>();

	public static Finder<Long, Evenement> findEvt = new Finder(Long.class,
			Evenement.class);

	public static List<Evenement> all() {
		// Evenement.datesList = Arrays.asList(Evenement.dates.split(","));
		return findEvt.all();
	}

	public static void create(Evenement evt) {
		evt.save();
	}

	
	
	
	public static void updateElement(Evenement evt, Long id) {

		// System.out.println(Personne.findPers.byId(arg0));

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
		
		evt.jours.remove(Jour.findJour.ref(idDate));
		evt.saveManyToManyAssociations("jours");		
	}

	//Manupilation de Personnes

	public static Long addPersonne(Evenement evt, Long id, String name) {
		Personne p = new Personne(name);
		evt.participants.add(p);
		p.save();
		
		evt.update(id);
		Ebean.saveManyToManyAssociations(evt, "participants");
		return p.getId();
	}

	public static void removeParticipant(Long eventId, Long participId) {
		Evenement e = Evenement.findEvt.ref(eventId);
		e.participants.remove(Personne.findPers.ref(participId));
		e.saveManyToManyAssociations("participants");
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
		
		List<Jour> tempJour = new ArrayList<Jour>();
		List<Horaire> tempHoraire = new ArrayList<Horaire>();
		List<Personne> tempPersonne = new ArrayList<Personne>();
		
		//e.jours.clear();
		
		//e.saveManyToManyAssociations("jours");

		
		for (Personne p : e.participants) {
			tempPersonne.add(p);			
		}	
		for (Personne p : tempPersonne) {
			e.participants.remove(p);			
			e.saveManyToManyAssociations("participants");
			p.delete();			
		}

		for (Jour j : e.jours) {
			tempJour.add(j);			
		}	
		for (Jour jr : tempJour) {
			e.jours.remove(jr);			
			e.saveManyToManyAssociations("jours");	
			jr.delete();		
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
		
		for (Horaire h : j.horaires) {
			if (h.getId().equals(idhoraire)) {	
				j.horaires.remove(Horaire.findHoraire.ref(idhoraire));
				j.saveManyToManyAssociations("horaires");				
				break;
			}			
		}
	}

}