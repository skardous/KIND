
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
	Cr&eacute;ateur : <b>"""),_display_(Seq[Any](/*14.24*/event/*14.29*/.createur)),format.raw/*14.38*/("""</b> """),_display_(Seq[Any](/*14.44*/if(event.email != "" && event.email != null)/*14.88*/ {_display_(Seq[Any](format.raw/*14.90*/("""   Contact : """),_display_(Seq[Any](/*14.104*/event/*14.109*/.email)),format.raw/*14.115*/(""" """)))})),format.raw/*14.117*/("""<br/>

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

	<div class="selectDate" style="position:relative">
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

	<!--<script type="text/javascript" src=""""),_display_(Seq[Any](/*151.43*/routes/*151.49*/.Assets.at("javascripts/sendMail.js"))),format.raw/*151.86*/(""""></script>  -->
	<!--<script type="text/javascript" src=""""),_display_(Seq[Any](/*152.43*/routes/*152.49*/.Assets.at("javascripts/editPersonne.js"))),format.raw/*152.90*/(""""></script> -->

	<script type="text/javascript" charset="utf-8">
	
	var color1 = "#FFFF99";
	var color2 = "gold";
	var color3 = "steelblue";
	var mdp = "";



	/*Code concernant les mails et l'envoi*/

	$(function()"""),format.raw("""{"""),format.raw/*165.15*/("""
		if (bonmail($("#mailsArea").val())) """),format.raw("""{"""),format.raw/*166.40*/("""
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
		"""),format.raw("""}"""),format.raw/*169.4*/(""" else """),format.raw("""{"""),format.raw/*169.11*/("""
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
		"""),format.raw("""}"""),format.raw/*172.4*/("""
	"""),format.raw("""}"""),format.raw/*173.3*/(""");

	$('#envoiLien').live('click', function(e) """),format.raw("""{"""),format.raw/*175.45*/("""

		if ($(this).attr("disabled") != "disabled") """),format.raw("""{"""),format.raw/*177.48*/("""
			var mailsList = $("#mailsArea").val();

			$.ajax("""),format.raw("""{"""),format.raw/*180.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*182.12*/routes/*182.18*/.Application.sendMail(event.id))),format.raw/*182.49*/("""",
				data: '"""),format.raw("""{"""),format.raw/*183.13*/(""""mailslist" : "' + mailsList + '""""),format.raw("""}"""),format.raw/*183.47*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*185.31*/("""
					alert("Mail(s) envoye(s) a "+mailsList);
				"""),format.raw("""}"""),format.raw/*187.6*/("""
			"""),format.raw("""}"""),format.raw/*188.5*/(""");
		"""),format.raw("""}"""),format.raw/*189.4*/("""
	"""),format.raw("""}"""),format.raw/*190.3*/(""");


	$("#mailsArea").live("keyup", function() """),format.raw("""{"""),format.raw/*193.44*/("""

		if (bonmail($(this).val())) """),format.raw("""{"""),format.raw/*195.32*/("""
			
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
		"""),format.raw("""}"""),format.raw/*199.4*/(""" else """),format.raw("""{"""),format.raw/*199.11*/("""
			
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
		"""),format.raw("""}"""),format.raw/*203.4*/("""
	"""),format.raw("""}"""),format.raw/*204.3*/(""")
	
	function bonmail(mailtest)
	"""),format.raw("""{"""),format.raw/*207.3*/("""
		var reg = new RegExp('^([a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*208.46*/("""1"""),format.raw("""}"""),format.raw/*208.48*/("""[a-z0-9]+)*@[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*208.80*/("""1"""),format.raw("""}"""),format.raw/*208.82*/("""[a-z0-9]+)*[\.]"""),format.raw("""{"""),format.raw/*208.98*/("""1"""),format.raw("""}"""),format.raw/*208.100*/("""[a-z]"""),format.raw("""{"""),format.raw/*208.106*/("""2,6"""),format.raw("""}"""),format.raw/*208.110*/(""")"""),format.raw("""{"""),format.raw/*208.112*/("""1"""),format.raw("""}"""),format.raw/*208.114*/("""(\,( )*[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*208.140*/("""1"""),format.raw("""}"""),format.raw/*208.142*/("""[a-z0-9]+)*@[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*208.174*/("""1"""),format.raw("""}"""),format.raw/*208.176*/("""[a-z0-9]+)*[\.]"""),format.raw("""{"""),format.raw/*208.192*/("""1"""),format.raw("""}"""),format.raw/*208.194*/("""[a-z]"""),format.raw("""{"""),format.raw/*208.200*/("""2,6"""),format.raw("""}"""),format.raw/*208.204*/(""")*$', 'i');

		if(reg.test(mailtest))
		"""),format.raw("""{"""),format.raw/*211.4*/("""
			return(true);
		"""),format.raw("""}"""),format.raw/*213.4*/("""
		else
		"""),format.raw("""{"""),format.raw/*215.4*/("""
			return(false);
		"""),format.raw("""}"""),format.raw/*217.4*/("""
	"""),format.raw("""}"""),format.raw/*218.3*/("""





















	/*Code de style*/

	$(function()"""),format.raw("""{"""),format.raw/*242.15*/("""
		$("table.datesTable td").css("background-color", color3);
		$(".checkbox").attr("disabled", "true"); 

		$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*246.37*/(""" // coloration des box checkées
		  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*247.34*/("""
		  		$(this).parent().css("background-color", "#66CC99");
		  	"""),format.raw("""}"""),format.raw/*249.7*/("""
		"""),format.raw("""}"""),format.raw/*250.4*/(""");

		$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*252.41*/("""
			$('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*254.4*/(""");

		refreshCount(); // maj de la ligne de compteurs

		affichagePopulaire(); // maj des surbrillances
	"""),format.raw("""}"""),format.raw/*259.3*/(""")

	$("textarea").live('click', function(e) """),format.raw("""{"""),format.raw/*261.43*/("""
		$(this).html("");
		$(this).removeAttr("style");
	"""),format.raw("""}"""),format.raw/*264.3*/(""")

	function refreshHoverable() """),format.raw("""{"""),format.raw/*266.31*/(""" //coloration des cases quand on passe la souris dessus
		
		$(".hoverable").on("""),format.raw("""{"""),format.raw/*268.23*/("""

			mouseenter: function () """),format.raw("""{"""),format.raw/*270.29*/("""
				$(this).css("background-color", "lightgreen");
			"""),format.raw("""}"""),format.raw/*272.5*/(""", 

			mouseleave: function () """),format.raw("""{"""),format.raw/*274.29*/("""
				if ($(this).children().is(':checked'))"""),format.raw("""{"""),format.raw/*275.44*/("""	 
			    	$(this).css("background-color", "#66CC99");
			    """),format.raw("""}"""),format.raw/*277.9*/(""" else """),format.raw("""{"""),format.raw/*277.16*/("""
			    	$(this).css("background-color", color3);
			    """),format.raw("""}"""),format.raw/*279.9*/("""
			"""),format.raw("""}"""),format.raw/*280.5*/("""
		"""),format.raw("""}"""),format.raw/*281.4*/(""");

	"""),format.raw("""}"""),format.raw/*283.3*/("""

	

	function refreshCount() """),format.raw("""{"""),format.raw/*287.27*/(""" // met à jour l'affichage du compte des participants par horaire
		$('input[type="checkbox"].horaire.checkbox').each(function(i) """),format.raw("""{"""),format.raw/*288.66*/("""
			var iden = $(this).attr('id');
			
			if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*291.32*/("""
		    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			"""),format.raw("""}"""),format.raw/*294.5*/("""
			
		"""),format.raw("""}"""),format.raw/*296.4*/(""");
			
		$('input[type="checkbox"].jour.checkbox').each(function(i) """),format.raw("""{"""),format.raw/*298.63*/("""
			var iden = $(this).attr('id');			
				
			if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*301.32*/("""
		    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			"""),format.raw("""}"""),format.raw/*304.5*/("""			
			
		"""),format.raw("""}"""),format.raw/*306.4*/(""");
	"""),format.raw("""}"""),format.raw/*307.3*/("""

	























	/*Code sur les mots de passe*/

	//$( "#dialog:ui-dialog" ).dialog( "destroy" ); 
		
	
	var pass = "";
	var goodPass = "";
	var currentEditButton;

	$( "#dialog-question-securise" ).dialog("""),format.raw("""{"""),format.raw/*342.43*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*347.13*/("""
			"Oui": function() """),format.raw("""{"""),format.raw/*348.23*/("""				    	
			    $( "#dialog-new-pwd" ).dialog( "open" );  
			    $( this ).dialog( "close" );
			"""),format.raw("""}"""),format.raw/*351.5*/(""",
			"Non": function() """),format.raw("""{"""),format.raw/*352.23*/("""
				addPersonne($.trim($("#champ").attr("value")), "false", "");
				$( this ).dialog( "close" );
			"""),format.raw("""}"""),format.raw/*355.5*/("""				
		"""),format.raw("""}"""),format.raw/*356.4*/("""
		
	"""),format.raw("""}"""),format.raw/*358.3*/(""");
			
	
	$( "#dialog-new-pwd" ).dialog("""),format.raw("""{"""),format.raw/*361.33*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*366.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*367.22*/("""
				var bValid = true;									

				if ( bValid ) """),format.raw("""{"""),format.raw/*370.20*/("""
					mdp = $("#password-new").val();
					addPersonne($.trim($("#champ").attr("value")), "true", mdp);
					$( "#password-new" ).attr("value", "");
					$( this ).dialog( "close" );
				"""),format.raw("""}"""),format.raw/*375.6*/("""
			"""),format.raw("""}"""),format.raw/*376.5*/("""				
		"""),format.raw("""}"""),format.raw/*377.4*/("""
		
	"""),format.raw("""}"""),format.raw/*379.3*/(""");

	$( "#dialog-check-pwd" ).dialog("""),format.raw("""{"""),format.raw/*381.35*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*386.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*387.22*/("""				
								
				pass = $("#password-check").val();	
				if (pass == goodPass) """),format.raw("""{"""),format.raw/*390.28*/("""
				  	edition(currentEditButton);
				"""),format.raw("""}"""),format.raw/*392.6*/(""" else """),format.raw("""{"""),format.raw/*392.13*/("""
				  	alert("mot de passe incorrect");
				"""),format.raw("""}"""),format.raw/*394.6*/("""				
				$( "#password-check" ).attr("value", "");
				$( this ).dialog( "close" );
				
			"""),format.raw("""}"""),format.raw/*398.5*/(""",

			"Annuler": function() """),format.raw("""{"""),format.raw/*400.27*/("""							
				$( this ).dialog( "close" );				
			"""),format.raw("""}"""),format.raw/*402.5*/("""				
		"""),format.raw("""}"""),format.raw/*403.4*/("""
		
	"""),format.raw("""}"""),format.raw/*405.3*/(""");

	


























	/*Code sur l'ajout*/

	function addPersonne(nomParticipant, locked, pwd)
	"""),format.raw("""{"""),format.raw/*437.3*/("""	
		$.ajax("""),format.raw("""{"""),format.raw/*438.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*440.11*/routes/*440.17*/.Application.addParticipant(event.id))),format.raw/*440.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*441.12*/(""""nom" : "' + nomParticipant + '", "locked" : "' + locked + '", "pwd" : "' + pwd + '""""),format.raw("""}"""),format.raw/*441.97*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*443.30*/("""
				var lock ="";		
				if(locked == "true")"""),format.raw("""{"""),format.raw/*445.26*/("""
					lock = "<i class=\"mesicones icon-lock\"></i>&nbsp;";
				"""),format.raw("""}"""),format.raw/*447.6*/("""  
				$("tbody").append("<tr title=\""+nomParticipant+"\" class=\"editable\" id=\""+data.idPersonne+"\"><td class=\"infoPersonne\">"+
					"<form id=\"formPersonne\">"+
					lock+
					"<a id=\"obligatoire\" class=\"obligatoirecb btn\">Facultatif</a>&nbsp;"+
					"<input id=\"nom\" type=\"text\" value=\""+nomParticipant+"\" name=\"nom\">&nbsp;"+	
					"<a id=\""+data.idPersonne+"\" title=\"editer le participant\" class=\"editPersonne\"><i class=\"mesicones icon-ok\"></i></a>"+
					"<a id=\""+data.idPersonne+"\" title=\"supprimer le participant\" class=\"deletePersonne\"> <i class=\"mesicones icon-trash\"></i</a>"+		  
					"</form></td>"+
					""""),_display_(Seq[Any](/*456.8*/for(jour <- event.jours) yield /*456.32*/ {_display_(Seq[Any](format.raw/*456.34*/(""""+  
					""""),_display_(Seq[Any](/*457.8*/if(jour.horaires.size() == 0)/*457.37*/{_display_(Seq[Any](format.raw/*457.38*/("""<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*457.117*/jour/*457.121*/.id)),format.raw/*457.124*/("""\" type=\"checkbox\" class=\"jour checkbox\" value=\""""),_display_(Seq[Any](/*457.178*/jour/*457.182*/.date)),format.raw/*457.187*/("""\" /></td>""")))})),format.raw/*457.198*/(""""+
					""""),_display_(Seq[Any](/*458.8*/for(horaire <- jour.horaires) yield /*458.37*/ {_display_(Seq[Any](format.raw/*458.39*/(""""+	                		
					"<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*459.86*/horaire/*459.93*/.id)),format.raw/*459.96*/("""\" type=\"checkbox\" class=\"horaire checkbox\" value=\""""),_display_(Seq[Any](/*459.153*/horaire/*459.160*/.debut)),format.raw/*459.166*/(""" - """),_display_(Seq[Any](/*459.170*/horaire/*459.177*/.fin)),format.raw/*459.181*/("""\" /></td>"+			                
					"""")))})),format.raw/*460.8*/(""""+                	                
					"""")))})),format.raw/*461.8*/("""" +
					"</tr>")
				$('#champ').attr('value', '')
				$('.titres').attr('style','');
				refreshHoverable();
						
			"""),format.raw("""}"""),format.raw/*467.5*/("""               
		"""),format.raw("""}"""),format.raw/*468.4*/(""");
	"""),format.raw("""}"""),format.raw/*469.3*/("""

	$("#ajouter").live('click', function(e)"""),format.raw("""{"""),format.raw/*471.42*/("""
		

	    var vide = "";	    
	    var nom = $("#champ").attr("value");
	    if (nom != vide) """),format.raw("""{"""),format.raw/*476.24*/("""  
	    	$( "#dialog-question-securise" ).dialog( "open" );	
	    	
						
		"""),format.raw("""}"""),format.raw/*480.4*/("""

	    	    
	"""),format.raw("""}"""),format.raw/*483.3*/(""");

	$("#champ").keypress(function(e) """),format.raw("""{"""),format.raw/*485.36*/("""
		var code = (e.keyCode ? e.keyCode : e.which);
		if(code == 13) """),format.raw("""{"""),format.raw/*487.19*/(""" //Enter keycode
			var vide = "";	    
		    var nom = $.trim($("#champ").attr("value"));
		    if (nom != vide) """),format.raw("""{"""),format.raw/*490.25*/("""  
		    	$( "#dialog-question-securise" ).dialog( "open" );	
							
			"""),format.raw("""}"""),format.raw/*493.5*/("""
			$("#champ").focus();
 		"""),format.raw("""}"""),format.raw/*495.5*/("""

	"""),format.raw("""}"""),format.raw/*497.3*/(""");





















	/*Code sur l'édition*/

	$('.editPersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*521.48*/("""
		
	    if(!$(this).parents("tr").hasClass("editable"))  """),format.raw("""{"""),format.raw/*523.56*/("""	    	
	    	if ($(this).siblings("i").hasClass("icon-lock"))"""),format.raw("""{"""),format.raw/*524.56*/("""
	    		currentEditButton = $(this);
	    		$.ajax("""),format.raw("""{"""),format.raw/*526.16*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*528.13*/routes/*528.19*/.Application.getPass())),format.raw/*528.41*/("""",
					data: '"""),format.raw("""{"""),format.raw/*529.14*/(""" "idpers" : "'+$(this).parents("tr").attr("id")+'" """),format.raw("""}"""),format.raw/*529.66*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*531.32*/("""
						goodPass = data.pass;

						$( "#dialog-check-pwd" ).dialog( "open" );	
											  
					"""),format.raw("""}"""),format.raw/*536.7*/("""
			   """),format.raw("""}"""),format.raw/*537.8*/(""");			
				
			"""),format.raw("""}"""),format.raw/*539.5*/(""" else """),format.raw("""{"""),format.raw/*539.12*/("""
				edition($(this));
			"""),format.raw("""}"""),format.raw/*541.5*/("""
		  
	    """),format.raw("""}"""),format.raw/*543.7*/(""" else """),format.raw("""{"""),format.raw/*543.14*/("""
	      $(this).html("<i class=\"mesicones icon-pencil\"></i>");
	      $(this).parents("tr").removeClass("editable");
	      $(this).siblings('input[type="text"]').attr("readonly", "readonly");
	      $(this).parent().parent().parent().children("td").children('input[type="checkbox"]').attr("disabled","true"); 
	      $(this).parent().parent().parent().children("td").css("border", "none");
	      $(".hoverable").off();	      
	      $(this).parent().parent().parent().children(".checktd").attr("class", "checktd");
	      refreshHoverable();
	      editPersonne($(this).attr('id'), $(this).siblings("input").attr("value"));
	    """),format.raw("""}"""),format.raw/*553.7*/("""
	
	  
	"""),format.raw("""}"""),format.raw/*556.3*/(""")

	function edition(elem) """),format.raw("""{"""),format.raw/*558.26*/("""
		elem.html("<i class=\"mesicones icon-ok\"></i>");
		elem.parents("tr").addClass("editable");
		elem.siblings('input[type="text"]').removeAttr("readonly");
		elem.parent().parent().parent().children("td").children().removeAttr("disabled");
		elem.parent().parent().parent().children("td").css("border", "solid black 2px");
		$(".hoverable").off();		  
		elem.parent().parent().parent().children(".checktd").attr("class", "checktd hoverable");
		refreshHoverable();
	"""),format.raw("""}"""),format.raw/*567.3*/("""

	function editPersonne(personneId, personneNom)
	"""),format.raw("""{"""),format.raw/*570.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*571.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*573.11*/routes/*573.17*/.Application.updatePersonne(event.id))),format.raw/*573.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*574.12*/(""""id" : "' + personneId + '", "nom" : "' + personneNom + '""""),format.raw("""}"""),format.raw/*574.71*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*576.30*/("""
			  //alert("Participant edit\351");
			"""),format.raw("""}"""),format.raw/*578.5*/("""
	  """),format.raw("""}"""),format.raw/*579.5*/(""");
	"""),format.raw("""}"""),format.raw/*580.3*/("""

	$('.checktd').live('click', function(e) """),format.raw("""{"""),format.raw/*582.43*/("""
		if ($(this).children().prop("disabled") == false) """),format.raw("""{"""),format.raw/*583.54*/("""
			if ($(this).children().prop("checked") == false) """),format.raw("""{"""),format.raw/*584.54*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*585.36*/("""
					$(this).children().prop("checked", true);
				"""),format.raw("""}"""),format.raw/*587.6*/("""
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*589.5*/(""" else """),format.raw("""{"""),format.raw/*589.12*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*590.36*/("""
					$(this).children().prop("checked", false);
				"""),format.raw("""}"""),format.raw/*592.6*/("""        
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*594.5*/("""

			affichagePopulaire();

			//$('.populaires').html("");
			$('.titres td').each( function() """),format.raw("""{"""),format.raw/*599.38*/("""
				if ($(this).css('background-color') == color2) """),format.raw("""{"""),format.raw/*600.53*/("""
					$('.populaires').append($(this).html());
				"""),format.raw("""}"""),format.raw/*602.6*/("""				
			"""),format.raw("""}"""),format.raw/*603.5*/(""")			
		"""),format.raw("""}"""),format.raw/*604.4*/("""
	"""),format.raw("""}"""),format.raw/*605.3*/(""");

	function changeCheck(box) """),format.raw("""{"""),format.raw/*607.29*/("""   // gestion des clics sur les checkboxes
	   var idtime = box.attr('id');
	   var idParticipant = box.parent().parent().attr('id');   
	   
	   if (box.is(':checked'))"""),format.raw("""{"""),format.raw/*611.29*/("""	 //Action de valider une horaire  		
	       		box.parent().css("background-color", "#66CC99")//vert
		   		if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*613.57*/("""
		            var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
		       	    requeteAjaxHeure(idtime, idParticipant);
			    """),format.raw("""}"""),format.raw/*617.9*/("""
	       		if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*618.57*/("""	
	    	   	    var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
				    requeteAjaxJour(idtime, idParticipant);
			   """),format.raw("""}"""),format.raw/*622.8*/("""
	   """),format.raw("""}"""),format.raw/*623.6*/(""" else """),format.raw("""{"""),format.raw/*623.13*/(""" //Action de dévalider une horaires
	     
		    box.parent().css("background-color", color3) //
		    if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*626.56*/("""
			    var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxHeure(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*630.8*/("""
		    if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*631.53*/("""
		        var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxJour(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*635.8*/("""
	   """),format.raw("""}"""),format.raw/*636.6*/("""
	"""),format.raw("""}"""),format.raw/*637.3*/("""

	function requeteAjaxJour(idtime, idParticipant) // ajoute la date au participant
	"""),format.raw("""{"""),format.raw/*640.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*641.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*643.11*/routes/*643.17*/.Application.checkBoxJour(event.id))),format.raw/*643.52*/("""",
			data: '"""),format.raw("""{"""),format.raw/*644.12*/(""""idjour" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*644.80*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*646.30*/("""
			  //alert("Jour edit\351");
			"""),format.raw("""}"""),format.raw/*648.5*/("""
	   """),format.raw("""}"""),format.raw/*649.6*/(""");
	"""),format.raw("""}"""),format.raw/*650.3*/("""

	function requeteAjaxHeure(idtime, idParticipant) // ajoute l'heure au participant
	"""),format.raw("""{"""),format.raw/*653.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*654.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*656.11*/routes/*656.17*/.Application.checkBoxHoraire(event.id))),format.raw/*656.55*/("""",
			data: '"""),format.raw("""{"""),format.raw/*657.12*/(""""idhoraire" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*657.83*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*659.30*/("""
			  //alert("Horaire edit\351");
			"""),format.raw("""}"""),format.raw/*661.5*/("""
	   """),format.raw("""}"""),format.raw/*662.6*/(""");
	"""),format.raw("""}"""),format.raw/*663.3*/("""


























	/*Code sur la suppression*/

	$('.deletePersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*692.50*/("""    
	    $(this).parent().parent().parent().remove();
	    
	    
	    deletePersonne($(this).attr('id'));
	    if($('td[class="infoPersonne"]').html() == null) """),format.raw("""{"""),format.raw/*697.56*/("""
	    	$('.titres').attr('style','display:none');
	    """),format.raw("""}"""),format.raw/*699.7*/("""
	    $('#compte').children('td[id!=""]').each(function(i) """),format.raw("""{"""),format.raw/*700.60*/("""$(this).html("0")"""),format.raw("""}"""),format.raw/*700.78*/(""");

	    refreshCount();
	    
	"""),format.raw("""}"""),format.raw/*704.3*/(""")

	function deletePersonne(persId)
	"""),format.raw("""{"""),format.raw/*707.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*708.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*710.11*/routes/*710.17*/.Application.deleteParticipant(event.id))),format.raw/*710.57*/("""",
			data: '"""),format.raw("""{"""),format.raw/*711.12*/(""""id" : "' + persId + '""""),format.raw("""}"""),format.raw/*711.36*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*713.30*/("""
			  //alert("Participant supprim\351");
			"""),format.raw("""}"""),format.raw/*715.5*/("""
	  """),format.raw("""}"""),format.raw/*716.5*/(""");
	"""),format.raw("""}"""),format.raw/*717.3*/("""


















	/*Code sur les participants obligatoires*/
	$(function()"""),format.raw("""{"""),format.raw/*737.15*/("""
		refreshObligatoire(); 
		affichagePopulaire();
		
	"""),format.raw("""}"""),format.raw/*741.3*/(""")	

	$(".obligatoirecb").live("click", function() """),format.raw("""{"""),format.raw/*743.48*/(""" //click sur la checkbox "obligatoire" : mise à jour des classes sur la ligne, ajout de la propriété obligatoire dans la bdd
			
			var idParticipant = $(this).parent().parent().parent().attr("id");
			if ($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*746.42*/("""
				$(this).html("Facultatif");
				$(this).attr("class", "obligatoirecb btn");
			"""),format.raw("""}"""),format.raw/*749.5*/(""" else """),format.raw("""{"""),format.raw/*749.12*/("""
				$(this).html("Obligatoire");
				$(this).attr("class", "obligatoirecb btn btn-inverse");
			"""),format.raw("""}"""),format.raw/*752.5*/("""
			$.ajax("""),format.raw("""{"""),format.raw/*753.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*755.12*/routes/*755.18*/.Application.changeObligatoire(event.id))),format.raw/*755.58*/("""",
				data: '"""),format.raw("""{"""),format.raw/*756.13*/(""""idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*756.52*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*758.31*/("""
				  affichagePopulaire();
				"""),format.raw("""}"""),format.raw/*760.6*/("""
	   		"""),format.raw("""}"""),format.raw/*761.8*/(""");
	   		refreshObligatoire();

		"""),format.raw("""}"""),format.raw/*764.4*/(""")

	function checkobligatoire(idtime, type) """),format.raw("""{"""),format.raw/*766.43*/("""//fonction qui renvoie true si tous les participants obligatoires sont présents.
		//alert(idtime);
		var ret = true;
		//alert("type :"+type + " " + idtime)
		$('.obligatoire.'+type+'[id="'+idtime+'"]').each(function() """),format.raw("""{"""),format.raw/*770.64*/("""			
			if(!($(this).is(":checked"))) """),format.raw("""{"""),format.raw/*771.35*/("""
				//alert("id:"+$(this).attr("id"));
				ret = false;
			"""),format.raw("""}"""),format.raw/*774.5*/("""
		"""),format.raw("""}"""),format.raw/*775.4*/(""")
		return ret;
	"""),format.raw("""}"""),format.raw/*777.3*/("""

	function refreshObligatoire() """),format.raw("""{"""),format.raw/*779.33*/(""" // met à jour les classes "obligatoire" sur les bonnes lignes de participants
		$(".checktd").removeClass("obligatoire");
		$(".checkbox").removeClass("obligatoire");
		$(".obligatoirecb").each(function () """),format.raw("""{"""),format.raw/*782.41*/("""
			//alert("test");
			//alert($(this).parent().parent().siblings(".checktd").html());
			if($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*785.41*/("""					
				$(this).parent().parent().siblings(".checktd").addClass("obligatoire");
				$(this).parent().parent().siblings(".checktd").children().addClass("obligatoire");
			"""),format.raw("""}"""),format.raw/*788.5*/("""

		"""),format.raw("""}"""),format.raw/*790.4*/(""")
	"""),format.raw("""}"""),format.raw/*791.3*/("""








	
	
	

	

	

	

	

	


	
	/*Code d'affichage des dates populaires*/
	function affichagePopulaire() """),format.raw("""{"""),format.raw/*817.33*/("""
		var max = 0;
		$("#compte").children(".horaire, .jour").each( function() """),format.raw("""{"""),format.raw/*819.62*/(""" // récupération de la valeur maximale dans les comptes
			$(this).css("background-color", color1) 
			$('.titres').children().css("background-color",color1);
			//$('.footer').html("");
			if (checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*823.70*/("""			
				if ($(this).html() > max) """),format.raw("""{"""),format.raw/*824.32*/("""			
					max = $(this).html();
				"""),format.raw("""}"""),format.raw/*826.6*/("""
			"""),format.raw("""}"""),format.raw/*827.5*/("""		
		"""),format.raw("""}"""),format.raw/*828.4*/(""")
		$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*829.45*/("""
			
			if ($(this).html() == max && $(this).html() != 0 && checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*831.118*/("""			
				$(this).css("background-color", color2);
				//alert("classe : "+$(this).attr("class")+" id : "+$(this).attr("id"));
				$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", color2);
				if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*835.45*/("""
					var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
					$("td:contains('"+day+"')").css("background-color", color2);
					
				"""),format.raw("""}"""),format.raw/*839.6*/("""
			"""),format.raw("""}"""),format.raw/*840.5*/("""
		"""),format.raw("""}"""),format.raw/*841.4*/(""")
	"""),format.raw("""}"""),format.raw/*842.3*/("""
	</script>

""")))})),format.raw/*845.2*/("""
"""))}
    }
    
    def render(event:Evenement) = apply(event)
    
    def f:((Evenement) => play.api.templates.Html) = (event) => apply(event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jul 20 11:29:20 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/editForm.scala.html
                    HASH: 62d944b3c3a7043e84d6072cd55c0ebc7852abb8
                    MATRIX: 761->1|864->40|896->64|980->19|1008->38|1036->118|1075->123|1110->150|1149->152|1212->179|1226->184|1254->190|1339->239|1353->244|1381->250|1451->284|1465->289|1496->298|1538->304|1591->348|1631->350|1682->364|1697->369|1726->375|1761->377|1805->386|1840->412|1880->414|1936->434|1950->439|1983->450|2028->464|2108->508|2123->514|2179->548|2401->735|2441->759|2481->761|2541->785|2554->789|2579->792|2640->817|2653->821|2691->837|2733->843|2746->847|2773->852|2861->909|2990->1003|3030->1027|3070->1029|3115->1039|3153->1068|3192->1069|3262->1108|3309->1119|3354->1148|3394->1150|3450->1170|3466->1177|3491->1180|3535->1188|3548->1192|3575->1197|3630->1216|3646->1223|3674->1229|3714->1233|3730->1240|3756->1244|3804->1260|3870->1295|3941->1331|3995->1369|4035->1371|4088->1388|4108->1399|4134->1403|4177->1410|4197->1421|4222->1424|4291->1458|4370->1528|4410->1530|4453->1538|4484->1560|4523->1561|4605->1612|4648->1620|4684->1647|4723->1648|4837->1745|4850->1750|4889->1751|5005->1836|5095->1890|5115->1901|5141->1905|5232->1960|5252->1971|5277->1974|5422->2083|5442->2094|5467->2097|5604->2203|5657->2221|5697->2245|5737->2247|5784->2258|5822->2287|5861->2288|5910->2301|5967->2349|6007->2351|6095->2403|6108->2407|6133->2410|6236->2476|6250->2480|6278->2485|6325->2514|6338->2519|6377->2520|6466->2573|6479->2577|6504->2580|6599->2638|6613->2642|6641->2647|6701->2675|6757->2699|6810->2716|6855->2745|6895->2747|6950->2766|7013->2820|7053->2822|7141->2874|7157->2881|7182->2884|7288->2953|7305->2960|7334->2966|7375->2970|7392->2977|7419->2981|7466->3010|7479->3015|7518->3016|7607->3069|7623->3076|7648->3079|7745->3139|7762->3146|7791->3152|7832->3156|7849->3163|7876->3167|7936->3195|7985->3212|8059->3254|8109->3273|8203->3332|8246->3366|8285->3367|8339->3389|8414->3429|8454->3453|8494->3455|8538->3464|8576->3493|8615->3494|8685->3528|8698->3532|8723->3535|8792->3573|8843->3588|8888->3617|8928->3619|9005->3660|9021->3667|9046->3670|9131->3723|9167->3728|10789->5313|10805->5319|10865->5356|10961->5415|10977->5421|11041->5462|11306->5679|11394->5719|11553->5831|11608->5838|11773->5956|11823->5959|11919->6007|12016->6056|12119->6111|12186->6141|12202->6147|12256->6178|12319->6193|12401->6227|12519->6297|12618->6349|12670->6354|12723->6360|12773->6363|12869->6411|12950->6444|13113->6560|13168->6567|13337->6689|13387->6692|13468->6726|13562->6772|13612->6774|13691->6806|13741->6808|13805->6824|13856->6826|13911->6832|13964->6836|14015->6838|14066->6840|14141->6866|14192->6868|14272->6900|14323->6902|14388->6918|14439->6920|14494->6926|14547->6930|14635->6971|14703->6992|14761->7003|14830->7025|14880->7028|14984->7084|15174->7226|15287->7291|15400->7357|15451->7361|15543->7405|15628->7443|15781->7549|15874->7594|15975->7648|16056->7681|16185->7762|16263->7792|16366->7848|16446->7880|16538->7924|16648->7987|16703->7994|16808->8052|16860->8057|16911->8061|16964->8067|17043->8098|17222->8229|17340->8299|17515->8427|17570->8435|17687->8504|17809->8578|17981->8703|18039->8714|18091->8719|18357->8937|18517->9049|18588->9072|18735->9172|18807->9196|18957->9299|19012->9307|19065->9313|19154->9354|19314->9466|19384->9488|19485->9541|19720->9729|19772->9734|19827->9742|19880->9748|19966->9786|20126->9898|20196->9920|20325->10001|20413->10042|20468->10049|20561->10095|20701->10188|20778->10217|20874->10266|20929->10274|20982->10280|21137->10388|21197->10400|21262->10428|21278->10434|21338->10471|21400->10485|21533->10570|21649->10638|21743->10684|21855->10749|22547->11405|22588->11429|22629->11431|22677->11443|22716->11472|22756->11473|22873->11552|22888->11556|22915->11559|23007->11613|23022->11617|23051->11622|23096->11633|23142->11643|23188->11672|23229->11674|23373->11781|23390->11788|23416->11791|23511->11848|23529->11855|23559->11861|23601->11865|23619->11872|23647->11876|23718->11915|23793->11958|23962->12080|24028->12099|24080->12104|24171->12147|24314->12242|24439->12320|24501->12335|24588->12374|24703->12441|24866->12556|24987->12630|25063->12659|25114->12663|25258->12759|25365->12818|25475->12880|25575->12932|25644->12964|25660->12970|25705->12992|25769->13008|25869->13060|25989->13132|26136->13232|26191->13240|26253->13255|26308->13262|26382->13289|26441->13301|26496->13308|27177->13942|27233->13951|27309->13979|27825->14448|27924->14500|27984->14512|28049->14540|28065->14546|28125->14583|28187->14597|28294->14656|28410->14724|28500->14767|28552->14772|28604->14777|28696->14821|28798->14875|28900->14929|28984->14965|29084->15018|29173->15060|29228->15067|29312->15103|29413->15157|29510->15207|29655->15304|29756->15357|29855->15409|29911->15418|29966->15426|30016->15429|30096->15461|30314->15631|30520->15789|30770->15992|30875->16049|31115->16242|31168->16248|31223->16255|31423->16407|31654->16591|31755->16644|31985->16827|32038->16833|32088->16836|32221->16922|32281->16934|32346->16962|32362->16968|32420->17003|32482->17017|32598->17085|32714->17153|32797->17189|32850->17195|32902->17200|33036->17287|33096->17299|33161->17327|33177->17333|33238->17371|33300->17385|33419->17456|33535->17524|33621->17563|33674->17569|33726->17574|33880->17680|34091->17843|34194->17899|34302->17959|34368->17977|34448->18010|34533->18048|34593->18060|34658->18088|34674->18094|34737->18134|34799->18148|34871->18172|34987->18240|35080->18286|35132->18291|35184->18296|35309->18373|35411->18428|35510->18479|35798->18719|35930->18804|35985->18811|36130->18909|36190->18921|36257->18951|36273->18957|36336->18997|36399->19012|36486->19051|36604->19121|36685->19155|36740->19163|36822->19198|36915->19243|37184->19464|37270->19502|37378->19563|37429->19567|37494->19585|37576->19619|37832->19827|38008->19955|38228->20128|38280->20133|38331->20137|38488->20246|38613->20323|38917->20579|39000->20614|39083->20650|39135->20655|39188->20661|39282->20707|39453->20829|39779->21107|40008->21289|40060->21294|40111->21298|40162->21302|40208->21316
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|39->10|39->10|39->10|42->13|42->13|42->13|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|45->16|45->16|45->16|46->17|46->17|46->17|47->18|49->20|49->20|49->20|54->25|54->25|54->25|55->26|55->26|55->26|55->26|55->26|55->26|55->26|55->26|55->26|56->27|59->30|59->30|59->30|60->31|60->31|60->31|62->33|63->34|63->34|63->34|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|65->36|66->37|70->41|70->41|70->41|71->42|71->42|71->42|71->42|71->42|71->42|72->43|72->43|72->43|73->44|73->44|73->44|75->46|76->47|76->47|76->47|78->49|78->49|78->49|80->51|82->53|82->53|82->53|83->54|83->54|83->54|84->55|84->55|84->55|85->56|87->58|87->58|87->58|88->59|88->59|88->59|89->60|89->60|89->60|90->61|90->61|90->61|90->61|90->61|90->61|91->62|91->62|91->62|92->63|92->63|92->63|92->63|92->63|92->63|93->64|95->66|96->67|96->67|96->67|97->68|97->68|97->68|98->69|98->69|98->69|98->69|98->69|98->69|98->69|98->69|98->69|99->70|99->70|99->70|100->71|100->71|100->71|100->71|100->71|100->71|100->71|100->71|100->71|101->72|102->73|103->74|105->76|109->80|109->80|109->80|109->80|111->82|111->82|111->82|112->83|112->83|112->83|113->84|113->84|113->84|114->85|115->86|115->86|115->86|116->87|116->87|116->87|117->88|118->89|180->151|180->151|180->151|181->152|181->152|181->152|194->165|195->166|198->169|198->169|201->172|202->173|204->175|206->177|209->180|211->182|211->182|211->182|212->183|212->183|214->185|216->187|217->188|218->189|219->190|222->193|224->195|228->199|228->199|232->203|233->204|236->207|237->208|237->208|237->208|237->208|237->208|237->208|237->208|237->208|237->208|237->208|237->208|237->208|237->208|237->208|237->208|237->208|237->208|237->208|240->211|242->213|244->215|246->217|247->218|271->242|275->246|276->247|278->249|279->250|281->252|283->254|288->259|290->261|293->264|295->266|297->268|299->270|301->272|303->274|304->275|306->277|306->277|308->279|309->280|310->281|312->283|316->287|317->288|320->291|323->294|325->296|327->298|330->301|333->304|335->306|336->307|371->342|376->347|377->348|380->351|381->352|384->355|385->356|387->358|390->361|395->366|396->367|399->370|404->375|405->376|406->377|408->379|410->381|415->386|416->387|419->390|421->392|421->392|423->394|427->398|429->400|431->402|432->403|434->405|466->437|467->438|469->440|469->440|469->440|470->441|470->441|472->443|474->445|476->447|485->456|485->456|485->456|486->457|486->457|486->457|486->457|486->457|486->457|486->457|486->457|486->457|486->457|487->458|487->458|487->458|488->459|488->459|488->459|488->459|488->459|488->459|488->459|488->459|488->459|489->460|490->461|496->467|497->468|498->469|500->471|505->476|509->480|512->483|514->485|516->487|519->490|522->493|524->495|526->497|550->521|552->523|553->524|555->526|557->528|557->528|557->528|558->529|558->529|560->531|565->536|566->537|568->539|568->539|570->541|572->543|572->543|582->553|585->556|587->558|596->567|599->570|600->571|602->573|602->573|602->573|603->574|603->574|605->576|607->578|608->579|609->580|611->582|612->583|613->584|614->585|616->587|618->589|618->589|619->590|621->592|623->594|628->599|629->600|631->602|632->603|633->604|634->605|636->607|640->611|642->613|646->617|647->618|651->622|652->623|652->623|655->626|659->630|660->631|664->635|665->636|666->637|669->640|670->641|672->643|672->643|672->643|673->644|673->644|675->646|677->648|678->649|679->650|682->653|683->654|685->656|685->656|685->656|686->657|686->657|688->659|690->661|691->662|692->663|721->692|726->697|728->699|729->700|729->700|733->704|736->707|737->708|739->710|739->710|739->710|740->711|740->711|742->713|744->715|745->716|746->717|766->737|770->741|772->743|775->746|778->749|778->749|781->752|782->753|784->755|784->755|784->755|785->756|785->756|787->758|789->760|790->761|793->764|795->766|799->770|800->771|803->774|804->775|806->777|808->779|811->782|814->785|817->788|819->790|820->791|846->817|848->819|852->823|853->824|855->826|856->827|857->828|858->829|860->831|864->835|868->839|869->840|870->841|871->842|874->845
                    -- GENERATED --
                */
            