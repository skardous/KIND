package controllers;

import org.codehaus.jackson.node.ObjectNode;

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
			System.out.println(filledForm.get().id);
			return redirect(routes.Application.dateSelection(filledForm.get().id));
		}
	}

	
	public static Result dateSelection(Long id) {
		Form<Evenement> evenementForm = form(Evenement.class).fill(
				Evenement.findEvt.byId(id));
		Evenement created = evenementForm.get();
		return ok(dateselection.render(id, evenementForm, created));
	}
	
	
	// action d'affichage du formulaire d'edition d'evt
	public static Result edit(Long id) {
		Form<Evenement> evenementForm = form(Evenement.class).fill(
				Evenement.findEvt.byId(id));
		Evenement created = evenementForm.get();
		return ok(editForm.render(id, evenementForm, created));
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

		Evenement evenement = Evenement.findEvt.byId(id);
		System.out.println("titre: " + evenement.titre);
		Evenement.addPersonne(evenement, id, name);
		return redirect(routes.Application.eventlist());

	}
	
	@BodyParser.Of(BodyParser.Json.class)
	public static Result addDate(Long id) {
		JsonNode json = request().body().asJson();
		String date = json.findPath("date").getTextValue();

		Evenement evenement = Evenement.findEvt.byId(id);
		System.out.println("titre: " + evenement.titre);
		Evenement.addJour(evenement, id, date);
		return redirect(routes.Application.eventlist());

	}
	
	@BodyParser.Of(BodyParser.Json.class)
	public static Result dateChanged(Long idevt) {
		JsonNode json = request().body().asJson();
		String date = json.findPath("date").getTextValue();
		String debut = json.findPath("debut").getTextValue();
		String fin = json.findPath("fin").getTextValue();
		

		Evenement.updateDate(idevt, date, debut, fin);
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
}