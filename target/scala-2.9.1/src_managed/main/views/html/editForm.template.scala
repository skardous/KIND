
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object editForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Evenement,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(event: Evenement):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 


"""),_display_(Seq[Any](/*8.2*/main("Editer un evenement")/*8.29*/ {_display_(Seq[Any](format.raw/*8.31*/("""

	<h1>Participants pour: """),_display_(Seq[Any](/*10.26*/event/*10.31*/.titre)),format.raw/*10.37*/("""</h1><br/>

	
	Titre de l'&eacute;venement : <b>"""),_display_(Seq[Any](/*13.36*/event/*13.41*/.titre)),format.raw/*13.47*/("""</b> <br/>
	Cr&eacute;ateur : <b>"""),_display_(Seq[Any](/*14.24*/event/*14.29*/.createur)),format.raw/*14.38*/("""</b> <br/>

	"""),_display_(Seq[Any](/*16.3*/if(event.descriptif != "")/*16.29*/ {_display_(Seq[Any](format.raw/*16.31*/("""
	Description : <i>"""),_display_(Seq[Any](/*17.20*/event/*17.25*/.descriptif)),format.raw/*17.36*/("""</i> <br/>	
	""")))})),format.raw/*18.3*/("""			
	
	<a class="btn btn-danger" href=""""),_display_(Seq[Any](/*20.35*/routes/*20.41*/.Application.deleteEvent(event.id))),format.raw/*20.75*/("""">Supprimer l'evenement</a>
	
	<table class="datesTable" cellspacing="5" cellpadding="5">
		<tbody>
			<tr class="titres" style="display:none"><td style="visibility:hidden"></td>
				"""),_display_(Seq[Any](/*25.6*/for(jour <- event.jours) yield /*25.30*/ {_display_(Seq[Any](format.raw/*25.32*/("""  					  
					<td id=""""),_display_(Seq[Any](/*26.15*/jour/*26.19*/.id)),format.raw/*26.22*/("""" class="jour" colspan=""""),_display_(Seq[Any](/*26.47*/jour/*26.51*/.horaires.size())),format.raw/*26.67*/(""""><b>"""),_display_(Seq[Any](/*26.73*/jour/*26.77*/.date)),format.raw/*26.82*/("""</b></td>	                        	                
				""")))})),format.raw/*27.6*/("""
			</tr>
			<tr class="titres" style="display:none"><td style="visibility:hidden"></td>
				"""),_display_(Seq[Any](/*30.6*/for(jour <- event.jours) yield /*30.30*/ {_display_(Seq[Any](format.raw/*30.32*/("""  
				  """),_display_(Seq[Any](/*31.8*/if(jour.horaires.size() == 0)/*31.37*/{_display_(Seq[Any](format.raw/*31.38*/("""
				    <td class="jour"></td>
				  """)))})),format.raw/*33.8*/("""
				     """),_display_(Seq[Any](/*34.11*/for(horaire <- jour.horaires) yield /*34.40*/ {_display_(Seq[Any](format.raw/*34.42*/("""
				    	 <td id=""""),_display_(Seq[Any](/*35.20*/horaire/*35.27*/.id)),format.raw/*35.30*/("""" day=""""),_display_(Seq[Any](/*35.38*/jour/*35.42*/.date)),format.raw/*35.47*/("""" class="horaire">"""),_display_(Seq[Any](/*35.66*/horaire/*35.73*/.debut)),format.raw/*35.79*/(""" - """),_display_(Seq[Any](/*35.83*/horaire/*35.90*/.fin)),format.raw/*35.94*/("""</td>
				     """)))})),format.raw/*36.11*/("""            	                
				""")))})),format.raw/*37.6*/("""
			</tr>
			              
			
			"""),_display_(Seq[Any](/*41.5*/for(participant <- event.participants) yield /*41.43*/ {_display_(Seq[Any](format.raw/*41.45*/("""
				<tr title=""""),_display_(Seq[Any](/*42.17*/participant/*42.28*/.nom)),format.raw/*42.32*/("""" id=""""),_display_(Seq[Any](/*42.39*/participant/*42.50*/.id)),format.raw/*42.53*/(""""><td class="infoPersonne">
					"""),_display_(Seq[Any](/*43.7*/form(routes.Application.updatePersonne(event.id), 'id->"formPersonne")/*43.77*/ {_display_(Seq[Any](format.raw/*43.79*/("""
						"""),_display_(Seq[Any](/*44.8*/if(participant.locked)/*44.30*/{_display_(Seq[Any](format.raw/*44.31*/("""
							<i class="mesicones icon-lock"></i>
						""")))})),format.raw/*46.8*/("""
						"""),_display_(Seq[Any](/*47.8*/if(participant.obligatoire)/*47.35*/{_display_(Seq[Any](format.raw/*47.36*/("""							
							<a id="obligatoire" class="obligatoirecb btn btn-inverse">Obligatoire</a>
						""")))}/*49.9*/else/*49.14*/{_display_(Seq[Any](format.raw/*49.15*/("""								
							<a id="obligatoire" class="obligatoirecb btn ">Facultatif</a>
						""")))})),format.raw/*51.8*/("""

						<input id="nom" size="10" type="text" value=""""),_display_(Seq[Any](/*53.53*/participant/*53.64*/.nom)),format.raw/*53.68*/("""" name="nom" readonly="readonly">							
						<a id=""""),_display_(Seq[Any](/*54.15*/participant/*54.26*/.id)),format.raw/*54.29*/("""" title="Editer le participant" class="editPersonne"><i class="mesicones icon-pencil"></i></a>
						<a id=""""),_display_(Seq[Any](/*55.15*/participant/*55.26*/.id)),format.raw/*55.29*/("""" title="Supprimer le participant" class="deletePersonne"> <i class="mesicones icon-trash"></i></a>
					""")))})),format.raw/*56.7*/("""</td>
					
					"""),_display_(Seq[Any](/*58.7*/for(jour <- event.jours) yield /*58.31*/ {_display_(Seq[Any](format.raw/*58.33*/("""
					    """),_display_(Seq[Any](/*59.11*/if(jour.horaires.size() == 0)/*59.40*/{_display_(Seq[Any](format.raw/*59.41*/("""
					      """),_display_(Seq[Any](/*60.13*/if(participant.inscriptionsJours.contains(jour))/*60.61*/ {_display_(Seq[Any](format.raw/*60.63*/("""
			                <td class="checktd"><input id=""""),_display_(Seq[Any](/*61.52*/jour/*61.56*/.id)),format.raw/*61.59*/("""" type="checkbox"  disabled checked class="jour checkbox" value=""""),_display_(Seq[Any](/*61.125*/jour/*61.129*/.date)),format.raw/*61.134*/("""" /></td>
			              """)))}/*62.20*/else/*62.25*/{_display_(Seq[Any](format.raw/*62.26*/("""
			                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*63.53*/jour/*63.57*/.id)),format.raw/*63.60*/("""" type="checkbox"  disabled class="jour checkbox" value=""""),_display_(Seq[Any](/*63.118*/jour/*63.122*/.date)),format.raw/*63.127*/("""" /></td>
			              """)))})),format.raw/*64.19*/("""
					       
					    """)))})),format.raw/*66.11*/("""
			            """),_display_(Seq[Any](/*67.17*/for(horaire <- jour.horaires) yield /*67.46*/ {_display_(Seq[Any](format.raw/*67.48*/("""
			              """),_display_(Seq[Any](/*68.19*/if(participant.inscriptionsHoraires.contains(horaire))/*68.73*/ {_display_(Seq[Any](format.raw/*68.75*/("""
			                <td class="checktd"><input id=""""),_display_(Seq[Any](/*69.52*/horaire/*69.59*/.id)),format.raw/*69.62*/("""" type="checkbox" disabled class="horaire checkbox"  checked value=""""),_display_(Seq[Any](/*69.131*/horaire/*69.138*/.debut)),format.raw/*69.144*/(""" - """),_display_(Seq[Any](/*69.148*/horaire/*69.155*/.fin)),format.raw/*69.159*/("""" /></td>
			              """)))}/*70.20*/else/*70.25*/{_display_(Seq[Any](format.raw/*70.26*/("""
			                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*71.53*/horaire/*71.60*/.id)),format.raw/*71.63*/("""" type="checkbox" disabled class="horaire checkbox" value=""""),_display_(Seq[Any](/*71.123*/horaire/*71.130*/.debut)),format.raw/*71.136*/(""" - """),_display_(Seq[Any](/*71.140*/horaire/*71.147*/.fin)),format.raw/*71.151*/("""" /></td>
			              """)))})),format.raw/*72.19*/("""
			            """)))})),format.raw/*73.17*/("""            	                
			        """)))})),format.raw/*74.13*/("""				
				</tr>
			""")))})),format.raw/*76.5*/("""
		</tbody>
		<tfoot>
		<tr id="compte" class="titres"
		 """),_display_(Seq[Any](/*80.5*/if(event.participants.size() == 0)/*80.39*/{_display_(Seq[Any](format.raw/*80.40*/(""" style="display:none"""")))})),format.raw/*80.62*/(""">
			<td id=""><b>Compte: </b></td>
			"""),_display_(Seq[Any](/*82.5*/for(jour <- event.jours) yield /*82.29*/ {_display_(Seq[Any](format.raw/*82.31*/("""
			    """),_display_(Seq[Any](/*83.9*/if(jour.horaires.size() == 0)/*83.38*/{_display_(Seq[Any](format.raw/*83.39*/("""		     
	                <td id=""""),_display_(Seq[Any](/*84.27*/jour/*84.31*/.id)),format.raw/*84.34*/("""" class="jour">0</td>	       
			    """)))})),format.raw/*85.9*/("""
	            """),_display_(Seq[Any](/*86.15*/for(horaire <- jour.horaires) yield /*86.44*/ {_display_(Seq[Any](format.raw/*86.46*/("""              
	                <td id=""""),_display_(Seq[Any](/*87.27*/horaire/*87.34*/.id)),format.raw/*87.37*/("""" class="horaire">0</td>              
	            """)))})),format.raw/*88.15*/("""
			""")))})),format.raw/*89.5*/("""
		</tr>
		
		
			<!--<tr>
				<td> Date(s) populaire(s) :</td>
				<td colspan="0" class="footer"></td>
			</tr>-->
		</tfoot>

		<!--<div class="populaires"></div>-->


		
	</table>
	
	
	

	Ajouter un participant :		  
	<input id="champ" type="text" value="">&nbsp;<a id="ajouter" class="btn">Ajouter</a><br>

	<br>
	<h3>Inviter des personnes à l'évenement</h3>

	<div class="selectDate">
	<textarea id="mailsArea" title="Adresses email s&eacute;par&eacute;es par une virgule" rows="4" style="color:grey" placeholder="Entrez ici les adresses mail séparées par une virgule ..."></textarea>
	<i class="checkmail mesicones icon-remove"></i>
	<a id="envoiLien" disabled="true" class="btn btn-primary">Envoyer Lien</a>
	</div>

	<script type="text/javascript" charset="utf-8">
	
	var color1 = "#FFFF99";
	var color2 = "gold";
	var color3 = "steelblue";

	$("table.datesTable td").css("background-color", color3);

	$("#mailsArea").live("keyup", function() """),format.raw("""{"""),format.raw/*128.44*/("""
		if (bonmail($(this).val())) """),format.raw("""{"""),format.raw/*129.32*/("""
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
		"""),format.raw("""}"""),format.raw/*132.4*/(""" else """),format.raw("""{"""),format.raw/*132.11*/("""
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
		"""),format.raw("""}"""),format.raw/*135.4*/("""
	"""),format.raw("""}"""),format.raw/*136.3*/(""")

	function bonmail(mailtest)
	"""),format.raw("""{"""),format.raw/*139.3*/("""
		var reg = new RegExp('^([a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*140.46*/("""1"""),format.raw("""}"""),format.raw/*140.48*/("""[a-z0-9]+)*@[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*140.80*/("""1"""),format.raw("""}"""),format.raw/*140.82*/("""[a-z0-9]+)*[\.]"""),format.raw("""{"""),format.raw/*140.98*/("""1"""),format.raw("""}"""),format.raw/*140.100*/("""[a-z]"""),format.raw("""{"""),format.raw/*140.106*/("""2,6"""),format.raw("""}"""),format.raw/*140.110*/(""")"""),format.raw("""{"""),format.raw/*140.112*/("""1"""),format.raw("""}"""),format.raw/*140.114*/("""(\,[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*140.136*/("""1"""),format.raw("""}"""),format.raw/*140.138*/("""[a-z0-9]+)*@[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*140.170*/("""1"""),format.raw("""}"""),format.raw/*140.172*/("""[a-z0-9]+)*[\.]"""),format.raw("""{"""),format.raw/*140.188*/("""1"""),format.raw("""}"""),format.raw/*140.190*/("""[a-z]"""),format.raw("""{"""),format.raw/*140.196*/("""2,6"""),format.raw("""}"""),format.raw/*140.200*/(""")*$', 'i');

		if(reg.test(mailtest))
		"""),format.raw("""{"""),format.raw/*143.4*/("""
			return(true);
		"""),format.raw("""}"""),format.raw/*145.4*/("""
		else
		"""),format.raw("""{"""),format.raw/*147.4*/("""
			return(false);
		"""),format.raw("""}"""),format.raw/*149.4*/("""
	"""),format.raw("""}"""),format.raw/*150.3*/("""

	$(function()"""),format.raw("""{"""),format.raw/*152.15*/(""" //Lancé au chargement/rafraichissement de la page	
		
		$(".checkbox").attr("disabled", "true"); 

		refreshObligatoire(); 
		

		$(".obligatoirecb").live("click", function() """),format.raw("""{"""),format.raw/*159.49*/(""" //click sur la cherckbox "obligatoire" : mise à jour des classes sur la ligne, ajout de la propriété obligatoire dans la bdd
			
			var idParticipant = $(this).parent().parent().parent().attr("id");
			if ($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*162.42*/("""
				$(this).html("Facultatif");
				$(this).attr("class", "obligatoirecb btn");
			"""),format.raw("""}"""),format.raw/*165.5*/(""" else """),format.raw("""{"""),format.raw/*165.12*/("""
				$(this).html("Obligatoire");
				$(this).attr("class", "obligatoirecb btn btn-inverse");
			"""),format.raw("""}"""),format.raw/*168.5*/("""
			$.ajax("""),format.raw("""{"""),format.raw/*169.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*171.12*/routes/*171.18*/.Application.changeObligatoire(event.id))),format.raw/*171.58*/("""",
				data: '"""),format.raw("""{"""),format.raw/*172.13*/(""""idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*172.52*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*174.31*/("""
				  affichagePopulaire();
				"""),format.raw("""}"""),format.raw/*176.6*/("""
	   		"""),format.raw("""}"""),format.raw/*177.8*/(""");
	   		refreshObligatoire();

		"""),format.raw("""}"""),format.raw/*180.4*/(""")

		$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*182.37*/(""" // coloration des box checkées
		  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*183.34*/("""
		  		$(this).parent().css("background-color", "#66CC99");
		  	"""),format.raw("""}"""),format.raw/*185.7*/("""
		"""),format.raw("""}"""),format.raw/*186.4*/(""");

		$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*188.41*/("""
		  	$('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*190.4*/(""");

		refreshCount(); // maj de la ligne de compteurs

		affichagePopulaire(); // maj des surbrillances
	  
	"""),format.raw("""}"""),format.raw/*196.3*/(""");
	
	$("textarea").live('click', function(e) """),format.raw("""{"""),format.raw/*198.43*/("""
		$(this).html("");
		$(this).removeAttr("style");
	"""),format.raw("""}"""),format.raw/*201.3*/(""")


	$('#envoiLien').live('click', function(e) """),format.raw("""{"""),format.raw/*204.45*/("""

		if ($(this).attr("disabled") != "disabled") """),format.raw("""{"""),format.raw/*206.48*/("""
		  	var mailsList = $("#mailsArea").val();
		  
			$.ajax("""),format.raw("""{"""),format.raw/*209.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*211.12*/routes/*211.18*/.Application.sendMail(event.id))),format.raw/*211.49*/("""",
				data: '"""),format.raw("""{"""),format.raw/*212.13*/(""""mailslist" : "' + mailsList + '""""),format.raw("""}"""),format.raw/*212.47*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*214.31*/("""
				  alert("Mail(s) envoye(s) a "+mailsList);
				"""),format.raw("""}"""),format.raw/*216.6*/("""
		   """),format.raw("""}"""),format.raw/*217.7*/(""");
		"""),format.raw("""}"""),format.raw/*218.4*/("""
	"""),format.raw("""}"""),format.raw/*219.3*/(""");
		  
		  
	$('.deletePersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*222.50*/("""    
	    $(this).parent().parent().parent().remove();
	    
	    
	    deletePersonne($(this).attr('id'));
	    if($('td[class="infoPersonne"]').html() == null) """),format.raw("""{"""),format.raw/*227.56*/("""
	    	$('.titres').attr('style','display:none');
	    """),format.raw("""}"""),format.raw/*229.7*/("""
	    $('#compte').children('td[id!=""]').each(function(i) """),format.raw("""{"""),format.raw/*230.60*/("""$(this).html("0")"""),format.raw("""}"""),format.raw/*230.78*/(""");

	    refreshCount();
	    
	"""),format.raw("""}"""),format.raw/*234.3*/(""")

	$('.editPersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*236.48*/("""
		
	    if(!$(this).parents("tr").hasClass("editable"))  """),format.raw("""{"""),format.raw/*238.56*/("""	    	
	    	if ($(this).siblings("i").hasClass("icon-lock"))"""),format.raw("""{"""),format.raw/*239.56*/("""
				var pass = prompt('Entrez votre mot de passe','Mot_de_passe');
				var thisse = $(this);
				$.ajax("""),format.raw("""{"""),format.raw/*242.13*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*244.13*/routes/*244.19*/.Application.getPass())),format.raw/*244.41*/("""",
					data: '"""),format.raw("""{"""),format.raw/*245.14*/(""" "idpers" : "'+$(this).parents("tr").attr("id")+'" """),format.raw("""}"""),format.raw/*245.66*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*247.32*/("""
					  if (pass == data.pass) """),format.raw("""{"""),format.raw/*248.32*/("""
					  	edition(thisse);
					  """),format.raw("""}"""),format.raw/*250.9*/(""" else """),format.raw("""{"""),format.raw/*250.16*/("""
					  	alert("mot de passe incorrect");
					  """),format.raw("""}"""),format.raw/*252.9*/("""
					"""),format.raw("""}"""),format.raw/*253.7*/("""
			   """),format.raw("""}"""),format.raw/*254.8*/(""");
			"""),format.raw("""}"""),format.raw/*255.5*/(""" else """),format.raw("""{"""),format.raw/*255.12*/("""
				edition($(this));
			"""),format.raw("""}"""),format.raw/*257.5*/("""
		  
	    """),format.raw("""}"""),format.raw/*259.7*/(""" else """),format.raw("""{"""),format.raw/*259.14*/("""
	      $(this).html("<i class=\"mesicones icon-pencil\"></i>");
	      $(this).parents("tr").removeClass("editable");
	      $(this).siblings('input[type="text"]').attr("readonly", "readonly");
	      $(this).parent().parent().parent().children("td").children('input[type="checkbox"]').attr("disabled","true"); 
	      $(this).parent().parent().parent().children("td").css("border", "none");
	      $(".hoverable").off();	      
	      $(this).parent().parent().parent().children(".checktd").attr("class", "checktd");
	      refreshHoverable();
	      editPersonne($(this).attr('id'), $(this).siblings("input").attr("value"));
	    """),format.raw("""}"""),format.raw/*269.7*/("""
	
	  
	"""),format.raw("""}"""),format.raw/*272.3*/(""")

	function edition(elem) """),format.raw("""{"""),format.raw/*274.26*/("""
		elem.html("<i class=\"mesicones icon-ok\"></i>");
		elem.parents("tr").addClass("editable");
		elem.siblings('input[type="text"]').removeAttr("readonly");
		elem.parent().parent().parent().children("td").children().removeAttr("disabled");
		elem.parent().parent().parent().children("td").css("border", "solid black 2px");
		$(".hoverable").off();		  
		elem.parent().parent().parent().children(".checktd").attr("class", "checktd hoverable");
		refreshHoverable();
	"""),format.raw("""}"""),format.raw/*283.3*/("""
	
	function refreshHoverable() """),format.raw("""{"""),format.raw/*285.31*/("""
		
		$(".hoverable").on("""),format.raw("""{"""),format.raw/*287.23*/("""

			mouseenter: function () """),format.raw("""{"""),format.raw/*289.29*/("""
				$(this).css("background-color", "lightgreen");
			"""),format.raw("""}"""),format.raw/*291.5*/(""", 

			mouseleave: function () """),format.raw("""{"""),format.raw/*293.29*/("""
				if ($(this).children().is(':checked'))"""),format.raw("""{"""),format.raw/*294.44*/("""	 
			    	$(this).css("background-color", "#66CC99");
			    """),format.raw("""}"""),format.raw/*296.9*/(""" else """),format.raw("""{"""),format.raw/*296.16*/("""
			    	$(this).css("background-color", color3);
			    """),format.raw("""}"""),format.raw/*298.9*/("""
			"""),format.raw("""}"""),format.raw/*299.5*/("""
		"""),format.raw("""}"""),format.raw/*300.4*/(""");

	"""),format.raw("""}"""),format.raw/*302.3*/("""

	function refreshObligatoire() """),format.raw("""{"""),format.raw/*304.33*/("""
		$(".checktd").removeClass("obligatoire");
		$(".checkbox").removeClass("obligatoire");
			$(".obligatoirecb").each(function () """),format.raw("""{"""),format.raw/*307.42*/("""
				//alert("test");
				//alert($(this).parent().parent().siblings(".checktd").html());
				if($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*310.42*/("""					
					$(this).parent().parent().siblings(".checktd").addClass("obligatoire");
					$(this).parent().parent().siblings(".checktd").children().addClass("obligatoire");
				"""),format.raw("""}"""),format.raw/*313.6*/("""

			"""),format.raw("""}"""),format.raw/*315.5*/(""")
	"""),format.raw("""}"""),format.raw/*316.3*/("""

	$("#ajouter").live('click', function(e)"""),format.raw("""{"""),format.raw/*318.42*/("""
		

	    var vide = "";	    
	    var nom = $.trim($("#champ").attr("value"));
	    if (nom != vide) """),format.raw("""{"""),format.raw/*323.24*/("""  
	    	var s;
		    var answer = confirm ("Voulez-vous sécuriser vos informations?");
			if (answer) """),format.raw("""{"""),format.raw/*326.17*/("""
		    	s=prompt('Entrez votre mot de passe','Mot_de_passe');
		    	addPersonne($.trim(nom), "true", s);	    
		    """),format.raw("""}"""),format.raw/*329.8*/(""" else """),format.raw("""{"""),format.raw/*329.15*/("""
		    	addPersonne($.trim(nom), "false", "");
		    """),format.raw("""}"""),format.raw/*331.8*/("""    
						
		"""),format.raw("""}"""),format.raw/*333.4*/("""

	    	    
	"""),format.raw("""}"""),format.raw/*336.3*/(""");

	$("#champ").keypress(function(e) """),format.raw("""{"""),format.raw/*338.36*/("""
		var code = (e.keyCode ? e.keyCode : e.which);
		if(code == 13) """),format.raw("""{"""),format.raw/*340.19*/(""" //Enter keycode
			var vide = "";	    
		    var nom = $.trim($("#champ").attr("value"));
		    if (nom != vide) """),format.raw("""{"""),format.raw/*343.25*/("""  
		    	var s;
			    var answer = confirm ("Voulez-vous sécuriser vos informations?");
				if (answer) """),format.raw("""{"""),format.raw/*346.18*/("""
			    	s=prompt('Entrez votre mot de passe','Mot_de_passe');
			    	addPersonne($.trim(nom), "true", s);	    
			    """),format.raw("""}"""),format.raw/*349.9*/(""" else """),format.raw("""{"""),format.raw/*349.16*/("""
			    	addPersonne($.trim(nom), "false", "");
			    """),format.raw("""}"""),format.raw/*351.9*/("""    
							
			"""),format.raw("""}"""),format.raw/*353.5*/("""
			$("#champ").focus();
 		"""),format.raw("""}"""),format.raw/*355.5*/("""

	"""),format.raw("""}"""),format.raw/*357.3*/(""");

	function refreshCount() """),format.raw("""{"""),format.raw/*359.27*/("""
		$('input[type="checkbox"].horaire.checkbox').each(function(i) """),format.raw("""{"""),format.raw/*360.66*/("""
			var iden = $(this).attr('id');
			
			if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*363.32*/("""
		    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			"""),format.raw("""}"""),format.raw/*366.5*/("""
			
		"""),format.raw("""}"""),format.raw/*368.4*/(""");
			
		$('input[type="checkbox"].jour.checkbox').each(function(i) """),format.raw("""{"""),format.raw/*370.63*/("""
			var iden = $(this).attr('id');			
				
			if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*373.32*/("""
		    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			"""),format.raw("""}"""),format.raw/*376.5*/("""			
			
		"""),format.raw("""}"""),format.raw/*378.4*/(""");
	"""),format.raw("""}"""),format.raw/*379.3*/("""

	function editPersonne(personneId, personneNom)
	"""),format.raw("""{"""),format.raw/*382.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*383.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*385.11*/routes/*385.17*/.Application.updatePersonne(event.id))),format.raw/*385.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*386.12*/(""""id" : "' + personneId + '", "nom" : "' + personneNom + '""""),format.raw("""}"""),format.raw/*386.71*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*388.30*/("""
			  //alert("Participant edit\351");
			"""),format.raw("""}"""),format.raw/*390.5*/("""
	  """),format.raw("""}"""),format.raw/*391.5*/(""");
	"""),format.raw("""}"""),format.raw/*392.3*/("""

	function deletePersonne(persId)
	"""),format.raw("""{"""),format.raw/*395.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*396.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*398.11*/routes/*398.17*/.Application.deleteParticipant(event.id))),format.raw/*398.57*/("""",
			data: '"""),format.raw("""{"""),format.raw/*399.12*/(""""id" : "' + persId + '""""),format.raw("""}"""),format.raw/*399.36*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*401.30*/("""
			  //alert("Participant supprim\351");
			"""),format.raw("""}"""),format.raw/*403.5*/("""
	  """),format.raw("""}"""),format.raw/*404.5*/(""");
	"""),format.raw("""}"""),format.raw/*405.3*/("""

	function addPersonne(nomParticipant, locked, pwd)
	"""),format.raw("""{"""),format.raw/*408.3*/("""	
		$.ajax("""),format.raw("""{"""),format.raw/*409.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*411.11*/routes/*411.17*/.Application.addParticipant(event.id))),format.raw/*411.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*412.12*/(""""nom" : "' + nomParticipant + '", "locked" : "' + locked + '", "pwd" : "' + pwd + '""""),format.raw("""}"""),format.raw/*412.97*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*414.30*/("""
				var lock ="";		
				if(locked == "true")"""),format.raw("""{"""),format.raw/*416.26*/("""
					lock = "<i class=\"mesicones icon-lock\"></i>&nbsp;";
				"""),format.raw("""}"""),format.raw/*418.6*/("""  
				$("tbody").append("<tr title=\""+nomParticipant+"\" class=\"editable\" id=\""+data.idPersonne+"\"><td class=\"infoPersonne\">"+
					"<form id=\"formPersonne\">"+
					lock+
					"<a id=\"obligatoire\" class=\"obligatoirecb btn\">Facultatif</a>&nbsp;"+
					"<input id=\"nom\" type=\"text\" value=\""+nomParticipant+"\" name=\"nom\">&nbsp;"+	
					"<a id=\""+data.idPersonne+"\" title=\"editer le participant\" class=\"editPersonne\"><i class=\"mesicones icon-ok\"></i></a>"+
					"<a id=\""+data.idPersonne+"\" title=\"supprimer le participant\" class=\"deletePersonne\"> <i class=\"mesicones icon-trash\"></i</a>"+		  
					"</form></td>"+
					""""),_display_(Seq[Any](/*427.8*/for(jour <- event.jours) yield /*427.32*/ {_display_(Seq[Any](format.raw/*427.34*/(""""+  
					""""),_display_(Seq[Any](/*428.8*/if(jour.horaires.size() == 0)/*428.37*/{_display_(Seq[Any](format.raw/*428.38*/("""<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*428.117*/jour/*428.121*/.id)),format.raw/*428.124*/("""\" type=\"checkbox\" class=\"jour checkbox\" value=\""""),_display_(Seq[Any](/*428.178*/jour/*428.182*/.date)),format.raw/*428.187*/("""\" /></td>""")))})),format.raw/*428.198*/(""""+
					""""),_display_(Seq[Any](/*429.8*/for(horaire <- jour.horaires) yield /*429.37*/ {_display_(Seq[Any](format.raw/*429.39*/(""""+	                		
					"<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*430.86*/horaire/*430.93*/.id)),format.raw/*430.96*/("""\" type=\"checkbox\" class=\"horaire checkbox\" value=\""""),_display_(Seq[Any](/*430.153*/horaire/*430.160*/.debut)),format.raw/*430.166*/(""" - """),_display_(Seq[Any](/*430.170*/horaire/*430.177*/.fin)),format.raw/*430.181*/("""\" /></td>"+			                
					"""")))})),format.raw/*431.8*/(""""+                	                
					"""")))})),format.raw/*432.8*/("""" +
					"</tr>")
				$('#champ').attr('value', '')
				$('.titres').attr('style','');
				refreshHoverable();
						
			"""),format.raw("""}"""),format.raw/*438.5*/("""               
		"""),format.raw("""}"""),format.raw/*439.4*/(""");
	"""),format.raw("""}"""),format.raw/*440.3*/("""


	$('.checktd').live('click', function(e) """),format.raw("""{"""),format.raw/*443.43*/("""
		if ($(this).children().prop("disabled") == false) """),format.raw("""{"""),format.raw/*444.54*/("""
			if ($(this).children().prop("checked") == false) """),format.raw("""{"""),format.raw/*445.54*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*446.36*/("""
					$(this).children().prop("checked", true);
				"""),format.raw("""}"""),format.raw/*448.6*/("""
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*450.5*/(""" else """),format.raw("""{"""),format.raw/*450.12*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*451.36*/("""
					$(this).children().prop("checked", false);
				"""),format.raw("""}"""),format.raw/*453.6*/("""        
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*455.5*/("""

			affichagePopulaire();

			//$('.populaires').html("");
			$('.titres td').each( function() """),format.raw("""{"""),format.raw/*460.38*/("""
				if ($(this).css('background-color') == color2) """),format.raw("""{"""),format.raw/*461.53*/("""
					$('.populaires').append($(this).html());
				"""),format.raw("""}"""),format.raw/*463.6*/("""				
			"""),format.raw("""}"""),format.raw/*464.5*/(""")			
		"""),format.raw("""}"""),format.raw/*465.4*/("""
	"""),format.raw("""}"""),format.raw/*466.3*/(""");
	
	function affichagePopulaire() """),format.raw("""{"""),format.raw/*468.33*/("""
		var max = 0;
		$("#compte").children(".horaire, .jour").each( function() """),format.raw("""{"""),format.raw/*470.62*/(""" // récupération de la valeur maximale dans les comptes
			$(this).css("background-color", color1) 
			$('.titres').children().css("background-color",color1);
			//$('.footer').html("");
			if (checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*474.70*/("""			
				if ($(this).html() > max) """),format.raw("""{"""),format.raw/*475.32*/("""			
					max = $(this).html();
				"""),format.raw("""}"""),format.raw/*477.6*/("""
			"""),format.raw("""}"""),format.raw/*478.5*/("""		
		"""),format.raw("""}"""),format.raw/*479.4*/(""")
		$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*480.45*/("""
			
			if ($(this).html() == max && $(this).html() != 0 && checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*482.118*/("""			
				$(this).css("background-color", color2);
				//alert("classe : "+$(this).attr("class")+" id : "+$(this).attr("id"));
				$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", color2);
				if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*486.45*/("""
					var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
					$("td:contains('"+day+"')").css("background-color", color2);
					
				"""),format.raw("""}"""),format.raw/*490.6*/("""
			"""),format.raw("""}"""),format.raw/*491.5*/("""
		"""),format.raw("""}"""),format.raw/*492.4*/(""")
	"""),format.raw("""}"""),format.raw/*493.3*/("""
	
	function checkobligatoire(idtime, type) """),format.raw("""{"""),format.raw/*495.43*/("""//fonction qui renvoie true si tous les participants obligatoires sont présents.
		//alert(idtime);
		var ret = true;
		//alert("type :"+type + " " + idtime)
		$('.obligatoire.'+type+'[id="'+idtime+'"]').each(function() """),format.raw("""{"""),format.raw/*499.64*/("""			
			if(!($(this).is(":checked"))) """),format.raw("""{"""),format.raw/*500.35*/("""
				//alert("id:"+$(this).attr("id"));
				ret = false;
			"""),format.raw("""}"""),format.raw/*503.5*/("""
		"""),format.raw("""}"""),format.raw/*504.4*/(""")
		return ret;
	"""),format.raw("""}"""),format.raw/*506.3*/("""
 


	function changeCheck(box) """),format.raw("""{"""),format.raw/*510.29*/("""   
	   var idtime = box.attr('id');
	   var idParticipant = box.parent().parent().attr('id');   
	   
	   if (box.is(':checked'))"""),format.raw("""{"""),format.raw/*514.29*/("""	 //Action de valider une horaire  		
	       		box.parent().css("background-color", "#66CC99")//vert
		   		if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*516.57*/("""
		            var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
		       	    requeteAjaxHeure(idtime, idParticipant);
			    """),format.raw("""}"""),format.raw/*520.9*/("""
	       		if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*521.57*/("""	
	    	   	    var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
				    requeteAjaxJour(idtime, idParticipant);
			   """),format.raw("""}"""),format.raw/*525.8*/("""
	   """),format.raw("""}"""),format.raw/*526.6*/(""" else """),format.raw("""{"""),format.raw/*526.13*/(""" //Action de dévalider une horaires
	     
		    box.parent().css("background-color", color3) //
		    if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*529.56*/("""
			    var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxHeure(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*533.8*/("""
		    if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*534.53*/("""
		        var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxJour(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*538.8*/("""
	   """),format.raw("""}"""),format.raw/*539.6*/("""
	"""),format.raw("""}"""),format.raw/*540.3*/("""

	function requeteAjaxJour(idtime, idParticipant)
	"""),format.raw("""{"""),format.raw/*543.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*544.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*546.11*/routes/*546.17*/.Application.checkBoxJour(event.id))),format.raw/*546.52*/("""",
			data: '"""),format.raw("""{"""),format.raw/*547.12*/(""""idjour" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*547.80*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*549.30*/("""
			  //alert("Jour edit\351");
			"""),format.raw("""}"""),format.raw/*551.5*/("""
	   """),format.raw("""}"""),format.raw/*552.6*/(""");
	"""),format.raw("""}"""),format.raw/*553.3*/("""

	function requeteAjaxHeure(idtime, idParticipant)
	"""),format.raw("""{"""),format.raw/*556.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*557.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*559.11*/routes/*559.17*/.Application.checkBoxHoraire(event.id))),format.raw/*559.55*/("""",
			data: '"""),format.raw("""{"""),format.raw/*560.12*/(""""idhoraire" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*560.83*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*562.30*/("""
			  //alert("Horaire edit\351");
			"""),format.raw("""}"""),format.raw/*564.5*/("""
	   """),format.raw("""}"""),format.raw/*565.6*/(""");
	"""),format.raw("""}"""),format.raw/*566.3*/("""



	</script>

