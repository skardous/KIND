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
	@ManyToMany
	public List<Horaire> horaires = new ArrayList<Horaire>();

	public static Finder<Long, Jour> findJour = new Finder(Long.class,
			Jour.class);

	
	public Jour(String date) {
		super();
		this.date = date;
	}		
	
	public static void delete(Long id) {
		System.out.println(findJour.ref(id).toString());
		findJour.ref(id).delete();
	}
	
	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return date;
	}
	
	public Long getId() {
		return id;
	}

}
