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
public class Jour extends Model {

	@Id
	@Formats.NonEmpty
	public Long id;	

	public String date;
	
	@Valid
	@ManyToMany(cascade=CascadeType.REMOVE)
	public List<Horaire> horaires = new ArrayList<Horaire>();

	public static Finder<Long, Jour> findJour = new Finder(Long.class,
			Jour.class);

	
	public Jour(String date) {
		super();
		this.date = date;
	}		
	
	public static void delete(Long id) {
		Jour jour = findJour.ref(id);
		List<Horaire> tempHoraire = new ArrayList<Horaire>();

		for (Horaire h : jour.horaires) {
			tempHoraire.add(h);			
		}	
		for (Horaire hr : tempHoraire) {
			jour.horaires.remove(hr);			
			jour.saveManyToManyAssociations("horaires");	
				
		}
		
		for (Horaire hr : tempHoraire) {
			hr.delete();
		}
		jour.delete();
		
	}
	
	public static void deleteLinkedPersonne(Long id) {
		Personne.deleteFromJour(id);
	}
	
	public void setDate(String date) {
		this.date = date;
	}

}
