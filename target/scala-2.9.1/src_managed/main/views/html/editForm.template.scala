
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

				$('#divtest').load('/KIND/eventEdit/"""),_display_(Seq[Any](/*793.42*/event/*793.47*/.id)),format.raw/*793.50*/("""/adm #divtest');	
				
				$( this ).dialog( "close" );
				
				$('#divtest').load('/KIND/eventEdit/"""),_display_(Seq[Any](/*797.42*/event/*797.47*/.id)),format.raw/*797.50*/("""/adm #divtest');
				
				
				setTimeout(styles, 1500);



								
			"""),format.raw("""}"""),format.raw/*805.5*/(""",

			"Annuler": function() """),format.raw("""{"""),format.raw/*807.27*/("""							
				$( this ).dialog( "close" );				
			"""),format.raw("""}"""),format.raw/*809.5*/("""				
		"""),format.raw("""}"""),format.raw/*810.4*/("""
		
	"""),format.raw("""}"""),format.raw/*812.3*/(""");

	function styles()"""),format.raw("""{"""),format.raw/*814.20*/("""
		

		$("tr").attr("style", "");
		$("table.datesTable td").css("background-color", color3);
		$(".checkbox").attr("disabled", "true"); 

		$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*821.37*/(""" // coloration des box checkées
		  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*822.34*/("""
		  		$(this).parent().css("background-color", "#66CC99");
		  	"""),format.raw("""}"""),format.raw/*824.7*/("""
		"""),format.raw("""}"""),format.raw/*825.4*/(""");

		$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*827.41*/("""
			$('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*829.4*/(""");

		refreshCount(); // maj de la ligne de compteurs

		affichagePopulaire();
	"""),format.raw("""}"""),format.raw/*834.3*/("""

	function pad2(number) """),format.raw("""{"""),format.raw/*836.25*/("""
   
    	return (number < 10 ? '0' : '') + number
   
	"""),format.raw("""}"""),format.raw/*840.3*/("""


























	/* Code concernant la suppression d'horaires et de jours*/
	 
	$(".horaireDel").live("click", function()"""),format.raw("""{"""),format.raw/*869.44*/("""
		var thisse = $(this);
		
			
		$.ajax("""),format.raw("""{"""),format.raw/*873.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*875.11*/routes/*875.17*/.Application.deleteHoraire(event.id))),format.raw/*875.53*/("""",
			data: '"""),format.raw("""{"""),format.raw/*876.12*/(""""jour" : "' + $(this).attr("idjour") + '", "horaire" : "' + $(this).attr("id") + '""""),format.raw("""}"""),format.raw/*876.96*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*878.30*/("""
				$('#divtest').load('/KIND/eventEdit/"""),_display_(Seq[Any](/*879.42*/event/*879.47*/.id)),format.raw/*879.50*/("""/adm #divtest');
				setTimeout(styles, 1000);				
			"""),format.raw("""}"""),format.raw/*881.5*/(""", 
			error : function(data) """),format.raw("""{"""),format.raw/*882.28*/("""
				alert("impossible de supprimer l'horaire, vérifiez que personne n'est disponible à cet horaire-ci")
			"""),format.raw("""}"""),format.raw/*884.5*/("""
		"""),format.raw("""}"""),format.raw/*885.4*/(""");	

	"""),format.raw("""}"""),format.raw/*887.3*/(""")

	$(".jourDel").live("click", function()"""),format.raw("""{"""),format.raw/*889.41*/("""
		var thisse = $(this);
		
		
		$.ajax("""),format.raw("""{"""),format.raw/*893.11*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*895.12*/routes/*895.18*/.Application.removeDate(event.id))),format.raw/*895.51*/("""",
				data: '"""),format.raw("""{"""),format.raw/*896.13*/(""""idDate" : "' + $(this).attr("id") + '""""),format.raw("""}"""),format.raw/*896.53*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*898.31*/("""
					$('#divtest').load('/KIND/eventEdit/"""),_display_(Seq[Any](/*899.43*/event/*899.48*/.id)),format.raw/*899.51*/("""/adm #divtest');
					setTimeout(styles, 1000);		
				"""),format.raw("""}"""),format.raw/*901.6*/(""",
				error : function(data) """),format.raw("""{"""),format.raw/*902.29*/("""
					alert("impossible de supprimer le jour, vérifiez que personne n'est disponible ce jour-ci")
				"""),format.raw("""}"""),format.raw/*904.6*/("""
			"""),format.raw("""}"""),format.raw/*905.5*/(""");				

	"""),format.raw("""}"""),format.raw/*907.3*/(""")
	



























	/*Code sur l'édition*/

	$('.editPersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*938.48*/("""
		
	    if(!$(this).parents("tr").hasClass("editable"))  """),format.raw("""{"""),format.raw/*940.56*/("""	    	
	    	if ($(this).siblings("i").hasClass("icon-lock"))"""),format.raw("""{"""),format.raw/*941.56*/("""
	    		currentEditButton = $(this);
	    		$.ajax("""),format.raw("""{"""),format.raw/*943.16*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*945.13*/routes/*945.19*/.Application.getPass())),format.raw/*945.41*/("""",
					data: '"""),format.raw("""{"""),format.raw/*946.14*/(""" "idpers" : "'+$(this).parents("tr").attr("id")+'" """),format.raw("""}"""),format.raw/*946.66*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*948.32*/("""
						goodPass = data.pass;

						$( "#dialog-check-pwd" ).dialog( "open" );	
											  
					"""),format.raw("""}"""),format.raw/*953.7*/("""
			   """),format.raw("""}"""),format.raw/*954.8*/(""");			
				
			"""),format.raw("""}"""),format.raw/*956.5*/(""" else """),format.raw("""{"""),format.raw/*956.12*/("""
				edition($(this));
			"""),format.raw("""}"""),format.raw/*958.5*/("""
		  
	    """),format.raw("""}"""),format.raw/*960.7*/(""" else """),format.raw("""{"""),format.raw/*960.14*/("""
	      $(this).html("<i class=\"mesicones icon-pencil\"></i>");
	      $(this).parents("tr").removeClass("editable");
	      $(this).siblings('input[type="text"]').attr("readonly", "readonly");
	      $(this).parent().parent().parent().children("td").children('input[type="checkbox"]').attr("disabled","true"); 
	      $(this).parent().parent().parent().children("td").css("border", "none");
	      $(".hoverable").off();	      
	      $(this).parent().parent().parent().children(".checktd").attr("class", "checktd");
	      refreshHoverable();
	      editPersonne($(this).attr('id'), $(this).siblings("input").attr("value"));
	    """),format.raw("""}"""),format.raw/*970.7*/("""
	
	  
	"""),format.raw("""}"""),format.raw/*973.3*/(""")

	function edition(elem) """),format.raw("""{"""),format.raw/*975.26*/("""
		elem.html("<i class=\"mesicones icon-ok\"></i>");
		elem.parents("tr").addClass("editable");
		elem.siblings('input[type="text"]').removeAttr("readonly");
		elem.parent().parent().parent().children("td").children().removeAttr("disabled");
		elem.parent().parent().parent().children("td").css("border", "solid black 2px");
		$(".hoverable").off();		  
		elem.parent().parent().parent().children(".checktd").attr("class", "checktd hoverable");
		refreshHoverable();
	"""),format.raw("""}"""),format.raw/*984.3*/("""

	function editPersonne(personneId, personneNom)
	"""),format.raw("""{"""),format.raw/*987.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*988.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*990.11*/routes/*990.17*/.Application.updatePersonne(event.id))),format.raw/*990.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*991.12*/(""""id" : "' + personneId + '", "nom" : "' + personneNom + '""""),format.raw("""}"""),format.raw/*991.71*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*993.30*/("""
			  //alert("Participant edit\351");
			"""),format.raw("""}"""),format.raw/*995.5*/("""
	  """),format.raw("""}"""),format.raw/*996.5*/(""");
	"""),format.raw("""}"""),format.raw/*997.3*/("""

	$('.checktd').live('click', function(e) """),format.raw("""{"""),format.raw/*999.43*/("""
		if ($(this).children().prop("disabled") == false) """),format.raw("""{"""),format.raw/*1000.54*/("""
			if ($(this).children().prop("checked") == false) """),format.raw("""{"""),format.raw/*1001.54*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*1002.36*/("""
					$(this).children().prop("checked", true);
				"""),format.raw("""}"""),format.raw/*1004.6*/("""
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*1006.5*/(""" else """),format.raw("""{"""),format.raw/*1006.12*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*1007.36*/("""
					$(this).children().prop("checked", false);
				"""),format.raw("""}"""),format.raw/*1009.6*/("""        
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*1011.5*/("""

			affichagePopulaire();

			//$('.populaires').html("");
			$('.titres td').each( function() """),format.raw("""{"""),format.raw/*1016.38*/("""
				if ($(this).css('background-color') == color2) """),format.raw("""{"""),format.raw/*1017.53*/("""
					$('.populaires').append($(this).html());
				"""),format.raw("""}"""),format.raw/*1019.6*/("""				
			"""),format.raw("""}"""),format.raw/*1020.5*/(""")			
		"""),format.raw("""}"""),format.raw/*1021.4*/("""
	"""),format.raw("""}"""),format.raw/*1022.3*/(""");

	function changeCheck(box) """),format.raw("""{"""),format.raw/*1024.29*/("""   // gestion des clics sur les checkboxes
	   var idtime = box.attr('id');
	   var idParticipant = box.parent().parent().attr('id');   
	   
	   if (box.is(':checked'))"""),format.raw("""{"""),format.raw/*1028.29*/("""	 //Action de valider une horaire  		
	       		box.parent().css("background-color", "#66CC99")//vert
		   		if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*1030.57*/("""
		            var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
		       	    requeteAjaxHeure(idtime, idParticipant);
			    """),format.raw("""}"""),format.raw/*1034.9*/("""
	       		if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*1035.57*/("""	
	    	   	    var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
				    requeteAjaxJour(idtime, idParticipant);
			   """),format.raw("""}"""),format.raw/*1039.8*/("""
	   """),format.raw("""}"""),format.raw/*1040.6*/(""" else """),format.raw("""{"""),format.raw/*1040.13*/(""" //Action de dévalider une horaires
	     
		    box.parent().css("background-color", color3) //
		    if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*1043.56*/("""
			    var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxHeure(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*1047.8*/("""
		    if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*1048.53*/("""
		        var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxJour(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*1052.8*/("""
	   """),format.raw("""}"""),format.raw/*1053.6*/("""
	"""),format.raw("""}"""),format.raw/*1054.3*/("""

	function requeteAjaxJour(idtime, idParticipant) // ajoute la date au participant
	"""),format.raw("""{"""),format.raw/*1057.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*1058.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1060.11*/routes/*1060.17*/.Application.checkBoxJour(event.id))),format.raw/*1060.52*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1061.12*/(""""idjour" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*1061.80*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1063.30*/("""
			  //alert("Jour edit\351");
			"""),format.raw("""}"""),format.raw/*1065.5*/("""
	   """),format.raw("""}"""),format.raw/*1066.6*/(""");
	"""),format.raw("""}"""),format.raw/*1067.3*/("""

	function requeteAjaxHeure(idtime, idParticipant) // ajoute l'heure au participant
	"""),format.raw("""{"""),format.raw/*1070.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*1071.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1073.11*/routes/*1073.17*/.Application.checkBoxHoraire(event.id))),format.raw/*1073.55*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1074.12*/(""""idhoraire" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*1074.83*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1076.30*/("""
			  //alert("Horaire edit\351");
			"""),format.raw("""}"""),format.raw/*1078.5*/("""
	   """),format.raw("""}"""),format.raw/*1079.6*/(""");
	"""),format.raw("""}"""),format.raw/*1080.3*/("""


























	/*Code sur la suppression*/

	$('.deletePersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*1109.50*/("""    
	    $(this).parent().parent().parent().remove();
	    
	    
	    deletePersonne($(this).attr('id'));
	    if($('td[class="infoPersonne"]').html() == null) """),format.raw("""{"""),format.raw/*1114.56*/("""
	    	$('.titres').attr('style','display:none');
	    """),format.raw("""}"""),format.raw/*1116.7*/("""
	    $('#compte').children('td[id!=""]').each(function(i) """),format.raw("""{"""),format.raw/*1117.60*/("""$(this).html("0")"""),format.raw("""}"""),format.raw/*1117.78*/(""");

	    refreshCount();
	    
	"""),format.raw("""}"""),format.raw/*1121.3*/(""")

	function deletePersonne(persId)
	"""),format.raw("""{"""),format.raw/*1124.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*1125.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1127.11*/routes/*1127.17*/.Application.deleteParticipant(event.id))),format.raw/*1127.57*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1128.12*/(""""id" : "' + persId + '""""),format.raw("""}"""),format.raw/*1128.36*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1130.30*/("""
			  //alert("Participant supprim\351");
			"""),format.raw("""}"""),format.raw/*1132.5*/("""
	  """),format.raw("""}"""),format.raw/*1133.5*/(""");
	"""),format.raw("""}"""),format.raw/*1134.3*/("""


















	/*Code sur les participants obligatoires*/
	$(function()"""),format.raw("""{"""),format.raw/*1154.15*/("""
		refreshObligatoire(); 
		affichagePopulaire();
		
	"""),format.raw("""}"""),format.raw/*1158.3*/(""")	

	$(".obligatoirecb").live("click", function() """),format.raw("""{"""),format.raw/*1160.48*/(""" //click sur la checkbox "obligatoire" : mise à jour des classes sur la ligne, ajout de la propriété obligatoire dans la bdd
			
			var idParticipant = $(this).parent().parent().parent().attr("id");
			if ($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*1163.42*/("""
				$(this).html("Facultatif");
				$(this).attr("class", "obligatoirecb btn");
			"""),format.raw("""}"""),format.raw/*1166.5*/(""" else """),format.raw("""{"""),format.raw/*1166.12*/("""
				$(this).html("Obligatoire");
				$(this).attr("class", "obligatoirecb btn btn-inverse");
			"""),format.raw("""}"""),format.raw/*1169.5*/("""
			$.ajax("""),format.raw("""{"""),format.raw/*1170.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*1172.12*/routes/*1172.18*/.Application.changeObligatoire(event.id))),format.raw/*1172.58*/("""",
				data: '"""),format.raw("""{"""),format.raw/*1173.13*/(""""idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*1173.52*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*1175.31*/("""
				  affichagePopulaire();
				"""),format.raw("""}"""),format.raw/*1177.6*/("""
	   		"""),format.raw("""}"""),format.raw/*1178.8*/(""");
	   		refreshObligatoire();

		"""),format.raw("""}"""),format.raw/*1181.4*/(""")

	function checkobligatoire(idtime, type) """),format.raw("""{"""),format.raw/*1183.43*/("""//fonction qui renvoie true si tous les participants obligatoires sont présents.
		
		var ret = true;
		
		$('.obligatoire.'+type+'[id="'+idtime+'"]').each(function() """),format.raw("""{"""),format.raw/*1187.64*/("""			
			if(!($(this).is(":checked"))) """),format.raw("""{"""),format.raw/*1188.35*/("""
				
				ret = false;
			"""),format.raw("""}"""),format.raw/*1191.5*/("""
		"""),format.raw("""}"""),format.raw/*1192.4*/(""")
		return ret;
	"""),format.raw("""}"""),format.raw/*1194.3*/("""

	function refreshObligatoire() """),format.raw("""{"""),format.raw/*1196.33*/(""" // met à jour les classes "obligatoire" sur les bonnes lignes de participants
		$(".checktd").removeClass("obligatoire");
		$(".checkbox").removeClass("obligatoire");
		$(".obligatoirecb").each(function () """),format.raw("""{"""),format.raw/*1199.41*/("""
			
			if($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*1201.41*/("""					
				$(this).parent().parent().siblings(".checktd").addClass("obligatoire");
				$(this).parent().parent().siblings(".checktd").children().addClass("obligatoire");
			"""),format.raw("""}"""),format.raw/*1204.5*/("""

		"""),format.raw("""}"""),format.raw/*1206.4*/(""")
	"""),format.raw("""}"""),format.raw/*1207.3*/("""








	
	
	

	

	

	

	

	


	
	/*Code d'affichage des dates populaires*/
	function affichagePopulaire() """),format.raw("""{"""),format.raw/*1233.33*/("""
		var max = 0;
		$("#compte").children(".horaire, .jour").each( function() """),format.raw("""{"""),format.raw/*1235.62*/(""" // récupération de la valeur maximale dans les comptes
			$(this).css("background-color", color1) 
			$('.titres').children().css("background-color",color1);
			//$('.footer').html("");
			if (checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*1239.70*/("""			
				if ($(this).html() > max) """),format.raw("""{"""),format.raw/*1240.32*/("""			
					max = $(this).html();
				"""),format.raw("""}"""),format.raw/*1242.6*/("""
			"""),format.raw("""}"""),format.raw/*1243.5*/("""		
		"""),format.raw("""}"""),format.raw/*1244.4*/(""")
		$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*1245.45*/("""
			
			if ($(this).html() == max && $(this).html() != 0 && checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*1247.118*/("""			
				$(this).css("background-color", color2);				
				$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", color2);
				if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*1250.45*/("""
					var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
					$("td:contains('"+day+"')").css("background-color", color2);
					
				"""),format.raw("""}"""),format.raw/*1254.6*/("""
			"""),format.raw("""}"""),format.raw/*1255.5*/("""
		"""),format.raw("""}"""),format.raw/*1256.4*/(""")
	"""),format.raw("""}"""),format.raw/*1257.3*/("""
	</script>

""")))})),format.raw/*1260.2*/("""
"""))}
    }
    
    def render(event:Evenement,adm:Integer) = apply(event,adm)
    
    def f:((Evenement,Integer) => play.api.templates.Html) = (event,adm) => apply(event,adm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 24 14:06:50 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/editForm.scala.html
                    HASH: e8cd28aa12326f63accf3c99781bcde7b38ec1e2
                    MATRIX: 769->1|886->54|918->78|1002->33|1030->52|1058->132|1097->137|1132->164|1171->166|1234->193|1248->198|1276->204|1361->253|1375->258|1403->264|1473->298|1487->303|1518->312|1560->318|1613->362|1653->364|1708->382|1723->387|1752->393|1787->395|1831->404|1866->430|1906->432|1962->452|1976->457|2009->468|2054->482|2097->490|2118->502|2158->504|2230->540|2245->546|2301->580|2362->610|2919->1132|2940->1144|2979->1145|3150->1285|3369->1469|3409->1493|3449->1495|3509->1519|3522->1523|3547->1526|3608->1551|3621->1555|3659->1571|3729->1605|3742->1609|3769->1614|3817->1627|3838->1639|3877->1640|3921->1648|3934->1652|3959->1655|4053->1717|4096->1725|4117->1737|4156->1738|4200->1746|4213->1750|4238->1753|4330->1813|4420->1872|4558->1975|4598->1999|4638->2001|4682->2010|4720->2039|4759->2040|4829->2079|4875->2089|4920->2118|4960->2120|5015->2139|5031->2146|5056->2149|5102->2159|5115->2163|5140->2166|5206->2196|5222->2203|5250->2209|5290->2213|5306->2220|5332->2224|5381->2237|5402->2249|5441->2250|5485->2258|5501->2265|5526->2268|5573->2279|5586->2283|5611->2286|5708->2350|5765->2375|5805->2384|5876->2420|5930->2458|5970->2460|6023->2477|6043->2488|6069->2492|6112->2499|6132->2510|6157->2513|6246->2567|6325->2637|6365->2639|6408->2647|6439->2669|6478->2670|6560->2721|6603->2729|6639->2756|6678->2757|6792->2854|6805->2859|6844->2860|6960->2945|7050->2999|7070->3010|7096->3014|7187->3069|7207->3080|7232->3083|7377->3192|7397->3203|7422->3206|7559->3312|7612->3330|7652->3354|7692->3356|7739->3367|7777->3396|7816->3397|7865->3410|7922->3458|7962->3460|8050->3512|8063->3516|8088->3519|8191->3585|8205->3589|8233->3594|8280->3623|8293->3628|8332->3629|8421->3682|8434->3686|8459->3689|8554->3747|8568->3751|8596->3756|8656->3784|8712->3808|8765->3825|8810->3854|8850->3856|8905->3875|8968->3929|9008->3931|9096->3983|9112->3990|9137->3993|9243->4062|9260->4069|9289->4075|9330->4079|9347->4086|9374->4090|9422->4119|9436->4124|9476->4125|9566->4178|9583->4185|9609->4188|9707->4248|9725->4255|9755->4261|9797->4265|9815->4272|9843->4276|9904->4304|9954->4321|10029->4363|10080->4382|10175->4441|10219->4475|10259->4476|10314->4498|10390->4538|10431->4562|10472->4564|10517->4573|10556->4602|10596->4603|10667->4637|10681->4641|10707->4644|10777->4682|10829->4697|10875->4726|10916->4728|10994->4769|11011->4776|11037->4779|11123->4832|11160->4837|11277->4918|11299->4930|11339->4931|11729->5289|13130->6653|13146->6659|13206->6696|13302->6755|13318->6761|13382->6802|13667->7039|13715->7051|13741->7054|13800->7065|13902->7120|13952->7123|14019->7142|14141->7216|14235->7262|14500->7480|14551->7484|14603->7489|14693->7531|14870->7660|14977->7719|15039->7733|15109->7755|15222->7831|15237->7836|15270->7846|15322->7850|15411->7892|15466->7899|15559->7945|15620->7959|15676->7968|15732->7977|15875->8072|15964->8113|16123->8225|16178->8232|16343->8350|16393->8353|16489->8401|16586->8450|16689->8505|16756->8535|16772->8541|16826->8572|16889->8587|16971->8621|17089->8691|17188->8743|17240->8748|17293->8754|17343->8757|17439->8805|17520->8838|17683->8954|17738->8961|17907->9083|17957->9086|18038->9120|18132->9166|18182->9168|18261->9200|18311->9202|18375->9218|18426->9220|18481->9226|18534->9230|18585->9232|18636->9234|18711->9260|18762->9262|18842->9294|18893->9296|18958->9312|19009->9314|19064->9320|19117->9324|19205->9365|19273->9386|19331->9397|19400->9419|19450->9422|19560->9484|19750->9626|19863->9691|19976->9757|20027->9761|20119->9805|20204->9843|20357->9949|20450->9994|20551->10048|20646->10095|20764->10165|20968->10321|21023->10328|21236->10493|21289->10499|21370->10532|21499->10613|21577->10643|21680->10699|21760->10731|21852->10775|21962->10838|22017->10845|22122->10903|22174->10908|22225->10912|22278->10918|22357->10949|22536->11080|22654->11150|22829->11278|22884->11286|23001->11355|23123->11429|23295->11554|23353->11565|23405->11570|23678->11795|23838->11907|23909->11930|24056->12030|24128->12054|24278->12157|24333->12165|24386->12171|24475->12212|24635->12324|24705->12346|24806->12399|25041->12587|25093->12592|25148->12600|25201->12606|25287->12644|25447->12756|25517->12778|25646->12859|25734->12900|25789->12907|25882->12953|26022->13046|26099->13075|26195->13124|26250->13132|26303->13138|26460->13248|26520->13260|26585->13288|26601->13294|26661->13331|26723->13345|26856->13430|26972->13498|27066->13544|27178->13609|27870->14265|27911->14289|27952->14291|28000->14303|28039->14332|28079->14333|28196->14412|28211->14416|28238->14419|28330->14473|28345->14477|28374->14482|28419->14493|28465->14503|28511->14532|28552->14534|28696->14641|28713->14648|28739->14651|28834->14708|28852->14715|28882->14721|28924->14725|28942->14732|28970->14736|29041->14775|29116->14818|29285->14940|29351->14959|29403->14964|29494->15007|29637->15102|29762->15180|29824->15195|29911->15234|30026->15301|30189->15416|30310->15490|30386->15519|30437->15523|30667->15705|30800->15791|30895->15838|30956->15862|30997->15886|31038->15888|31077->15890|31091->15894|31119->15899|31154->15901|31288->15987|31383->16035|31514->16118|31601->16158|31656->16165|31716->16177|31783->16207|31799->16213|31852->16243|31915->16258|32005->16300|32123->16370|32993->17193|33045->17198|33099->17205|33149->17208|33231->17242|33407->17370|33607->17523|33689->17557|33884->17705|33934->17708|34030->17756|34211->17889|34281->17911|34349->17931|34418->17963|34434->17969|34490->18002|34554->18018|34632->18048|34752->18120|34822->18142|34895->18178|34911->18184|34968->18218|35034->18236|35192->18346|35316->18422|35381->18440|35451->18463|35507->18472|35560->18478|35645->18526|35660->18531|35686->18534|35825->18636|35840->18641|35866->18644|35986->18717|36063->18746|36159->18795|36214->18803|36267->18809|36338->18832|36561->19007|36674->19072|36787->19138|36838->19142|36930->19186|37015->19224|37143->19305|37217->19331|37321->19388|37502->19521|37592->19563|37657->19591|37673->19597|37732->19633|37794->19647|37926->19731|38042->19799|38121->19841|38136->19846|38162->19849|38264->19904|38342->19934|38498->20043|38549->20047|38603->20054|38694->20097|38783->20138|38850->20168|38866->20174|38922->20207|38985->20222|39073->20262|39191->20332|39271->20375|39286->20380|39312->20383|39414->20438|39492->20468|39642->20571|39694->20576|39751->20586|39902->20689|40009->20748|40119->20810|40219->20862|40288->20894|40304->20900|40349->20922|40413->20938|40513->20990|40633->21062|40780->21162|40835->21170|40897->21185|40952->21192|41026->21219|41085->21231|41140->21238|41821->21872|41877->21881|41953->21909|42469->22378|42568->22430|42628->22442|42693->22470|42709->22476|42769->22513|42831->22527|42938->22586|43054->22654|43144->22697|43196->22702|43248->22707|43340->22751|43443->22805|43546->22859|43631->22895|43732->22948|43822->22990|43878->22997|43963->23033|44065->23087|44163->23137|44309->23234|44411->23287|44511->23339|44568->23348|44624->23356|44675->23359|44756->23391|44975->23561|45182->23719|45433->23922|45539->23979|45780->24172|45834->24178|45890->24185|46091->24337|46323->24521|46425->24574|46656->24757|46710->24763|46761->24766|46895->24852|46956->24864|47022->24892|47039->24898|47098->24933|47161->24947|47278->25015|47395->25083|47479->25119|47533->25125|47586->25130|47721->25217|47782->25229|47848->25257|47865->25263|47927->25301|47990->25315|48110->25386|48227->25454|48314->25493|48368->25499|48421->25504|48576->25610|48788->25773|48892->25829|49001->25889|49068->25907|49149->25940|49235->25978|49296->25990|49362->26018|49379->26024|49443->26064|49506->26078|49579->26102|49696->26170|49790->26216|49843->26221|49896->26226|50022->26303|50125->26358|50225->26409|50514->26649|50647->26734|50703->26741|50849->26839|50910->26851|50978->26881|50995->26887|51059->26927|51123->26942|51211->26981|51330->27051|51412->27085|51468->27093|51551->27128|51645->27173|51862->27341|51949->27379|52024->27406|52076->27410|52142->27428|52225->27462|52482->27670|52576->27715|52797->27888|52850->27893|52902->27897|53060->28006|53186->28083|53491->28339|53575->28374|53659->28410|53712->28415|53766->28421|53861->28467|54033->28589|54288->28795|54518->28977|54571->28982|54623->28986|54675->28990|54722->29004
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|39->10|39->10|39->10|42->13|42->13|42->13|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|45->16|45->16|45->16|46->17|46->17|46->17|47->18|49->20|49->20|49->20|50->21|50->21|50->21|51->22|67->38|67->38|67->38|70->41|76->47|76->47|76->47|77->48|77->48|77->48|77->48|77->48|77->48|78->49|78->49|78->49|79->50|79->50|79->50|79->50|79->50|79->50|79->50|80->51|80->51|80->51|80->51|80->51|80->51|80->51|82->53|85->56|85->56|85->56|86->57|86->57|86->57|88->59|89->60|89->60|89->60|90->61|90->61|90->61|90->61|90->61|90->61|91->62|91->62|91->62|91->62|91->62|91->62|92->63|92->63|92->63|92->63|92->63|92->63|92->63|92->63|92->63|92->63|94->65|96->67|100->71|100->71|100->71|101->72|101->72|101->72|101->72|101->72|101->72|102->73|102->73|102->73|103->74|103->74|103->74|105->76|106->77|106->77|106->77|108->79|108->79|108->79|110->81|112->83|112->83|112->83|113->84|113->84|113->84|114->85|114->85|114->85|115->86|117->88|117->88|117->88|118->89|118->89|118->89|119->90|119->90|119->90|120->91|120->91|120->91|120->91|120->91|120->91|121->92|121->92|121->92|122->93|122->93|122->93|122->93|122->93|122->93|123->94|125->96|126->97|126->97|126->97|127->98|127->98|127->98|128->99|128->99|128->99|128->99|128->99|128->99|128->99|128->99|128->99|129->100|129->100|129->100|130->101|130->101|130->101|130->101|130->101|130->101|130->101|130->101|130->101|131->102|132->103|133->104|135->106|139->110|139->110|139->110|139->110|141->112|141->112|141->112|142->113|142->113|142->113|143->114|143->114|143->114|144->115|145->116|145->116|145->116|146->117|146->117|146->117|147->118|148->119|162->133|162->133|162->133|172->143|222->193|222->193|222->193|223->194|223->194|223->194|250->221|252->223|252->223|252->223|254->225|255->226|257->228|260->231|262->233|267->238|268->239|269->240|271->242|276->247|276->247|277->248|278->249|281->252|281->252|281->252|281->252|283->254|283->254|285->256|287->258|288->259|291->262|329->300|331->302|334->305|334->305|337->308|338->309|340->311|342->313|345->316|347->318|347->318|347->318|348->319|348->319|350->321|352->323|353->324|354->325|355->326|358->329|360->331|364->335|364->335|368->339|369->340|372->343|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|373->344|376->347|378->349|380->351|382->353|383->354|413->384|417->388|418->389|420->391|421->392|423->394|425->396|430->401|432->403|435->406|437->408|438->409|441->412|441->412|444->415|445->416|447->418|449->420|451->422|453->424|455->426|456->427|458->429|458->429|460->431|461->432|462->433|464->435|468->439|469->440|472->443|475->446|477->448|479->450|482->453|485->456|487->458|488->459|532->503|537->508|538->509|541->512|542->513|545->516|546->517|548->519|551->522|556->527|557->528|560->531|565->536|566->537|567->538|569->540|571->542|576->547|577->548|580->551|582->553|582->553|584->555|588->559|590->561|592->563|593->564|595->566|629->600|630->601|632->603|632->603|632->603|633->604|633->604|635->606|637->608|639->610|648->619|648->619|648->619|649->620|649->620|649->620|649->620|649->620|649->620|649->620|649->620|649->620|649->620|650->621|650->621|650->621|651->622|651->622|651->622|651->622|651->622|651->622|651->622|651->622|651->622|652->623|653->624|659->630|660->631|661->632|663->634|668->639|672->643|675->646|677->648|679->650|682->653|685->656|687->658|689->660|727->698|731->702|733->704|734->705|734->705|734->705|734->705|734->705|734->705|734->705|736->707|738->709|741->712|743->714|743->714|744->715|746->717|746->717|746->717|747->718|747->718|749->720|770->741|771->742|772->743|773->744|775->746|781->752|784->755|785->756|789->760|790->761|792->763|798->769|799->770|801->772|803->774|803->774|803->774|804->775|804->775|806->777|808->779|810->781|810->781|810->781|811->782|813->784|815->786|817->788|818->789|819->790|820->791|822->793|822->793|822->793|826->797|826->797|826->797|834->805|836->807|838->809|839->810|841->812|843->814|850->821|851->822|853->824|854->825|856->827|858->829|863->834|865->836|869->840|898->869|902->873|904->875|904->875|904->875|905->876|905->876|907->878|908->879|908->879|908->879|910->881|911->882|913->884|914->885|916->887|918->889|922->893|924->895|924->895|924->895|925->896|925->896|927->898|928->899|928->899|928->899|930->901|931->902|933->904|934->905|936->907|967->938|969->940|970->941|972->943|974->945|974->945|974->945|975->946|975->946|977->948|982->953|983->954|985->956|985->956|987->958|989->960|989->960|999->970|1002->973|1004->975|1013->984|1016->987|1017->988|1019->990|1019->990|1019->990|1020->991|1020->991|1022->993|1024->995|1025->996|1026->997|1028->999|1029->1000|1030->1001|1031->1002|1033->1004|1035->1006|1035->1006|1036->1007|1038->1009|1040->1011|1045->1016|1046->1017|1048->1019|1049->1020|1050->1021|1051->1022|1053->1024|1057->1028|1059->1030|1063->1034|1064->1035|1068->1039|1069->1040|1069->1040|1072->1043|1076->1047|1077->1048|1081->1052|1082->1053|1083->1054|1086->1057|1087->1058|1089->1060|1089->1060|1089->1060|1090->1061|1090->1061|1092->1063|1094->1065|1095->1066|1096->1067|1099->1070|1100->1071|1102->1073|1102->1073|1102->1073|1103->1074|1103->1074|1105->1076|1107->1078|1108->1079|1109->1080|1138->1109|1143->1114|1145->1116|1146->1117|1146->1117|1150->1121|1153->1124|1154->1125|1156->1127|1156->1127|1156->1127|1157->1128|1157->1128|1159->1130|1161->1132|1162->1133|1163->1134|1183->1154|1187->1158|1189->1160|1192->1163|1195->1166|1195->1166|1198->1169|1199->1170|1201->1172|1201->1172|1201->1172|1202->1173|1202->1173|1204->1175|1206->1177|1207->1178|1210->1181|1212->1183|1216->1187|1217->1188|1220->1191|1221->1192|1223->1194|1225->1196|1228->1199|1230->1201|1233->1204|1235->1206|1236->1207|1262->1233|1264->1235|1268->1239|1269->1240|1271->1242|1272->1243|1273->1244|1274->1245|1276->1247|1279->1250|1283->1254|1284->1255|1285->1256|1286->1257|1289->1260
                    -- GENERATED --
                */
            