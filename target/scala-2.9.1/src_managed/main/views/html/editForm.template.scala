
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
	Cr&eacute;ateur : <b>"""),_display_(Seq[Any](/*14.24*/event/*14.29*/.createur)),format.raw/*14.38*/("""</b> """),_display_(Seq[Any](/*14.44*/if(event.email != "" && event.email != null)/*14.88*/ {_display_(Seq[Any](format.raw/*14.90*/("""   <br>Contact : """),_display_(Seq[Any](/*14.108*/event/*14.113*/.email)),format.raw/*14.119*/(""" """)))})),format.raw/*14.121*/("""<br/>

	"""),_display_(Seq[Any](/*16.3*/if(event.descriptif != "")/*16.29*/ {_display_(Seq[Any](format.raw/*16.31*/("""
	Description : <i>"""),_display_(Seq[Any](/*17.20*/event/*17.25*/.descriptif)),format.raw/*17.36*/("""</i> <br/>	
	""")))})),format.raw/*18.3*/("""			
	
	"""),_display_(Seq[Any](/*20.3*/if(adm == 1)/*20.15*/ {_display_(Seq[Any](format.raw/*20.17*/("""
		<a class="btn btn-danger" href=""""),_display_(Seq[Any](/*21.36*/routes/*21.42*/.Application.deleteEvent(event.id))),format.raw/*21.76*/("""">Supprimer l'evenement</a>
	""")))})),format.raw/*22.3*/("""


	
	<br><br>
	<h3>Inviter des personnes à l'évenement</h3>

	<div class="selectDate" style="position:relative">
	<textarea id="mailsArea" title="Adresses email s&eacute;par&eacute;es par une virgule" rows="4" style="color:grey" placeholder="Entrez ici les adresses mail séparées par une virgule ..."></textarea>
	<i class="checkmail mesicones icon-remove"></i>
	<a id="envoiLien" disabled="true" class="btn btn-primary">Envoyer Lien</a>
	</div>
	
	<br><br>
	<h3>Liste des participants et de leurs disponibilités</h3>

	"""),_display_(Seq[Any](/*38.3*/if(adm != 1)/*38.15*/{_display_(Seq[Any](format.raw/*38.16*/("""
		S'ajouter à la liste des participants :		  
		<input id="champ" type="text" value="">&nbsp;<a id="ajouter" class="btn">Ajouter</a><br>
	""")))})),format.raw/*41.3*/("""	

	<div id="divtest" >
	<table class="datesTable" cellspacing="5" cellpadding="5">
		<tbody>
			<tr class="titres dates" style="display:none"><td style="visibility:hidden"></td>
				"""),_display_(Seq[Any](/*47.6*/for(jour <- event.jours) yield /*47.30*/ {_display_(Seq[Any](format.raw/*47.32*/("""  					  
					<td id=""""),_display_(Seq[Any](/*48.15*/jour/*48.19*/.id)),format.raw/*48.22*/("""" class="jour" colspan=""""),_display_(Seq[Any](/*48.47*/jour/*48.51*/.horaires.size())),format.raw/*48.67*/("""">
						<b class="jourintitule">"""),_display_(Seq[Any](/*49.32*/jour/*49.36*/.date)),format.raw/*49.41*/(""" </b>
						"""),_display_(Seq[Any](/*50.8*/if(adm == 1)/*50.20*/{_display_(Seq[Any](format.raw/*50.21*/("""<a id=""""),_display_(Seq[Any](/*50.29*/jour/*50.33*/.id)),format.raw/*50.36*/("""" class="horaireAdd" ><i class="mesicones icon-plus"></i></a>""")))})),format.raw/*50.98*/("""
						"""),_display_(Seq[Any](/*51.8*/if(adm == 1)/*51.20*/{_display_(Seq[Any](format.raw/*51.21*/("""<a id=""""),_display_(Seq[Any](/*51.29*/jour/*51.33*/.id)),format.raw/*51.36*/("""" class="jourDel"><i class="mesicones icon-remove"></i></a>""")))})),format.raw/*51.96*/("""
					</td>	                        	                
				""")))})),format.raw/*53.6*/("""
			</tr>
			<tr class="titres horaires" style="display:none"><td style="visibility:hidden"></td>
				"""),_display_(Seq[Any](/*56.6*/for(jour <- event.jours) yield /*56.30*/ {_display_(Seq[Any](format.raw/*56.32*/("""  
					"""),_display_(Seq[Any](/*57.7*/if(jour.horaires.size() == 0)/*57.36*/{_display_(Seq[Any](format.raw/*57.37*/("""
					    <td class="jour"></td>
					""")))})),format.raw/*59.7*/("""
				    """),_display_(Seq[Any](/*60.10*/for(horaire <- jour.horaires) yield /*60.39*/ {_display_(Seq[Any](format.raw/*60.41*/("""
				    	<td id=""""),_display_(Seq[Any](/*61.19*/horaire/*61.26*/.id)),format.raw/*61.29*/("""" dayid=""""),_display_(Seq[Any](/*61.39*/jour/*61.43*/.id)),format.raw/*61.46*/("""" class="horaire">
				    		"""),_display_(Seq[Any](/*62.12*/horaire/*62.19*/.debut)),format.raw/*62.25*/(""" - """),_display_(Seq[Any](/*62.29*/horaire/*62.36*/.fin)),format.raw/*62.40*/(""" 
				    		"""),_display_(Seq[Any](/*63.12*/if(adm == 1)/*63.24*/{_display_(Seq[Any](format.raw/*63.25*/("""<a id=""""),_display_(Seq[Any](/*63.33*/horaire/*63.40*/.id)),format.raw/*63.43*/("""" idjour=""""),_display_(Seq[Any](/*63.54*/jour/*63.58*/.id)),format.raw/*63.61*/("""" class="horaireDel" ><i class="mesicones icon-remove"></i></a>""")))})),format.raw/*63.125*/("""
				    	</td>
				    """)))})),format.raw/*65.10*/("""  

				""")))})),format.raw/*67.6*/("""
			</tr>
			              
			
			"""),_display_(Seq[Any](/*71.5*/for(participant <- event.participants) yield /*71.43*/ {_display_(Seq[Any](format.raw/*71.45*/("""
				<tr title=""""),_display_(Seq[Any](/*72.17*/participant/*72.28*/.nom)),format.raw/*72.32*/("""" id=""""),_display_(Seq[Any](/*72.39*/participant/*72.50*/.id)),format.raw/*72.53*/("""" class="participant"><td class="infoPersonne">
					"""),_display_(Seq[Any](/*73.7*/form(routes.Application.updatePersonne(event.id), 'id->"formPersonne")/*73.77*/ {_display_(Seq[Any](format.raw/*73.79*/("""
						"""),_display_(Seq[Any](/*74.8*/if(participant.locked)/*74.30*/{_display_(Seq[Any](format.raw/*74.31*/("""
							<i class="mesicones icon-lock"></i>
						""")))})),format.raw/*76.8*/("""
						"""),_display_(Seq[Any](/*77.8*/if(participant.obligatoire)/*77.35*/{_display_(Seq[Any](format.raw/*77.36*/("""							
							<a id="obligatoire" class="obligatoirecb btn btn-inverse">Obligatoire</a>
						""")))}/*79.9*/else/*79.14*/{_display_(Seq[Any](format.raw/*79.15*/("""								
							<a id="obligatoire" class="obligatoirecb btn ">Facultatif</a>
						""")))})),format.raw/*81.8*/("""

						<input id="nom" size="10" type="text" value=""""),_display_(Seq[Any](/*83.53*/participant/*83.64*/.nom)),format.raw/*83.68*/("""" name="nom" readonly="readonly">							
						<a id=""""),_display_(Seq[Any](/*84.15*/participant/*84.26*/.id)),format.raw/*84.29*/("""" title="Editer le participant" class="editPersonne"><i class="mesicones icon-pencil"></i></a>
						<a id=""""),_display_(Seq[Any](/*85.15*/participant/*85.26*/.id)),format.raw/*85.29*/("""" title="Supprimer le participant" class="deletePersonne"> <i class="mesicones icon-trash"></i></a>
					""")))})),format.raw/*86.7*/("""</td>
					
					"""),_display_(Seq[Any](/*88.7*/for(jour <- event.jours) yield /*88.31*/ {_display_(Seq[Any](format.raw/*88.33*/("""
					    """),_display_(Seq[Any](/*89.11*/if(jour.horaires.size() == 0)/*89.40*/{_display_(Seq[Any](format.raw/*89.41*/("""
					      """),_display_(Seq[Any](/*90.13*/if(participant.inscriptionsJours.contains(jour))/*90.61*/ {_display_(Seq[Any](format.raw/*90.63*/("""
			                <td class="checktd"><input id=""""),_display_(Seq[Any](/*91.52*/jour/*91.56*/.id)),format.raw/*91.59*/("""" type="checkbox"  disabled checked class="jour checkbox" value=""""),_display_(Seq[Any](/*91.125*/jour/*91.129*/.date)),format.raw/*91.134*/("""" /></td>
			              """)))}/*92.20*/else/*92.25*/{_display_(Seq[Any](format.raw/*92.26*/("""
			                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*93.53*/jour/*93.57*/.id)),format.raw/*93.60*/("""" type="checkbox"  disabled class="jour checkbox" value=""""),_display_(Seq[Any](/*93.118*/jour/*93.122*/.date)),format.raw/*93.127*/("""" /></td>
			              """)))})),format.raw/*94.19*/("""
					       
					    """)))})),format.raw/*96.11*/("""
			            """),_display_(Seq[Any](/*97.17*/for(horaire <- jour.horaires) yield /*97.46*/ {_display_(Seq[Any](format.raw/*97.48*/("""
			              """),_display_(Seq[Any](/*98.19*/if(participant.inscriptionsHoraires.contains(horaire))/*98.73*/ {_display_(Seq[Any](format.raw/*98.75*/("""
			                <td class="checktd"><input id=""""),_display_(Seq[Any](/*99.52*/horaire/*99.59*/.id)),format.raw/*99.62*/("""" type="checkbox" disabled class="horaire checkbox"  checked value=""""),_display_(Seq[Any](/*99.131*/horaire/*99.138*/.debut)),format.raw/*99.144*/(""" - """),_display_(Seq[Any](/*99.148*/horaire/*99.155*/.fin)),format.raw/*99.159*/("""" /></td>
			              """)))}/*100.20*/else/*100.25*/{_display_(Seq[Any](format.raw/*100.26*/("""
			                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*101.53*/horaire/*101.60*/.id)),format.raw/*101.63*/("""" type="checkbox" disabled class="horaire checkbox" value=""""),_display_(Seq[Any](/*101.123*/horaire/*101.130*/.debut)),format.raw/*101.136*/(""" - """),_display_(Seq[Any](/*101.140*/horaire/*101.147*/.fin)),format.raw/*101.151*/("""" /></td>
			              """)))})),format.raw/*102.19*/("""
			            """)))})),format.raw/*103.17*/("""            	                
			        """)))})),format.raw/*104.13*/("""				
				</tr>
			""")))})),format.raw/*106.5*/("""
		</tbody>
		<tfoot>
		<tr id="compte" class="titres"
		 """),_display_(Seq[Any](/*110.5*/if(event.participants.size() == 0)/*110.39*/{_display_(Seq[Any](format.raw/*110.40*/(""" style="display:none"""")))})),format.raw/*110.62*/(""">
			<td id=""><b>Compte: </b></td>
			"""),_display_(Seq[Any](/*112.5*/for(jour <- event.jours) yield /*112.29*/ {_display_(Seq[Any](format.raw/*112.31*/("""
			    """),_display_(Seq[Any](/*113.9*/if(jour.horaires.size() == 0)/*113.38*/{_display_(Seq[Any](format.raw/*113.39*/("""		     
	                <td id=""""),_display_(Seq[Any](/*114.27*/jour/*114.31*/.id)),format.raw/*114.34*/("""" class="jour">0</td>	       
			    """)))})),format.raw/*115.9*/("""
	            """),_display_(Seq[Any](/*116.15*/for(horaire <- jour.horaires) yield /*116.44*/ {_display_(Seq[Any](format.raw/*116.46*/("""              
	                <td id=""""),_display_(Seq[Any](/*117.27*/horaire/*117.34*/.id)),format.raw/*117.37*/("""" class="horaire">0</td>              
	            """)))})),format.raw/*118.15*/("""
			""")))})),format.raw/*119.5*/("""
		</tr>
		
			
		</tfoot>
		
	</table>
	</div>

	<div id="refresh"></div>




	"""),_display_(Seq[Any](/*133.3*/if(adm == 1)/*133.15*/{_display_(Seq[Any](format.raw/*133.16*/("""
	<a class="visibleAdd" ><i class="mesicones icon-plus"></i></a>
	
	<div class="champAdd" style="display:none">		
		Ajouter un participant :		  
		<input id="champ" type="text" value="">&nbsp;<a id="ajouter" class="btn">Ajouter</a><br><br>

		Ajouter une date:
		<input id="datepicker" type="text">&nbsp;<a id="ajouterDate" class="btn">Ajouter</a>
	</div>
	""")))})),format.raw/*143.3*/("""
	
	

	
	<div id="dialog-add-horaire" title="Sélectionnez l'horaire">	
		<div id="slider">
			<input type="text\" id="data" value="8h - 17h" style="border:0; color:#f6931f; font-weight:bold;" />		

			<div class="slider-range"></div>
		</div>
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

	<!--<script type="text/javascript" src=""""),_display_(Seq[Any](/*193.43*/routes/*193.49*/.Assets.at("javascripts/sendMail.js"))),format.raw/*193.86*/(""""></script>  -->
	<!--<script type="text/javascript" src=""""),_display_(Seq[Any](/*194.43*/routes/*194.49*/.Assets.at("javascripts/editPersonne.js"))),format.raw/*194.90*/(""""></script> -->

	<script type="text/javascript" charset="utf-8">
	
	var color1 = "#FFFF99";
	var color2 = "gold";
	var color3 = "steelblue";
	var mdp = "";

















	/*Code concernant l'interface administrateur*/

	$(function()"""),format.raw("""{"""),format.raw/*221.15*/("""		

		if (""""),_display_(Seq[Any](/*223.9*/adm)),format.raw/*223.12*/("""" == "1") """),format.raw("""{"""),format.raw/*223.23*/("""
			$( "#dialog-check-pwd-adm" ).dialog( "open" );	
		"""),format.raw("""}"""),format.raw/*225.4*/("""
	"""),format.raw("""}"""),format.raw/*226.3*/(""");

	$(function() """),format.raw("""{"""),format.raw/*228.16*/("""
		//$( "#datepicker" ).datepicker();
		
		$( "#datepicker" ).datepicker("""),format.raw("""{"""),format.raw/*231.34*/("""
			 minDate: 0,
			onSelect: function(date) """),format.raw("""{"""),format.raw/*233.30*/("""				
				var selectionType = $.inArray(date, $( "#date" ).multiDatesPicker('getDates'));				
				var d = new Date(date);		
				var dateText = d.toLocaleDateString();
				$( "#datepicker" ).attr("value", dateText);
			"""),format.raw("""}"""),format.raw/*238.5*/("""
		"""),format.raw("""}"""),format.raw/*239.4*/(""");
	"""),format.raw("""}"""),format.raw/*240.3*/(""");

	$( "#dialog-check-pwd-adm" ).dialog("""),format.raw("""{"""),format.raw/*242.39*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		open: function(event, ui) """),format.raw("""{"""),format.raw/*247.30*/(""" $(".ui-dialog-titlebar-close", $(this).parent()).hide(); """),format.raw("""}"""),format.raw/*247.89*/(""",
		buttons: """),format.raw("""{"""),format.raw/*248.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*249.22*/("""				
								
				pass = $("#password-check-adm").val();	
				if (pass == """"),_display_(Seq[Any](/*252.19*/event/*252.24*/.passAdmin)),format.raw/*252.34*/("""") """),format.raw("""{"""),format.raw/*252.38*/("""
				  	$( this ).dialog( "close" );
				"""),format.raw("""}"""),format.raw/*254.6*/(""" else """),format.raw("""{"""),format.raw/*254.13*/("""
				  	alert("mot de passe incorrect");
				"""),format.raw("""}"""),format.raw/*256.6*/("""				
				
			"""),format.raw("""}"""),format.raw/*258.5*/("""					
		"""),format.raw("""}"""),format.raw/*259.4*/("""
		
		
	"""),format.raw("""}"""),format.raw/*262.3*/(""");



































	/*Code concernant les mails et l'envoi*/

	$(function()"""),format.raw("""{"""),format.raw/*300.15*/("""

		if (bonmail($("#mailsArea").val())) """),format.raw("""{"""),format.raw/*302.40*/("""
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
		"""),format.raw("""}"""),format.raw/*305.4*/(""" else """),format.raw("""{"""),format.raw/*305.11*/("""
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
		"""),format.raw("""}"""),format.raw/*308.4*/("""
	"""),format.raw("""}"""),format.raw/*309.3*/(""");

	$('#envoiLien').live('click', function(e) """),format.raw("""{"""),format.raw/*311.45*/("""

		if ($(this).attr("disabled") != "disabled") """),format.raw("""{"""),format.raw/*313.48*/("""
			var mailsList = $("#mailsArea").val();

			$.ajax("""),format.raw("""{"""),format.raw/*316.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*318.12*/routes/*318.18*/.Application.sendMail(event.id))),format.raw/*318.49*/("""",
				data: '"""),format.raw("""{"""),format.raw/*319.13*/(""""mailslist" : "' + mailsList + '""""),format.raw("""}"""),format.raw/*319.47*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*321.31*/("""
					alert("Mail(s) envoye(s) a "+mailsList);
				"""),format.raw("""}"""),format.raw/*323.6*/("""
			"""),format.raw("""}"""),format.raw/*324.5*/(""");
		"""),format.raw("""}"""),format.raw/*325.4*/("""
	"""),format.raw("""}"""),format.raw/*326.3*/(""");


	$("#mailsArea").live("keyup", function() """),format.raw("""{"""),format.raw/*329.44*/("""

		if (bonmail($(this).val())) """),format.raw("""{"""),format.raw/*331.32*/("""
			
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
		"""),format.raw("""}"""),format.raw/*335.4*/(""" else """),format.raw("""{"""),format.raw/*335.11*/("""
			
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
		"""),format.raw("""}"""),format.raw/*339.4*/("""
	"""),format.raw("""}"""),format.raw/*340.3*/(""")
	
	function bonmail(mailtest)
	"""),format.raw("""{"""),format.raw/*343.3*/("""
		var reg = new RegExp('^([a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*344.46*/("""1"""),format.raw("""}"""),format.raw/*344.48*/("""[a-z0-9]+)*@[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*344.80*/("""1"""),format.raw("""}"""),format.raw/*344.82*/("""[a-z0-9]+)*[\.]"""),format.raw("""{"""),format.raw/*344.98*/("""1"""),format.raw("""}"""),format.raw/*344.100*/("""[a-z]"""),format.raw("""{"""),format.raw/*344.106*/("""2,6"""),format.raw("""}"""),format.raw/*344.110*/(""")"""),format.raw("""{"""),format.raw/*344.112*/("""1"""),format.raw("""}"""),format.raw/*344.114*/("""(\,( )*[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*344.140*/("""1"""),format.raw("""}"""),format.raw/*344.142*/("""[a-z0-9]+)*@[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*344.174*/("""1"""),format.raw("""}"""),format.raw/*344.176*/("""[a-z0-9]+)*[\.]"""),format.raw("""{"""),format.raw/*344.192*/("""1"""),format.raw("""}"""),format.raw/*344.194*/("""[a-z]"""),format.raw("""{"""),format.raw/*344.200*/("""2,6"""),format.raw("""}"""),format.raw/*344.204*/(""")*$', 'i');

		if(reg.test(mailtest))
		"""),format.raw("""{"""),format.raw/*347.4*/("""
			return(true);
		"""),format.raw("""}"""),format.raw/*349.4*/("""
		else
		"""),format.raw("""{"""),format.raw/*351.4*/("""
			return(false);
		"""),format.raw("""}"""),format.raw/*353.4*/("""
	"""),format.raw("""}"""),format.raw/*354.3*/("""



























	/*Code de style*/

	$(function()"""),format.raw("""{"""),format.raw/*384.15*/("""
		$("table.datesTable td").css("background-color", color3);
		$(".checkbox").attr("disabled", "true"); 

		$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*388.37*/(""" // coloration des box checkées
		  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*389.34*/("""
		  		$(this).parent().css("background-color", "#66CC99");
		  	"""),format.raw("""}"""),format.raw/*391.7*/("""
		"""),format.raw("""}"""),format.raw/*392.4*/(""");

		$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*394.41*/("""
			$('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*396.4*/(""");

		refreshCount(); // maj de la ligne de compteurs

		affichagePopulaire(); // maj des surbrillances
	"""),format.raw("""}"""),format.raw/*401.3*/(""")

	$("textarea").live('click', function(e) """),format.raw("""{"""),format.raw/*403.43*/("""
		$(this).html("");
		$(this).removeAttr("style");
	"""),format.raw("""}"""),format.raw/*406.3*/(""")

	$(".visibleAdd").live("click", function() """),format.raw("""{"""),format.raw/*408.45*/("""
        if ($(this).siblings(".champAdd").css("display") == "none") """),format.raw("""{"""),format.raw/*409.70*/("""                
            $(this).siblings(".champAdd").removeAttr("style");
            $(this).html("<i class=\"mesicones icon-minus\"></i>")
        """),format.raw("""}"""),format.raw/*412.10*/(""" else """),format.raw("""{"""),format.raw/*412.17*/("""                
            $(this).siblings(".champAdd").attr("style", "display:none");
            $(this).html("<i class=\"mesicones icon-plus\"></i>")
        """),format.raw("""}"""),format.raw/*415.10*/("""
    """),format.raw("""}"""),format.raw/*416.6*/(""")

	function refreshHoverable() """),format.raw("""{"""),format.raw/*418.31*/(""" //coloration des cases quand on passe la souris dessus
		
		$(".hoverable").on("""),format.raw("""{"""),format.raw/*420.23*/("""

			mouseenter: function () """),format.raw("""{"""),format.raw/*422.29*/("""
				$(this).css("background-color", "lightgreen");
			"""),format.raw("""}"""),format.raw/*424.5*/(""", 

			mouseleave: function () """),format.raw("""{"""),format.raw/*426.29*/("""
				if ($(this).children().is(':checked'))"""),format.raw("""{"""),format.raw/*427.44*/("""	 
			    	$(this).css("background-color", "#66CC99");
			    """),format.raw("""}"""),format.raw/*429.9*/(""" else """),format.raw("""{"""),format.raw/*429.16*/("""
			    	$(this).css("background-color", color3);
			    """),format.raw("""}"""),format.raw/*431.9*/("""
			"""),format.raw("""}"""),format.raw/*432.5*/("""
		"""),format.raw("""}"""),format.raw/*433.4*/(""");

	"""),format.raw("""}"""),format.raw/*435.3*/("""

	

	function refreshCount() """),format.raw("""{"""),format.raw/*439.27*/(""" // met à jour l'affichage du compte des participants par horaire
		$('input[type="checkbox"].horaire.checkbox').each(function(i) """),format.raw("""{"""),format.raw/*440.66*/("""
			var iden = $(this).attr('id');
			
			if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*443.32*/("""
		    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			"""),format.raw("""}"""),format.raw/*446.5*/("""
			
		"""),format.raw("""}"""),format.raw/*448.4*/(""");
			
		$('input[type="checkbox"].jour.checkbox').each(function(i) """),format.raw("""{"""),format.raw/*450.63*/("""
			var iden = $(this).attr('id');			
				
			if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*453.32*/("""
		    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			"""),format.raw("""}"""),format.raw/*456.5*/("""			
			
		"""),format.raw("""}"""),format.raw/*458.4*/(""");
	"""),format.raw("""}"""),format.raw/*459.3*/("""










	























	/*Code sur les mots de passe*/

	$( "#dialog:ui-dialog" ).dialog( "destroy" ); 
		
	
	var pass = "";
	var goodPass = "";
	var currentEditButton;

	$( "#dialog-question-securise" ).dialog("""),format.raw("""{"""),format.raw/*503.43*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*508.13*/("""
			"Oui": function() """),format.raw("""{"""),format.raw/*509.23*/("""				    	
			    $( "#dialog-new-pwd" ).dialog( "open" );  
			    $( this ).dialog( "close" );
			"""),format.raw("""}"""),format.raw/*512.5*/(""",
			"Non": function() """),format.raw("""{"""),format.raw/*513.23*/("""
				addPersonne($.trim($("#champ").attr("value")), "false", "");
				$( this ).dialog( "close" );
			"""),format.raw("""}"""),format.raw/*516.5*/("""				
		"""),format.raw("""}"""),format.raw/*517.4*/("""
		
	"""),format.raw("""}"""),format.raw/*519.3*/(""");
			
	
	$( "#dialog-new-pwd" ).dialog("""),format.raw("""{"""),format.raw/*522.33*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*527.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*528.22*/("""
				var bValid = true;									

				if ( bValid ) """),format.raw("""{"""),format.raw/*531.20*/("""
					mdp = $("#password-new").val();
					addPersonne($.trim($("#champ").attr("value")), "true", mdp);
					$( "#password-new" ).attr("value", "");
					$( this ).dialog( "close" );
				"""),format.raw("""}"""),format.raw/*536.6*/("""
			"""),format.raw("""}"""),format.raw/*537.5*/("""				
		"""),format.raw("""}"""),format.raw/*538.4*/("""
		
	"""),format.raw("""}"""),format.raw/*540.3*/(""");

	$( "#dialog-check-pwd" ).dialog("""),format.raw("""{"""),format.raw/*542.35*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*547.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*548.22*/("""				
								
				pass = $("#password-check").val();	
				if (pass == goodPass) """),format.raw("""{"""),format.raw/*551.28*/("""
				  	edition(currentEditButton);
				"""),format.raw("""}"""),format.raw/*553.6*/(""" else """),format.raw("""{"""),format.raw/*553.13*/("""
				  	alert("mot de passe incorrect");
				"""),format.raw("""}"""),format.raw/*555.6*/("""				
				$( "#password-check" ).attr("value", "");
				$( this ).dialog( "close" );
				
			"""),format.raw("""}"""),format.raw/*559.5*/(""",

			"Annuler": function() """),format.raw("""{"""),format.raw/*561.27*/("""							
				$( this ).dialog( "close" );				
			"""),format.raw("""}"""),format.raw/*563.5*/("""				
		"""),format.raw("""}"""),format.raw/*564.4*/("""
		
	"""),format.raw("""}"""),format.raw/*566.3*/(""");



	


























	/*Code sur l'ajout*/

	function addPersonne(nomParticipant, locked, pwd)
	"""),format.raw("""{"""),format.raw/*600.3*/("""	
		$.ajax("""),format.raw("""{"""),format.raw/*601.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*603.11*/routes/*603.17*/.Application.addParticipant(event.id))),format.raw/*603.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*604.12*/(""""nom" : "' + nomParticipant + '", "locked" : "' + locked + '", "pwd" : "' + pwd + '""""),format.raw("""}"""),format.raw/*604.97*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*606.30*/("""
				var lock ="";		
				if(locked == "true")"""),format.raw("""{"""),format.raw/*608.26*/("""
					lock = "<i class=\"mesicones icon-lock\"></i>&nbsp;";
				"""),format.raw("""}"""),format.raw/*610.6*/("""  
				$("tbody").append("<tr title=\""+nomParticipant+"\" class=\"editable\" id=\""+data.idPersonne+"\"><td class=\"infoPersonne\">"+
					"<form id=\"formPersonne\">"+
					lock+
					"<a id=\"obligatoire\" class=\"obligatoirecb btn\">Facultatif</a>&nbsp;"+
					"<input id=\"nom\" type=\"text\" value=\""+nomParticipant+"\" name=\"nom\">&nbsp;"+	
					"<a id=\""+data.idPersonne+"\" title=\"editer le participant\" class=\"editPersonne\"><i class=\"mesicones icon-ok\"></i></a>"+
					"<a id=\""+data.idPersonne+"\" title=\"supprimer le participant\" class=\"deletePersonne\"> <i class=\"mesicones icon-trash\"></i</a>"+		  
					"</form></td>"+
					""""),_display_(Seq[Any](/*619.8*/for(jour <- event.jours) yield /*619.32*/ {_display_(Seq[Any](format.raw/*619.34*/(""""+  
					""""),_display_(Seq[Any](/*620.8*/if(jour.horaires.size() == 0)/*620.37*/{_display_(Seq[Any](format.raw/*620.38*/("""<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*620.117*/jour/*620.121*/.id)),format.raw/*620.124*/("""\" type=\"checkbox\" class=\"jour checkbox\" value=\""""),_display_(Seq[Any](/*620.178*/jour/*620.182*/.date)),format.raw/*620.187*/("""\" /></td>""")))})),format.raw/*620.198*/(""""+
					""""),_display_(Seq[Any](/*621.8*/for(horaire <- jour.horaires) yield /*621.37*/ {_display_(Seq[Any](format.raw/*621.39*/(""""+	                		
					"<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*622.86*/horaire/*622.93*/.id)),format.raw/*622.96*/("""\" type=\"checkbox\" class=\"horaire checkbox\" value=\""""),_display_(Seq[Any](/*622.153*/horaire/*622.160*/.debut)),format.raw/*622.166*/(""" - """),_display_(Seq[Any](/*622.170*/horaire/*622.177*/.fin)),format.raw/*622.181*/("""\" /></td>"+			                
					"""")))})),format.raw/*623.8*/(""""+                	                
					"""")))})),format.raw/*624.8*/("""" +
					"</tr>")
				$('#champ').attr('value', '')
				$('.titres').attr('style','');
				refreshHoverable();
						
			"""),format.raw("""}"""),format.raw/*630.5*/("""               
		"""),format.raw("""}"""),format.raw/*631.4*/(""");
	"""),format.raw("""}"""),format.raw/*632.3*/("""

	$("#ajouter").live('click', function(e)"""),format.raw("""{"""),format.raw/*634.42*/("""
		

	    var vide = "";	    
	    var nom = $("#champ").attr("value");
	    if (nom != vide) """),format.raw("""{"""),format.raw/*639.24*/("""  
	    	$( "#dialog-question-securise" ).dialog( "open" );	
	    	
						
		"""),format.raw("""}"""),format.raw/*643.4*/("""

	    	    
	"""),format.raw("""}"""),format.raw/*646.3*/(""");

	$("#champ").keypress(function(e) """),format.raw("""{"""),format.raw/*648.36*/("""
		var code = (e.keyCode ? e.keyCode : e.which);
		if(code == 13) """),format.raw("""{"""),format.raw/*650.19*/(""" //Enter keycode
			var vide = "";	    
		    var nom = $.trim($("#champ").attr("value"));
		    if (nom != vide) """),format.raw("""{"""),format.raw/*653.25*/("""  
		    	$( "#dialog-question-securise" ).dialog( "open" );	
							
			"""),format.raw("""}"""),format.raw/*656.5*/("""
			$("#champ").focus();
 		"""),format.raw("""}"""),format.raw/*658.5*/("""

	"""),format.raw("""}"""),format.raw/*660.3*/(""");































	/* Code sur le rajout d'horaires et de dates*/

	var currentDay;
	var debut = "08h";
	var fin = "17h";

	$(".horaireAdd").live("click", function()"""),format.raw("""{"""),format.raw/*698.44*/("""
		$( "#dialog-add-horaire" ).dialog("open");
		currentDay = $(this).attr("id");
		
	"""),format.raw("""}"""),format.raw/*702.3*/(""")

	$("#ajouterDate").live("click", function()"""),format.raw("""{"""),format.raw/*704.45*/("""
		//var listeJours = """"),_display_(Seq[Any](/*705.24*/for(jour <- event.jours) yield /*705.48*/ {_display_(Seq[Any](format.raw/*705.50*/(""" """),_display_(Seq[Any](/*705.52*/jour/*705.56*/.date)),format.raw/*705.61*/(""" """)))})),format.raw/*705.63*/(""" "; EST CENSÉ MARCHER????
		var listeJours = "";
		$(".jourintitule").each(function()"""),format.raw("""{"""),format.raw/*707.38*/("""
			listeJours=listeJours+$(this).html()+" "
		"""),format.raw("""}"""),format.raw/*709.4*/(""");

		alert(listeJours);
		if (listeJours.indexOf($("#datepicker").val()) != -1 ) """),format.raw("""{"""),format.raw/*712.59*/("""			
			alert("date déjà existante");
		"""),format.raw("""}"""),format.raw/*714.4*/(""" else """),format.raw("""{"""),format.raw/*714.11*/("""
			$.ajax("""),format.raw("""{"""),format.raw/*715.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*717.12*/routes/*717.18*/.Application.addDate(event.id))),format.raw/*717.48*/("""",
				data: '"""),format.raw("""{"""),format.raw/*718.13*/(""""date" : "' + $("#datepicker").val() + '""""),format.raw("""}"""),format.raw/*718.55*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*720.31*/("""

					$('.titres.dates').append(
						"<td id=\""+data.idJour+"\" class=\"jour\" style=\"background-color: rgb(255, 255, 153);\">"+
							"<b>"+$("#datepicker").val()+" </b>"+
							"<a id=\""+data.idJour+"\" class=\"horaireAdd\">"+
								"<i class=\"mesicones icon-plus\"></i>"+
							"</a>"+
						"</td>"
					);	
					$('.titres.horaires').append(						
						"<td id=\""+data.idJour+"\" class=\"jour\" style=\"background-color: rgb(255, 255, 153);\"></td>"
					);

					$(".participant").append(
						"<td class=\"checktd\"><input id=\""+data.idJour+"\" type=\"checkbox\"  disabled class=\"jour checkbox\" value=\""+$("#datepicker").val()+"\" /></td>"
					);				

					$("#compte").append(
						"<td id=\""+data.idJour+"\" class=\"jour\" style=\"background-color: rgb(255, 255, 153);\">0</td>"
					);
				"""),format.raw("""}"""),format.raw/*741.6*/("""
			"""),format.raw("""}"""),format.raw/*742.5*/(""");	
		"""),format.raw("""}"""),format.raw/*743.4*/("""
	"""),format.raw("""}"""),format.raw/*744.3*/(""");

	$( ".slider-range" ).slider("""),format.raw("""{"""),format.raw/*746.31*/("""
    	range: true,
    	min: 0,
    	max: 1440,
    	step: 15,
    	values: [ 8*60, 17*60 ],
    	slide: function( event, ui ) """),format.raw("""{"""),format.raw/*752.36*/("""
    		$( "#data" ).val(parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60)+" - " + parseInt(ui.values[ 1 ]/60) +"h"+pad2(ui.values[ 1 ]%60));

		"""),format.raw("""}"""),format.raw/*755.4*/(""", 
		change: function(event, ui) """),format.raw("""{"""),format.raw/*756.32*/("""
			debut = parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60);
			fin = parseInt(ui.values[ 1 ]/60) + "h"+pad2(ui.values[ 1 ]%60);
					
		"""),format.raw("""}"""),format.raw/*760.4*/("""
	"""),format.raw("""}"""),format.raw/*761.3*/(""");
			    	
	$( "#dialog-add-horaire" ).dialog("""),format.raw("""{"""),format.raw/*763.37*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		closeText: 'hide',
		buttons: """),format.raw("""{"""),format.raw/*769.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*770.22*/("""	
					
				$.ajax("""),format.raw("""{"""),format.raw/*772.13*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*774.13*/routes/*774.19*/.Application.newHoraire(event.id))),format.raw/*774.52*/("""",
					data: '"""),format.raw("""{"""),format.raw/*775.14*/(""""jour" : "' + currentDay + '""""),format.raw("""}"""),format.raw/*775.44*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*777.32*/("""
						
						$.ajax("""),format.raw("""{"""),format.raw/*779.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*781.15*/routes/*781.21*/.Application.dateChanged(event.id))),format.raw/*781.55*/("""",
							data: '"""),format.raw("""{"""),format.raw/*782.16*/(""""idhoraire" : "' + data.idHoraire + '",'+ 
							'"debut" : "' + debut + '",'+
							'"fin" : "' + fin + '""""),format.raw("""}"""),format.raw/*784.31*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*786.34*/("""
								
							"""),format.raw("""}"""),format.raw/*788.9*/("""               
						"""),format.raw("""}"""),format.raw/*789.8*/(""");
					"""),format.raw("""}"""),format.raw/*790.7*/("""
				"""),format.raw("""}"""),format.raw/*791.6*/(""");				
				
				$( this ).dialog( "close" );
				
				$('#divtest').load('/KIND/eventEdit/"""),_display_(Seq[Any](/*795.42*/event/*795.47*/.id)),format.raw/*795.50*/("""/adm #divtest');
				
				$('#divtest').load('/KIND/eventEdit/"""),_display_(Seq[Any](/*797.42*/event/*797.47*/.id)),format.raw/*797.50*/("""/adm #divtest');

				setTimeout(styles, 1000);



								
			"""),format.raw("""}"""),format.raw/*804.5*/(""",

			"Annuler": function() """),format.raw("""{"""),format.raw/*806.27*/("""							
				$( this ).dialog( "close" );				
			"""),format.raw("""}"""),format.raw/*808.5*/("""				
		"""),format.raw("""}"""),format.raw/*809.4*/("""
		
	"""),format.raw("""}"""),format.raw/*811.3*/(""");

	function styles()"""),format.raw("""{"""),format.raw/*813.20*/("""
		$("tr").attr("style", "");
		$("table.datesTable td").css("background-color", color3);
		$(".checkbox").attr("disabled", "true"); 

		$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*818.37*/(""" // coloration des box checkées
		  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*819.34*/("""
		  		$(this).parent().css("background-color", "#66CC99");
		  	"""),format.raw("""}"""),format.raw/*821.7*/("""
		"""),format.raw("""}"""),format.raw/*822.4*/(""");

		$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*824.41*/("""
			$('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*826.4*/(""");

		refreshCount(); // maj de la ligne de compteurs

		affichagePopulaire();
	"""),format.raw("""}"""),format.raw/*831.3*/("""

	function pad2(number) """),format.raw("""{"""),format.raw/*833.25*/("""
   
    	return (number < 10 ? '0' : '') + number
   
	"""),format.raw("""}"""),format.raw/*837.3*/("""


























	/* Code concernant la suppression d'horaires et de jours*/
	 
	$(".horaireDel").live("click", function()"""),format.raw("""{"""),format.raw/*866.44*/("""
		var thisse = $(this);
		
			
		$.ajax("""),format.raw("""{"""),format.raw/*870.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*872.11*/routes/*872.17*/.Application.deleteHoraire(event.id))),format.raw/*872.53*/("""",
			data: '"""),format.raw("""{"""),format.raw/*873.12*/(""""jour" : "' + $(this).attr("idjour") + '", "horaire" : "' + $(this).attr("id") + '""""),format.raw("""}"""),format.raw/*873.96*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*875.30*/("""
				$('#divtest').load('/KIND/eventEdit/"""),_display_(Seq[Any](/*876.42*/event/*876.47*/.id)),format.raw/*876.50*/("""/adm #divtest');
				setTimeout(styles, 1000);				
			"""),format.raw("""}"""),format.raw/*878.5*/(""", 
			error : function(data) """),format.raw("""{"""),format.raw/*879.28*/("""
				alert("impossible de supprimer l'horaire, vérifiez que personne n'est disponible à cet horaire-ci")
			"""),format.raw("""}"""),format.raw/*881.5*/("""
		"""),format.raw("""}"""),format.raw/*882.4*/(""");	

	"""),format.raw("""}"""),format.raw/*884.3*/(""")

	$(".jourDel").live("click", function()"""),format.raw("""{"""),format.raw/*886.41*/("""
		var thisse = $(this);
		
		
		$.ajax("""),format.raw("""{"""),format.raw/*890.11*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*892.12*/routes/*892.18*/.Application.removeDate(event.id))),format.raw/*892.51*/("""",
				data: '"""),format.raw("""{"""),format.raw/*893.13*/(""""idDate" : "' + $(this).attr("id") + '""""),format.raw("""}"""),format.raw/*893.53*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*895.31*/("""
					$('#divtest').load('/KIND/eventEdit/"""),_display_(Seq[Any](/*896.43*/event/*896.48*/.id)),format.raw/*896.51*/("""/adm #divtest');
					setTimeout(styles, 1000);		
				"""),format.raw("""}"""),format.raw/*898.6*/(""",
				error : function(data) """),format.raw("""{"""),format.raw/*899.29*/("""
					alert("impossible de supprimer le jour, vérifiez que personne n'est disponible ce jour-ci")
				"""),format.raw("""}"""),format.raw/*901.6*/("""
			"""),format.raw("""}"""),format.raw/*902.5*/(""");				

	"""),format.raw("""}"""),format.raw/*904.3*/(""")
	



























	/*Code sur l'édition*/

	$('.editPersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*935.48*/("""
		
	    if(!$(this).parents("tr").hasClass("editable"))  """),format.raw("""{"""),format.raw/*937.56*/("""	    	
	    	if ($(this).siblings("i").hasClass("icon-lock"))"""),format.raw("""{"""),format.raw/*938.56*/("""
	    		currentEditButton = $(this);
	    		$.ajax("""),format.raw("""{"""),format.raw/*940.16*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*942.13*/routes/*942.19*/.Application.getPass())),format.raw/*942.41*/("""",
					data: '"""),format.raw("""{"""),format.raw/*943.14*/(""" "idpers" : "'+$(this).parents("tr").attr("id")+'" """),format.raw("""}"""),format.raw/*943.66*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*945.32*/("""
						goodPass = data.pass;

						$( "#dialog-check-pwd" ).dialog( "open" );	
											  
					"""),format.raw("""}"""),format.raw/*950.7*/("""
			   """),format.raw("""}"""),format.raw/*951.8*/(""");			
				
			"""),format.raw("""}"""),format.raw/*953.5*/(""" else """),format.raw("""{"""),format.raw/*953.12*/("""
				edition($(this));
			"""),format.raw("""}"""),format.raw/*955.5*/("""
		  
	    """),format.raw("""}"""),format.raw/*957.7*/(""" else """),format.raw("""{"""),format.raw/*957.14*/("""
	      $(this).html("<i class=\"mesicones icon-pencil\"></i>");
	      $(this).parents("tr").removeClass("editable");
	      $(this).siblings('input[type="text"]').attr("readonly", "readonly");
	      $(this).parent().parent().parent().children("td").children('input[type="checkbox"]').attr("disabled","true"); 
	      $(this).parent().parent().parent().children("td").css("border", "none");
	      $(".hoverable").off();	      
	      $(this).parent().parent().parent().children(".checktd").attr("class", "checktd");
	      refreshHoverable();
	      editPersonne($(this).attr('id'), $(this).siblings("input").attr("value"));
	    """),format.raw("""}"""),format.raw/*967.7*/("""
	
	  
	"""),format.raw("""}"""),format.raw/*970.3*/(""")

	function edition(elem) """),format.raw("""{"""),format.raw/*972.26*/("""
		elem.html("<i class=\"mesicones icon-ok\"></i>");
		elem.parents("tr").addClass("editable");
		elem.siblings('input[type="text"]').removeAttr("readonly");
		elem.parent().parent().parent().children("td").children().removeAttr("disabled");
		elem.parent().parent().parent().children("td").css("border", "solid black 2px");
		$(".hoverable").off();		  
		elem.parent().parent().parent().children(".checktd").attr("class", "checktd hoverable");
		refreshHoverable();
	"""),format.raw("""}"""),format.raw/*981.3*/("""

	function editPersonne(personneId, personneNom)
	"""),format.raw("""{"""),format.raw/*984.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*985.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*987.11*/routes/*987.17*/.Application.updatePersonne(event.id))),format.raw/*987.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*988.12*/(""""id" : "' + personneId + '", "nom" : "' + personneNom + '""""),format.raw("""}"""),format.raw/*988.71*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*990.30*/("""
			  //alert("Participant edit\351");
			"""),format.raw("""}"""),format.raw/*992.5*/("""
	  """),format.raw("""}"""),format.raw/*993.5*/(""");
	"""),format.raw("""}"""),format.raw/*994.3*/("""

	$('.checktd').live('click', function(e) """),format.raw("""{"""),format.raw/*996.43*/("""
		if ($(this).children().prop("disabled") == false) """),format.raw("""{"""),format.raw/*997.54*/("""
			if ($(this).children().prop("checked") == false) """),format.raw("""{"""),format.raw/*998.54*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*999.36*/("""
					$(this).children().prop("checked", true);
				"""),format.raw("""}"""),format.raw/*1001.6*/("""
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*1003.5*/(""" else """),format.raw("""{"""),format.raw/*1003.12*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*1004.36*/("""
					$(this).children().prop("checked", false);
				"""),format.raw("""}"""),format.raw/*1006.6*/("""        
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*1008.5*/("""

			affichagePopulaire();

			//$('.populaires').html("");
			$('.titres td').each( function() """),format.raw("""{"""),format.raw/*1013.38*/("""
				if ($(this).css('background-color') == color2) """),format.raw("""{"""),format.raw/*1014.53*/("""
					$('.populaires').append($(this).html());
				"""),format.raw("""}"""),format.raw/*1016.6*/("""				
			"""),format.raw("""}"""),format.raw/*1017.5*/(""")			
		"""),format.raw("""}"""),format.raw/*1018.4*/("""
	"""),format.raw("""}"""),format.raw/*1019.3*/(""");

	function changeCheck(box) """),format.raw("""{"""),format.raw/*1021.29*/("""   // gestion des clics sur les checkboxes
	   var idtime = box.attr('id');
	   var idParticipant = box.parent().parent().attr('id');   
	   
	   if (box.is(':checked'))"""),format.raw("""{"""),format.raw/*1025.29*/("""	 //Action de valider une horaire  		
	       		box.parent().css("background-color", "#66CC99")//vert
		   		if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*1027.57*/("""
		            var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
		       	    requeteAjaxHeure(idtime, idParticipant);
			    """),format.raw("""}"""),format.raw/*1031.9*/("""
	       		if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*1032.57*/("""	
	    	   	    var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
				    requeteAjaxJour(idtime, idParticipant);
			   """),format.raw("""}"""),format.raw/*1036.8*/("""
	   """),format.raw("""}"""),format.raw/*1037.6*/(""" else """),format.raw("""{"""),format.raw/*1037.13*/(""" //Action de dévalider une horaires
	     
		    box.parent().css("background-color", color3) //
		    if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*1040.56*/("""
			    var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxHeure(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*1044.8*/("""
		    if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*1045.53*/("""
		        var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxJour(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*1049.8*/("""
	   """),format.raw("""}"""),format.raw/*1050.6*/("""
	"""),format.raw("""}"""),format.raw/*1051.3*/("""

	function requeteAjaxJour(idtime, idParticipant) // ajoute la date au participant
	"""),format.raw("""{"""),format.raw/*1054.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*1055.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1057.11*/routes/*1057.17*/.Application.checkBoxJour(event.id))),format.raw/*1057.52*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1058.12*/(""""idjour" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*1058.80*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1060.30*/("""
			  //alert("Jour edit\351");
			"""),format.raw("""}"""),format.raw/*1062.5*/("""
	   """),format.raw("""}"""),format.raw/*1063.6*/(""");
	"""),format.raw("""}"""),format.raw/*1064.3*/("""

	function requeteAjaxHeure(idtime, idParticipant) // ajoute l'heure au participant
	"""),format.raw("""{"""),format.raw/*1067.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*1068.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1070.11*/routes/*1070.17*/.Application.checkBoxHoraire(event.id))),format.raw/*1070.55*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1071.12*/(""""idhoraire" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*1071.83*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1073.30*/("""
			  //alert("Horaire edit\351");
			"""),format.raw("""}"""),format.raw/*1075.5*/("""
	   """),format.raw("""}"""),format.raw/*1076.6*/(""");
	"""),format.raw("""}"""),format.raw/*1077.3*/("""


























	/*Code sur la suppression*/

	$('.deletePersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*1106.50*/("""    
	    $(this).parent().parent().parent().remove();
	    
	    
	    deletePersonne($(this).attr('id'));
	    if($('td[class="infoPersonne"]').html() == null) """),format.raw("""{"""),format.raw/*1111.56*/("""
	    	$('.titres').attr('style','display:none');
	    """),format.raw("""}"""),format.raw/*1113.7*/("""
	    $('#compte').children('td[id!=""]').each(function(i) """),format.raw("""{"""),format.raw/*1114.60*/("""$(this).html("0")"""),format.raw("""}"""),format.raw/*1114.78*/(""");

	    refreshCount();
	    
	"""),format.raw("""}"""),format.raw/*1118.3*/(""")

	function deletePersonne(persId)
	"""),format.raw("""{"""),format.raw/*1121.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*1122.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1124.11*/routes/*1124.17*/.Application.deleteParticipant(event.id))),format.raw/*1124.57*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1125.12*/(""""id" : "' + persId + '""""),format.raw("""}"""),format.raw/*1125.36*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1127.30*/("""
			  //alert("Participant supprim\351");
			"""),format.raw("""}"""),format.raw/*1129.5*/("""
	  """),format.raw("""}"""),format.raw/*1130.5*/(""");
	"""),format.raw("""}"""),format.raw/*1131.3*/("""


















	/*Code sur les participants obligatoires*/
	$(function()"""),format.raw("""{"""),format.raw/*1151.15*/("""
		refreshObligatoire(); 
		affichagePopulaire();
		
	"""),format.raw("""}"""),format.raw/*1155.3*/(""")	

	$(".obligatoirecb").live("click", function() """),format.raw("""{"""),format.raw/*1157.48*/(""" //click sur la checkbox "obligatoire" : mise à jour des classes sur la ligne, ajout de la propriété obligatoire dans la bdd
			
			var idParticipant = $(this).parent().parent().parent().attr("id");
			if ($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*1160.42*/("""
				$(this).html("Facultatif");
				$(this).attr("class", "obligatoirecb btn");
			"""),format.raw("""}"""),format.raw/*1163.5*/(""" else """),format.raw("""{"""),format.raw/*1163.12*/("""
				$(this).html("Obligatoire");
				$(this).attr("class", "obligatoirecb btn btn-inverse");
			"""),format.raw("""}"""),format.raw/*1166.5*/("""
			$.ajax("""),format.raw("""{"""),format.raw/*1167.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*1169.12*/routes/*1169.18*/.Application.changeObligatoire(event.id))),format.raw/*1169.58*/("""",
				data: '"""),format.raw("""{"""),format.raw/*1170.13*/(""""idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*1170.52*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*1172.31*/("""
				  affichagePopulaire();
				"""),format.raw("""}"""),format.raw/*1174.6*/("""
	   		"""),format.raw("""}"""),format.raw/*1175.8*/(""");
	   		refreshObligatoire();

		"""),format.raw("""}"""),format.raw/*1178.4*/(""")

	function checkobligatoire(idtime, type) """),format.raw("""{"""),format.raw/*1180.43*/("""//fonction qui renvoie true si tous les participants obligatoires sont présents.
		
		var ret = true;
		
		$('.obligatoire.'+type+'[id="'+idtime+'"]').each(function() """),format.raw("""{"""),format.raw/*1184.64*/("""			
			if(!($(this).is(":checked"))) """),format.raw("""{"""),format.raw/*1185.35*/("""
				
				ret = false;
			"""),format.raw("""}"""),format.raw/*1188.5*/("""
		"""),format.raw("""}"""),format.raw/*1189.4*/(""")
		return ret;
	"""),format.raw("""}"""),format.raw/*1191.3*/("""

	function refreshObligatoire() """),format.raw("""{"""),format.raw/*1193.33*/(""" // met à jour les classes "obligatoire" sur les bonnes lignes de participants
		$(".checktd").removeClass("obligatoire");
		$(".checkbox").removeClass("obligatoire");
		$(".obligatoirecb").each(function () """),format.raw("""{"""),format.raw/*1196.41*/("""
			
			if($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*1198.41*/("""					
				$(this).parent().parent().siblings(".checktd").addClass("obligatoire");
				$(this).parent().parent().siblings(".checktd").children().addClass("obligatoire");
			"""),format.raw("""}"""),format.raw/*1201.5*/("""

		"""),format.raw("""}"""),format.raw/*1203.4*/(""")
	"""),format.raw("""}"""),format.raw/*1204.3*/("""








	
	
	

	

	

	

	

	


	
	/*Code d'affichage des dates populaires*/
	function affichagePopulaire() """),format.raw("""{"""),format.raw/*1230.33*/("""
		var max = 0;
		$("#compte").children(".horaire, .jour").each( function() """),format.raw("""{"""),format.raw/*1232.62*/(""" // récupération de la valeur maximale dans les comptes
			$(this).css("background-color", color1) 
			$('.titres').children().css("background-color",color1);
			//$('.footer').html("");
			if (checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*1236.70*/("""			
				if ($(this).html() > max) """),format.raw("""{"""),format.raw/*1237.32*/("""			
					max = $(this).html();
				"""),format.raw("""}"""),format.raw/*1239.6*/("""
			"""),format.raw("""}"""),format.raw/*1240.5*/("""		
		"""),format.raw("""}"""),format.raw/*1241.4*/(""")
		$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*1242.45*/("""
			
			if ($(this).html() == max && $(this).html() != 0 && checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*1244.118*/("""			
				$(this).css("background-color", color2);				
				$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", color2);
				if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*1247.45*/("""
					var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
					$("td:contains('"+day+"')").css("background-color", color2);
					
				"""),format.raw("""}"""),format.raw/*1251.6*/("""
			"""),format.raw("""}"""),format.raw/*1252.5*/("""
		"""),format.raw("""}"""),format.raw/*1253.4*/(""")
	"""),format.raw("""}"""),format.raw/*1254.3*/("""
	</script>

""")))})),format.raw/*1257.2*/("""
"""))}
    }
    
    def render(event:Evenement,adm:Integer) = apply(event,adm)
    
    def f:((Evenement,Integer) => play.api.templates.Html) = (event,adm) => apply(event,adm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 24 13:31:44 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/editForm.scala.html
                    HASH: 8514f3bb4e12a68182262ec1adb1d8f202643be5
                    MATRIX: 769->1|886->54|918->78|1002->33|1030->52|1058->132|1097->137|1132->164|1171->166|1234->193|1248->198|1276->204|1361->253|1375->258|1403->264|1473->298|1487->303|1518->312|1560->318|1613->362|1653->364|1708->382|1723->387|1752->393|1787->395|1831->404|1866->430|1906->432|1962->452|1976->457|2009->468|2054->482|2097->490|2118->502|2158->504|2230->540|2245->546|2301->580|2362->610|2919->1132|2940->1144|2979->1145|3150->1285|3369->1469|3409->1493|3449->1495|3509->1519|3522->1523|3547->1526|3608->1551|3621->1555|3659->1571|3729->1605|3742->1609|3769->1614|3817->1627|3838->1639|3877->1640|3921->1648|3934->1652|3959->1655|4053->1717|4096->1725|4117->1737|4156->1738|4200->1746|4213->1750|4238->1753|4330->1813|4420->1872|4558->1975|4598->1999|4638->2001|4682->2010|4720->2039|4759->2040|4829->2079|4875->2089|4920->2118|4960->2120|5015->2139|5031->2146|5056->2149|5102->2159|5115->2163|5140->2166|5206->2196|5222->2203|5250->2209|5290->2213|5306->2220|5332->2224|5381->2237|5402->2249|5441->2250|5485->2258|5501->2265|5526->2268|5573->2279|5586->2283|5611->2286|5708->2350|5765->2375|5805->2384|5876->2420|5930->2458|5970->2460|6023->2477|6043->2488|6069->2492|6112->2499|6132->2510|6157->2513|6246->2567|6325->2637|6365->2639|6408->2647|6439->2669|6478->2670|6560->2721|6603->2729|6639->2756|6678->2757|6792->2854|6805->2859|6844->2860|6960->2945|7050->2999|7070->3010|7096->3014|7187->3069|7207->3080|7232->3083|7377->3192|7397->3203|7422->3206|7559->3312|7612->3330|7652->3354|7692->3356|7739->3367|7777->3396|7816->3397|7865->3410|7922->3458|7962->3460|8050->3512|8063->3516|8088->3519|8191->3585|8205->3589|8233->3594|8280->3623|8293->3628|8332->3629|8421->3682|8434->3686|8459->3689|8554->3747|8568->3751|8596->3756|8656->3784|8712->3808|8765->3825|8810->3854|8850->3856|8905->3875|8968->3929|9008->3931|9096->3983|9112->3990|9137->3993|9243->4062|9260->4069|9289->4075|9330->4079|9347->4086|9374->4090|9422->4119|9436->4124|9476->4125|9566->4178|9583->4185|9609->4188|9707->4248|9725->4255|9755->4261|9797->4265|9815->4272|9843->4276|9904->4304|9954->4321|10029->4363|10080->4382|10175->4441|10219->4475|10259->4476|10314->4498|10390->4538|10431->4562|10472->4564|10517->4573|10556->4602|10596->4603|10667->4637|10681->4641|10707->4644|10777->4682|10829->4697|10875->4726|10916->4728|10994->4769|11011->4776|11037->4779|11123->4832|11160->4837|11277->4918|11299->4930|11339->4931|11729->5289|13130->6653|13146->6659|13206->6696|13302->6755|13318->6761|13382->6802|13667->7039|13715->7051|13741->7054|13800->7065|13902->7120|13952->7123|14019->7142|14141->7216|14235->7262|14500->7480|14551->7484|14603->7489|14693->7531|14870->7660|14977->7719|15039->7733|15109->7755|15222->7831|15237->7836|15270->7846|15322->7850|15411->7892|15466->7899|15559->7945|15620->7959|15676->7968|15732->7977|15875->8072|15964->8113|16123->8225|16178->8232|16343->8350|16393->8353|16489->8401|16586->8450|16689->8505|16756->8535|16772->8541|16826->8572|16889->8587|16971->8621|17089->8691|17188->8743|17240->8748|17293->8754|17343->8757|17439->8805|17520->8838|17683->8954|17738->8961|17907->9083|17957->9086|18038->9120|18132->9166|18182->9168|18261->9200|18311->9202|18375->9218|18426->9220|18481->9226|18534->9230|18585->9232|18636->9234|18711->9260|18762->9262|18842->9294|18893->9296|18958->9312|19009->9314|19064->9320|19117->9324|19205->9365|19273->9386|19331->9397|19400->9419|19450->9422|19560->9484|19750->9626|19863->9691|19976->9757|20027->9761|20119->9805|20204->9843|20357->9949|20450->9994|20551->10048|20646->10095|20764->10165|20968->10321|21023->10328|21236->10493|21289->10499|21370->10532|21499->10613|21577->10643|21680->10699|21760->10731|21852->10775|21962->10838|22017->10845|22122->10903|22174->10908|22225->10912|22278->10918|22357->10949|22536->11080|22654->11150|22829->11278|22884->11286|23001->11355|23123->11429|23295->11554|23353->11565|23405->11570|23678->11795|23838->11907|23909->11930|24056->12030|24128->12054|24278->12157|24333->12165|24386->12171|24475->12212|24635->12324|24705->12346|24806->12399|25041->12587|25093->12592|25148->12600|25201->12606|25287->12644|25447->12756|25517->12778|25646->12859|25734->12900|25789->12907|25882->12953|26022->13046|26099->13075|26195->13124|26250->13132|26303->13138|26460->13248|26520->13260|26585->13288|26601->13294|26661->13331|26723->13345|26856->13430|26972->13498|27066->13544|27178->13609|27870->14265|27911->14289|27952->14291|28000->14303|28039->14332|28079->14333|28196->14412|28211->14416|28238->14419|28330->14473|28345->14477|28374->14482|28419->14493|28465->14503|28511->14532|28552->14534|28696->14641|28713->14648|28739->14651|28834->14708|28852->14715|28882->14721|28924->14725|28942->14732|28970->14736|29041->14775|29116->14818|29285->14940|29351->14959|29403->14964|29494->15007|29637->15102|29762->15180|29824->15195|29911->15234|30026->15301|30189->15416|30310->15490|30386->15519|30437->15523|30667->15705|30800->15791|30895->15838|30956->15862|30997->15886|31038->15888|31077->15890|31091->15894|31119->15899|31154->15901|31288->15987|31383->16035|31514->16118|31601->16158|31656->16165|31716->16177|31783->16207|31799->16213|31852->16243|31915->16258|32005->16300|32123->16370|32993->17193|33045->17198|33099->17205|33149->17208|33231->17242|33407->17370|33607->17523|33689->17557|33884->17705|33934->17708|34030->17756|34211->17889|34281->17911|34349->17931|34418->17963|34434->17969|34490->18002|34554->18018|34632->18048|34752->18120|34822->18142|34895->18178|34911->18184|34968->18218|35034->18236|35192->18346|35316->18422|35381->18440|35451->18463|35507->18472|35560->18478|35688->18569|35703->18574|35729->18577|35829->18640|35844->18645|35870->18648|35981->18712|36058->18741|36154->18790|36209->18798|36262->18804|36333->18827|36552->18998|36665->19063|36778->19129|36829->19133|36921->19177|37006->19215|37134->19296|37208->19322|37312->19379|37493->19512|37583->19554|37648->19582|37664->19588|37723->19624|37785->19638|37917->19722|38033->19790|38112->19832|38127->19837|38153->19840|38255->19895|38333->19925|38489->20034|38540->20038|38594->20045|38685->20088|38774->20129|38841->20159|38857->20165|38913->20198|38976->20213|39064->20253|39182->20323|39262->20366|39277->20371|39303->20374|39405->20429|39483->20459|39633->20562|39685->20567|39742->20577|39893->20680|40000->20739|40110->20801|40210->20853|40279->20885|40295->20891|40340->20913|40404->20929|40504->20981|40624->21053|40771->21153|40826->21161|40888->21176|40943->21183|41017->21210|41076->21222|41131->21229|41812->21863|41868->21872|41944->21900|42460->22369|42559->22421|42619->22433|42684->22461|42700->22467|42760->22504|42822->22518|42929->22577|43045->22645|43135->22688|43187->22693|43239->22698|43331->22742|43433->22796|43535->22850|43619->22886|43720->22939|43810->22981|43866->22988|43951->23024|44053->23078|44151->23128|44297->23225|44399->23278|44499->23330|44556->23339|44612->23347|44663->23350|44744->23382|44963->23552|45170->23710|45421->23913|45527->23970|45768->24163|45822->24169|45878->24176|46079->24328|46311->24512|46413->24565|46644->24748|46698->24754|46749->24757|46883->24843|46944->24855|47010->24883|47027->24889|47086->24924|47149->24938|47266->25006|47383->25074|47467->25110|47521->25116|47574->25121|47709->25208|47770->25220|47836->25248|47853->25254|47915->25292|47978->25306|48098->25377|48215->25445|48302->25484|48356->25490|48409->25495|48564->25601|48776->25764|48880->25820|48989->25880|49056->25898|49137->25931|49223->25969|49284->25981|49350->26009|49367->26015|49431->26055|49494->26069|49567->26093|49684->26161|49778->26207|49831->26212|49884->26217|50010->26294|50113->26349|50213->26400|50502->26640|50635->26725|50691->26732|50837->26830|50898->26842|50966->26872|50983->26878|51047->26918|51111->26933|51199->26972|51318->27042|51400->27076|51456->27084|51539->27119|51633->27164|51850->27332|51937->27370|52012->27397|52064->27401|52130->27419|52213->27453|52470->27661|52564->27706|52785->27879|52838->27884|52890->27888|53048->27997|53174->28074|53479->28330|53563->28365|53647->28401|53700->28406|53754->28412|53849->28458|54021->28580|54276->28786|54506->28968|54559->28973|54611->28977|54663->28981|54710->28995
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|39->10|39->10|39->10|42->13|42->13|42->13|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|45->16|45->16|45->16|46->17|46->17|46->17|47->18|49->20|49->20|49->20|50->21|50->21|50->21|51->22|67->38|67->38|67->38|70->41|76->47|76->47|76->47|77->48|77->48|77->48|77->48|77->48|77->48|78->49|78->49|78->49|79->50|79->50|79->50|79->50|79->50|79->50|79->50|80->51|80->51|80->51|80->51|80->51|80->51|80->51|82->53|85->56|85->56|85->56|86->57|86->57|86->57|88->59|89->60|89->60|89->60|90->61|90->61|90->61|90->61|90->61|90->61|91->62|91->62|91->62|91->62|91->62|91->62|92->63|92->63|92->63|92->63|92->63|92->63|92->63|92->63|92->63|92->63|94->65|96->67|100->71|100->71|100->71|101->72|101->72|101->72|101->72|101->72|101->72|102->73|102->73|102->73|103->74|103->74|103->74|105->76|106->77|106->77|106->77|108->79|108->79|108->79|110->81|112->83|112->83|112->83|113->84|113->84|113->84|114->85|114->85|114->85|115->86|117->88|117->88|117->88|118->89|118->89|118->89|119->90|119->90|119->90|120->91|120->91|120->91|120->91|120->91|120->91|121->92|121->92|121->92|122->93|122->93|122->93|122->93|122->93|122->93|123->94|125->96|126->97|126->97|126->97|127->98|127->98|127->98|128->99|128->99|128->99|128->99|128->99|128->99|128->99|128->99|128->99|129->100|129->100|129->100|130->101|130->101|130->101|130->101|130->101|130->101|130->101|130->101|130->101|131->102|132->103|133->104|135->106|139->110|139->110|139->110|139->110|141->112|141->112|141->112|142->113|142->113|142->113|143->114|143->114|143->114|144->115|145->116|145->116|145->116|146->117|146->117|146->117|147->118|148->119|162->133|162->133|162->133|172->143|222->193|222->193|222->193|223->194|223->194|223->194|250->221|252->223|252->223|252->223|254->225|255->226|257->228|260->231|262->233|267->238|268->239|269->240|271->242|276->247|276->247|277->248|278->249|281->252|281->252|281->252|281->252|283->254|283->254|285->256|287->258|288->259|291->262|329->300|331->302|334->305|334->305|337->308|338->309|340->311|342->313|345->316|347->318|347->318|347->318|348->319|348->319|350->321|352->323|353->324|354->325|355->326|358->329|360->331|364->335|364->335|368->339|369->340|372->343|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|376->347|378->349|380->351|382->353|383->354|413->384|417->388|418->389|420->391|421->392|423->394|425->396|430->401|432->403|435->406|437->408|438->409|441->412|441->412|444->415|445->416|447->418|449->420|451->422|453->424|455->426|456->427|458->429|458->429|460->431|461->432|462->433|464->435|468->439|469->440|472->443|475->446|477->448|479->450|482->453|485->456|487->458|488->459|532->503|537->508|538->509|541->512|542->513|545->516|546->517|548->519|551->522|556->527|557->528|560->531|565->536|566->537|567->538|569->540|571->542|576->547|577->548|580->551|582->553|582->553|584->555|588->559|590->561|592->563|593->564|595->566|629->600|630->601|632->603|632->603|632->603|633->604|633->604|635->606|637->608|639->610|648->619|648->619|648->619|649->620|649->620|649->620|649->620|649->620|649->620|649->620|649->620|649->620|649->620|650->621|650->621|650->621|651->622|651->622|651->622|651->622|651->622|651->622|651->622|651->622|651->622|652->623|653->624|659->630|660->631|661->632|663->634|668->639|672->643|675->646|677->648|679->650|682->653|685->656|687->658|689->660|727->698|731->702|733->704|734->705|734->705|734->705|734->705|734->705|734->705|734->705|736->707|738->709|741->712|743->714|743->714|744->715|746->717|746->717|746->717|747->718|747->718|749->720|770->741|771->742|772->743|773->744|775->746|781->752|784->755|785->756|789->760|790->761|792->763|798->769|799->770|801->772|803->774|803->774|803->774|804->775|804->775|806->777|808->779|810->781|810->781|810->781|811->782|813->784|815->786|817->788|818->789|819->790|820->791|824->795|824->795|824->795|826->797|826->797|826->797|833->804|835->806|837->808|838->809|840->811|842->813|847->818|848->819|850->821|851->822|853->824|855->826|860->831|862->833|866->837|895->866|899->870|901->872|901->872|901->872|902->873|902->873|904->875|905->876|905->876|905->876|907->878|908->879|910->881|911->882|913->884|915->886|919->890|921->892|921->892|921->892|922->893|922->893|924->895|925->896|925->896|925->896|927->898|928->899|930->901|931->902|933->904|964->935|966->937|967->938|969->940|971->942|971->942|971->942|972->943|972->943|974->945|979->950|980->951|982->953|982->953|984->955|986->957|986->957|996->967|999->970|1001->972|1010->981|1013->984|1014->985|1016->987|1016->987|1016->987|1017->988|1017->988|1019->990|1021->992|1022->993|1023->994|1025->996|1026->997|1027->998|1028->999|1030->1001|1032->1003|1032->1003|1033->1004|1035->1006|1037->1008|1042->1013|1043->1014|1045->1016|1046->1017|1047->1018|1048->1019|1050->1021|1054->1025|1056->1027|1060->1031|1061->1032|1065->1036|1066->1037|1066->1037|1069->1040|1073->1044|1074->1045|1078->1049|1079->1050|1080->1051|1083->1054|1084->1055|1086->1057|1086->1057|1086->1057|1087->1058|1087->1058|1089->1060|1091->1062|1092->1063|1093->1064|1096->1067|1097->1068|1099->1070|1099->1070|1099->1070|1100->1071|1100->1071|1102->1073|1104->1075|1105->1076|1106->1077|1135->1106|1140->1111|1142->1113|1143->1114|1143->1114|1147->1118|1150->1121|1151->1122|1153->1124|1153->1124|1153->1124|1154->1125|1154->1125|1156->1127|1158->1129|1159->1130|1160->1131|1180->1151|1184->1155|1186->1157|1189->1160|1192->1163|1192->1163|1195->1166|1196->1167|1198->1169|1198->1169|1198->1169|1199->1170|1199->1170|1201->1172|1203->1174|1204->1175|1207->1178|1209->1180|1213->1184|1214->1185|1217->1188|1218->1189|1220->1191|1222->1193|1225->1196|1227->1198|1230->1201|1232->1203|1233->1204|1259->1230|1261->1232|1265->1236|1266->1237|1268->1239|1269->1240|1270->1241|1271->1242|1273->1244|1276->1247|1280->1251|1281->1252|1282->1253|1283->1254|1286->1257
                    -- GENERATED --
                */
            