
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
		<a id="newPassAdmin" class="btn btn-info" >Modifier le mot de passe admin</a>
	""")))})),format.raw/*23.3*/("""


	
	<br><br>
	<h3>Inviter des personnes à l'évenement</h3>

	<div class="selectDate" style="position:relative">
		<textarea id="mailsArea" title="Adresses email s&eacute;par&eacute;es par une virgule" rows="4" style="color:grey" placeholder="Entrez ici les adresses mail séparées par une virgule ..."></textarea>
		<i class="checkmail mesicones icon-remove"></i>
		<a id="envoiLien" disabled="true" class="btn btn-primary">Envoyer Lien</a> <a class="btnMailPerso" title="Ajouter un texte personnalisé au mail"><i class="mesicones icon-plus"></i></a>
		<div class="champPerso" style="display:none">
			<textarea id="mailPersoArea" rows="6" style="color:grey" placeholder="Entre un message avec votre mail d'invitation"></textarea>
		</div>
	</div>
	
	<br><br>
	<h3>Liste des participants et de leurs disponibilités</h3>

	"""),_display_(Seq[Any](/*42.3*/if(adm != 1)/*42.15*/{_display_(Seq[Any](format.raw/*42.16*/("""
		S'ajouter à la liste des participants :		  
		<input id="champ" type="text" value="">&nbsp;<a id="ajouter" class="btn">Ajouter</a><br>
	""")))})),format.raw/*45.3*/("""	

	<div id="divtest" >
	<table class="datesTable" cellspacing="5" cellpadding="5">
		<tbody>
			<tr class="titres dates" style="display:none"><td style="visibility:hidden"></td>
				"""),_display_(Seq[Any](/*51.6*/for(jour <- event.jours) yield /*51.30*/ {_display_(Seq[Any](format.raw/*51.32*/("""  					  
					<td id=""""),_display_(Seq[Any](/*52.15*/jour/*52.19*/.id)),format.raw/*52.22*/("""" class="jour" colspan=""""),_display_(Seq[Any](/*52.47*/jour/*52.51*/.horaires.size())),format.raw/*52.67*/("""">
						<b class="jourintitule">"""),_display_(Seq[Any](/*53.32*/jour/*53.36*/.date)),format.raw/*53.41*/(""" </b>
						"""),_display_(Seq[Any](/*54.8*/if(adm == 1)/*54.20*/{_display_(Seq[Any](format.raw/*54.21*/("""<a id=""""),_display_(Seq[Any](/*54.29*/jour/*54.33*/.id)),format.raw/*54.36*/("""" class="horaireAdd" title="Ajouter une plage horaire à cette date" ><i class="mesicones icon-plus"></i></a>""")))})),format.raw/*54.145*/("""
						"""),_display_(Seq[Any](/*55.8*/if(adm == 1)/*55.20*/{_display_(Seq[Any](format.raw/*55.21*/("""<a id=""""),_display_(Seq[Any](/*55.29*/jour/*55.33*/.id)),format.raw/*55.36*/("""" class="jourDel" title="Supprimer cette date"><i class="mesicones icon-remove"></i></a>""")))})),format.raw/*55.125*/("""
					</td>	                        	                
				""")))})),format.raw/*57.6*/("""
			</tr>
			<tr class="titres horaires" style="display:none"><td style="visibility:hidden"></td>
				"""),_display_(Seq[Any](/*60.6*/for(jour <- event.jours) yield /*60.30*/ {_display_(Seq[Any](format.raw/*60.32*/("""  
					"""),_display_(Seq[Any](/*61.7*/if(jour.horaires.size() == 0)/*61.36*/{_display_(Seq[Any](format.raw/*61.37*/("""
					    <td class="jour"></td>
					""")))})),format.raw/*63.7*/("""
				    """),_display_(Seq[Any](/*64.10*/for(horaire <- jour.horaires) yield /*64.39*/ {_display_(Seq[Any](format.raw/*64.41*/("""
				    	<td id=""""),_display_(Seq[Any](/*65.19*/horaire/*65.26*/.id)),format.raw/*65.29*/("""" dayid=""""),_display_(Seq[Any](/*65.39*/jour/*65.43*/.id)),format.raw/*65.46*/("""" class="horaire">
				    		"""),_display_(Seq[Any](/*66.12*/horaire/*66.19*/.debut)),format.raw/*66.25*/(""" - """),_display_(Seq[Any](/*66.29*/horaire/*66.36*/.fin)),format.raw/*66.40*/(""" 
				    		"""),_display_(Seq[Any](/*67.12*/if(adm == 1)/*67.24*/{_display_(Seq[Any](format.raw/*67.25*/("""<a id=""""),_display_(Seq[Any](/*67.33*/horaire/*67.40*/.id)),format.raw/*67.43*/("""" idjour=""""),_display_(Seq[Any](/*67.54*/jour/*67.58*/.id)),format.raw/*67.61*/("""" class="horaireDel" title="Supprimer cette plage horaire" ><i class="mesicones icon-remove"></i></a>""")))})),format.raw/*67.163*/("""
				    	</td>
				    """)))})),format.raw/*69.10*/("""  

				""")))})),format.raw/*71.6*/("""
			</tr>
			              
			
			"""),_display_(Seq[Any](/*75.5*/for(participant <- event.participants) yield /*75.43*/ {_display_(Seq[Any](format.raw/*75.45*/("""
				<tr title=""""),_display_(Seq[Any](/*76.17*/participant/*76.28*/.nom)),format.raw/*76.32*/("""" id=""""),_display_(Seq[Any](/*76.39*/participant/*76.50*/.id)),format.raw/*76.53*/("""" class="participant"><td class="infoPersonne">
					"""),_display_(Seq[Any](/*77.7*/form(routes.Application.updatePersonne(event.id), 'id->"formPersonne")/*77.77*/ {_display_(Seq[Any](format.raw/*77.79*/("""
						"""),_display_(Seq[Any](/*78.8*/if(participant.locked)/*78.30*/{_display_(Seq[Any](format.raw/*78.31*/("""
							<i class="mesicones icon-lock"></i>
						""")))})),format.raw/*80.8*/("""
						"""),_display_(Seq[Any](/*81.8*/if(participant.obligatoire)/*81.35*/{_display_(Seq[Any](format.raw/*81.36*/("""							
							<a id="obligatoire" class="obligatoirecb btn btn-inverse">Obligatoire</a>
						""")))}/*83.9*/else/*83.14*/{_display_(Seq[Any](format.raw/*83.15*/("""							
							<a id="obligatoire" class="obligatoirecb btn ">Facultatif</a>
						""")))})),format.raw/*85.8*/("""

						<input id="nom" size="10" type="text" value=""""),_display_(Seq[Any](/*87.53*/participant/*87.64*/.nom)),format.raw/*87.68*/("""" name="nom" readonly="readonly">							
						<a id=""""),_display_(Seq[Any](/*88.15*/participant/*88.26*/.id)),format.raw/*88.29*/("""" title="Editer le participant" class="editPersonne"><i class="mesicones icon-pencil"></i></a>
						<a id=""""),_display_(Seq[Any](/*89.15*/participant/*89.26*/.id)),format.raw/*89.29*/("""" title="Supprimer le participant" class="deletePersonne"> <i class="mesicones icon-trash"></i></a>
					""")))})),format.raw/*90.7*/("""</td>
					
					"""),_display_(Seq[Any](/*92.7*/for(jour <- event.jours) yield /*92.31*/ {_display_(Seq[Any](format.raw/*92.33*/("""
					    """),_display_(Seq[Any](/*93.11*/if(jour.horaires.size() == 0)/*93.40*/{_display_(Seq[Any](format.raw/*93.41*/("""
					      """),_display_(Seq[Any](/*94.13*/if(participant.inscriptionsJours.contains(jour))/*94.61*/ {_display_(Seq[Any](format.raw/*94.63*/("""
			                <td class="checktd"><input id=""""),_display_(Seq[Any](/*95.52*/jour/*95.56*/.id)),format.raw/*95.59*/("""" type="checkbox"  disabled checked class="jour checkbox" value=""""),_display_(Seq[Any](/*95.125*/jour/*95.129*/.date)),format.raw/*95.134*/("""" /></td>
			              """)))}/*96.20*/else/*96.25*/{_display_(Seq[Any](format.raw/*96.26*/("""
			                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*97.53*/jour/*97.57*/.id)),format.raw/*97.60*/("""" type="checkbox"  disabled class="jour checkbox" value=""""),_display_(Seq[Any](/*97.118*/jour/*97.122*/.date)),format.raw/*97.127*/("""" /></td>
			              """)))})),format.raw/*98.19*/("""
					       
					    """)))})),format.raw/*100.11*/("""
			            """),_display_(Seq[Any](/*101.17*/for(horaire <- jour.horaires) yield /*101.46*/ {_display_(Seq[Any](format.raw/*101.48*/("""
			              """),_display_(Seq[Any](/*102.19*/if(participant.inscriptionsHoraires.contains(horaire))/*102.73*/ {_display_(Seq[Any](format.raw/*102.75*/("""
			                <td class="checktd"><input id=""""),_display_(Seq[Any](/*103.52*/horaire/*103.59*/.id)),format.raw/*103.62*/("""" type="checkbox" disabled class="horaire checkbox"  checked value=""""),_display_(Seq[Any](/*103.131*/horaire/*103.138*/.debut)),format.raw/*103.144*/(""" - """),_display_(Seq[Any](/*103.148*/horaire/*103.155*/.fin)),format.raw/*103.159*/("""" /></td>
			              """)))}/*104.20*/else/*104.25*/{_display_(Seq[Any](format.raw/*104.26*/("""
			                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*105.53*/horaire/*105.60*/.id)),format.raw/*105.63*/("""" type="checkbox" disabled class="horaire checkbox" value=""""),_display_(Seq[Any](/*105.123*/horaire/*105.130*/.debut)),format.raw/*105.136*/(""" - """),_display_(Seq[Any](/*105.140*/horaire/*105.147*/.fin)),format.raw/*105.151*/("""" /></td>
			              """)))})),format.raw/*106.19*/("""
			            """)))})),format.raw/*107.17*/("""            	                
			        """)))})),format.raw/*108.13*/("""				
				</tr>
			""")))})),format.raw/*110.5*/("""
		</tbody>
		<tfoot>
		<tr id="compte" class="titres"
		 """),_display_(Seq[Any](/*114.5*/if(event.participants.size() == 0)/*114.39*/{_display_(Seq[Any](format.raw/*114.40*/(""" style="display:none"""")))})),format.raw/*114.62*/(""">
			<td id=""><b>Compte: </b></td>
			"""),_display_(Seq[Any](/*116.5*/for(jour <- event.jours) yield /*116.29*/ {_display_(Seq[Any](format.raw/*116.31*/("""
			    """),_display_(Seq[Any](/*117.9*/if(jour.horaires.size() == 0)/*117.38*/{_display_(Seq[Any](format.raw/*117.39*/("""		     
	                <td id=""""),_display_(Seq[Any](/*118.27*/jour/*118.31*/.id)),format.raw/*118.34*/("""" class="jour">0</td>	       
			    """)))})),format.raw/*119.9*/("""
	            """),_display_(Seq[Any](/*120.15*/for(horaire <- jour.horaires) yield /*120.44*/ {_display_(Seq[Any](format.raw/*120.46*/("""              
	                <td id=""""),_display_(Seq[Any](/*121.27*/horaire/*121.34*/.id)),format.raw/*121.37*/("""" class="horaire">0</td>              
	            """)))})),format.raw/*122.15*/("""
			""")))})),format.raw/*123.5*/("""
		</tr>
		
			
		</tfoot>
		
	</table>
	</div>

	<div id="refresh"></div>




	"""),_display_(Seq[Any](/*137.3*/if(adm == 1)/*137.15*/{_display_(Seq[Any](format.raw/*137.16*/("""
	<a class="visibleAdd" ><i class="mesicones icon-plus"></i></a>
	
	<div class="champAdd" style="display:none">		
		Ajouter un participant :		  
		<input id="champ" type="text" value="">&nbsp;<a id="ajouter" class="btn">Ajouter</a><br><br>

		Ajouter une date:
		<input id="datepicker" type="text">&nbsp;<a id="ajouterDate" class="btn">Ajouter</a>
	</div>
	""")))})),format.raw/*147.3*/("""
	
	

	
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

	<div id="dialog-check-pwd-delete" title="Entrez le mot de passe pour ce participant">		

				
			<label for="password">Mot de passe du participant :</label>
			<input type="password" name="password" id="password-check-delete" value="" class="text ui-widget-content ui-corner-all" />
		
	</div>

	<div id="dialog-new-adm" title="Entrez le nouveau mot de passe administrateur">		

				
			<label for="password">Nouveau mot de passe :</label>
			<input type="password" name="password" id="password-new-adm" value="" class="text ui-widget-content ui-corner-all" />
		
	</div>

	<div id="dialog-check-pwd-adm" title="Entrez le mot de passe organisateur">		

				
			<label for="password">Mot de passe organisateur (premier mot de passe reçu par email):</label>
			<input type="password" name="password" id="password-check-adm" value="" class="text ui-widget-content ui-corner-all" />
		
	</div>

	<!--<script type="text/javascript" src=""""),_display_(Seq[Any](/*213.43*/routes/*213.49*/.Assets.at("javascripts/sendMail.js"))),format.raw/*213.86*/(""""></script>  -->
	<!--<script type="text/javascript" src=""""),_display_(Seq[Any](/*214.43*/routes/*214.49*/.Assets.at("javascripts/editPersonne.js"))),format.raw/*214.90*/(""""></script> -->

	<script type="text/javascript" charset="utf-8">
	
	var color1 = "#FFFF99";
	var color2 = "gold";
	var color3 = "steelblue";
	var mdp = "";

	/*$(function() """),format.raw("""{"""),format.raw/*223.18*/("""
       hash = encode64("1");
       hash2 = encode64(hash);
       alert("code:"+hash2);
       alert("decode"+decode64(decode64(hash2)));
   """),format.raw("""}"""),format.raw/*228.5*/(""")*/
	














	/*Code concernant l'interface administrateur*/

	$(function()"""),format.raw("""{"""),format.raw/*246.15*/("""		

		if (""""),_display_(Seq[Any](/*248.9*/adm)),format.raw/*248.12*/("""" == "1") """),format.raw("""{"""),format.raw/*248.23*/("""
			$( "#dialog-check-pwd-adm" ).dialog( "open" );	
		"""),format.raw("""}"""),format.raw/*250.4*/("""
	"""),format.raw("""}"""),format.raw/*251.3*/(""");

	$(function() """),format.raw("""{"""),format.raw/*253.16*/("""
		//$( "#datepicker" ).datepicker();
		
		$( "#datepicker" ).datepicker("""),format.raw("""{"""),format.raw/*256.34*/("""
			 minDate: 0,
			onSelect: function(date) """),format.raw("""{"""),format.raw/*258.30*/("""				
				var selectionType = $.inArray(date, $( "#date" ).multiDatesPicker('getDates'));				
				var d = new Date(date);		
				var dateText = d.toLocaleDateString();
				$( "#datepicker" ).attr("value", dateText);
			"""),format.raw("""}"""),format.raw/*263.5*/("""
		"""),format.raw("""}"""),format.raw/*264.4*/(""");
	"""),format.raw("""}"""),format.raw/*265.3*/(""");

	$( "#dialog-check-pwd-adm" ).dialog("""),format.raw("""{"""),format.raw/*267.39*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		open: function(event, ui) """),format.raw("""{"""),format.raw/*272.30*/(""" $(".ui-dialog-titlebar-close", $(this).parent()).hide(); """),format.raw("""}"""),format.raw/*272.89*/(""",
		closeOnEscape: false,
		buttons: """),format.raw("""{"""),format.raw/*274.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*275.22*/("""				
								
				pass = $("#password-check-adm").val();	
				if (pass == """"),_display_(Seq[Any](/*278.19*/event/*278.24*/.passAdmin)),format.raw/*278.34*/("""") """),format.raw("""{"""),format.raw/*278.38*/("""
				  	$( this ).dialog( "close" );
				"""),format.raw("""}"""),format.raw/*280.6*/(""" else """),format.raw("""{"""),format.raw/*280.13*/("""
				  	alert("mot de passe incorrect");
				"""),format.raw("""}"""),format.raw/*282.6*/("""				
				
			"""),format.raw("""}"""),format.raw/*284.5*/("""					
		"""),format.raw("""}"""),format.raw/*285.4*/("""
		
		
	"""),format.raw("""}"""),format.raw/*288.3*/(""");

	$("#newPassAdmin").live("click", function()"""),format.raw("""{"""),format.raw/*290.46*/("""
		$( "#dialog-new-adm" ).dialog("open");
	"""),format.raw("""}"""),format.raw/*292.3*/(""");

	$( "#dialog-new-adm" ).dialog("""),format.raw("""{"""),format.raw/*294.33*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,	
		
		buttons: """),format.raw("""{"""),format.raw/*300.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*301.22*/("""				
								
				pass = $("#password-new-adm").val();	
				$.ajax("""),format.raw("""{"""),format.raw/*304.13*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*306.13*/routes/*306.19*/.Application.newAdmPass(event.id))),format.raw/*306.52*/("""",
					data: '"""),format.raw("""{"""),format.raw/*307.14*/(""""newPass" : "' + pass + '""""),format.raw("""}"""),format.raw/*307.41*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*309.32*/("""
						alert("Nouveau mot de passe etabli");

					"""),format.raw("""}"""),format.raw/*312.7*/("""
				"""),format.raw("""}"""),format.raw/*313.6*/(""");
				$( this ).dialog( "close" );			
				
			"""),format.raw("""}"""),format.raw/*316.5*/("""					
		"""),format.raw("""}"""),format.raw/*317.4*/("""
		
		
	"""),format.raw("""}"""),format.raw/*320.3*/(""");



































	/*Code concernant les mails et l'envoi*/

	$(function()"""),format.raw("""{"""),format.raw/*358.15*/("""

		if (bonmail($("#mailsArea").val())) """),format.raw("""{"""),format.raw/*360.40*/("""
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
		"""),format.raw("""}"""),format.raw/*363.4*/(""" else """),format.raw("""{"""),format.raw/*363.11*/("""
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
		"""),format.raw("""}"""),format.raw/*366.4*/("""
	"""),format.raw("""}"""),format.raw/*367.3*/(""");

	$('#envoiLien').live('click', function(e) """),format.raw("""{"""),format.raw/*369.45*/("""

		if ($(this).attr("disabled") != "disabled") """),format.raw("""{"""),format.raw/*371.48*/("""
			var mailsList = $("#mailsArea").val();

			$.ajax("""),format.raw("""{"""),format.raw/*374.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*376.12*/routes/*376.18*/.Application.sendMail(event.id))),format.raw/*376.49*/("""",
				data: '"""),format.raw("""{"""),format.raw/*377.13*/(""""mailslist" : "' + mailsList + '", "textPerso" : "' + $("#mailPersoArea").val() + '""""),format.raw("""}"""),format.raw/*377.98*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*379.31*/("""
					alert("Mail(s) envoye(s) a "+mailsList);
				"""),format.raw("""}"""),format.raw/*381.6*/("""
			"""),format.raw("""}"""),format.raw/*382.5*/(""");
		"""),format.raw("""}"""),format.raw/*383.4*/("""
	"""),format.raw("""}"""),format.raw/*384.3*/(""");


	$("#mailsArea").live("keyup", function() """),format.raw("""{"""),format.raw/*387.44*/("""

		if (bonmail($(this).val())) """),format.raw("""{"""),format.raw/*389.32*/("""
			
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
		"""),format.raw("""}"""),format.raw/*393.4*/(""" else """),format.raw("""{"""),format.raw/*393.11*/("""
			
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
		"""),format.raw("""}"""),format.raw/*397.4*/("""
	"""),format.raw("""}"""),format.raw/*398.3*/(""")
	
	function bonmail(mailtest)
	"""),format.raw("""{"""),format.raw/*401.3*/("""
		var reg = new RegExp('^([a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*402.46*/("""1"""),format.raw("""}"""),format.raw/*402.48*/("""[a-z0-9]+)*@[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*402.80*/("""1"""),format.raw("""}"""),format.raw/*402.82*/("""[a-z0-9]+)*[\.]"""),format.raw("""{"""),format.raw/*402.98*/("""1"""),format.raw("""}"""),format.raw/*402.100*/("""[a-z]"""),format.raw("""{"""),format.raw/*402.106*/("""2,6"""),format.raw("""}"""),format.raw/*402.110*/(""")"""),format.raw("""{"""),format.raw/*402.112*/("""1"""),format.raw("""}"""),format.raw/*402.114*/("""(\,( )*[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*402.140*/("""1"""),format.raw("""}"""),format.raw/*402.142*/("""[a-z0-9]+)*@[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*402.174*/("""1"""),format.raw("""}"""),format.raw/*402.176*/("""[a-z0-9]+)*[\.]"""),format.raw("""{"""),format.raw/*402.192*/("""1"""),format.raw("""}"""),format.raw/*402.194*/("""[a-z]"""),format.raw("""{"""),format.raw/*402.200*/("""2,6"""),format.raw("""}"""),format.raw/*402.204*/(""")*$', 'i');

		if(reg.test(mailtest))
		"""),format.raw("""{"""),format.raw/*405.4*/("""
			return(true);
		"""),format.raw("""}"""),format.raw/*407.4*/("""
		else
		"""),format.raw("""{"""),format.raw/*409.4*/("""
			return(false);
		"""),format.raw("""}"""),format.raw/*411.4*/("""
	"""),format.raw("""}"""),format.raw/*412.3*/("""



























	/*Code de style*/

	$(function()"""),format.raw("""{"""),format.raw/*442.15*/("""
		$("table.datesTable td").css("background-color", color3);
		$(".checkbox").attr("disabled", "true"); 

		$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*446.37*/(""" // coloration des box checkées
		  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*447.34*/("""
		  		$(this).parent().css("background-color", "#66CC99");
		  	"""),format.raw("""}"""),format.raw/*449.7*/("""
		"""),format.raw("""}"""),format.raw/*450.4*/(""");

		$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*452.41*/("""
			$('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*454.4*/(""");

		refreshCount(); // maj de la ligne de compteurs

		affichagePopulaire(); // maj des surbrillances
	"""),format.raw("""}"""),format.raw/*459.3*/(""")

	$(".btnMailPerso").live('click', function() """),format.raw("""{"""),format.raw/*461.47*/("""
		if ($(this).siblings(".champPerso").css("display") == "none") """),format.raw("""{"""),format.raw/*462.66*/("""                
            $(this).siblings(".champPerso").removeAttr("style");
            $(this).html("<i class=\"mesicones icon-minus\"></i>")
        """),format.raw("""}"""),format.raw/*465.10*/(""" else """),format.raw("""{"""),format.raw/*465.17*/("""                
            $(this).siblings(".champPerso").attr("style", "display:none");
            $(this).html("<i class=\"mesicones icon-plus\"></i>")
        """),format.raw("""}"""),format.raw/*468.10*/("""
	"""),format.raw("""}"""),format.raw/*469.3*/(""")

	$("textarea").live('click', function(e) """),format.raw("""{"""),format.raw/*471.43*/("""
		$(this).html("");
		$(this).removeAttr("style");
	"""),format.raw("""}"""),format.raw/*474.3*/(""")

	$(".visibleAdd").live("click", function() """),format.raw("""{"""),format.raw/*476.45*/("""
        if ($(this).siblings(".champAdd").css("display") == "none") """),format.raw("""{"""),format.raw/*477.70*/("""                
            $(this).siblings(".champAdd").removeAttr("style");
            $(this).html("<i class=\"mesicones icon-minus\"></i>")
        """),format.raw("""}"""),format.raw/*480.10*/(""" else """),format.raw("""{"""),format.raw/*480.17*/("""                
            $(this).siblings(".champAdd").attr("style", "display:none");
            $(this).html("<i class=\"mesicones icon-plus\"></i>")
        """),format.raw("""}"""),format.raw/*483.10*/("""
    """),format.raw("""}"""),format.raw/*484.6*/(""")

	function refreshHoverable() """),format.raw("""{"""),format.raw/*486.31*/(""" //coloration des cases quand on passe la souris dessus
		
		$(".hoverable").on("""),format.raw("""{"""),format.raw/*488.23*/("""

			mouseenter: function () """),format.raw("""{"""),format.raw/*490.29*/("""
				$(this).css("background-color", "lightgreen");
			"""),format.raw("""}"""),format.raw/*492.5*/(""", 

			mouseleave: function () """),format.raw("""{"""),format.raw/*494.29*/("""
				if ($(this).children().is(':checked'))"""),format.raw("""{"""),format.raw/*495.44*/("""	 
			    	$(this).css("background-color", "#66CC99");
			    """),format.raw("""}"""),format.raw/*497.9*/(""" else """),format.raw("""{"""),format.raw/*497.16*/("""
			    	$(this).css("background-color", color3);
			    """),format.raw("""}"""),format.raw/*499.9*/("""
			"""),format.raw("""}"""),format.raw/*500.5*/("""
		"""),format.raw("""}"""),format.raw/*501.4*/(""");

	"""),format.raw("""}"""),format.raw/*503.3*/("""

	

	function refreshCount() """),format.raw("""{"""),format.raw/*507.27*/(""" // met à jour l'affichage du compte des participants par horaire
		$('input[type="checkbox"].horaire.checkbox').each(function(i) """),format.raw("""{"""),format.raw/*508.66*/("""
			var iden = $(this).attr('id');
			
			if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*511.32*/("""
		    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			"""),format.raw("""}"""),format.raw/*514.5*/("""
			
		"""),format.raw("""}"""),format.raw/*516.4*/(""");
			
		$('input[type="checkbox"].jour.checkbox').each(function(i) """),format.raw("""{"""),format.raw/*518.63*/("""
			var iden = $(this).attr('id');			
				
			if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*521.32*/("""
		    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			"""),format.raw("""}"""),format.raw/*524.5*/("""			
			
		"""),format.raw("""}"""),format.raw/*526.4*/(""");
	"""),format.raw("""}"""),format.raw/*527.3*/("""










	























	/*Code sur les mots de passe*/

	$( "#dialog:ui-dialog" ).dialog( "destroy" ); 
		
	
	var pass = "";
	var goodPass = "";
	var currentEditButton;
	var currentDelButton;

	$( "#dialog-question-securise" ).dialog("""),format.raw("""{"""),format.raw/*572.43*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*577.13*/("""
			"Oui": function() """),format.raw("""{"""),format.raw/*578.23*/("""				    	
			    $( "#dialog-new-pwd" ).dialog( "open" );  
			    $( this ).dialog( "close" );
			"""),format.raw("""}"""),format.raw/*581.5*/(""",
			"Non": function() """),format.raw("""{"""),format.raw/*582.23*/("""
				addPersonne($.trim($("#champ").attr("value")), "false", "");
				$( this ).dialog( "close" );
			"""),format.raw("""}"""),format.raw/*585.5*/("""				
		"""),format.raw("""}"""),format.raw/*586.4*/("""
		
	"""),format.raw("""}"""),format.raw/*588.3*/(""");
			
	
	$( "#dialog-new-pwd" ).dialog("""),format.raw("""{"""),format.raw/*591.33*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*596.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*597.22*/("""
				var bValid = true;									

				if ( bValid ) """),format.raw("""{"""),format.raw/*600.20*/("""
					mdp = $("#password-new").val();
					addPersonne($.trim($("#champ").attr("value")), "true", mdp);
					$( "#password-new" ).attr("value", "");
					$( this ).dialog( "close" );
				"""),format.raw("""}"""),format.raw/*605.6*/("""
			"""),format.raw("""}"""),format.raw/*606.5*/("""				
		"""),format.raw("""}"""),format.raw/*607.4*/("""
		
	"""),format.raw("""}"""),format.raw/*609.3*/(""");

	$( "#dialog-check-pwd" ).dialog("""),format.raw("""{"""),format.raw/*611.35*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*616.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*617.22*/("""				
								
				pass = $("#password-check").val();	
				if (pass == goodPass) """),format.raw("""{"""),format.raw/*620.28*/("""
				  	edition(currentEditButton);
				"""),format.raw("""}"""),format.raw/*622.6*/(""" else """),format.raw("""{"""),format.raw/*622.13*/("""
				  	alert("mot de passe incorrect");
				"""),format.raw("""}"""),format.raw/*624.6*/("""				
				$( "#password-check" ).attr("value", "");
				$( this ).dialog( "close" );
				
			"""),format.raw("""}"""),format.raw/*628.5*/(""",

			"Annuler": function() """),format.raw("""{"""),format.raw/*630.27*/("""							
				$( this ).dialog( "close" );				
			"""),format.raw("""}"""),format.raw/*632.5*/("""				
		"""),format.raw("""}"""),format.raw/*633.4*/("""
		
	"""),format.raw("""}"""),format.raw/*635.3*/(""");

	$( "#dialog-check-pwd-delete" ).dialog("""),format.raw("""{"""),format.raw/*637.42*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*642.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*643.22*/("""				
								
				pass = $("#password-check-delete").val();	
				if (pass == goodPass) """),format.raw("""{"""),format.raw/*646.28*/("""
				  	deletePersonne(currentDelButton);
				"""),format.raw("""}"""),format.raw/*648.6*/(""" else """),format.raw("""{"""),format.raw/*648.13*/("""
				  	alert("mot de passe incorrect");
				"""),format.raw("""}"""),format.raw/*650.6*/("""				
				$( "#password-check-delete" ).attr("value", "");
				$( this ).dialog( "close" );
				
			"""),format.raw("""}"""),format.raw/*654.5*/(""",

			"Annuler": function() """),format.raw("""{"""),format.raw/*656.27*/("""							
				$( this ).dialog( "close" );				
			"""),format.raw("""}"""),format.raw/*658.5*/("""				
		"""),format.raw("""}"""),format.raw/*659.4*/("""
		
	"""),format.raw("""}"""),format.raw/*661.3*/(""");



	


























	/*Code sur l'ajout*/

	function addPersonne(nomParticipant, locked, pwd)
	"""),format.raw("""{"""),format.raw/*695.3*/("""	
		$.ajax("""),format.raw("""{"""),format.raw/*696.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*698.11*/routes/*698.17*/.Application.addParticipant(new sun.misc.BASE64Encoder().encode((event.id.toString).getBytes)))),format.raw/*698.111*/("""",
			data: '"""),format.raw("""{"""),format.raw/*699.12*/(""""nom" : "' + nomParticipant + '", "locked" : "' + locked + '", "pwd" : "' + pwd + '""""),format.raw("""}"""),format.raw/*699.97*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*701.30*/("""
				var lock ="";		
				if(locked == "true")"""),format.raw("""{"""),format.raw/*703.26*/("""
					lock = "<i class=\"mesicones icon-lock\"></i>&nbsp;";
				"""),format.raw("""}"""),format.raw/*705.6*/("""  
				$("tbody").append("<tr title=\""+nomParticipant+"\" class=\"editable\" id=\""+data.idPersonne+"\"><td class=\"infoPersonne\">"+
					"<form id=\"formPersonne\">"+
					lock+
					"<a id=\"obligatoire\" class=\"obligatoirecb btn\">Facultatif</a>&nbsp;"+
					"<input id=\"nom\" type=\"text\" value=\""+nomParticipant+"\" name=\"nom\">&nbsp;"+	
					"<a id=\""+data.idPersonne+"\" title=\"editer le participant\" class=\"editPersonne\"><i class=\"mesicones icon-ok\"></i></a>"+
					"<a id=\""+data.idPersonne+"\" title=\"supprimer le participant\" class=\"deletePersonne\"> <i class=\"mesicones icon-trash\"></i</a>"+		  
					"</form></td>"+
					""""),_display_(Seq[Any](/*714.8*/for(jour <- event.jours) yield /*714.32*/ {_display_(Seq[Any](format.raw/*714.34*/(""""+  
					""""),_display_(Seq[Any](/*715.8*/if(jour.horaires.size() == 0)/*715.37*/{_display_(Seq[Any](format.raw/*715.38*/("""<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*715.117*/jour/*715.121*/.id)),format.raw/*715.124*/("""\" type=\"checkbox\" class=\"jour checkbox\" value=\""""),_display_(Seq[Any](/*715.178*/jour/*715.182*/.date)),format.raw/*715.187*/("""\" /></td>""")))})),format.raw/*715.198*/(""""+
					""""),_display_(Seq[Any](/*716.8*/for(horaire <- jour.horaires) yield /*716.37*/ {_display_(Seq[Any](format.raw/*716.39*/(""""+	                		
					"<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*717.86*/horaire/*717.93*/.id)),format.raw/*717.96*/("""\" type=\"checkbox\" class=\"horaire checkbox\" value=\""""),_display_(Seq[Any](/*717.153*/horaire/*717.160*/.debut)),format.raw/*717.166*/(""" - """),_display_(Seq[Any](/*717.170*/horaire/*717.177*/.fin)),format.raw/*717.181*/("""\" /></td>"+			                
					"""")))})),format.raw/*718.8*/(""""+                	                
					"""")))})),format.raw/*719.8*/("""" +
					"</tr>")
				$('#champ').attr('value', '')
				$('.titres').attr('style','');
				refreshHoverable();
				if (""""),_display_(Seq[Any](/*724.11*/adm)),format.raw/*724.14*/("""" == "1") """),format.raw("""{"""),format.raw/*724.25*/("""
					setTimeout(refreshtable, 500);				
					setTimeout(styles, 1500); 	
				"""),format.raw("""}"""),format.raw/*727.6*/("""					
			"""),format.raw("""}"""),format.raw/*728.5*/("""
			             
		"""),format.raw("""}"""),format.raw/*730.4*/(""");
	"""),format.raw("""}"""),format.raw/*731.3*/("""

	$("#ajouter").live('click', function(e)"""),format.raw("""{"""),format.raw/*733.42*/("""
		

	    var vide = "";	    
	    var nom = $("#champ").attr("value");
	    if (nom != vide) """),format.raw("""{"""),format.raw/*738.24*/("""  
	    	$( "#dialog-question-securise" ).dialog( "open" );	
	    	
						
		"""),format.raw("""}"""),format.raw/*742.4*/("""

	    	    
	"""),format.raw("""}"""),format.raw/*745.3*/(""");

	$("#champ").keypress(function(e) """),format.raw("""{"""),format.raw/*747.36*/("""
		var code = (e.keyCode ? e.keyCode : e.which);
		if(code == 13) """),format.raw("""{"""),format.raw/*749.19*/(""" //Enter keycode
			var vide = "";	    
		    var nom = $.trim($("#champ").attr("value"));
		    if (nom != vide) """),format.raw("""{"""),format.raw/*752.25*/("""  
		    	$( "#dialog-question-securise" ).dialog( "open" );	
							
			"""),format.raw("""}"""),format.raw/*755.5*/("""
			$("#champ").focus();
 		"""),format.raw("""}"""),format.raw/*757.5*/("""

	"""),format.raw("""}"""),format.raw/*759.3*/(""");































	/* Code sur le rajout d'horaires et de dates*/

	var currentDay;
	var debut = "08h";
	var fin = "17h";

	$(".horaireAdd").live("click", function()"""),format.raw("""{"""),format.raw/*797.44*/("""
		$( "#dialog-add-horaire" ).dialog("open");
		currentDay = $(this).attr("id");
		
	"""),format.raw("""}"""),format.raw/*801.3*/(""")

	$("#ajouterDate").live("click", function()"""),format.raw("""{"""),format.raw/*803.45*/("""
		//var listeJours = """"),_display_(Seq[Any](/*804.24*/for(jour <- event.jours) yield /*804.48*/ {_display_(Seq[Any](format.raw/*804.50*/(""" """),_display_(Seq[Any](/*804.52*/jour/*804.56*/.date)),format.raw/*804.61*/(""" """)))})),format.raw/*804.63*/(""" "; EST CENSÉ MARCHER????
		var listeJours = "";
		$(".jourintitule").each(function()"""),format.raw("""{"""),format.raw/*806.38*/("""
			listeJours=listeJours+$(this).html()+" "
		"""),format.raw("""}"""),format.raw/*808.4*/(""");

		
		if (listeJours.indexOf($("#datepicker").val()) != -1 ) """),format.raw("""{"""),format.raw/*811.59*/("""			
			alert("date déjà existante");
		"""),format.raw("""}"""),format.raw/*813.4*/(""" else """),format.raw("""{"""),format.raw/*813.11*/("""
			$.ajax("""),format.raw("""{"""),format.raw/*814.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*816.12*/routes/*816.18*/.Application.addDate(event.id))),format.raw/*816.48*/("""",
				data: '"""),format.raw("""{"""),format.raw/*817.13*/(""""date" : "' + $("#datepicker").val() + '""""),format.raw("""}"""),format.raw/*817.55*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*819.31*/("""

					$('.titres.dates').append(
						"<td id=\""+data.idJour+"\" class=\"jour\" style=\"background-color: rgb(255, 255, 153);\">"+
							"<b class=\"jourintitule\">"+$("#datepicker").val()+" </b>"+
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
				"""),format.raw("""}"""),format.raw/*840.6*/("""
			"""),format.raw("""}"""),format.raw/*841.5*/(""");	
		"""),format.raw("""}"""),format.raw/*842.4*/("""
	"""),format.raw("""}"""),format.raw/*843.3*/(""");

	$( ".slider-range" ).slider("""),format.raw("""{"""),format.raw/*845.31*/("""
    	range: true,
    	min: 0,
    	max: 1440,
    	step: 15,
    	values: [ 8*60, 17*60 ],
    	slide: function( event, ui ) """),format.raw("""{"""),format.raw/*851.36*/("""
    		$( "#data" ).val(parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60)+" - " + parseInt(ui.values[ 1 ]/60) +"h"+pad2(ui.values[ 1 ]%60));

		"""),format.raw("""}"""),format.raw/*854.4*/(""", 
		change: function(event, ui) """),format.raw("""{"""),format.raw/*855.32*/("""
			debut = parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60);
			fin = parseInt(ui.values[ 1 ]/60) + "h"+pad2(ui.values[ 1 ]%60);
					
		"""),format.raw("""}"""),format.raw/*859.4*/("""
	"""),format.raw("""}"""),format.raw/*860.3*/(""");
			    	
	$( "#dialog-add-horaire" ).dialog("""),format.raw("""{"""),format.raw/*862.37*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		closeText: 'hide',
		buttons: """),format.raw("""{"""),format.raw/*868.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*869.22*/("""	
					
				$.ajax("""),format.raw("""{"""),format.raw/*871.13*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*873.13*/routes/*873.19*/.Application.newHoraire(event.id))),format.raw/*873.52*/("""",
					data: '"""),format.raw("""{"""),format.raw/*874.14*/(""""jour" : "' + currentDay + '""""),format.raw("""}"""),format.raw/*874.44*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*876.32*/("""
						
						$.ajax("""),format.raw("""{"""),format.raw/*878.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*880.15*/routes/*880.21*/.Application.dateChanged(event.id))),format.raw/*880.55*/("""",
							data: '"""),format.raw("""{"""),format.raw/*881.16*/(""""idhoraire" : "' + data.idHoraire + '",'+ 
							'"debut" : "' + debut + '",'+
							'"fin" : "' + fin + '""""),format.raw("""}"""),format.raw/*883.31*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*885.34*/("""
								
							"""),format.raw("""}"""),format.raw/*887.9*/("""               
						"""),format.raw("""}"""),format.raw/*888.8*/(""");
					"""),format.raw("""}"""),format.raw/*889.7*/("""
				"""),format.raw("""}"""),format.raw/*890.6*/(""");			

				setTimeout(refreshtable, 100);	
				
				$( this ).dialog( "close" );
				
				setTimeout(refreshtable, 500);
				
				
				setTimeout(styles, 1500);



								
			"""),format.raw("""}"""),format.raw/*904.5*/(""",

			"Annuler": function() """),format.raw("""{"""),format.raw/*906.27*/("""							
				$( this ).dialog( "close" );				
			"""),format.raw("""}"""),format.raw/*908.5*/("""				
		"""),format.raw("""}"""),format.raw/*909.4*/("""
		
	"""),format.raw("""}"""),format.raw/*911.3*/(""");

	function styles()"""),format.raw("""{"""),format.raw/*913.20*/("""
		

		$("tr").attr("style", "");
		$("table.datesTable td").css("background-color", color3);
		$(".checkbox").attr("disabled", "true"); 

		$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*920.37*/(""" // coloration des box checkées
		  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*921.34*/("""
		  		$(this).parent().css("background-color", "#66CC99");
		  	"""),format.raw("""}"""),format.raw/*923.7*/("""
		"""),format.raw("""}"""),format.raw/*924.4*/(""");

		$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*926.41*/("""
			$('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*928.4*/(""");

		refreshCount(); // maj de la ligne de compteurs

		affichagePopulaire();
	"""),format.raw("""}"""),format.raw/*933.3*/("""

	function refreshtable()"""),format.raw("""{"""),format.raw/*935.26*/("""
		$('#divtest').load('/KIND/eventEdit/"""),_display_(Seq[Any](/*936.40*/event/*936.45*/.id)),format.raw/*936.48*/("""/adm #divtest');
	"""),format.raw("""}"""),format.raw/*937.3*/("""

	function pad2(number) """),format.raw("""{"""),format.raw/*939.25*/("""
   
    	return (number < 10 ? '0' : '') + number
   
	"""),format.raw("""}"""),format.raw/*943.3*/("""


























	/* Code concernant la suppression d'horaires et de jours*/
	 
	$(".horaireDel").live("click", function()"""),format.raw("""{"""),format.raw/*972.44*/("""
		var thisse = $(this);
		
			
		$.ajax("""),format.raw("""{"""),format.raw/*976.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*978.11*/routes/*978.17*/.Application.deleteHoraire(event.id))),format.raw/*978.53*/("""",
			data: '"""),format.raw("""{"""),format.raw/*979.12*/(""""jour" : "' + $(this).attr("idjour") + '", "horaire" : "' + $(this).attr("id") + '""""),format.raw("""}"""),format.raw/*979.96*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*981.30*/("""
				setTimeout(refreshtable, 500);				
				setTimeout(styles, 2000);				
			"""),format.raw("""}"""),format.raw/*984.5*/(""", 
			error : function(data) """),format.raw("""{"""),format.raw/*985.28*/("""
				alert("impossible de supprimer l'horaire, vérifiez que personne n'est disponible à cet horaire-ci")
			"""),format.raw("""}"""),format.raw/*987.5*/("""
		"""),format.raw("""}"""),format.raw/*988.4*/(""");	

	"""),format.raw("""}"""),format.raw/*990.3*/(""")

	$(".jourDel").live("click", function()"""),format.raw("""{"""),format.raw/*992.41*/("""
		var thisse = $(this);
		
		
		$.ajax("""),format.raw("""{"""),format.raw/*996.11*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*998.12*/routes/*998.18*/.Application.removeDate(event.id))),format.raw/*998.51*/("""",
				data: '"""),format.raw("""{"""),format.raw/*999.13*/(""""idDate" : "' + $(this).attr("id") + '""""),format.raw("""}"""),format.raw/*999.53*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*1001.31*/("""
					setTimeout(refreshtable, 500);
					setTimeout(styles, 2000);		
				"""),format.raw("""}"""),format.raw/*1004.6*/(""",
				error : function(data) """),format.raw("""{"""),format.raw/*1005.29*/("""
					alert("impossible de supprimer le jour, vérifiez que personne n'est disponible ce jour-ci")
				"""),format.raw("""}"""),format.raw/*1007.6*/("""
			"""),format.raw("""}"""),format.raw/*1008.5*/(""");				

	"""),format.raw("""}"""),format.raw/*1010.3*/(""")
	



























	/*Code sur l'édition dee participants*/

	$('.editPersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*1041.48*/("""
		
	    if(!$(this).parents("tr").hasClass("editable"))  """),format.raw("""{"""),format.raw/*1043.56*/("""	    	
	    	if ($(this).siblings("i").hasClass("icon-lock"))"""),format.raw("""{"""),format.raw/*1044.56*/("""
	    		currentEditButton = $(this);
	    		$.ajax("""),format.raw("""{"""),format.raw/*1046.16*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*1048.13*/routes/*1048.19*/.Application.getPass())),format.raw/*1048.41*/("""",
					data: '"""),format.raw("""{"""),format.raw/*1049.14*/(""" "idpers" : "'+$(this).parents("tr").attr("id")+'" """),format.raw("""}"""),format.raw/*1049.66*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*1051.32*/("""
						goodPass = data.pass;

						$( "#dialog-check-pwd" ).dialog( "open" );	
											  
					"""),format.raw("""}"""),format.raw/*1056.7*/("""
			   """),format.raw("""}"""),format.raw/*1057.8*/(""");			
				
			"""),format.raw("""}"""),format.raw/*1059.5*/(""" else """),format.raw("""{"""),format.raw/*1059.12*/("""
				edition($(this));
			"""),format.raw("""}"""),format.raw/*1061.5*/("""
		  
	    """),format.raw("""}"""),format.raw/*1063.7*/(""" else """),format.raw("""{"""),format.raw/*1063.14*/("""
	      $(this).html("<i class=\"mesicones icon-pencil\"></i>");
	      $(this).parents("tr").removeClass("editable");
	      $(this).siblings('input[type="text"]').attr("readonly", "readonly");
	      $(this).parent().parent().parent().children("td").children('input[type="checkbox"]').attr("disabled","true"); 
	      $(this).parent().parent().parent().children("td").css("border", "none");
	      $(".hoverable").off();	      
	      $(this).parent().parent().parent().children(".checktd").attr("class", "checktd");
	      refreshHoverable();
	      editPersonne($(this).attr('id'), $(this).siblings("input").attr("value"));
	    """),format.raw("""}"""),format.raw/*1073.7*/("""
	
	  
	"""),format.raw("""}"""),format.raw/*1076.3*/(""")

	function edition(elem) """),format.raw("""{"""),format.raw/*1078.26*/("""
		elem.html("<i class=\"mesicones icon-ok\"></i>");
		elem.parents("tr").addClass("editable");
		elem.siblings('input[type="text"]').removeAttr("readonly");
		elem.parent().parent().parent().children("td").children().removeAttr("disabled");
		elem.parent().parent().parent().children("td").css("border", "solid black 2px");
		$(".hoverable").off();		  
		elem.parent().parent().parent().children(".checktd").attr("class", "checktd hoverable");
		refreshHoverable();
	"""),format.raw("""}"""),format.raw/*1087.3*/("""

	function editPersonne(personneId, personneNom)
	"""),format.raw("""{"""),format.raw/*1090.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*1091.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1093.11*/routes/*1093.17*/.Application.updatePersonne(event.id))),format.raw/*1093.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1094.12*/(""""id" : "' + personneId + '", "nom" : "' + personneNom + '""""),format.raw("""}"""),format.raw/*1094.71*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1096.30*/("""
			  //alert("Participant edit\351");
			"""),format.raw("""}"""),format.raw/*1098.5*/("""
	  """),format.raw("""}"""),format.raw/*1099.5*/(""");
	"""),format.raw("""}"""),format.raw/*1100.3*/("""

	$('.checktd').live('click', function(e) """),format.raw("""{"""),format.raw/*1102.43*/("""
		if ($(this).children().prop("disabled") == false) """),format.raw("""{"""),format.raw/*1103.54*/("""
			if ($(this).children().prop("checked") == false) """),format.raw("""{"""),format.raw/*1104.54*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*1105.36*/("""
					$(this).children().prop("checked", true);
				"""),format.raw("""}"""),format.raw/*1107.6*/("""
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*1109.5*/(""" else """),format.raw("""{"""),format.raw/*1109.12*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*1110.36*/("""
					$(this).children().prop("checked", false);
				"""),format.raw("""}"""),format.raw/*1112.6*/("""        
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*1114.5*/("""

			affichagePopulaire();

			//$('.populaires').html("");
			$('.titres td').each( function() """),format.raw("""{"""),format.raw/*1119.38*/("""
				if ($(this).css('background-color') == color2) """),format.raw("""{"""),format.raw/*1120.53*/("""
					$('.populaires').append($(this).html());
				"""),format.raw("""}"""),format.raw/*1122.6*/("""				
			"""),format.raw("""}"""),format.raw/*1123.5*/(""")			
		"""),format.raw("""}"""),format.raw/*1124.4*/("""
	"""),format.raw("""}"""),format.raw/*1125.3*/(""");

	function changeCheck(box) """),format.raw("""{"""),format.raw/*1127.29*/("""   // gestion des clics sur les checkboxes
	   var idtime = box.attr('id');
	   var idParticipant = box.parent().parent().attr('id');   
	   
	   if (box.is(':checked'))"""),format.raw("""{"""),format.raw/*1131.29*/("""	 //Action de valider une horaire  		
	       		box.parent().css("background-color", "#66CC99")//vert
		   		if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*1133.57*/("""
		            var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
		       	    requeteAjaxHeure(idtime, idParticipant);
			    """),format.raw("""}"""),format.raw/*1137.9*/("""
	       		if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*1138.57*/("""	
	    	   	    var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
				    requeteAjaxJour(idtime, idParticipant);
			   """),format.raw("""}"""),format.raw/*1142.8*/("""
	   """),format.raw("""}"""),format.raw/*1143.6*/(""" else """),format.raw("""{"""),format.raw/*1143.13*/(""" //Action de dévalider une horaires
	     
		    box.parent().css("background-color", color3) //
		    if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*1146.56*/("""
			    var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxHeure(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*1150.8*/("""
		    if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*1151.53*/("""
		        var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxJour(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*1155.8*/("""
	   """),format.raw("""}"""),format.raw/*1156.6*/("""
	"""),format.raw("""}"""),format.raw/*1157.3*/("""

	function requeteAjaxJour(idtime, idParticipant) // ajoute la date au participant
	"""),format.raw("""{"""),format.raw/*1160.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*1161.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1163.11*/routes/*1163.17*/.Application.checkBoxJour(event.id))),format.raw/*1163.52*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1164.12*/(""""idjour" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*1164.80*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1166.30*/("""
			  //alert("Jour edit\351");
			"""),format.raw("""}"""),format.raw/*1168.5*/("""
	   """),format.raw("""}"""),format.raw/*1169.6*/(""");
	"""),format.raw("""}"""),format.raw/*1170.3*/("""

	function requeteAjaxHeure(idtime, idParticipant) // ajoute l'heure au participant
	"""),format.raw("""{"""),format.raw/*1173.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*1174.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1176.11*/routes/*1176.17*/.Application.checkBoxHoraire(event.id))),format.raw/*1176.55*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1177.12*/(""""idhoraire" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*1177.83*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1179.30*/("""
			  //alert("Horaire edit\351");
			"""),format.raw("""}"""),format.raw/*1181.5*/("""
	   """),format.raw("""}"""),format.raw/*1182.6*/(""");
	"""),format.raw("""}"""),format.raw/*1183.3*/("""


























	/*Code sur la suppression de participants*/

	$('.deletePersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*1212.50*/("""
		if ($(this).siblings("i").hasClass("icon-lock"))"""),format.raw("""{"""),format.raw/*1213.52*/("""
    		currentDelButton = $(this);
    		$.ajax("""),format.raw("""{"""),format.raw/*1215.15*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*1217.12*/routes/*1217.18*/.Application.getPass())),format.raw/*1217.40*/("""",
				data: '"""),format.raw("""{"""),format.raw/*1218.13*/(""" "idpers" : "'+$(this).parents("tr").attr("id")+'" """),format.raw("""}"""),format.raw/*1218.65*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*1220.31*/("""
					goodPass = data.pass;

					$( "#dialog-check-pwd-delete" ).dialog( "open" );	
										  
				"""),format.raw("""}"""),format.raw/*1225.6*/("""
		   """),format.raw("""}"""),format.raw/*1226.7*/(""");			
			
		"""),format.raw("""}"""),format.raw/*1228.4*/(""" else """),format.raw("""{"""),format.raw/*1228.11*/("""   
		    deletePersonne(currentDelButton);
		"""),format.raw("""}"""),format.raw/*1230.4*/("""
	    
	"""),format.raw("""}"""),format.raw/*1232.3*/(""")

	function deletePersonne(delButton)
	"""),format.raw("""{"""),format.raw/*1235.3*/("""
		delButton.parent().parent().parent().remove();		    
	    
	    if($('td[class="infoPersonne"]').html() == null) """),format.raw("""{"""),format.raw/*1238.56*/("""
	    	$('.titres').attr('style','display:none');
	    """),format.raw("""}"""),format.raw/*1240.7*/("""

	    $('#compte').children('td[id!=""]').each(function(i) """),format.raw("""{"""),format.raw/*1242.60*/("""
	    	$(this).html("0")
	    """),format.raw("""}"""),format.raw/*1244.7*/(""");

	    refreshCount();

	    $.ajax("""),format.raw("""{"""),format.raw/*1248.14*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1250.11*/routes/*1250.17*/.Application.deleteParticipant(event.id))),format.raw/*1250.57*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1251.12*/(""""id" : "' + delButton.attr('id') + '""""),format.raw("""}"""),format.raw/*1251.50*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1253.30*/("""
			  //alert("Participant supprim\351");
			"""),format.raw("""}"""),format.raw/*1255.5*/("""
	    """),format.raw("""}"""),format.raw/*1256.7*/(""");
	"""),format.raw("""}"""),format.raw/*1257.3*/("""


















	/*Code sur les participants obligatoires*/
	$(function()"""),format.raw("""{"""),format.raw/*1277.15*/("""
		refreshObligatoire(); 
		affichagePopulaire();
		
	"""),format.raw("""}"""),format.raw/*1281.3*/(""")	

	$(".obligatoirecb").live("click", function() """),format.raw("""{"""),format.raw/*1283.48*/(""" //click sur la checkbox "obligatoire" : mise à jour des classes sur la ligne, ajout de la propriété obligatoire dans la bdd
			
			var idParticipant = $(this).parent().parent().parent().attr("id");
			if ($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*1286.42*/("""
				$(this).html("Facultatif");
				$(this).attr("class", "obligatoirecb btn");
			"""),format.raw("""}"""),format.raw/*1289.5*/(""" else """),format.raw("""{"""),format.raw/*1289.12*/("""
				$(this).html("Obligatoire");
				$(this).attr("class", "obligatoirecb btn btn-inverse");
			"""),format.raw("""}"""),format.raw/*1292.5*/("""
			$.ajax("""),format.raw("""{"""),format.raw/*1293.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*1295.12*/routes/*1295.18*/.Application.changeObligatoire(event.id))),format.raw/*1295.58*/("""",
				data: '"""),format.raw("""{"""),format.raw/*1296.13*/(""""idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*1296.52*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*1298.31*/("""
				  affichagePopulaire();
				"""),format.raw("""}"""),format.raw/*1300.6*/("""
	   		"""),format.raw("""}"""),format.raw/*1301.8*/(""");
	   		refreshObligatoire();

		"""),format.raw("""}"""),format.raw/*1304.4*/(""")

	function checkobligatoire(idtime, type) """),format.raw("""{"""),format.raw/*1306.43*/("""//fonction qui renvoie true si tous les participants obligatoires sont présents.
		
		var ret = true;
		
		$('.obligatoire.'+type+'[id="'+idtime+'"]').each(function() """),format.raw("""{"""),format.raw/*1310.64*/("""			
			if(!($(this).is(":checked"))) """),format.raw("""{"""),format.raw/*1311.35*/("""
				
				ret = false;
			"""),format.raw("""}"""),format.raw/*1314.5*/("""
		"""),format.raw("""}"""),format.raw/*1315.4*/(""")
		return ret;
	"""),format.raw("""}"""),format.raw/*1317.3*/("""

	function refreshObligatoire() """),format.raw("""{"""),format.raw/*1319.33*/(""" // met à jour les classes "obligatoire" sur les bonnes lignes de participants
		$(".checktd").removeClass("obligatoire");
		$(".checkbox").removeClass("obligatoire");
		$(".obligatoirecb").each(function () """),format.raw("""{"""),format.raw/*1322.41*/("""
			
			if($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*1324.41*/("""					
				$(this).parent().parent().siblings(".checktd").addClass("obligatoire");
				$(this).parent().parent().siblings(".checktd").children().addClass("obligatoire");
			"""),format.raw("""}"""),format.raw/*1327.5*/("""

		"""),format.raw("""}"""),format.raw/*1329.4*/(""")
	"""),format.raw("""}"""),format.raw/*1330.3*/("""








	
	
	

	

	

	

	

	


	
	/*Code d'affichage des dates populaires*/
	function affichagePopulaire() """),format.raw("""{"""),format.raw/*1356.33*/("""
		var max = 0;
		$("#compte").children(".horaire, .jour").each( function() """),format.raw("""{"""),format.raw/*1358.62*/(""" // récupération de la valeur maximale dans les comptes
			$(this).css("background-color", color1) 
			$('.titres').children().css("background-color",color1);
			//$('.footer').html("");
			if (checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*1362.70*/("""			
				if ($(this).html() > max) """),format.raw("""{"""),format.raw/*1363.32*/("""			
					max = $(this).html();
				"""),format.raw("""}"""),format.raw/*1365.6*/("""
			"""),format.raw("""}"""),format.raw/*1366.5*/("""		
		"""),format.raw("""}"""),format.raw/*1367.4*/(""")
		$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*1368.45*/("""
			
			if ($(this).html() == max && $(this).html() != 0 && checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*1370.118*/("""			
				$(this).css("background-color", color2);				
				$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", color2);
				if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*1373.45*/("""
					var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
					$("td:contains('"+day+"')").css("background-color", color2);
					
				"""),format.raw("""}"""),format.raw/*1377.6*/("""
			"""),format.raw("""}"""),format.raw/*1378.5*/("""
		"""),format.raw("""}"""),format.raw/*1379.4*/(""")
	"""),format.raw("""}"""),format.raw/*1380.3*/("""
	</script>

""")))})),format.raw/*1383.2*/("""
"""))}
    }
    
    def render(event:Evenement,adm:Integer) = apply(event,adm)
    
    def f:((Evenement,Integer) => play.api.templates.Html) = (event,adm) => apply(event,adm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jul 27 10:08:42 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/editForm.scala.html
                    HASH: 5ed36be72398568ee61ce95fc7f9368a9a7ab2b6
                    MATRIX: 769->1|886->54|918->78|1002->33|1030->52|1058->132|1097->137|1132->164|1171->166|1234->193|1248->198|1276->204|1361->253|1375->258|1403->264|1473->298|1487->303|1518->312|1560->318|1613->362|1653->364|1708->382|1723->387|1752->393|1787->395|1831->404|1866->430|1906->432|1962->452|1976->457|2009->468|2054->482|2097->490|2118->502|2158->504|2230->540|2245->546|2301->580|2442->690|3301->1514|3322->1526|3361->1527|3532->1667|3751->1851|3791->1875|3831->1877|3891->1901|3904->1905|3929->1908|3990->1933|4003->1937|4041->1953|4111->1987|4124->1991|4151->1996|4199->2009|4220->2021|4259->2022|4303->2030|4316->2034|4341->2037|4483->2146|4526->2154|4547->2166|4586->2167|4630->2175|4643->2179|4668->2182|4790->2271|4880->2330|5018->2433|5058->2457|5098->2459|5142->2468|5180->2497|5219->2498|5289->2537|5335->2547|5380->2576|5420->2578|5475->2597|5491->2604|5516->2607|5562->2617|5575->2621|5600->2624|5666->2654|5682->2661|5710->2667|5750->2671|5766->2678|5792->2682|5841->2695|5862->2707|5901->2708|5945->2716|5961->2723|5986->2726|6033->2737|6046->2741|6071->2744|6206->2846|6263->2871|6303->2880|6374->2916|6428->2954|6468->2956|6521->2973|6541->2984|6567->2988|6610->2995|6630->3006|6655->3009|6744->3063|6823->3133|6863->3135|6906->3143|6937->3165|6976->3166|7058->3217|7101->3225|7137->3252|7176->3253|7290->3350|7303->3355|7342->3356|7457->3440|7547->3494|7567->3505|7593->3509|7684->3564|7704->3575|7729->3578|7874->3687|7894->3698|7919->3701|8056->3807|8109->3825|8149->3849|8189->3851|8236->3862|8274->3891|8313->3892|8362->3905|8419->3953|8459->3955|8547->4007|8560->4011|8585->4014|8688->4080|8702->4084|8730->4089|8777->4118|8790->4123|8829->4124|8918->4177|8931->4181|8956->4184|9051->4242|9065->4246|9093->4251|9153->4279|9210->4303|9264->4320|9310->4349|9351->4351|9407->4370|9471->4424|9512->4426|9601->4478|9618->4485|9644->4488|9751->4557|9769->4564|9799->4570|9841->4574|9859->4581|9887->4585|9935->4614|9949->4619|9989->4620|10079->4673|10096->4680|10122->4683|10220->4743|10238->4750|10268->4756|10310->4760|10328->4767|10356->4771|10417->4799|10467->4816|10542->4858|10593->4877|10688->4936|10732->4970|10772->4971|10827->4993|10903->5033|10944->5057|10985->5059|11030->5068|11069->5097|11109->5098|11180->5132|11194->5136|11220->5139|11290->5177|11342->5192|11388->5221|11429->5223|11507->5264|11524->5271|11550->5274|11636->5327|11673->5332|11790->5413|11812->5425|11852->5426|12242->5784|14254->7759|14270->7765|14330->7802|14426->7861|14442->7867|14506->7908|14729->8083|14920->8227|15051->8310|15099->8322|15125->8325|15184->8336|15286->8391|15336->8394|15403->8413|15525->8487|15619->8533|15884->8751|15935->8755|15987->8760|16077->8802|16254->8931|16361->8990|16447->9028|16517->9050|16630->9126|16645->9131|16678->9141|16730->9145|16819->9187|16874->9194|16967->9240|17028->9254|17084->9263|17140->9272|17237->9321|17328->9365|17412->9401|17576->9517|17646->9539|17762->9607|17831->9639|17847->9645|17903->9678|17967->9694|18042->9721|18162->9793|18261->9845|18314->9851|18409->9899|18465->9908|18521->9917|18664->10012|18753->10053|18912->10165|18967->10172|19132->10290|19182->10293|19278->10341|19375->10390|19478->10445|19545->10475|19561->10481|19615->10512|19678->10527|19811->10612|19929->10682|20028->10734|20080->10739|20133->10745|20183->10748|20279->10796|20360->10829|20523->10945|20578->10952|20747->11074|20797->11077|20878->11111|20972->11157|21022->11159|21101->11191|21151->11193|21215->11209|21266->11211|21321->11217|21374->11221|21425->11223|21476->11225|21551->11251|21602->11253|21682->11285|21733->11287|21798->11303|21849->11305|21904->11311|21957->11315|22045->11356|22113->11377|22171->11388|22240->11410|22290->11413|22400->11475|22590->11617|22703->11682|22816->11748|22867->11752|22959->11796|23044->11834|23197->11940|23294->11989|23408->12055|23614->12213|23669->12220|23884->12387|23934->12390|24027->12435|24128->12489|24223->12536|24341->12606|24545->12762|24600->12769|24813->12934|24866->12940|24947->12973|25076->13054|25154->13084|25257->13140|25337->13172|25429->13216|25539->13279|25594->13286|25699->13344|25751->13349|25802->13353|25855->13359|25934->13390|26113->13521|26231->13591|26406->13719|26461->13727|26578->13796|26700->13870|26872->13995|26930->14006|26982->14011|27278->14259|27438->14371|27509->14394|27656->14494|27728->14518|27878->14621|27933->14629|27986->14635|28075->14676|28235->14788|28305->14810|28406->14863|28641->15051|28693->15056|28748->15064|28801->15070|28887->15108|29047->15220|29117->15242|29246->15323|29334->15364|29389->15371|29482->15417|29622->15510|29699->15539|29795->15588|29850->15596|29903->15602|29996->15647|30156->15759|30226->15781|30362->15869|30456->15916|30511->15923|30604->15969|30751->16069|30828->16098|30924->16147|30979->16155|31032->16161|31189->16271|31249->16283|31314->16311|31330->16317|31448->16411|31510->16425|31643->16510|31759->16578|31853->16624|31965->16689|32657->17345|32698->17369|32739->17371|32787->17383|32826->17412|32866->17413|32983->17492|32998->17496|33025->17499|33117->17553|33132->17557|33161->17562|33206->17573|33252->17583|33298->17612|33339->17614|33483->17721|33500->17728|33526->17731|33621->17788|33639->17795|33669->17801|33711->17805|33729->17812|33757->17816|33828->17855|33903->17898|34061->18019|34087->18022|34146->18033|34272->18112|34329->18122|34397->18143|34449->18148|34540->18191|34683->18286|34808->18364|34870->18379|34957->18418|35072->18485|35235->18600|35356->18674|35432->18703|35483->18707|35713->18889|35846->18975|35941->19022|36002->19046|36043->19070|36084->19072|36123->19074|36137->19078|36165->19083|36200->19085|36334->19171|36429->19219|36542->19284|36629->19324|36684->19331|36744->19343|36811->19373|36827->19379|36880->19409|36943->19424|37033->19466|37151->19536|38044->20382|38096->20387|38150->20394|38200->20397|38282->20431|38458->20559|38658->20712|38740->20746|38935->20894|38985->20897|39081->20945|39262->21078|39332->21100|39400->21120|39469->21152|39485->21158|39541->21191|39605->21207|39683->21237|39803->21309|39873->21331|39946->21367|39962->21373|40019->21407|40085->21425|40243->21535|40367->21611|40432->21629|40502->21652|40558->21661|40611->21667|40835->21844|40912->21873|41008->21922|41063->21930|41116->21936|41187->21959|41410->22134|41523->22199|41636->22265|41687->22269|41779->22313|41864->22351|41992->22432|42067->22459|42144->22499|42159->22504|42185->22507|42251->22526|42325->22552|42429->22609|42610->22742|42700->22784|42765->22812|42781->22818|42840->22854|42902->22868|43034->22952|43150->23020|43275->23098|43353->23128|43509->23237|43560->23241|43614->23248|43705->23291|43794->23332|43861->23362|43877->23368|43933->23401|43996->23416|44084->23456|44203->23526|44326->23601|44405->23631|44556->23734|44609->23739|44667->23749|44836->23869|44944->23928|45055->23990|45156->24042|45226->24074|45243->24080|45289->24102|45354->24118|45455->24170|45576->24242|45724->24342|45780->24350|45843->24365|45899->24372|45974->24399|46034->24411|46090->24418|46772->25052|46829->25061|46906->25089|47423->25558|47523->25610|47584->25622|47650->25650|47667->25656|47728->25693|47791->25707|47899->25766|48016->25834|48107->25877|48160->25882|48213->25887|48306->25931|48409->25985|48512->26039|48597->26075|48698->26128|48788->26170|48844->26177|48929->26213|49031->26267|49129->26317|49275->26414|49377->26467|49477->26519|49534->26528|49590->26536|49641->26539|49722->26571|49941->26741|50148->26899|50399->27102|50505->27159|50746->27352|50800->27358|50856->27365|51057->27517|51289->27701|51391->27754|51622->27937|51676->27943|51727->27946|51861->28032|51922->28044|51988->28072|52005->28078|52064->28113|52127->28127|52244->28195|52361->28263|52445->28299|52499->28305|52552->28310|52687->28397|52748->28409|52814->28437|52831->28443|52893->28481|52956->28495|53076->28566|53193->28634|53280->28673|53334->28679|53387->28684|53558->28806|53659->28858|53757->28907|53825->28937|53842->28943|53888->28965|53952->28980|54053->29032|54172->29102|54323->29205|54378->29212|54439->29225|54495->29232|54590->29279|54647->29288|54736->29329|54902->29446|55006->29502|55116->29563|55195->29594|55283->29633|55349->29661|55366->29667|55430->29707|55493->29721|55580->29759|55697->29827|55791->29873|55846->29880|55899->29885|56025->29962|56128->30017|56228->30068|56517->30308|56650->30393|56706->30400|56852->30498|56913->30510|56981->30540|56998->30546|57062->30586|57126->30601|57214->30640|57333->30710|57415->30744|57471->30752|57554->30787|57648->30832|57865->31000|57952->31038|58027->31065|58079->31069|58145->31087|58228->31121|58485->31329|58579->31374|58800->31547|58853->31552|58905->31556|59063->31665|59189->31742|59494->31998|59578->32033|59662->32069|59715->32074|59769->32080|59864->32126|60036->32248|60291->32454|60521->32636|60574->32641|60626->32645|60678->32649|60725->32663
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|39->10|39->10|39->10|42->13|42->13|42->13|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|45->16|45->16|45->16|46->17|46->17|46->17|47->18|49->20|49->20|49->20|50->21|50->21|50->21|52->23|71->42|71->42|71->42|74->45|80->51|80->51|80->51|81->52|81->52|81->52|81->52|81->52|81->52|82->53|82->53|82->53|83->54|83->54|83->54|83->54|83->54|83->54|83->54|84->55|84->55|84->55|84->55|84->55|84->55|84->55|86->57|89->60|89->60|89->60|90->61|90->61|90->61|92->63|93->64|93->64|93->64|94->65|94->65|94->65|94->65|94->65|94->65|95->66|95->66|95->66|95->66|95->66|95->66|96->67|96->67|96->67|96->67|96->67|96->67|96->67|96->67|96->67|96->67|98->69|100->71|104->75|104->75|104->75|105->76|105->76|105->76|105->76|105->76|105->76|106->77|106->77|106->77|107->78|107->78|107->78|109->80|110->81|110->81|110->81|112->83|112->83|112->83|114->85|116->87|116->87|116->87|117->88|117->88|117->88|118->89|118->89|118->89|119->90|121->92|121->92|121->92|122->93|122->93|122->93|123->94|123->94|123->94|124->95|124->95|124->95|124->95|124->95|124->95|125->96|125->96|125->96|126->97|126->97|126->97|126->97|126->97|126->97|127->98|129->100|130->101|130->101|130->101|131->102|131->102|131->102|132->103|132->103|132->103|132->103|132->103|132->103|132->103|132->103|132->103|133->104|133->104|133->104|134->105|134->105|134->105|134->105|134->105|134->105|134->105|134->105|134->105|135->106|136->107|137->108|139->110|143->114|143->114|143->114|143->114|145->116|145->116|145->116|146->117|146->117|146->117|147->118|147->118|147->118|148->119|149->120|149->120|149->120|150->121|150->121|150->121|151->122|152->123|166->137|166->137|166->137|176->147|242->213|242->213|242->213|243->214|243->214|243->214|252->223|257->228|275->246|277->248|277->248|277->248|279->250|280->251|282->253|285->256|287->258|292->263|293->264|294->265|296->267|301->272|301->272|303->274|304->275|307->278|307->278|307->278|307->278|309->280|309->280|311->282|313->284|314->285|317->288|319->290|321->292|323->294|329->300|330->301|333->304|335->306|335->306|335->306|336->307|336->307|338->309|341->312|342->313|345->316|346->317|349->320|387->358|389->360|392->363|392->363|395->366|396->367|398->369|400->371|403->374|405->376|405->376|405->376|406->377|406->377|408->379|410->381|411->382|412->383|413->384|416->387|418->389|422->393|422->393|426->397|427->398|430->401|431->402|431->402|431->402|431->402|431->402|431->402|431->402|431->402|431->402|431->402|431->402|431->402|431->402|431->402|431->402|431->402|431->402|431->402|434->405|436->407|438->409|440->411|441->412|471->442|475->446|476->447|478->449|479->450|481->452|483->454|488->459|490->461|491->462|494->465|494->465|497->468|498->469|500->471|503->474|505->476|506->477|509->480|509->480|512->483|513->484|515->486|517->488|519->490|521->492|523->494|524->495|526->497|526->497|528->499|529->500|530->501|532->503|536->507|537->508|540->511|543->514|545->516|547->518|550->521|553->524|555->526|556->527|601->572|606->577|607->578|610->581|611->582|614->585|615->586|617->588|620->591|625->596|626->597|629->600|634->605|635->606|636->607|638->609|640->611|645->616|646->617|649->620|651->622|651->622|653->624|657->628|659->630|661->632|662->633|664->635|666->637|671->642|672->643|675->646|677->648|677->648|679->650|683->654|685->656|687->658|688->659|690->661|724->695|725->696|727->698|727->698|727->698|728->699|728->699|730->701|732->703|734->705|743->714|743->714|743->714|744->715|744->715|744->715|744->715|744->715|744->715|744->715|744->715|744->715|744->715|745->716|745->716|745->716|746->717|746->717|746->717|746->717|746->717|746->717|746->717|746->717|746->717|747->718|748->719|753->724|753->724|753->724|756->727|757->728|759->730|760->731|762->733|767->738|771->742|774->745|776->747|778->749|781->752|784->755|786->757|788->759|826->797|830->801|832->803|833->804|833->804|833->804|833->804|833->804|833->804|833->804|835->806|837->808|840->811|842->813|842->813|843->814|845->816|845->816|845->816|846->817|846->817|848->819|869->840|870->841|871->842|872->843|874->845|880->851|883->854|884->855|888->859|889->860|891->862|897->868|898->869|900->871|902->873|902->873|902->873|903->874|903->874|905->876|907->878|909->880|909->880|909->880|910->881|912->883|914->885|916->887|917->888|918->889|919->890|933->904|935->906|937->908|938->909|940->911|942->913|949->920|950->921|952->923|953->924|955->926|957->928|962->933|964->935|965->936|965->936|965->936|966->937|968->939|972->943|1001->972|1005->976|1007->978|1007->978|1007->978|1008->979|1008->979|1010->981|1013->984|1014->985|1016->987|1017->988|1019->990|1021->992|1025->996|1027->998|1027->998|1027->998|1028->999|1028->999|1030->1001|1033->1004|1034->1005|1036->1007|1037->1008|1039->1010|1070->1041|1072->1043|1073->1044|1075->1046|1077->1048|1077->1048|1077->1048|1078->1049|1078->1049|1080->1051|1085->1056|1086->1057|1088->1059|1088->1059|1090->1061|1092->1063|1092->1063|1102->1073|1105->1076|1107->1078|1116->1087|1119->1090|1120->1091|1122->1093|1122->1093|1122->1093|1123->1094|1123->1094|1125->1096|1127->1098|1128->1099|1129->1100|1131->1102|1132->1103|1133->1104|1134->1105|1136->1107|1138->1109|1138->1109|1139->1110|1141->1112|1143->1114|1148->1119|1149->1120|1151->1122|1152->1123|1153->1124|1154->1125|1156->1127|1160->1131|1162->1133|1166->1137|1167->1138|1171->1142|1172->1143|1172->1143|1175->1146|1179->1150|1180->1151|1184->1155|1185->1156|1186->1157|1189->1160|1190->1161|1192->1163|1192->1163|1192->1163|1193->1164|1193->1164|1195->1166|1197->1168|1198->1169|1199->1170|1202->1173|1203->1174|1205->1176|1205->1176|1205->1176|1206->1177|1206->1177|1208->1179|1210->1181|1211->1182|1212->1183|1241->1212|1242->1213|1244->1215|1246->1217|1246->1217|1246->1217|1247->1218|1247->1218|1249->1220|1254->1225|1255->1226|1257->1228|1257->1228|1259->1230|1261->1232|1264->1235|1267->1238|1269->1240|1271->1242|1273->1244|1277->1248|1279->1250|1279->1250|1279->1250|1280->1251|1280->1251|1282->1253|1284->1255|1285->1256|1286->1257|1306->1277|1310->1281|1312->1283|1315->1286|1318->1289|1318->1289|1321->1292|1322->1293|1324->1295|1324->1295|1324->1295|1325->1296|1325->1296|1327->1298|1329->1300|1330->1301|1333->1304|1335->1306|1339->1310|1340->1311|1343->1314|1344->1315|1346->1317|1348->1319|1351->1322|1353->1324|1356->1327|1358->1329|1359->1330|1385->1356|1387->1358|1391->1362|1392->1363|1394->1365|1395->1366|1396->1367|1397->1368|1399->1370|1402->1373|1406->1377|1407->1378|1408->1379|1409->1380|1412->1383
                    -- GENERATED --
                */
            