""")))})),format.raw/*572.2*/("""
"""))}
    }
    
    def render(event:Evenement) = apply(event)
    
    def f:((Evenement) => play.api.templates.Html) = (event) => apply(event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 12 11:06:55 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/editForm.scala.html
                    HASH: 028781e2c8e75412ec220136add678bfd7c11d96
                    MATRIX: 761->1|864->40|896->64|980->19|1008->38|1036->118|1075->123|1110->150|1149->152|1212->179|1226->184|1254->190|1339->239|1353->244|1381->250|1451->284|1465->289|1496->298|1545->312|1580->338|1620->340|1676->360|1690->365|1723->376|1768->390|1844->430|1859->436|1915->470|2134->654|2174->678|2214->680|2274->704|2287->708|2312->711|2373->736|2386->740|2424->756|2466->762|2479->766|2506->771|2594->828|2723->922|2763->946|2803->948|2848->958|2886->987|2925->988|2995->1027|3042->1038|3087->1067|3127->1069|3183->1089|3199->1096|3224->1099|3268->1107|3281->1111|3308->1116|3363->1135|3379->1142|3407->1148|3447->1152|3463->1159|3489->1163|3537->1179|3603->1214|3674->1250|3728->1288|3768->1290|3821->1307|3841->1318|3867->1322|3910->1329|3930->1340|3955->1343|4024->1377|4103->1447|4143->1449|4186->1457|4217->1479|4256->1480|4338->1531|4381->1539|4417->1566|4456->1567|4570->1664|4583->1669|4622->1670|4738->1755|4828->1809|4848->1820|4874->1824|4965->1879|4985->1890|5010->1893|5155->2002|5175->2013|5200->2016|5337->2122|5390->2140|5430->2164|5470->2166|5517->2177|5555->2206|5594->2207|5643->2220|5700->2268|5740->2270|5828->2322|5841->2326|5866->2329|5969->2395|5983->2399|6011->2404|6058->2433|6071->2438|6110->2439|6199->2492|6212->2496|6237->2499|6332->2557|6346->2561|6374->2566|6434->2594|6490->2618|6543->2635|6588->2664|6628->2666|6683->2685|6746->2739|6786->2741|6874->2793|6890->2800|6915->2803|7021->2872|7038->2879|7067->2885|7108->2889|7125->2896|7152->2900|7199->2929|7212->2934|7251->2935|7340->2988|7356->2995|7381->2998|7478->3058|7495->3065|7524->3071|7565->3075|7582->3082|7609->3086|7669->3114|7718->3131|7792->3173|7842->3192|7936->3251|7979->3285|8018->3286|8072->3308|8147->3348|8187->3372|8227->3374|8271->3383|8309->3412|8348->3413|8418->3447|8431->3451|8456->3454|8525->3492|8576->3507|8621->3536|8661->3538|8738->3579|8754->3586|8779->3589|8864->3642|8900->3647|9902->4601|9982->4633|10141->4745|10196->4752|10361->4870|10411->4873|10491->4906|10585->4952|10635->4954|10714->4986|10764->4988|10828->5004|10879->5006|10934->5012|10987->5016|11038->5018|11089->5020|11160->5042|11211->5044|11291->5076|11342->5078|11407->5094|11458->5096|11513->5102|11566->5106|11654->5147|11722->5168|11780->5179|11849->5201|11899->5204|11963->5220|12188->5397|12477->5638|12609->5723|12664->5730|12809->5828|12869->5840|12936->5870|12952->5876|13015->5916|13078->5931|13165->5970|13283->6040|13364->6074|13419->6082|13501->6117|13588->6156|13701->6221|13814->6287|13865->6291|13957->6335|14044->6375|14201->6485|14296->6532|14397->6586|14493->6634|14590->6683|14699->6744|14766->6774|14782->6780|14836->6811|14899->6826|14981->6860|15099->6930|15199->6983|15253->6990|15306->6996|15356->6999|15466->7061|15677->7224|15780->7280|15888->7340|15954->7358|16034->7391|16132->7441|16239->7500|16349->7562|16503->7668|16572->7700|16588->7706|16633->7728|16697->7744|16797->7796|16917->7868|16997->7900|17078->7934|17133->7941|17230->7991|17284->7998|17339->8006|17393->8013|17448->8020|17522->8047|17581->8059|17636->8066|18317->8700|18373->8709|18449->8737|18965->9206|19046->9239|19120->9265|19198->9295|19301->9351|19381->9383|19473->9427|19583->9490|19638->9497|19743->9555|19795->9560|19846->9564|19899->9570|19981->9604|20160->9735|20339->9866|20562->10042|20615->10048|20666->10052|20757->10095|20908->10198|21060->10302|21225->10420|21280->10427|21381->10481|21443->10496|21505->10511|21592->10550|21707->10617|21870->10732|22025->10839|22193->10960|22248->10967|22351->11023|22415->11040|22491->11069|22542->11073|22620->11103|22734->11169|22852->11239|23027->11367|23082->11375|23199->11444|23321->11518|23493->11643|23551->11654|23603->11659|23702->11711|23762->11723|23827->11751|23843->11757|23903->11794|23965->11808|24072->11867|24188->11935|24278->11978|24330->11983|24382->11988|24466->12025|24526->12037|24591->12065|24607->12071|24670->12111|24732->12125|24804->12149|24920->12217|25013->12263|25065->12268|25117->12273|25219->12328|25279->12340|25344->12368|25360->12374|25420->12411|25482->12425|25615->12510|25731->12578|25825->12624|25937->12689|26629->13345|26670->13369|26711->13371|26759->13383|26798->13412|26838->13413|26955->13492|26970->13496|26997->13499|27089->13553|27104->13557|27133->13562|27178->13573|27224->13583|27270->13612|27311->13614|27455->13721|27472->13728|27498->13731|27593->13788|27611->13795|27641->13801|27683->13805|27701->13812|27729->13816|27800->13855|27875->13898|28044->14020|28110->14039|28162->14044|28255->14089|28357->14143|28459->14197|28543->14233|28643->14286|28732->14328|28787->14335|28871->14371|28972->14425|29069->14475|29214->14572|29315->14625|29414->14677|29470->14686|29525->14694|29575->14697|29660->14734|29785->14811|30089->15067|30172->15102|30255->15138|30307->15143|30360->15149|30454->15195|30625->15317|30951->15595|31180->15777|31232->15782|31283->15786|31334->15790|31427->15835|31696->16056|31782->16094|31890->16155|31941->16159|32006->16177|32087->16210|32266->16341|32472->16499|32722->16702|32827->16759|33067->16952|33120->16958|33175->16965|33375->17117|33606->17301|33707->17354|33937->17537|33990->17543|34040->17546|34140->17599|34200->17611|34265->17639|34281->17645|34339->17680|34401->17694|34517->17762|34633->17830|34716->17866|34769->17872|34821->17877|34922->17931|34982->17943|35047->17971|35063->17977|35124->18015|35186->18029|35305->18100|35421->18168|35507->18207|35560->18213|35612->18218|35661->18235
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|39->10|39->10|39->10|42->13|42->13|42->13|43->14|43->14|43->14|45->16|45->16|45->16|46->17|46->17|46->17|47->18|49->20|49->20|49->20|54->25|54->25|54->25|55->26|55->26|55->26|55->26|55->26|55->26|55->26|55->26|55->26|56->27|59->30|59->30|59->30|60->31|60->31|60->31|62->33|63->34|63->34|63->34|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|65->36|66->37|70->41|70->41|70->41|71->42|71->42|71->42|71->42|71->42|71->42|72->43|72->43|72->43|73->44|73->44|73->44|75->46|76->47|76->47|76->47|78->49|78->49|78->49|80->51|82->53|82->53|82->53|83->54|83->54|83->54|84->55|84->55|84->55|85->56|87->58|87->58|87->58|88->59|88->59|88->59|89->60|89->60|89->60|90->61|90->61|90->61|90->61|90->61|90->61|91->62|91->62|91->62|92->63|92->63|92->63|92->63|92->63|92->63|93->64|95->66|96->67|96->67|96->67|97->68|97->68|97->68|98->69|98->69|98->69|98->69|98->69|98->69|98->69|98->69|98->69|99->70|99->70|99->70|100->71|100->71|100->71|100->71|100->71|100->71|100->71|100->71|100->71|101->72|102->73|103->74|105->76|109->80|109->80|109->80|109->80|111->82|111->82|111->82|112->83|112->83|112->83|113->84|113->84|113->84|114->85|115->86|115->86|115->86|116->87|116->87|116->87|117->88|118->89|157->128|158->129|161->132|161->132|164->135|165->136|168->139|169->140|169->140|169->140|169->140|169->140|169->140|169->140|169->140|169->140|169->140|169->140|169->140|169->140|169->140|169->140|169->140|169->140|169->140|172->143|174->145|176->147|178->149|179->150|181->152|188->159|191->162|194->165|194->165|197->168|198->169|200->171|200->171|200->171|201->172|201->172|203->174|205->176|206->177|209->180|211->182|212->183|214->185|215->186|217->188|219->190|225->196|227->198|230->201|233->204|235->206|238->209|240->211|240->211|240->211|241->212|241->212|243->214|245->216|246->217|247->218|248->219|251->222|256->227|258->229|259->230|259->230|263->234|265->236|267->238|268->239|271->242|273->244|273->244|273->244|274->245|274->245|276->247|277->248|279->250|279->250|281->252|282->253|283->254|284->255|284->255|286->257|288->259|288->259|298->269|301->272|303->274|312->283|314->285|316->287|318->289|320->291|322->293|323->294|325->296|325->296|327->298|328->299|329->300|331->302|333->304|336->307|339->310|342->313|344->315|345->316|347->318|352->323|355->326|358->329|358->329|360->331|362->333|365->336|367->338|369->340|372->343|375->346|378->349|378->349|380->351|382->353|384->355|386->357|388->359|389->360|392->363|395->366|397->368|399->370|402->373|405->376|407->378|408->379|411->382|412->383|414->385|414->385|414->385|415->386|415->386|417->388|419->390|420->391|421->392|424->395|425->396|427->398|427->398|427->398|428->399|428->399|430->401|432->403|433->404|434->405|437->408|438->409|440->411|440->411|440->411|441->412|441->412|443->414|445->416|447->418|456->427|456->427|456->427|457->428|457->428|457->428|457->428|457->428|457->428|457->428|457->428|457->428|457->428|458->429|458->429|458->429|459->430|459->430|459->430|459->430|459->430|459->430|459->430|459->430|459->430|460->431|461->432|467->438|468->439|469->440|472->443|473->444|474->445|475->446|477->448|479->450|479->450|480->451|482->453|484->455|489->460|490->461|492->463|493->464|494->465|495->466|497->468|499->470|503->474|504->475|506->477|507->478|508->479|509->480|511->482|515->486|519->490|520->491|521->492|522->493|524->495|528->499|529->500|532->503|533->504|535->506|539->510|543->514|545->516|549->520|550->521|554->525|555->526|555->526|558->529|562->533|563->534|567->538|568->539|569->540|572->543|573->544|575->546|575->546|575->546|576->547|576->547|578->549|580->551|581->552|582->553|585->556|586->557|588->559|588->559|588->559|589->560|589->560|591->562|593->564|594->565|595->566|601->572
                    -- GENERATED --
                */
            