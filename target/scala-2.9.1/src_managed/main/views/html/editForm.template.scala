
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

	<div class="container">
		<div class="content">	

			<h1>Participants pour: """),_display_(Seq[Any](/*13.28*/event/*13.33*/.titre)),format.raw/*13.39*/("""</h1>

			
			Titre de l'&eacute;venement : <b>"""),_display_(Seq[Any](/*16.38*/event/*16.43*/.titre)),format.raw/*16.49*/("""</b> <br/>
			Cr&eacute;ateur : <b>"""),_display_(Seq[Any](/*17.26*/event/*17.31*/.createur)),format.raw/*17.40*/("""</b> """),_display_(Seq[Any](/*17.46*/if(event.email != "" && event.email != null)/*17.90*/ {_display_(Seq[Any](format.raw/*17.92*/("""   <br>Contact : """),_display_(Seq[Any](/*17.110*/event/*17.115*/.email)),format.raw/*17.121*/(""" """)))})),format.raw/*17.123*/("""<br/>
			Cree le: """),_display_(Seq[Any](/*18.14*/event/*18.19*/.dateCreation.toLocaleString)),format.raw/*18.47*/("""<br>

			"""),_display_(Seq[Any](/*20.5*/if(event.descriptif != "")/*20.31*/ {_display_(Seq[Any](format.raw/*20.33*/("""
			Description : <i>"""),_display_(Seq[Any](/*21.22*/event/*21.27*/.descriptif)),format.raw/*21.38*/("""</i> <br/>	
			""")))})),format.raw/*22.5*/("""			
			<br>
			
			"""),_display_(Seq[Any](/*25.5*/if(adm == 1)/*25.17*/ {_display_(Seq[Any](format.raw/*25.19*/("""
				<a class="btn btn-danger" href=""""),_display_(Seq[Any](/*26.38*/routes/*26.44*/.Application.deleteEvent(event.id))),format.raw/*26.78*/("""">Supprimer l'evenement</a>
				
			""")))})),format.raw/*28.5*/("""

			
			<br><br>
			
				<h3>Liste des participants et de leurs disponibilités</h3>

			"""),_display_(Seq[Any](/*35.5*/if(adm != 1)/*35.17*/{_display_(Seq[Any](format.raw/*35.18*/("""
				<p>
					S'ajouter à la liste des participants :		  
					<input id="champ" type="text" maxlength="25" value="">&nbsp;<a id="ajouter" class="btn">Ajouter</a><br>
				</p>
			""")))})),format.raw/*40.5*/("""	
			

			"""),_display_(Seq[Any](/*43.5*/if(adm == 1)/*43.17*/{_display_(Seq[Any](format.raw/*43.18*/("""			
			
			<div class="champAdd" >	
				<p>	
					Ajouter un participant :		  
					<input id="champ" type="text" size="25" value="">&nbsp;<a id="ajouter" class="btn">Ajouter</a><br><br>

					Ajouter une date:
					<input id="datepicker" type="text">&nbsp;<a id="ajouterDate" class="btn">Ajouter</a>
					<input id="hidden" type="hidden">
				</p>
			</div>
			""")))})),format.raw/*55.5*/("""


			<div id="divtest" >
			<table class="datesTable" cellspacing="5" cellpadding="5">
				<tbody>
					<tr class="titres dates" style="display:none"><td style="visibility:hidden"></td>
						"""),_display_(Seq[Any](/*62.8*/for(jour <- event.jours) yield /*62.32*/ {_display_(Seq[Any](format.raw/*62.34*/("""  					  
							<td id=""""),_display_(Seq[Any](/*63.17*/jour/*63.21*/.id)),format.raw/*63.24*/("""" class="jour" colspan=""""),_display_(Seq[Any](/*63.49*/jour/*63.53*/.horaires.size())),format.raw/*63.69*/("""">
								<b class="jourintitule">"""),_display_(Seq[Any](/*64.34*/jour/*64.38*/.getFRFormat)),format.raw/*64.50*/(""" </b>
								"""),_display_(Seq[Any](/*65.10*/if(adm == 1)/*65.22*/{_display_(Seq[Any](format.raw/*65.23*/("""<a id=""""),_display_(Seq[Any](/*65.31*/jour/*65.35*/.id)),format.raw/*65.38*/("""" class="horaireAdd" title="Ajouter une plage horaire à cette date" ><i class="mesicones icon-plus"></i></a>""")))})),format.raw/*65.147*/("""
								"""),_display_(Seq[Any](/*66.10*/if(adm == 1)/*66.22*/{_display_(Seq[Any](format.raw/*66.23*/("""<a id=""""),_display_(Seq[Any](/*66.31*/jour/*66.35*/.id)),format.raw/*66.38*/("""" class="jourDel" title="Supprimer cette date"><i class="mesicones icon-trash"></i></a>""")))})),format.raw/*66.126*/("""
							</td>	                        	                
						""")))})),format.raw/*68.8*/("""
					</tr>
					<tr class="titres horaires" style="display:none"><td style="visibility:hidden"></td>
						"""),_display_(Seq[Any](/*71.8*/for(jour <- event.jours) yield /*71.32*/ {_display_(Seq[Any](format.raw/*71.34*/("""  
							"""),_display_(Seq[Any](/*72.9*/if(jour.horaires.size() == 0)/*72.38*/{_display_(Seq[Any](format.raw/*72.39*/("""
							    <td class="jour"></td>
							""")))})),format.raw/*74.9*/("""
						    """),_display_(Seq[Any](/*75.12*/for(horaire <- jour.horaires) yield /*75.41*/ {_display_(Seq[Any](format.raw/*75.43*/("""
						    	<td id=""""),_display_(Seq[Any](/*76.21*/horaire/*76.28*/.id)),format.raw/*76.31*/("""" style="font-size: 0.85em" dayid=""""),_display_(Seq[Any](/*76.67*/jour/*76.71*/.id)),format.raw/*76.74*/("""" class="horaire">
						    		"""),_display_(Seq[Any](/*77.14*/horaire/*77.21*/.debut)),format.raw/*77.27*/(""" - """),_display_(Seq[Any](/*77.31*/horaire/*77.38*/.fin)),format.raw/*77.42*/(""" 
						    		"""),_display_(Seq[Any](/*78.14*/if(adm == 1)/*78.26*/{_display_(Seq[Any](format.raw/*78.27*/("""<a id=""""),_display_(Seq[Any](/*78.35*/horaire/*78.42*/.id)),format.raw/*78.45*/("""" idjour=""""),_display_(Seq[Any](/*78.56*/jour/*78.60*/.id)),format.raw/*78.63*/("""" class="horaireDel" title="Supprimer cette plage horaire" ><i class="mesicones icon-trash"></i></a>""")))})),format.raw/*78.164*/("""
						    	</td>
						    """)))})),format.raw/*80.12*/("""  

						""")))})),format.raw/*82.8*/("""
					</tr>
					              
					
					"""),_display_(Seq[Any](/*86.7*/for(participant <- event.participants) yield /*86.45*/ {_display_(Seq[Any](format.raw/*86.47*/("""
						<tr title=""""),_display_(Seq[Any](/*87.19*/participant/*87.30*/.nom)),format.raw/*87.34*/("""" id=""""),_display_(Seq[Any](/*87.41*/participant/*87.52*/.id)),format.raw/*87.55*/("""" class="participant"><td class="infoPersonne">
							"""),_display_(Seq[Any](/*88.9*/form(routes.Application.updatePersonne(event.id), 'id->"formPersonne")/*88.79*/ {_display_(Seq[Any](format.raw/*88.81*/("""
								"""),_display_(Seq[Any](/*89.10*/if(participant.locked)/*89.32*/{_display_(Seq[Any](format.raw/*89.33*/("""
									<i class="mesicones icon-lock"></i>
								""")))}/*91.11*/else/*91.16*/{_display_(Seq[Any](format.raw/*91.17*/("""
									&nbsp;&nbsp;&nbsp;&nbsp;
								""")))})),format.raw/*93.10*/("""
								

								<input id="nom" maxlength="25" type="text" value=""""),_display_(Seq[Any](/*96.60*/participant/*96.71*/.nom)),format.raw/*96.75*/("""" name="nom" readonly="readonly">							
								<a id=""""),_display_(Seq[Any](/*97.17*/participant/*97.28*/.id)),format.raw/*97.31*/("""" title="Editer le participant" class="editPersonne"><i class="mesicones icon-pencil"></i></a>
								<a id=""""),_display_(Seq[Any](/*98.17*/participant/*98.28*/.id)),format.raw/*98.31*/("""" title="Supprimer le participant" class="deletePersonne"> <i class="mesicones icon-trash"></i></a>
								
								"""),_display_(Seq[Any](/*100.10*/if(participant.obligatoire)/*100.37*/{_display_(Seq[Any](format.raw/*100.38*/("""
									<a id=""""),_display_(Seq[Any](/*101.18*/participant/*101.29*/.id)),format.raw/*101.32*/("""" title="Participation à l'évènement obligatoire" class="obligatoirecb obligatoire"><i class="mesicones icon-star"></i></a>
								""")))}/*102.11*/else/*102.16*/{_display_(Seq[Any](format.raw/*102.17*/("""
									<a id=""""),_display_(Seq[Any](/*103.18*/participant/*103.29*/.id)),format.raw/*103.32*/("""" title="Participation à l'évènement facultative" class="obligatoirecb"><i class="mesicones icon-star-empty"></i></a>
								""")))})),format.raw/*104.10*/("""
							""")))})),format.raw/*105.9*/("""</td>
							
							"""),_display_(Seq[Any](/*107.9*/for(jour <- event.jours) yield /*107.33*/ {_display_(Seq[Any](format.raw/*107.35*/("""
							    """),_display_(Seq[Any](/*108.13*/if(jour.horaires.size() == 0)/*108.42*/{_display_(Seq[Any](format.raw/*108.43*/("""
							      """),_display_(Seq[Any](/*109.15*/if(participant.inscriptionsJours.contains(jour))/*109.63*/ {_display_(Seq[Any](format.raw/*109.65*/("""
					                <td class="checktd"><input id=""""),_display_(Seq[Any](/*110.54*/jour/*110.58*/.id)),format.raw/*110.61*/("""" type="checkbox"  disabled checked class="jour checkbox" value=""""),_display_(Seq[Any](/*110.127*/jour/*110.131*/.getFRFormat)),format.raw/*110.143*/("""" /></td>
					              """)))}/*111.22*/else/*111.27*/{_display_(Seq[Any](format.raw/*111.28*/("""
					                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*112.55*/jour/*112.59*/.id)),format.raw/*112.62*/("""" type="checkbox"  disabled class="jour checkbox" value=""""),_display_(Seq[Any](/*112.120*/jour/*112.124*/.getFRFormat)),format.raw/*112.136*/("""" /></td>
					              """)))})),format.raw/*113.21*/("""
							       
							    """)))})),format.raw/*115.13*/("""
					            """),_display_(Seq[Any](/*116.19*/for(horaire <- jour.horaires) yield /*116.48*/ {_display_(Seq[Any](format.raw/*116.50*/("""
					              """),_display_(Seq[Any](/*117.21*/if(participant.inscriptionsHoraires.contains(horaire))/*117.75*/ {_display_(Seq[Any](format.raw/*117.77*/("""
					                <td class="checktd"><input id=""""),_display_(Seq[Any](/*118.54*/horaire/*118.61*/.id)),format.raw/*118.64*/("""" type="checkbox" disabled class="horaire checkbox"  checked value=""""),_display_(Seq[Any](/*118.133*/horaire/*118.140*/.debut)),format.raw/*118.146*/(""" - """),_display_(Seq[Any](/*118.150*/horaire/*118.157*/.fin)),format.raw/*118.161*/("""" /></td>
					              """)))}/*119.22*/else/*119.27*/{_display_(Seq[Any](format.raw/*119.28*/("""
					                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*120.55*/horaire/*120.62*/.id)),format.raw/*120.65*/("""" type="checkbox" disabled class="horaire checkbox" value=""""),_display_(Seq[Any](/*120.125*/horaire/*120.132*/.debut)),format.raw/*120.138*/(""" - """),_display_(Seq[Any](/*120.142*/horaire/*120.149*/.fin)),format.raw/*120.153*/("""" /></td>
					              """)))})),format.raw/*121.21*/("""
					            """)))})),format.raw/*122.19*/("""            	                
					        """)))})),format.raw/*123.15*/("""				
						</tr>
					""")))})),format.raw/*125.7*/("""
				</tbody>
				<tfoot>
				<tr id="compte" class="titres"
				 """),_display_(Seq[Any](/*129.7*/if(event.participants.size() == 0)/*129.41*/{_display_(Seq[Any](format.raw/*129.42*/(""" style="display:none"""")))})),format.raw/*129.64*/(""">
					<td id=""><b>Compte: </b></td>
					"""),_display_(Seq[Any](/*131.7*/for(jour <- event.jours) yield /*131.31*/ {_display_(Seq[Any](format.raw/*131.33*/("""
					    """),_display_(Seq[Any](/*132.11*/if(jour.horaires.size() == 0)/*132.40*/{_display_(Seq[Any](format.raw/*132.41*/("""		     
			                <td id=""""),_display_(Seq[Any](/*133.29*/jour/*133.33*/.id)),format.raw/*133.36*/("""" class="jour">0</td>	       
					    """)))})),format.raw/*134.11*/("""
			            """),_display_(Seq[Any](/*135.17*/for(horaire <- jour.horaires) yield /*135.46*/ {_display_(Seq[Any](format.raw/*135.48*/("""              
			                <td id=""""),_display_(Seq[Any](/*136.29*/horaire/*136.36*/.id)),format.raw/*136.39*/("""" class="horaire">0</td>              
			            """)))})),format.raw/*137.17*/("""
					""")))})),format.raw/*138.7*/("""
				</tr>
				
					
				</tfoot>
				
			</table>
			</div>

			
			
			<div class="legende" style="display:none">
				<i class="mesicones icon-pencil"></i> : Déverrouiller l'édition (modifier le nom et les disponibilités).<br>
				<i class="mesicones icon-ok"></i> : Verrouiller l'édition.<br>
				<i class="mesicones icon-trash"></i> : Supprimer le participant.<br>
				<i class="mesicones icon-star"></i> : Présence obligatoire. Cliquez pour rendre facultatif.<br>
				<i class="mesicones icon-star-empty"></i> : Présence facultative. Cliquez pour rendre obligatoire.<br>
			</div>

			


			

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

						
			<br><br>
			<div  id="mailList" class="selectDate" style=""""),_display_(Seq[Any](/*179.51*/if(adm != 1)/*179.63*/ {_display_(Seq[Any](format.raw/*179.65*/("""display:none;""")))})),format.raw/*179.79*/(""" position:right;  width:500px">
				<h5 """),_display_(Seq[Any](/*180.10*/if(adm != 1)/*180.22*/ {_display_(Seq[Any](format.raw/*180.24*/("""style="display:none"""")))})),format.raw/*180.45*/(""">Liste des mails invités</h5>
				<br>
				<p """),_display_(Seq[Any](/*182.9*/if(adm != 1)/*182.21*/ {_display_(Seq[Any](format.raw/*182.23*/("""style="display:none"""")))})),format.raw/*182.44*/(""" id="mailAdressContent">				
					"""),_display_(Seq[Any](/*183.7*/for(l <- event.mailSentList) yield /*183.35*/{_display_(Seq[Any](format.raw/*183.36*/("""
						<a href="mailto:"""),_display_(Seq[Any](/*184.24*/l/*184.25*/.adresse)),format.raw/*184.33*/("""?subject=KIND:Invitation&body=http://intranet2:9000/KIND/eventEdit/"""),_display_(Seq[Any](/*184.101*/(new sun.misc.BASE64Encoder().encode((event.id.toString).getBytes)))),format.raw/*184.168*/("""/consult">"""),_display_(Seq[Any](/*184.179*/l/*184.180*/.adresse)),format.raw/*184.188*/(""" </a> <br>
					""")))})),format.raw/*185.7*/(""" 
				</p>
			</div>
			
			

			
			<div id="dialog-add-horaire" title="Sélectionnez l'horaire">	
				<div id="slider">
					<input type="text" id="data" value="8h - 17h" style="border:0; color:#f6931f; font-weight:bold;" />		

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
		</div>
	</div>

	

	

	

	<script type="text/javascript" charset="utf-8">
	
		var color1 = "#FFFF99";
		var color2 = "gold";
		var color3 = "steelblue";
		var mdp = "";	

		$("#ajouter").popover("""),format.raw("""{"""),format.raw/*252.26*/("""title: 'Ajouter un participant', content: "Remplissez le champ à gauche de ce bouton avec le nom du participant.""""),format.raw("""}"""),format.raw/*252.140*/(""");

    	$("#ajouterDate").popover("""),format.raw("""{"""),format.raw/*254.33*/("""title: 'Ajouter une date', content: "Sélectionnez une date dans le champ à gauche de ce bouton.""""),format.raw("""}"""),format.raw/*254.130*/(""");

    	$(".horaireAdd").popover("""),format.raw("""{"""),format.raw/*256.32*/("""title: 'Ajouter une plage horaire', content: "Ajouter une plage horaire à la date concernée.""""),format.raw("""}"""),format.raw/*256.126*/(""");

		function refreshtable()"""),format.raw("""{"""),format.raw/*258.27*/("""
			$('#divtest').load('/KIND/eventEdit/"""),_display_(Seq[Any](/*259.41*/(new sun.misc.BASE64Encoder().encode((event.id.toString).getBytes)))),format.raw/*259.108*/("""/consult/"""),_display_(Seq[Any](/*259.118*/(new sun.misc.BASE64Encoder().encode((event.email).getBytes)))),format.raw/*259.179*/("""/adm #divtest', function(responseText, textStatus, XMLHttpRequest) """),format.raw("""{"""),format.raw/*259.247*/("""styles();$("body").append(responseText);"""),format.raw("""}"""),format.raw/*259.288*/(""");
		"""),format.raw("""}"""),format.raw/*260.4*/("""

		$(function()"""),format.raw("""{"""),format.raw/*262.16*/("""
			$("table.datesTable td").css("background-color", color3);
			$(".checkbox").attr("disabled", "true"); 

			$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*266.38*/(""" // coloration des box checkées
			  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*267.35*/("""
			  		$(this).parent().css("background-color", "#66CC99");
			  	"""),format.raw("""}"""),format.raw/*269.8*/("""
			"""),format.raw("""}"""),format.raw/*270.5*/(""");

			$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*272.42*/("""
				$('.titres').attr('style','');
				$('.legende').attr('style','');
			"""),format.raw("""}"""),format.raw/*275.5*/(""");

			refreshCount(); // maj de la ligne de compteurs
			refreshObligatoire(); // maj  des classes "obligatoire" sur les checkboxes
			affichagePopulaire(); // maj des surbrillances
		"""),format.raw("""}"""),format.raw/*280.4*/(""")


		
		/*Code concernant l'interface administrateur visible sur adminTools.js*/

		adminTools(""""),_display_(Seq[Any](/*286.16*/adm)),format.raw/*286.19*/("""");




		/*Code concernant les mails et l'envoi
		* A trouver dans le fichier sendMail.js*/

		Mails(""""),_display_(Seq[Any](/*294.11*/routes/*294.17*/.Application.sendMail(event.id))),format.raw/*294.48*/("""");




		/*Code sur l'ajout
		* complet sur ajoutPersonne.js*/

		AjoutParticipant(""""),_display_(Seq[Any](/*302.22*/routes/*302.28*/.Application.addParticipant(new sun.misc.BASE64Encoder().encode((event.id.toString).getBytes)))),format.raw/*302.122*/("""", """"),_display_(Seq[Any](/*302.127*/adm)),format.raw/*302.130*/("""");




		/* Code sur le rajout d'horaires et de dates
		* a trouver sur ajoutDateHeure.js*/

		ajoutDateHoraire(""""),_display_(Seq[Any](/*310.22*/routes/*310.28*/.Application.addDate(event.id))),format.raw/*310.58*/("""", """"),_display_(Seq[Any](/*310.63*/routes/*310.69*/.Application.newHoraire(event.id))),format.raw/*310.102*/("""", """"),_display_(Seq[Any](/*310.107*/routes/*310.113*/.Application.dateChanged(event.id))),format.raw/*310.147*/("""");


		/* Code concernant la suppression d'horaires et de jours*/
		 
		supprDateHoraire(""""),_display_(Seq[Any](/*315.22*/routes/*315.28*/.Application.deleteHoraire(event.id))),format.raw/*315.64*/("""", """"),_display_(Seq[Any](/*315.69*/routes/*315.75*/.Application.removeDate(event.id))),format.raw/*315.108*/("""");
		

		/*Code sur l'édition des participants
		* A trouver dans le fichier edition.js*/

		editFunctions(""""),_display_(Seq[Any](/*321.19*/routes/*321.25*/.Application.getPass())),format.raw/*321.47*/("""", """"),_display_(Seq[Any](/*321.52*/routes/*321.58*/.Application.updatePersonne(event.id))),format.raw/*321.95*/("""", """"),_display_(Seq[Any](/*321.100*/routes/*321.106*/.Application.checkBoxJour(event.id))),format.raw/*321.141*/("""", """"),_display_(Seq[Any](/*321.146*/routes/*321.152*/.Application.checkBoxHoraire(event.id))),format.raw/*321.190*/("""");



		/*Code sur la suppression de participants
		* A trouver dans le fichier suppression.js*/

		Delete(""""),_display_(Seq[Any](/*328.12*/routes/*328.18*/.Application.getPass())),format.raw/*328.40*/("""", """"),_display_(Seq[Any](/*328.45*/routes/*328.51*/.Application.deleteParticipant(event.id))),format.raw/*328.91*/("""")



		/*Code sur les participants obligatoires*/
		partobligatoire(""""),_display_(Seq[Any](/*333.21*/routes/*333.27*/.Application.changeObligatoire(event.id))),format.raw/*333.67*/("""");
	
	
	</script>

""")))})),format.raw/*338.2*/("""
"""))}
    }
    
    def render(event:Evenement,adm:Integer) = apply(event,adm)
    
    def f:((Evenement,Integer) => play.api.templates.Html) = (event,adm) => apply(event,adm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Aug 10 09:29:24 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/editForm.scala.html
                    HASH: f74ec06deee4e47af1ff56956ccb5515f8aace4c
                    MATRIX: 769->1|886->54|918->78|1002->33|1030->52|1058->132|1097->137|1132->164|1171->166|1287->246|1301->251|1329->257|1413->305|1427->310|1455->316|1527->352|1541->357|1572->366|1614->372|1667->416|1707->418|1762->436|1777->441|1806->447|1841->449|1896->468|1910->473|1960->501|2005->511|2040->537|2080->539|2138->561|2152->566|2185->577|2232->593|2287->613|2308->625|2348->627|2422->665|2437->671|2493->705|2561->742|2686->832|2707->844|2746->845|2957->1025|3003->1036|3024->1048|3063->1049|3457->1412|3686->1606|3726->1630|3766->1632|3828->1658|3841->1662|3866->1665|3927->1690|3940->1694|3978->1710|4050->1746|4063->1750|4097->1762|4148->1777|4169->1789|4208->1790|4252->1798|4265->1802|4290->1805|4432->1914|4478->1924|4499->1936|4538->1937|4582->1945|4595->1949|4620->1952|4741->2040|4835->2103|4979->2212|5019->2236|5059->2238|5105->2249|5143->2278|5182->2279|5256->2322|5304->2334|5349->2363|5389->2365|5446->2386|5462->2393|5487->2396|5559->2432|5572->2436|5597->2439|5665->2471|5681->2478|5709->2484|5749->2488|5765->2495|5791->2499|5842->2514|5863->2526|5902->2527|5946->2535|5962->2542|5987->2545|6034->2556|6047->2560|6072->2563|6206->2664|6267->2693|6309->2704|6388->2748|6442->2786|6482->2788|6537->2807|6557->2818|6583->2822|6626->2829|6646->2840|6671->2843|6762->2899|6841->2969|6881->2971|6927->2981|6958->3003|6997->3004|7071->3060|7084->3065|7123->3066|7199->3110|7305->3180|7325->3191|7351->3195|7444->3252|7464->3263|7489->3266|7636->3377|7656->3388|7681->3391|7836->3509|7873->3536|7913->3537|7968->3555|7989->3566|8015->3569|8168->3703|8182->3708|8222->3709|8277->3727|8298->3738|8324->3741|8484->3868|8525->3877|8583->3899|8624->3923|8665->3925|8715->3938|8754->3967|8794->3968|8846->3983|8904->4031|8945->4033|9036->4087|9050->4091|9076->4094|9180->4160|9195->4164|9231->4176|9281->4207|9295->4212|9335->4213|9427->4268|9441->4272|9467->4275|9563->4333|9578->4337|9614->4349|9677->4379|9738->4407|9794->4426|9840->4455|9881->4457|9939->4478|10003->4532|10044->4534|10135->4588|10152->4595|10178->4598|10285->4667|10303->4674|10333->4680|10375->4684|10393->4691|10421->4695|10471->4726|10485->4731|10525->4732|10617->4787|10634->4794|10660->4797|10758->4857|10776->4864|10806->4870|10848->4874|10866->4881|10894->4885|10957->4915|11009->4934|11086->4978|11141->5001|11244->5068|11288->5102|11328->5103|11383->5125|11463->5169|11504->5193|11545->5195|11593->5206|11632->5235|11672->5236|11745->5272|11759->5276|11785->5279|11858->5319|11912->5336|11958->5365|11999->5367|12079->5410|12096->5417|12122->5420|12210->5475|12249->5482|13905->7101|13927->7113|13968->7115|14015->7129|14093->7170|14115->7182|14156->7184|14210->7205|14293->7252|14315->7264|14356->7266|14410->7287|14481->7322|14526->7350|14566->7351|14627->7375|14638->7376|14669->7384|14775->7452|14866->7519|14915->7530|14927->7531|14959->7539|15008->7556|16683->9183|16846->9297|16930->9333|17076->9430|17159->9465|17302->9559|17380->9589|17458->9630|17549->9697|17597->9707|17682->9768|17799->9836|17889->9877|17942->9883|18007->9900|18200->10045|18314->10111|18429->10179|18481->10184|18574->10229|18697->10305|18930->10491|19065->10589|19091->10592|19232->10696|19248->10702|19302->10733|19425->10819|19441->10825|19559->10919|19602->10924|19629->10927|19781->11042|19797->11048|19850->11078|19892->11083|19908->11089|19965->11122|20008->11127|20025->11133|20083->11167|20212->11259|20228->11265|20287->11301|20329->11306|20345->11312|20402->11345|20549->11455|20565->11461|20610->11483|20652->11488|20668->11494|20728->11531|20771->11536|20788->11542|20847->11577|20890->11582|20907->11588|20969->11626|21116->11736|21132->11742|21177->11764|21219->11769|21235->11775|21298->11815|21406->11886|21422->11892|21485->11932|21538->11953
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|42->13|42->13|42->13|45->16|45->16|45->16|46->17|46->17|46->17|46->17|46->17|46->17|46->17|46->17|46->17|46->17|47->18|47->18|47->18|49->20|49->20|49->20|50->21|50->21|50->21|51->22|54->25|54->25|54->25|55->26|55->26|55->26|57->28|64->35|64->35|64->35|69->40|72->43|72->43|72->43|84->55|91->62|91->62|91->62|92->63|92->63|92->63|92->63|92->63|92->63|93->64|93->64|93->64|94->65|94->65|94->65|94->65|94->65|94->65|94->65|95->66|95->66|95->66|95->66|95->66|95->66|95->66|97->68|100->71|100->71|100->71|101->72|101->72|101->72|103->74|104->75|104->75|104->75|105->76|105->76|105->76|105->76|105->76|105->76|106->77|106->77|106->77|106->77|106->77|106->77|107->78|107->78|107->78|107->78|107->78|107->78|107->78|107->78|107->78|107->78|109->80|111->82|115->86|115->86|115->86|116->87|116->87|116->87|116->87|116->87|116->87|117->88|117->88|117->88|118->89|118->89|118->89|120->91|120->91|120->91|122->93|125->96|125->96|125->96|126->97|126->97|126->97|127->98|127->98|127->98|129->100|129->100|129->100|130->101|130->101|130->101|131->102|131->102|131->102|132->103|132->103|132->103|133->104|134->105|136->107|136->107|136->107|137->108|137->108|137->108|138->109|138->109|138->109|139->110|139->110|139->110|139->110|139->110|139->110|140->111|140->111|140->111|141->112|141->112|141->112|141->112|141->112|141->112|142->113|144->115|145->116|145->116|145->116|146->117|146->117|146->117|147->118|147->118|147->118|147->118|147->118|147->118|147->118|147->118|147->118|148->119|148->119|148->119|149->120|149->120|149->120|149->120|149->120|149->120|149->120|149->120|149->120|150->121|151->122|152->123|154->125|158->129|158->129|158->129|158->129|160->131|160->131|160->131|161->132|161->132|161->132|162->133|162->133|162->133|163->134|164->135|164->135|164->135|165->136|165->136|165->136|166->137|167->138|208->179|208->179|208->179|208->179|209->180|209->180|209->180|209->180|211->182|211->182|211->182|211->182|212->183|212->183|212->183|213->184|213->184|213->184|213->184|213->184|213->184|213->184|213->184|214->185|281->252|281->252|283->254|283->254|285->256|285->256|287->258|288->259|288->259|288->259|288->259|288->259|288->259|289->260|291->262|295->266|296->267|298->269|299->270|301->272|304->275|309->280|315->286|315->286|323->294|323->294|323->294|331->302|331->302|331->302|331->302|331->302|339->310|339->310|339->310|339->310|339->310|339->310|339->310|339->310|339->310|344->315|344->315|344->315|344->315|344->315|344->315|350->321|350->321|350->321|350->321|350->321|350->321|350->321|350->321|350->321|350->321|350->321|350->321|357->328|357->328|357->328|357->328|357->328|357->328|362->333|362->333|362->333|367->338
                    -- GENERATED --
                */
            