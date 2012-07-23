
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
object editForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Evenement,Integer,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(event: Evenement, adm: Integer):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 


"""),_display_(Seq[Any](/*8.2*/main("Editer un evenement")/*8.29*/ {_display_(Seq[Any](format.raw/*8.31*/("""

	<h1>Participants pour: """),_display_(Seq[Any](/*10.26*/event/*10.31*/.titre)),format.raw/*10.37*/("""</h1><br/>

	
	Titre de l'&eacute;venement : <b>"""),_display_(Seq[Any](/*13.36*/event/*13.41*/.titre)),format.raw/*13.47*/("""</b> <br/>
	Cr&eacute;ateur : <b>"""),_display_(Seq[Any](/*14.24*/event/*14.29*/.createur)),format.raw/*14.38*/("""</b> """),_display_(Seq[Any](/*14.44*/if(event.email != "" && event.email != null)/*14.88*/ {_display_(Seq[Any](format.raw/*14.90*/("""   Contact : """),_display_(Seq[Any](/*14.104*/event/*14.109*/.email)),format.raw/*14.115*/(""" """)))})),format.raw/*14.117*/("""<br/>

	"""),_display_(Seq[Any](/*16.3*/if(event.descriptif != "")/*16.29*/ {_display_(Seq[Any](format.raw/*16.31*/("""
	Description : <i>"""),_display_(Seq[Any](/*17.20*/event/*17.25*/.descriptif)),format.raw/*17.36*/("""</i> <br/>	
	""")))})),format.raw/*18.3*/("""			
	
	"""),_display_(Seq[Any](/*20.3*/if(adm == 1)/*20.15*/ {_display_(Seq[Any](format.raw/*20.17*/("""
		<a class="btn btn-danger" href=""""),_display_(Seq[Any](/*21.36*/routes/*21.42*/.Application.deleteEvent(event.id))),format.raw/*21.76*/("""">Supprimer l'evenement</a>
	""")))})),format.raw/*22.3*/("""


	
	<br>
	<h3>Inviter des personnes à l'évenement</h3>

	<div class="selectDate" style="position:relative">
	<textarea id="mailsArea" title="Adresses email s&eacute;par&eacute;es par une virgule" rows="4" style="color:grey" placeholder="Entrez ici les adresses mail séparées par une virgule ..."></textarea>
	<i class="checkmail mesicones icon-remove"></i>
	<a id="envoiLien" disabled="true" class="btn btn-primary">Envoyer Lien</a>
	</div>
	
	<table class="datesTable" cellspacing="5" cellpadding="5">
		<tbody>
			<tr class="titres" style="display:none"><td style="visibility:hidden"></td>
				"""),_display_(Seq[Any](/*38.6*/for(jour <- event.jours) yield /*38.30*/ {_display_(Seq[Any](format.raw/*38.32*/("""  					  
					<td id=""""),_display_(Seq[Any](/*39.15*/jour/*39.19*/.id)),format.raw/*39.22*/("""" class="jour" colspan=""""),_display_(Seq[Any](/*39.47*/jour/*39.51*/.horaires.size())),format.raw/*39.67*/(""""><b>"""),_display_(Seq[Any](/*39.73*/jour/*39.77*/.date)),format.raw/*39.82*/("""</b></td>	                        	                
				""")))})),format.raw/*40.6*/("""
			</tr>
			<tr class="titres" style="display:none"><td style="visibility:hidden"></td>
				"""),_display_(Seq[Any](/*43.6*/for(jour <- event.jours) yield /*43.30*/ {_display_(Seq[Any](format.raw/*43.32*/("""  
				  """),_display_(Seq[Any](/*44.8*/if(jour.horaires.size() == 0)/*44.37*/{_display_(Seq[Any](format.raw/*44.38*/("""
				    <td class="jour"></td>
				  """)))})),format.raw/*46.8*/("""
				     """),_display_(Seq[Any](/*47.11*/for(horaire <- jour.horaires) yield /*47.40*/ {_display_(Seq[Any](format.raw/*47.42*/("""
				    	 <td id=""""),_display_(Seq[Any](/*48.20*/horaire/*48.27*/.id)),format.raw/*48.30*/("""" dayid=""""),_display_(Seq[Any](/*48.40*/jour/*48.44*/.id)),format.raw/*48.47*/("""" class="horaire">"""),_display_(Seq[Any](/*48.66*/horaire/*48.73*/.debut)),format.raw/*48.79*/(""" - """),_display_(Seq[Any](/*48.83*/horaire/*48.90*/.fin)),format.raw/*48.94*/("""</td>
				     """)))})),format.raw/*49.11*/("""            	                
				""")))})),format.raw/*50.6*/("""
			</tr>
			              
			
			"""),_display_(Seq[Any](/*54.5*/for(participant <- event.participants) yield /*54.43*/ {_display_(Seq[Any](format.raw/*54.45*/("""
				<tr title=""""),_display_(Seq[Any](/*55.17*/participant/*55.28*/.nom)),format.raw/*55.32*/("""" id=""""),_display_(Seq[Any](/*55.39*/participant/*55.50*/.id)),format.raw/*55.53*/(""""><td class="infoPersonne">
					"""),_display_(Seq[Any](/*56.7*/form(routes.Application.updatePersonne(event.id), 'id->"formPersonne")/*56.77*/ {_display_(Seq[Any](format.raw/*56.79*/("""
						"""),_display_(Seq[Any](/*57.8*/if(participant.locked)/*57.30*/{_display_(Seq[Any](format.raw/*57.31*/("""
							<i class="mesicones icon-lock"></i>
						""")))})),format.raw/*59.8*/("""
						"""),_display_(Seq[Any](/*60.8*/if(participant.obligatoire)/*60.35*/{_display_(Seq[Any](format.raw/*60.36*/("""							
							<a id="obligatoire" class="obligatoirecb btn btn-inverse">Obligatoire</a>
						""")))}/*62.9*/else/*62.14*/{_display_(Seq[Any](format.raw/*62.15*/("""								
							<a id="obligatoire" class="obligatoirecb btn ">Facultatif</a>
						""")))})),format.raw/*64.8*/("""

						<input id="nom" size="10" type="text" value=""""),_display_(Seq[Any](/*66.53*/participant/*66.64*/.nom)),format.raw/*66.68*/("""" name="nom" readonly="readonly">							
						<a id=""""),_display_(Seq[Any](/*67.15*/participant/*67.26*/.id)),format.raw/*67.29*/("""" title="Editer le participant" class="editPersonne"><i class="mesicones icon-pencil"></i></a>
						<a id=""""),_display_(Seq[Any](/*68.15*/participant/*68.26*/.id)),format.raw/*68.29*/("""" title="Supprimer le participant" class="deletePersonne"> <i class="mesicones icon-trash"></i></a>
					""")))})),format.raw/*69.7*/("""</td>
					
					"""),_display_(Seq[Any](/*71.7*/for(jour <- event.jours) yield /*71.31*/ {_display_(Seq[Any](format.raw/*71.33*/("""
					    """),_display_(Seq[Any](/*72.11*/if(jour.horaires.size() == 0)/*72.40*/{_display_(Seq[Any](format.raw/*72.41*/("""
					      """),_display_(Seq[Any](/*73.13*/if(participant.inscriptionsJours.contains(jour))/*73.61*/ {_display_(Seq[Any](format.raw/*73.63*/("""
			                <td class="checktd"><input id=""""),_display_(Seq[Any](/*74.52*/jour/*74.56*/.id)),format.raw/*74.59*/("""" type="checkbox"  disabled checked class="jour checkbox" value=""""),_display_(Seq[Any](/*74.125*/jour/*74.129*/.date)),format.raw/*74.134*/("""" /></td>
			              """)))}/*75.20*/else/*75.25*/{_display_(Seq[Any](format.raw/*75.26*/("""
			                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*76.53*/jour/*76.57*/.id)),format.raw/*76.60*/("""" type="checkbox"  disabled class="jour checkbox" value=""""),_display_(Seq[Any](/*76.118*/jour/*76.122*/.date)),format.raw/*76.127*/("""" /></td>
			              """)))})),format.raw/*77.19*/("""
					       
					    """)))})),format.raw/*79.11*/("""
			            """),_display_(Seq[Any](/*80.17*/for(horaire <- jour.horaires) yield /*80.46*/ {_display_(Seq[Any](format.raw/*80.48*/("""
			              """),_display_(Seq[Any](/*81.19*/if(participant.inscriptionsHoraires.contains(horaire))/*81.73*/ {_display_(Seq[Any](format.raw/*81.75*/("""
			                <td class="checktd"><input id=""""),_display_(Seq[Any](/*82.52*/horaire/*82.59*/.id)),format.raw/*82.62*/("""" type="checkbox" disabled class="horaire checkbox"  checked value=""""),_display_(Seq[Any](/*82.131*/horaire/*82.138*/.debut)),format.raw/*82.144*/(""" - """),_display_(Seq[Any](/*82.148*/horaire/*82.155*/.fin)),format.raw/*82.159*/("""" /></td>
			              """)))}/*83.20*/else/*83.25*/{_display_(Seq[Any](format.raw/*83.26*/("""
			                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*84.53*/horaire/*84.60*/.id)),format.raw/*84.63*/("""" type="checkbox" disabled class="horaire checkbox" value=""""),_display_(Seq[Any](/*84.123*/horaire/*84.130*/.debut)),format.raw/*84.136*/(""" - """),_display_(Seq[Any](/*84.140*/horaire/*84.147*/.fin)),format.raw/*84.151*/("""" /></td>
			              """)))})),format.raw/*85.19*/("""
			            """)))})),format.raw/*86.17*/("""            	                
			        """)))})),format.raw/*87.13*/("""				
				</tr>
			""")))})),format.raw/*89.5*/("""
		</tbody>
		<tfoot>
		<tr id="compte" class="titres"
		 """),_display_(Seq[Any](/*93.5*/if(event.participants.size() == 0)/*93.39*/{_display_(Seq[Any](format.raw/*93.40*/(""" style="display:none"""")))})),format.raw/*93.62*/(""">
			<td id=""><b>Compte: </b></td>
			"""),_display_(Seq[Any](/*95.5*/for(jour <- event.jours) yield /*95.29*/ {_display_(Seq[Any](format.raw/*95.31*/("""
			    """),_display_(Seq[Any](/*96.9*/if(jour.horaires.size() == 0)/*96.38*/{_display_(Seq[Any](format.raw/*96.39*/("""		     
	                <td id=""""),_display_(Seq[Any](/*97.27*/jour/*97.31*/.id)),format.raw/*97.34*/("""" class="jour">0</td>	       
			    """)))})),format.raw/*98.9*/("""
	            """),_display_(Seq[Any](/*99.15*/for(horaire <- jour.horaires) yield /*99.44*/ {_display_(Seq[Any](format.raw/*99.46*/("""              
	                <td id=""""),_display_(Seq[Any](/*100.27*/horaire/*100.34*/.id)),format.raw/*100.37*/("""" class="horaire">0</td>              
	            """)))})),format.raw/*101.15*/("""
			""")))})),format.raw/*102.5*/("""
		</tr>
		
			
		</tfoot>

		


		
	</table>
	
	<a class="visibleAdd" ><i class="mesicones icon-plus"></i></a>
	<div class="champAdd" style="display:none">
		Ajouter un participant :		  
		<input id="champ" type="text" value="">&nbsp;<a id="ajouter" class="btn">Ajouter</a><br>
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

	<div id="dialog-check-pwd-adm" title="Entrez le mot de passe organisateur">		

				
			<label for="password">Mot de passe organisateur :</label>
			<input type="password" name="password" id="password-check-adm" value="" class="text ui-widget-content ui-corner-all" />
		
	</div>

	<!--<script type="text/javascript" src=""""),_display_(Seq[Any](/*163.43*/routes/*163.49*/.Assets.at("javascripts/sendMail.js"))),format.raw/*163.86*/(""""></script>  -->
	<!--<script type="text/javascript" src=""""),_display_(Seq[Any](/*164.43*/routes/*164.49*/.Assets.at("javascripts/editPersonne.js"))),format.raw/*164.90*/(""""></script> -->

	<script type="text/javascript" charset="utf-8">
	
	var color1 = "#FFFF99";
	var color2 = "gold";
	var color3 = "steelblue";
	var mdp = "";


	/*Code concernant l'interface administrateur*/

	$(function()"""),format.raw("""{"""),format.raw/*176.15*/("""

		if (""""),_display_(Seq[Any](/*178.9*/adm)),format.raw/*178.12*/("""" == "1") """),format.raw("""{"""),format.raw/*178.23*/("""
			$( "#dialog-check-pwd-adm" ).dialog( "open" );	
		"""),format.raw("""}"""),format.raw/*180.4*/("""
	"""),format.raw("""}"""),format.raw/*181.3*/(""");

	$( "#dialog-check-pwd-adm" ).dialog("""),format.raw("""{"""),format.raw/*183.39*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*188.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*189.22*/("""				
								
				pass = $("#password-check-adm").val();	
				if (pass == """"),_display_(Seq[Any](/*192.19*/event/*192.24*/.passAdmin)),format.raw/*192.34*/("""") """),format.raw("""{"""),format.raw/*192.38*/("""
				  	$( this ).dialog( "close" );
				"""),format.raw("""}"""),format.raw/*194.6*/(""" else """),format.raw("""{"""),format.raw/*194.13*/("""
				  	alert("mot de passe incorrect");
				"""),format.raw("""}"""),format.raw/*196.6*/("""				
				
			"""),format.raw("""}"""),format.raw/*198.5*/("""

					
		"""),format.raw("""}"""),format.raw/*201.4*/("""
		
	"""),format.raw("""}"""),format.raw/*203.3*/(""");































	/*Code concernant les mails et l'envoi*/

	$(function()"""),format.raw("""{"""),format.raw/*237.15*/("""

		if (bonmail($("#mailsArea").val())) """),format.raw("""{"""),format.raw/*239.40*/("""
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
		"""),format.raw("""}"""),format.raw/*242.4*/(""" else """),format.raw("""{"""),format.raw/*242.11*/("""
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
		"""),format.raw("""}"""),format.raw/*245.4*/("""
	"""),format.raw("""}"""),format.raw/*246.3*/(""");

	$('#envoiLien').live('click', function(e) """),format.raw("""{"""),format.raw/*248.45*/("""

		if ($(this).attr("disabled") != "disabled") """),format.raw("""{"""),format.raw/*250.48*/("""
			var mailsList = $("#mailsArea").val();

			$.ajax("""),format.raw("""{"""),format.raw/*253.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*255.12*/routes/*255.18*/.Application.sendMail(event.id))),format.raw/*255.49*/("""",
				data: '"""),format.raw("""{"""),format.raw/*256.13*/(""""mailslist" : "' + mailsList + '""""),format.raw("""}"""),format.raw/*256.47*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*258.31*/("""
					alert("Mail(s) envoye(s) a "+mailsList);
				"""),format.raw("""}"""),format.raw/*260.6*/("""
			"""),format.raw("""}"""),format.raw/*261.5*/(""");
		"""),format.raw("""}"""),format.raw/*262.4*/("""
	"""),format.raw("""}"""),format.raw/*263.3*/(""");


	$("#mailsArea").live("keyup", function() """),format.raw("""{"""),format.raw/*266.44*/("""

		if (bonmail($(this).val())) """),format.raw("""{"""),format.raw/*268.32*/("""
			
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
		"""),format.raw("""}"""),format.raw/*272.4*/(""" else """),format.raw("""{"""),format.raw/*272.11*/("""
			
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
		"""),format.raw("""}"""),format.raw/*276.4*/("""
	"""),format.raw("""}"""),format.raw/*277.3*/(""")
	
	function bonmail(mailtest)
	"""),format.raw("""{"""),format.raw/*280.3*/("""
		var reg = new RegExp('^([a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*281.46*/("""1"""),format.raw("""}"""),format.raw/*281.48*/("""[a-z0-9]+)*@[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*281.80*/("""1"""),format.raw("""}"""),format.raw/*281.82*/("""[a-z0-9]+)*[\.]"""),format.raw("""{"""),format.raw/*281.98*/("""1"""),format.raw("""}"""),format.raw/*281.100*/("""[a-z]"""),format.raw("""{"""),format.raw/*281.106*/("""2,6"""),format.raw("""}"""),format.raw/*281.110*/(""")"""),format.raw("""{"""),format.raw/*281.112*/("""1"""),format.raw("""}"""),format.raw/*281.114*/("""(\,( )*[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*281.140*/("""1"""),format.raw("""}"""),format.raw/*281.142*/("""[a-z0-9]+)*@[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*281.174*/("""1"""),format.raw("""}"""),format.raw/*281.176*/("""[a-z0-9]+)*[\.]"""),format.raw("""{"""),format.raw/*281.192*/("""1"""),format.raw("""}"""),format.raw/*281.194*/("""[a-z]"""),format.raw("""{"""),format.raw/*281.200*/("""2,6"""),format.raw("""}"""),format.raw/*281.204*/(""")*$', 'i');

		if(reg.test(mailtest))
		"""),format.raw("""{"""),format.raw/*284.4*/("""
			return(true);
		"""),format.raw("""}"""),format.raw/*286.4*/("""
		else
		"""),format.raw("""{"""),format.raw/*288.4*/("""
			return(false);
		"""),format.raw("""}"""),format.raw/*290.4*/("""
	"""),format.raw("""}"""),format.raw/*291.3*/("""





















	/*Code de style*/

	$(function()"""),format.raw("""{"""),format.raw/*315.15*/("""
		$("table.datesTable td").css("background-color", color3);
		$(".checkbox").attr("disabled", "true"); 

		$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*319.37*/(""" // coloration des box checkées
		  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*320.34*/("""
		  		$(this).parent().css("background-color", "#66CC99");
		  	"""),format.raw("""}"""),format.raw/*322.7*/("""
		"""),format.raw("""}"""),format.raw/*323.4*/(""");

		$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*325.41*/("""
			$('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*327.4*/(""");

		refreshCount(); // maj de la ligne de compteurs

		affichagePopulaire(); // maj des surbrillances
	"""),format.raw("""}"""),format.raw/*332.3*/(""")

	$("textarea").live('click', function(e) """),format.raw("""{"""),format.raw/*334.43*/("""
		$(this).html("");
		$(this).removeAttr("style");
	"""),format.raw("""}"""),format.raw/*337.3*/(""")

	$(".visibleAdd").live("click", function() """),format.raw("""{"""),format.raw/*339.45*/("""
        if ($(this).siblings(".champAdd").css("display") == "none") """),format.raw("""{"""),format.raw/*340.70*/("""                
            $(this).siblings(".champAdd").removeAttr("style");
            $(this).html("<i class=\"mesicones icon-minus\"></i>")
        """),format.raw("""}"""),format.raw/*343.10*/(""" else """),format.raw("""{"""),format.raw/*343.17*/("""                
            $(this).siblings(".champAdd").attr("style", "display:none");
            $(this).html("<i class=\"mesicones icon-plus\"></i>")
        """),format.raw("""}"""),format.raw/*346.10*/("""
    """),format.raw("""}"""),format.raw/*347.6*/(""")

	function refreshHoverable() """),format.raw("""{"""),format.raw/*349.31*/(""" //coloration des cases quand on passe la souris dessus
		
		$(".hoverable").on("""),format.raw("""{"""),format.raw/*351.23*/("""

			mouseenter: function () """),format.raw("""{"""),format.raw/*353.29*/("""
				$(this).css("background-color", "lightgreen");
			"""),format.raw("""}"""),format.raw/*355.5*/(""", 

			mouseleave: function () """),format.raw("""{"""),format.raw/*357.29*/("""
				if ($(this).children().is(':checked'))"""),format.raw("""{"""),format.raw/*358.44*/("""	 
			    	$(this).css("background-color", "#66CC99");
			    """),format.raw("""}"""),format.raw/*360.9*/(""" else """),format.raw("""{"""),format.raw/*360.16*/("""
			    	$(this).css("background-color", color3);
			    """),format.raw("""}"""),format.raw/*362.9*/("""
			"""),format.raw("""}"""),format.raw/*363.5*/("""
		"""),format.raw("""}"""),format.raw/*364.4*/(""");

	"""),format.raw("""}"""),format.raw/*366.3*/("""

	

	function refreshCount() """),format.raw("""{"""),format.raw/*370.27*/(""" // met à jour l'affichage du compte des participants par horaire
		$('input[type="checkbox"].horaire.checkbox').each(function(i) """),format.raw("""{"""),format.raw/*371.66*/("""
			var iden = $(this).attr('id');
			
			if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*374.32*/("""
		    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			"""),format.raw("""}"""),format.raw/*377.5*/("""
			
		"""),format.raw("""}"""),format.raw/*379.4*/(""");
			
		$('input[type="checkbox"].jour.checkbox').each(function(i) """),format.raw("""{"""),format.raw/*381.63*/("""
			var iden = $(this).attr('id');			
				
			if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*384.32*/("""
		    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			"""),format.raw("""}"""),format.raw/*387.5*/("""			
			
		"""),format.raw("""}"""),format.raw/*389.4*/(""");
	"""),format.raw("""}"""),format.raw/*390.3*/("""



	























	/*Code sur les mots de passe*/

	$( "#dialog:ui-dialog" ).dialog( "destroy" ); 
		
	
	var pass = "";
	var goodPass = "";
	var currentEditButton;

	$( "#dialog-question-securise" ).dialog("""),format.raw("""{"""),format.raw/*427.43*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*432.13*/("""
			"Oui": function() """),format.raw("""{"""),format.raw/*433.23*/("""				    	
			    $( "#dialog-new-pwd" ).dialog( "open" );  
			    $( this ).dialog( "close" );
			"""),format.raw("""}"""),format.raw/*436.5*/(""",
			"Non": function() """),format.raw("""{"""),format.raw/*437.23*/("""
				addPersonne($.trim($("#champ").attr("value")), "false", "");
				$( this ).dialog( "close" );
			"""),format.raw("""}"""),format.raw/*440.5*/("""				
		"""),format.raw("""}"""),format.raw/*441.4*/("""
		
	"""),format.raw("""}"""),format.raw/*443.3*/(""");
			
	
	$( "#dialog-new-pwd" ).dialog("""),format.raw("""{"""),format.raw/*446.33*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*451.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*452.22*/("""
				var bValid = true;									

				if ( bValid ) """),format.raw("""{"""),format.raw/*455.20*/("""
					mdp = $("#password-new").val();
					addPersonne($.trim($("#champ").attr("value")), "true", mdp);
					$( "#password-new" ).attr("value", "");
					$( this ).dialog( "close" );
				"""),format.raw("""}"""),format.raw/*460.6*/("""
			"""),format.raw("""}"""),format.raw/*461.5*/("""				
		"""),format.raw("""}"""),format.raw/*462.4*/("""
		
	"""),format.raw("""}"""),format.raw/*464.3*/(""");

	$( "#dialog-check-pwd" ).dialog("""),format.raw("""{"""),format.raw/*466.35*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*471.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*472.22*/("""				
								
				pass = $("#password-check").val();	
				if (pass == goodPass) """),format.raw("""{"""),format.raw/*475.28*/("""
				  	edition(currentEditButton);
				"""),format.raw("""}"""),format.raw/*477.6*/(""" else """),format.raw("""{"""),format.raw/*477.13*/("""
				  	alert("mot de passe incorrect");
				"""),format.raw("""}"""),format.raw/*479.6*/("""				
				$( "#password-check" ).attr("value", "");
				$( this ).dialog( "close" );
				
			"""),format.raw("""}"""),format.raw/*483.5*/(""",

			"Annuler": function() """),format.raw("""{"""),format.raw/*485.27*/("""							
				$( this ).dialog( "close" );				
			"""),format.raw("""}"""),format.raw/*487.5*/("""				
		"""),format.raw("""}"""),format.raw/*488.4*/("""
		
	"""),format.raw("""}"""),format.raw/*490.3*/(""");

	


























	/*Code sur l'ajout*/

	function addPersonne(nomParticipant, locked, pwd)
	"""),format.raw("""{"""),format.raw/*522.3*/("""	
		$.ajax("""),format.raw("""{"""),format.raw/*523.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*525.11*/routes/*525.17*/.Application.addParticipant(event.id))),format.raw/*525.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*526.12*/(""""nom" : "' + nomParticipant + '", "locked" : "' + locked + '", "pwd" : "' + pwd + '""""),format.raw("""}"""),format.raw/*526.97*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*528.30*/("""
				var lock ="";		
				if(locked == "true")"""),format.raw("""{"""),format.raw/*530.26*/("""
					lock = "<i class=\"mesicones icon-lock\"></i>&nbsp;";
				"""),format.raw("""}"""),format.raw/*532.6*/("""  
				$("tbody").append("<tr title=\""+nomParticipant+"\" class=\"editable\" id=\""+data.idPersonne+"\"><td class=\"infoPersonne\">"+
					"<form id=\"formPersonne\">"+
					lock+
					"<a id=\"obligatoire\" class=\"obligatoirecb btn\">Facultatif</a>&nbsp;"+
					"<input id=\"nom\" type=\"text\" value=\""+nomParticipant+"\" name=\"nom\">&nbsp;"+	
					"<a id=\""+data.idPersonne+"\" title=\"editer le participant\" class=\"editPersonne\"><i class=\"mesicones icon-ok\"></i></a>"+
					"<a id=\""+data.idPersonne+"\" title=\"supprimer le participant\" class=\"deletePersonne\"> <i class=\"mesicones icon-trash\"></i</a>"+		  
					"</form></td>"+
					""""),_display_(Seq[Any](/*541.8*/for(jour <- event.jours) yield /*541.32*/ {_display_(Seq[Any](format.raw/*541.34*/(""""+  
					""""),_display_(Seq[Any](/*542.8*/if(jour.horaires.size() == 0)/*542.37*/{_display_(Seq[Any](format.raw/*542.38*/("""<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*542.117*/jour/*542.121*/.id)),format.raw/*542.124*/("""\" type=\"checkbox\" class=\"jour checkbox\" value=\""""),_display_(Seq[Any](/*542.178*/jour/*542.182*/.date)),format.raw/*542.187*/("""\" /></td>""")))})),format.raw/*542.198*/(""""+
					""""),_display_(Seq[Any](/*543.8*/for(horaire <- jour.horaires) yield /*543.37*/ {_display_(Seq[Any](format.raw/*543.39*/(""""+	                		
					"<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*544.86*/horaire/*544.93*/.id)),format.raw/*544.96*/("""\" type=\"checkbox\" class=\"horaire checkbox\" value=\""""),_display_(Seq[Any](/*544.153*/horaire/*544.160*/.debut)),format.raw/*544.166*/(""" - """),_display_(Seq[Any](/*544.170*/horaire/*544.177*/.fin)),format.raw/*544.181*/("""\" /></td>"+			                
					"""")))})),format.raw/*545.8*/(""""+                	                
					"""")))})),format.raw/*546.8*/("""" +
					"</tr>")
				$('#champ').attr('value', '')
				$('.titres').attr('style','');
				refreshHoverable();
						
			"""),format.raw("""}"""),format.raw/*552.5*/("""               
		"""),format.raw("""}"""),format.raw/*553.4*/(""");
	"""),format.raw("""}"""),format.raw/*554.3*/("""

	$("#ajouter").live('click', function(e)"""),format.raw("""{"""),format.raw/*556.42*/("""
		

	    var vide = "";	    
	    var nom = $("#champ").attr("value");
	    if (nom != vide) """),format.raw("""{"""),format.raw/*561.24*/("""  
	    	$( "#dialog-question-securise" ).dialog( "open" );	
	    	
						
		"""),format.raw("""}"""),format.raw/*565.4*/("""

	    	    
	"""),format.raw("""}"""),format.raw/*568.3*/(""");

	$("#champ").keypress(function(e) """),format.raw("""{"""),format.raw/*570.36*/("""
		var code = (e.keyCode ? e.keyCode : e.which);
		if(code == 13) """),format.raw("""{"""),format.raw/*572.19*/(""" //Enter keycode
			var vide = "";	    
		    var nom = $.trim($("#champ").attr("value"));
		    if (nom != vide) """),format.raw("""{"""),format.raw/*575.25*/("""  
		    	$( "#dialog-question-securise" ).dialog( "open" );	
							
			"""),format.raw("""}"""),format.raw/*578.5*/("""
			$("#champ").focus();
 		"""),format.raw("""}"""),format.raw/*580.5*/("""

	"""),format.raw("""}"""),format.raw/*582.3*/(""");





















	/*Code sur l'édition*/

	$('.editPersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*606.48*/("""
		
	    if(!$(this).parents("tr").hasClass("editable"))  """),format.raw("""{"""),format.raw/*608.56*/("""	    	
	    	if ($(this).siblings("i").hasClass("icon-lock"))"""),format.raw("""{"""),format.raw/*609.56*/("""
	    		currentEditButton = $(this);
	    		$.ajax("""),format.raw("""{"""),format.raw/*611.16*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*613.13*/routes/*613.19*/.Application.getPass())),format.raw/*613.41*/("""",
					data: '"""),format.raw("""{"""),format.raw/*614.14*/(""" "idpers" : "'+$(this).parents("tr").attr("id")+'" """),format.raw("""}"""),format.raw/*614.66*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*616.32*/("""
						goodPass = data.pass;

						$( "#dialog-check-pwd" ).dialog( "open" );	
											  
					"""),format.raw("""}"""),format.raw/*621.7*/("""
			   """),format.raw("""}"""),format.raw/*622.8*/(""");			
				
			"""),format.raw("""}"""),format.raw/*624.5*/(""" else """),format.raw("""{"""),format.raw/*624.12*/("""
				edition($(this));
			"""),format.raw("""}"""),format.raw/*626.5*/("""
		  
	    """),format.raw("""}"""),format.raw/*628.7*/(""" else """),format.raw("""{"""),format.raw/*628.14*/("""
	      $(this).html("<i class=\"mesicones icon-pencil\"></i>");
	      $(this).parents("tr").removeClass("editable");
	      $(this).siblings('input[type="text"]').attr("readonly", "readonly");
	      $(this).parent().parent().parent().children("td").children('input[type="checkbox"]').attr("disabled","true"); 
	      $(this).parent().parent().parent().children("td").css("border", "none");
	      $(".hoverable").off();	      
	      $(this).parent().parent().parent().children(".checktd").attr("class", "checktd");
	      refreshHoverable();
	      editPersonne($(this).attr('id'), $(this).siblings("input").attr("value"));
	    """),format.raw("""}"""),format.raw/*638.7*/("""
	
	  
	"""),format.raw("""}"""),format.raw/*641.3*/(""")

	function edition(elem) """),format.raw("""{"""),format.raw/*643.26*/("""
		elem.html("<i class=\"mesicones icon-ok\"></i>");
		elem.parents("tr").addClass("editable");
		elem.siblings('input[type="text"]').removeAttr("readonly");
		elem.parent().parent().parent().children("td").children().removeAttr("disabled");
		elem.parent().parent().parent().children("td").css("border", "solid black 2px");
		$(".hoverable").off();		  
		elem.parent().parent().parent().children(".checktd").attr("class", "checktd hoverable");
		refreshHoverable();
	"""),format.raw("""}"""),format.raw/*652.3*/("""

	function editPersonne(personneId, personneNom)
	"""),format.raw("""{"""),format.raw/*655.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*656.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*658.11*/routes/*658.17*/.Application.updatePersonne(event.id))),format.raw/*658.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*659.12*/(""""id" : "' + personneId + '", "nom" : "' + personneNom + '""""),format.raw("""}"""),format.raw/*659.71*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*661.30*/("""
			  //alert("Participant edit\351");
			"""),format.raw("""}"""),format.raw/*663.5*/("""
	  """),format.raw("""}"""),format.raw/*664.5*/(""");
	"""),format.raw("""}"""),format.raw/*665.3*/("""

	$('.checktd').live('click', function(e) """),format.raw("""{"""),format.raw/*667.43*/("""
		if ($(this).children().prop("disabled") == false) """),format.raw("""{"""),format.raw/*668.54*/("""
			if ($(this).children().prop("checked") == false) """),format.raw("""{"""),format.raw/*669.54*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*670.36*/("""
					$(this).children().prop("checked", true);
				"""),format.raw("""}"""),format.raw/*672.6*/("""
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*674.5*/(""" else """),format.raw("""{"""),format.raw/*674.12*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*675.36*/("""
					$(this).children().prop("checked", false);
				"""),format.raw("""}"""),format.raw/*677.6*/("""        
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*679.5*/("""

			affichagePopulaire();

			//$('.populaires').html("");
			$('.titres td').each( function() """),format.raw("""{"""),format.raw/*684.38*/("""
				if ($(this).css('background-color') == color2) """),format.raw("""{"""),format.raw/*685.53*/("""
					$('.populaires').append($(this).html());
				"""),format.raw("""}"""),format.raw/*687.6*/("""				
			"""),format.raw("""}"""),format.raw/*688.5*/(""")			
		"""),format.raw("""}"""),format.raw/*689.4*/("""
	"""),format.raw("""}"""),format.raw/*690.3*/(""");

	function changeCheck(box) """),format.raw("""{"""),format.raw/*692.29*/("""   // gestion des clics sur les checkboxes
	   var idtime = box.attr('id');
	   var idParticipant = box.parent().parent().attr('id');   
	   
	   if (box.is(':checked'))"""),format.raw("""{"""),format.raw/*696.29*/("""	 //Action de valider une horaire  		
	       		box.parent().css("background-color", "#66CC99")//vert
		   		if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*698.57*/("""
		            var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
		       	    requeteAjaxHeure(idtime, idParticipant);
			    """),format.raw("""}"""),format.raw/*702.9*/("""
	       		if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*703.57*/("""	
	    	   	    var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
				    requeteAjaxJour(idtime, idParticipant);
			   """),format.raw("""}"""),format.raw/*707.8*/("""
	   """),format.raw("""}"""),format.raw/*708.6*/(""" else """),format.raw("""{"""),format.raw/*708.13*/(""" //Action de dévalider une horaires
	     
		    box.parent().css("background-color", color3) //
		    if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*711.56*/("""
			    var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxHeure(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*715.8*/("""
		    if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*716.53*/("""
		        var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxJour(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*720.8*/("""
	   """),format.raw("""}"""),format.raw/*721.6*/("""
	"""),format.raw("""}"""),format.raw/*722.3*/("""

	function requeteAjaxJour(idtime, idParticipant) // ajoute la date au participant
	"""),format.raw("""{"""),format.raw/*725.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*726.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*728.11*/routes/*728.17*/.Application.checkBoxJour(event.id))),format.raw/*728.52*/("""",
			data: '"""),format.raw("""{"""),format.raw/*729.12*/(""""idjour" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*729.80*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*731.30*/("""
			  //alert("Jour edit\351");
			"""),format.raw("""}"""),format.raw/*733.5*/("""
	   """),format.raw("""}"""),format.raw/*734.6*/(""");
	"""),format.raw("""}"""),format.raw/*735.3*/("""

	function requeteAjaxHeure(idtime, idParticipant) // ajoute l'heure au participant
	"""),format.raw("""{"""),format.raw/*738.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*739.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*741.11*/routes/*741.17*/.Application.checkBoxHoraire(event.id))),format.raw/*741.55*/("""",
			data: '"""),format.raw("""{"""),format.raw/*742.12*/(""""idhoraire" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*742.83*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*744.30*/("""
			  //alert("Horaire edit\351");
			"""),format.raw("""}"""),format.raw/*746.5*/("""
	   """),format.raw("""}"""),format.raw/*747.6*/(""");
	"""),format.raw("""}"""),format.raw/*748.3*/("""


























	/*Code sur la suppression*/

	$('.deletePersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*777.50*/("""    
	    $(this).parent().parent().parent().remove();
	    
	    
	    deletePersonne($(this).attr('id'));
	    if($('td[class="infoPersonne"]').html() == null) """),format.raw("""{"""),format.raw/*782.56*/("""
	    	$('.titres').attr('style','display:none');
	    """),format.raw("""}"""),format.raw/*784.7*/("""
	    $('#compte').children('td[id!=""]').each(function(i) """),format.raw("""{"""),format.raw/*785.60*/("""$(this).html("0")"""),format.raw("""}"""),format.raw/*785.78*/(""");

	    refreshCount();
	    
	"""),format.raw("""}"""),format.raw/*789.3*/(""")

	function deletePersonne(persId)
	"""),format.raw("""{"""),format.raw/*792.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*793.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*795.11*/routes/*795.17*/.Application.deleteParticipant(event.id))),format.raw/*795.57*/("""",
			data: '"""),format.raw("""{"""),format.raw/*796.12*/(""""id" : "' + persId + '""""),format.raw("""}"""),format.raw/*796.36*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*798.30*/("""
			  //alert("Participant supprim\351");
			"""),format.raw("""}"""),format.raw/*800.5*/("""
	  """),format.raw("""}"""),format.raw/*801.5*/(""");
	"""),format.raw("""}"""),format.raw/*802.3*/("""


















	/*Code sur les participants obligatoires*/
	$(function()"""),format.raw("""{"""),format.raw/*822.15*/("""
		refreshObligatoire(); 
		affichagePopulaire();
		
	"""),format.raw("""}"""),format.raw/*826.3*/(""")	

	$(".obligatoirecb").live("click", function() """),format.raw("""{"""),format.raw/*828.48*/(""" //click sur la checkbox "obligatoire" : mise à jour des classes sur la ligne, ajout de la propriété obligatoire dans la bdd
			
			var idParticipant = $(this).parent().parent().parent().attr("id");
			if ($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*831.42*/("""
				$(this).html("Facultatif");
				$(this).attr("class", "obligatoirecb btn");
			"""),format.raw("""}"""),format.raw/*834.5*/(""" else """),format.raw("""{"""),format.raw/*834.12*/("""
				$(this).html("Obligatoire");
				$(this).attr("class", "obligatoirecb btn btn-inverse");
			"""),format.raw("""}"""),format.raw/*837.5*/("""
			$.ajax("""),format.raw("""{"""),format.raw/*838.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*840.12*/routes/*840.18*/.Application.changeObligatoire(event.id))),format.raw/*840.58*/("""",
				data: '"""),format.raw("""{"""),format.raw/*841.13*/(""""idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*841.52*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*843.31*/("""
				  affichagePopulaire();
				"""),format.raw("""}"""),format.raw/*845.6*/("""
	   		"""),format.raw("""}"""),format.raw/*846.8*/(""");
	   		refreshObligatoire();

		"""),format.raw("""}"""),format.raw/*849.4*/(""")

	function checkobligatoire(idtime, type) """),format.raw("""{"""),format.raw/*851.43*/("""//fonction qui renvoie true si tous les participants obligatoires sont présents.
		//alert(idtime);
		var ret = true;
		//alert("type :"+type + " " + idtime)
		$('.obligatoire.'+type+'[id="'+idtime+'"]').each(function() """),format.raw("""{"""),format.raw/*855.64*/("""			
			if(!($(this).is(":checked"))) """),format.raw("""{"""),format.raw/*856.35*/("""
				//alert("id:"+$(this).attr("id"));
				ret = false;
			"""),format.raw("""}"""),format.raw/*859.5*/("""
		"""),format.raw("""}"""),format.raw/*860.4*/(""")
		return ret;
	"""),format.raw("""}"""),format.raw/*862.3*/("""

	function refreshObligatoire() """),format.raw("""{"""),format.raw/*864.33*/(""" // met à jour les classes "obligatoire" sur les bonnes lignes de participants
		$(".checktd").removeClass("obligatoire");
		$(".checkbox").removeClass("obligatoire");
		$(".obligatoirecb").each(function () """),format.raw("""{"""),format.raw/*867.41*/("""
			//alert("test");
			//alert($(this).parent().parent().siblings(".checktd").html());
			if($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*870.41*/("""					
				$(this).parent().parent().siblings(".checktd").addClass("obligatoire");
				$(this).parent().parent().siblings(".checktd").children().addClass("obligatoire");
			"""),format.raw("""}"""),format.raw/*873.5*/("""

		"""),format.raw("""}"""),format.raw/*875.4*/(""")
	"""),format.raw("""}"""),format.raw/*876.3*/("""








	
	
	

	

	

	

	

	


	
	/*Code d'affichage des dates populaires*/
	function affichagePopulaire() """),format.raw("""{"""),format.raw/*902.33*/("""
		var max = 0;
		$("#compte").children(".horaire, .jour").each( function() """),format.raw("""{"""),format.raw/*904.62*/(""" // récupération de la valeur maximale dans les comptes
			$(this).css("background-color", color1) 
			$('.titres').children().css("background-color",color1);
			//$('.footer').html("");
			if (checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*908.70*/("""			
				if ($(this).html() > max) """),format.raw("""{"""),format.raw/*909.32*/("""			
					max = $(this).html();
				"""),format.raw("""}"""),format.raw/*911.6*/("""
			"""),format.raw("""}"""),format.raw/*912.5*/("""		
		"""),format.raw("""}"""),format.raw/*913.4*/(""")
		$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*914.45*/("""
			
			if ($(this).html() == max && $(this).html() != 0 && checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*916.118*/("""			
				$(this).css("background-color", color2);
				//alert("classe : "+$(this).attr("class")+" id : "+$(this).attr("id"));
				$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", color2);
				if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*920.45*/("""
					var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
					$("td:contains('"+day+"')").css("background-color", color2);
					
				"""),format.raw("""}"""),format.raw/*924.6*/("""
			"""),format.raw("""}"""),format.raw/*925.5*/("""
		"""),format.raw("""}"""),format.raw/*926.4*/(""")
	"""),format.raw("""}"""),format.raw/*927.3*/("""
	</script>

""")))})),format.raw/*930.2*/("""
"""))}
    }
    
    def render(event:Evenement,adm:Integer) = apply(event,adm)
    
    def f:((Evenement,Integer) => play.api.templates.Html) = (event,adm) => apply(event,adm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 23 09:42:00 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/editForm.scala.html
                    HASH: 89dede04cb7da865aba367e64eee133408707fda
                    MATRIX: 769->1|886->54|918->78|1002->33|1030->52|1058->132|1097->137|1132->164|1171->166|1234->193|1248->198|1276->204|1361->253|1375->258|1403->264|1473->298|1487->303|1518->312|1560->318|1613->362|1653->364|1704->378|1719->383|1748->389|1783->391|1827->400|1862->426|1902->428|1958->448|1972->453|2005->464|2050->478|2093->486|2114->498|2154->500|2226->536|2241->542|2297->576|2358->606|2992->1205|3032->1229|3072->1231|3132->1255|3145->1259|3170->1262|3231->1287|3244->1291|3282->1307|3324->1313|3337->1317|3364->1322|3452->1379|3581->1473|3621->1497|3661->1499|3706->1509|3744->1538|3783->1539|3853->1578|3900->1589|3945->1618|3985->1620|4041->1640|4057->1647|4082->1650|4128->1660|4141->1664|4166->1667|4221->1686|4237->1693|4265->1699|4305->1703|4321->1710|4347->1714|4395->1730|4461->1765|4532->1801|4586->1839|4626->1841|4679->1858|4699->1869|4725->1873|4768->1880|4788->1891|4813->1894|4882->1928|4961->1998|5001->2000|5044->2008|5075->2030|5114->2031|5196->2082|5239->2090|5275->2117|5314->2118|5428->2215|5441->2220|5480->2221|5596->2306|5686->2360|5706->2371|5732->2375|5823->2430|5843->2441|5868->2444|6013->2553|6033->2564|6058->2567|6195->2673|6248->2691|6288->2715|6328->2717|6375->2728|6413->2757|6452->2758|6501->2771|6558->2819|6598->2821|6686->2873|6699->2877|6724->2880|6827->2946|6841->2950|6869->2955|6916->2984|6929->2989|6968->2990|7057->3043|7070->3047|7095->3050|7190->3108|7204->3112|7232->3117|7292->3145|7348->3169|7401->3186|7446->3215|7486->3217|7541->3236|7604->3290|7644->3292|7732->3344|7748->3351|7773->3354|7879->3423|7896->3430|7925->3436|7966->3440|7983->3447|8010->3451|8057->3480|8070->3485|8109->3486|8198->3539|8214->3546|8239->3549|8336->3609|8353->3616|8382->3622|8423->3626|8440->3633|8467->3637|8527->3665|8576->3682|8650->3724|8700->3743|8794->3802|8837->3836|8876->3837|8930->3859|9005->3899|9045->3923|9085->3925|9129->3934|9167->3963|9206->3964|9276->3998|9289->4002|9314->4005|9383->4043|9434->4058|9479->4087|9519->4089|9597->4130|9614->4137|9640->4140|9726->4193|9763->4198|11210->5608|11226->5614|11286->5651|11382->5710|11398->5716|11462->5757|11732->5979|11778->5989|11804->5992|11863->6003|11965->6058|12015->6061|12105->6103|12265->6215|12335->6237|12448->6313|12463->6318|12496->6328|12548->6332|12637->6374|12692->6381|12785->6427|12846->6441|12904->6452|12957->6458|13096->6549|13185->6590|13344->6702|13399->6709|13564->6827|13614->6830|13710->6878|13807->6927|13910->6982|13977->7012|13993->7018|14047->7049|14110->7064|14192->7098|14310->7168|14409->7220|14461->7225|14514->7231|14564->7234|14660->7282|14741->7315|14904->7431|14959->7438|15128->7560|15178->7563|15259->7597|15353->7643|15403->7645|15482->7677|15532->7679|15596->7695|15647->7697|15702->7703|15755->7707|15806->7709|15857->7711|15932->7737|15983->7739|16063->7771|16114->7773|16179->7789|16230->7791|16285->7797|16338->7801|16426->7842|16494->7863|16552->7874|16621->7896|16671->7899|16775->7955|16965->8097|17078->8162|17191->8228|17242->8232|17334->8276|17419->8314|17572->8420|17665->8465|17766->8519|17861->8566|17979->8636|18183->8792|18238->8799|18451->8964|18504->8970|18585->9003|18714->9084|18792->9114|18895->9170|18975->9202|19067->9246|19177->9309|19232->9316|19337->9374|19389->9379|19440->9383|19493->9389|19572->9420|19751->9551|19869->9621|20044->9749|20099->9757|20216->9826|20338->9900|20510->10025|20568->10036|20620->10041|20886->10259|21046->10371|21117->10394|21264->10494|21336->10518|21486->10621|21541->10629|21594->10635|21683->10676|21843->10788|21913->10810|22014->10863|22249->11051|22301->11056|22356->11064|22409->11070|22495->11108|22655->11220|22725->11242|22854->11323|22942->11364|22997->11371|23090->11417|23230->11510|23307->11539|23403->11588|23458->11596|23511->11602|23666->11710|23726->11722|23791->11750|23807->11756|23867->11793|23929->11807|24062->11892|24178->11960|24272->12006|24384->12071|25076->12727|25117->12751|25158->12753|25206->12765|25245->12794|25285->12795|25402->12874|25417->12878|25444->12881|25536->12935|25551->12939|25580->12944|25625->12955|25671->12965|25717->12994|25758->12996|25902->13103|25919->13110|25945->13113|26040->13170|26058->13177|26088->13183|26130->13187|26148->13194|26176->13198|26247->13237|26322->13280|26491->13402|26557->13421|26609->13426|26700->13469|26843->13564|26968->13642|27030->13657|27117->13696|27232->13763|27395->13878|27516->13952|27592->13981|27643->13985|27787->14081|27894->14140|28004->14202|28104->14254|28173->14286|28189->14292|28234->14314|28298->14330|28398->14382|28518->14454|28665->14554|28720->14562|28782->14577|28837->14584|28911->14611|28970->14623|29025->14630|29706->15264|29762->15273|29838->15301|30354->15770|30453->15822|30513->15834|30578->15862|30594->15868|30654->15905|30716->15919|30823->15978|30939->16046|31029->16089|31081->16094|31133->16099|31225->16143|31327->16197|31429->16251|31513->16287|31613->16340|31702->16382|31757->16389|31841->16425|31942->16479|32039->16529|32184->16626|32285->16679|32384->16731|32440->16740|32495->16748|32545->16751|32625->16783|32843->16953|33049->17111|33299->17314|33404->17371|33644->17564|33697->17570|33752->17577|33952->17729|34183->17913|34284->17966|34514->18149|34567->18155|34617->18158|34750->18244|34810->18256|34875->18284|34891->18290|34949->18325|35011->18339|35127->18407|35243->18475|35326->18511|35379->18517|35431->18522|35565->18609|35625->18621|35690->18649|35706->18655|35767->18693|35829->18707|35948->18778|36064->18846|36150->18885|36203->18891|36255->18896|36409->19002|36620->19165|36723->19221|36831->19281|36897->19299|36977->19332|37062->19370|37122->19382|37187->19410|37203->19416|37266->19456|37328->19470|37400->19494|37516->19562|37609->19608|37661->19613|37713->19618|37838->19695|37940->19750|38039->19801|38327->20041|38459->20126|38514->20133|38659->20231|38719->20243|38786->20273|38802->20279|38865->20319|38928->20334|39015->20373|39133->20443|39214->20477|39269->20485|39351->20520|39444->20565|39713->20786|39799->20824|39907->20885|39958->20889|40023->20907|40105->20941|40361->21149|40537->21277|40757->21450|40809->21455|40860->21459|41017->21568|41142->21645|41446->21901|41529->21936|41612->21972|41664->21977|41717->21983|41811->22029|41982->22151|42308->22429|42537->22611|42589->22616|42640->22620|42691->22624|42737->22638
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|39->10|39->10|39->10|42->13|42->13|42->13|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|45->16|45->16|45->16|46->17|46->17|46->17|47->18|49->20|49->20|49->20|50->21|50->21|50->21|51->22|67->38|67->38|67->38|68->39|68->39|68->39|68->39|68->39|68->39|68->39|68->39|68->39|69->40|72->43|72->43|72->43|73->44|73->44|73->44|75->46|76->47|76->47|76->47|77->48|77->48|77->48|77->48|77->48|77->48|77->48|77->48|77->48|77->48|77->48|77->48|78->49|79->50|83->54|83->54|83->54|84->55|84->55|84->55|84->55|84->55|84->55|85->56|85->56|85->56|86->57|86->57|86->57|88->59|89->60|89->60|89->60|91->62|91->62|91->62|93->64|95->66|95->66|95->66|96->67|96->67|96->67|97->68|97->68|97->68|98->69|100->71|100->71|100->71|101->72|101->72|101->72|102->73|102->73|102->73|103->74|103->74|103->74|103->74|103->74|103->74|104->75|104->75|104->75|105->76|105->76|105->76|105->76|105->76|105->76|106->77|108->79|109->80|109->80|109->80|110->81|110->81|110->81|111->82|111->82|111->82|111->82|111->82|111->82|111->82|111->82|111->82|112->83|112->83|112->83|113->84|113->84|113->84|113->84|113->84|113->84|113->84|113->84|113->84|114->85|115->86|116->87|118->89|122->93|122->93|122->93|122->93|124->95|124->95|124->95|125->96|125->96|125->96|126->97|126->97|126->97|127->98|128->99|128->99|128->99|129->100|129->100|129->100|130->101|131->102|192->163|192->163|192->163|193->164|193->164|193->164|205->176|207->178|207->178|207->178|209->180|210->181|212->183|217->188|218->189|221->192|221->192|221->192|221->192|223->194|223->194|225->196|227->198|230->201|232->203|266->237|268->239|271->242|271->242|274->245|275->246|277->248|279->250|282->253|284->255|284->255|284->255|285->256|285->256|287->258|289->260|290->261|291->262|292->263|295->266|297->268|301->272|301->272|305->276|306->277|309->280|310->281|310->281|310->281|310->281|310->281|310->281|310->281|310->281|310->281|310->281|310->281|310->281|310->281|310->281|310->281|310->281|310->281|310->281|313->284|315->286|317->288|319->290|320->291|344->315|348->319|349->320|351->322|352->323|354->325|356->327|361->332|363->334|366->337|368->339|369->340|372->343|372->343|375->346|376->347|378->349|380->351|382->353|384->355|386->357|387->358|389->360|389->360|391->362|392->363|393->364|395->366|399->370|400->371|403->374|406->377|408->379|410->381|413->384|416->387|418->389|419->390|456->427|461->432|462->433|465->436|466->437|469->440|470->441|472->443|475->446|480->451|481->452|484->455|489->460|490->461|491->462|493->464|495->466|500->471|501->472|504->475|506->477|506->477|508->479|512->483|514->485|516->487|517->488|519->490|551->522|552->523|554->525|554->525|554->525|555->526|555->526|557->528|559->530|561->532|570->541|570->541|570->541|571->542|571->542|571->542|571->542|571->542|571->542|571->542|571->542|571->542|571->542|572->543|572->543|572->543|573->544|573->544|573->544|573->544|573->544|573->544|573->544|573->544|573->544|574->545|575->546|581->552|582->553|583->554|585->556|590->561|594->565|597->568|599->570|601->572|604->575|607->578|609->580|611->582|635->606|637->608|638->609|640->611|642->613|642->613|642->613|643->614|643->614|645->616|650->621|651->622|653->624|653->624|655->626|657->628|657->628|667->638|670->641|672->643|681->652|684->655|685->656|687->658|687->658|687->658|688->659|688->659|690->661|692->663|693->664|694->665|696->667|697->668|698->669|699->670|701->672|703->674|703->674|704->675|706->677|708->679|713->684|714->685|716->687|717->688|718->689|719->690|721->692|725->696|727->698|731->702|732->703|736->707|737->708|737->708|740->711|744->715|745->716|749->720|750->721|751->722|754->725|755->726|757->728|757->728|757->728|758->729|758->729|760->731|762->733|763->734|764->735|767->738|768->739|770->741|770->741|770->741|771->742|771->742|773->744|775->746|776->747|777->748|806->777|811->782|813->784|814->785|814->785|818->789|821->792|822->793|824->795|824->795|824->795|825->796|825->796|827->798|829->800|830->801|831->802|851->822|855->826|857->828|860->831|863->834|863->834|866->837|867->838|869->840|869->840|869->840|870->841|870->841|872->843|874->845|875->846|878->849|880->851|884->855|885->856|888->859|889->860|891->862|893->864|896->867|899->870|902->873|904->875|905->876|931->902|933->904|937->908|938->909|940->911|941->912|942->913|943->914|945->916|949->920|953->924|954->925|955->926|956->927|959->930
                    -- GENERATED --
                */
            