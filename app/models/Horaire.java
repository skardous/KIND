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
public class Horaire extends Model {

	@Id
	@Formats.NonEmpty
	public Long id;	

	public String debut;
	
	public String fin;
		

	public static Finder<Long, Horaire> findHoraire = new Finder(Long.class,
			Horaire.class);
		
	
	public Horaire(String debut, String fin) {
		this.debut = debut;
		this.fin = fin;
	}



	public static void delete(Long id) {
		System.out.println(findHoraire.ref(id).toString());
		findHoraire.ref(id).delete();
	}
	
	
	
	public Long getId() {
		return id;
	}

}
