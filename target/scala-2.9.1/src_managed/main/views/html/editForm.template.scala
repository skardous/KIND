
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


	Ajouter un participant :		  
	<input id="champ" type="text" value="">&nbsp;<a id="ajouter" class="btn">Ajouter</a><br>

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
				"""),_display_(Seq[Any](/*40.6*/for(jour <- event.jours) yield /*40.30*/ {_display_(Seq[Any](format.raw/*40.32*/("""  					  
					<td id=""""),_display_(Seq[Any](/*41.15*/jour/*41.19*/.id)),format.raw/*41.22*/("""" class="jour" colspan=""""),_display_(Seq[Any](/*41.47*/jour/*41.51*/.horaires.size())),format.raw/*41.67*/(""""><b>"""),_display_(Seq[Any](/*41.73*/jour/*41.77*/.date)),format.raw/*41.82*/("""</b></td>	                        	                
				""")))})),format.raw/*42.6*/("""
			</tr>
			<tr class="titres" style="display:none"><td style="visibility:hidden"></td>
				"""),_display_(Seq[Any](/*45.6*/for(jour <- event.jours) yield /*45.30*/ {_display_(Seq[Any](format.raw/*45.32*/("""  
				  """),_display_(Seq[Any](/*46.8*/if(jour.horaires.size() == 0)/*46.37*/{_display_(Seq[Any](format.raw/*46.38*/("""
				    <td class="jour"></td>
				  """)))})),format.raw/*48.8*/("""
				     """),_display_(Seq[Any](/*49.11*/for(horaire <- jour.horaires) yield /*49.40*/ {_display_(Seq[Any](format.raw/*49.42*/("""
				    	 <td id=""""),_display_(Seq[Any](/*50.20*/horaire/*50.27*/.id)),format.raw/*50.30*/("""" dayid=""""),_display_(Seq[Any](/*50.40*/jour/*50.44*/.id)),format.raw/*50.47*/("""" class="horaire">"""),_display_(Seq[Any](/*50.66*/horaire/*50.73*/.debut)),format.raw/*50.79*/(""" - """),_display_(Seq[Any](/*50.83*/horaire/*50.90*/.fin)),format.raw/*50.94*/("""</td>
				     """)))})),format.raw/*51.11*/("""            	                
				""")))})),format.raw/*52.6*/("""
			</tr>
			              
			
			"""),_display_(Seq[Any](/*56.5*/for(participant <- event.participants) yield /*56.43*/ {_display_(Seq[Any](format.raw/*56.45*/("""
				<tr title=""""),_display_(Seq[Any](/*57.17*/participant/*57.28*/.nom)),format.raw/*57.32*/("""" id=""""),_display_(Seq[Any](/*57.39*/participant/*57.50*/.id)),format.raw/*57.53*/(""""><td class="infoPersonne">
					"""),_display_(Seq[Any](/*58.7*/form(routes.Application.updatePersonne(event.id), 'id->"formPersonne")/*58.77*/ {_display_(Seq[Any](format.raw/*58.79*/("""
						"""),_display_(Seq[Any](/*59.8*/if(participant.locked)/*59.30*/{_display_(Seq[Any](format.raw/*59.31*/("""
							<i class="mesicones icon-lock"></i>
						""")))})),format.raw/*61.8*/("""
						"""),_display_(Seq[Any](/*62.8*/if(participant.obligatoire)/*62.35*/{_display_(Seq[Any](format.raw/*62.36*/("""							
							<a id="obligatoire" class="obligatoirecb btn btn-inverse">Obligatoire</a>
						""")))}/*64.9*/else/*64.14*/{_display_(Seq[Any](format.raw/*64.15*/("""								
							<a id="obligatoire" class="obligatoirecb btn ">Facultatif</a>
						""")))})),format.raw/*66.8*/("""

						<input id="nom" size="10" type="text" value=""""),_display_(Seq[Any](/*68.53*/participant/*68.64*/.nom)),format.raw/*68.68*/("""" name="nom" readonly="readonly">							
						<a id=""""),_display_(Seq[Any](/*69.15*/participant/*69.26*/.id)),format.raw/*69.29*/("""" title="Editer le participant" class="editPersonne"><i class="mesicones icon-pencil"></i></a>
						<a id=""""),_display_(Seq[Any](/*70.15*/participant/*70.26*/.id)),format.raw/*70.29*/("""" title="Supprimer le participant" class="deletePersonne"> <i class="mesicones icon-trash"></i></a>
					""")))})),format.raw/*71.7*/("""</td>
					
					"""),_display_(Seq[Any](/*73.7*/for(jour <- event.jours) yield /*73.31*/ {_display_(Seq[Any](format.raw/*73.33*/("""
					    """),_display_(Seq[Any](/*74.11*/if(jour.horaires.size() == 0)/*74.40*/{_display_(Seq[Any](format.raw/*74.41*/("""
					      """),_display_(Seq[Any](/*75.13*/if(participant.inscriptionsJours.contains(jour))/*75.61*/ {_display_(Seq[Any](format.raw/*75.63*/("""
			                <td class="checktd"><input id=""""),_display_(Seq[Any](/*76.52*/jour/*76.56*/.id)),format.raw/*76.59*/("""" type="checkbox"  disabled checked class="jour checkbox" value=""""),_display_(Seq[Any](/*76.125*/jour/*76.129*/.date)),format.raw/*76.134*/("""" /></td>
			              """)))}/*77.20*/else/*77.25*/{_display_(Seq[Any](format.raw/*77.26*/("""
			                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*78.53*/jour/*78.57*/.id)),format.raw/*78.60*/("""" type="checkbox"  disabled class="jour checkbox" value=""""),_display_(Seq[Any](/*78.118*/jour/*78.122*/.date)),format.raw/*78.127*/("""" /></td>
			              """)))})),format.raw/*79.19*/("""
					       
					    """)))})),format.raw/*81.11*/("""
			            """),_display_(Seq[Any](/*82.17*/for(horaire <- jour.horaires) yield /*82.46*/ {_display_(Seq[Any](format.raw/*82.48*/("""
			              """),_display_(Seq[Any](/*83.19*/if(participant.inscriptionsHoraires.contains(horaire))/*83.73*/ {_display_(Seq[Any](format.raw/*83.75*/("""
			                <td class="checktd"><input id=""""),_display_(Seq[Any](/*84.52*/horaire/*84.59*/.id)),format.raw/*84.62*/("""" type="checkbox" disabled class="horaire checkbox"  checked value=""""),_display_(Seq[Any](/*84.131*/horaire/*84.138*/.debut)),format.raw/*84.144*/(""" - """),_display_(Seq[Any](/*84.148*/horaire/*84.155*/.fin)),format.raw/*84.159*/("""" /></td>
			              """)))}/*85.20*/else/*85.25*/{_display_(Seq[Any](format.raw/*85.26*/("""
			                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*86.53*/horaire/*86.60*/.id)),format.raw/*86.63*/("""" type="checkbox" disabled class="horaire checkbox" value=""""),_display_(Seq[Any](/*86.123*/horaire/*86.130*/.debut)),format.raw/*86.136*/(""" - """),_display_(Seq[Any](/*86.140*/horaire/*86.147*/.fin)),format.raw/*86.151*/("""" /></td>
			              """)))})),format.raw/*87.19*/("""
			            """)))})),format.raw/*88.17*/("""            	                
			        """)))})),format.raw/*89.13*/("""				
				</tr>
			""")))})),format.raw/*91.5*/("""
		</tbody>
		<tfoot>
		<tr id="compte" class="titres"
		 """),_display_(Seq[Any](/*95.5*/if(event.participants.size() == 0)/*95.39*/{_display_(Seq[Any](format.raw/*95.40*/(""" style="display:none"""")))})),format.raw/*95.62*/(""">
			<td id=""><b>Compte: </b></td>
			"""),_display_(Seq[Any](/*97.5*/for(jour <- event.jours) yield /*97.29*/ {_display_(Seq[Any](format.raw/*97.31*/("""
			    """),_display_(Seq[Any](/*98.9*/if(jour.horaires.size() == 0)/*98.38*/{_display_(Seq[Any](format.raw/*98.39*/("""		     
	                <td id=""""),_display_(Seq[Any](/*99.27*/jour/*99.31*/.id)),format.raw/*99.34*/("""" class="jour">0</td>	       
			    """)))})),format.raw/*100.9*/("""
	            """),_display_(Seq[Any](/*101.15*/for(horaire <- jour.horaires) yield /*101.44*/ {_display_(Seq[Any](format.raw/*101.46*/("""              
	                <td id=""""),_display_(Seq[Any](/*102.27*/horaire/*102.34*/.id)),format.raw/*102.37*/("""" class="horaire">0</td>              
	            """)))})),format.raw/*103.15*/("""
			""")))})),format.raw/*104.5*/("""
		</tr>
		
		
			<!--<tr>
				<td> Date(s) populaire(s) :</td>
				<td colspan="0" class="footer"></td>
			</tr>-->
		</tfoot>

		<!--<div class="populaires"></div>-->


		
	</table>
	
	
	

	

	


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

	<!--<script type="text/javascript" src=""""),_display_(Seq[Any](/*164.43*/routes/*164.49*/.Assets.at("javascripts/sendMail.js"))),format.raw/*164.86*/(""""></script>  -->
	<!--<script type="text/javascript" src=""""),_display_(Seq[Any](/*165.43*/routes/*165.49*/.Assets.at("javascripts/editPersonne.js"))),format.raw/*165.90*/(""""></script> -->

	<script type="text/javascript" charset="utf-8">
	
	var color1 = "#FFFF99";
	var color2 = "gold";
	var color3 = "steelblue";
	var mdp = "";


	/*Code concernant l'interface administrateur*/

	$(function()"""),format.raw("""{"""),format.raw/*177.15*/("""

		if (""""),_display_(Seq[Any](/*179.9*/adm)),format.raw/*179.12*/("""" == "1") """),format.raw("""{"""),format.raw/*179.23*/("""
			$( "#dialog-check-pwd-adm" ).dialog( "open" );	
		"""),format.raw("""}"""),format.raw/*181.4*/("""
	"""),format.raw("""}"""),format.raw/*182.3*/(""");

	$( "#dialog-check-pwd-adm" ).dialog("""),format.raw("""{"""),format.raw/*184.39*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*189.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*190.22*/("""				
								
				pass = $("#password-check-adm").val();	
				if (pass == """"),_display_(Seq[Any](/*193.19*/event/*193.24*/.passAdmin)),format.raw/*193.34*/("""") """),format.raw("""{"""),format.raw/*193.38*/("""
				  	$( this ).dialog( "close" );
				"""),format.raw("""}"""),format.raw/*195.6*/(""" else """),format.raw("""{"""),format.raw/*195.13*/("""
				  	alert("mot de passe incorrect");
				"""),format.raw("""}"""),format.raw/*197.6*/("""				
				
			"""),format.raw("""}"""),format.raw/*199.5*/("""

					
		"""),format.raw("""}"""),format.raw/*202.4*/("""
		
	"""),format.raw("""}"""),format.raw/*204.3*/(""");































	/*Code concernant les mails et l'envoi*/

	$(function()"""),format.raw("""{"""),format.raw/*238.15*/("""

		if (bonmail($("#mailsArea").val())) """),format.raw("""{"""),format.raw/*240.40*/("""
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
		"""),format.raw("""}"""),format.raw/*243.4*/(""" else """),format.raw("""{"""),format.raw/*243.11*/("""
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
		"""),format.raw("""}"""),format.raw/*246.4*/("""
	"""),format.raw("""}"""),format.raw/*247.3*/(""");

	$('#envoiLien').live('click', function(e) """),format.raw("""{"""),format.raw/*249.45*/("""

		if ($(this).attr("disabled") != "disabled") """),format.raw("""{"""),format.raw/*251.48*/("""
			var mailsList = $("#mailsArea").val();

			$.ajax("""),format.raw("""{"""),format.raw/*254.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*256.12*/routes/*256.18*/.Application.sendMail(event.id))),format.raw/*256.49*/("""",
				data: '"""),format.raw("""{"""),format.raw/*257.13*/(""""mailslist" : "' + mailsList + '""""),format.raw("""}"""),format.raw/*257.47*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*259.31*/("""
					alert("Mail(s) envoye(s) a "+mailsList);
				"""),format.raw("""}"""),format.raw/*261.6*/("""
			"""),format.raw("""}"""),format.raw/*262.5*/(""");
		"""),format.raw("""}"""),format.raw/*263.4*/("""
	"""),format.raw("""}"""),format.raw/*264.3*/(""");


	$("#mailsArea").live("keyup", function() """),format.raw("""{"""),format.raw/*267.44*/("""

		if (bonmail($(this).val())) """),format.raw("""{"""),format.raw/*269.32*/("""
			
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
		"""),format.raw("""}"""),format.raw/*273.4*/(""" else """),format.raw("""{"""),format.raw/*273.11*/("""
			
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
		"""),format.raw("""}"""),format.raw/*277.4*/("""
	"""),format.raw("""}"""),format.raw/*278.3*/(""")
	
	function bonmail(mailtest)
	"""),format.raw("""{"""),format.raw/*281.3*/("""
		var reg = new RegExp('^([a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*282.46*/("""1"""),format.raw("""}"""),format.raw/*282.48*/("""[a-z0-9]+)*@[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*282.80*/("""1"""),format.raw("""}"""),format.raw/*282.82*/("""[a-z0-9]+)*[\.]"""),format.raw("""{"""),format.raw/*282.98*/("""1"""),format.raw("""}"""),format.raw/*282.100*/("""[a-z]"""),format.raw("""{"""),format.raw/*282.106*/("""2,6"""),format.raw("""}"""),format.raw/*282.110*/(""")"""),format.raw("""{"""),format.raw/*282.112*/("""1"""),format.raw("""}"""),format.raw/*282.114*/("""(\,( )*[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*282.140*/("""1"""),format.raw("""}"""),format.raw/*282.142*/("""[a-z0-9]+)*@[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*282.174*/("""1"""),format.raw("""}"""),format.raw/*282.176*/("""[a-z0-9]+)*[\.]"""),format.raw("""{"""),format.raw/*282.192*/("""1"""),format.raw("""}"""),format.raw/*282.194*/("""[a-z]"""),format.raw("""{"""),format.raw/*282.200*/("""2,6"""),format.raw("""}"""),format.raw/*282.204*/(""")*$', 'i');

		if(reg.test(mailtest))
		"""),format.raw("""{"""),format.raw/*285.4*/("""
			return(true);
		"""),format.raw("""}"""),format.raw/*287.4*/("""
		else
		"""),format.raw("""{"""),format.raw/*289.4*/("""
			return(false);
		"""),format.raw("""}"""),format.raw/*291.4*/("""
	"""),format.raw("""}"""),format.raw/*292.3*/("""





















	/*Code de style*/

	$(function()"""),format.raw("""{"""),format.raw/*316.15*/("""
		$("table.datesTable td").css("background-color", color3);
		$(".checkbox").attr("disabled", "true"); 

		$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*320.37*/(""" // coloration des box checkées
		  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*321.34*/("""
		  		$(this).parent().css("background-color", "#66CC99");
		  	"""),format.raw("""}"""),format.raw/*323.7*/("""
		"""),format.raw("""}"""),format.raw/*324.4*/(""");

		$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*326.41*/("""
			$('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*328.4*/(""");

		refreshCount(); // maj de la ligne de compteurs

		affichagePopulaire(); // maj des surbrillances
	"""),format.raw("""}"""),format.raw/*333.3*/(""")

	$("textarea").live('click', function(e) """),format.raw("""{"""),format.raw/*335.43*/("""
		$(this).html("");
		$(this).removeAttr("style");
	"""),format.raw("""}"""),format.raw/*338.3*/(""")

	function refreshHoverable() """),format.raw("""{"""),format.raw/*340.31*/(""" //coloration des cases quand on passe la souris dessus
		
		$(".hoverable").on("""),format.raw("""{"""),format.raw/*342.23*/("""

			mouseenter: function () """),format.raw("""{"""),format.raw/*344.29*/("""
				$(this).css("background-color", "lightgreen");
			"""),format.raw("""}"""),format.raw/*346.5*/(""", 

			mouseleave: function () """),format.raw("""{"""),format.raw/*348.29*/("""
				if ($(this).children().is(':checked'))"""),format.raw("""{"""),format.raw/*349.44*/("""	 
			    	$(this).css("background-color", "#66CC99");
			    """),format.raw("""}"""),format.raw/*351.9*/(""" else """),format.raw("""{"""),format.raw/*351.16*/("""
			    	$(this).css("background-color", color3);
			    """),format.raw("""}"""),format.raw/*353.9*/("""
			"""),format.raw("""}"""),format.raw/*354.5*/("""
		"""),format.raw("""}"""),format.raw/*355.4*/(""");

	"""),format.raw("""}"""),format.raw/*357.3*/("""

	

	function refreshCount() """),format.raw("""{"""),format.raw/*361.27*/(""" // met à jour l'affichage du compte des participants par horaire
		$('input[type="checkbox"].horaire.checkbox').each(function(i) """),format.raw("""{"""),format.raw/*362.66*/("""
			var iden = $(this).attr('id');
			
			if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*365.32*/("""
		    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			"""),format.raw("""}"""),format.raw/*368.5*/("""
			
		"""),format.raw("""}"""),format.raw/*370.4*/(""");
			
		$('input[type="checkbox"].jour.checkbox').each(function(i) """),format.raw("""{"""),format.raw/*372.63*/("""
			var iden = $(this).attr('id');			
				
			if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*375.32*/("""
		    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			"""),format.raw("""}"""),format.raw/*378.5*/("""			
			
		"""),format.raw("""}"""),format.raw/*380.4*/(""");
	"""),format.raw("""}"""),format.raw/*381.3*/("""

	























	/*Code sur les mots de passe*/

	$( "#dialog:ui-dialog" ).dialog( "destroy" ); 
		
	
	var pass = "";
	var goodPass = "";
	var currentEditButton;

	$( "#dialog-question-securise" ).dialog("""),format.raw("""{"""),format.raw/*416.43*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*421.13*/("""
			"Oui": function() """),format.raw("""{"""),format.raw/*422.23*/("""				    	
			    $( "#dialog-new-pwd" ).dialog( "open" );  
			    $( this ).dialog( "close" );
			"""),format.raw("""}"""),format.raw/*425.5*/(""",
			"Non": function() """),format.raw("""{"""),format.raw/*426.23*/("""
				addPersonne($.trim($("#champ").attr("value")), "false", "");
				$( this ).dialog( "close" );
			"""),format.raw("""}"""),format.raw/*429.5*/("""				
		"""),format.raw("""}"""),format.raw/*430.4*/("""
		
	"""),format.raw("""}"""),format.raw/*432.3*/(""");
			
	
	$( "#dialog-new-pwd" ).dialog("""),format.raw("""{"""),format.raw/*435.33*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*440.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*441.22*/("""
				var bValid = true;									

				if ( bValid ) """),format.raw("""{"""),format.raw/*444.20*/("""
					mdp = $("#password-new").val();
					addPersonne($.trim($("#champ").attr("value")), "true", mdp);
					$( "#password-new" ).attr("value", "");
					$( this ).dialog( "close" );
				"""),format.raw("""}"""),format.raw/*449.6*/("""
			"""),format.raw("""}"""),format.raw/*450.5*/("""				
		"""),format.raw("""}"""),format.raw/*451.4*/("""
		
	"""),format.raw("""}"""),format.raw/*453.3*/(""");

	$( "#dialog-check-pwd" ).dialog("""),format.raw("""{"""),format.raw/*455.35*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*460.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*461.22*/("""				
								
				pass = $("#password-check").val();	
				if (pass == goodPass) """),format.raw("""{"""),format.raw/*464.28*/("""
				  	edition(currentEditButton);
				"""),format.raw("""}"""),format.raw/*466.6*/(""" else """),format.raw("""{"""),format.raw/*466.13*/("""
				  	alert("mot de passe incorrect");
				"""),format.raw("""}"""),format.raw/*468.6*/("""				
				$( "#password-check" ).attr("value", "");
				$( this ).dialog( "close" );
				
			"""),format.raw("""}"""),format.raw/*472.5*/(""",

			"Annuler": function() """),format.raw("""{"""),format.raw/*474.27*/("""							
				$( this ).dialog( "close" );				
			"""),format.raw("""}"""),format.raw/*476.5*/("""				
		"""),format.raw("""}"""),format.raw/*477.4*/("""
		
	"""),format.raw("""}"""),format.raw/*479.3*/(""");

	


























	/*Code sur l'ajout*/

	function addPersonne(nomParticipant, locked, pwd)
	"""),format.raw("""{"""),format.raw/*511.3*/("""	
		$.ajax("""),format.raw("""{"""),format.raw/*512.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*514.11*/routes/*514.17*/.Application.addParticipant(event.id))),format.raw/*514.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*515.12*/(""""nom" : "' + nomParticipant + '", "locked" : "' + locked + '", "pwd" : "' + pwd + '""""),format.raw("""}"""),format.raw/*515.97*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*517.30*/("""
				var lock ="";		
				if(locked == "true")"""),format.raw("""{"""),format.raw/*519.26*/("""
					lock = "<i class=\"mesicones icon-lock\"></i>&nbsp;";
				"""),format.raw("""}"""),format.raw/*521.6*/("""  
				$("tbody").append("<tr title=\""+nomParticipant+"\" class=\"editable\" id=\""+data.idPersonne+"\"><td class=\"infoPersonne\">"+
					"<form id=\"formPersonne\">"+
					lock+
					"<a id=\"obligatoire\" class=\"obligatoirecb btn\">Facultatif</a>&nbsp;"+
					"<input id=\"nom\" type=\"text\" value=\""+nomParticipant+"\" name=\"nom\">&nbsp;"+	
					"<a id=\""+data.idPersonne+"\" title=\"editer le participant\" class=\"editPersonne\"><i class=\"mesicones icon-ok\"></i></a>"+
					"<a id=\""+data.idPersonne+"\" title=\"supprimer le participant\" class=\"deletePersonne\"> <i class=\"mesicones icon-trash\"></i</a>"+		  
					"</form></td>"+
					""""),_display_(Seq[Any](/*530.8*/for(jour <- event.jours) yield /*530.32*/ {_display_(Seq[Any](format.raw/*530.34*/(""""+  
					""""),_display_(Seq[Any](/*531.8*/if(jour.horaires.size() == 0)/*531.37*/{_display_(Seq[Any](format.raw/*531.38*/("""<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*531.117*/jour/*531.121*/.id)),format.raw/*531.124*/("""\" type=\"checkbox\" class=\"jour checkbox\" value=\""""),_display_(Seq[Any](/*531.178*/jour/*531.182*/.date)),format.raw/*531.187*/("""\" /></td>""")))})),format.raw/*531.198*/(""""+
					""""),_display_(Seq[Any](/*532.8*/for(horaire <- jour.horaires) yield /*532.37*/ {_display_(Seq[Any](format.raw/*532.39*/(""""+	                		
					"<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*533.86*/horaire/*533.93*/.id)),format.raw/*533.96*/("""\" type=\"checkbox\" class=\"horaire checkbox\" value=\""""),_display_(Seq[Any](/*533.153*/horaire/*533.160*/.debut)),format.raw/*533.166*/(""" - """),_display_(Seq[Any](/*533.170*/horaire/*533.177*/.fin)),format.raw/*533.181*/("""\" /></td>"+			                
					"""")))})),format.raw/*534.8*/(""""+                	                
					"""")))})),format.raw/*535.8*/("""" +
					"</tr>")
				$('#champ').attr('value', '')
				$('.titres').attr('style','');
				refreshHoverable();
						
			"""),format.raw("""}"""),format.raw/*541.5*/("""               
		"""),format.raw("""}"""),format.raw/*542.4*/(""");
	"""),format.raw("""}"""),format.raw/*543.3*/("""

	$("#ajouter").live('click', function(e)"""),format.raw("""{"""),format.raw/*545.42*/("""
		

	    var vide = "";	    
	    var nom = $("#champ").attr("value");
	    if (nom != vide) """),format.raw("""{"""),format.raw/*550.24*/("""  
	    	$( "#dialog-question-securise" ).dialog( "open" );	
	    	
						
		"""),format.raw("""}"""),format.raw/*554.4*/("""

	    	    
	"""),format.raw("""}"""),format.raw/*557.3*/(""");

	$("#champ").keypress(function(e) """),format.raw("""{"""),format.raw/*559.36*/("""
		var code = (e.keyCode ? e.keyCode : e.which);
		if(code == 13) """),format.raw("""{"""),format.raw/*561.19*/(""" //Enter keycode
			var vide = "";	    
		    var nom = $.trim($("#champ").attr("value"));
		    if (nom != vide) """),format.raw("""{"""),format.raw/*564.25*/("""  
		    	$( "#dialog-question-securise" ).dialog( "open" );	
							
			"""),format.raw("""}"""),format.raw/*567.5*/("""
			$("#champ").focus();
 		"""),format.raw("""}"""),format.raw/*569.5*/("""

	"""),format.raw("""}"""),format.raw/*571.3*/(""");





















	/*Code sur l'édition*/

	$('.editPersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*595.48*/("""
		
	    if(!$(this).parents("tr").hasClass("editable"))  """),format.raw("""{"""),format.raw/*597.56*/("""	    	
	    	if ($(this).siblings("i").hasClass("icon-lock"))"""),format.raw("""{"""),format.raw/*598.56*/("""
	    		currentEditButton = $(this);
	    		$.ajax("""),format.raw("""{"""),format.raw/*600.16*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*602.13*/routes/*602.19*/.Application.getPass())),format.raw/*602.41*/("""",
					data: '"""),format.raw("""{"""),format.raw/*603.14*/(""" "idpers" : "'+$(this).parents("tr").attr("id")+'" """),format.raw("""}"""),format.raw/*603.66*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*605.32*/("""
						goodPass = data.pass;

						$( "#dialog-check-pwd" ).dialog( "open" );	
											  
					"""),format.raw("""}"""),format.raw/*610.7*/("""
			   """),format.raw("""}"""),format.raw/*611.8*/(""");			
				
			"""),format.raw("""}"""),format.raw/*613.5*/(""" else """),format.raw("""{"""),format.raw/*613.12*/("""
				edition($(this));
			"""),format.raw("""}"""),format.raw/*615.5*/("""
		  
	    """),format.raw("""}"""),format.raw/*617.7*/(""" else """),format.raw("""{"""),format.raw/*617.14*/("""
	      $(this).html("<i class=\"mesicones icon-pencil\"></i>");
	      $(this).parents("tr").removeClass("editable");
	      $(this).siblings('input[type="text"]').attr("readonly", "readonly");
	      $(this).parent().parent().parent().children("td").children('input[type="checkbox"]').attr("disabled","true"); 
	      $(this).parent().parent().parent().children("td").css("border", "none");
	      $(".hoverable").off();	      
	      $(this).parent().parent().parent().children(".checktd").attr("class", "checktd");
	      refreshHoverable();
	      editPersonne($(this).attr('id'), $(this).siblings("input").attr("value"));
	    """),format.raw("""}"""),format.raw/*627.7*/("""
	
	  
	"""),format.raw("""}"""),format.raw/*630.3*/(""")

	function edition(elem) """),format.raw("""{"""),format.raw/*632.26*/("""
		elem.html("<i class=\"mesicones icon-ok\"></i>");
		elem.parents("tr").addClass("editable");
		elem.siblings('input[type="text"]').removeAttr("readonly");
		elem.parent().parent().parent().children("td").children().removeAttr("disabled");
		elem.parent().parent().parent().children("td").css("border", "solid black 2px");
		$(".hoverable").off();		  
		elem.parent().parent().parent().children(".checktd").attr("class", "checktd hoverable");
		refreshHoverable();
	"""),format.raw("""}"""),format.raw/*641.3*/("""

	function editPersonne(personneId, personneNom)
	"""),format.raw("""{"""),format.raw/*644.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*645.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*647.11*/routes/*647.17*/.Application.updatePersonne(event.id))),format.raw/*647.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*648.12*/(""""id" : "' + personneId + '", "nom" : "' + personneNom + '""""),format.raw("""}"""),format.raw/*648.71*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*650.30*/("""
			  //alert("Participant edit\351");
			"""),format.raw("""}"""),format.raw/*652.5*/("""
	  """),format.raw("""}"""),format.raw/*653.5*/(""");
	"""),format.raw("""}"""),format.raw/*654.3*/("""

	$('.checktd').live('click', function(e) """),format.raw("""{"""),format.raw/*656.43*/("""
		if ($(this).children().prop("disabled") == false) """),format.raw("""{"""),format.raw/*657.54*/("""
			if ($(this).children().prop("checked") == false) """),format.raw("""{"""),format.raw/*658.54*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*659.36*/("""
					$(this).children().prop("checked", true);
				"""),format.raw("""}"""),format.raw/*661.6*/("""
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*663.5*/(""" else """),format.raw("""{"""),format.raw/*663.12*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*664.36*/("""
					$(this).children().prop("checked", false);
				"""),format.raw("""}"""),format.raw/*666.6*/("""        
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*668.5*/("""

			affichagePopulaire();

			//$('.populaires').html("");
			$('.titres td').each( function() """),format.raw("""{"""),format.raw/*673.38*/("""
				if ($(this).css('background-color') == color2) """),format.raw("""{"""),format.raw/*674.53*/("""
					$('.populaires').append($(this).html());
				"""),format.raw("""}"""),format.raw/*676.6*/("""				
			"""),format.raw("""}"""),format.raw/*677.5*/(""")			
		"""),format.raw("""}"""),format.raw/*678.4*/("""
	"""),format.raw("""}"""),format.raw/*679.3*/(""");

	function changeCheck(box) """),format.raw("""{"""),format.raw/*681.29*/("""   // gestion des clics sur les checkboxes
	   var idtime = box.attr('id');
	   var idParticipant = box.parent().parent().attr('id');   
	   
	   if (box.is(':checked'))"""),format.raw("""{"""),format.raw/*685.29*/("""	 //Action de valider une horaire  		
	       		box.parent().css("background-color", "#66CC99")//vert
		   		if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*687.57*/("""
		            var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
		       	    requeteAjaxHeure(idtime, idParticipant);
			    """),format.raw("""}"""),format.raw/*691.9*/("""
	       		if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*692.57*/("""	
	    	   	    var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
				    requeteAjaxJour(idtime, idParticipant);
			   """),format.raw("""}"""),format.raw/*696.8*/("""
	   """),format.raw("""}"""),format.raw/*697.6*/(""" else """),format.raw("""{"""),format.raw/*697.13*/(""" //Action de dévalider une horaires
	     
		    box.parent().css("background-color", color3) //
		    if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*700.56*/("""
			    var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxHeure(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*704.8*/("""
		    if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*705.53*/("""
		        var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxJour(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*709.8*/("""
	   """),format.raw("""}"""),format.raw/*710.6*/("""
	"""),format.raw("""}"""),format.raw/*711.3*/("""

	function requeteAjaxJour(idtime, idParticipant) // ajoute la date au participant
	"""),format.raw("""{"""),format.raw/*714.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*715.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*717.11*/routes/*717.17*/.Application.checkBoxJour(event.id))),format.raw/*717.52*/("""",
			data: '"""),format.raw("""{"""),format.raw/*718.12*/(""""idjour" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*718.80*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*720.30*/("""
			  //alert("Jour edit\351");
			"""),format.raw("""}"""),format.raw/*722.5*/("""
	   """),format.raw("""}"""),format.raw/*723.6*/(""");
	"""),format.raw("""}"""),format.raw/*724.3*/("""

	function requeteAjaxHeure(idtime, idParticipant) // ajoute l'heure au participant
	"""),format.raw("""{"""),format.raw/*727.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*728.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*730.11*/routes/*730.17*/.Application.checkBoxHoraire(event.id))),format.raw/*730.55*/("""",
			data: '"""),format.raw("""{"""),format.raw/*731.12*/(""""idhoraire" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*731.83*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*733.30*/("""
			  //alert("Horaire edit\351");
			"""),format.raw("""}"""),format.raw/*735.5*/("""
	   """),format.raw("""}"""),format.raw/*736.6*/(""");
	"""),format.raw("""}"""),format.raw/*737.3*/("""


























	/*Code sur la suppression*/

	$('.deletePersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*766.50*/("""    
	    $(this).parent().parent().parent().remove();
	    
	    
	    deletePersonne($(this).attr('id'));
	    if($('td[class="infoPersonne"]').html() == null) """),format.raw("""{"""),format.raw/*771.56*/("""
	    	$('.titres').attr('style','display:none');
	    """),format.raw("""}"""),format.raw/*773.7*/("""
	    $('#compte').children('td[id!=""]').each(function(i) """),format.raw("""{"""),format.raw/*774.60*/("""$(this).html("0")"""),format.raw("""}"""),format.raw/*774.78*/(""");

	    refreshCount();
	    
	"""),format.raw("""}"""),format.raw/*778.3*/(""")

	function deletePersonne(persId)
	"""),format.raw("""{"""),format.raw/*781.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*782.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*784.11*/routes/*784.17*/.Application.deleteParticipant(event.id))),format.raw/*784.57*/("""",
			data: '"""),format.raw("""{"""),format.raw/*785.12*/(""""id" : "' + persId + '""""),format.raw("""}"""),format.raw/*785.36*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*787.30*/("""
			  //alert("Participant supprim\351");
			"""),format.raw("""}"""),format.raw/*789.5*/("""
	  """),format.raw("""}"""),format.raw/*790.5*/(""");
	"""),format.raw("""}"""),format.raw/*791.3*/("""


















	/*Code sur les participants obligatoires*/
	$(function()"""),format.raw("""{"""),format.raw/*811.15*/("""
		refreshObligatoire(); 
		affichagePopulaire();
		
	"""),format.raw("""}"""),format.raw/*815.3*/(""")	

	$(".obligatoirecb").live("click", function() """),format.raw("""{"""),format.raw/*817.48*/(""" //click sur la checkbox "obligatoire" : mise à jour des classes sur la ligne, ajout de la propriété obligatoire dans la bdd
			
			var idParticipant = $(this).parent().parent().parent().attr("id");
			if ($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*820.42*/("""
				$(this).html("Facultatif");
				$(this).attr("class", "obligatoirecb btn");
			"""),format.raw("""}"""),format.raw/*823.5*/(""" else """),format.raw("""{"""),format.raw/*823.12*/("""
				$(this).html("Obligatoire");
				$(this).attr("class", "obligatoirecb btn btn-inverse");
			"""),format.raw("""}"""),format.raw/*826.5*/("""
			$.ajax("""),format.raw("""{"""),format.raw/*827.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*829.12*/routes/*829.18*/.Application.changeObligatoire(event.id))),format.raw/*829.58*/("""",
				data: '"""),format.raw("""{"""),format.raw/*830.13*/(""""idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*830.52*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*832.31*/("""
				  affichagePopulaire();
				"""),format.raw("""}"""),format.raw/*834.6*/("""
	   		"""),format.raw("""}"""),format.raw/*835.8*/(""");
	   		refreshObligatoire();

		"""),format.raw("""}"""),format.raw/*838.4*/(""")

	function checkobligatoire(idtime, type) """),format.raw("""{"""),format.raw/*840.43*/("""//fonction qui renvoie true si tous les participants obligatoires sont présents.
		//alert(idtime);
		var ret = true;
		//alert("type :"+type + " " + idtime)
		$('.obligatoire.'+type+'[id="'+idtime+'"]').each(function() """),format.raw("""{"""),format.raw/*844.64*/("""			
			if(!($(this).is(":checked"))) """),format.raw("""{"""),format.raw/*845.35*/("""
				//alert("id:"+$(this).attr("id"));
				ret = false;
			"""),format.raw("""}"""),format.raw/*848.5*/("""
		"""),format.raw("""}"""),format.raw/*849.4*/(""")
		return ret;
	"""),format.raw("""}"""),format.raw/*851.3*/("""

	function refreshObligatoire() """),format.raw("""{"""),format.raw/*853.33*/(""" // met à jour les classes "obligatoire" sur les bonnes lignes de participants
		$(".checktd").removeClass("obligatoire");
		$(".checkbox").removeClass("obligatoire");
		$(".obligatoirecb").each(function () """),format.raw("""{"""),format.raw/*856.41*/("""
			//alert("test");
			//alert($(this).parent().parent().siblings(".checktd").html());
			if($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*859.41*/("""					
				$(this).parent().parent().siblings(".checktd").addClass("obligatoire");
				$(this).parent().parent().siblings(".checktd").children().addClass("obligatoire");
			"""),format.raw("""}"""),format.raw/*862.5*/("""

		"""),format.raw("""}"""),format.raw/*864.4*/(""")
	"""),format.raw("""}"""),format.raw/*865.3*/("""








	
	
	

	

	

	

	

	


	
	/*Code d'affichage des dates populaires*/
	function affichagePopulaire() """),format.raw("""{"""),format.raw/*891.33*/("""
		var max = 0;
		$("#compte").children(".horaire, .jour").each( function() """),format.raw("""{"""),format.raw/*893.62*/(""" // récupération de la valeur maximale dans les comptes
			$(this).css("background-color", color1) 
			$('.titres').children().css("background-color",color1);
			//$('.footer').html("");
			if (checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*897.70*/("""			
				if ($(this).html() > max) """),format.raw("""{"""),format.raw/*898.32*/("""			
					max = $(this).html();
				"""),format.raw("""}"""),format.raw/*900.6*/("""
			"""),format.raw("""}"""),format.raw/*901.5*/("""		
		"""),format.raw("""}"""),format.raw/*902.4*/(""")
		$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*903.45*/("""
			
			if ($(this).html() == max && $(this).html() != 0 && checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*905.118*/("""			
				$(this).css("background-color", color2);
				//alert("classe : "+$(this).attr("class")+" id : "+$(this).attr("id"));
				$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", color2);
				if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*909.45*/("""
					var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
					$("td:contains('"+day+"')").css("background-color", color2);
					
				"""),format.raw("""}"""),format.raw/*913.6*/("""
			"""),format.raw("""}"""),format.raw/*914.5*/("""
		"""),format.raw("""}"""),format.raw/*915.4*/(""")
	"""),format.raw("""}"""),format.raw/*916.3*/("""
	</script>

""")))})),format.raw/*919.2*/("""
"""))}
    }
    
    def render(event:Evenement,adm:Integer) = apply(event,adm)
    
    def f:((Evenement,Integer) => play.api.templates.Html) = (event,adm) => apply(event,adm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 23 09:09:59 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/editForm.scala.html
                    HASH: eabee06f2f2fcb78780d6a2d0af13fd8fec7708d
                    MATRIX: 769->1|886->54|918->78|1002->33|1030->52|1058->132|1097->137|1132->164|1171->166|1234->193|1248->198|1276->204|1361->253|1375->258|1403->264|1473->298|1487->303|1518->312|1560->318|1613->362|1653->364|1704->378|1719->383|1748->389|1783->391|1827->400|1862->426|1902->428|1958->448|1972->453|2005->464|2050->478|2093->486|2114->498|2154->500|2226->536|2241->542|2297->576|2358->606|3111->1324|3151->1348|3191->1350|3251->1374|3264->1378|3289->1381|3350->1406|3363->1410|3401->1426|3443->1432|3456->1436|3483->1441|3571->1498|3700->1592|3740->1616|3780->1618|3825->1628|3863->1657|3902->1658|3972->1697|4019->1708|4064->1737|4104->1739|4160->1759|4176->1766|4201->1769|4247->1779|4260->1783|4285->1786|4340->1805|4356->1812|4384->1818|4424->1822|4440->1829|4466->1833|4514->1849|4580->1884|4651->1920|4705->1958|4745->1960|4798->1977|4818->1988|4844->1992|4887->1999|4907->2010|4932->2013|5001->2047|5080->2117|5120->2119|5163->2127|5194->2149|5233->2150|5315->2201|5358->2209|5394->2236|5433->2237|5547->2334|5560->2339|5599->2340|5715->2425|5805->2479|5825->2490|5851->2494|5942->2549|5962->2560|5987->2563|6132->2672|6152->2683|6177->2686|6314->2792|6367->2810|6407->2834|6447->2836|6494->2847|6532->2876|6571->2877|6620->2890|6677->2938|6717->2940|6805->2992|6818->2996|6843->2999|6946->3065|6960->3069|6988->3074|7035->3103|7048->3108|7087->3109|7176->3162|7189->3166|7214->3169|7309->3227|7323->3231|7351->3236|7411->3264|7467->3288|7520->3305|7565->3334|7605->3336|7660->3355|7723->3409|7763->3411|7851->3463|7867->3470|7892->3473|7998->3542|8015->3549|8044->3555|8085->3559|8102->3566|8129->3570|8176->3599|8189->3604|8228->3605|8317->3658|8333->3665|8358->3668|8455->3728|8472->3735|8501->3741|8542->3745|8559->3752|8586->3756|8646->3784|8695->3801|8769->3843|8819->3862|8913->3921|8956->3955|8995->3956|9049->3978|9124->4018|9164->4042|9204->4044|9248->4053|9286->4082|9325->4083|9395->4117|9408->4121|9433->4124|9503->4162|9555->4177|9601->4206|9642->4208|9720->4249|9737->4256|9763->4259|9849->4312|9886->4317|11232->5626|11248->5632|11308->5669|11404->5728|11420->5734|11484->5775|11754->5997|11800->6007|11826->6010|11885->6021|11987->6076|12037->6079|12127->6121|12287->6233|12357->6255|12470->6331|12485->6336|12518->6346|12570->6350|12659->6392|12714->6399|12807->6445|12868->6459|12926->6470|12979->6476|13118->6567|13207->6608|13366->6720|13421->6727|13586->6845|13636->6848|13732->6896|13829->6945|13932->7000|13999->7030|14015->7036|14069->7067|14132->7082|14214->7116|14332->7186|14431->7238|14483->7243|14536->7249|14586->7252|14682->7300|14763->7333|14926->7449|14981->7456|15150->7578|15200->7581|15281->7615|15375->7661|15425->7663|15504->7695|15554->7697|15618->7713|15669->7715|15724->7721|15777->7725|15828->7727|15879->7729|15954->7755|16005->7757|16085->7789|16136->7791|16201->7807|16252->7809|16307->7815|16360->7819|16448->7860|16516->7881|16574->7892|16643->7914|16693->7917|16797->7973|16987->8115|17100->8180|17213->8246|17264->8250|17356->8294|17441->8332|17594->8438|17687->8483|17788->8537|17869->8570|17998->8651|18076->8681|18179->8737|18259->8769|18351->8813|18461->8876|18516->8883|18621->8941|18673->8946|18724->8950|18777->8956|18856->8987|19035->9118|19153->9188|19328->9316|19383->9324|19500->9393|19622->9467|19794->9592|19852->9603|19904->9608|20168->9824|20328->9936|20399->9959|20546->10059|20618->10083|20768->10186|20823->10194|20876->10200|20965->10241|21125->10353|21195->10375|21296->10428|21531->10616|21583->10621|21638->10629|21691->10635|21777->10673|21937->10785|22007->10807|22136->10888|22224->10929|22279->10936|22372->10982|22512->11075|22589->11104|22685->11153|22740->11161|22793->11167|22948->11275|23008->11287|23073->11315|23089->11321|23149->11358|23211->11372|23344->11457|23460->11525|23554->11571|23666->11636|24358->12292|24399->12316|24440->12318|24488->12330|24527->12359|24567->12360|24684->12439|24699->12443|24726->12446|24818->12500|24833->12504|24862->12509|24907->12520|24953->12530|24999->12559|25040->12561|25184->12668|25201->12675|25227->12678|25322->12735|25340->12742|25370->12748|25412->12752|25430->12759|25458->12763|25529->12802|25604->12845|25773->12967|25839->12986|25891->12991|25982->13034|26125->13129|26250->13207|26312->13222|26399->13261|26514->13328|26677->13443|26798->13517|26874->13546|26925->13550|27069->13646|27176->13705|27286->13767|27386->13819|27455->13851|27471->13857|27516->13879|27580->13895|27680->13947|27800->14019|27947->14119|28002->14127|28064->14142|28119->14149|28193->14176|28252->14188|28307->14195|28988->14829|29044->14838|29120->14866|29636->15335|29735->15387|29795->15399|29860->15427|29876->15433|29936->15470|29998->15484|30105->15543|30221->15611|30311->15654|30363->15659|30415->15664|30507->15708|30609->15762|30711->15816|30795->15852|30895->15905|30984->15947|31039->15954|31123->15990|31224->16044|31321->16094|31466->16191|31567->16244|31666->16296|31722->16305|31777->16313|31827->16316|31907->16348|32125->16518|32331->16676|32581->16879|32686->16936|32926->17129|32979->17135|33034->17142|33234->17294|33465->17478|33566->17531|33796->17714|33849->17720|33899->17723|34032->17809|34092->17821|34157->17849|34173->17855|34231->17890|34293->17904|34409->17972|34525->18040|34608->18076|34661->18082|34713->18087|34847->18174|34907->18186|34972->18214|34988->18220|35049->18258|35111->18272|35230->18343|35346->18411|35432->18450|35485->18456|35537->18461|35691->18567|35902->18730|36005->18786|36113->18846|36179->18864|36259->18897|36344->18935|36404->18947|36469->18975|36485->18981|36548->19021|36610->19035|36682->19059|36798->19127|36891->19173|36943->19178|36995->19183|37120->19260|37222->19315|37321->19366|37609->19606|37741->19691|37796->19698|37941->19796|38001->19808|38068->19838|38084->19844|38147->19884|38210->19899|38297->19938|38415->20008|38496->20042|38551->20050|38633->20085|38726->20130|38995->20351|39081->20389|39189->20450|39240->20454|39305->20472|39387->20506|39643->20714|39819->20842|40039->21015|40091->21020|40142->21024|40299->21133|40424->21210|40728->21466|40811->21501|40894->21537|40946->21542|40999->21548|41093->21594|41264->21716|41590->21994|41819->22176|41871->22181|41922->22185|41973->22189|42019->22203
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|39->10|39->10|39->10|42->13|42->13|42->13|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|45->16|45->16|45->16|46->17|46->17|46->17|47->18|49->20|49->20|49->20|50->21|50->21|50->21|51->22|69->40|69->40|69->40|70->41|70->41|70->41|70->41|70->41|70->41|70->41|70->41|70->41|71->42|74->45|74->45|74->45|75->46|75->46|75->46|77->48|78->49|78->49|78->49|79->50|79->50|79->50|79->50|79->50|79->50|79->50|79->50|79->50|79->50|79->50|79->50|80->51|81->52|85->56|85->56|85->56|86->57|86->57|86->57|86->57|86->57|86->57|87->58|87->58|87->58|88->59|88->59|88->59|90->61|91->62|91->62|91->62|93->64|93->64|93->64|95->66|97->68|97->68|97->68|98->69|98->69|98->69|99->70|99->70|99->70|100->71|102->73|102->73|102->73|103->74|103->74|103->74|104->75|104->75|104->75|105->76|105->76|105->76|105->76|105->76|105->76|106->77|106->77|106->77|107->78|107->78|107->78|107->78|107->78|107->78|108->79|110->81|111->82|111->82|111->82|112->83|112->83|112->83|113->84|113->84|113->84|113->84|113->84|113->84|113->84|113->84|113->84|114->85|114->85|114->85|115->86|115->86|115->86|115->86|115->86|115->86|115->86|115->86|115->86|116->87|117->88|118->89|120->91|124->95|124->95|124->95|124->95|126->97|126->97|126->97|127->98|127->98|127->98|128->99|128->99|128->99|129->100|130->101|130->101|130->101|131->102|131->102|131->102|132->103|133->104|193->164|193->164|193->164|194->165|194->165|194->165|206->177|208->179|208->179|208->179|210->181|211->182|213->184|218->189|219->190|222->193|222->193|222->193|222->193|224->195|224->195|226->197|228->199|231->202|233->204|267->238|269->240|272->243|272->243|275->246|276->247|278->249|280->251|283->254|285->256|285->256|285->256|286->257|286->257|288->259|290->261|291->262|292->263|293->264|296->267|298->269|302->273|302->273|306->277|307->278|310->281|311->282|311->282|311->282|311->282|311->282|311->282|311->282|311->282|311->282|311->282|311->282|311->282|311->282|311->282|311->282|311->282|311->282|311->282|314->285|316->287|318->289|320->291|321->292|345->316|349->320|350->321|352->323|353->324|355->326|357->328|362->333|364->335|367->338|369->340|371->342|373->344|375->346|377->348|378->349|380->351|380->351|382->353|383->354|384->355|386->357|390->361|391->362|394->365|397->368|399->370|401->372|404->375|407->378|409->380|410->381|445->416|450->421|451->422|454->425|455->426|458->429|459->430|461->432|464->435|469->440|470->441|473->444|478->449|479->450|480->451|482->453|484->455|489->460|490->461|493->464|495->466|495->466|497->468|501->472|503->474|505->476|506->477|508->479|540->511|541->512|543->514|543->514|543->514|544->515|544->515|546->517|548->519|550->521|559->530|559->530|559->530|560->531|560->531|560->531|560->531|560->531|560->531|560->531|560->531|560->531|560->531|561->532|561->532|561->532|562->533|562->533|562->533|562->533|562->533|562->533|562->533|562->533|562->533|563->534|564->535|570->541|571->542|572->543|574->545|579->550|583->554|586->557|588->559|590->561|593->564|596->567|598->569|600->571|624->595|626->597|627->598|629->600|631->602|631->602|631->602|632->603|632->603|634->605|639->610|640->611|642->613|642->613|644->615|646->617|646->617|656->627|659->630|661->632|670->641|673->644|674->645|676->647|676->647|676->647|677->648|677->648|679->650|681->652|682->653|683->654|685->656|686->657|687->658|688->659|690->661|692->663|692->663|693->664|695->666|697->668|702->673|703->674|705->676|706->677|707->678|708->679|710->681|714->685|716->687|720->691|721->692|725->696|726->697|726->697|729->700|733->704|734->705|738->709|739->710|740->711|743->714|744->715|746->717|746->717|746->717|747->718|747->718|749->720|751->722|752->723|753->724|756->727|757->728|759->730|759->730|759->730|760->731|760->731|762->733|764->735|765->736|766->737|795->766|800->771|802->773|803->774|803->774|807->778|810->781|811->782|813->784|813->784|813->784|814->785|814->785|816->787|818->789|819->790|820->791|840->811|844->815|846->817|849->820|852->823|852->823|855->826|856->827|858->829|858->829|858->829|859->830|859->830|861->832|863->834|864->835|867->838|869->840|873->844|874->845|877->848|878->849|880->851|882->853|885->856|888->859|891->862|893->864|894->865|920->891|922->893|926->897|927->898|929->900|930->901|931->902|932->903|934->905|938->909|942->913|943->914|944->915|945->916|948->919
                    -- GENERATED --
                */
            