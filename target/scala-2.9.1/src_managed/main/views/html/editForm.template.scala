
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
		<a id="newPassAdmin" class="btn btn-info" >Modifier le mot de passe admin</a>
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


	adminTools(""""),_display_(Seq[Any](/*265.15*/adm)),format.raw/*265.18*/("""", """"),_display_(Seq[Any](/*265.23*/event/*265.28*/.passAdmin)),format.raw/*265.38*/("""", """"),_display_(Seq[Any](/*265.43*/routes/*265.49*/.Application.newAdmPass(event.id))),format.raw/*265.82*/("""");



































	/*Code concernant les mails et l'envoi*/

	$(function()"""),format.raw("""{"""),format.raw/*303.15*/("""

		if (bonmail($("#mailsArea").val())) """),format.raw("""{"""),format.raw/*305.40*/("""
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
			$("#envoiLien").addClass("btn-primary");
		"""),format.raw("""}"""),format.raw/*309.4*/(""" else """),format.raw("""{"""),format.raw/*309.11*/("""
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
			$("#envoiLien").removeClass("btn-primary");
		"""),format.raw("""}"""),format.raw/*313.4*/("""
	"""),format.raw("""}"""),format.raw/*314.3*/(""");

	$('#envoiLien').live('click', function(e) """),format.raw("""{"""),format.raw/*316.45*/("""
		var canSend = true;
		var tableau = $("#mailsArea").val().split(",");
		
		for (var i=0; i<tableau.length; i++) """),format.raw("""{"""),format.raw/*320.41*/("""
			
			if (($("#mailAdressContent").html()).indexOf($.trim(tableau[i])) != -1 && tableau[i] != '') """),format.raw("""{"""),format.raw/*322.97*/("""
				alert("Mail déja envoyé à " + tableau[i] + " : ENVOI ANNULÉ (à toutes les adresses)");				
				canSend = false;
				break;
			"""),format.raw("""}"""),format.raw/*326.5*/("""
		"""),format.raw("""}"""),format.raw/*327.4*/("""

		if ($(this).attr("disabled") != "disabled" && canSend == true) """),format.raw("""{"""),format.raw/*329.67*/("""
			var mailsList = $("#mailsArea").val();

			$.ajax("""),format.raw("""{"""),format.raw/*332.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*334.12*/routes/*334.18*/.Application.sendMail(event.id))),format.raw/*334.49*/("""",
				data: '"""),format.raw("""{"""),format.raw/*335.13*/(""""mailslist" : "' + mailsList + '", "textPerso" : "' + $("#mailPersoArea").val() + '""""),format.raw("""}"""),format.raw/*335.98*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*337.31*/("""
					for (var i=0; i<tableau.length; i++) """),format.raw("""{"""),format.raw/*338.44*/("""
						$("#mailAdressContent").append(tableau[i]+"<br>");
					"""),format.raw("""}"""),format.raw/*340.7*/("""
					alert("Mail(s) envoye(s) a " + mailsList);
				"""),format.raw("""}"""),format.raw/*342.6*/("""
			"""),format.raw("""}"""),format.raw/*343.5*/(""");	
		"""),format.raw("""}"""),format.raw/*344.4*/("""	
	"""),format.raw("""}"""),format.raw/*345.3*/(""");


	$("#mailsArea").live("keyup", function() """),format.raw("""{"""),format.raw/*348.44*/("""

		if (bonmail($(this).val())) """),format.raw("""{"""),format.raw/*350.32*/("""
			
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
			$("#envoiLien").addClass("btn-primary");
		"""),format.raw("""}"""),format.raw/*355.4*/(""" else """),format.raw("""{"""),format.raw/*355.11*/("""
			
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
			$("#envoiLien").removeClass("btn-primary");
		"""),format.raw("""}"""),format.raw/*360.4*/("""
	"""),format.raw("""}"""),format.raw/*361.3*/(""")
	
	function bonmail(mailtest)
	"""),format.raw("""{"""),format.raw/*364.3*/("""
		var reg = new RegExp('^([a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*365.46*/("""1"""),format.raw("""}"""),format.raw/*365.48*/("""[a-z0-9]+)*@[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*365.80*/("""1"""),format.raw("""}"""),format.raw/*365.82*/("""[a-z0-9]+)*[\.]"""),format.raw("""{"""),format.raw/*365.98*/("""1"""),format.raw("""}"""),format.raw/*365.100*/("""[a-z]"""),format.raw("""{"""),format.raw/*365.106*/("""2,6"""),format.raw("""}"""),format.raw/*365.110*/(""")"""),format.raw("""{"""),format.raw/*365.112*/("""1"""),format.raw("""}"""),format.raw/*365.114*/("""(\,( )*[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*365.140*/("""1"""),format.raw("""}"""),format.raw/*365.142*/("""[a-z0-9]+)*@[a-z0-9]+([_|\.|-]"""),format.raw("""{"""),format.raw/*365.174*/("""1"""),format.raw("""}"""),format.raw/*365.176*/("""[a-z0-9]+)*[\.]"""),format.raw("""{"""),format.raw/*365.192*/("""1"""),format.raw("""}"""),format.raw/*365.194*/("""[a-z]"""),format.raw("""{"""),format.raw/*365.200*/("""2,6"""),format.raw("""}"""),format.raw/*365.204*/(""")*$', 'i');

		if(reg.test(mailtest))
		"""),format.raw("""{"""),format.raw/*368.4*/("""
			return(true);
		"""),format.raw("""}"""),format.raw/*370.4*/("""
		else
		"""),format.raw("""{"""),format.raw/*372.4*/("""
			return(false);
		"""),format.raw("""}"""),format.raw/*374.4*/("""
	"""),format.raw("""}"""),format.raw/*375.3*/("""



























	/*Code de style*/

	$(function()"""),format.raw("""{"""),format.raw/*405.15*/("""
		$("table.datesTable td").css("background-color", color3);
		$(".checkbox").attr("disabled", "true"); 

		$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*409.37*/(""" // coloration des box checkées
		  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*410.34*/("""
		  		$(this).parent().css("background-color", "#66CC99");
		  	"""),format.raw("""}"""),format.raw/*412.7*/("""
		"""),format.raw("""}"""),format.raw/*413.4*/(""");

		$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*415.41*/("""
			$('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*417.4*/(""");

		refreshCount(); // maj de la ligne de compteurs

		affichagePopulaire(); // maj des surbrillances
	"""),format.raw("""}"""),format.raw/*422.3*/(""")

	$(".btnMailPerso").live('click', function() """),format.raw("""{"""),format.raw/*424.47*/("""
		if ($(this).siblings(".champPerso").css("display") == "none") """),format.raw("""{"""),format.raw/*425.66*/("""                
            $(this).siblings(".champPerso").removeAttr("style");
            $(this).html("<i class=\"mesicones icon-minus\"></i>")
        """),format.raw("""}"""),format.raw/*428.10*/(""" else """),format.raw("""{"""),format.raw/*428.17*/("""                
            $(this).siblings(".champPerso").attr("style", "display:none");
            $(this).html("<i class=\"mesicones icon-plus\"></i>")
        """),format.raw("""}"""),format.raw/*431.10*/("""
	"""),format.raw("""}"""),format.raw/*432.3*/(""")

	$("textarea").live('click', function(e) """),format.raw("""{"""),format.raw/*434.43*/("""
		$(this).html("");
		$(this).removeAttr("style");
	"""),format.raw("""}"""),format.raw/*437.3*/(""")

	$(".visibleAdd").live("click", function() """),format.raw("""{"""),format.raw/*439.45*/("""
        if ($(this).siblings(".champAdd").css("display") == "none") """),format.raw("""{"""),format.raw/*440.70*/("""                
            $(this).siblings(".champAdd").removeAttr("style");
            $(this).html("<i class=\"mesicones icon-minus\"></i>")
        """),format.raw("""}"""),format.raw/*443.10*/(""" else """),format.raw("""{"""),format.raw/*443.17*/("""                
            $(this).siblings(".champAdd").attr("style", "display:none");
            $(this).html("<i class=\"mesicones icon-plus\"></i>")
        """),format.raw("""}"""),format.raw/*446.10*/("""
    """),format.raw("""}"""),format.raw/*447.6*/(""")

	function refreshHoverable() """),format.raw("""{"""),format.raw/*449.31*/(""" //coloration des cases quand on passe la souris dessus
		
		$(".hoverable").on("""),format.raw("""{"""),format.raw/*451.23*/("""

			mouseenter: function () """),format.raw("""{"""),format.raw/*453.29*/("""
				$(this).css("background-color", "lightgreen");
			"""),format.raw("""}"""),format.raw/*455.5*/(""", 

			mouseleave: function () """),format.raw("""{"""),format.raw/*457.29*/("""
				if ($(this).children().is(':checked'))"""),format.raw("""{"""),format.raw/*458.44*/("""	 
			    	$(this).css("background-color", "#66CC99");
			    """),format.raw("""}"""),format.raw/*460.9*/(""" else """),format.raw("""{"""),format.raw/*460.16*/("""
			    	$(this).css("background-color", color3);
			    """),format.raw("""}"""),format.raw/*462.9*/("""
			"""),format.raw("""}"""),format.raw/*463.5*/("""
		"""),format.raw("""}"""),format.raw/*464.4*/(""");

	"""),format.raw("""}"""),format.raw/*466.3*/("""

	

	function refreshCount() """),format.raw("""{"""),format.raw/*470.27*/(""" // met à jour l'affichage du compte des participants par horaire
		$('input[type="checkbox"].horaire.checkbox').each(function(i) """),format.raw("""{"""),format.raw/*471.66*/("""
			var iden = $(this).attr('id');
			
			if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*474.32*/("""
		    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			"""),format.raw("""}"""),format.raw/*477.5*/("""
			
		"""),format.raw("""}"""),format.raw/*479.4*/(""");
			
		$('input[type="checkbox"].jour.checkbox').each(function(i) """),format.raw("""{"""),format.raw/*481.63*/("""
			var iden = $(this).attr('id');			
				
			if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*484.32*/("""
		    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			"""),format.raw("""}"""),format.raw/*487.5*/("""			
			
		"""),format.raw("""}"""),format.raw/*489.4*/(""");
	"""),format.raw("""}"""),format.raw/*490.3*/("""










	























	/*Code sur les mots de passe*/

	$( "#dialog:ui-dialog" ).dialog( "destroy" ); 
		
	
	var pass = "";
	var goodPass = "";
	var currentEditButton;
	var currentDelButton;

	$( "#dialog-question-securise" ).dialog("""),format.raw("""{"""),format.raw/*535.43*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*540.13*/("""
			"Oui": function() """),format.raw("""{"""),format.raw/*541.23*/("""				    	
			    $( "#dialog-new-pwd" ).dialog( "open" );  
			    $( this ).dialog( "close" );
			"""),format.raw("""}"""),format.raw/*544.5*/(""",
			"Non": function() """),format.raw("""{"""),format.raw/*545.23*/("""
				addPersonne($.trim($("#champ").attr("value")), "false", "");
				$( this ).dialog( "close" );
			"""),format.raw("""}"""),format.raw/*548.5*/("""				
		"""),format.raw("""}"""),format.raw/*549.4*/("""
		
	"""),format.raw("""}"""),format.raw/*551.3*/(""");
			
	
	$( "#dialog-new-pwd" ).dialog("""),format.raw("""{"""),format.raw/*554.33*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*559.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*560.22*/("""
				var bValid = true;									

				if ( bValid ) """),format.raw("""{"""),format.raw/*563.20*/("""
					mdp = $("#password-new").val();
					addPersonne($.trim($("#champ").attr("value")), "true", mdp);
					$( "#password-new" ).attr("value", "");
					$( this ).dialog( "close" );
				"""),format.raw("""}"""),format.raw/*568.6*/("""
			"""),format.raw("""}"""),format.raw/*569.5*/("""				
		"""),format.raw("""}"""),format.raw/*570.4*/("""
		
	"""),format.raw("""}"""),format.raw/*572.3*/(""");

	$( "#dialog-check-pwd" ).dialog("""),format.raw("""{"""),format.raw/*574.35*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*579.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*580.22*/("""				
								
				pass = $("#password-check").val();	
				if (pass == goodPass) """),format.raw("""{"""),format.raw/*583.28*/("""
				  	edition(currentEditButton);
				"""),format.raw("""}"""),format.raw/*585.6*/(""" else """),format.raw("""{"""),format.raw/*585.13*/("""
				  	alert("mot de passe incorrect");
				"""),format.raw("""}"""),format.raw/*587.6*/("""				
				$( "#password-check" ).attr("value", "");
				$( this ).dialog( "close" );
				
			"""),format.raw("""}"""),format.raw/*591.5*/(""",

			"Annuler": function() """),format.raw("""{"""),format.raw/*593.27*/("""							
				$( this ).dialog( "close" );				
			"""),format.raw("""}"""),format.raw/*595.5*/("""				
		"""),format.raw("""}"""),format.raw/*596.4*/("""
		
	"""),format.raw("""}"""),format.raw/*598.3*/(""");

	$( "#dialog-check-pwd-delete" ).dialog("""),format.raw("""{"""),format.raw/*600.42*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: """),format.raw("""{"""),format.raw/*605.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*606.22*/("""				
								
				pass = $("#password-check-delete").val();	
				if (pass == goodPass) """),format.raw("""{"""),format.raw/*609.28*/("""
				  	deletePersonne(currentDelButton);
				"""),format.raw("""}"""),format.raw/*611.6*/(""" else """),format.raw("""{"""),format.raw/*611.13*/("""
				  	alert("mot de passe incorrect");
				"""),format.raw("""}"""),format.raw/*613.6*/("""				
				$( "#password-check-delete" ).attr("value", "");
				$( this ).dialog( "close" );
				
			"""),format.raw("""}"""),format.raw/*617.5*/(""",

			"Annuler": function() """),format.raw("""{"""),format.raw/*619.27*/("""							
				$( this ).dialog( "close" );				
			"""),format.raw("""}"""),format.raw/*621.5*/("""				
		"""),format.raw("""}"""),format.raw/*622.4*/("""
		
	"""),format.raw("""}"""),format.raw/*624.3*/(""");



	


























	/*Code sur l'ajout*/

	function addPersonne(nomParticipant, locked, pwd)
	"""),format.raw("""{"""),format.raw/*658.3*/("""	
		$.ajax("""),format.raw("""{"""),format.raw/*659.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*661.11*/routes/*661.17*/.Application.addParticipant(new sun.misc.BASE64Encoder().encode((event.id.toString).getBytes)))),format.raw/*661.111*/("""",
			data: '"""),format.raw("""{"""),format.raw/*662.12*/(""""nom" : "' + nomParticipant + '", "locked" : "' + locked + '", "pwd" : "' + pwd + '""""),format.raw("""}"""),format.raw/*662.97*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*664.30*/("""
				var lock ="";		
				if(locked == "true")"""),format.raw("""{"""),format.raw/*666.26*/("""
					lock = "<i class=\"mesicones icon-lock\"></i>&nbsp;";
				"""),format.raw("""}"""),format.raw/*668.6*/("""  
				$("tbody").append("<tr title=\""+nomParticipant+"\" class=\"editable\" id=\""+data.idPersonne+"\"><td class=\"infoPersonne\">"+
					"<form id=\"formPersonne\">"+
					lock+
					"<a id=\"obligatoire\" class=\"obligatoirecb btn\">Facultatif</a>&nbsp;"+
					"<input id=\"nom\" type=\"text\" maxlength=\"25\" value=\""+nomParticipant+"\" name=\"nom\">&nbsp;"+	
					"<a id=\""+data.idPersonne+"\" title=\"editer le participant\" class=\"editPersonne\"><i class=\"mesicones icon-ok\"></i></a>"+
					"<a id=\""+data.idPersonne+"\" title=\"supprimer le participant\" class=\"deletePersonne\"> <i class=\"mesicones icon-trash\"></i</a>"+		  
					"</form></td>"+
					""""),_display_(Seq[Any](/*677.8*/for(jour <- event.jours) yield /*677.32*/ {_display_(Seq[Any](format.raw/*677.34*/(""""+  
					""""),_display_(Seq[Any](/*678.8*/if(jour.horaires.size() == 0)/*678.37*/{_display_(Seq[Any](format.raw/*678.38*/("""<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*678.117*/jour/*678.121*/.id)),format.raw/*678.124*/("""\" type=\"checkbox\" class=\"jour checkbox\" value=\""""),_display_(Seq[Any](/*678.178*/jour/*678.182*/.date)),format.raw/*678.187*/("""\" /></td>""")))})),format.raw/*678.198*/(""""+
					""""),_display_(Seq[Any](/*679.8*/for(horaire <- jour.horaires) yield /*679.37*/ {_display_(Seq[Any](format.raw/*679.39*/(""""+	                		
					"<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*680.86*/horaire/*680.93*/.id)),format.raw/*680.96*/("""\" type=\"checkbox\" class=\"horaire checkbox\" value=\""""),_display_(Seq[Any](/*680.153*/horaire/*680.160*/.debut)),format.raw/*680.166*/(""" - """),_display_(Seq[Any](/*680.170*/horaire/*680.177*/.fin)),format.raw/*680.181*/("""\" /></td>"+			                
					"""")))})),format.raw/*681.8*/(""""+                	                
					"""")))})),format.raw/*682.8*/("""" +
					"</tr>")
				$('#champ').attr('value', '')
				$('.titres').attr('style','');
				refreshHoverable();
				if (""""),_display_(Seq[Any](/*687.11*/adm)),format.raw/*687.14*/("""" == "1") """),format.raw("""{"""),format.raw/*687.25*/("""
					setTimeout(refreshtable, 500);				
					setTimeout(styles, 1500); 	
				"""),format.raw("""}"""),format.raw/*690.6*/("""					
			"""),format.raw("""}"""),format.raw/*691.5*/("""
			             
		"""),format.raw("""}"""),format.raw/*693.4*/(""");
	"""),format.raw("""}"""),format.raw/*694.3*/("""

	$("#ajouter").live('click', function(e)"""),format.raw("""{"""),format.raw/*696.42*/("""
		

	    var vide = "";	    
	    var nom = $("#champ").attr("value");
	    if (nom != vide) """),format.raw("""{"""),format.raw/*701.24*/("""  
	    	$( "#dialog-question-securise" ).dialog( "open" );	
	    	
						
		"""),format.raw("""}"""),format.raw/*705.4*/("""

	    	    
	"""),format.raw("""}"""),format.raw/*708.3*/(""");

	$("#champ").keypress(function(e) """),format.raw("""{"""),format.raw/*710.36*/("""
		var code = (e.keyCode ? e.keyCode : e.which);
		if(code == 13) """),format.raw("""{"""),format.raw/*712.19*/(""" //Enter keycode
			var vide = "";	    
		    var nom = $.trim($("#champ").attr("value"));
		    if (nom != vide) """),format.raw("""{"""),format.raw/*715.25*/("""  
		    	$( "#dialog-question-securise" ).dialog( "open" );	
							
			"""),format.raw("""}"""),format.raw/*718.5*/("""
			$("#champ").focus();
 		"""),format.raw("""}"""),format.raw/*720.5*/("""

	"""),format.raw("""}"""),format.raw/*722.3*/(""");































	/* Code sur le rajout d'horaires et de dates*/

	var currentDay;
	var debut = "08h";
	var fin = "17h";

	$(".horaireAdd").live("click", function()"""),format.raw("""{"""),format.raw/*760.44*/("""
		$( "#dialog-add-horaire" ).dialog("open");
		currentDay = $(this).attr("id");
		
	"""),format.raw("""}"""),format.raw/*764.3*/(""")

	$("#ajouterDate").live("click", function()"""),format.raw("""{"""),format.raw/*766.45*/("""
		//var listeJours = """"),_display_(Seq[Any](/*767.24*/for(jour <- event.jours) yield /*767.48*/ {_display_(Seq[Any](format.raw/*767.50*/(""" """),_display_(Seq[Any](/*767.52*/jour/*767.56*/.date)),format.raw/*767.61*/(""" """)))})),format.raw/*767.63*/(""" "; EST CENSÉ MARCHER????
		var listeJours = "";
		$(".jourintitule").each(function()"""),format.raw("""{"""),format.raw/*769.38*/("""
			listeJours=listeJours+$(this).html()+" "
		"""),format.raw("""}"""),format.raw/*771.4*/(""");

		
		if (listeJours.indexOf($("#datepicker").val()) != -1 ) """),format.raw("""{"""),format.raw/*774.59*/("""			
			alert("date déjà existante");
		"""),format.raw("""}"""),format.raw/*776.4*/(""" else """),format.raw("""{"""),format.raw/*776.11*/("""
			$.ajax("""),format.raw("""{"""),format.raw/*777.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*779.12*/routes/*779.18*/.Application.addDate(event.id))),format.raw/*779.48*/("""",
				data: '"""),format.raw("""{"""),format.raw/*780.13*/(""""date" : "' + $("#datepicker").val() + '""""),format.raw("""}"""),format.raw/*780.55*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*782.31*/("""

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
				"""),format.raw("""}"""),format.raw/*803.6*/("""
			"""),format.raw("""}"""),format.raw/*804.5*/(""");	
		"""),format.raw("""}"""),format.raw/*805.4*/("""
	"""),format.raw("""}"""),format.raw/*806.3*/(""");

	$( ".slider-range" ).slider("""),format.raw("""{"""),format.raw/*808.31*/("""
    	range: true,
    	min: 0,
    	max: 1440,
    	step: 15,
    	values: [ 8*60, 17*60 ],
    	slide: function( event, ui ) """),format.raw("""{"""),format.raw/*814.36*/("""
    		$( "#data" ).val(parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60)+" - " + parseInt(ui.values[ 1 ]/60) +"h"+pad2(ui.values[ 1 ]%60));

		"""),format.raw("""}"""),format.raw/*817.4*/(""", 
		change: function(event, ui) """),format.raw("""{"""),format.raw/*818.32*/("""
			debut = parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60);
			fin = parseInt(ui.values[ 1 ]/60) + "h"+pad2(ui.values[ 1 ]%60);
					
		"""),format.raw("""}"""),format.raw/*822.4*/("""
	"""),format.raw("""}"""),format.raw/*823.3*/(""");
			    	
	$( "#dialog-add-horaire" ).dialog("""),format.raw("""{"""),format.raw/*825.37*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		closeText: 'hide',
		buttons: """),format.raw("""{"""),format.raw/*831.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*832.22*/("""	
					
				$.ajax("""),format.raw("""{"""),format.raw/*834.13*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*836.13*/routes/*836.19*/.Application.newHoraire(event.id))),format.raw/*836.52*/("""",
					data: '"""),format.raw("""{"""),format.raw/*837.14*/(""""jour" : "' + currentDay + '""""),format.raw("""}"""),format.raw/*837.44*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*839.32*/("""
						
						$.ajax("""),format.raw("""{"""),format.raw/*841.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*843.15*/routes/*843.21*/.Application.dateChanged(event.id))),format.raw/*843.55*/("""",
							data: '"""),format.raw("""{"""),format.raw/*844.16*/(""""idhoraire" : "' + data.idHoraire + '",'+ 
							'"debut" : "' + debut + '",'+
							'"fin" : "' + fin + '""""),format.raw("""}"""),format.raw/*846.31*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*848.34*/("""
								
							"""),format.raw("""}"""),format.raw/*850.9*/("""               
						"""),format.raw("""}"""),format.raw/*851.8*/(""");
					"""),format.raw("""}"""),format.raw/*852.7*/("""
				"""),format.raw("""}"""),format.raw/*853.6*/(""");			

				setTimeout(refreshtable, 100);	
				
				$( this ).dialog( "close" );
				
				setTimeout(refreshtable, 500);
				
				
				setTimeout(styles, 1500);



								
			"""),format.raw("""}"""),format.raw/*867.5*/(""",

			"Annuler": function() """),format.raw("""{"""),format.raw/*869.27*/("""							
				$( this ).dialog( "close" );				
			"""),format.raw("""}"""),format.raw/*871.5*/("""				
		"""),format.raw("""}"""),format.raw/*872.4*/("""
		
	"""),format.raw("""}"""),format.raw/*874.3*/(""");

	function styles()"""),format.raw("""{"""),format.raw/*876.20*/("""
		

		$("tr").attr("style", "");
		$("table.datesTable td").css("background-color", color3);
		$(".checkbox").attr("disabled", "true"); 

		$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*883.37*/(""" // coloration des box checkées
		  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*884.34*/("""
		  		$(this).parent().css("background-color", "#66CC99");
		  	"""),format.raw("""}"""),format.raw/*886.7*/("""
		"""),format.raw("""}"""),format.raw/*887.4*/(""");

		$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*889.41*/("""
			$('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*891.4*/(""");

		refreshCount(); // maj de la ligne de compteurs

		affichagePopulaire();
	"""),format.raw("""}"""),format.raw/*896.3*/("""

	function refreshtable()"""),format.raw("""{"""),format.raw/*898.26*/("""
		$('#divtest').load('/KIND/eventEdit/"""),_display_(Seq[Any](/*899.40*/(new sun.misc.BASE64Encoder().encode((event.id.toString).getBytes)))),format.raw/*899.107*/("""/adm #divtest');
	"""),format.raw("""}"""),format.raw/*900.3*/("""

	function pad2(number) """),format.raw("""{"""),format.raw/*902.25*/("""
   
    	return (number < 10 ? '0' : '') + number
   
	"""),format.raw("""}"""),format.raw/*906.3*/("""


























	/* Code concernant la suppression d'horaires et de jours*/
	 
	$(".horaireDel").live("click", function()"""),format.raw("""{"""),format.raw/*935.44*/("""
		var thisse = $(this);
		
			
		$.ajax("""),format.raw("""{"""),format.raw/*939.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*941.11*/routes/*941.17*/.Application.deleteHoraire(event.id))),format.raw/*941.53*/("""",
			data: '"""),format.raw("""{"""),format.raw/*942.12*/(""""jour" : "' + $(this).attr("idjour") + '", "horaire" : "' + $(this).attr("id") + '""""),format.raw("""}"""),format.raw/*942.96*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*944.30*/("""
				setTimeout(refreshtable, 500);				
				setTimeout(styles, 2000);				
			"""),format.raw("""}"""),format.raw/*947.5*/(""", 
			error : function(data) """),format.raw("""{"""),format.raw/*948.28*/("""
				alert("impossible de supprimer l'horaire, vérifiez que personne n'est disponible à cet horaire-ci")
			"""),format.raw("""}"""),format.raw/*950.5*/("""
		"""),format.raw("""}"""),format.raw/*951.4*/(""");	

	"""),format.raw("""}"""),format.raw/*953.3*/(""")

	$(".jourDel").live("click", function()"""),format.raw("""{"""),format.raw/*955.41*/("""
		var thisse = $(this);
		
		
		$.ajax("""),format.raw("""{"""),format.raw/*959.11*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*961.12*/routes/*961.18*/.Application.removeDate(event.id))),format.raw/*961.51*/("""",
				data: '"""),format.raw("""{"""),format.raw/*962.13*/(""""idDate" : "' + $(this).attr("id") + '""""),format.raw("""}"""),format.raw/*962.53*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*964.31*/("""
					setTimeout(refreshtable, 500);
					setTimeout(styles, 2000);		
				"""),format.raw("""}"""),format.raw/*967.6*/(""",
				error : function(data) """),format.raw("""{"""),format.raw/*968.29*/("""
					alert("impossible de supprimer le jour, vérifiez que personne n'est disponible ce jour-ci")
				"""),format.raw("""}"""),format.raw/*970.6*/("""
			"""),format.raw("""}"""),format.raw/*971.5*/(""");				

	"""),format.raw("""}"""),format.raw/*973.3*/(""")
	



























	/*Code sur l'édition des participants*/

	$('.editPersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*1004.48*/("""
		
	    if(!$(this).parents("tr").hasClass("editable"))  """),format.raw("""{"""),format.raw/*1006.56*/("""	    	
	    	if ($(this).siblings("i").hasClass("icon-lock"))"""),format.raw("""{"""),format.raw/*1007.56*/("""
	    		currentEditButton = $(this);
	    		$.ajax("""),format.raw("""{"""),format.raw/*1009.16*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*1011.13*/routes/*1011.19*/.Application.getPass())),format.raw/*1011.41*/("""",
					data: '"""),format.raw("""{"""),format.raw/*1012.14*/(""" "idpers" : "'+$(this).parents("tr").attr("id")+'" """),format.raw("""}"""),format.raw/*1012.66*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*1014.32*/("""
						goodPass = data.pass;

						$( "#dialog-check-pwd" ).dialog( "open" );	
											  
					"""),format.raw("""}"""),format.raw/*1019.7*/("""
			   """),format.raw("""}"""),format.raw/*1020.8*/(""");			
				
			"""),format.raw("""}"""),format.raw/*1022.5*/(""" else """),format.raw("""{"""),format.raw/*1022.12*/("""
				edition($(this));
			"""),format.raw("""}"""),format.raw/*1024.5*/("""
		  
	    """),format.raw("""}"""),format.raw/*1026.7*/(""" else """),format.raw("""{"""),format.raw/*1026.14*/("""
	    	if ($.trim($(this).siblings("input").attr("value")) != "") """),format.raw("""{"""),format.raw/*1027.67*/("""
			      $(this).html("<i class=\"mesicones icon-pencil\"></i>");
			      $(this).parents("tr").removeClass("editable");
			      $(this).siblings('input[type="text"]').attr("readonly", "readonly");
			      $(this).parent().parent().parent().children("td").children('input[type="checkbox"]').attr("disabled","true"); 
			      $(this).parent().parent().parent().children("td").css("border", "none");
			      $(".hoverable").off();	      
			      $(this).parent().parent().parent().children(".checktd").attr("class", "checktd");
			      refreshHoverable();
			      editPersonne($(this).attr('id'), $(this).siblings("input").attr("value"));
			"""),format.raw("""}"""),format.raw/*1037.5*/(""" else """),format.raw("""{"""),format.raw/*1037.12*/("""
				alert("Impossible de mettre un nom vide!!");
			"""),format.raw("""}"""),format.raw/*1039.5*/("""
	    """),format.raw("""}"""),format.raw/*1040.7*/("""
	
	  
	"""),format.raw("""}"""),format.raw/*1043.3*/(""")

	function edition(elem) """),format.raw("""{"""),format.raw/*1045.26*/("""
		elem.html("<i class=\"mesicones icon-ok\"></i>");
		elem.parents("tr").addClass("editable");
		elem.siblings('input[type="text"]').removeAttr("readonly");
		elem.parent().parent().parent().children("td").children().removeAttr("disabled");
		elem.parent().parent().parent().children("td").css("border", "solid black 2px");
		$(".hoverable").off();		  
		elem.parent().parent().parent().children(".checktd").attr("class", "checktd hoverable");
		refreshHoverable();
	"""),format.raw("""}"""),format.raw/*1054.3*/("""

	function editPersonne(personneId, personneNom)
	"""),format.raw("""{"""),format.raw/*1057.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*1058.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1060.11*/routes/*1060.17*/.Application.updatePersonne(event.id))),format.raw/*1060.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1061.12*/(""""id" : "' + personneId + '", "nom" : "' + personneNom + '""""),format.raw("""}"""),format.raw/*1061.71*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1063.30*/("""
			  //alert("Participant edit\351");
			"""),format.raw("""}"""),format.raw/*1065.5*/("""
	  """),format.raw("""}"""),format.raw/*1066.5*/(""");
	"""),format.raw("""}"""),format.raw/*1067.3*/("""

	$('.checktd').live('click', function(e) """),format.raw("""{"""),format.raw/*1069.43*/("""
		if ($(this).children().prop("disabled") == false) """),format.raw("""{"""),format.raw/*1070.54*/("""
			if ($(this).children().prop("checked") == false) """),format.raw("""{"""),format.raw/*1071.54*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*1072.36*/("""
					$(this).children().prop("checked", true);
				"""),format.raw("""}"""),format.raw/*1074.6*/("""
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*1076.5*/(""" else """),format.raw("""{"""),format.raw/*1076.12*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*1077.36*/("""
					$(this).children().prop("checked", false);
				"""),format.raw("""}"""),format.raw/*1079.6*/("""        
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*1081.5*/("""

			affichagePopulaire();

			//$('.populaires').html("");
			$('.titres td').each( function() """),format.raw("""{"""),format.raw/*1086.38*/("""
				if ($(this).css('background-color') == color2) """),format.raw("""{"""),format.raw/*1087.53*/("""
					$('.populaires').append($(this).html());
				"""),format.raw("""}"""),format.raw/*1089.6*/("""				
			"""),format.raw("""}"""),format.raw/*1090.5*/(""")			
		"""),format.raw("""}"""),format.raw/*1091.4*/("""
	"""),format.raw("""}"""),format.raw/*1092.3*/(""");

	function changeCheck(box) """),format.raw("""{"""),format.raw/*1094.29*/("""   // gestion des clics sur les checkboxes
	   var idtime = box.attr('id');
	   var idParticipant = box.parent().parent().attr('id');   
	   
	   if (box.is(':checked'))"""),format.raw("""{"""),format.raw/*1098.29*/("""	 //Action de valider une horaire  		
	       		box.parent().css("background-color", "#66CC99")//vert
		   		if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*1100.57*/("""
		            var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
		       	    requeteAjaxHeure(idtime, idParticipant);
			    """),format.raw("""}"""),format.raw/*1104.9*/("""
	       		if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*1105.57*/("""	
	    	   	    var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
				    requeteAjaxJour(idtime, idParticipant);
			   """),format.raw("""}"""),format.raw/*1109.8*/("""
	   """),format.raw("""}"""),format.raw/*1110.6*/(""" else """),format.raw("""{"""),format.raw/*1110.13*/(""" //Action de dévalider une horaires
	     
		    box.parent().css("background-color", color3) //
		    if (box.attr('class').indexOf('horaire') != -1) """),format.raw("""{"""),format.raw/*1113.56*/("""
			    var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxHeure(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*1117.8*/("""
		    if (box.attr('class').indexOf('jour') != -1) """),format.raw("""{"""),format.raw/*1118.53*/("""
		        var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxJour(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*1122.8*/("""
	   """),format.raw("""}"""),format.raw/*1123.6*/("""
	"""),format.raw("""}"""),format.raw/*1124.3*/("""

	function requeteAjaxJour(idtime, idParticipant) // ajoute la date au participant
	"""),format.raw("""{"""),format.raw/*1127.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*1128.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1130.11*/routes/*1130.17*/.Application.checkBoxJour(event.id))),format.raw/*1130.52*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1131.12*/(""""idjour" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*1131.80*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1133.30*/("""
			  //alert("Jour edit\351");
			"""),format.raw("""}"""),format.raw/*1135.5*/("""
	   """),format.raw("""}"""),format.raw/*1136.6*/(""");
	"""),format.raw("""}"""),format.raw/*1137.3*/("""

	function requeteAjaxHeure(idtime, idParticipant) // ajoute l'heure au participant
	"""),format.raw("""{"""),format.raw/*1140.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*1141.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1143.11*/routes/*1143.17*/.Application.checkBoxHoraire(event.id))),format.raw/*1143.55*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1144.12*/(""""idhoraire" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*1144.83*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1146.30*/("""
			  //alert("Horaire edit\351");
			"""),format.raw("""}"""),format.raw/*1148.5*/("""
	   """),format.raw("""}"""),format.raw/*1149.6*/(""");
	"""),format.raw("""}"""),format.raw/*1150.3*/("""


























	/*Code sur la suppression de participants*/

	$('.deletePersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*1179.50*/("""
		currentDelButton = $(this);
		if ($(this).siblings("i").hasClass("icon-lock"))"""),format.raw("""{"""),format.raw/*1181.52*/("""
    		
    		$.ajax("""),format.raw("""{"""),format.raw/*1183.15*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*1185.12*/routes/*1185.18*/.Application.getPass())),format.raw/*1185.40*/("""",
				data: '"""),format.raw("""{"""),format.raw/*1186.13*/(""" "idpers" : "'+$(this).parents("tr").attr("id")+'" """),format.raw("""}"""),format.raw/*1186.65*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*1188.31*/("""
					goodPass = data.pass;

					$( "#dialog-check-pwd-delete" ).dialog( "open" );	
										  
				"""),format.raw("""}"""),format.raw/*1193.6*/("""
		   """),format.raw("""}"""),format.raw/*1194.7*/(""");			
			
		"""),format.raw("""}"""),format.raw/*1196.4*/(""" else """),format.raw("""{"""),format.raw/*1196.11*/("""   
		    deletePersonne(currentDelButton);
		"""),format.raw("""}"""),format.raw/*1198.4*/("""
	    
	"""),format.raw("""}"""),format.raw/*1200.3*/(""")

	function deletePersonne(delButton)
	"""),format.raw("""{"""),format.raw/*1203.3*/("""
		delButton.parent().parent().parent().remove();		    
	    
	    if($('td[class="infoPersonne"]').html() == null) """),format.raw("""{"""),format.raw/*1206.56*/("""
	    	$('.titres').attr('style','display:none');
	    """),format.raw("""}"""),format.raw/*1208.7*/("""

	    $('#compte').children('td[id!=""]').each(function(i) """),format.raw("""{"""),format.raw/*1210.60*/("""
	    	$(this).html("0")
	    """),format.raw("""}"""),format.raw/*1212.7*/(""");

	    refreshCount();

	    $.ajax("""),format.raw("""{"""),format.raw/*1216.14*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*1218.11*/routes/*1218.17*/.Application.deleteParticipant(event.id))),format.raw/*1218.57*/("""",
			data: '"""),format.raw("""{"""),format.raw/*1219.12*/(""""id" : "' + delButton.attr('id') + '""""),format.raw("""}"""),format.raw/*1219.50*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*1221.30*/("""
			  //alert("Participant supprim\351");
			"""),format.raw("""}"""),format.raw/*1223.5*/("""
	    """),format.raw("""}"""),format.raw/*1224.7*/(""");
	"""),format.raw("""}"""),format.raw/*1225.3*/("""


















	/*Code sur les participants obligatoires*/
	$(function()"""),format.raw("""{"""),format.raw/*1245.15*/("""
		refreshObligatoire(); 
		affichagePopulaire();
		
	"""),format.raw("""}"""),format.raw/*1249.3*/(""")	

	$(".obligatoirecb").live("click", function() """),format.raw("""{"""),format.raw/*1251.48*/(""" //click sur la checkbox "obligatoire" : mise à jour des classes sur la ligne, ajout de la propriété obligatoire dans la bdd
			
			var idParticipant = $(this).parent().parent().parent().attr("id");
			if ($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*1254.42*/("""
				$(this).html("Facultatif");
				$(this).attr("class", "obligatoirecb btn");
			"""),format.raw("""}"""),format.raw/*1257.5*/(""" else """),format.raw("""{"""),format.raw/*1257.12*/("""
				$(this).html("Obligatoire");
				$(this).attr("class", "obligatoirecb btn btn-inverse");
			"""),format.raw("""}"""),format.raw/*1260.5*/("""
			$.ajax("""),format.raw("""{"""),format.raw/*1261.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*1263.12*/routes/*1263.18*/.Application.changeObligatoire(event.id))),format.raw/*1263.58*/("""",
				data: '"""),format.raw("""{"""),format.raw/*1264.13*/(""""idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*1264.52*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*1266.31*/("""
				  affichagePopulaire();
				"""),format.raw("""}"""),format.raw/*1268.6*/("""
	   		"""),format.raw("""}"""),format.raw/*1269.8*/(""");
	   		refreshObligatoire();

		"""),format.raw("""}"""),format.raw/*1272.4*/(""")

	function checkobligatoire(idtime, type) """),format.raw("""{"""),format.raw/*1274.43*/("""//fonction qui renvoie true si tous les participants obligatoires sont présents.
		
		var ret = true;
		
		$('.obligatoire.'+type+'[id="'+idtime+'"]').each(function() """),format.raw("""{"""),format.raw/*1278.64*/("""			
			if(!($(this).is(":checked"))) """),format.raw("""{"""),format.raw/*1279.35*/("""
				
				ret = false;
			"""),format.raw("""}"""),format.raw/*1282.5*/("""
		"""),format.raw("""}"""),format.raw/*1283.4*/(""")
		return ret;
	"""),format.raw("""}"""),format.raw/*1285.3*/("""

	function refreshObligatoire() """),format.raw("""{"""),format.raw/*1287.33*/(""" // met à jour les classes "obligatoire" sur les bonnes lignes de participants
		$(".checktd").removeClass("obligatoire");
		$(".checkbox").removeClass("obligatoire");
		$(".obligatoirecb").each(function () """),format.raw("""{"""),format.raw/*1290.41*/("""
			
			if($(this).html() == "Obligatoire") """),format.raw("""{"""),format.raw/*1292.41*/("""					
				$(this).parent().parent().siblings(".checktd").addClass("obligatoire");
				$(this).parent().parent().siblings(".checktd").children().addClass("obligatoire");
			"""),format.raw("""}"""),format.raw/*1295.5*/("""

		"""),format.raw("""}"""),format.raw/*1297.4*/(""")
	"""),format.raw("""}"""),format.raw/*1298.3*/("""








	
	
	

	

	

	

	

	


	
	/*Code d'affichage des dates populaires*/
	function affichagePopulaire() """),format.raw("""{"""),format.raw/*1324.33*/("""
		var max = 0;
		$("#compte").children(".horaire, .jour").each( function() """),format.raw("""{"""),format.raw/*1326.62*/(""" // récupération de la valeur maximale dans les comptes
			$(this).css("background-color", color1) 
			$('.titres').children().css("background-color",color1);
			//$('.footer').html("");
			if (checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*1330.70*/("""			
				if ($(this).html() > max) """),format.raw("""{"""),format.raw/*1331.32*/("""			
					max = $(this).html();
				"""),format.raw("""}"""),format.raw/*1333.6*/("""
			"""),format.raw("""}"""),format.raw/*1334.5*/("""		
		"""),format.raw("""}"""),format.raw/*1335.4*/(""")
		$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*1336.45*/("""
			
			if ($(this).html() == max && $(this).html() != 0 && checkobligatoire($(this).attr("id"), $(this).attr("class"))) """),format.raw("""{"""),format.raw/*1338.118*/("""			
				$(this).css("background-color", color2);				
				$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", color2);
				if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*1341.45*/("""
					var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
					$("td:contains('"+day+"')").css("background-color", color2);
					
				"""),format.raw("""}"""),format.raw/*1345.6*/("""
			"""),format.raw("""}"""),format.raw/*1346.5*/("""
		"""),format.raw("""}"""),format.raw/*1347.4*/(""")
	"""),format.raw("""}"""),format.raw/*1348.3*/("""
	</script>

""")))})),format.raw/*1351.2*/("""
"""))}
    }
    
    def render(event:Evenement,adm:Integer) = apply(event,adm)
    
    def f:((Evenement,Integer) => play.api.templates.Html) = (event,adm) => apply(event,adm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 30 11:25:31 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/editForm.scala.html
                    HASH: 8fa79a616d08d4d803f7f8f75cb88f494acf3323
                    MATRIX: 769->1|886->54|918->78|1002->33|1030->52|1058->132|1097->137|1132->164|1171->166|1234->193|1248->198|1276->204|1361->253|1375->258|1403->264|1473->298|1487->303|1518->312|1560->318|1613->362|1653->364|1708->382|1723->387|1752->393|1787->395|1840->412|1854->417|1904->445|1947->453|1982->479|2022->481|2078->501|2092->506|2125->517|2170->531|2219->545|2240->557|2280->559|2352->595|2367->601|2423->635|2564->745|3529->1675|3550->1687|3590->1689|3799->1863|3843->1891|3882->1892|3924->1899|3933->1900|3963->1908|4005->1919|4057->1940|4170->2018|4191->2030|4230->2031|4416->2186|4635->2370|4675->2394|4715->2396|4775->2420|4788->2424|4813->2427|4874->2452|4887->2456|4925->2472|4995->2506|5008->2510|5035->2515|5083->2528|5104->2540|5143->2541|5187->2549|5200->2553|5225->2556|5367->2665|5410->2673|5431->2685|5470->2686|5514->2694|5527->2698|5552->2701|5674->2790|5764->2849|5902->2952|5942->2976|5982->2978|6026->2987|6064->3016|6103->3017|6173->3056|6219->3066|6264->3095|6304->3097|6359->3116|6375->3123|6400->3126|6446->3136|6459->3140|6484->3143|6550->3173|6566->3180|6594->3186|6634->3190|6650->3197|6676->3201|6725->3214|6746->3226|6785->3227|6829->3235|6845->3242|6870->3245|6917->3256|6930->3260|6955->3263|7090->3365|7147->3390|7187->3399|7258->3435|7312->3473|7352->3475|7405->3492|7425->3503|7451->3507|7494->3514|7514->3525|7539->3528|7628->3582|7707->3652|7747->3654|7790->3662|7821->3684|7860->3685|7942->3736|7986->3744|8023->3771|8063->3772|8178->3869|8192->3874|8232->3875|8348->3959|8444->4018|8465->4029|8492->4033|8584->4088|8605->4099|8631->4102|8777->4211|8798->4222|8824->4225|8962->4331|9016->4349|9057->4373|9098->4375|9146->4386|9185->4415|9225->4416|9275->4429|9333->4477|9374->4479|9463->4531|9477->4535|9503->4538|9607->4604|9622->4608|9651->4613|9699->4642|9713->4647|9753->4648|9843->4701|9857->4705|9883->4708|9979->4766|9994->4770|10023->4775|10084->4803|10141->4827|10195->4844|10241->4873|10282->4875|10338->4894|10402->4948|10443->4950|10532->5002|10549->5009|10575->5012|10682->5081|10700->5088|10730->5094|10772->5098|10790->5105|10818->5109|10866->5138|10880->5143|10920->5144|11010->5197|11027->5204|11053->5207|11151->5267|11169->5274|11199->5280|11241->5284|11259->5291|11287->5295|11348->5323|11398->5340|11473->5382|11524->5401|11619->5460|11663->5494|11703->5495|11758->5517|11834->5557|11875->5581|11916->5583|11961->5592|12000->5621|12040->5622|12111->5656|12125->5660|12151->5663|12221->5701|12273->5716|12319->5745|12360->5747|12438->5788|12455->5795|12481->5798|12567->5851|12604->5856|12721->5937|12743->5949|12783->5950|13183->6318|15325->8412|15516->8556|15637->8640|15663->8643|15705->8648|15720->8653|15753->8663|15795->8668|15811->8674|15867->8707|16011->8803|16100->8844|16303->9000|16358->9007|16570->9172|16620->9175|16716->9223|16880->9339|17029->9440|17208->9572|17259->9576|17375->9644|17478->9699|17545->9729|17561->9735|17615->9766|17678->9781|17811->9866|17929->9936|18021->9980|18132->10044|18233->10098|18285->10103|18339->10110|18390->10114|18486->10162|18567->10195|18774->10355|18829->10362|19045->10531|19095->10534|19176->10568|19270->10614|19320->10616|19399->10648|19449->10650|19513->10666|19564->10668|19619->10674|19672->10678|19723->10680|19774->10682|19849->10708|19900->10710|19980->10742|20031->10744|20096->10760|20147->10762|20202->10768|20255->10772|20343->10813|20411->10834|20469->10845|20538->10867|20588->10870|20698->10932|20888->11074|21001->11139|21114->11205|21165->11209|21257->11253|21342->11291|21495->11397|21592->11446|21706->11512|21912->11670|21967->11677|22182->11844|22232->11847|22325->11892|22426->11946|22521->11993|22639->12063|22843->12219|22898->12226|23111->12391|23164->12397|23245->12430|23374->12511|23452->12541|23555->12597|23635->12629|23727->12673|23837->12736|23892->12743|23997->12801|24049->12806|24100->12810|24153->12816|24232->12847|24411->12978|24529->13048|24704->13176|24759->13184|24876->13253|24998->13327|25170->13452|25228->13463|25280->13468|25576->13716|25736->13828|25807->13851|25954->13951|26026->13975|26176->14078|26231->14086|26284->14092|26373->14133|26533->14245|26603->14267|26704->14320|26939->14508|26991->14513|27046->14521|27099->14527|27185->14565|27345->14677|27415->14699|27544->14780|27632->14821|27687->14828|27780->14874|27920->14967|27997->14996|28093->15045|28148->15053|28201->15059|28294->15104|28454->15216|28524->15238|28660->15326|28754->15373|28809->15380|28902->15426|29049->15526|29126->15555|29222->15604|29277->15612|29330->15618|29487->15728|29547->15740|29612->15768|29628->15774|29746->15868|29808->15882|29941->15967|30057->16035|30151->16081|30263->16146|30972->16819|31013->16843|31054->16845|31102->16857|31141->16886|31181->16887|31298->16966|31313->16970|31340->16973|31432->17027|31447->17031|31476->17036|31521->17047|31567->17057|31613->17086|31654->17088|31798->17195|31815->17202|31841->17205|31936->17262|31954->17269|31984->17275|32026->17279|32044->17286|32072->17290|32143->17329|32218->17372|32376->17493|32402->17496|32461->17507|32587->17586|32644->17596|32712->17617|32764->17622|32855->17665|32998->17760|33123->17838|33185->17853|33272->17892|33387->17959|33550->18074|33671->18148|33747->18177|33798->18181|34028->18363|34161->18449|34256->18496|34317->18520|34358->18544|34399->18546|34438->18548|34452->18552|34480->18557|34515->18559|34649->18645|34744->18693|34857->18758|34944->18798|34999->18805|35059->18817|35126->18847|35142->18853|35195->18883|35258->18898|35348->18940|35466->19010|36359->19856|36411->19861|36465->19868|36515->19871|36597->19905|36773->20033|36973->20186|37055->20220|37250->20368|37300->20371|37396->20419|37577->20552|37647->20574|37715->20594|37784->20626|37800->20632|37856->20665|37920->20681|37998->20711|38118->20783|38188->20805|38261->20841|38277->20847|38334->20881|38400->20899|38558->21009|38682->21085|38747->21103|38817->21126|38873->21135|38926->21141|39150->21318|39227->21347|39323->21396|39378->21404|39431->21410|39502->21433|39725->21608|39838->21673|39951->21739|40002->21743|40094->21787|40179->21825|40307->21906|40382->21933|40459->21973|40550->22040|40616->22059|40690->22085|40794->22142|40975->22275|41065->22317|41130->22345|41146->22351|41205->22387|41267->22401|41399->22485|41515->22553|41640->22631|41718->22661|41874->22770|41925->22774|41979->22781|42070->22824|42159->22865|42226->22895|42242->22901|42298->22934|42361->22949|42449->22989|42567->23059|42689->23134|42767->23164|42917->23267|42969->23272|43026->23282|43195->23402|43303->23461|43414->23523|43515->23575|43585->23607|43602->23613|43648->23635|43713->23651|43814->23703|43935->23775|44083->23875|44139->23883|44202->23898|44258->23905|44333->23932|44393->23944|44449->23951|44565->24018|45263->24668|45319->24675|45421->24729|45476->24736|45533->24745|45610->24773|46127->25242|46227->25294|46288->25306|46354->25334|46371->25340|46432->25377|46495->25391|46603->25450|46720->25518|46811->25561|46864->25566|46917->25571|47010->25615|47113->25669|47216->25723|47301->25759|47402->25812|47492->25854|47548->25861|47633->25897|47735->25951|47833->26001|47979->26098|48081->26151|48181->26203|48238->26212|48294->26220|48345->26223|48426->26255|48645->26425|48852->26583|49103->26786|49209->26843|49450->27036|49504->27042|49560->27049|49761->27201|49993->27385|50095->27438|50326->27621|50380->27627|50431->27630|50565->27716|50626->27728|50692->27756|50709->27762|50768->27797|50831->27811|50948->27879|51065->27947|51149->27983|51203->27989|51256->27994|51391->28081|51452->28093|51518->28121|51535->28127|51597->28165|51660->28179|51780->28250|51897->28318|51984->28357|52038->28363|52091->28368|52262->28490|52393->28572|52464->28594|52532->28624|52549->28630|52595->28652|52659->28667|52760->28719|52879->28789|53030->28892|53085->28899|53146->28912|53202->28919|53297->28966|53354->28975|53443->29016|53609->29133|53713->29189|53823->29250|53902->29281|53990->29320|54056->29348|54073->29354|54137->29394|54200->29408|54287->29446|54404->29514|54498->29560|54553->29567|54606->29572|54732->29649|54835->29704|54935->29755|55224->29995|55357->30080|55413->30087|55559->30185|55620->30197|55688->30227|55705->30233|55769->30273|55833->30288|55921->30327|56040->30397|56122->30431|56178->30439|56261->30474|56355->30519|56572->30687|56659->30725|56734->30752|56786->30756|56852->30774|56935->30808|57192->31016|57286->31061|57507->31234|57560->31239|57612->31243|57770->31352|57896->31429|58201->31685|58285->31720|58369->31756|58422->31761|58476->31767|58571->31813|58743->31935|58998->32141|59228->32323|59281->32328|59333->32332|59385->32336|59432->32350
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|39->10|39->10|39->10|42->13|42->13|42->13|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|43->14|44->15|44->15|44->15|46->17|46->17|46->17|47->18|47->18|47->18|48->19|51->22|51->22|51->22|52->23|52->23|52->23|54->25|73->44|73->44|73->44|79->50|79->50|79->50|80->51|80->51|80->51|81->52|84->55|90->61|90->61|90->61|93->64|99->70|99->70|99->70|100->71|100->71|100->71|100->71|100->71|100->71|101->72|101->72|101->72|102->73|102->73|102->73|102->73|102->73|102->73|102->73|103->74|103->74|103->74|103->74|103->74|103->74|103->74|105->76|108->79|108->79|108->79|109->80|109->80|109->80|111->82|112->83|112->83|112->83|113->84|113->84|113->84|113->84|113->84|113->84|114->85|114->85|114->85|114->85|114->85|114->85|115->86|115->86|115->86|115->86|115->86|115->86|115->86|115->86|115->86|115->86|117->88|119->90|123->94|123->94|123->94|124->95|124->95|124->95|124->95|124->95|124->95|125->96|125->96|125->96|126->97|126->97|126->97|128->99|129->100|129->100|129->100|131->102|131->102|131->102|133->104|135->106|135->106|135->106|136->107|136->107|136->107|137->108|137->108|137->108|138->109|140->111|140->111|140->111|141->112|141->112|141->112|142->113|142->113|142->113|143->114|143->114|143->114|143->114|143->114|143->114|144->115|144->115|144->115|145->116|145->116|145->116|145->116|145->116|145->116|146->117|148->119|149->120|149->120|149->120|150->121|150->121|150->121|151->122|151->122|151->122|151->122|151->122|151->122|151->122|151->122|151->122|152->123|152->123|152->123|153->124|153->124|153->124|153->124|153->124|153->124|153->124|153->124|153->124|154->125|155->126|156->127|158->129|162->133|162->133|162->133|162->133|164->135|164->135|164->135|165->136|165->136|165->136|166->137|166->137|166->137|167->138|168->139|168->139|168->139|169->140|169->140|169->140|170->141|171->142|185->156|185->156|185->156|195->166|270->241|275->246|294->265|294->265|294->265|294->265|294->265|294->265|294->265|294->265|332->303|334->305|338->309|338->309|342->313|343->314|345->316|349->320|351->322|355->326|356->327|358->329|361->332|363->334|363->334|363->334|364->335|364->335|366->337|367->338|369->340|371->342|372->343|373->344|374->345|377->348|379->350|384->355|384->355|389->360|390->361|393->364|394->365|394->365|394->365|394->365|394->365|394->365|394->365|394->365|394->365|394->365|394->365|394->365|394->365|394->365|394->365|394->365|394->365|394->365|397->368|399->370|401->372|403->374|404->375|434->405|438->409|439->410|441->412|442->413|444->415|446->417|451->422|453->424|454->425|457->428|457->428|460->431|461->432|463->434|466->437|468->439|469->440|472->443|472->443|475->446|476->447|478->449|480->451|482->453|484->455|486->457|487->458|489->460|489->460|491->462|492->463|493->464|495->466|499->470|500->471|503->474|506->477|508->479|510->481|513->484|516->487|518->489|519->490|564->535|569->540|570->541|573->544|574->545|577->548|578->549|580->551|583->554|588->559|589->560|592->563|597->568|598->569|599->570|601->572|603->574|608->579|609->580|612->583|614->585|614->585|616->587|620->591|622->593|624->595|625->596|627->598|629->600|634->605|635->606|638->609|640->611|640->611|642->613|646->617|648->619|650->621|651->622|653->624|687->658|688->659|690->661|690->661|690->661|691->662|691->662|693->664|695->666|697->668|706->677|706->677|706->677|707->678|707->678|707->678|707->678|707->678|707->678|707->678|707->678|707->678|707->678|708->679|708->679|708->679|709->680|709->680|709->680|709->680|709->680|709->680|709->680|709->680|709->680|710->681|711->682|716->687|716->687|716->687|719->690|720->691|722->693|723->694|725->696|730->701|734->705|737->708|739->710|741->712|744->715|747->718|749->720|751->722|789->760|793->764|795->766|796->767|796->767|796->767|796->767|796->767|796->767|796->767|798->769|800->771|803->774|805->776|805->776|806->777|808->779|808->779|808->779|809->780|809->780|811->782|832->803|833->804|834->805|835->806|837->808|843->814|846->817|847->818|851->822|852->823|854->825|860->831|861->832|863->834|865->836|865->836|865->836|866->837|866->837|868->839|870->841|872->843|872->843|872->843|873->844|875->846|877->848|879->850|880->851|881->852|882->853|896->867|898->869|900->871|901->872|903->874|905->876|912->883|913->884|915->886|916->887|918->889|920->891|925->896|927->898|928->899|928->899|929->900|931->902|935->906|964->935|968->939|970->941|970->941|970->941|971->942|971->942|973->944|976->947|977->948|979->950|980->951|982->953|984->955|988->959|990->961|990->961|990->961|991->962|991->962|993->964|996->967|997->968|999->970|1000->971|1002->973|1033->1004|1035->1006|1036->1007|1038->1009|1040->1011|1040->1011|1040->1011|1041->1012|1041->1012|1043->1014|1048->1019|1049->1020|1051->1022|1051->1022|1053->1024|1055->1026|1055->1026|1056->1027|1066->1037|1066->1037|1068->1039|1069->1040|1072->1043|1074->1045|1083->1054|1086->1057|1087->1058|1089->1060|1089->1060|1089->1060|1090->1061|1090->1061|1092->1063|1094->1065|1095->1066|1096->1067|1098->1069|1099->1070|1100->1071|1101->1072|1103->1074|1105->1076|1105->1076|1106->1077|1108->1079|1110->1081|1115->1086|1116->1087|1118->1089|1119->1090|1120->1091|1121->1092|1123->1094|1127->1098|1129->1100|1133->1104|1134->1105|1138->1109|1139->1110|1139->1110|1142->1113|1146->1117|1147->1118|1151->1122|1152->1123|1153->1124|1156->1127|1157->1128|1159->1130|1159->1130|1159->1130|1160->1131|1160->1131|1162->1133|1164->1135|1165->1136|1166->1137|1169->1140|1170->1141|1172->1143|1172->1143|1172->1143|1173->1144|1173->1144|1175->1146|1177->1148|1178->1149|1179->1150|1208->1179|1210->1181|1212->1183|1214->1185|1214->1185|1214->1185|1215->1186|1215->1186|1217->1188|1222->1193|1223->1194|1225->1196|1225->1196|1227->1198|1229->1200|1232->1203|1235->1206|1237->1208|1239->1210|1241->1212|1245->1216|1247->1218|1247->1218|1247->1218|1248->1219|1248->1219|1250->1221|1252->1223|1253->1224|1254->1225|1274->1245|1278->1249|1280->1251|1283->1254|1286->1257|1286->1257|1289->1260|1290->1261|1292->1263|1292->1263|1292->1263|1293->1264|1293->1264|1295->1266|1297->1268|1298->1269|1301->1272|1303->1274|1307->1278|1308->1279|1311->1282|1312->1283|1314->1285|1316->1287|1319->1290|1321->1292|1324->1295|1326->1297|1327->1298|1353->1324|1355->1326|1359->1330|1360->1331|1362->1333|1363->1334|1364->1335|1365->1336|1367->1338|1370->1341|1374->1345|1375->1346|1376->1347|1377->1348|1380->1351
                    -- GENERATED --
                */
            