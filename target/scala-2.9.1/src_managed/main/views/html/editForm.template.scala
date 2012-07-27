
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
	
		<div class="selectDate" style="position:relative; width:500px">
			<textarea id="mailsArea" title="Adresses email s&eacute;par&eacute;es par une virgule" rows="4" style="color:grey" placeholder="Entrez ici les adresses mail séparées par une virgule ..."></textarea>
			<i class="checkmail mesicones icon-remove"></i>
			<a id="envoiLien" disabled="true" class="btn">Envoyer Lien</a> <a class="btnMailPerso" title="Ajouter un texte personnalisé au mail"><i class="mesicones icon-plus"></i></a>
			<div class="champPerso" style="display:none">
				<textarea id="mailPersoArea" rows="6" style="color:grey" placeholder="Entre un message avec votre mail d'invitation"></textarea>
			</div>
		</div>

		"""),_display_(Seq[Any](/*39.4*/if(adm == 1)/*39.16*/ {_display_(Seq[Any](format.raw/*39.18*/("""
			<div class="selectDate" style="position:right; width:500px">
				<h5>Liste des mails invités</h5>
				<p>				
					"""),_display_(Seq[Any](/*43.7*/for(l <- event.mailSentList.split(",")) yield /*43.46*/{_display_(Seq[Any](format.raw/*43.47*/("""
						"""),_display_(Seq[Any](/*44.8*/l)),format.raw/*44.9*/(""" <br>
					""")))})),format.raw/*45.7*/(""" 
				</p>
			</div>
		""")))})),format.raw/*48.4*/("""
	
	
	<br><br>
	<h3>Liste des participants et de leurs disponibilités</h3>

	"""),_display_(Seq[Any](/*54.3*/if(adm != 1)/*54.15*/{_display_(Seq[Any](format.raw/*54.16*/("""
		S'ajouter à la liste des participants :		  
		<input id="champ" type="text" maxlength="25" value="">&nbsp;<a id="ajouter" class="btn">Ajouter</a><br>
	""")))})),format.raw/*57.3*/("""	

	<div id="divtest" >
	<table class="datesTable" cellspacing="5" cellpadding="5">
		<tbody>
			<tr class="titres dates" style="display:none"><td style="visibility:hidden"></td>
				"""),_display_(Seq[Any](/*63.6*/for(jour <- event.jours) yield /*63.30*/ {_display_(Seq[Any](format.raw/*63.32*/("""  					  
					<td id=""""),_display_(Seq[Any](/*64.15*/jour/*64.19*/.id)),format.raw/*64.22*/("""" class="jour" colspan=""""),_display_(Seq[Any](/*64.47*/jour/*64.51*/.horaires.size())),format.raw/*64.67*/("""">
						<b class="jourintitule">"""),_display_(Seq[Any](/*65.32*/jour/*65.36*/.date)),format.raw/*65.41*/(""" </b>
						"""),_display_(Seq[Any](/*66.8*/if(adm == 1)/*66.20*/{_display_(Seq[Any](format.raw/*66.21*/("""<a id=""""),_display_(Seq[Any](/*66.29*/jour/*66.33*/.id)),format.raw/*66.36*/("""" class="horaireAdd" title="Ajouter une plage horaire à cette date" ><i class="mesicones icon-plus"></i></a>""")))})),format.raw/*66.145*/("""
						"""),_display_(Seq[Any](/*67.8*/if(adm == 1)/*67.20*/{_display_(Seq[Any](format.raw/*67.21*/("""<a id=""""),_display_(Seq[Any](/*67.29*/jour/*67.33*/.id)),format.raw/*67.36*/("""" class="jourDel" title="Supprimer cette date"><i class="mesicones icon-remove"></i></a>""")))})),format.raw/*67.125*/("""
					</td>	                        	                
				""")))})),format.raw/*69.6*/("""
			</tr>
			<tr class="titres horaires" style="display:none"><td style="visibility:hidden"></td>
				"""),_display_(Seq[Any](/*72.6*/for(jour <- event.jours) yield /*72.30*/ {_display_(Seq[Any](format.raw/*72.32*/("""  
					"""),_display_(Seq[Any](/*73.7*/if(jour.horaires.size() == 0)/*73.36*/{_display_(Seq[Any](format.raw/*73.37*/("""
					    <td class="jour"></td>
					""")))})),format.raw/*75.7*/("""
				    """),_display_(Seq[Any](/*76.10*/for(horaire <- jour.horaires) yield /*76.39*/ {_display_(Seq[Any](format.raw/*76.41*/("""
				    	<td id=""""),_display_(Seq[Any](/*77.19*/horaire/*77.26*/.id)),format.raw/*77.29*/("""" dayid=""""),_display_(Seq[Any](/*77.39*/jour/*77.43*/.id)),format.raw/*77.46*/("""" class="horaire">
				    		"""),_display_(Seq[Any](/*78.12*/horaire/*78.19*/.debut)),format.raw/*78.25*/(""" - """),_display_(Seq[Any](/*78.29*/horaire/*78.36*/.fin)),format.raw/*78.40*/(""" 
				    		"""),_display_(Seq[Any](/*79.12*/if(adm == 1)/*79.24*/{_display_(Seq[Any](format.raw/*79.25*/("""<a id=""""),_display_(Seq[Any](/*79.33*/horaire/*79.40*/.id)),format.raw/*79.43*/("""" idjour=""""),_display_(Seq[Any](/*79.54*/jour/*79.58*/.id)),format.raw/*79.61*/("""" class="horaireDel" title="Supprimer cette plage horaire" ><i class="mesicones icon-remove"></i></a>""")))})),format.raw/*79.163*/("""
				    	</td>
				    """)))})),format.raw/*81.10*/("""  

				""")))})),format.raw/*83.6*/("""
			</tr>
			              
			
			"""),_display_(Seq[Any](/*87.5*/for(participant <- event.participants) yield /*87.43*/ {_display_(Seq[Any](format.raw/*87.45*/("""
				<tr title=""""),_display_(Seq[Any](/*88.17*/participant/*88.28*/.nom)),format.raw/*88.32*/("""" id=""""),_display_(Seq[Any](/*88.39*/participant/*88.50*/.id)),format.raw/*88.53*/("""" class="participant"><td class="infoPersonne">
					"""),_display_(Seq[Any](/*89.7*/form(routes.Application.updatePersonne(event.id), 'id->"formPersonne")/*89.77*/ {_display_(Seq[Any](format.raw/*89.79*/("""
						"""),_display_(Seq[Any](/*90.8*/if(participant.locked)/*90.30*/{_display_(Seq[Any](format.raw/*90.31*/("""
							<i class="mesicones icon-lock"></i>
						""")))})),format.raw/*92.8*/("""
						"""),_display_(Seq[Any](/*93.8*/if(participant.obligatoire)/*93.35*/{_display_(Seq[Any](format.raw/*93.36*/("""							
							<a id="obligatoire" class="obligatoirecb btn btn-inverse">Obligatoire</a>
						""")))}/*95.9*/else/*95.14*/{_display_(Seq[Any](format.raw/*95.15*/("""							
							<a id="obligatoire" class="obligatoirecb btn ">Facultatif</a>
						""")))})),format.raw/*97.8*/("""

						<input id="nom" maxlength="25" type="text" value=""""),_display_(Seq[Any](/*99.58*/participant/*99.69*/.nom)),format.raw/*99.73*/("""" name="nom" readonly="readonly">							
						<a id=""""),_display_(Seq[Any](/*100.15*/participant/*100.26*/.id)),format.raw/*100.29*/("""" title="Editer le participant" class="editPersonne"><i class="mesicones icon-pencil"></i></a>
						<a id=""""),_display_(Seq[Any](/*101.15*/participant/*101.26*/.id)),format.raw/*101.29*/("""" title="Supprimer le participant" class="deletePersonne"> <i class="mesicones icon-trash"></i></a>
					""")))})),format.raw/*102.7*/("""</td>
					
					"""),_display_(Seq[Any](/*104.7*/for(jour <- event.jours) yield /*104.31*/ {_display_(Seq[Any](format.raw/*104.33*/("""
					    """),_display_(Seq[Any](/*105.11*/if(jour.horaires.size() == 0)/*105.40*/{_display_(Seq[Any](format.raw/*105.41*/("""
					      """),_display_(Seq[Any](/*106.13*/if(participant.inscriptionsJours.contains(jour))/*106.61*/ {_display_(Seq[Any](format.raw/*106.63*/("""
			                <td class="checktd"><input id=""""),_display_(Seq[Any](/*107.52*/jour/*107.56*/.id)),format.raw/*107.59*/("""" type="checkbox"  disabled checked class="jour checkbox" value=""""),_display_(Seq[Any](/*107.125*/jour/*107.129*/.date)),format.raw/*107.134*/("""" /></td>
			              """)))}/*108.20*/else/*108.25*/{_display_(Seq[Any](format.raw/*108.26*/("""
			                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*109.53*/jour/*109.57*/.id)),format.raw/*109.60*/("""" type="checkbox"  disabled class="jour checkbox" value=""""),_display_(Seq[Any](/*109.118*/jour/*109.122*/.date)),format.raw/*109.127*/("""" /></td>
			              """)))})),format.raw/*110.19*/("""
					       
					    """)))})),format.raw/*112.11*/("""
			            """),_display_(Seq[Any](/*113.17*/for(horaire <- jour.horaires) yield /*113.46*/ {_display_(Seq[Any](format.raw/*113.48*/("""
			              """),_display_(Seq[Any](/*114.19*/if(participant.inscriptionsHoraires.contains(horaire))/*114.73*/ {_display_(Seq[Any](format.raw/*114.75*/("""
			                <td class="checktd"><input id=""""),_display_(Seq[Any](/*115.52*/horaire/*115.59*/.id)),format.raw/*115.62*/("""" type="checkbox" disabled class="horaire checkbox"  checked value=""""),_display_(Seq[Any](/*115.131*/horaire/*115.138*/.debut)),format.raw/*115.144*/(""" - """),_display_(Seq[Any](/*115.148*/horaire/*115.155*/.fin)),format.raw/*115.159*/("""" /></td>
			              """)))}/*116.20*/else/*116.25*/{_display_(Seq[Any](format.raw/*116.26*/("""
			                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*117.53*/horaire/*117.60*/.id)),format.raw/*117.63*/("""" type="checkbox" disabled class="horaire checkbox" value=""""),_display_(Seq[Any](/*117.123*/horaire/*117.130*/.debut)),format.raw/*117.136*/(""" - """),_display_(Seq[Any](/*117.140*/horaire/*117.147*/.fin)),format.raw/*117.151*/("""" /></td>
			              """)))})),format.raw/*118.19*/("""
			            """)))})),format.raw/*119.17*/("""            	                
			        """)))})),format.raw/*120.13*/("""				
				</tr>
			""")))})),format.raw/*122.5*/("""
		</tbody>
		<tfoot>
		<tr id="compte" class="titres"
		 """),_display_(Seq[Any](/*126.5*/if(event.participants.size() == 0)/*126.39*/{_display_(Seq[Any](format.raw/*126.40*/(""" style="display:none"""")))})),format.raw/*126.62*/(""">
			<td id=""><b>Compte: </b></td>
			"""),_display_(Seq[Any](/*128.5*/for(jour <- event.jours) yield /*128.29*/ {_display_(Seq[Any](format.raw/*128.31*/("""
			    """),_display_(Seq[Any](/*129.9*/if(jour.horaires.size() == 0)/*129.38*/{_display_(Seq[Any](format.raw/*129.39*/("""		     
	                <td id=""""),_display_(Seq[Any](/*130.27*/jour/*130.31*/.id)),format.raw/*130.34*/("""" class="jour">0</td>	       
			    """)))})),format.raw/*131.9*/("""
	            """),_display_(Seq[Any](/*132.15*/for(horaire <- jour.horaires) yield /*132.44*/ {_display_(Seq[Any](format.raw/*132.46*/("""              
	                <td id=""""),_display_(Seq[Any](/*133.27*/horaire/*133.34*/.id)),format.raw/*133.37*/("""" class="horaire">0</td>              
	            """)))})),format.raw/*134.15*/("""
			""")))})),format.raw/*135.5*/("""
		</tr>
		
			
		</tfoot>
		
	</table>
	</div>

	<div id="refresh"></div>




	"""),_display_(Seq[Any](/*149.3*/if(adm == 1)/*149.15*/{_display_(Seq[Any](format.raw/*149.16*/("""
	<a class="visibleAdd" ><i class="mesicones icon-plus"></i></a>
	
	<div class="champAdd" style="display:none">		
		Ajouter un participant :		  
		<input id="champ" type="text" size="25" value="">&nbsp;<a id="ajouter" class="btn">Ajouter</a><br><br>

		Ajouter une date:
		<input id="datepicker" type="text">&nbsp;<a id="ajouterDate" class="btn">Ajouter</a>
	</div>
	""")))})),format.raw/*159.3*/("""
	
	

	
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

	<!--<script type="text/javascript" src=""""),_display_(Seq[Any](/*225.43*/routes/*225.49*/.Assets.at("javascripts/sendMail.js"))),format.raw/*225.86*/(""""></script>  -->
	<!--<script type="text/javascript" src=""""),_display_(Seq[Any](/*226.43*/routes/*226.49*/.Assets.at("javascripts/editPersonne.js"))),format.raw/*226.90*/(""""></script> -->

	<script type="text/javascript" charset="utf-8">
	
	var color1 = "#FFFF99";
	var color2 = "gold";
	var color3 = "steelblue";
	var mdp = "";

	/*$(function() """),format.raw("""{"""),format.raw/*235.18*/("""
       hash = encode64("1");
       hash2 = encode64(hash);
       alert("code:"+hash2);
       alert("decode"+decode64(decode64(hash2)));
   """),format.raw("""}"""),format.raw/*240.5*/(""")*/
	














	/*Code concernant l'interface administrateur*/

	$(function()"""),format.raw("""{"""),format.raw/*258.15*/("""		

		if (""""),_display_(Seq[Any](/*260.9*/adm)),format.raw/*260.12*/("""" == "1") """),format.raw("""{"""),format.raw/*260.23*/("""
			$( "#dialog-check-pwd-adm" ).dialog( "open" );	
		"""),format.raw("""}"""),format.raw/*262.4*/("""
	"""),format.raw("""}"""),format.raw/*263.3*/(""");

	$(function() """),format.raw("""{"""),format.raw/*265.16*/("""
		//$( "#datepicker" ).datepicker();
		
		$( "#datepicker" ).datepicker("""),format.raw("""{"""),format.raw/*268.34*/("""
			 minDate: 0,
			onSelect: function(date) """),format.raw("""{"""),format.raw/*270.30*/("""				
				var selectionType = $.inArray(date, $( "#date" ).multiDatesPicker('getDates'));				
				var d = new Date(date);		
				var dateText = d.toLocaleDateString();
				$( "#datepicker" ).attr("value", dateText);
			"""),format.raw("""}"""),format.raw/*275.5*/("""
		"""),format.raw("""}"""),format.raw/*276.4*/(""");
	"""),format.raw("""}"""),format.raw/*277.3*/(""");

	$( "#dialog-check-pwd-adm" ).dialog("""),format.raw("""{"""),format.raw/*279.39*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		open: function(event, ui) """),format.raw("""{"""),format.raw/*284.30*/(""" $(".ui-dialog-titlebar-close", $(this).parent()).hide(); """),format.raw("""}"""),format.raw/*284.89*/(""",
		closeOnEscape: false,
		buttons: """),format.raw("""{"""),format.raw/*286.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*287.22*/("""				
								
				pass = $("#password-check-adm").val();	
				if (pass == """"),_display_(Seq[Any](/*290.19*/event/*290.24*/.passAdmin)),format.raw/*290.34*/("""") """),format.raw("""{"""),format.raw/*290.38*/("""
				  	$( this ).dialog( "close" );
				"""),format.raw("""}"""),format.raw/*292.6*/(""" else """),format.raw("""{"""),format.raw/*292.13*/("""
				  	alert("mot de passe incorrect");
				"""),format.raw("""}"""),format.raw/*294.6*/("""				
				
			"""),format.raw("""}"""),format.raw/*296.5*/("""					
		"""),format.raw("""}"""),format.raw/*297.4*/("""
		
		
	"""),format.raw("""}"""),format.raw/*300.3*/(""");

	$("#newPassAdmin").live("click", function()"""),format.raw("""{"""),format.raw/*302.46*/("""
		$( "#dialog-new-adm" ).dialog("open");
	"""),format.raw("""}"""),format.raw/*304.3*/(""");

	$( "#dialog-new-adm" ).dialog("""),format.raw("""{"""),format.raw/*306.33*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,	
		
		buttons: """),format.raw("""{"""),format.raw/*312.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*313.22*/("""				
								
				pass = $("#password-new-adm").val();	
				$.ajax("""),format.raw("""{"""),format.raw/*316.13*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*318.13*/routes/*318.19*/.Application.newAdmPass(event.id))),format.raw/*318.52*/("""",
					data: '"""),format.raw("""{"""),format.raw/*319.14*/(""""newPass" : "' + pass + '""""),format.raw("""}"""),format.raw/*319.41*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*321.32*/("""
						alert("Nouveau mot de passe etabli");

					"""),format.raw("""}"""),format.raw/*324.7*/("""
				"""),format.raw("""}"""),format.raw/*325.6*/(""");
				$( this ).dialog( "close" );			
				
			"""),format.raw("""}"""),format.raw/*328.5*/("""					
		"""),format.raw("""}"""),format.raw/*329.4*/("""
		
		
	"""),format.raw("""}"""),format.raw/*332.3*/(""");



































	/*Code concernant les mails et l'envoi*/

	$(function()"""),format.raw("""{"""),format.raw/*370.15*/("""

		if (bonmail($("#mailsArea").val())) """),format.raw("""{"""),format.raw/*372.40*/("""
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
			$("#envoiLien").removeAttr("disabled");
		"""),format.raw("""}"""),format.raw/*376.4*/(""" else """),format.raw("""{"""),format.raw/*376.11*/("""
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
		"""),format.raw("""}"""),format.raw/*379.4*/("""
	"""),format.raw("""}"""),format.raw/*380.3*/(""");

	$('#envoiLien').live('click', function(e) """),format.raw("""{"""),format.raw/*382.45*/("""
		var canSend = true;
		var tableau = $("#mailsArea").val().split(",");
		for (var i=0; i<tableau.length; i++) """),format.raw("""{"""),format.raw/*385.41*/("""
			
			if (""""),_display_(Seq[Any](/*387.10*/event/*387.15*/.mailSentList)),format.raw/*387.28*/("""".indexOf($.trim(tableau[i])) != -1 && tableau[i] != '') """),format.raw("""{"""),format.raw/*387.86*/("""				
				canSend = false;
				break;
			"""),format.raw("""}"""),format.raw/*390.5*/("""
		"""),format.raw("""}"""),format.raw/*391.4*/("""
		if ($(this).attr("disabled") != "disabled" && canSend == true) """),format.raw("""{"""),format.raw/*392.67*/("""
			var mailsList = $("#mailsArea").val();

			$.ajax("""),format.raw("""{"""),format.raw/*395.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*397.12*/routes/*397.18*/.Application.sendMail(event.id))),format.raw/*397.49*/("""",
				data: '"""),format.raw("""{"""),format.raw/*398.13*/(""""mailslist" : "' + mailsList + '", "textPerso" : "' + $("#mailPersoArea").val() + '""""),format.raw("""}"""),format.raw/*398.98*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*400.31*/("""
					alert("Mail(s) envoye(s) a "+mailsList);
				"""),format.raw("""}"""),format.raw/*402.6*/("""
			"""),format.raw("""}"""),format.raw/*403.5*/(""");
		"""),format.raw("""}"""),format.raw/*404.4*/("""
	"""),format.raw("""}"""),format.raw/*405.3*/(""");


	$("#mailsArea").live("keyup", function() """),format.raw("""{"""),format.raw/*408.44*/("""

		if (bonmail($(this).val())) """),format.raw("""{"""),format.raw/*410.32*/("""
			
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
			$("#envoiLien").addClass("btn-primary");
		"""),format.raw("""}"""),format.raw/*415.4*/(""" else """),format.raw("""{"""),format.raw/*415.11*/("""
			
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
			$("#envoiLien").removeClass("btn-primary");
		"""),format.raw("""}"""),format.raw/*420.4*/("""
	"""),format.raw("""}"""),format.raw/*421.3*/(""")
	
	function bonmail(mailtest)
	"""),format.raw("""{"""),format.raw/*424.3*/("""
		var reg = new RegExp('^([a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*425.46*/("""1"""),format.raw("""}"""),format.raw/*425.48*/("""[a-z0-9]+)*@[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*425.80*/("""1"""),format.raw("""}"""),format.raw/*425.82*/("""[a-z0-9]+)*[\.]"""),format.raw("""{"""),format.raw/*425.98*/("""1"""),format.raw("""}"""),format.raw/*425.100*/("""[a-z]"""),format.raw("""{"""),format.raw/*425.106*/("""2,6"""),format.raw("""}"""),format.raw/*425.110*/(""")"""),format.raw("""{"""),format.raw/*425.112*/("""1"""),format.raw("""}"""),format.raw/*425.114*/("""(\,( )*[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*425.140*/("""1"""),format.raw("""}"""),format.raw/*425.142*/("""[a-z0-9]+)*@[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*425.174*/("""1"""),format.raw("""}"""),format.raw/*425.176*/("""[a-z0-9]+)*[\.]"""),format.raw("""{"""),format.raw/*425.192*/("""1"""),format.raw("""}"""),format.raw/*425.194*/("""[a-z]"""),format.raw("""{"""),format.raw/*425.200*/("""2,6"""),format.raw("""}"""),format.raw/*425.204*/(""")*$', 'i');

		if(reg.test(mailtest))
		"""),format.raw("""{"""),format.raw/*428.4*/("""
			return(true);
		"""),format.raw("""}"""),format.raw/*430.4*/("""
		else
		"""),format.raw("""{"""),format.raw/*432.4*/("""
			return(false);
		"""),format.raw("""}"""),format.raw/*434.4*/("""
	"""),format.raw("""}"""),format.raw/*435.3*/("""



























	/*Code de style*/

	$(function()"""),format.raw("""{"""),format.raw/*465.15*/("""
		$("table.datesTable td").css("background-color", color3);
		$(".checkbox").attr("disabled", "true"); 

		$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*469.37*/(""" // coloration des box checkées
		  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*470.34*/("""
		  		$(this).parent().css("background-color", "#66CC99");
		  	"""),format.raw("""}"""),format.raw/*472.7*/("""
		"""),format.raw("""}"""),format.raw/*473.4*/(""");

		$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*475.41*/("""
			$('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*477.4*/(""");

		refreshCount(); // maj de la ligne de compteurs

		affichagePopulaire(); // maj des surbrillances
	"""),format.raw("""}"""),format.raw/*482.3*/(""")

	$(".btnMailPerso").live('click', function() """),format.raw("""{"""),format.raw/*484.47*/("""
		if ($(this).siblings(".champPerso").css("display") == "none") """),format.raw("""{"""),format.raw/*485.66*/("""                
            $(this).siblings(".champPerso").removeAttr("style");
            $(this).html("<i class=\"mesicones icon-minus\"></i>")
        """),format.raw("""}"""),format.raw/*488.10*/(""" else """),format.raw("""{"""),format.raw/*488.17*/("""                
            $(this).siblings(".champPerso").attr("style", "display:none");
            $(this).html("<i class=\"mesicones icon-plus\"></i>")
        """),format.raw("""}"""),format.raw/*491.10*/("""
	"""),format.raw("""}"""),format.raw/*492.3*/(""")

	$("textarea").live('click', function(e) """),format.raw("""{"""),format.raw/*494.43*/("""
		$(this).html("");
		$(this).removeAttr("style");
	"""),format.raw("""}"""),format.raw/*497.3*/(""")

	$(".visibleAdd").live("click", function() """),format.raw("""{"""),format.raw/*499.45*/("""
        if ($(this).siblings(".champAdd").css("display") == "none") """),format.raw("""{"""),format.raw/*500.70*/("""                
            $(this).siblings(".champAdd").removeAttr("style");
            $(this).html("<i class=\"mesicones icon-minus\"></i>")
        """),format.raw("""}"""),format.raw/*503.10*/(""" else """),format.raw("""{"""),format.raw/*503.17*/("""                
            $(this).siblings(".champAdd").attr("style", "display:none");
            $(this).html("<i class=\"mesicones icon-plus\"></i>")
        """),format.raw("""}"""),format.raw/*506.10*/("""
    """),format.raw("""}"""),format.raw/*507.6*/(""")

	function refreshHoverable() """),format.raw("""{"""),format.raw/*509.31*/(""" //coloration des cases quand on passe la souris dessus
		
		$(".hoverable").on("""),format.raw("""{"""),format.raw/*511.23*/("""

			mouseenter: function () """),format.raw("""{"""),format.raw/*513.29*/("""
				$(this).css("background-color", "lightgreen");
			"""),format.raw("""}"""),format.raw/*515.5*/(""", 

			mouseleave: function () """),format.raw("""{"""),format.raw/*517.29*/("""
				if ($(this).children().is(':checked'))"""),format.raw("""{"""),format.raw/*518.44*/("""	 
			    	$(this).css("background-color", "#66CC99");
			    """),format.raw("""}"""),format.raw/*520.9*/(""" else """),format.raw("""{"""),format.raw/*520.16*/("""
			    	$(this).css("background-color", color3);
			    """),format.raw("""}"""),format.raw/*522.9*/("""
			"""),format.raw("""}"""),format.raw/*523.5*/("""
		"""),format.raw("""}"""),format.raw/*524.4*/(""");

	"""),format.raw("""}"""),format.raw/*526.3*/("""

	

	function refreshCount() """),format.raw("""{"""),format.raw/*530.27*/(""" // met à jour l'affichage du compte des participants par horaire
		$('input[type="checkbox"].horaire.checkbox').each(function(i) """),format.raw("""{"""),format.raw/*531.66*/("""
			var iden = $(this).attr('id');
			
			if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*534.32*/("""
		    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			"""),format.raw("""}"""),format.raw/*537.5*/("""
			
		"""),format.raw("""}"""),format.raw/*539.4*/(""");
			
		$('input[type="checkbox"].jour.checkbox').each(function(i) """),format.raw("""{"""),format.raw/*541.63*/("""
			var iden = $(this).attr('id');			
				
			if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*544.32*/("""
		    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			"""),format.raw("""}"""),format.raw/*547.5*/("""			
			
		"""),format.raw("""}"""),format.raw/*549.4*/(""");
	"""),format.raw("""}"""),format.raw/*550.3*/("""










	























	/*Code sur les mots de passe*/

	$( "#dialog:ui-dialog" ).dialog( "destroy" ); 
		
	
	var pass = "";
	var goodPass = "";
	var currentEditButton;
	var currentDelButton;

	$( "#dialog-question-securise" ).dialog("""),format.raw("""{"""),format.raw/*595.43*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*600.13*/("""
			"Oui": function() """),format.raw("""{"""),format.raw/*601.23*/("""				    	
			    $( "#dialog-new-pwd" ).dialog( "open" );  
			    $( this ).dialog( "close" );
			"""),format.raw("""}"""),format.raw/*604.5*/(""",
			"Non": function() """),format.raw("""{"""),format.raw/*605.23*/("""
				addPersonne($.trim($("#champ").attr("value")), "false", "");
				$( this ).dialog( "close" );
			"""),format.raw("""}"""),format.raw/*608.5*/("""				
		"""),format.raw("""}"""),format.raw/*609.4*/("""
		
	"""),format.raw("""}"""),format.raw/*611.3*/(""");
			
	
	$( "#dialog-new-pwd" ).dialog("""),format.raw("""{"""),format.raw/*614.33*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*619.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*620.22*/("""
				var bValid = true;									

				if ( bValid ) """),format.raw("""{"""),format.raw/*623.20*/("""
					mdp = $("#password-new").val();
					addPersonne($.trim($("#champ").attr("value")), "true", mdp);
					$( "#password-new" ).attr("value", "");
					$( this ).dialog( "close" );
				"""),format.raw("""}"""),format.raw/*628.6*/("""
			"""),format.raw("""}"""),format.raw/*629.5*/("""				
		"""),format.raw("""}"""),format.raw/*630.4*/("""
		
	"""),format.raw("""}"""),format.raw/*632.3*/(""");

	$( "#dialog-check-pwd" ).dialog("""),format.raw("""{"""),format.raw/*634.35*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*639.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*640.22*/("""				
								
				pass = $("#password-check").val();	
				if (pass == goodPass) """),format.raw("""{"""),format.raw/*643.28*/("""
				  	edition(currentEditButton);
				"""),format.raw("""}"""),format.raw/*645.6*/(""" else """),format.raw("""{"""),format.raw/*645.13*/("""
				  	alert("mot de passe incorrect");
				"""),format.raw("""}"""),format.raw/*647.6*/("""				
				$( "#password-check" ).attr("value", "");
				$( this ).dialog( "close" );
				
			"""),format.raw("""}"""),format.raw/*651.5*/(""",

			"Annuler": function() """),format.raw("""{"""),format.raw/*653.27*/("""							
				$( this ).dialog( "close" );				
			"""),format.raw("""}"""),format.raw/*655.5*/("""				
		"""),format.raw("""}"""),format.raw/*656.4*/("""
		
	"""),format.raw("""}"""),format.raw/*658.3*/(""");

	$( "#dialog-check-pwd-delete" ).dialog("""),format.raw("""{"""),format.raw/*660.42*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*665.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*666.22*/("""				
								
				pass = $("#password-check-delete").val();	
				if (pass == goodPass) """),format.raw("""{"""),format.raw/*669.28*/("""
				  	deletePersonne(currentDelButton);
				"""),format.raw("""}"""),format.raw/*671.6*/(""" else """),format.raw("""{"""),format.raw/*671.13*/("""
				  	alert("mot de passe incorrect");
				"""),format.raw("""}"""),format.raw/*673.6*/("""				
				$( "#password-check-delete" ).attr("value", "");
				$( this ).dialog( "close" );
				
			"""),format.raw("""}"""),format.raw/*677.5*/(""",

			"Annuler": function() """),format.raw("""{"""),format.raw/*679.27*/("""							
				$( this ).dialog( "close" );				
			"""),format.raw("""}"""),format.raw/*681.5*/("""				
		"""),format.raw("""}"""),format.raw/*682.4*/("""
		
	"""),format.raw("""}"""),format.raw/*684.3*/(""");



	


























	/*Code sur l'ajout*/

	function addPersonne(nomParticipant, locked, pwd)
	"""),format.raw("""{"""),format.raw/*718.3*/("""	
		$.ajax("""),format.raw("""{"""),format.raw/*719.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*721.11*/routes/*721.17*/.Application.addParticipant(new sun.misc.BASE64Encoder().encode((event.id.toString).getBytes)))),format.raw/*721.111*/("""",
			data: '"""),format.raw("""{"""),format.raw/*722.12*/(""""nom" : "' + nomParticipant + '", "locked" : "' + locked + '", "pwd" : "' + pwd + '""""),format.raw("""}"""),format.raw/*722.97*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*724.30*/("""
				var lock ="";		
				if(locked == "true")"""),format.raw("""{"""),format.raw/*726.26*/("""
					lock = "<i class=\"mesicones icon-lock\"></i>&nbsp;";
				"""),format.raw("""}"""),format.raw/*728.6*/("""  
				$("tbody").append("<tr title=\""+nomParticipant+"\" class=\"editable\" id=\""+data.idPersonne+"\"><td class=\"infoPersonne\">"+
					"<form id=\"formPersonne\">"+
					lock+
					"<a id=\"obligatoire\" class=\"obligatoirecb btn\">Facultatif</a>&nbsp;"+
					"<input id=\"nom\" type=\"text\" maxlength=\"25\" value=\""+nomParticipant+"\" name=\"nom\">&nbsp;"+	
					"<a id=\""+data.idPersonne+"\" title=\"editer le participant\" class=\"editPersonne\"><i class=\"mesicones icon-ok\"></i></a>"+
					"<a id=\""+data.idPersonne+"\" title=\"supprimer le participant\" class=\"deletePersonne\"> <i class=\"mesicones icon-trash\"></i</a>"+		  
					"</form></td>"+
					""""),_display_(Seq[Any](/*737.8*/for(jour <- event.jours) yield /*737.32*/ {_display_(Seq[Any](format.raw/*737.34*/(""""+  
					""""),_display_(Seq[Any](/*738.8*/if(jour.horaires.size() == 0)/*738.37*/{_display_(Seq[Any](format.raw/*738.38*/("""<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*738.117*/jour/*738.121*/.id)),format.raw/*738.124*/("""\" type=\"checkbox\" class=\"jour checkbox\" value=\""""),_display_(Seq[Any](/*738.178*/jour/*738.182*/.date)),format.raw/*738.187*/("""\" /></td>""")))})),format.raw/*738.198*/(""""+
					""""),_display_(Seq[Any](/*739.8*/for(horaire <- jour.horaires) yield /*739.37*/ {_display_(Seq[Any](format.raw/*739.39*/(""""+	                		
					"<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*740.86*/horaire/*740.93*/.id)),format.raw/*740.96*/("""\" type=\"checkbox\" class=\"horaire checkbox\" value=\""""),_display_(Seq[Any](/*740.153*/horaire/*740.160*/.debut)),format.raw/*740.166*/(""" - """),_display_(Seq[Any](/*740.170*/horaire/*740.177*/.fin)),format.raw/*740.181*/("""\" /></td>"+			                
					"""")))})),format.raw/*741.8*/(""""+                	                
					"""")))})),format.raw/*742.8*/("""" +
					"</tr>")
				$('#champ').attr('value', '')
				$('.titres').attr('style','');
				refreshHoverable();
				if (""""),_display_(Seq[Any](/*747.11*/adm)),format.raw/*747.14*/("""" == "1") """),format.raw("""{"""),format.raw/*747.25*/("""
					setTimeout(refreshtable, 500);				
					setTimeout(styles, 1500); 	
				"""),format.raw("""}"""),format.raw/*750.6*/("""					
			"""),format.raw("""}"""),format.raw/*751.5*/("""
			             
		"""),format.raw("""}"""),format.raw/*753.4*/(""");
	"""),format.raw("""}"""),format.raw/*754.3*/("""

	$("#ajouter").live('click', function(e)"""),format.raw("""{"""),format.raw/*756.42*/("""
		

	    var vide = "";	    
	    var nom = $("#champ").attr("value");
	    if (nom != vide) """),format.raw("""{"""),format.raw/*761.24*/("""  
	    	$( "#dialog-question-securise" ).dialog( "open" );	
	    	
						
		"""),format.raw("""}"""),format.raw/*765.4*/("""

	    	    
	"""),format.raw("""}"""),format.raw/*768.3*/(""");

	$("#champ").keypress(function(e) """),format.raw("""{"""),format.raw/*770.36*/("""
		var code = (e.keyCode ? e.keyCode : e.which);
		if(code == 13) """),format.raw("""{"""),format.raw/*772.19*/(""" //Enter keycode
			var vide = "";	    
		    var nom = $.trim($("#champ").attr("value"));
		    if (nom != vide) """),format.raw("""{"""),format.raw/*775.25*/("""  
		    	$( "#dialog-question-securise" ).dialog( "open" );	
							
			"""),format.raw("""}"""),format.raw/*778.5*/("""
			$("#champ").focus();
 		"""),format.raw("""}"""),format.raw/*780.5*/("""

	"""),format.raw("""}"""),format.raw/*782.3*/(""");































	/* Code sur le rajout d'horaires et de dates*/

	var currentDay;
	var debut = "08h";
	var fin = "17h";

	$(".horaireAdd").live("click", function()"""),format.raw("""{"""),format.raw/*820.44*/("""
		$( "#dialog-add-horaire" ).dialog("open");
		currentDay = $(this).attr("id");
		
	"""),format.raw("""}"""),format.raw/*824.3*/(""")

	$("#ajouterDate").live("click", function()"""),format.raw("""{"""),format.raw/*826.45*/("""
		//var listeJours = """"),_display_(Seq[Any](/*827.24*/for(jour <- event.jours) yield /*827.48*/ {_display_(Seq[Any](format.raw/*827.50*/(""" """),_display_(Seq[Any](/*827.52*/jour/*827.56*/.date)),format.raw/*827.61*/(""" """)))})),format.raw/*827.63*/(""" "; EST CENSÉ MARCHER????
		var listeJours = "";
		$(".jourintitule").each(function()"""),format.raw("""{"""),format.raw/*829.38*/("""
			listeJours=listeJours+$(this).html()+" "
		"""),format.raw("""}"""),format.raw/*831.4*/(""");

		
		if (listeJours.indexOf($("#datepicker").val()) != -1 ) """),format.raw("""{"""),format.raw/*834.59*/("""			
			alert("date déjà existante");
		"""),format.raw("""}"""),format.raw/*836.4*/(""" else """),format.raw("""{"""),format.raw/*836.11*/("""
			$.ajax("""),format.raw("""{"""),format.raw/*837.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*839.12*/routes/*839.18*/.Application.addDate(event.id))),format.raw/*839.48*/("""",
				data: '"""),format.raw("""{"""),format.raw/*840.13*/(""""date" : "' + $("#datepicker").val() + '""""),format.raw("""}"""),format.raw/*840.55*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*842.31*/("""

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
				"""),format.raw("""}"""),format.raw/*863.6*/("""
			"""),format.raw("""}"""),format.raw/*864.5*/(""");	
		"""),format.raw("""}"""),format.raw/*865.4*/("""
	"""),format.raw("""}"""),format.raw/*866.3*/(""");

	$( ".slider-range" ).slider("""),format.raw("""{"""),format.raw/*868.31*/("""
    	range: true,
    	min: 0,
    	max: 1440,
    	step: 15,
    	values: [ 8*60, 17*60 ],
    	slide: function( event, ui ) """),format.raw("""{"""),format.raw/*874.36*/("""
    		$( "#data" ).val(parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60)+" - " + parseInt(ui.values[ 1 ]/60) +"h"+pad2(ui.values[ 1 ]%60));

		"""),format.raw("""}"""),format.raw/*877.4*/(""", 
		change: function(event, ui) """),format.raw("""{"""),format.raw/*878.32*/("""
			debut = parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60);
			fin = parseInt(ui.values[ 1 ]/60) + "h"+pad2(ui.values[ 1 ]%60);
					
		"""),format.raw("""}"""),format.raw/*882.4*/("""
	"""),format.raw("""}"""),format.raw/*883.3*/(""");
			    	
	$( "#dialog-add-horaire" ).dialog("""),format.raw("""{"""),format.raw/*885.37*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		closeText: 'hide',
		buttons: """),format.raw("""{"""),format.raw/*891.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*892.22*/("""	
					
				$.ajax("""),format.raw("""{"""),format.raw/*894.13*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*896.13*/routes/*896.19*/.Application.newHoraire(event.id))),format.raw/*896.52*/("""",
					data: '"""),format.raw("""{"""),format.raw/*897.14*/(""""jour" : "' + currentDay + '""""),format.raw("""}"""),format.raw/*897.44*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*899.32*/("""
						
						$.ajax("""),format.raw("""{"""),format.raw/*901.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*903.15*/routes/*903.21*/.Application.dateChanged(event.id))),format.raw/*903.55*/("""",
							data: '"""),format.raw("""{"""),format.raw/*904.16*/(""""idhoraire" : "' + data.idHoraire + '",'+ 
							'"debut" : "' + debut + '",'+
							'"fin" : "' + fin + '""""),format.raw("""}"""),format.raw/*906.31*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*908.34*/("""
								
							"""),format.raw("""}"""),format.raw/*910.9*/("""               
						"""),format.raw("""}"""),format.raw/*911.8*/(""");
					"""),format.raw("""}"""),format.raw/*912.7*/("""
				"""),format.raw("""}"""),format.raw/*913.6*/(""");			

				setTimeout(refreshtable, 100);	
				
				$( this ).dialog( "close" );
				
				setTimeout(refreshtable, 500);
				
				
				setTimeout(styles, 1500);



								
			"""),format.raw("""}"""),format.raw/*927.5*/(""",

			"Annuler": function() """),format.raw("""{"""),format.raw/*929.27*/("""							
				$( this ).dialog( "close" );				
			"""),format.raw("""}"""),format.raw/*931.5*/("""				
		"""),format.raw("""}"""),format.raw/*932.4*/("""
		
	"""),format.raw("""}"""),format.raw/*934.3*/(""");

	function styles()"""),format.raw("""{"""),format.raw/*936.20*/("""
		

		$("tr").attr("style", "");
		$("table.datesTable td").css("background-color", color3);
		$(".checkbox").attr("disabled", "true"); 

		$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*943.37*/(""" // coloration des box checkées
		  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*944.34*/("""
		  		$(this).parent().css("background-color", "#66CC99");
		  	"""),format.raw("""}"""),format.raw/*946.7*/("""
		"""),format.raw("""}"""),format.raw/*947.4*/(""");

		$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*949.41*/("""
			$('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*951.4*/(""");

		refreshCount(); // maj de la ligne de compteurs

		affichagePopulaire();
	"""),format.raw("""}"""),format.raw/*956.3*/("""

	function refreshtable()"""),format.raw("""{"""),format.raw/*958.26*/("""
		$('#divtest').load('/KIND/eventEdit/"""),_display_(Seq[Any](/*959.40*/(new sun.misc.BASE64Encoder().encode((event.id.toString).getBytes)))),format.raw/*959.107*/("""/adm #divtest');
	"""),format.raw("""}"""),format.raw/*960.3*/("""

	function pad2(number) """),format.raw("""{"""),format.raw/*962.25*/("""
   
    	return (number < 10 ? '0' : '') + number
   
	"""),format.raw("""}"""),format.raw/*966.3*/("""


























	/* Code concernant la suppression d'horaires et de jours*/
	 
	$(".horaireDel").live("click", function()"""),format.raw("""{"""),format.raw/*995.44*/("""
		var thisse = $(this);
		
			
		$.ajax("""),format.raw("""{"""),format.raw/*999.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1001.11*/routes/*1001.17*/.Application.deleteHoraire(event.id))),format.raw/*1001.53*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1002.12*/(""""jour" : "' + $(this).attr("idjour") + '", "horaire" : "' + $(this).attr("id") + '""""),format.raw("""}"""),format.raw/*1002.96*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1004.30*/("""
				setTimeout(refreshtable, 500);				
				setTimeout(styles, 2000);				
			"""),format.raw("""}"""),format.raw/*1007.5*/(""", 
			error : function(data) """),format.raw("""{"""),format.raw/*1008.28*/("""
				alert("impossible de supprimer l'horaire, vérifiez que personne n'est disponible à cet horaire-ci")
			"""),format.raw("""}"""),format.raw/*1010.5*/("""
		"""),format.raw("""}"""),format.raw/*1011.4*/(""");	

	"""),format.raw("""}"""),format.raw/*1013.3*/(""")

	$(".jourDel").live("click", function()"""),format.raw("""{"""),format.raw/*1015.41*/("""
		var thisse = $(this);
		
		
		$.ajax("""),format.raw("""{"""),format.raw/*1019.11*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*1021.12*/routes/*1021.18*/.Application.removeDate(event.id))),format.raw/*1021.51*/("""",
				data: '"""),format.raw("""{"""),format.raw/*1022.13*/(""""idDate" : "' + $(this).attr("id") + '""""),format.raw("""}"""),format.raw/*1022.53*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*1024.31*/("""
					setTimeout(refreshtable, 500);
					setTimeout(styles, 2000);		
				"""),format.raw("""}"""),format.raw/*1027.6*/(""",
				error : function(data) """),format.raw("""{"""),format.raw/*1028.29*/("""
					alert("impossible de supprimer le jour, vérifiez que personne n'est disponible ce jour-ci")
				"""),format.raw("""}"""),format.raw/*1030.6*/("""
			"""),format.raw("""}"""),format.raw/*1031.5*/(""");				

	"""),format.raw("""}"""),format.raw/*1033.3*/(""")
	



























	/*Code sur l'édition dee participants*/

	$('.editPersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*1064.48*/("""
		
	    if(!$(this).parents("tr").hasClass("editable"))  """),format.raw("""{"""),format.raw/*1066.56*/("""	    	
	    	if ($(this).siblings("i").hasClass("icon-lock"))"""),format.raw("""{"""),format.raw/*1067.56*/("""
	    		currentEditButton = $(this);
	    		$.ajax("""),format.raw("""{"""),format.raw/*1069.16*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*1071.13*/routes/*1071.19*/.Application.getPass())),format.raw/*1071.41*/("""",
					data: '"""),format.raw("""{"""),format.raw/*1072.14*/(""" "idpers" : "'+$(this).parents("tr").attr("id")+'" """),format.raw("""}"""),format.raw/*1072.66*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*1074.32*/("""
						goodPass = data.pass;

						$( "#dialog-check-pwd" ).dialog( "open" );	
											  
					"""),format.raw("""}"""),format.raw/*1079.7*/("""
			   """),format.raw("""}"""),format.raw/*1080.8*/(""");			
				
			"""),format.raw("""}"""),format.raw/*1082.5*/(""" else """),format.raw("""{"""),format.raw/*1082.12*/("""
				edition($(this));
			"""),format.raw("""}"""),format.raw/*1084.5*/("""
		  
	    """),format.raw("""}"""),format.raw/*1086.7*/(""" else """),format.raw("""{"""),format.raw/*1086.14*/("""
	    	if ($.trim($(this).siblings("input").attr("value")) != "") """),format.raw("""{"""),format.raw/*1087.67*/("""
			      $(this).html("<i class=\"mesicones icon-pencil\"></i>");
			      $(this).parents("tr").removeClass("editable");
			      $(this).siblings('input[type="text"]').attr("readonly", "readonly");
			      $(this).parent().parent().parent().children("td").children('input[type="checkbox"]').attr("disabled","true"); 
			      $(this).parent().parent().parent().children("td").css("border", "none");
			      $(".hoverable").off();	      
			      $(this).parent().parent().parent().children(".checktd").attr("class", "checktd");
			      refreshHoverable();
			      editPersonne($(this).attr('id'), $(this).siblings("input").attr("value"));
			"""),format.raw("""}"""),format.raw/*1097.5*/(""" else """),format.raw("""{"""),format.raw/*1097.12*/("""
				alert("Impossible de mettre un nom vide!!");
			"""),format.raw("""}"""),format.raw/*1099.5*/("""
	    """),format.raw("""}"""),format.raw/*1100.7*/("""
	
	  
	"""),format.raw("""}"""),format.raw/*1103.3*/(""")

	function edition(elem) """),format.raw("""{"""),format.raw/*1105.26*/("""
		elem.html("<i class=\"mesicones icon-ok\"></i>");
		elem.parents("tr").addClass("editable");
		elem.siblings('input[type="text"]').removeAttr("readonly");
		elem.parent().parent().parent().children("td").children().removeAttr("disabled");
		elem.parent().parent().parent().children("td").css("border", "solid black 2px");
		$(".hoverable").off();		  
		elem.parent().parent().parent().children(".checktd").attr("class", "checktd hoverable");
		refreshHoverable();
	"""),format.raw("""}"""),format.raw/*1114.3*/("""

	function editPersonne(personneId, personneNom)
	"""),format.raw("""{"""),format.raw/*1117.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*1118.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1120.11*/routes/*1120.17*/.Application.updatePersonne(event.id))),format.raw/*1120.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1121.12*/(""""id" : "' + personneId + '", "nom" : "' + personneNom + '""""),format.raw("""}"""),format.raw/*1121.71*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1123.30*/("""
			  //alert("Participant edit\351");
			"""),format.raw("""}"""),format.raw/*1125.5*/("""
	  """),format.raw("""}"""),format.raw/*1126.5*/(""");
	"""),format.raw("""}"""),format.raw/*1127.3*/("""

	$('.checktd').live('click', function(e) """),format.raw("""{"""),format.raw/*1129.43*/("""
		if ($(this).children().prop("disabled") == false) """),format.raw("""{"""),format.raw/*1130.54*/("""
			if ($(this).children().prop("checked") == false) """),format.raw("""{"""),format.raw/*1131.54*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*1132.36*/("""
					$(this).children().prop("checked", true);
				"""),format.raw("""}"""),format.raw/*1134.6*/("""
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*1136.5*/(""" else """),format.raw("""{"""),format.raw/*1136.12*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*1137.36*/("""
					$(this).children().prop("checked", false);
				"""),format.raw("""}"""),format.raw/*1139.6*/("""        
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*1141.5*/("""

			affichagePopulaire();

			//$('.populaires').html("");
			$('.titres td').each( function() """),format.raw("""{"""),format.raw/*1146.38*/("""
				if ($(this).css('background-color') == color2) """),format.raw("""{"""),format.raw/*1147.53*/("""
					$('.populaires').append($(this).html());
				"""),format.raw("""}"""),format.raw/*1149.6*/("""				
			"""),format.raw("""}"""),format.raw/*1150.5*/(""")			
		"""),format.raw("""}"""),format.raw/*1151.4*/("""
	"""),format.raw("""}"""),format.raw/*1152.3*/(""");

	function changeCheck(box) """),format.raw("""{"""),format.raw/*1154.29*/("""   // gestion des clics sur les checkboxes
	   var idtime = box.attr('id');
	   var idParticipant = box.parent().parent().attr('id');   
	   
	   if (box.is(':checked'))"""),format.raw("""{"""),format.raw/*1158.29*/("""	 //Action de valider une horaire  		
	       		box.parent().css("background-color", "#66CC99")//vert
		   		if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*1160.57*/("""
		            var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
		       	    requeteAjaxHeure(idtime, idParticipant);
			    """),format.raw("""}"""),format.raw/*1164.9*/("""
	       		if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*1165.57*/("""	
	    	   	    var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
				    requeteAjaxJour(idtime, idParticipant);
			   """),format.raw("""}"""),format.raw/*1169.8*/("""
	   """),format.raw("""}"""),format.raw/*1170.6*/(""" else """),format.raw("""{"""),format.raw/*1170.13*/(""" //Action de dévalider une horaires
	     
		    box.parent().css("background-color", color3) //
		    if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*1173.56*/("""
			    var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxHeure(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*1177.8*/("""
		    if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*1178.53*/("""
		        var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxJour(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*1182.8*/("""
	   """),format.raw("""}"""),format.raw/*1183.6*/("""
	"""),format.raw("""}"""),format.raw/*1184.3*/("""

	function requeteAjaxJour(idtime, idParticipant) // ajoute la date au participant
	"""),format.raw("""{"""),format.raw/*1187.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*1188.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1190.11*/routes/*1190.17*/.Application.checkBoxJour(event.id))),format.raw/*1190.52*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1191.12*/(""""idjour" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*1191.80*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1193.30*/("""
			  //alert("Jour edit\351");
			"""),format.raw("""}"""),format.raw/*1195.5*/("""
	   """),format.raw("""}"""),format.raw/*1196.6*/(""");
	"""),format.raw("""}"""),format.raw/*1197.3*/("""

	function requeteAjaxHeure(idtime, idParticipant) // ajoute l'heure au participant
	"""),format.raw("""{"""),format.raw/*1200.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*1201.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1203.11*/routes/*1203.17*/.Application.checkBoxHoraire(event.id))),format.raw/*1203.55*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1204.12*/(""""idhoraire" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*1204.83*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1206.30*/("""
			  //alert("Horaire edit\351");
			"""),format.raw("""}"""),format.raw/*1208.5*/("""
	   """),format.raw("""}"""),format.raw/*1209.6*/(""");
	"""),format.raw("""}"""),format.raw/*1210.3*/("""


























	/*Code sur la suppression de participants*/

	$('.deletePersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*1239.50*/("""
		currentDelButton = $(this);
		if ($(this).siblings("i").hasClass("icon-lock"))"""),format.raw("""{"""),format.raw/*1241.52*/("""
    		
    		$.ajax("""),format.raw("""{"""),format.raw/*1243.15*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*1245.12*/routes/*1245.18*/.Application.getPass())),format.raw/*1245.40*/("""",
				data: '"""),format.raw("""{"""),format.raw/*1246.13*/(""" "idpers" : "'+$(this).parents("tr").attr("id")+'" """),format.raw("""}"""),format.raw/*1246.65*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*1248.31*/("""
					goodPass = data.pass;

					$( "#dialog-check-pwd-delete" ).dialog( "open" );	
										  
				"""),format.raw("""}"""),format.raw/*1253.6*/("""
		   """),format.raw("""}"""),format.raw/*1254.7*/(""");			
			
		"""),format.raw("""}"""),format.raw/*1256.4*/(""" else """),format.raw("""{"""),format.raw/*1256.11*/("""   
		    deletePersonne(currentDelButton);
		"""),format.raw("""}"""),format.raw/*1258.4*/("""
	    
	"""),format.raw("""}"""),format.raw/*1260.3*/(""")

	function deletePersonne(delButton)
	"""),format.raw("""{"""),format.raw/*1263.3*/("""
		delButton.parent().parent().parent().remove();		    
	    
	    if($('td[class="infoPersonne"]').html() == null) """),format.raw("""{"""),format.raw/*1266.56*/("""
	    	$('.titres').attr('style','display:none');
	    """),format.raw("""}"""),format.raw/*1268.7*/("""

	    $('#compte').children('td[id!=""]').each(function(i) """),format.raw("""{"""),format.raw/*1270.60*/("""
	    	$(this).html("0")
	    """),format.raw("""}"""),format.raw/*1272.7*/(""");

	    refreshCount();

	    $.ajax("""),format.raw("""{"""),format.raw/*1276.14*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1278.11*/routes/*1278.17*/.Application.deleteParticipant(event.id))),format.raw/*1278.57*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1279.12*/(""""id" : "' + delButton.attr('id') + '""""),format.raw("""}"""),format.raw/*1279.50*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1281.30*/("""
			  //alert("Participant supprim\351");
			"""),format.raw("""}"""),format.raw/*1283.5*/("""
	    """),format.raw("""}"""),format.raw/*1284.7*/(""");
	"""),format.raw("""}"""),format.raw/*1285.3*/("""


















	/*Code sur les participants obligatoires*/
	$(function()"""),format.raw("""{"""),format.raw/*1305.15*/("""
		refreshObligatoire(); 
		affichagePopulaire();
		
	"""),format.raw("""}"""),format.raw/*1309.3*/(""")	

	$(".obligatoirecb").live("click", function() """),format.raw("""{"""),format.raw/*1311.48*/(""" //click sur la checkbox "obligatoire" : mise à jour des classes sur la ligne, ajout de la propriété obligatoire dans la bdd
			
			var idParticipant = $(this).parent().parent().parent().attr("id");
			if ($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*1314.42*/("""
				$(this).html("Facultatif");
				$(this).attr("class", "obligatoirecb btn");
			"""),format.raw("""}"""),format.raw/*1317.5*/(""" else """),format.raw("""{"""),format.raw/*1317.12*/("""
				$(this).html("Obligatoire");
				$(this).attr("class", "obligatoirecb btn btn-inverse");
			"""),format.raw("""}"""),format.raw/*1320.5*/("""
			$.ajax("""),format.raw("""{"""),format.raw/*1321.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*1323.12*/routes/*1323.18*/.Application.changeObligatoire(event.id))),format.raw/*1323.58*/("""",
				data: '"""),format.raw("""{"""),format.raw/*1324.13*/(""""idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*1324.52*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*1326.31*/("""
				  affichagePopulaire();
				"""),format.raw("""}"""),format.raw/*1328.6*/("""
	   		"""),format.raw("""}"""),format.raw/*1329.8*/(""");
	   		refreshObligatoire();

		"""),format.raw("""}"""),format.raw/*1332.4*/(""")

	function checkobligatoire(idtime, type) """),format.raw("""{"""),format.raw/*1334.43*/("""//fonction qui renvoie true si tous les participants obligatoires sont présents.
		
		var ret = true;
		
		$('.obligatoire.'+type+'[id="'+idtime+'"]').each(function() """),format.raw("""{"""),format.raw/*1338.64*/("""			
			if(!($(this).is(":checked"))) """),format.raw("""{"""),format.raw/*1339.35*/("""
				
				ret = false;
			"""),format.raw("""}"""),format.raw/*1342.5*/("""
		"""),format.raw("""}"""),format.raw/*1343.4*/(""")
		return ret;
	"""),format.raw("""}"""),format.raw/*1345.3*/("""

	function refreshObligatoire() """),format.raw("""{"""),format.raw/*1347.33*/(""" // met à jour les classes "obligatoire" sur les bonnes lignes de participants
		$(".checktd").removeClass("obligatoire");
		$(".checkbox").removeClass("obligatoire");
		$(".obligatoirecb").each(function () """),format.raw("""{"""),format.raw/*1350.41*/("""
			
			if($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*1352.41*/("""					
				$(this).parent().parent().siblings(".checktd").addClass("obligatoire");
				$(this).parent().parent().siblings(".checktd").children().addClass("obligatoire");
			"""),format.raw("""}"""),format.raw/*1355.5*/("""

		"""),format.raw("""}"""),format.raw/*1357.4*/(""")
	"""),format.raw("""}"""),format.raw/*1358.3*/("""








	
	
	

	

	

	

	

	


	
	/*Code d'affichage des dates populaires*/
	function affichagePopulaire() """),format.raw("""{"""),format.raw/*1384.33*/("""
		var max = 0;
		$("#compte").children(".horaire, .jour").each( function() """),format.raw("""{"""),format.raw/*1386.62*/(""" // récupération de la valeur maximale dans les comptes
			$(this).css("background-color", color1) 
			$('.titres').children().css("background-color",color1);
			//$('.footer').html("");
			if (checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*1390.70*/("""			
				if ($(this).html() > max) """),format.raw("""{"""),format.raw/*1391.32*/("""			
					max = $(this).html();
				"""),format.raw("""}"""),format.raw/*1393.6*/("""
			"""),format.raw("""}"""),format.raw/*1394.5*/("""		
		"""),format.raw("""}"""),format.raw/*1395.4*/(""")
		$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*1396.45*/("""
			
			if ($(this).html() == max && $(this).html() != 0 && checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*1398.118*/("""			
				$(this).css("background-color", color2);				
				$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", color2);
				if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*1401.45*/("""
					var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
					$("td:contains('"+day+"')").css("background-color", color2);
					
				"""),format.raw("""}"""),format.raw/*1405.6*/("""
			"""),format.raw("""}"""),format.raw/*1406.5*/("""
		"""),format.raw("""}"""),format.raw/*1407.4*/(""")
	"""),format.raw("""}"""),format.raw/*1408.3*/("""
	</script>

""")))})),format.raw/*1411.2*/("""
"""))}
    }
    
    def render(event:Evenement,adm:Integer) = apply(event,adm)
    
    def f:((Evenement,Integer) => play.api.templates.Html) = (event,adm) => apply(event,adm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jul 27 15:52:02 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/editForm.scala.html
                    HASH: 0205a964e7e528adeed275a92d0e72cb75e3ddc5
                    MATRIX: 769->1|886->54|918->78|1002->33|1030->52|1058->132|1097->137|1132->164|1171->166|1234->193|1248->198|1276->204|1361->253|1375->258|1403->264|1473->298|1487->303|1518->312|1560->318|1613->362|1653->364|1708->382|1723->387|1752->393|1787->395|1831->404|1866->430|1906->432|1962->452|1976->457|2009->468|2054->482|2097->490|2118->502|2158->504|2230->540|2245->546|2301->580|2442->690|3240->1453|3261->1465|3301->1467|3456->1587|3511->1626|3550->1627|3593->1635|3615->1636|3658->1648|3713->1672|3826->1750|3847->1762|3886->1763|4072->1918|4291->2102|4331->2126|4371->2128|4431->2152|4444->2156|4469->2159|4530->2184|4543->2188|4581->2204|4651->2238|4664->2242|4691->2247|4739->2260|4760->2272|4799->2273|4843->2281|4856->2285|4881->2288|5023->2397|5066->2405|5087->2417|5126->2418|5170->2426|5183->2430|5208->2433|5330->2522|5420->2581|5558->2684|5598->2708|5638->2710|5682->2719|5720->2748|5759->2749|5829->2788|5875->2798|5920->2827|5960->2829|6015->2848|6031->2855|6056->2858|6102->2868|6115->2872|6140->2875|6206->2905|6222->2912|6250->2918|6290->2922|6306->2929|6332->2933|6381->2946|6402->2958|6441->2959|6485->2967|6501->2974|6526->2977|6573->2988|6586->2992|6611->2995|6746->3097|6803->3122|6843->3131|6914->3167|6968->3205|7008->3207|7061->3224|7081->3235|7107->3239|7150->3246|7170->3257|7195->3260|7284->3314|7363->3384|7403->3386|7446->3394|7477->3416|7516->3417|7598->3468|7641->3476|7677->3503|7716->3504|7830->3601|7843->3606|7882->3607|7997->3691|8092->3750|8112->3761|8138->3765|8230->3820|8251->3831|8277->3834|8423->3943|8444->3954|8470->3957|8608->4063|8662->4081|8703->4105|8744->4107|8792->4118|8831->4147|8871->4148|8921->4161|8979->4209|9020->4211|9109->4263|9123->4267|9149->4270|9253->4336|9268->4340|9297->4345|9345->4374|9359->4379|9399->4380|9489->4433|9503->4437|9529->4440|9625->4498|9640->4502|9669->4507|9730->4535|9787->4559|9841->4576|9887->4605|9928->4607|9984->4626|10048->4680|10089->4682|10178->4734|10195->4741|10221->4744|10328->4813|10346->4820|10376->4826|10418->4830|10436->4837|10464->4841|10512->4870|10526->4875|10566->4876|10656->4929|10673->4936|10699->4939|10797->4999|10815->5006|10845->5012|10887->5016|10905->5023|10933->5027|10994->5055|11044->5072|11119->5114|11170->5133|11265->5192|11309->5226|11349->5227|11404->5249|11480->5289|11521->5313|11562->5315|11607->5324|11646->5353|11686->5354|11757->5388|11771->5392|11797->5395|11867->5433|11919->5448|11965->5477|12006->5479|12084->5520|12101->5527|12127->5530|12213->5583|12250->5588|12367->5669|12389->5681|12429->5682|12829->6050|14841->8025|14857->8031|14917->8068|15013->8127|15029->8133|15093->8174|15316->8349|15507->8493|15638->8576|15686->8588|15712->8591|15771->8602|15873->8657|15923->8660|15990->8679|16112->8753|16206->8799|16471->9017|16522->9021|16574->9026|16664->9068|16841->9197|16948->9256|17034->9294|17104->9316|17217->9392|17232->9397|17265->9407|17317->9411|17406->9453|17461->9460|17554->9506|17615->9520|17671->9529|17727->9538|17824->9587|17915->9631|17999->9667|18163->9783|18233->9805|18349->9873|18418->9905|18434->9911|18490->9944|18554->9960|18629->9987|18749->10059|18848->10111|18901->10117|18996->10165|19052->10174|19108->10183|19251->10278|19340->10319|19542->10474|19597->10481|19762->10599|19812->10602|19908->10650|20069->10763|20120->10777|20135->10782|20171->10795|20277->10853|20365->10894|20416->10898|20531->10965|20634->11020|20701->11050|20717->11056|20771->11087|20834->11102|20967->11187|21085->11257|21184->11309|21236->11314|21289->11320|21339->11323|21435->11371|21516->11404|21723->11564|21778->11571|21994->11740|22044->11743|22125->11777|22219->11823|22269->11825|22348->11857|22398->11859|22462->11875|22513->11877|22568->11883|22621->11887|22672->11889|22723->11891|22798->11917|22849->11919|22929->11951|22980->11953|23045->11969|23096->11971|23151->11977|23204->11981|23292->12022|23360->12043|23418->12054|23487->12076|23537->12079|23647->12141|23837->12283|23950->12348|24063->12414|24114->12418|24206->12462|24291->12500|24444->12606|24541->12655|24655->12721|24861->12879|24916->12886|25131->13053|25181->13056|25274->13101|25375->13155|25470->13202|25588->13272|25792->13428|25847->13435|26060->13600|26113->13606|26194->13639|26323->13720|26401->13750|26504->13806|26584->13838|26676->13882|26786->13945|26841->13952|26946->14010|26998->14015|27049->14019|27102->14025|27181->14056|27360->14187|27478->14257|27653->14385|27708->14393|27825->14462|27947->14536|28119->14661|28177->14672|28229->14677|28525->14925|28685->15037|28756->15060|28903->15160|28975->15184|29125->15287|29180->15295|29233->15301|29322->15342|29482->15454|29552->15476|29653->15529|29888->15717|29940->15722|29995->15730|30048->15736|30134->15774|30294->15886|30364->15908|30493->15989|30581->16030|30636->16037|30729->16083|30869->16176|30946->16205|31042->16254|31097->16262|31150->16268|31243->16313|31403->16425|31473->16447|31609->16535|31703->16582|31758->16589|31851->16635|31998->16735|32075->16764|32171->16813|32226->16821|32279->16827|32436->16937|32496->16949|32561->16977|32577->16983|32695->17077|32757->17091|32890->17176|33006->17244|33100->17290|33212->17355|33921->18028|33962->18052|34003->18054|34051->18066|34090->18095|34130->18096|34247->18175|34262->18179|34289->18182|34381->18236|34396->18240|34425->18245|34470->18256|34516->18266|34562->18295|34603->18297|34747->18404|34764->18411|34790->18414|34885->18471|34903->18478|34933->18484|34975->18488|34993->18495|35021->18499|35092->18538|35167->18581|35325->18702|35351->18705|35410->18716|35536->18795|35593->18805|35661->18826|35713->18831|35804->18874|35947->18969|36072->19047|36134->19062|36221->19101|36336->19168|36499->19283|36620->19357|36696->19386|36747->19390|36977->19572|37110->19658|37205->19705|37266->19729|37307->19753|37348->19755|37387->19757|37401->19761|37429->19766|37464->19768|37598->19854|37693->19902|37806->19967|37893->20007|37948->20014|38008->20026|38075->20056|38091->20062|38144->20092|38207->20107|38297->20149|38415->20219|39308->21065|39360->21070|39414->21077|39464->21080|39546->21114|39722->21242|39922->21395|40004->21429|40199->21577|40249->21580|40345->21628|40526->21761|40596->21783|40664->21803|40733->21835|40749->21841|40805->21874|40869->21890|40947->21920|41067->21992|41137->22014|41210->22050|41226->22056|41283->22090|41349->22108|41507->22218|41631->22294|41696->22312|41766->22335|41822->22344|41875->22350|42099->22527|42176->22556|42272->22605|42327->22613|42380->22619|42451->22642|42674->22817|42787->22882|42900->22948|42951->22952|43043->22996|43128->23034|43256->23115|43331->23142|43408->23182|43499->23249|43565->23268|43639->23294|43743->23351|43924->23484|44014->23526|44080->23554|44097->23560|44157->23596|44220->23610|44353->23694|44470->23762|44596->23840|44675->23870|44832->23979|44884->23983|44939->23990|45031->24033|45121->24074|45189->24104|45206->24110|45263->24143|45327->24158|45416->24198|45535->24268|45658->24343|45737->24373|45888->24476|45941->24481|45999->24491|46168->24611|46276->24670|46387->24732|46488->24784|46558->24816|46575->24822|46621->24844|46686->24860|46787->24912|46908->24984|47056->25084|47112->25092|47175->25107|47231->25114|47306->25141|47366->25153|47422->25160|47538->25227|48236->25877|48292->25884|48394->25938|48449->25945|48506->25954|48583->25982|49100->26451|49200->26503|49261->26515|49327->26543|49344->26549|49405->26586|49468->26600|49576->26659|49693->26727|49784->26770|49837->26775|49890->26780|49983->26824|50086->26878|50189->26932|50274->26968|50375->27021|50465->27063|50521->27070|50606->27106|50708->27160|50806->27210|50952->27307|51054->27360|51154->27412|51211->27421|51267->27429|51318->27432|51399->27464|51618->27634|51825->27792|52076->27995|52182->28052|52423->28245|52477->28251|52533->28258|52734->28410|52966->28594|53068->28647|53299->28830|53353->28836|53404->28839|53538->28925|53599->28937|53665->28965|53682->28971|53741->29006|53804->29020|53921->29088|54038->29156|54122->29192|54176->29198|54229->29203|54364->29290|54425->29302|54491->29330|54508->29336|54570->29374|54633->29388|54753->29459|54870->29527|54957->29566|55011->29572|55064->29577|55235->29699|55366->29781|55437->29803|55505->29833|55522->29839|55568->29861|55632->29876|55733->29928|55852->29998|56003->30101|56058->30108|56119->30121|56175->30128|56270->30175|56327->30184|56416->30225|56582->30342|56686->30398|56796->30459|56875->30490|56963->30529|57029->30557|57046->30563|57110->30603|57173->30617|57260->30655|57377->30723|57471->30769|57526->30776|57579->30781|57705->30858|57808->30913|57908->30964|58197->31204|58330->31289|58386->31296|58532->31394|58593->31406|58661->31436|58678->31442|58742->31482|58806->31497|58894->31536|59013->31606|59095->31640|59151->31648|59234->31683|59328->31728|59545->31896|59632->31934|59707->31961|59759->31965|59825->31983|59908->32017|60165->32225|60259->32270|60480->32443|60533->32448|60585->32452|60743->32561|60869->32638|61174->32894|61258->32929|61342->32965|61395->32970|61449->32976|61544->33022|61716->33144|61971->33350|62201->33532|62254->33537|62306->33541|62358->33545|62405->33559
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|39->10|39->10|39->10|42->13|42->13|42->13|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|45->16|45->16|45->16|46->17|46->17|46->17|47->18|49->20|49->20|49->20|50->21|50->21|50->21|52->23|68->39|68->39|68->39|72->43|72->43|72->43|73->44|73->44|74->45|77->48|83->54|83->54|83->54|86->57|92->63|92->63|92->63|93->64|93->64|93->64|93->64|93->64|93->64|94->65|94->65|94->65|95->66|95->66|95->66|95->66|95->66|95->66|95->66|96->67|96->67|96->67|96->67|96->67|96->67|96->67|98->69|101->72|101->72|101->72|102->73|102->73|102->73|104->75|105->76|105->76|105->76|106->77|106->77|106->77|106->77|106->77|106->77|107->78|107->78|107->78|107->78|107->78|107->78|108->79|108->79|108->79|108->79|108->79|108->79|108->79|108->79|108->79|108->79|110->81|112->83|116->87|116->87|116->87|117->88|117->88|117->88|117->88|117->88|117->88|118->89|118->89|118->89|119->90|119->90|119->90|121->92|122->93|122->93|122->93|124->95|124->95|124->95|126->97|128->99|128->99|128->99|129->100|129->100|129->100|130->101|130->101|130->101|131->102|133->104|133->104|133->104|134->105|134->105|134->105|135->106|135->106|135->106|136->107|136->107|136->107|136->107|136->107|136->107|137->108|137->108|137->108|138->109|138->109|138->109|138->109|138->109|138->109|139->110|141->112|142->113|142->113|142->113|143->114|143->114|143->114|144->115|144->115|144->115|144->115|144->115|144->115|144->115|144->115|144->115|145->116|145->116|145->116|146->117|146->117|146->117|146->117|146->117|146->117|146->117|146->117|146->117|147->118|148->119|149->120|151->122|155->126|155->126|155->126|155->126|157->128|157->128|157->128|158->129|158->129|158->129|159->130|159->130|159->130|160->131|161->132|161->132|161->132|162->133|162->133|162->133|163->134|164->135|178->149|178->149|178->149|188->159|254->225|254->225|254->225|255->226|255->226|255->226|264->235|269->240|287->258|289->260|289->260|289->260|291->262|292->263|294->265|297->268|299->270|304->275|305->276|306->277|308->279|313->284|313->284|315->286|316->287|319->290|319->290|319->290|319->290|321->292|321->292|323->294|325->296|326->297|329->300|331->302|333->304|335->306|341->312|342->313|345->316|347->318|347->318|347->318|348->319|348->319|350->321|353->324|354->325|357->328|358->329|361->332|399->370|401->372|405->376|405->376|408->379|409->380|411->382|414->385|416->387|416->387|416->387|416->387|419->390|420->391|421->392|424->395|426->397|426->397|426->397|427->398|427->398|429->400|431->402|432->403|433->404|434->405|437->408|439->410|444->415|444->415|449->420|450->421|453->424|454->425|454->425|454->425|454->425|454->425|454->425|454->425|454->425|454->425|454->425|454->425|454->425|454->425|454->425|454->425|454->425|454->425|454->425|457->428|459->430|461->432|463->434|464->435|494->465|498->469|499->470|501->472|502->473|504->475|506->477|511->482|513->484|514->485|517->488|517->488|520->491|521->492|523->494|526->497|528->499|529->500|532->503|532->503|535->506|536->507|538->509|540->511|542->513|544->515|546->517|547->518|549->520|549->520|551->522|552->523|553->524|555->526|559->530|560->531|563->534|566->537|568->539|570->541|573->544|576->547|578->549|579->550|624->595|629->600|630->601|633->604|634->605|637->608|638->609|640->611|643->614|648->619|649->620|652->623|657->628|658->629|659->630|661->632|663->634|668->639|669->640|672->643|674->645|674->645|676->647|680->651|682->653|684->655|685->656|687->658|689->660|694->665|695->666|698->669|700->671|700->671|702->673|706->677|708->679|710->681|711->682|713->684|747->718|748->719|750->721|750->721|750->721|751->722|751->722|753->724|755->726|757->728|766->737|766->737|766->737|767->738|767->738|767->738|767->738|767->738|767->738|767->738|767->738|767->738|767->738|768->739|768->739|768->739|769->740|769->740|769->740|769->740|769->740|769->740|769->740|769->740|769->740|770->741|771->742|776->747|776->747|776->747|779->750|780->751|782->753|783->754|785->756|790->761|794->765|797->768|799->770|801->772|804->775|807->778|809->780|811->782|849->820|853->824|855->826|856->827|856->827|856->827|856->827|856->827|856->827|856->827|858->829|860->831|863->834|865->836|865->836|866->837|868->839|868->839|868->839|869->840|869->840|871->842|892->863|893->864|894->865|895->866|897->868|903->874|906->877|907->878|911->882|912->883|914->885|920->891|921->892|923->894|925->896|925->896|925->896|926->897|926->897|928->899|930->901|932->903|932->903|932->903|933->904|935->906|937->908|939->910|940->911|941->912|942->913|956->927|958->929|960->931|961->932|963->934|965->936|972->943|973->944|975->946|976->947|978->949|980->951|985->956|987->958|988->959|988->959|989->960|991->962|995->966|1024->995|1028->999|1030->1001|1030->1001|1030->1001|1031->1002|1031->1002|1033->1004|1036->1007|1037->1008|1039->1010|1040->1011|1042->1013|1044->1015|1048->1019|1050->1021|1050->1021|1050->1021|1051->1022|1051->1022|1053->1024|1056->1027|1057->1028|1059->1030|1060->1031|1062->1033|1093->1064|1095->1066|1096->1067|1098->1069|1100->1071|1100->1071|1100->1071|1101->1072|1101->1072|1103->1074|1108->1079|1109->1080|1111->1082|1111->1082|1113->1084|1115->1086|1115->1086|1116->1087|1126->1097|1126->1097|1128->1099|1129->1100|1132->1103|1134->1105|1143->1114|1146->1117|1147->1118|1149->1120|1149->1120|1149->1120|1150->1121|1150->1121|1152->1123|1154->1125|1155->1126|1156->1127|1158->1129|1159->1130|1160->1131|1161->1132|1163->1134|1165->1136|1165->1136|1166->1137|1168->1139|1170->1141|1175->1146|1176->1147|1178->1149|1179->1150|1180->1151|1181->1152|1183->1154|1187->1158|1189->1160|1193->1164|1194->1165|1198->1169|1199->1170|1199->1170|1202->1173|1206->1177|1207->1178|1211->1182|1212->1183|1213->1184|1216->1187|1217->1188|1219->1190|1219->1190|1219->1190|1220->1191|1220->1191|1222->1193|1224->1195|1225->1196|1226->1197|1229->1200|1230->1201|1232->1203|1232->1203|1232->1203|1233->1204|1233->1204|1235->1206|1237->1208|1238->1209|1239->1210|1268->1239|1270->1241|1272->1243|1274->1245|1274->1245|1274->1245|1275->1246|1275->1246|1277->1248|1282->1253|1283->1254|1285->1256|1285->1256|1287->1258|1289->1260|1292->1263|1295->1266|1297->1268|1299->1270|1301->1272|1305->1276|1307->1278|1307->1278|1307->1278|1308->1279|1308->1279|1310->1281|1312->1283|1313->1284|1314->1285|1334->1305|1338->1309|1340->1311|1343->1314|1346->1317|1346->1317|1349->1320|1350->1321|1352->1323|1352->1323|1352->1323|1353->1324|1353->1324|1355->1326|1357->1328|1358->1329|1361->1332|1363->1334|1367->1338|1368->1339|1371->1342|1372->1343|1374->1345|1376->1347|1379->1350|1381->1352|1384->1355|1386->1357|1387->1358|1413->1384|1415->1386|1419->1390|1420->1391|1422->1393|1423->1394|1424->1395|1425->1396|1427->1398|1430->1401|1434->1405|1435->1406|1436->1407|1437->1408|1440->1411
                    -- GENERATED --
                */
            