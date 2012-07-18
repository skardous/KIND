package controllers;

import org.codehaus.jackson.node.ObjectNode;


import java.util.Properties;

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

	@BodyParser.Of(BodyParser.Json.class)
	public static Result sendMail(Long idevt) {		

		JsonNode json = request().body().asJson();
		String mails = json.findPath("mailslist").getTextValue();	
		
		Evenement e = Evenement.findEvt.ref(idevt);
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
			message.setFrom(new InternetAddress("kind@chu-rouen.fr"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(mails));
			message.setSubject("KIND: Invitation à "+e.titre, "iso-8859-1");
			message.setText(
					"Bonjour, \n\n"+
					"Vous avez été invité à noter vos disponibilités pour participer à \""+e.titre+"\".\n"+
					"Pour répondre, connectez-vous au lien d'invitation suivant depuis un des ordinateurs du CHU:\n"+
				    "http://localhost:9000/eventEdit/"+idevt+"\n\n"+
				    "Cordialement, \n"+
				    "L'équipe KIND"
				    , "iso-8859-1");
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



		
		return ok(views.html.eventlist.render(Evenement.all()));

	}

	public static Result index() {
		return ok(views.html.index.render());
	}

	public static Result events() {
		return ok(views.html.event.render(Evenement.all(), eventForm));
	}

	public static Result eventlist() {
		return ok(views.html.eventlist.render(Evenement.all()));
	}

	public static Result newEvent() {
		Form<Evenement> filledForm = eventForm.bindFromRequest();
		if (filledForm.hasErrors()) {
			return badRequest(views.html.event.render(Evenement.all(),
					filledForm));
		} else {
			Evenement.create(filledForm.get());
			System.out.println("id:"+filledForm.get().id);
			return redirect(routes.Application.dateSelection(filledForm.get().id));
		}
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


	// action d'affichage du formulaire d'edition d'evt
	public static Result edit(Long id) {
		Form<Evenement> evenementForm = form(Evenement.class).fill(
				Evenement.findEvt.byId(id));
		Evenement created = evenementForm.get();
		return ok(editForm.render(created));
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
	public static Result addParticipant(Long id) {
		JsonNode json = request().body().asJson();
		String name = json.findPath("nom").getTextValue();
		String locked = json.findPath("locked").getTextValue();
		String pwd = json.findPath("pwd").getTextValue();

		Evenement evenement = Evenement.findEvt.byId(id);
		System.out.println("titre: " + evenement.titre);
		Long retId = Evenement.addPersonne(evenement, id, name, locked, pwd);
		ObjectNode result = Json.newObject();
		result.put("idPersonne",""+retId+"");
		return ok(result);

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

		Evenement.deleteHoraire(idjour, idhoraire);

		return redirect(routes.Application.eventlist());

	}

	@BodyParser.Of(BodyParser.Json.class)
	public static Result addDate(Long id) {
		JsonNode json = request().body().asJson();
		String date = json.findPath("date").getTextValue();

		Evenement evenement = Evenement.findEvt.byId(id);
		Long jourid = Evenement.addJour(evenement, id, date);
		ObjectNode result = Json.newObject();
		result.put("idJour",""+jourid+"");
		return ok(result);

	}

	@BodyParser.Of(BodyParser.Json.class)
	public static Result removeDate(Long id) {
		JsonNode json = request().body().asJson();
		String date = json.findPath("idDate").getTextValue();
		Long idDate = Long.valueOf(date);

		Evenement evenement = Evenement.findEvt.byId(id);		
		Evenement.removeJour(id, idDate);
		return redirect(routes.Application.eventlist());

	}

	@BodyParser.Of(BodyParser.Json.class)
	public static Result dateChanged(Long idevt) {
		JsonNode json = request().body().asJson();
		String horaire = json.findPath("idhoraire").getTextValue();
		Long idhoraire = Long.valueOf(horaire);
		String debut = json.findPath("debut").getTextValue();
		String fin = json.findPath("fin").getTextValue();		

		Evenement.updateDate(idhoraire, debut, fin);
		return redirect(routes.Application.eventlist());
	}

	public static Result deleteEvent(Long id) {
		Evenement.delete(id);
		return redirect(routes.Application.eventlist());
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
		
		//System.out.println("personnepwd:"+personne);
		Long idpersonne = Long.valueOf(personne);		
		
		Personne p = Personne.findPers.ref(idpersonne);		

		ObjectNode result = Json.newObject();
		result.put("pass",""+p.password+"");
		return ok(result);

	}
}