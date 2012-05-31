package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
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

	public String getTitre() {
		return titre;
	}

	public String lieu;

	public String descriptif;

	public String getDescriptif() {
		return descriptif;
	}

	@Required
	public String createur;

	public String getCreateur() {
		return createur;
	}

	public String mail;

	public String dates;
	
	public String heures;

	@Valid
	@ManyToMany
	public List<Personne> participants = new ArrayList<Personne>();

	// @Formats.DateTime(pattern="MM/dd/yyyy")
	// public Date date;

	/*
	 * public int hdebut; public int mdebut;
	 * 
	 * public int hfin; public int mfin;
	 */

	/*
	 * public Evenement() {
	 * 
	 * }
	 * 
	 * public Evenement(String titre, String lieu, String descriptif, String
	 * createur, String mail, String... participants) { this.titre = titre;
	 * this.lieu = lieu; this.descriptif = descriptif; this.createur = createur;
	 * this.mail = mail; this.participants = new ArrayList<Personne>(); for
	 * (String participant : participants) { this.participants.add(new
	 * Personne(participant)); } }
	 */

	public static Finder<Long, Evenement> findEvt = new Finder(Long.class,
			Evenement.class);

	public static List<Evenement> all() {
		// Evenement.datesList = Arrays.asList(Evenement.dates.split(","));
		return findEvt.all();
	}

	public static void create(Evenement evt) {
		evt.save();
	}

	public static void addPersonne(Evenement evt, Long id, String name) {
		evt.participants.add(new Personne(name));
		evt.participants.get(evt.participants.size() - 1).save();
		evt.update(id);
		Ebean.saveManyToManyAssociations(evt, "participants");
	}

	public static void updateElement(Evenement evt, Long id) {

		// System.out.println(Personne.findPers.byId(arg0));

		for (Personne participant : evt.participants) {
			participant.save();
		}
		evt.update(id);
		Ebean.saveManyToManyAssociations(evt, "participants");
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
		findEvt.ref(id).delete();

	}

}