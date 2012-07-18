
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
	
	<!--<a class="btn btn-danger" href=""""),_display_(Seq[Any](/*20.39*/routes/*20.45*/.Application.deleteEvent(event.id))),format.raw/*20.79*/("""">Supprimer l'evenement</a>-->
	
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

	<div id="dialog-new-pwd" title="Créez le mot de passe">		

		<form>
		<fieldset>			
			<label for="password">Mot de passe créé :</label>
			<input type="password" name="password" id="password-new" value="" class="text ui-widget-content ui-corner-all" />
		</fieldset>
		</form>
	</div>

	<div id="dialog-question-securise" title="Créez le mot de passe">		

		<form>
		<fieldset>			
			<label>Sécuriser les informations de ce participant avec un mot de passe ?</label>
			
		</fieldset>
		</form>
	</div>

	<div id="dialog-check-pwd" title="Entrez le mot de passe pour ce participant">		

				
			<label for="password">Mot de passe du participant :</label>
			<input type="password" name="password" id="password-check" value="" class="text ui-widget-content ui-corner-all" />
		
	</div>

	<!--<script type="text/javascript" src=""""),_display_(Seq[Any](/*148.43*/routes/*148.49*/.Assets.at("javascripts/sendMail.js"))),format.raw/*148.86*/(""""></script>  -->
	<!--<script type="text/javascript" src=""""),_display_(Seq[Any](/*149.43*/routes/*149.49*/.Assets.at("javascripts/editPersonne.js"))),format.raw/*149.90*/(""""></script> -->

	<script type="text/javascript" charset="utf-8">
	
	var color1 = "#FFFF99";
	var color2 = "gold";
	var color3 = "steelblue";
	var mdp = "";



	/*Code concernant les mails et l'envoi*/

	$(function()"""),format.raw("""{"""),format.raw/*162.15*/("""
		if (bonmail($("#mailsArea").val())) """),format.raw("""{"""),format.raw/*163.40*/("""
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
		"""),format.raw("""}"""),format.raw/*166.4*/(""" else """),format.raw("""{"""),format.raw/*166.11*/("""
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
		"""),format.raw("""}"""),format.raw/*169.4*/("""
	"""),format.raw("""}"""),format.raw/*170.3*/(""");

	$('#envoiLien').live('click', function(e) """),format.raw("""{"""),format.raw/*172.45*/("""

		if ($(this).attr("disabled") != "disabled") """),format.raw("""{"""),format.raw/*174.48*/("""
			var mailsList = $("#mailsArea").val();

			$.ajax("""),format.raw("""{"""),format.raw/*177.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*179.12*/routes/*179.18*/.Application.sendMail(event.id))),format.raw/*179.49*/("""",
				data: '"""),format.raw("""{"""),format.raw/*180.13*/(""""mailslist" : "' + mailsList + '""""),format.raw("""}"""),format.raw/*180.47*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*182.31*/("""
					alert("Mail(s) envoye(s) a "+mailsList);
				"""),format.raw("""}"""),format.raw/*184.6*/("""
			"""),format.raw("""}"""),format.raw/*185.5*/(""");
		"""),format.raw("""}"""),format.raw/*186.4*/("""
	"""),format.raw("""}"""),format.raw/*187.3*/(""");


	$("#mailsArea").live("keyup", function() """),format.raw("""{"""),format.raw/*190.44*/("""

		if (bonmail($(this).val())) """),format.raw("""{"""),format.raw/*192.32*/("""
			
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
		"""),format.raw("""}"""),format.raw/*196.4*/(""" else """),format.raw("""{"""),format.raw/*196.11*/("""
			
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
		"""),format.raw("""}"""),format.raw/*200.4*/("""
	"""),format.raw("""}"""),format.raw/*201.3*/(""")
	
	function bonmail(mailtest)
	"""),format.raw("""{"""),format.raw/*204.3*/("""
		var reg = new RegExp('^([a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*205.46*/("""1"""),format.raw("""}"""),format.raw/*205.48*/("""[a-z0-9]+)*@[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*205.80*/("""1"""),format.raw("""}"""),format.raw/*205.82*/("""[a-z0-9]+)*[\.]"""),format.raw("""{"""),format.raw/*205.98*/("""1"""),format.raw("""}"""),format.raw/*205.100*/("""[a-z]"""),format.raw("""{"""),format.raw/*205.106*/("""2,6"""),format.raw("""}"""),format.raw/*205.110*/(""")"""),format.raw("""{"""),format.raw/*205.112*/("""1"""),format.raw("""}"""),format.raw/*205.114*/("""(\,[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*205.136*/("""1"""),format.raw("""}"""),format.raw/*205.138*/("""[a-z0-9]+)*@[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*205.170*/("""1"""),format.raw("""}"""),format.raw/*205.172*/("""[a-z0-9]+)*[\.]"""),format.raw("""{"""),format.raw/*205.188*/("""1"""),format.raw("""}"""),format.raw/*205.190*/("""[a-z]"""),format.raw("""{"""),format.raw/*205.196*/("""2,6"""),format.raw("""}"""),format.raw/*205.200*/(""")*$', 'i');

		if(reg.test(mailtest))
		"""),format.raw("""{"""),format.raw/*208.4*/("""
			return(true);
		"""),format.raw("""}"""),format.raw/*210.4*/("""
		else
		"""),format.raw("""{"""),format.raw/*212.4*/("""
			return(false);
		"""),format.raw("""}"""),format.raw/*214.4*/("""
	"""),format.raw("""}"""),format.raw/*215.3*/("""
















	/*Code de style*/

	$(function()"""),format.raw("""{"""),format.raw/*234.15*/("""
		$("table.datesTable td").css("background-color", color3);
		$(".checkbox").attr("disabled", "true"); 

		$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*238.37*/(""" // coloration des box checkées
		  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*239.34*/("""
		  		$(this).parent().css("background-color", "#66CC99");
		  	"""),format.raw("""}"""),format.raw/*241.7*/("""
		"""),format.raw("""}"""),format.raw/*242.4*/(""");

		$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*244.41*/("""
			$('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*246.4*/(""");

		refreshCount(); // maj de la ligne de compteurs

		affichagePopulaire(); // maj des surbrillances
	"""),format.raw("""}"""),format.raw/*251.3*/(""")

	$("textarea").live('click', function(e) """),format.raw("""{"""),format.raw/*253.43*/("""
		$(this).html("");
		$(this).removeAttr("style");
	"""),format.raw("""}"""),format.raw/*256.3*/(""")

	function refreshHoverable() """),format.raw("""{"""),format.raw/*258.31*/(""" //coloration des cases quand on passe la souris dessus
		
		$(".hoverable").on("""),format.raw("""{"""),format.raw/*260.23*/("""

			mouseenter: function () """),format.raw("""{"""),format.raw/*262.29*/("""
				$(this).css("background-color", "lightgreen");
			"""),format.raw("""}"""),format.raw/*264.5*/(""", 

			mouseleave: function () """),format.raw("""{"""),format.raw/*266.29*/("""
				if ($(this).children().is(':checked'))"""),format.raw("""{"""),format.raw/*267.44*/("""	 
			    	$(this).css("background-color", "#66CC99");
			    """),format.raw("""}"""),format.raw/*269.9*/(""" else """),format.raw("""{"""),format.raw/*269.16*/("""
			    	$(this).css("background-color", color3);
			    """),format.raw("""}"""),format.raw/*271.9*/("""
			"""),format.raw("""}"""),format.raw/*272.5*/("""
		"""),format.raw("""}"""),format.raw/*273.4*/(""");

	"""),format.raw("""}"""),format.raw/*275.3*/("""

	

	function refreshCount() """),format.raw("""{"""),format.raw/*279.27*/(""" // met à jour l'affichage du compte des participants par horaire
		$('input[type="checkbox"].horaire.checkbox').each(function(i) """),format.raw("""{"""),format.raw/*280.66*/("""
			var iden = $(this).attr('id');
			
			if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*283.32*/("""
		    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			"""),format.raw("""}"""),format.raw/*286.5*/("""
			
		"""),format.raw("""}"""),format.raw/*288.4*/(""");
			
		$('input[type="checkbox"].jour.checkbox').each(function(i) """),format.raw("""{"""),format.raw/*290.63*/("""
			var iden = $(this).attr('id');			
				
			if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*293.32*/("""
		    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			"""),format.raw("""}"""),format.raw/*296.5*/("""			
			
		"""),format.raw("""}"""),format.raw/*298.4*/(""");
	"""),format.raw("""}"""),format.raw/*299.3*/("""

	























	/*Code sur les mots de passe*/

	$( "#dialog:ui-dialog" ).dialog( "destroy" ); 
		
	
	var pass = "";
	var goodPass = "";
	var currentEditButton;

	$( "#dialog-question-securise" ).dialog("""),format.raw("""{"""),format.raw/*334.43*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*339.13*/("""
			"Oui": function() """),format.raw("""{"""),format.raw/*340.23*/("""				    	
			    $( "#dialog-new-pwd" ).dialog( "open" );  
			    $( this ).dialog( "close" );
			"""),format.raw("""}"""),format.raw/*343.5*/(""",
			"Non": function() """),format.raw("""{"""),format.raw/*344.23*/("""
				addPersonne($.trim($("#champ").attr("value")), "false", "");
				$( this ).dialog( "close" );
			"""),format.raw("""}"""),format.raw/*347.5*/("""				
		"""),format.raw("""}"""),format.raw/*348.4*/(""",
		
	"""),format.raw("""}"""),format.raw/*350.3*/(""");
			
	
	$( "#dialog-new-pwd" ).dialog("""),format.raw("""{"""),format.raw/*353.33*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*358.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*359.22*/("""
				var bValid = true;									

				if ( bValid ) """),format.raw("""{"""),format.raw/*362.20*/("""
					mdp = $("#password-new").val();
					addPersonne($.trim($("#champ").attr("value")), "true", mdp);
					$( "#password-new" ).attr("value", "");
					$( this ).dialog( "close" );
				"""),format.raw("""}"""),format.raw/*367.6*/("""
			"""),format.raw("""}"""),format.raw/*368.5*/("""				
		"""),format.raw("""}"""),format.raw/*369.4*/(""",
		
	"""),format.raw("""}"""),format.raw/*371.3*/(""");

	$( "#dialog-check-pwd" ).dialog("""),format.raw("""{"""),format.raw/*373.35*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*378.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*379.22*/("""				
								
				pass = $("#password-check").val();	
				if (pass == goodPass) """),format.raw("""{"""),format.raw/*382.28*/("""
				  	edition(currentEditButton);
				"""),format.raw("""}"""),format.raw/*384.6*/(""" else """),format.raw("""{"""),format.raw/*384.13*/("""
				  	alert("mot de passe incorrect");
				"""),format.raw("""}"""),format.raw/*386.6*/("""				
				$( "#password-check" ).attr("value", "");
				$( this ).dialog( "close" );
				
			"""),format.raw("""}"""),format.raw/*390.5*/(""",

			"Annuler": function() """),format.raw("""{"""),format.raw/*392.27*/("""							
				$( this ).dialog( "close" );				
			"""),format.raw("""}"""),format.raw/*394.5*/("""				
		"""),format.raw("""}"""),format.raw/*395.4*/(""",
		
	"""),format.raw("""}"""),format.raw/*397.3*/(""");

	


























	/*Code sur l'ajout*/

	function addPersonne(nomParticipant, locked, pwd)
	"""),format.raw("""{"""),format.raw/*429.3*/("""	
		$.ajax("""),format.raw("""{"""),format.raw/*430.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*432.11*/routes/*432.17*/.Application.addParticipant(event.id))),format.raw/*432.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*433.12*/(""""nom" : "' + nomParticipant + '", "locked" : "' + locked + '", "pwd" : "' + pwd + '""""),format.raw("""}"""),format.raw/*433.97*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*435.30*/("""
				var lock ="";		
				if(locked == "true")"""),format.raw("""{"""),format.raw/*437.26*/("""
					lock = "<i class=\"mesicones icon-lock\"></i>&nbsp;";
				"""),format.raw("""}"""),format.raw/*439.6*/("""  
				$("tbody").append("<tr title=\""+nomParticipant+"\" class=\"editable\" id=\""+data.idPersonne+"\"><td class=\"infoPersonne\">"+
					"<form id=\"formPersonne\">"+
					lock+
					"<a id=\"obligatoire\" class=\"obligatoirecb btn\">Facultatif</a>&nbsp;"+
					"<input id=\"nom\" type=\"text\" value=\""+nomParticipant+"\" name=\"nom\">&nbsp;"+	
					"<a id=\""+data.idPersonne+"\" title=\"editer le participant\" class=\"editPersonne\"><i class=\"mesicones icon-ok\"></i></a>"+
					"<a id=\""+data.idPersonne+"\" title=\"supprimer le participant\" class=\"deletePersonne\"> <i class=\"mesicones icon-trash\"></i</a>"+		  
					"</form></td>"+
					""""),_display_(Seq[Any](/*448.8*/for(jour <- event.jours) yield /*448.32*/ {_display_(Seq[Any](format.raw/*448.34*/(""""+  
					""""),_display_(Seq[Any](/*449.8*/if(jour.horaires.size() == 0)/*449.37*/{_display_(Seq[Any](format.raw/*449.38*/("""<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*449.117*/jour/*449.121*/.id)),format.raw/*449.124*/("""\" type=\"checkbox\" class=\"jour checkbox\" value=\""""),_display_(Seq[Any](/*449.178*/jour/*449.182*/.date)),format.raw/*449.187*/("""\" /></td>""")))})),format.raw/*449.198*/(""""+
					""""),_display_(Seq[Any](/*450.8*/for(horaire <- jour.horaires) yield /*450.37*/ {_display_(Seq[Any](format.raw/*450.39*/(""""+	                		
					"<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*451.86*/horaire/*451.93*/.id)),format.raw/*451.96*/("""\" type=\"checkbox\" class=\"horaire checkbox\" value=\""""),_display_(Seq[Any](/*451.153*/horaire/*451.160*/.debut)),format.raw/*451.166*/(""" - """),_display_(Seq[Any](/*451.170*/horaire/*451.177*/.fin)),format.raw/*451.181*/("""\" /></td>"+			                
					"""")))})),format.raw/*452.8*/(""""+                	                
					"""")))})),format.raw/*453.8*/("""" +
					"</tr>")
				$('#champ').attr('value', '')
				$('.titres').attr('style','');
				refreshHoverable();
						
			"""),format.raw("""}"""),format.raw/*459.5*/("""               
		"""),format.raw("""}"""),format.raw/*460.4*/(""");
	"""),format.raw("""}"""),format.raw/*461.3*/("""

	$("#ajouter").live('click', function(e)"""),format.raw("""{"""),format.raw/*463.42*/("""
		

	    var vide = "";	    
	    var nom = $("#champ").attr("value");
	    if (nom != vide) """),format.raw("""{"""),format.raw/*468.24*/("""  
	    	$( "#dialog-question-securise" ).dialog( "open" );	
	    	
						
		"""),format.raw("""}"""),format.raw/*472.4*/("""

	    	    
	"""),format.raw("""}"""),format.raw/*475.3*/(""");

	$("#champ").keypress(function(e) """),format.raw("""{"""),format.raw/*477.36*/("""
		var code = (e.keyCode ? e.keyCode : e.which);
		if(code == 13) """),format.raw("""{"""),format.raw/*479.19*/(""" //Enter keycode
			var vide = "";	    
		    var nom = $.trim($("#champ").attr("value"));
		    if (nom != vide) """),format.raw("""{"""),format.raw/*482.25*/("""  
		    	$( "#dialog-question-securise" ).dialog( "open" );	
							
			"""),format.raw("""}"""),format.raw/*485.5*/("""
			$("#champ").focus();
 		"""),format.raw("""}"""),format.raw/*487.5*/("""

	"""),format.raw("""}"""),format.raw/*489.3*/(""");





















	/*Code sur l'édition*/

	$('.editPersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*513.48*/("""
		
	    if(!$(this).parents("tr").hasClass("editable"))  """),format.raw("""{"""),format.raw/*515.56*/("""	    	
	    	if ($(this).siblings("i").hasClass("icon-lock"))"""),format.raw("""{"""),format.raw/*516.56*/("""
	    		currentEditButton = $(this);
	    		$.ajax("""),format.raw("""{"""),format.raw/*518.16*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*520.13*/routes/*520.19*/.Application.getPass())),format.raw/*520.41*/("""",
					data: '"""),format.raw("""{"""),format.raw/*521.14*/(""" "idpers" : "'+$(this).parents("tr").attr("id")+'" """),format.raw("""}"""),format.raw/*521.66*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*523.32*/("""
						goodPass = data.pass;

						$( "#dialog-check-pwd" ).dialog( "open" );	
											  
					"""),format.raw("""}"""),format.raw/*528.7*/("""
			   """),format.raw("""}"""),format.raw/*529.8*/(""");			
				
			"""),format.raw("""}"""),format.raw/*531.5*/(""" else """),format.raw("""{"""),format.raw/*531.12*/("""
				edition($(this));
			"""),format.raw("""}"""),format.raw/*533.5*/("""
		  
	    """),format.raw("""}"""),format.raw/*535.7*/(""" else """),format.raw("""{"""),format.raw/*535.14*/("""
	      $(this).html("<i class=\"mesicones icon-pencil\"></i>");
	      $(this).parents("tr").removeClass("editable");
	      $(this).siblings('input[type="text"]').attr("readonly", "readonly");
	      $(this).parent().parent().parent().children("td").children('input[type="checkbox"]').attr("disabled","true"); 
	      $(this).parent().parent().parent().children("td").css("border", "none");
	      $(".hoverable").off();	      
	      $(this).parent().parent().parent().children(".checktd").attr("class", "checktd");
	      refreshHoverable();
	      editPersonne($(this).attr('id'), $(this).siblings("input").attr("value"));
	    """),format.raw("""}"""),format.raw/*545.7*/("""
	
	  
	"""),format.raw("""}"""),format.raw/*548.3*/(""")

	function edition(elem) """),format.raw("""{"""),format.raw/*550.26*/("""
		elem.html("<i class=\"mesicones icon-ok\"></i>");
		elem.parents("tr").addClass("editable");
		elem.siblings('input[type="text"]').removeAttr("readonly");
		elem.parent().parent().parent().children("td").children().removeAttr("disabled");
		elem.parent().parent().parent().children("td").css("border", "solid black 2px");
		$(".hoverable").off();		  
		elem.parent().parent().parent().children(".checktd").attr("class", "checktd hoverable");
		refreshHoverable();
	"""),format.raw("""}"""),format.raw/*559.3*/("""

	function editPersonne(personneId, personneNom)
	"""),format.raw("""{"""),format.raw/*562.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*563.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*565.11*/routes/*565.17*/.Application.updatePersonne(event.id))),format.raw/*565.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*566.12*/(""""id" : "' + personneId + '", "nom" : "' + personneNom + '""""),format.raw("""}"""),format.raw/*566.71*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*568.30*/("""
			  //alert("Participant edit\351");
			"""),format.raw("""}"""),format.raw/*570.5*/("""
	  """),format.raw("""}"""),format.raw/*571.5*/(""");
	"""),format.raw("""}"""),format.raw/*572.3*/("""

	$('.checktd').live('click', function(e) """),format.raw("""{"""),format.raw/*574.43*/("""
		if ($(this).children().prop("disabled") == false) """),format.raw("""{"""),format.raw/*575.54*/("""
			if ($(this).children().prop("checked") == false) """),format.raw("""{"""),format.raw/*576.54*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*577.36*/("""
					$(this).children().prop("checked", true);
				"""),format.raw("""}"""),format.raw/*579.6*/("""
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*581.5*/(""" else """),format.raw("""{"""),format.raw/*581.12*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*582.36*/("""
					$(this).children().prop("checked", false);
				"""),format.raw("""}"""),format.raw/*584.6*/("""        
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*586.5*/("""

			affichagePopulaire();

			//$('.populaires').html("");
			$('.titres td').each( function() """),format.raw("""{"""),format.raw/*591.38*/("""
				if ($(this).css('background-color') == color2) """),format.raw("""{"""),format.raw/*592.53*/("""
					$('.populaires').append($(this).html());
				"""),format.raw("""}"""),format.raw/*594.6*/("""				
			"""),format.raw("""}"""),format.raw/*595.5*/(""")			
		"""),format.raw("""}"""),format.raw/*596.4*/("""
	"""),format.raw("""}"""),format.raw/*597.3*/(""");

	function changeCheck(box) """),format.raw("""{"""),format.raw/*599.29*/("""   // gestion des clics sur les checkboxes
	   var idtime = box.attr('id');
	   var idParticipant = box.parent().parent().attr('id');   
	   
	   if (box.is(':checked'))"""),format.raw("""{"""),format.raw/*603.29*/("""	 //Action de valider une horaire  		
	       		box.parent().css("background-color", "#66CC99")//vert
		   		if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*605.57*/("""
		            var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
		       	    requeteAjaxHeure(idtime, idParticipant);
			    """),format.raw("""}"""),format.raw/*609.9*/("""
	       		if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*610.57*/("""	
	    	   	    var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
				    requeteAjaxJour(idtime, idParticipant);
			   """),format.raw("""}"""),format.raw/*614.8*/("""
	   """),format.raw("""}"""),format.raw/*615.6*/(""" else """),format.raw("""{"""),format.raw/*615.13*/(""" //Action de dévalider une horaires
	     
		    box.parent().css("background-color", color3) //
		    if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*618.56*/("""
			    var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxHeure(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*622.8*/("""
		    if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*623.53*/("""
		        var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxJour(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*627.8*/("""
	   """),format.raw("""}"""),format.raw/*628.6*/("""
	"""),format.raw("""}"""),format.raw/*629.3*/("""

	function requeteAjaxJour(idtime, idParticipant) // ajoute la date au participant
	"""),format.raw("""{"""),format.raw/*632.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*633.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*635.11*/routes/*635.17*/.Application.checkBoxJour(event.id))),format.raw/*635.52*/("""",
			data: '"""),format.raw("""{"""),format.raw/*636.12*/(""""idjour" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*636.80*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*638.30*/("""
			  //alert("Jour edit\351");
			"""),format.raw("""}"""),format.raw/*640.5*/("""
	   """),format.raw("""}"""),format.raw/*641.6*/(""");
	"""),format.raw("""}"""),format.raw/*642.3*/("""

	function requeteAjaxHeure(idtime, idParticipant) // ajoute l'heure au participant
	"""),format.raw("""{"""),format.raw/*645.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*646.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*648.11*/routes/*648.17*/.Application.checkBoxHoraire(event.id))),format.raw/*648.55*/("""",
			data: '"""),format.raw("""{"""),format.raw/*649.12*/(""""idhoraire" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*649.83*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*651.30*/("""
			  //alert("Horaire edit\351");
			"""),format.raw("""}"""),format.raw/*653.5*/("""
	   """),format.raw("""}"""),format.raw/*654.6*/(""");
	"""),format.raw("""}"""),format.raw/*655.3*/("""


























	/*Code sur la suppression*/

	$('.deletePersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*684.50*/("""    
	    $(this).parent().parent().parent().remove();
	    
	    
	    deletePersonne($(this).attr('id'));
	    if($('td[class="infoPersonne"]').html() == null) """),format.raw("""{"""),format.raw/*689.56*/("""
	    	$('.titres').attr('style','display:none');
	    """),format.raw("""}"""),format.raw/*691.7*/("""
	    $('#compte').children('td[id!=""]').each(function(i) """),format.raw("""{"""),format.raw/*692.60*/("""$(this).html("0")"""),format.raw("""}"""),format.raw/*692.78*/(""");

	    refreshCount();
	    
	"""),format.raw("""}"""),format.raw/*696.3*/(""")

	function deletePersonne(persId)
	"""),format.raw("""{"""),format.raw/*699.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*700.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*702.11*/routes/*702.17*/.Application.deleteParticipant(event.id))),format.raw/*702.57*/("""",
			data: '"""),format.raw("""{"""),format.raw/*703.12*/(""""id" : "' + persId + '""""),format.raw("""}"""),format.raw/*703.36*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*705.30*/("""
			  //alert("Participant supprim\351");
			"""),format.raw("""}"""),format.raw/*707.5*/("""
	  """),format.raw("""}"""),format.raw/*708.5*/(""");
	"""),format.raw("""}"""),format.raw/*709.3*/("""


















	/*Code sur les participants obligatoires*/
	$(function()"""),format.raw("""{"""),format.raw/*729.15*/("""
		refreshObligatoire(); 
		affichagePopulaire();
		
	"""),format.raw("""}"""),format.raw/*733.3*/(""")	

	$(".obligatoirecb").live("click", function() """),format.raw("""{"""),format.raw/*735.48*/(""" //click sur la checkbox "obligatoire" : mise à jour des classes sur la ligne, ajout de la propriété obligatoire dans la bdd
			
			var idParticipant = $(this).parent().parent().parent().attr("id");
			if ($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*738.42*/("""
				$(this).html("Facultatif");
				$(this).attr("class", "obligatoirecb btn");
			"""),format.raw("""}"""),format.raw/*741.5*/(""" else """),format.raw("""{"""),format.raw/*741.12*/("""
				$(this).html("Obligatoire");
				$(this).attr("class", "obligatoirecb btn btn-inverse");
			"""),format.raw("""}"""),format.raw/*744.5*/("""
			$.ajax("""),format.raw("""{"""),format.raw/*745.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*747.12*/routes/*747.18*/.Application.changeObligatoire(event.id))),format.raw/*747.58*/("""",
				data: '"""),format.raw("""{"""),format.raw/*748.13*/(""""idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*748.52*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*750.31*/("""
				  affichagePopulaire();
				"""),format.raw("""}"""),format.raw/*752.6*/("""
	   		"""),format.raw("""}"""),format.raw/*753.8*/(""");
	   		refreshObligatoire();

		"""),format.raw("""}"""),format.raw/*756.4*/(""")

	function checkobligatoire(idtime, type) """),format.raw("""{"""),format.raw/*758.43*/("""//fonction qui renvoie true si tous les participants obligatoires sont présents.
		//alert(idtime);
		var ret = true;
		//alert("type :"+type + " " + idtime)
		$('.obligatoire.'+type+'[id="'+idtime+'"]').each(function() """),format.raw("""{"""),format.raw/*762.64*/("""			
			if(!($(this).is(":checked"))) """),format.raw("""{"""),format.raw/*763.35*/("""
				//alert("id:"+$(this).attr("id"));
				ret = false;
			"""),format.raw("""}"""),format.raw/*766.5*/("""
		"""),format.raw("""}"""),format.raw/*767.4*/(""")
		return ret;
	"""),format.raw("""}"""),format.raw/*769.3*/("""

	function refreshObligatoire() """),format.raw("""{"""),format.raw/*771.33*/(""" // met à jour les classes "obligatoire" sur les bonnes lignes de participants
		$(".checktd").removeClass("obligatoire");
		$(".checkbox").removeClass("obligatoire");
		$(".obligatoirecb").each(function () """),format.raw("""{"""),format.raw/*774.41*/("""
			//alert("test");
			//alert($(this).parent().parent().siblings(".checktd").html());
			if($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*777.41*/("""					
				$(this).parent().parent().siblings(".checktd").addClass("obligatoire");
				$(this).parent().parent().siblings(".checktd").children().addClass("obligatoire");
			"""),format.raw("""}"""),format.raw/*780.5*/("""

		"""),format.raw("""}"""),format.raw/*782.4*/(""")
	"""),format.raw("""}"""),format.raw/*783.3*/("""








	
	
	

	

	

	

	

	


	
	/*Code d'affichage des dates populaires*/
	function affichagePopulaire() """),format.raw("""{"""),format.raw/*809.33*/("""
		var max = 0;
		$("#compte").children(".horaire, .jour").each( function() """),format.raw("""{"""),format.raw/*811.62*/(""" // récupération de la valeur maximale dans les comptes
			$(this).css("background-color", color1) 
			$('.titres').children().css("background-color",color1);
			//$('.footer').html("");
			if (checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*815.70*/("""			
				if ($(this).html() > max) """),format.raw("""{"""),format.raw/*816.32*/("""			
					max = $(this).html();
				"""),format.raw("""}"""),format.raw/*818.6*/("""
			"""),format.raw("""}"""),format.raw/*819.5*/("""		
		"""),format.raw("""}"""),format.raw/*820.4*/(""")
		$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*821.45*/("""
			
			if ($(this).html() == max && $(this).html() != 0 && checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*823.118*/("""			
				$(this).css("background-color", color2);
				//alert("classe : "+$(this).attr("class")+" id : "+$(this).attr("id"));
				$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", color2);
				if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*827.45*/("""
					var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
					$("td:contains('"+day+"')").css("background-color", color2);
					
				"""),format.raw("""}"""),format.raw/*831.6*/("""
			"""),format.raw("""}"""),format.raw/*832.5*/("""
		"""),format.raw("""}"""),format.raw/*833.4*/(""")
	"""),format.raw("""}"""),format.raw/*834.3*/("""
	</script>

""")))})),format.raw/*837.2*/("""
"""))}
    }
    
    def render(event:Evenement) = apply(event)
    
    def f:((Evenement) => play.api.templates.Html) = (event) => apply(event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 17 13:54:38 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/editForm.scala.html
                    HASH: c7dbc8ab5acd182d920cdcaa177aa17c365c2a1e
                    MATRIX: 761->1|864->40|896->64|980->19|1008->38|1036->118|1075->123|1110->150|1149->152|1212->179|1226->184|1254->190|1339->239|1353->244|1381->250|1451->284|1465->289|1496->298|1545->312|1580->338|1620->340|1676->360|1690->365|1723->376|1768->390|1848->434|1863->440|1919->474|2141->661|2181->685|2221->687|2281->711|2294->715|2319->718|2380->743|2393->747|2431->763|2473->769|2486->773|2513->778|2601->835|2730->929|2770->953|2810->955|2855->965|2893->994|2932->995|3002->1034|3049->1045|3094->1074|3134->1076|3190->1096|3206->1103|3231->1106|3275->1114|3288->1118|3315->1123|3370->1142|3386->1149|3414->1155|3454->1159|3470->1166|3496->1170|3544->1186|3610->1221|3681->1257|3735->1295|3775->1297|3828->1314|3848->1325|3874->1329|3917->1336|3937->1347|3962->1350|4031->1384|4110->1454|4150->1456|4193->1464|4224->1486|4263->1487|4345->1538|4388->1546|4424->1573|4463->1574|4577->1671|4590->1676|4629->1677|4745->1762|4835->1816|4855->1827|4881->1831|4972->1886|4992->1897|5017->1900|5162->2009|5182->2020|5207->2023|5344->2129|5397->2147|5437->2171|5477->2173|5524->2184|5562->2213|5601->2214|5650->2227|5707->2275|5747->2277|5835->2329|5848->2333|5873->2336|5976->2402|5990->2406|6018->2411|6065->2440|6078->2445|6117->2446|6206->2499|6219->2503|6244->2506|6339->2564|6353->2568|6381->2573|6441->2601|6497->2625|6550->2642|6595->2671|6635->2673|6690->2692|6753->2746|6793->2748|6881->2800|6897->2807|6922->2810|7028->2879|7045->2886|7074->2892|7115->2896|7132->2903|7159->2907|7206->2936|7219->2941|7258->2942|7347->2995|7363->3002|7388->3005|7485->3065|7502->3072|7531->3078|7572->3082|7589->3089|7616->3093|7676->3121|7725->3138|7799->3180|7849->3199|7943->3258|7986->3292|8025->3293|8079->3315|8154->3355|8194->3379|8234->3381|8278->3390|8316->3419|8355->3420|8425->3454|8438->3458|8463->3461|8532->3499|8583->3514|8628->3543|8668->3545|8745->3586|8761->3593|8786->3596|8871->3649|8907->3654|10499->5209|10515->5215|10575->5252|10671->5311|10687->5317|10751->5358|11016->5575|11104->5615|11263->5727|11318->5734|11483->5852|11533->5855|11629->5903|11726->5952|11829->6007|11896->6037|11912->6043|11966->6074|12029->6089|12111->6123|12229->6193|12328->6245|12380->6250|12433->6256|12483->6259|12579->6307|12660->6340|12823->6456|12878->6463|13047->6585|13097->6588|13178->6622|13272->6668|13322->6670|13401->6702|13451->6704|13515->6720|13566->6722|13621->6728|13674->6732|13725->6734|13776->6736|13847->6758|13898->6760|13978->6792|14029->6794|14094->6810|14145->6812|14200->6818|14253->6822|14341->6863|14409->6884|14467->6895|14536->6917|14586->6920|14685->6971|14875->7113|14988->7178|15101->7244|15152->7248|15244->7292|15329->7330|15482->7436|15575->7481|15676->7535|15757->7568|15886->7649|15964->7679|16067->7735|16147->7767|16239->7811|16349->7874|16404->7881|16509->7939|16561->7944|16612->7948|16665->7954|16744->7985|16923->8116|17041->8186|17216->8314|17271->8322|17388->8391|17510->8465|17682->8590|17740->8601|17792->8606|18056->8822|18216->8934|18287->8957|18434->9057|18506->9081|18656->9184|18711->9192|18765->9199|18854->9240|19014->9352|19084->9374|19185->9427|19420->9615|19472->9620|19527->9628|19581->9635|19667->9673|19827->9785|19897->9807|20026->9888|20114->9929|20169->9936|20262->9982|20402->10075|20479->10104|20575->10153|20630->10161|20684->10168|20839->10276|20899->10288|20964->10316|20980->10322|21040->10359|21102->10373|21235->10458|21351->10526|21445->10572|21557->10637|22249->11293|22290->11317|22331->11319|22379->11331|22418->11360|22458->11361|22575->11440|22590->11444|22617->11447|22709->11501|22724->11505|22753->11510|22798->11521|22844->11531|22890->11560|22931->11562|23075->11669|23092->11676|23118->11679|23213->11736|23231->11743|23261->11749|23303->11753|23321->11760|23349->11764|23420->11803|23495->11846|23664->11968|23730->11987|23782->11992|23873->12035|24016->12130|24141->12208|24203->12223|24290->12262|24405->12329|24568->12444|24689->12518|24765->12547|24816->12551|24960->12647|25067->12706|25177->12768|25277->12820|25346->12852|25362->12858|25407->12880|25471->12896|25571->12948|25691->13020|25838->13120|25893->13128|25955->13143|26010->13150|26084->13177|26143->13189|26198->13196|26879->13830|26935->13839|27011->13867|27527->14336|27626->14388|27686->14400|27751->14428|27767->14434|27827->14471|27889->14485|27996->14544|28112->14612|28202->14655|28254->14660|28306->14665|28398->14709|28500->14763|28602->14817|28686->14853|28786->14906|28875->14948|28930->14955|29014->14991|29115->15045|29212->15095|29357->15192|29458->15245|29557->15297|29613->15306|29668->15314|29718->15317|29798->15349|30016->15519|30222->15677|30472->15880|30577->15937|30817->16130|30870->16136|30925->16143|31125->16295|31356->16479|31457->16532|31687->16715|31740->16721|31790->16724|31923->16810|31983->16822|32048->16850|32064->16856|32122->16891|32184->16905|32300->16973|32416->17041|32499->17077|32552->17083|32604->17088|32738->17175|32798->17187|32863->17215|32879->17221|32940->17259|33002->17273|33121->17344|33237->17412|33323->17451|33376->17457|33428->17462|33582->17568|33793->17731|33896->17787|34004->17847|34070->17865|34150->17898|34235->17936|34295->17948|34360->17976|34376->17982|34439->18022|34501->18036|34573->18060|34689->18128|34782->18174|34834->18179|34886->18184|35011->18261|35113->18316|35212->18367|35500->18607|35632->18692|35687->18699|35832->18797|35892->18809|35959->18839|35975->18845|36038->18885|36101->18900|36188->18939|36306->19009|36387->19043|36442->19051|36524->19086|36617->19131|36886->19352|36972->19390|37080->19451|37131->19455|37196->19473|37278->19507|37534->19715|37710->19843|37930->20016|37982->20021|38033->20025|38190->20134|38315->20211|38619->20467|38702->20502|38785->20538|38837->20543|38890->20549|38984->20595|39155->20717|39481->20995|39710->21177|39762->21182|39813->21186|39864->21190|39910->21204
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|39->10|39->10|39->10|42->13|42->13|42->13|43->14|43->14|43->14|45->16|45->16|45->16|46->17|46->17|46->17|47->18|49->20|49->20|49->20|54->25|54->25|54->25|55->26|55->26|55->26|55->26|55->26|55->26|55->26|55->26|55->26|56->27|59->30|59->30|59->30|60->31|60->31|60->31|62->33|63->34|63->34|63->34|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|65->36|66->37|70->41|70->41|70->41|71->42|71->42|71->42|71->42|71->42|71->42|72->43|72->43|72->43|73->44|73->44|73->44|75->46|76->47|76->47|76->47|78->49|78->49|78->49|80->51|82->53|82->53|82->53|83->54|83->54|83->54|84->55|84->55|84->55|85->56|87->58|87->58|87->58|88->59|88->59|88->59|89->60|89->60|89->60|90->61|90->61|90->61|90->61|90->61|90->61|91->62|91->62|91->62|92->63|92->63|92->63|92->63|92->63|92->63|93->64|95->66|96->67|96->67|96->67|97->68|97->68|97->68|98->69|98->69|98->69|98->69|98->69|98->69|98->69|98->69|98->69|99->70|99->70|99->70|100->71|100->71|100->71|100->71|100->71|100->71|100->71|100->71|100->71|101->72|102->73|103->74|105->76|109->80|109->80|109->80|109->80|111->82|111->82|111->82|112->83|112->83|112->83|113->84|113->84|113->84|114->85|115->86|115->86|115->86|116->87|116->87|116->87|117->88|118->89|177->148|177->148|177->148|178->149|178->149|178->149|191->162|192->163|195->166|195->166|198->169|199->170|201->172|203->174|206->177|208->179|208->179|208->179|209->180|209->180|211->182|213->184|214->185|215->186|216->187|219->190|221->192|225->196|225->196|229->200|230->201|233->204|234->205|234->205|234->205|234->205|234->205|234->205|234->205|234->205|234->205|234->205|234->205|234->205|234->205|234->205|234->205|234->205|234->205|234->205|237->208|239->210|241->212|243->214|244->215|263->234|267->238|268->239|270->241|271->242|273->244|275->246|280->251|282->253|285->256|287->258|289->260|291->262|293->264|295->266|296->267|298->269|298->269|300->271|301->272|302->273|304->275|308->279|309->280|312->283|315->286|317->288|319->290|322->293|325->296|327->298|328->299|363->334|368->339|369->340|372->343|373->344|376->347|377->348|379->350|382->353|387->358|388->359|391->362|396->367|397->368|398->369|400->371|402->373|407->378|408->379|411->382|413->384|413->384|415->386|419->390|421->392|423->394|424->395|426->397|458->429|459->430|461->432|461->432|461->432|462->433|462->433|464->435|466->437|468->439|477->448|477->448|477->448|478->449|478->449|478->449|478->449|478->449|478->449|478->449|478->449|478->449|478->449|479->450|479->450|479->450|480->451|480->451|480->451|480->451|480->451|480->451|480->451|480->451|480->451|481->452|482->453|488->459|489->460|490->461|492->463|497->468|501->472|504->475|506->477|508->479|511->482|514->485|516->487|518->489|542->513|544->515|545->516|547->518|549->520|549->520|549->520|550->521|550->521|552->523|557->528|558->529|560->531|560->531|562->533|564->535|564->535|574->545|577->548|579->550|588->559|591->562|592->563|594->565|594->565|594->565|595->566|595->566|597->568|599->570|600->571|601->572|603->574|604->575|605->576|606->577|608->579|610->581|610->581|611->582|613->584|615->586|620->591|621->592|623->594|624->595|625->596|626->597|628->599|632->603|634->605|638->609|639->610|643->614|644->615|644->615|647->618|651->622|652->623|656->627|657->628|658->629|661->632|662->633|664->635|664->635|664->635|665->636|665->636|667->638|669->640|670->641|671->642|674->645|675->646|677->648|677->648|677->648|678->649|678->649|680->651|682->653|683->654|684->655|713->684|718->689|720->691|721->692|721->692|725->696|728->699|729->700|731->702|731->702|731->702|732->703|732->703|734->705|736->707|737->708|738->709|758->729|762->733|764->735|767->738|770->741|770->741|773->744|774->745|776->747|776->747|776->747|777->748|777->748|779->750|781->752|782->753|785->756|787->758|791->762|792->763|795->766|796->767|798->769|800->771|803->774|806->777|809->780|811->782|812->783|838->809|840->811|844->815|845->816|847->818|848->819|849->820|850->821|852->823|856->827|860->831|861->832|862->833|863->834|866->837
                    -- GENERATED --
                */
            