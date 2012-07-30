
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
	Cree le: """),_display_(Seq[Any](/*15.12*/event/*15.17*/.dateCreation.toLocaleString)),format.raw/*15.45*/("""<br>

	"""),_display_(Seq[Any](/*17.3*/if(event.descriptif != "")/*17.29*/ {_display_(Seq[Any](format.raw/*17.31*/("""
	Description : <i>"""),_display_(Seq[Any](/*18.20*/event/*18.25*/.descriptif)),format.raw/*18.36*/("""</i> <br/>	
	""")))})),format.raw/*19.3*/("""			
	<br>
	
	"""),_display_(Seq[Any](/*22.3*/if(adm == 1)/*22.15*/ {_display_(Seq[Any](format.raw/*22.17*/("""
		<a class="btn btn-danger" href=""""),_display_(Seq[Any](/*23.36*/routes/*23.42*/.Application.deleteEvent(event.id))),format.raw/*23.76*/("""">Supprimer l'evenement</a>
		<a id="newPassAdmin" class="btn btn-info" >Modifier le mot de passe organisateur</a>
	""")))})),format.raw/*25.3*/("""


	
	<br><br>
	<h3>Inviter des personnes à l'évenement</h3>
	
	<div class="selectDate" style="position:relative; display:inline-block; width:500px">
		<textarea id="mailsArea" title="Adresses email s&eacute;par&eacute;es par une virgule" rows="4" style="color:grey" placeholder="Entrez ici les adresses mail séparées par une virgule ..."></textarea>
		<i class="checkmail mesicones icon-remove"></i>
		<a id="envoiLien" disabled="true" class="btn">Envoyer Lien</a> <a class="btnMailPerso" title="Ajouter un texte personnalisé au mail"><i class="mesicones icon-plus"></i></a>
		<div class="champPerso" style="display:none">
			<textarea id="mailPersoArea" rows="6" style="color:grey" placeholder="Entrez un message avec votre mail d'invitation"></textarea>
		</div>
	</div>
	<div style="display:inline-block; width:380px">
		Entrez ici la liste des adresses mail des personnes que vous désirez inviter à cet évènement.
	</div>

	"""),_display_(Seq[Any](/*44.3*/if(adm == 1)/*44.15*/ {_display_(Seq[Any](format.raw/*44.17*/("""
		<br><br>
		<div  id="mailList" class="selectDate" style="position:right;  width:500px">
			<h5>Liste des mails invités</h5>
			<br>
			<p id="mailAdressContent">				
				"""),_display_(Seq[Any](/*50.6*/for(l <- event.mailSentList) yield /*50.34*/{_display_(Seq[Any](format.raw/*50.35*/("""
					"""),_display_(Seq[Any](/*51.7*/l/*51.8*/.adresse)),format.raw/*51.16*/(""" <br>
				""")))})),format.raw/*52.6*/(""" 
			</p>
		</div>
	""")))})),format.raw/*55.3*/("""
	
	
	<br><br>
	<h3>Liste des participants et de leurs disponibilités</h3>

	"""),_display_(Seq[Any](/*61.3*/if(adm != 1)/*61.15*/{_display_(Seq[Any](format.raw/*61.16*/("""
		S'ajouter à la liste des participants :		  
		<input id="champ" type="text" maxlength="25" value="">&nbsp;<a id="ajouter" class="btn">Ajouter</a><br>
	""")))})),format.raw/*64.3*/("""	

	<div id="divtest" >
	<table class="datesTable" cellspacing="5" cellpadding="5">
		<tbody>
			<tr class="titres dates" style="display:none"><td style="visibility:hidden"></td>
				"""),_display_(Seq[Any](/*70.6*/for(jour <- event.jours) yield /*70.30*/ {_display_(Seq[Any](format.raw/*70.32*/("""  					  
					<td id=""""),_display_(Seq[Any](/*71.15*/jour/*71.19*/.id)),format.raw/*71.22*/("""" class="jour" colspan=""""),_display_(Seq[Any](/*71.47*/jour/*71.51*/.horaires.size())),format.raw/*71.67*/("""">
						<b class="jourintitule">"""),_display_(Seq[Any](/*72.32*/jour/*72.36*/.date)),format.raw/*72.41*/(""" </b>
						"""),_display_(Seq[Any](/*73.8*/if(adm == 1)/*73.20*/{_display_(Seq[Any](format.raw/*73.21*/("""<a id=""""),_display_(Seq[Any](/*73.29*/jour/*73.33*/.id)),format.raw/*73.36*/("""" class="horaireAdd" title="Ajouter une plage horaire à cette date" ><i class="mesicones icon-plus"></i></a>""")))})),format.raw/*73.145*/("""
						"""),_display_(Seq[Any](/*74.8*/if(adm == 1)/*74.20*/{_display_(Seq[Any](format.raw/*74.21*/("""<a id=""""),_display_(Seq[Any](/*74.29*/jour/*74.33*/.id)),format.raw/*74.36*/("""" class="jourDel" title="Supprimer cette date"><i class="mesicones icon-remove"></i></a>""")))})),format.raw/*74.125*/("""
					</td>	                        	                
				""")))})),format.raw/*76.6*/("""
			</tr>
			<tr class="titres horaires" style="display:none"><td style="visibility:hidden"></td>
				"""),_display_(Seq[Any](/*79.6*/for(jour <- event.jours) yield /*79.30*/ {_display_(Seq[Any](format.raw/*79.32*/("""  
					"""),_display_(Seq[Any](/*80.7*/if(jour.horaires.size() == 0)/*80.36*/{_display_(Seq[Any](format.raw/*80.37*/("""
					    <td class="jour"></td>
					""")))})),format.raw/*82.7*/("""
				    """),_display_(Seq[Any](/*83.10*/for(horaire <- jour.horaires) yield /*83.39*/ {_display_(Seq[Any](format.raw/*83.41*/("""
				    	<td id=""""),_display_(Seq[Any](/*84.19*/horaire/*84.26*/.id)),format.raw/*84.29*/("""" dayid=""""),_display_(Seq[Any](/*84.39*/jour/*84.43*/.id)),format.raw/*84.46*/("""" class="horaire">
				    		"""),_display_(Seq[Any](/*85.12*/horaire/*85.19*/.debut)),format.raw/*85.25*/(""" - """),_display_(Seq[Any](/*85.29*/horaire/*85.36*/.fin)),format.raw/*85.40*/(""" 
				    		"""),_display_(Seq[Any](/*86.12*/if(adm == 1)/*86.24*/{_display_(Seq[Any](format.raw/*86.25*/("""<a id=""""),_display_(Seq[Any](/*86.33*/horaire/*86.40*/.id)),format.raw/*86.43*/("""" idjour=""""),_display_(Seq[Any](/*86.54*/jour/*86.58*/.id)),format.raw/*86.61*/("""" class="horaireDel" title="Supprimer cette plage horaire" ><i class="mesicones icon-remove"></i></a>""")))})),format.raw/*86.163*/("""
				    	</td>
				    """)))})),format.raw/*88.10*/("""  

				""")))})),format.raw/*90.6*/("""
			</tr>
			              
			
			"""),_display_(Seq[Any](/*94.5*/for(participant <- event.participants) yield /*94.43*/ {_display_(Seq[Any](format.raw/*94.45*/("""
				<tr title=""""),_display_(Seq[Any](/*95.17*/participant/*95.28*/.nom)),format.raw/*95.32*/("""" id=""""),_display_(Seq[Any](/*95.39*/participant/*95.50*/.id)),format.raw/*95.53*/("""" class="participant"><td class="infoPersonne">
					"""),_display_(Seq[Any](/*96.7*/form(routes.Application.updatePersonne(event.id), 'id->"formPersonne")/*96.77*/ {_display_(Seq[Any](format.raw/*96.79*/("""
						"""),_display_(Seq[Any](/*97.8*/if(participant.locked)/*97.30*/{_display_(Seq[Any](format.raw/*97.31*/("""
							<i class="mesicones icon-lock"></i>
						""")))})),format.raw/*99.8*/("""
						"""),_display_(Seq[Any](/*100.8*/if(participant.obligatoire)/*100.35*/{_display_(Seq[Any](format.raw/*100.36*/("""							
							<a id="obligatoire" class="obligatoirecb btn btn-inverse">Obligatoire</a>
						""")))}/*102.9*/else/*102.14*/{_display_(Seq[Any](format.raw/*102.15*/("""							
							<a id="obligatoire" class="obligatoirecb btn ">Facultatif</a>
						""")))})),format.raw/*104.8*/("""

						<input id="nom" maxlength="25" type="text" value=""""),_display_(Seq[Any](/*106.58*/participant/*106.69*/.nom)),format.raw/*106.73*/("""" name="nom" readonly="readonly">							
						<a id=""""),_display_(Seq[Any](/*107.15*/participant/*107.26*/.id)),format.raw/*107.29*/("""" title="Editer le participant" class="editPersonne"><i class="mesicones icon-pencil"></i></a>
						<a id=""""),_display_(Seq[Any](/*108.15*/participant/*108.26*/.id)),format.raw/*108.29*/("""" title="Supprimer le participant" class="deletePersonne"> <i class="mesicones icon-trash"></i></a>
					""")))})),format.raw/*109.7*/("""</td>
					
					"""),_display_(Seq[Any](/*111.7*/for(jour <- event.jours) yield /*111.31*/ {_display_(Seq[Any](format.raw/*111.33*/("""
					    """),_display_(Seq[Any](/*112.11*/if(jour.horaires.size() == 0)/*112.40*/{_display_(Seq[Any](format.raw/*112.41*/("""
					      """),_display_(Seq[Any](/*113.13*/if(participant.inscriptionsJours.contains(jour))/*113.61*/ {_display_(Seq[Any](format.raw/*113.63*/("""
			                <td class="checktd"><input id=""""),_display_(Seq[Any](/*114.52*/jour/*114.56*/.id)),format.raw/*114.59*/("""" type="checkbox"  disabled checked class="jour checkbox" value=""""),_display_(Seq[Any](/*114.125*/jour/*114.129*/.date)),format.raw/*114.134*/("""" /></td>
			              """)))}/*115.20*/else/*115.25*/{_display_(Seq[Any](format.raw/*115.26*/("""
			                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*116.53*/jour/*116.57*/.id)),format.raw/*116.60*/("""" type="checkbox"  disabled class="jour checkbox" value=""""),_display_(Seq[Any](/*116.118*/jour/*116.122*/.date)),format.raw/*116.127*/("""" /></td>
			              """)))})),format.raw/*117.19*/("""
					       
					    """)))})),format.raw/*119.11*/("""
			            """),_display_(Seq[Any](/*120.17*/for(horaire <- jour.horaires) yield /*120.46*/ {_display_(Seq[Any](format.raw/*120.48*/("""
			              """),_display_(Seq[Any](/*121.19*/if(participant.inscriptionsHoraires.contains(horaire))/*121.73*/ {_display_(Seq[Any](format.raw/*121.75*/("""
			                <td class="checktd"><input id=""""),_display_(Seq[Any](/*122.52*/horaire/*122.59*/.id)),format.raw/*122.62*/("""" type="checkbox" disabled class="horaire checkbox"  checked value=""""),_display_(Seq[Any](/*122.131*/horaire/*122.138*/.debut)),format.raw/*122.144*/(""" - """),_display_(Seq[Any](/*122.148*/horaire/*122.155*/.fin)),format.raw/*122.159*/("""" /></td>
			              """)))}/*123.20*/else/*123.25*/{_display_(Seq[Any](format.raw/*123.26*/("""
			                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*124.53*/horaire/*124.60*/.id)),format.raw/*124.63*/("""" type="checkbox" disabled class="horaire checkbox" value=""""),_display_(Seq[Any](/*124.123*/horaire/*124.130*/.debut)),format.raw/*124.136*/(""" - """),_display_(Seq[Any](/*124.140*/horaire/*124.147*/.fin)),format.raw/*124.151*/("""" /></td>
			              """)))})),format.raw/*125.19*/("""
			            """)))})),format.raw/*126.17*/("""            	                
			        """)))})),format.raw/*127.13*/("""				
				</tr>
			""")))})),format.raw/*129.5*/("""
		</tbody>
		<tfoot>
		<tr id="compte" class="titres"
		 """),_display_(Seq[Any](/*133.5*/if(event.participants.size() == 0)/*133.39*/{_display_(Seq[Any](format.raw/*133.40*/(""" style="display:none"""")))})),format.raw/*133.62*/(""">
			<td id=""><b>Compte: </b></td>
			"""),_display_(Seq[Any](/*135.5*/for(jour <- event.jours) yield /*135.29*/ {_display_(Seq[Any](format.raw/*135.31*/("""
			    """),_display_(Seq[Any](/*136.9*/if(jour.horaires.size() == 0)/*136.38*/{_display_(Seq[Any](format.raw/*136.39*/("""		     
	                <td id=""""),_display_(Seq[Any](/*137.27*/jour/*137.31*/.id)),format.raw/*137.34*/("""" class="jour">0</td>	       
			    """)))})),format.raw/*138.9*/("""
	            """),_display_(Seq[Any](/*139.15*/for(horaire <- jour.horaires) yield /*139.44*/ {_display_(Seq[Any](format.raw/*139.46*/("""              
	                <td id=""""),_display_(Seq[Any](/*140.27*/horaire/*140.34*/.id)),format.raw/*140.37*/("""" class="horaire">0</td>              
	            """)))})),format.raw/*141.15*/("""
			""")))})),format.raw/*142.5*/("""
		</tr>
		
			
		</tfoot>
		
	</table>
	</div>

	<div id="refresh"></div>




	"""),_display_(Seq[Any](/*156.3*/if(adm == 1)/*156.15*/{_display_(Seq[Any](format.raw/*156.16*/("""
	<a class="visibleAdd" ><i class="mesicones icon-plus"></i></a>
	
	<div class="champAdd" style="display:none">		
		Ajouter un participant :		  
		<input id="champ" type="text" size="25" value="">&nbsp;<a id="ajouter" class="btn">Ajouter</a><br><br>

		Ajouter une date:
		<input id="datepicker" type="text">&nbsp;<a id="ajouterDate" class="btn">Ajouter</a>
	</div>
	""")))})),format.raw/*166.3*/("""
	
	

	
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

	

	<script type="text/javascript" charset="utf-8">
	
	var color1 = "#FFFF99";
	var color2 = "gold";
	var color3 = "steelblue";
	var mdp = "";

	/*$(function() """),format.raw("""{"""),format.raw/*241.18*/("""
       hash = encode64("1");
       hash2 = encode64(hash);
       alert("code:"+hash2);
       alert("decode"+decode64(decode64(hash2)));
   """),format.raw("""}"""),format.raw/*246.5*/(""")*/
	






	/*Code concernant l'interface administrateur*/


	adminTools(""""),_display_(Seq[Any](/*257.15*/adm)),format.raw/*257.18*/("""", """"),_display_(Seq[Any](/*257.23*/event/*257.28*/.passAdmin)),format.raw/*257.38*/("""", """"),_display_(Seq[Any](/*257.43*/routes/*257.49*/.Application.newAdmPass(event.id))),format.raw/*257.82*/("""");









	/*Code concernant les mails et l'envoi*/

	$(function()"""),format.raw("""{"""),format.raw/*269.15*/("""

		if (bonmail($("#mailsArea").val())) """),format.raw("""{"""),format.raw/*271.40*/("""
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
			$("#envoiLien").addClass("btn-primary");
		"""),format.raw("""}"""),format.raw/*275.4*/(""" else """),format.raw("""{"""),format.raw/*275.11*/("""
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
			$("#envoiLien").removeClass("btn-primary");
		"""),format.raw("""}"""),format.raw/*279.4*/("""
	"""),format.raw("""}"""),format.raw/*280.3*/(""");

	$('#envoiLien').live('click', function(e) """),format.raw("""{"""),format.raw/*282.45*/("""
		var canSend = true;
		var tableau = $("#mailsArea").val().split(",");
		
		for (var i=0; i<tableau.length; i++) """),format.raw("""{"""),format.raw/*286.41*/("""
			
			if (($("#mailAdressContent").html()).indexOf($.trim(tableau[i])) != -1 && tableau[i] != '') """),format.raw("""{"""),format.raw/*288.97*/("""
				alert("Mail déja envoyé à " + tableau[i] + " : ENVOI ANNULÉ (à toutes les adresses)");				
				canSend = false;
				break;
			"""),format.raw("""}"""),format.raw/*292.5*/("""
		"""),format.raw("""}"""),format.raw/*293.4*/("""

		if ($(this).attr("disabled") != "disabled" && canSend == true) """),format.raw("""{"""),format.raw/*295.67*/("""
			var mailsList = $("#mailsArea").val();

			$.ajax("""),format.raw("""{"""),format.raw/*298.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*300.12*/routes/*300.18*/.Application.sendMail(event.id))),format.raw/*300.49*/("""",
				data: '"""),format.raw("""{"""),format.raw/*301.13*/(""""mailslist" : "' + mailsList + '", "textPerso" : "' + $("#mailPersoArea").val() + '""""),format.raw("""}"""),format.raw/*301.98*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*303.31*/("""
					for (var i=0; i<tableau.length; i++) """),format.raw("""{"""),format.raw/*304.44*/("""
						$("#mailAdressContent").append(tableau[i]+"<br>");
					"""),format.raw("""}"""),format.raw/*306.7*/("""
					alert("Mail(s) envoye(s) a " + mailsList);
				"""),format.raw("""}"""),format.raw/*308.6*/("""
			"""),format.raw("""}"""),format.raw/*309.5*/(""");	
		"""),format.raw("""}"""),format.raw/*310.4*/("""	
	"""),format.raw("""}"""),format.raw/*311.3*/(""");


	$("#mailsArea").live("keyup", function() """),format.raw("""{"""),format.raw/*314.44*/("""

		if (bonmail($(this).val())) """),format.raw("""{"""),format.raw/*316.32*/("""
			
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
			$("#envoiLien").addClass("btn-primary");
		"""),format.raw("""}"""),format.raw/*321.4*/(""" else """),format.raw("""{"""),format.raw/*321.11*/("""
			
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
			$("#envoiLien").removeClass("btn-primary");
		"""),format.raw("""}"""),format.raw/*326.4*/("""
	"""),format.raw("""}"""),format.raw/*327.3*/(""")
	
	function bonmail(mailtest)
	"""),format.raw("""{"""),format.raw/*330.3*/("""
		var reg = new RegExp('^([a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*331.46*/("""1"""),format.raw("""}"""),format.raw/*331.48*/("""[a-z0-9]+)*@[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*331.80*/("""1"""),format.raw("""}"""),format.raw/*331.82*/("""[a-z0-9]+)*[\.]"""),format.raw("""{"""),format.raw/*331.98*/("""1"""),format.raw("""}"""),format.raw/*331.100*/("""[a-z]"""),format.raw("""{"""),format.raw/*331.106*/("""2,6"""),format.raw("""}"""),format.raw/*331.110*/(""")"""),format.raw("""{"""),format.raw/*331.112*/("""1"""),format.raw("""}"""),format.raw/*331.114*/("""(\,( )*[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*331.140*/("""1"""),format.raw("""}"""),format.raw/*331.142*/("""[a-z0-9]+)*@[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*331.174*/("""1"""),format.raw("""}"""),format.raw/*331.176*/("""[a-z0-9]+)*[\.]"""),format.raw("""{"""),format.raw/*331.192*/("""1"""),format.raw("""}"""),format.raw/*331.194*/("""[a-z]"""),format.raw("""{"""),format.raw/*331.200*/("""2,6"""),format.raw("""}"""),format.raw/*331.204*/(""")*$', 'i');

		if(reg.test(mailtest))
		"""),format.raw("""{"""),format.raw/*334.4*/("""
			return(true);
		"""),format.raw("""}"""),format.raw/*336.4*/("""
		else
		"""),format.raw("""{"""),format.raw/*338.4*/("""
			return(false);
		"""),format.raw("""}"""),format.raw/*340.4*/("""
	"""),format.raw("""}"""),format.raw/*341.3*/("""



























	/*Code de style*/

	$(function()"""),format.raw("""{"""),format.raw/*371.15*/("""
		$("table.datesTable td").css("background-color", color3);
		$(".checkbox").attr("disabled", "true"); 

		$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*375.37*/(""" // coloration des box checkées
		  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*376.34*/("""
		  		$(this).parent().css("background-color", "#66CC99");
		  	"""),format.raw("""}"""),format.raw/*378.7*/("""
		"""),format.raw("""}"""),format.raw/*379.4*/(""");

		$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*381.41*/("""
			$('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*383.4*/(""");

		refreshCount(); // maj de la ligne de compteurs

		affichagePopulaire(); // maj des surbrillances
	"""),format.raw("""}"""),format.raw/*388.3*/(""")

	$(".btnMailPerso").live('click', function() """),format.raw("""{"""),format.raw/*390.47*/("""
		if ($(this).siblings(".champPerso").css("display") == "none") """),format.raw("""{"""),format.raw/*391.66*/("""                
            $(this).siblings(".champPerso").removeAttr("style");
            $(this).html("<i class=\"mesicones icon-minus\"></i>")
        """),format.raw("""}"""),format.raw/*394.10*/(""" else """),format.raw("""{"""),format.raw/*394.17*/("""                
            $(this).siblings(".champPerso").attr("style", "display:none");
            $(this).html("<i class=\"mesicones icon-plus\"></i>")
        """),format.raw("""}"""),format.raw/*397.10*/("""
	"""),format.raw("""}"""),format.raw/*398.3*/(""")

	$("textarea").live('click', function(e) """),format.raw("""{"""),format.raw/*400.43*/("""
		$(this).html("");
		$(this).removeAttr("style");
	"""),format.raw("""}"""),format.raw/*403.3*/(""")

	$(".visibleAdd").live("click", function() """),format.raw("""{"""),format.raw/*405.45*/("""
        if ($(this).siblings(".champAdd").css("display") == "none") """),format.raw("""{"""),format.raw/*406.70*/("""                
            $(this).siblings(".champAdd").removeAttr("style");
            $(this).html("<i class=\"mesicones icon-minus\"></i>")
        """),format.raw("""}"""),format.raw/*409.10*/(""" else """),format.raw("""{"""),format.raw/*409.17*/("""                
            $(this).siblings(".champAdd").attr("style", "display:none");
            $(this).html("<i class=\"mesicones icon-plus\"></i>")
        """),format.raw("""}"""),format.raw/*412.10*/("""
    """),format.raw("""}"""),format.raw/*413.6*/(""")

	function refreshHoverable() """),format.raw("""{"""),format.raw/*415.31*/(""" //coloration des cases quand on passe la souris dessus
		
		$(".hoverable").on("""),format.raw("""{"""),format.raw/*417.23*/("""

			mouseenter: function () """),format.raw("""{"""),format.raw/*419.29*/("""
				$(this).css("background-color", "lightgreen");
			"""),format.raw("""}"""),format.raw/*421.5*/(""", 

			mouseleave: function () """),format.raw("""{"""),format.raw/*423.29*/("""
				if ($(this).children().is(':checked'))"""),format.raw("""{"""),format.raw/*424.44*/("""	 
			    	$(this).css("background-color", "#66CC99");
			    """),format.raw("""}"""),format.raw/*426.9*/(""" else """),format.raw("""{"""),format.raw/*426.16*/("""
			    	$(this).css("background-color", color3);
			    """),format.raw("""}"""),format.raw/*428.9*/("""
			"""),format.raw("""}"""),format.raw/*429.5*/("""
		"""),format.raw("""}"""),format.raw/*430.4*/(""");

	"""),format.raw("""}"""),format.raw/*432.3*/("""

	

	function refreshCount() """),format.raw("""{"""),format.raw/*436.27*/(""" // met à jour l'affichage du compte des participants par horaire
		$('input[type="checkbox"].horaire.checkbox').each(function(i) """),format.raw("""{"""),format.raw/*437.66*/("""
			var iden = $(this).attr('id');
			
			if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*440.32*/("""
		    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			"""),format.raw("""}"""),format.raw/*443.5*/("""
			
		"""),format.raw("""}"""),format.raw/*445.4*/(""");
			
		$('input[type="checkbox"].jour.checkbox').each(function(i) """),format.raw("""{"""),format.raw/*447.63*/("""
			var iden = $(this).attr('id');			
				
			if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*450.32*/("""
		    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			"""),format.raw("""}"""),format.raw/*453.5*/("""			
			
		"""),format.raw("""}"""),format.raw/*455.4*/(""");
	"""),format.raw("""}"""),format.raw/*456.3*/("""










	























	/*Code sur les mots de passe*/

	$( "#dialog:ui-dialog" ).dialog( "destroy" ); 
		
	
	var pass = "";
	var goodPass = "";
	var currentEditButton;
	var currentDelButton;

	$( "#dialog-question-securise" ).dialog("""),format.raw("""{"""),format.raw/*501.43*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*506.13*/("""
			"Oui": function() """),format.raw("""{"""),format.raw/*507.23*/("""				    	
			    $( "#dialog-new-pwd" ).dialog( "open" );  
			    $( this ).dialog( "close" );
			"""),format.raw("""}"""),format.raw/*510.5*/(""",
			"Non": function() """),format.raw("""{"""),format.raw/*511.23*/("""
				addPersonne($.trim($("#champ").attr("value")), "false", "");
				$( this ).dialog( "close" );
			"""),format.raw("""}"""),format.raw/*514.5*/("""				
		"""),format.raw("""}"""),format.raw/*515.4*/("""
		
	"""),format.raw("""}"""),format.raw/*517.3*/(""");
			
	
	$( "#dialog-new-pwd" ).dialog("""),format.raw("""{"""),format.raw/*520.33*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*525.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*526.22*/("""
				var bValid = true;									

				if ( bValid ) """),format.raw("""{"""),format.raw/*529.20*/("""
					mdp = $("#password-new").val();
					addPersonne($.trim($("#champ").attr("value")), "true", mdp);
					$( "#password-new" ).attr("value", "");
					$( this ).dialog( "close" );
				"""),format.raw("""}"""),format.raw/*534.6*/("""
			"""),format.raw("""}"""),format.raw/*535.5*/("""				
		"""),format.raw("""}"""),format.raw/*536.4*/("""
		
	"""),format.raw("""}"""),format.raw/*538.3*/(""");

	$( "#dialog-check-pwd" ).dialog("""),format.raw("""{"""),format.raw/*540.35*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*545.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*546.22*/("""				
								
				pass = $("#password-check").val();	
				if (pass == goodPass) """),format.raw("""{"""),format.raw/*549.28*/("""
				  	edition(currentEditButton);
				"""),format.raw("""}"""),format.raw/*551.6*/(""" else """),format.raw("""{"""),format.raw/*551.13*/("""
				  	alert("mot de passe incorrect");
				"""),format.raw("""}"""),format.raw/*553.6*/("""				
				$( "#password-check" ).attr("value", "");
				$( this ).dialog( "close" );
				
			"""),format.raw("""}"""),format.raw/*557.5*/(""",

			"Annuler": function() """),format.raw("""{"""),format.raw/*559.27*/("""							
				$( this ).dialog( "close" );				
			"""),format.raw("""}"""),format.raw/*561.5*/("""				
		"""),format.raw("""}"""),format.raw/*562.4*/("""
		
	"""),format.raw("""}"""),format.raw/*564.3*/(""");

	$( "#dialog-check-pwd-delete" ).dialog("""),format.raw("""{"""),format.raw/*566.42*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*571.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*572.22*/("""				
								
				pass = $("#password-check-delete").val();	
				if (pass == goodPass) """),format.raw("""{"""),format.raw/*575.28*/("""
				  	deletePersonne(currentDelButton);
				"""),format.raw("""}"""),format.raw/*577.6*/(""" else """),format.raw("""{"""),format.raw/*577.13*/("""
				  	alert("mot de passe incorrect");
				"""),format.raw("""}"""),format.raw/*579.6*/("""				
				$( "#password-check-delete" ).attr("value", "");
				$( this ).dialog( "close" );
				
			"""),format.raw("""}"""),format.raw/*583.5*/(""",

			"Annuler": function() """),format.raw("""{"""),format.raw/*585.27*/("""							
				$( this ).dialog( "close" );				
			"""),format.raw("""}"""),format.raw/*587.5*/("""				
		"""),format.raw("""}"""),format.raw/*588.4*/("""
		
	"""),format.raw("""}"""),format.raw/*590.3*/(""");



	


























	/*Code sur l'ajout*/

	function addPersonne(nomParticipant, locked, pwd)
	"""),format.raw("""{"""),format.raw/*624.3*/("""	
		$.ajax("""),format.raw("""{"""),format.raw/*625.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*627.11*/routes/*627.17*/.Application.addParticipant(new sun.misc.BASE64Encoder().encode((event.id.toString).getBytes)))),format.raw/*627.111*/("""",
			data: '"""),format.raw("""{"""),format.raw/*628.12*/(""""nom" : "' + nomParticipant + '", "locked" : "' + locked + '", "pwd" : "' + pwd + '""""),format.raw("""}"""),format.raw/*628.97*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*630.30*/("""
				var lock ="";		
				if(locked == "true")"""),format.raw("""{"""),format.raw/*632.26*/("""
					lock = "<i class=\"mesicones icon-lock\"></i>&nbsp;";
				"""),format.raw("""}"""),format.raw/*634.6*/("""  
				$("tbody").append("<tr title=\""+nomParticipant+"\" class=\"editable\" id=\""+data.idPersonne+"\"><td class=\"infoPersonne\">"+
					"<form id=\"formPersonne\">"+
					lock+
					"<a id=\"obligatoire\" class=\"obligatoirecb btn\">Facultatif</a>&nbsp;"+
					"<input id=\"nom\" type=\"text\" maxlength=\"25\" value=\""+nomParticipant+"\" name=\"nom\">&nbsp;"+	
					"<a id=\""+data.idPersonne+"\" title=\"editer le participant\" class=\"editPersonne\"><i class=\"mesicones icon-ok\"></i></a>"+
					"<a id=\""+data.idPersonne+"\" title=\"supprimer le participant\" class=\"deletePersonne\"> <i class=\"mesicones icon-trash\"></i</a>"+		  
					"</form></td>"+
					""""),_display_(Seq[Any](/*643.8*/for(jour <- event.jours) yield /*643.32*/ {_display_(Seq[Any](format.raw/*643.34*/(""""+  
					""""),_display_(Seq[Any](/*644.8*/if(jour.horaires.size() == 0)/*644.37*/{_display_(Seq[Any](format.raw/*644.38*/("""<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*644.117*/jour/*644.121*/.id)),format.raw/*644.124*/("""\" type=\"checkbox\" class=\"jour checkbox\" value=\""""),_display_(Seq[Any](/*644.178*/jour/*644.182*/.date)),format.raw/*644.187*/("""\" /></td>""")))})),format.raw/*644.198*/(""""+
					""""),_display_(Seq[Any](/*645.8*/for(horaire <- jour.horaires) yield /*645.37*/ {_display_(Seq[Any](format.raw/*645.39*/(""""+	                		
					"<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*646.86*/horaire/*646.93*/.id)),format.raw/*646.96*/("""\" type=\"checkbox\" class=\"horaire checkbox\" value=\""""),_display_(Seq[Any](/*646.153*/horaire/*646.160*/.debut)),format.raw/*646.166*/(""" - """),_display_(Seq[Any](/*646.170*/horaire/*646.177*/.fin)),format.raw/*646.181*/("""\" /></td>"+			                
					"""")))})),format.raw/*647.8*/(""""+                	                
					"""")))})),format.raw/*648.8*/("""" +
					"</tr>")
				$('#champ').attr('value', '')
				$('.titres').attr('style','');
				refreshHoverable();
				if (""""),_display_(Seq[Any](/*653.11*/adm)),format.raw/*653.14*/("""" == "1") """),format.raw("""{"""),format.raw/*653.25*/("""
					setTimeout(refreshtable, 500);				
					setTimeout(styles, 1500); 	
				"""),format.raw("""}"""),format.raw/*656.6*/("""					
			"""),format.raw("""}"""),format.raw/*657.5*/("""
			             
		"""),format.raw("""}"""),format.raw/*659.4*/(""");
	"""),format.raw("""}"""),format.raw/*660.3*/("""

	$("#ajouter").live('click', function(e)"""),format.raw("""{"""),format.raw/*662.42*/("""
		

	    var vide = "";	    
	    var nom = $("#champ").attr("value");
	    if (nom != vide) """),format.raw("""{"""),format.raw/*667.24*/("""  
	    	$( "#dialog-question-securise" ).dialog( "open" );	
	    	
						
		"""),format.raw("""}"""),format.raw/*671.4*/("""

	    	    
	"""),format.raw("""}"""),format.raw/*674.3*/(""");

	$("#champ").keypress(function(e) """),format.raw("""{"""),format.raw/*676.36*/("""
		var code = (e.keyCode ? e.keyCode : e.which);
		if(code == 13) """),format.raw("""{"""),format.raw/*678.19*/(""" //Enter keycode
			var vide = "";	    
		    var nom = $.trim($("#champ").attr("value"));
		    if (nom != vide) """),format.raw("""{"""),format.raw/*681.25*/("""  
		    	$( "#dialog-question-securise" ).dialog( "open" );	
							
			"""),format.raw("""}"""),format.raw/*684.5*/("""
			$("#champ").focus();
 		"""),format.raw("""}"""),format.raw/*686.5*/("""

	"""),format.raw("""}"""),format.raw/*688.3*/(""");































	/* Code sur le rajout d'horaires et de dates*/

	var currentDay;
	var debut = "08h";
	var fin = "17h";

	$(".horaireAdd").live("click", function()"""),format.raw("""{"""),format.raw/*726.44*/("""
		$( "#dialog-add-horaire" ).dialog("open");
		currentDay = $(this).attr("id");
		
	"""),format.raw("""}"""),format.raw/*730.3*/(""")

	$("#ajouterDate").live("click", function()"""),format.raw("""{"""),format.raw/*732.45*/("""
		//var listeJours = """"),_display_(Seq[Any](/*733.24*/for(jour <- event.jours) yield /*733.48*/ {_display_(Seq[Any](format.raw/*733.50*/(""" """),_display_(Seq[Any](/*733.52*/jour/*733.56*/.date)),format.raw/*733.61*/(""" """)))})),format.raw/*733.63*/(""" "; EST CENSÉ MARCHER????
		var listeJours = "";
		$(".jourintitule").each(function()"""),format.raw("""{"""),format.raw/*735.38*/("""
			listeJours=listeJours+$(this).html()+" "
		"""),format.raw("""}"""),format.raw/*737.4*/(""");

		
		if (listeJours.indexOf($("#datepicker").val()) != -1 ) """),format.raw("""{"""),format.raw/*740.59*/("""			
			alert("date déjà existante");
		"""),format.raw("""}"""),format.raw/*742.4*/(""" else """),format.raw("""{"""),format.raw/*742.11*/("""
			$.ajax("""),format.raw("""{"""),format.raw/*743.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*745.12*/routes/*745.18*/.Application.addDate(event.id))),format.raw/*745.48*/("""",
				data: '"""),format.raw("""{"""),format.raw/*746.13*/(""""date" : "' + $("#datepicker").val() + '""""),format.raw("""}"""),format.raw/*746.55*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*748.31*/("""

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
				"""),format.raw("""}"""),format.raw/*769.6*/("""
			"""),format.raw("""}"""),format.raw/*770.5*/(""");	
		"""),format.raw("""}"""),format.raw/*771.4*/("""
	"""),format.raw("""}"""),format.raw/*772.3*/(""");

	$( ".slider-range" ).slider("""),format.raw("""{"""),format.raw/*774.31*/("""
    	range: true,
    	min: 0,
    	max: 1440,
    	step: 15,
    	values: [ 8*60, 17*60 ],
    	slide: function( event, ui ) """),format.raw("""{"""),format.raw/*780.36*/("""
    		$( "#data" ).val(parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60)+" - " + parseInt(ui.values[ 1 ]/60) +"h"+pad2(ui.values[ 1 ]%60));

		"""),format.raw("""}"""),format.raw/*783.4*/(""", 
		change: function(event, ui) """),format.raw("""{"""),format.raw/*784.32*/("""
			debut = parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60);
			fin = parseInt(ui.values[ 1 ]/60) + "h"+pad2(ui.values[ 1 ]%60);
					
		"""),format.raw("""}"""),format.raw/*788.4*/("""
	"""),format.raw("""}"""),format.raw/*789.3*/(""");
			    	
	$( "#dialog-add-horaire" ).dialog("""),format.raw("""{"""),format.raw/*791.37*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		closeText: 'hide',
		buttons: """),format.raw("""{"""),format.raw/*797.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*798.22*/("""	
					
				$.ajax("""),format.raw("""{"""),format.raw/*800.13*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*802.13*/routes/*802.19*/.Application.newHoraire(event.id))),format.raw/*802.52*/("""",
					data: '"""),format.raw("""{"""),format.raw/*803.14*/(""""jour" : "' + currentDay + '""""),format.raw("""}"""),format.raw/*803.44*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*805.32*/("""
						
						$.ajax("""),format.raw("""{"""),format.raw/*807.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*809.15*/routes/*809.21*/.Application.dateChanged(event.id))),format.raw/*809.55*/("""",
							data: '"""),format.raw("""{"""),format.raw/*810.16*/(""""idhoraire" : "' + data.idHoraire + '",'+ 
							'"debut" : "' + debut + '",'+
							'"fin" : "' + fin + '""""),format.raw("""}"""),format.raw/*812.31*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*814.34*/("""
								
							"""),format.raw("""}"""),format.raw/*816.9*/("""               
						"""),format.raw("""}"""),format.raw/*817.8*/(""");
					"""),format.raw("""}"""),format.raw/*818.7*/("""
				"""),format.raw("""}"""),format.raw/*819.6*/(""");			

				setTimeout(refreshtable, 100);	
				
				$( this ).dialog( "close" );
				
				setTimeout(refreshtable, 500);
				
				
				setTimeout(styles, 1500);



								
			"""),format.raw("""}"""),format.raw/*833.5*/(""",

			"Annuler": function() """),format.raw("""{"""),format.raw/*835.27*/("""							
				$( this ).dialog( "close" );				
			"""),format.raw("""}"""),format.raw/*837.5*/("""				
		"""),format.raw("""}"""),format.raw/*838.4*/("""
		
	"""),format.raw("""}"""),format.raw/*840.3*/(""");

	function styles()"""),format.raw("""{"""),format.raw/*842.20*/("""
		

		$("tr").attr("style", "");
		$("table.datesTable td").css("background-color", color3);
		$(".checkbox").attr("disabled", "true"); 

		$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*849.37*/(""" // coloration des box checkées
		  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*850.34*/("""
		  		$(this).parent().css("background-color", "#66CC99");
		  	"""),format.raw("""}"""),format.raw/*852.7*/("""
		"""),format.raw("""}"""),format.raw/*853.4*/(""");

		$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*855.41*/("""
			$('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*857.4*/(""");

		refreshCount(); // maj de la ligne de compteurs

		affichagePopulaire();
	"""),format.raw("""}"""),format.raw/*862.3*/("""

	function refreshtable()"""),format.raw("""{"""),format.raw/*864.26*/("""
		$('#divtest').load('/KIND/eventEdit/"""),_display_(Seq[Any](/*865.40*/(new sun.misc.BASE64Encoder().encode((event.id.toString).getBytes)))),format.raw/*865.107*/("""/adm #divtest');
	"""),format.raw("""}"""),format.raw/*866.3*/("""

	function pad2(number) """),format.raw("""{"""),format.raw/*868.25*/("""
   
    	return (number < 10 ? '0' : '') + number
   
	"""),format.raw("""}"""),format.raw/*872.3*/("""


























	/* Code concernant la suppression d'horaires et de jours*/
	 
	$(".horaireDel").live("click", function()"""),format.raw("""{"""),format.raw/*901.44*/("""
		var thisse = $(this);
		
			
		$.ajax("""),format.raw("""{"""),format.raw/*905.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*907.11*/routes/*907.17*/.Application.deleteHoraire(event.id))),format.raw/*907.53*/("""",
			data: '"""),format.raw("""{"""),format.raw/*908.12*/(""""jour" : "' + $(this).attr("idjour") + '", "horaire" : "' + $(this).attr("id") + '""""),format.raw("""}"""),format.raw/*908.96*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*910.30*/("""
				setTimeout(refreshtable, 500);				
				setTimeout(styles, 2000);				
			"""),format.raw("""}"""),format.raw/*913.5*/(""", 
			error : function(data) """),format.raw("""{"""),format.raw/*914.28*/("""
				alert("impossible de supprimer l'horaire, vérifiez que personne n'est disponible à cet horaire-ci")
			"""),format.raw("""}"""),format.raw/*916.5*/("""
		"""),format.raw("""}"""),format.raw/*917.4*/(""");	

	"""),format.raw("""}"""),format.raw/*919.3*/(""")

	$(".jourDel").live("click", function()"""),format.raw("""{"""),format.raw/*921.41*/("""
		var thisse = $(this);
		
		
		$.ajax("""),format.raw("""{"""),format.raw/*925.11*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*927.12*/routes/*927.18*/.Application.removeDate(event.id))),format.raw/*927.51*/("""",
				data: '"""),format.raw("""{"""),format.raw/*928.13*/(""""idDate" : "' + $(this).attr("id") + '""""),format.raw("""}"""),format.raw/*928.53*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*930.31*/("""
					setTimeout(refreshtable, 500);
					setTimeout(styles, 2000);		
				"""),format.raw("""}"""),format.raw/*933.6*/(""",
				error : function(data) """),format.raw("""{"""),format.raw/*934.29*/("""
					alert("impossible de supprimer le jour, vérifiez que personne n'est disponible ce jour-ci")
				"""),format.raw("""}"""),format.raw/*936.6*/("""
			"""),format.raw("""}"""),format.raw/*937.5*/(""");				

	"""),format.raw("""}"""),format.raw/*939.3*/(""")
	



























	/*Code sur l'édition des participants*/

	$('.editPersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*970.48*/("""
		
	    if(!$(this).parents("tr").hasClass("editable"))  """),format.raw("""{"""),format.raw/*972.56*/("""	    	
	    	if ($(this).siblings("i").hasClass("icon-lock"))"""),format.raw("""{"""),format.raw/*973.56*/("""
	    		currentEditButton = $(this);
	    		$.ajax("""),format.raw("""{"""),format.raw/*975.16*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*977.13*/routes/*977.19*/.Application.getPass())),format.raw/*977.41*/("""",
					data: '"""),format.raw("""{"""),format.raw/*978.14*/(""" "idpers" : "'+$(this).parents("tr").attr("id")+'" """),format.raw("""}"""),format.raw/*978.66*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*980.32*/("""
						goodPass = data.pass;

						$( "#dialog-check-pwd" ).dialog( "open" );	
											  
					"""),format.raw("""}"""),format.raw/*985.7*/("""
			   """),format.raw("""}"""),format.raw/*986.8*/(""");			
				
			"""),format.raw("""}"""),format.raw/*988.5*/(""" else """),format.raw("""{"""),format.raw/*988.12*/("""
				edition($(this));
			"""),format.raw("""}"""),format.raw/*990.5*/("""
		  
	    """),format.raw("""}"""),format.raw/*992.7*/(""" else """),format.raw("""{"""),format.raw/*992.14*/("""
	    	if ($.trim($(this).siblings("input").attr("value")) != "") """),format.raw("""{"""),format.raw/*993.67*/("""
			      $(this).html("<i class=\"mesicones icon-pencil\"></i>");
			      $(this).parents("tr").removeClass("editable");
			      $(this).siblings('input[type="text"]').attr("readonly", "readonly");
			      $(this).parent().parent().parent().children("td").children('input[type="checkbox"]').attr("disabled","true"); 
			      $(this).parent().parent().parent().children("td").css("border", "none");
			      $(".hoverable").off();	      
			      $(this).parent().parent().parent().children(".checktd").attr("class", "checktd");
			      refreshHoverable();
			      editPersonne($(this).attr('id'), $(this).siblings("input").attr("value"));
			"""),format.raw("""}"""),format.raw/*1003.5*/(""" else """),format.raw("""{"""),format.raw/*1003.12*/("""
				alert("Impossible de mettre un nom vide!!");
			"""),format.raw("""}"""),format.raw/*1005.5*/("""
	    """),format.raw("""}"""),format.raw/*1006.7*/("""
	
	  
	"""),format.raw("""}"""),format.raw/*1009.3*/(""")

	function edition(elem) """),format.raw("""{"""),format.raw/*1011.26*/("""
		elem.html("<i class=\"mesicones icon-ok\"></i>");
		elem.parents("tr").addClass("editable");
		elem.siblings('input[type="text"]').removeAttr("readonly");
		elem.parent().parent().parent().children("td").children().removeAttr("disabled");
		elem.parent().parent().parent().children("td").css("border", "solid black 2px");
		$(".hoverable").off();		  
		elem.parent().parent().parent().children(".checktd").attr("class", "checktd hoverable");
		refreshHoverable();
	"""),format.raw("""}"""),format.raw/*1020.3*/("""

	function editPersonne(personneId, personneNom)
	"""),format.raw("""{"""),format.raw/*1023.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*1024.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1026.11*/routes/*1026.17*/.Application.updatePersonne(event.id))),format.raw/*1026.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1027.12*/(""""id" : "' + personneId + '", "nom" : "' + personneNom + '""""),format.raw("""}"""),format.raw/*1027.71*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1029.30*/("""
			  //alert("Participant edit\351");
			"""),format.raw("""}"""),format.raw/*1031.5*/("""
	  """),format.raw("""}"""),format.raw/*1032.5*/(""");
	"""),format.raw("""}"""),format.raw/*1033.3*/("""

	$('.checktd').live('click', function(e) """),format.raw("""{"""),format.raw/*1035.43*/("""
		if ($(this).children().prop("disabled") == false) """),format.raw("""{"""),format.raw/*1036.54*/("""
			if ($(this).children().prop("checked") == false) """),format.raw("""{"""),format.raw/*1037.54*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*1038.36*/("""
					$(this).children().prop("checked", true);
				"""),format.raw("""}"""),format.raw/*1040.6*/("""
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*1042.5*/(""" else """),format.raw("""{"""),format.raw/*1042.12*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*1043.36*/("""
					$(this).children().prop("checked", false);
				"""),format.raw("""}"""),format.raw/*1045.6*/("""        
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*1047.5*/("""

			affichagePopulaire();

			//$('.populaires').html("");
			$('.titres td').each( function() """),format.raw("""{"""),format.raw/*1052.38*/("""
				if ($(this).css('background-color') == color2) """),format.raw("""{"""),format.raw/*1053.53*/("""
					$('.populaires').append($(this).html());
				"""),format.raw("""}"""),format.raw/*1055.6*/("""				
			"""),format.raw("""}"""),format.raw/*1056.5*/(""")			
		"""),format.raw("""}"""),format.raw/*1057.4*/("""
	"""),format.raw("""}"""),format.raw/*1058.3*/(""");

	function changeCheck(box) """),format.raw("""{"""),format.raw/*1060.29*/("""   // gestion des clics sur les checkboxes
	   var idtime = box.attr('id');
	   var idParticipant = box.parent().parent().attr('id');   
	   
	   if (box.is(':checked'))"""),format.raw("""{"""),format.raw/*1064.29*/("""	 //Action de valider une horaire  		
	       		box.parent().css("background-color", "#66CC99")//vert
		   		if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*1066.57*/("""
		            var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
		       	    requeteAjaxHeure(idtime, idParticipant);
			    """),format.raw("""}"""),format.raw/*1070.9*/("""
	       		if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*1071.57*/("""	
	    	   	    var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
				    requeteAjaxJour(idtime, idParticipant);
			   """),format.raw("""}"""),format.raw/*1075.8*/("""
	   """),format.raw("""}"""),format.raw/*1076.6*/(""" else """),format.raw("""{"""),format.raw/*1076.13*/(""" //Action de dévalider une horaires
	     
		    box.parent().css("background-color", color3) //
		    if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*1079.56*/("""
			    var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxHeure(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*1083.8*/("""
		    if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*1084.53*/("""
		        var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxJour(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*1088.8*/("""
	   """),format.raw("""}"""),format.raw/*1089.6*/("""
	"""),format.raw("""}"""),format.raw/*1090.3*/("""

	function requeteAjaxJour(idtime, idParticipant) // ajoute la date au participant
	"""),format.raw("""{"""),format.raw/*1093.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*1094.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1096.11*/routes/*1096.17*/.Application.checkBoxJour(event.id))),format.raw/*1096.52*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1097.12*/(""""idjour" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*1097.80*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1099.30*/("""
			  //alert("Jour edit\351");
			"""),format.raw("""}"""),format.raw/*1101.5*/("""
	   """),format.raw("""}"""),format.raw/*1102.6*/(""");
	"""),format.raw("""}"""),format.raw/*1103.3*/("""

	function requeteAjaxHeure(idtime, idParticipant) // ajoute l'heure au participant
	"""),format.raw("""{"""),format.raw/*1106.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*1107.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1109.11*/routes/*1109.17*/.Application.checkBoxHoraire(event.id))),format.raw/*1109.55*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1110.12*/(""""idhoraire" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*1110.83*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1112.30*/("""
			  //alert("Horaire edit\351");
			"""),format.raw("""}"""),format.raw/*1114.5*/("""
	   """),format.raw("""}"""),format.raw/*1115.6*/(""");
	"""),format.raw("""}"""),format.raw/*1116.3*/("""


























	/*Code sur la suppression de participants*/

	$('.deletePersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*1145.50*/("""
		currentDelButton = $(this);
		if ($(this).siblings("i").hasClass("icon-lock"))"""),format.raw("""{"""),format.raw/*1147.52*/("""
    		
    		$.ajax("""),format.raw("""{"""),format.raw/*1149.15*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*1151.12*/routes/*1151.18*/.Application.getPass())),format.raw/*1151.40*/("""",
				data: '"""),format.raw("""{"""),format.raw/*1152.13*/(""" "idpers" : "'+$(this).parents("tr").attr("id")+'" """),format.raw("""}"""),format.raw/*1152.65*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*1154.31*/("""
					goodPass = data.pass;

					$( "#dialog-check-pwd-delete" ).dialog( "open" );	
										  
				"""),format.raw("""}"""),format.raw/*1159.6*/("""
		   """),format.raw("""}"""),format.raw/*1160.7*/(""");			
			
		"""),format.raw("""}"""),format.raw/*1162.4*/(""" else """),format.raw("""{"""),format.raw/*1162.11*/("""   
		    deletePersonne(currentDelButton);
		"""),format.raw("""}"""),format.raw/*1164.4*/("""
	    
	"""),format.raw("""}"""),format.raw/*1166.3*/(""")

	function deletePersonne(delButton)
	"""),format.raw("""{"""),format.raw/*1169.3*/("""
		delButton.parent().parent().parent().remove();		    
	    
	    if($('td[class="infoPersonne"]').html() == null) """),format.raw("""{"""),format.raw/*1172.56*/("""
	    	$('.titres').attr('style','display:none');
	    """),format.raw("""}"""),format.raw/*1174.7*/("""

	    $('#compte').children('td[id!=""]').each(function(i) """),format.raw("""{"""),format.raw/*1176.60*/("""
	    	$(this).html("0")
	    """),format.raw("""}"""),format.raw/*1178.7*/(""");

	    refreshCount();

	    $.ajax("""),format.raw("""{"""),format.raw/*1182.14*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1184.11*/routes/*1184.17*/.Application.deleteParticipant(event.id))),format.raw/*1184.57*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1185.12*/(""""id" : "' + delButton.attr('id') + '""""),format.raw("""}"""),format.raw/*1185.50*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1187.30*/("""
			  //alert("Participant supprim\351");
			"""),format.raw("""}"""),format.raw/*1189.5*/("""
	    """),format.raw("""}"""),format.raw/*1190.7*/(""");
	"""),format.raw("""}"""),format.raw/*1191.3*/("""


















	/*Code sur les participants obligatoires*/
	$(function()"""),format.raw("""{"""),format.raw/*1211.15*/("""
		refreshObligatoire(); 
		affichagePopulaire();
		
	"""),format.raw("""}"""),format.raw/*1215.3*/(""")	

	$(".obligatoirecb").live("click", function() """),format.raw("""{"""),format.raw/*1217.48*/(""" //click sur la checkbox "obligatoire" : mise à jour des classes sur la ligne, ajout de la propriété obligatoire dans la bdd
			
			var idParticipant = $(this).parent().parent().parent().attr("id");
			if ($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*1220.42*/("""
				$(this).html("Facultatif");
				$(this).attr("class", "obligatoirecb btn");
			"""),format.raw("""}"""),format.raw/*1223.5*/(""" else """),format.raw("""{"""),format.raw/*1223.12*/("""
				$(this).html("Obligatoire");
				$(this).attr("class", "obligatoirecb btn btn-inverse");
			"""),format.raw("""}"""),format.raw/*1226.5*/("""
			$.ajax("""),format.raw("""{"""),format.raw/*1227.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*1229.12*/routes/*1229.18*/.Application.changeObligatoire(event.id))),format.raw/*1229.58*/("""",
				data: '"""),format.raw("""{"""),format.raw/*1230.13*/(""""idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*1230.52*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*1232.31*/("""
				  affichagePopulaire();
				"""),format.raw("""}"""),format.raw/*1234.6*/("""
	   		"""),format.raw("""}"""),format.raw/*1235.8*/(""");
	   		refreshObligatoire();

		"""),format.raw("""}"""),format.raw/*1238.4*/(""")

	function checkobligatoire(idtime, type) """),format.raw("""{"""),format.raw/*1240.43*/("""//fonction qui renvoie true si tous les participants obligatoires sont présents.
		
		var ret = true;
		
		$('.obligatoire.'+type+'[id="'+idtime+'"]').each(function() """),format.raw("""{"""),format.raw/*1244.64*/("""			
			if(!($(this).is(":checked"))) """),format.raw("""{"""),format.raw/*1245.35*/("""
				
				ret = false;
			"""),format.raw("""}"""),format.raw/*1248.5*/("""
		"""),format.raw("""}"""),format.raw/*1249.4*/(""")
		return ret;
	"""),format.raw("""}"""),format.raw/*1251.3*/("""

	function refreshObligatoire() """),format.raw("""{"""),format.raw/*1253.33*/(""" // met à jour les classes "obligatoire" sur les bonnes lignes de participants
		$(".checktd").removeClass("obligatoire");
		$(".checkbox").removeClass("obligatoire");
		$(".obligatoirecb").each(function () """),format.raw("""{"""),format.raw/*1256.41*/("""
			
			if($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*1258.41*/("""					
				$(this).parent().parent().siblings(".checktd").addClass("obligatoire");
				$(this).parent().parent().siblings(".checktd").children().addClass("obligatoire");
			"""),format.raw("""}"""),format.raw/*1261.5*/("""

		"""),format.raw("""}"""),format.raw/*1263.4*/(""")
	"""),format.raw("""}"""),format.raw/*1264.3*/("""








	
	
	

	

	

	

	

	


	
	/*Code d'affichage des dates populaires*/
	function affichagePopulaire() """),format.raw("""{"""),format.raw/*1290.33*/("""
		var max = 0;
		$("#compte").children(".horaire, .jour").each( function() """),format.raw("""{"""),format.raw/*1292.62*/(""" // récupération de la valeur maximale dans les comptes
			$(this).css("background-color", color1) 
			$('.titres').children().css("background-color",color1);
			//$('.footer').html("");
			if (checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*1296.70*/("""			
				if ($(this).html() > max) """),format.raw("""{"""),format.raw/*1297.32*/("""			
					max = $(this).html();
				"""),format.raw("""}"""),format.raw/*1299.6*/("""
			"""),format.raw("""}"""),format.raw/*1300.5*/("""		
		"""),format.raw("""}"""),format.raw/*1301.4*/(""")
		$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*1302.45*/("""
			
			if ($(this).html() == max && $(this).html() != 0 && checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*1304.118*/("""			
				$(this).css("background-color", color2);				
				$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", color2);
				if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*1307.45*/("""
					var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
					$("td:contains('"+day+"')").css("background-color", color2);
					
				"""),format.raw("""}"""),format.raw/*1311.6*/("""
			"""),format.raw("""}"""),format.raw/*1312.5*/("""
		"""),format.raw("""}"""),format.raw/*1313.4*/(""")
	"""),format.raw("""}"""),format.raw/*1314.3*/("""
	</script>

""")))})),format.raw/*1317.2*/("""
"""))}
    }
    
    def render(event:Evenement,adm:Integer) = apply(event,adm)
    
    def f:((Evenement,Integer) => play.api.templates.Html) = (event,adm) => apply(event,adm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 30 13:14:15 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/editForm.scala.html
                    HASH: 80623746849d494dced0132f6755ef485c135b9d
                    MATRIX: 769->1|886->54|918->78|1002->33|1030->52|1058->132|1097->137|1132->164|1171->166|1234->193|1248->198|1276->204|1361->253|1375->258|1403->264|1473->298|1487->303|1518->312|1560->318|1613->362|1653->364|1708->382|1723->387|1752->393|1787->395|1840->412|1854->417|1904->445|1947->453|1982->479|2022->481|2078->501|2092->506|2125->517|2170->531|2219->545|2240->557|2280->559|2352->595|2367->601|2423->635|2571->752|3536->1682|3557->1694|3597->1696|3806->1870|3850->1898|3889->1899|3931->1906|3940->1907|3970->1915|4012->1926|4064->1947|4177->2025|4198->2037|4237->2038|4423->2193|4642->2377|4682->2401|4722->2403|4782->2427|4795->2431|4820->2434|4881->2459|4894->2463|4932->2479|5002->2513|5015->2517|5042->2522|5090->2535|5111->2547|5150->2548|5194->2556|5207->2560|5232->2563|5374->2672|5417->2680|5438->2692|5477->2693|5521->2701|5534->2705|5559->2708|5681->2797|5771->2856|5909->2959|5949->2983|5989->2985|6033->2994|6071->3023|6110->3024|6180->3063|6226->3073|6271->3102|6311->3104|6366->3123|6382->3130|6407->3133|6453->3143|6466->3147|6491->3150|6557->3180|6573->3187|6601->3193|6641->3197|6657->3204|6683->3208|6732->3221|6753->3233|6792->3234|6836->3242|6852->3249|6877->3252|6924->3263|6937->3267|6962->3270|7097->3372|7154->3397|7194->3406|7265->3442|7319->3480|7359->3482|7412->3499|7432->3510|7458->3514|7501->3521|7521->3532|7546->3535|7635->3589|7714->3659|7754->3661|7797->3669|7828->3691|7867->3692|7949->3743|7993->3751|8030->3778|8070->3779|8185->3876|8199->3881|8239->3882|8355->3966|8451->4025|8472->4036|8499->4040|8591->4095|8612->4106|8638->4109|8784->4218|8805->4229|8831->4232|8969->4338|9023->4356|9064->4380|9105->4382|9153->4393|9192->4422|9232->4423|9282->4436|9340->4484|9381->4486|9470->4538|9484->4542|9510->4545|9614->4611|9629->4615|9658->4620|9706->4649|9720->4654|9760->4655|9850->4708|9864->4712|9890->4715|9986->4773|10001->4777|10030->4782|10091->4810|10148->4834|10202->4851|10248->4880|10289->4882|10345->4901|10409->4955|10450->4957|10539->5009|10556->5016|10582->5019|10689->5088|10707->5095|10737->5101|10779->5105|10797->5112|10825->5116|10873->5145|10887->5150|10927->5151|11017->5204|11034->5211|11060->5214|11158->5274|11176->5281|11206->5287|11248->5291|11266->5298|11294->5302|11355->5330|11405->5347|11480->5389|11531->5408|11626->5467|11670->5501|11710->5502|11765->5524|11841->5564|11882->5588|11923->5590|11968->5599|12007->5628|12047->5629|12118->5663|12132->5667|12158->5670|12228->5708|12280->5723|12326->5752|12367->5754|12445->5795|12462->5802|12488->5805|12574->5858|12611->5863|12728->5944|12750->5956|12790->5957|13190->6325|15332->8419|15523->8563|15636->8639|15662->8642|15704->8647|15719->8652|15752->8662|15794->8667|15810->8673|15866->8706|15984->8776|16073->8817|16276->8973|16331->8980|16543->9145|16593->9148|16689->9196|16853->9312|17002->9413|17181->9545|17232->9549|17348->9617|17451->9672|17518->9702|17534->9708|17588->9739|17651->9754|17784->9839|17902->9909|17994->9953|18105->10017|18206->10071|18258->10076|18312->10083|18363->10087|18459->10135|18540->10168|18747->10328|18802->10335|19018->10504|19068->10507|19149->10541|19243->10587|19293->10589|19372->10621|19422->10623|19486->10639|19537->10641|19592->10647|19645->10651|19696->10653|19747->10655|19822->10681|19873->10683|19953->10715|20004->10717|20069->10733|20120->10735|20175->10741|20228->10745|20316->10786|20384->10807|20442->10818|20511->10840|20561->10843|20671->10905|20861->11047|20974->11112|21087->11178|21138->11182|21230->11226|21315->11264|21468->11370|21565->11419|21679->11485|21885->11643|21940->11650|22155->11817|22205->11820|22298->11865|22399->11919|22494->11966|22612->12036|22816->12192|22871->12199|23084->12364|23137->12370|23218->12403|23347->12484|23425->12514|23528->12570|23608->12602|23700->12646|23810->12709|23865->12716|23970->12774|24022->12779|24073->12783|24126->12789|24205->12820|24384->12951|24502->13021|24677->13149|24732->13157|24849->13226|24971->13300|25143->13425|25201->13436|25253->13441|25549->13689|25709->13801|25780->13824|25927->13924|25999->13948|26149->14051|26204->14059|26257->14065|26346->14106|26506->14218|26576->14240|26677->14293|26912->14481|26964->14486|27019->14494|27072->14500|27158->14538|27318->14650|27388->14672|27517->14753|27605->14794|27660->14801|27753->14847|27893->14940|27970->14969|28066->15018|28121->15026|28174->15032|28267->15077|28427->15189|28497->15211|28633->15299|28727->15346|28782->15353|28875->15399|29022->15499|29099->15528|29195->15577|29250->15585|29303->15591|29460->15701|29520->15713|29585->15741|29601->15747|29719->15841|29781->15855|29914->15940|30030->16008|30124->16054|30236->16119|30945->16792|30986->16816|31027->16818|31075->16830|31114->16859|31154->16860|31271->16939|31286->16943|31313->16946|31405->17000|31420->17004|31449->17009|31494->17020|31540->17030|31586->17059|31627->17061|31771->17168|31788->17175|31814->17178|31909->17235|31927->17242|31957->17248|31999->17252|32017->17259|32045->17263|32116->17302|32191->17345|32349->17466|32375->17469|32434->17480|32560->17559|32617->17569|32685->17590|32737->17595|32828->17638|32971->17733|33096->17811|33158->17826|33245->17865|33360->17932|33523->18047|33644->18121|33720->18150|33771->18154|34001->18336|34134->18422|34229->18469|34290->18493|34331->18517|34372->18519|34411->18521|34425->18525|34453->18530|34488->18532|34622->18618|34717->18666|34830->18731|34917->18771|34972->18778|35032->18790|35099->18820|35115->18826|35168->18856|35231->18871|35321->18913|35439->18983|36332->19829|36384->19834|36438->19841|36488->19844|36570->19878|36746->20006|36946->20159|37028->20193|37223->20341|37273->20344|37369->20392|37550->20525|37620->20547|37688->20567|37757->20599|37773->20605|37829->20638|37893->20654|37971->20684|38091->20756|38161->20778|38234->20814|38250->20820|38307->20854|38373->20872|38531->20982|38655->21058|38720->21076|38790->21099|38846->21108|38899->21114|39123->21291|39200->21320|39296->21369|39351->21377|39404->21383|39475->21406|39698->21581|39811->21646|39924->21712|39975->21716|40067->21760|40152->21798|40280->21879|40355->21906|40432->21946|40523->22013|40589->22032|40663->22058|40767->22115|40948->22248|41038->22290|41103->22318|41119->22324|41178->22360|41240->22374|41372->22458|41488->22526|41613->22604|41691->22634|41847->22743|41898->22747|41952->22754|42043->22797|42132->22838|42199->22868|42215->22874|42271->22907|42334->22922|42422->22962|42540->23032|42662->23107|42740->23137|42890->23240|42942->23245|42999->23255|43167->23375|43274->23434|43384->23496|43484->23548|43553->23580|43569->23586|43614->23608|43678->23624|43778->23676|43898->23748|44045->23848|44100->23856|44162->23871|44217->23878|44291->23905|44350->23917|44405->23924|44520->23991|45218->24641|45274->24648|45376->24702|45431->24709|45488->24718|45565->24746|46082->25215|46182->25267|46243->25279|46309->25307|46326->25313|46387->25350|46450->25364|46558->25423|46675->25491|46766->25534|46819->25539|46872->25544|46965->25588|47068->25642|47171->25696|47256->25732|47357->25785|47447->25827|47503->25834|47588->25870|47690->25924|47788->25974|47934->26071|48036->26124|48136->26176|48193->26185|48249->26193|48300->26196|48381->26228|48600->26398|48807->26556|49058->26759|49164->26816|49405->27009|49459->27015|49515->27022|49716->27174|49948->27358|50050->27411|50281->27594|50335->27600|50386->27603|50520->27689|50581->27701|50647->27729|50664->27735|50723->27770|50786->27784|50903->27852|51020->27920|51104->27956|51158->27962|51211->27967|51346->28054|51407->28066|51473->28094|51490->28100|51552->28138|51615->28152|51735->28223|51852->28291|51939->28330|51993->28336|52046->28341|52217->28463|52348->28545|52419->28567|52487->28597|52504->28603|52550->28625|52614->28640|52715->28692|52834->28762|52985->28865|53040->28872|53101->28885|53157->28892|53252->28939|53309->28948|53398->28989|53564->29106|53668->29162|53778->29223|53857->29254|53945->29293|54011->29321|54028->29327|54092->29367|54155->29381|54242->29419|54359->29487|54453->29533|54508->29540|54561->29545|54687->29622|54790->29677|54890->29728|55179->29968|55312->30053|55368->30060|55514->30158|55575->30170|55643->30200|55660->30206|55724->30246|55788->30261|55876->30300|55995->30370|56077->30404|56133->30412|56216->30447|56310->30492|56527->30660|56614->30698|56689->30725|56741->30729|56807->30747|56890->30781|57147->30989|57241->31034|57462->31207|57515->31212|57567->31216|57725->31325|57851->31402|58156->31658|58240->31693|58324->31729|58377->31734|58431->31740|58526->31786|58698->31908|58953->32114|59183->32296|59236->32301|59288->32305|59340->32309|59387->32323
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|39->10|39->10|39->10|42->13|42->13|42->13|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|44->15|44->15|44->15|46->17|46->17|46->17|47->18|47->18|47->18|48->19|51->22|51->22|51->22|52->23|52->23|52->23|54->25|73->44|73->44|73->44|79->50|79->50|79->50|80->51|80->51|80->51|81->52|84->55|90->61|90->61|90->61|93->64|99->70|99->70|99->70|100->71|100->71|100->71|100->71|100->71|100->71|101->72|101->72|101->72|102->73|102->73|102->73|102->73|102->73|102->73|102->73|103->74|103->74|103->74|103->74|103->74|103->74|103->74|105->76|108->79|108->79|108->79|109->80|109->80|109->80|111->82|112->83|112->83|112->83|113->84|113->84|113->84|113->84|113->84|113->84|114->85|114->85|114->85|114->85|114->85|114->85|115->86|115->86|115->86|115->86|115->86|115->86|115->86|115->86|115->86|115->86|117->88|119->90|123->94|123->94|123->94|124->95|124->95|124->95|124->95|124->95|124->95|125->96|125->96|125->96|126->97|126->97|126->97|128->99|129->100|129->100|129->100|131->102|131->102|131->102|133->104|135->106|135->106|135->106|136->107|136->107|136->107|137->108|137->108|137->108|138->109|140->111|140->111|140->111|141->112|141->112|141->112|142->113|142->113|142->113|143->114|143->114|143->114|143->114|143->114|143->114|144->115|144->115|144->115|145->116|145->116|145->116|145->116|145->116|145->116|146->117|148->119|149->120|149->120|149->120|150->121|150->121|150->121|151->122|151->122|151->122|151->122|151->122|151->122|151->122|151->122|151->122|152->123|152->123|152->123|153->124|153->124|153->124|153->124|153->124|153->124|153->124|153->124|153->124|154->125|155->126|156->127|158->129|162->133|162->133|162->133|162->133|164->135|164->135|164->135|165->136|165->136|165->136|166->137|166->137|166->137|167->138|168->139|168->139|168->139|169->140|169->140|169->140|170->141|171->142|185->156|185->156|185->156|195->166|270->241|275->246|286->257|286->257|286->257|286->257|286->257|286->257|286->257|286->257|298->269|300->271|304->275|304->275|308->279|309->280|311->282|315->286|317->288|321->292|322->293|324->295|327->298|329->300|329->300|329->300|330->301|330->301|332->303|333->304|335->306|337->308|338->309|339->310|340->311|343->314|345->316|350->321|350->321|355->326|356->327|359->330|360->331|360->331|360->331|360->331|360->331|360->331|360->331|360->331|360->331|360->331|360->331|360->331|360->331|360->331|360->331|360->331|360->331|360->331|363->334|365->336|367->338|369->340|370->341|400->371|404->375|405->376|407->378|408->379|410->381|412->383|417->388|419->390|420->391|423->394|423->394|426->397|427->398|429->400|432->403|434->405|435->406|438->409|438->409|441->412|442->413|444->415|446->417|448->419|450->421|452->423|453->424|455->426|455->426|457->428|458->429|459->430|461->432|465->436|466->437|469->440|472->443|474->445|476->447|479->450|482->453|484->455|485->456|530->501|535->506|536->507|539->510|540->511|543->514|544->515|546->517|549->520|554->525|555->526|558->529|563->534|564->535|565->536|567->538|569->540|574->545|575->546|578->549|580->551|580->551|582->553|586->557|588->559|590->561|591->562|593->564|595->566|600->571|601->572|604->575|606->577|606->577|608->579|612->583|614->585|616->587|617->588|619->590|653->624|654->625|656->627|656->627|656->627|657->628|657->628|659->630|661->632|663->634|672->643|672->643|672->643|673->644|673->644|673->644|673->644|673->644|673->644|673->644|673->644|673->644|673->644|674->645|674->645|674->645|675->646|675->646|675->646|675->646|675->646|675->646|675->646|675->646|675->646|676->647|677->648|682->653|682->653|682->653|685->656|686->657|688->659|689->660|691->662|696->667|700->671|703->674|705->676|707->678|710->681|713->684|715->686|717->688|755->726|759->730|761->732|762->733|762->733|762->733|762->733|762->733|762->733|762->733|764->735|766->737|769->740|771->742|771->742|772->743|774->745|774->745|774->745|775->746|775->746|777->748|798->769|799->770|800->771|801->772|803->774|809->780|812->783|813->784|817->788|818->789|820->791|826->797|827->798|829->800|831->802|831->802|831->802|832->803|832->803|834->805|836->807|838->809|838->809|838->809|839->810|841->812|843->814|845->816|846->817|847->818|848->819|862->833|864->835|866->837|867->838|869->840|871->842|878->849|879->850|881->852|882->853|884->855|886->857|891->862|893->864|894->865|894->865|895->866|897->868|901->872|930->901|934->905|936->907|936->907|936->907|937->908|937->908|939->910|942->913|943->914|945->916|946->917|948->919|950->921|954->925|956->927|956->927|956->927|957->928|957->928|959->930|962->933|963->934|965->936|966->937|968->939|999->970|1001->972|1002->973|1004->975|1006->977|1006->977|1006->977|1007->978|1007->978|1009->980|1014->985|1015->986|1017->988|1017->988|1019->990|1021->992|1021->992|1022->993|1032->1003|1032->1003|1034->1005|1035->1006|1038->1009|1040->1011|1049->1020|1052->1023|1053->1024|1055->1026|1055->1026|1055->1026|1056->1027|1056->1027|1058->1029|1060->1031|1061->1032|1062->1033|1064->1035|1065->1036|1066->1037|1067->1038|1069->1040|1071->1042|1071->1042|1072->1043|1074->1045|1076->1047|1081->1052|1082->1053|1084->1055|1085->1056|1086->1057|1087->1058|1089->1060|1093->1064|1095->1066|1099->1070|1100->1071|1104->1075|1105->1076|1105->1076|1108->1079|1112->1083|1113->1084|1117->1088|1118->1089|1119->1090|1122->1093|1123->1094|1125->1096|1125->1096|1125->1096|1126->1097|1126->1097|1128->1099|1130->1101|1131->1102|1132->1103|1135->1106|1136->1107|1138->1109|1138->1109|1138->1109|1139->1110|1139->1110|1141->1112|1143->1114|1144->1115|1145->1116|1174->1145|1176->1147|1178->1149|1180->1151|1180->1151|1180->1151|1181->1152|1181->1152|1183->1154|1188->1159|1189->1160|1191->1162|1191->1162|1193->1164|1195->1166|1198->1169|1201->1172|1203->1174|1205->1176|1207->1178|1211->1182|1213->1184|1213->1184|1213->1184|1214->1185|1214->1185|1216->1187|1218->1189|1219->1190|1220->1191|1240->1211|1244->1215|1246->1217|1249->1220|1252->1223|1252->1223|1255->1226|1256->1227|1258->1229|1258->1229|1258->1229|1259->1230|1259->1230|1261->1232|1263->1234|1264->1235|1267->1238|1269->1240|1273->1244|1274->1245|1277->1248|1278->1249|1280->1251|1282->1253|1285->1256|1287->1258|1290->1261|1292->1263|1293->1264|1319->1290|1321->1292|1325->1296|1326->1297|1328->1299|1329->1300|1330->1301|1331->1302|1333->1304|1336->1307|1340->1311|1341->1312|1342->1313|1343->1314|1346->1317
                    -- GENERATED --
                */
            