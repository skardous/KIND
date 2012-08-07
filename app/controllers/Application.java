package controllers;

import org.codehaus.jackson.node.ObjectNode;
import org.apache.commons.codec.binary.Base64;


import java.util.*;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import javax.mail.Transport;

import javax.mail.internet.AddressException;
import javax.mail.NoSuchProviderException;
import javax.mail.MessagingException;

import models.*;
import play.*;
import play.data.*;

import play.libs.Json.*;
import play.mvc.*;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.BodyParser;
import play.libs.Json;

import static play.libs.Json.toJson;
import org.codehaus.jackson.JsonNode;

import views.html.*;

public class Application extends Controller {

	static Form<Evenement> eventForm = form(Evenement.class);

	public static void sendSpecificMail(String origineMail, String destinataires, String title, String content) {
		Properties		props	    = new Properties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.host", "flaubert");
		props.put("mail.smtp.port", "25");
		props.put("mail.smtp.auth", "true");

		final String username = "simon.kardous";
		final String password = "chu76";
		

		Authenticator authenticator = new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		};

		Transport transport = null;		

		try {
			Session session = Session.getInstance(props, authenticator);
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(origineMail));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(destinataires));
			message.setSubject(title, "iso-8859-1");
			message.setText(content, "iso-8859-1");
			message.setHeader("Content-Type", "text/plain;charset=\"iso-8859-1\""); 
			message.setHeader("Content-Transfert-Encoding", "8bit");
			transport = session.getTransport();
			transport.connect(username, password);
			transport.sendMessage(message, message.getAllRecipients());
		} catch (MessagingException ex) {
			throw new RuntimeException(ex);

		} finally {
			if (transport != null) try { transport.close(); } catch (MessagingException logOrIgnore) {}
		}

	}

	@BodyParser.Of(BodyParser.Json.class)
	public static Result sendMail(Long idevt) {		

		JsonNode json = request().body().asJson();
		String mails = json.findPath("mailslist").getTextValue();	
		String textPerso = json.findPath("textPerso").getTextValue();
		
		String[] mailsList = mails.split(",");		
		
		Evenement e = Evenement.findEvt.ref(idevt);
		
		for (String s:mailsList){			
			Long retId = Evenement.addMailAdress(e, s);
		}		
		
		System.out.println(e.mailSentList);

		
		String origineMail = "kind@chu-rouen.fr";
		String destinataires = mails;
		String title = "KIND: Invitation à "+e.titre;
		String text = "Bonjour, \n\n"+
					"Vous avez été invité par "+e.createur+" à noter vos disponibilités pour participer à l'événement intitulé : \""+e.titre+"\".\n";

		if (textPerso != "" && textPerso != null) {
			text = text + "\nMessage d'invitation : \n"+textPerso+"\n\n";
		}
		text = text+"Pour répondre et noter vos disponibilités, connectez-vous au lien d'invitation suivant depuis un des ordinateurs du CHU de Rouen :\n"+
				    "http://intranet2:9000/KIND/eventEdit/"+new String(Base64.encodeBase64(Long.toString(idevt).getBytes()))+"/consult\n\n"+
				    "Cordialement, \n"+
				    "L'équipe KIND";

		sendSpecificMail(origineMail, destinataires, title, text);	

		return ok(views.html.eventlist.render(Evenement.all()));

	}

	public static Result index() {
		return ok(views.html.index.render());
	}

	public static Result eventCreateEmpty() {
		return ok(views.html.eventCreate.render(eventForm,null));
	}

	public static Result eventCreateFilled(Long id) {
		Evenement evt = Evenement.findEvt.ref(id);
		System.out.println("TITRE :"+evt.titre);		
			
		return ok(views.html.eventCreate.render(eventForm.fill(evt),evt));
	}

	public static Result eventlist() {
		return ok(views.html.eventlist.render(Evenement.all()));
	}

	public static Result newEvent() {
		Form<Evenement> filledForm = eventForm.bindFromRequest();
		if (filledForm.hasErrors()) {
			return badRequest(views.html.eventCreate.render(filledForm, null));
		} else {
			Evenement.create(filledForm.get());
			Evenement tempevt = Evenement.findEvt.ref(filledForm.get().id);

			String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890_-@#&'(!?)$%?:;/.?,";
	        Random rand = new Random();
	        

			
			tempevt.update();
			

			String origineMail = "kind@chu-rouen.fr";
			String destinataires = filledForm.get().email;
			String title = "KIND: Création de l'évenement "+filledForm.get().titre;

	        
			String text = "Bonjour, \n\n"+
					"Vous venez de créer un évenènement sur le gestionnaire d'évènements du CHU de Rouen : \""+filledForm.get().titre+"\".\n\n"+
					"Pour y répondre, connectez-vous au lien d'invitation suivant depuis un des ordinateurs du CHU:\n"+
				    "http://intranet2:9000/KIND/eventEdit/"+new String(Base64.encodeBase64(Long.toString(filledForm.get().id).getBytes()))+"/consult\n\n"+
				    "Pour l'administrer, connectez-vous au lien d'invitation suivant depuis un des ordinateurs du CHU :\n"+
				    "http://intranet2:9000/KIND/eventEdit/"+new String(Base64.encodeBase64(Long.toString(filledForm.get().id).getBytes()))+"/consult/"+new String(Base64.encodeBase64((filledForm.get().email).getBytes()))+"/adm\n\n"+
				    
				    "Cordialement, \n"+
				    "L'équipe KIND";
			

			sendSpecificMail(origineMail, destinataires, title, text);
			
			return redirect(routes.Application.dateSelection(filledForm.get().id));
		}
	}

	public static Result updateEvent(Long id) {
		Form<Evenement> filledForm = eventForm.bindFromRequest();
		if (filledForm.hasErrors()) {
			return badRequest(views.html.eventCreate.render(filledForm, null));
		} else {
			Evenement evt = Evenement.findEvt.ref(id);
			filledForm.get().update(id);
		}
			
		return redirect(routes.Application.dateSelection(id));
	}


	public static Result dateSelection(Long id) {
		Form<Evenement> evenementForm = form(Evenement.class).fill(
				Evenement.findEvt.byId(id));
		Evenement created = evenementForm.get();
		return ok(dateselection.render(id, evenementForm, created));
	}

	public static Result heureSelection(Long id) {
		Form<Evenement> evenementForm = form(Evenement.class).fill(
				Evenement.findEvt.byId(id));
		Evenement created = evenementForm.get();
		return ok(heureselection.render(id, evenementForm, created));
	}
	
	public static Result resume(Long id) {
		Form<Evenement> evenementForm = form(Evenement.class).fill(
				Evenement.findEvt.byId(id));
		Evenement created = evenementForm.get();
		return ok(resume.render(id, evenementForm, created));
	}
	
	public static Result invitation(Long id) {
		Form<Evenement> evenementForm = form(Evenement.class).fill(
				Evenement.findEvt.byId(id));
		Evenement created = evenementForm.get();
		return ok(invitation.render(id, evenementForm, created));
	}


	// action d'affichage du formulaire d'edition d'evt
	public static Result edit(String idhash) {
		Long id;
		try{
			id = Long.valueOf(new String(Base64.decodeBase64(idhash.getBytes())));
		} catch (Exception e) {
			return ok(error.render());
		}
		Evenement evt = Evenement.findEvt.byId(id);
		if (evt == null){
			return ok(error.render());
		}
		Form<Evenement> evenementForm = form(Evenement.class).fill(evt);
		Evenement created = evenementForm.get();
		return ok(editForm.render(created, 0));
	}

	public static Result editAdm(String idhash, String mailhash) {
		Long id;
		try {
		    id = Long.valueOf(new String(Base64.decodeBase64(idhash.getBytes())));
		} catch (Exception e) {
			return ok(error.render());
		}
		
		Evenement evt = Evenement.findEvt.byId(id);
		if (evt == null){
			return ok(error.render());
		}
		Form<Evenement> evenementForm = form(Evenement.class).fill(evt);
		Evenement created = evenementForm.get();
		return ok(editForm.render(created, 1));
	}

	

	// action de validation du formulaire d'edition d'evt
	public static Result update(Long id) {
		Form<Evenement> evenementForm = form(Evenement.class).bindFromRequest();
		if (evenementForm.hasErrors()) {
			return badRequest(views.html.index.render());
		}

		// eventForm.get().update(id);
		Evenement evenement = evenementForm.get();
		Evenement.updateElement(evenement, id);
		flash("success", "Evenement " + evenementForm.get().titre
				+ " has been updated");
		return redirect(routes.Application.eventlist());
	}

	@BodyParser.Of(BodyParser.Json.class)
	public static Result updatePersonne(Long evtId) {
		JsonNode json = request().body().asJson();
		String idStr = json.findPath("id").getTextValue();
		Long idpers = Long.valueOf(idStr);
		String newNomParticipant = json.findPath("nom").getTextValue();

		Evenement.updateParticipant(evtId, idpers, newNomParticipant);		
		return redirect(routes.Application.eventlist());
	}

	@BodyParser.Of(BodyParser.Json.class)
	public static Result addParticipant(String idhash) {
		Long id = Long.valueOf(new String(Base64.decodeBase64(idhash.getBytes())));
		JsonNode json = request().body().asJson();
		String name = json.findPath("nom").getTextValue();
		String locked = json.findPath("locked").getTextValue();
		String pwd = json.findPath("pwd").getTextValue();
		String admstr = json.findPath("adm").getTextValue();
		Integer adm = Integer.valueOf(admstr);

		Evenement evenement = Evenement.findEvt.byId(id);
		System.out.println("titre: " + evenement.titre);
		Long retId = Evenement.addPersonne(evenement, id, name, locked, pwd);
		ObjectNode result = Json.newObject();
		result.put("idPersonne",""+retId+"");

		return ok(table.render(evenement, adm));

	}

	@BodyParser.Of(BodyParser.Json.class)
	public static Result newHoraire(Long id) {
		JsonNode json = request().body().asJson();
		String jour = json.findPath("jour").getTextValue();	
		Long idjour = Long.valueOf(jour);

		Long horaireid = Evenement.newHoraire(id, idjour);
		ObjectNode result = Json.newObject();
		result.put("idHoraire",""+horaireid+"");
		return ok(result);

	}



	@BodyParser.Of(BodyParser.Json.class)
	public static Result deleteHoraire(Long id) {
		JsonNode json = request().body().asJson();
		String jour = json.findPath("jour").getTextValue();	
		Long idjour = Long.valueOf(jour);
		String horaire = json.findPath("horaire").getTextValue();
		Long idhoraire = Long.valueOf(horaire);

		Evenement evenement = Evenement.findEvt.byId(id);
		Evenement.deleteHoraire(idjour, idhoraire);

		return ok(table.render(evenement, 1));

	}

	@BodyParser.Of(BodyParser.Json.class)
	public static Result addDate(Long id) {
		JsonNode json = request().body().asJson();
		String date = json.findPath("date").getTextValue();

		Evenement evenement = Evenement.findEvt.byId(id);
		Long jourid = Evenement.addJour(evenement, id, date);
		
		return ok(table.render(evenement, 1));

	}

	@BodyParser.Of(BodyParser.Json.class)
	public static Result removeDate(Long id) {
		JsonNode json = request().body().asJson();
		String date = json.findPath("idDate").getTextValue();
		Long idDate = Long.valueOf(date);

		Evenement evenement = Evenement.findEvt.byId(id);		
		Evenement.removeJour(id, idDate);
		return ok(table.render(evenement, 1));

	}

	@BodyParser.Of(BodyParser.Json.class)
	public static Result dateChanged(Long idevt) {
		JsonNode json = request().body().asJson();
		String horaire = json.findPath("idhoraire").getTextValue();
		Long idhoraire = Long.valueOf(horaire);
		String debut = json.findPath("debut").getTextValue();
		String fin = json.findPath("fin").getTextValue();
		System.out.println("idevt : "+idevt);		

		Evenement evenement = Evenement.findEvt.byId(idevt);
		Evenement.updateDate(idhoraire, debut, fin);

		return ok(table.render(evenement, 1));
	}

	public static Result deleteEvent(Long id) {
		Evenement.delete(id);
		return redirect(routes.Application.index());
	}

	@BodyParser.Of(BodyParser.Json.class)
	public static Result deleteParticipant(Long idevt) {
		JsonNode json = request().body().asJson();
		String idStr = json.findPath("id").getTextValue();
		Long idparti = Long.valueOf(idStr);

		Evenement.removeParticipant(idevt, idparti);
		return redirect(routes.Application.eventlist());
	}

	@BodyParser.Of(BodyParser.Json.class)
	public static Result checkBoxHoraire(Long id) {
		JsonNode json = request().body().asJson();
		String horaire = json.findPath("idhoraire").getTextValue();
		Long idhoraire = Long.valueOf(horaire);
		String personne = json.findPath("idpersonne").getTextValue();
		Long idpersonne = Long.valueOf(personne);

		Evenement evenement = Evenement.findEvt.byId(id);
		System.out.println("titre: " + evenement.titre);
		Personne.addChoixHoraire(idpersonne, idhoraire);

		return ok();

	}

	@BodyParser.Of(BodyParser.Json.class)
	public static Result checkBoxJour(Long id) {
		JsonNode json = request().body().asJson();
		String jour = json.findPath("idjour").getTextValue();
		Long idjour = Long.valueOf(jour);
		String personne = json.findPath("idpersonne").getTextValue();
		Long idpersonne = Long.valueOf(personne);

		Evenement evenement = Evenement.findEvt.byId(id);		
		Personne.addChoixJour(idpersonne, idjour);

		return ok();

	}

	@BodyParser.Of(BodyParser.Json.class)
	public static Result changeObligatoire(Long id) {
		JsonNode json = request().body().asJson();		
		String personne = json.findPath("idpersonne").getTextValue();
		Long idpersonne = Long.valueOf(personne);		
		
		Personne.changeObligatoire(idpersonne);

		return ok();

	}

	@BodyParser.Of(BodyParser.Json.class)
	public static Result getPass() {
		JsonNode json = request().body().asJson();		
		String personne = json.findPath("idpers").getTextValue();		
		Long idpersonne = Long.valueOf(personne);		
		
		Personne p = Personne.findPers.ref(idpersonne);		

		ObjectNode result = Json.newObject();
		result.put("pass",""+p.password+"");
		return ok(result);

	}
	
	@BodyParser.Of(BodyParser.Json.class)
	public static Result addMail(Long id) {
		
		JsonNode json = request().body().asJson();
		String adress = json.findPath("adress").getTextValue();

		Evenement evt = Evenement.findEvt.byId(id);
		Long retId = Evenement.addMailAdress(evt, adress);
		
		return ok();
	}

	
}