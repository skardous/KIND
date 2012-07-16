package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.Valid;

import play.data.format.Formats;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
public class Personne extends Model {

	@Id
	@Formats.NonEmpty
	public Long id;	

	public String nom;

	public Boolean obligatoire;
	
	public Boolean locked;
	
	public String password;
	
	public void setNom(String nom) {
		this.nom = nom;
	}	

	public Personne(String nom, String locked, String pwd) {
		super();
		this.nom = nom;
		this.obligatoire = false;
		this.locked = Boolean.valueOf(locked).booleanValue();
		this.password = pwd;
	}
	
	@Valid
	@ManyToMany(cascade=CascadeType.REMOVE)
	public List<Horaire> inscriptionsHoraires = new ArrayList<Horaire>();
	
	@Valid
	@ManyToMany(cascade=CascadeType.REMOVE)
	public List<Jour> inscriptionsJours = new ArrayList<Jour>();

	public static Finder<Long, Personne> findPers = new Finder(Long.class,
			Personne.class);	

	public static void delete(Long id) {
		System.out.println(findPers.ref(id).toString());
		findPers.ref(id).delete();
	}

	public static void addChoixHoraire(Long idpersonne, Long idhoraire) {
		Personne p = findPers.ref(idpersonne);
		Horaire h = Horaire.findHoraire.ref(idhoraire);
		if (p.inscriptionsHoraires.contains(h)) {
			p.inscriptionsHoraires.remove(h);
		} else {
			p.inscriptionsHoraires.add(h);
		}
		p.saveManyToManyAssociations("inscriptionsHoraires");
		
	}
	
	public static void addChoixJour(Long idpersonne, Long idjour) {
		Personne p = findPers.ref(idpersonne);
		Jour j = Jour.findJour.ref(idjour);
		if (p.inscriptionsJours.contains(j)) {
			p.inscriptionsJours.remove(j);
		} else {
			p.inscriptionsJours.add(j);
		}
		p.saveManyToManyAssociations("inscriptionsJours");
		
	}

	public static void changeObligatoire(Long idpersonne) {
		Personne p = findPers.ref(idpersonne);
		
		if (p.obligatoire) {
			p.obligatoire = false;
		} else {
			p.obligatoire = true;
		}
		p.update();
		
	}

}
