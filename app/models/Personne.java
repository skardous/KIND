package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import play.data.format.Formats;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
public class Personne extends Model {

	@Id
	@Formats.NonEmpty
	public Long id;

	public Long getId() {
		return id;
	}

	public String nom;

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public Personne(String nom) {
		super();
		this.nom = nom;
	}

	public static Finder<Long, Personne> findPers = new Finder(Long.class,
			Personne.class);

	

	public static void delete(Long id) {
		System.out.println(findPers.ref(id).toString());
		findPers.ref(id).delete();
	}

	public static void addChoix(Long idpersonne, Long idhoraire) {
		// TODO Auto-generated method stub
		
	}

}
