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
public class Mail extends Model {

	@Id
	@Formats.NonEmpty
	public Long id;	

	public String adresse;


	public static Finder<Long, Horaire> findMail = new Finder(Long.class,
			Mail.class);		
	
	public Mail(String adresse) {
		this.adresse = adresse;		
	}

	public static void delete(Long id) {		
		findMail.ref(id).delete();
	}
	
}
