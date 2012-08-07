
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
				</p>
			</div>
			""")))})),format.raw/*54.5*/("""


			<div id="divtest" >
			<table class="datesTable" cellspacing="5" cellpadding="5">
				<tbody>
					<tr class="titres dates" style="display:none"><td style="visibility:hidden"></td>
						"""),_display_(Seq[Any](/*61.8*/for(jour <- event.jours) yield /*61.32*/ {_display_(Seq[Any](format.raw/*61.34*/("""  					  
							<td id=""""),_display_(Seq[Any](/*62.17*/jour/*62.21*/.id)),format.raw/*62.24*/("""" class="jour" colspan=""""),_display_(Seq[Any](/*62.49*/jour/*62.53*/.horaires.size())),format.raw/*62.69*/("""">
								<b class="jourintitule">"""),_display_(Seq[Any](/*63.34*/jour/*63.38*/.date)),format.raw/*63.43*/(""" </b>
								"""),_display_(Seq[Any](/*64.10*/if(adm == 1)/*64.22*/{_display_(Seq[Any](format.raw/*64.23*/("""<a id=""""),_display_(Seq[Any](/*64.31*/jour/*64.35*/.id)),format.raw/*64.38*/("""" class="horaireAdd" title="Ajouter une plage horaire à cette date" ><i class="mesicones icon-plus"></i></a>""")))})),format.raw/*64.147*/("""
								"""),_display_(Seq[Any](/*65.10*/if(adm == 1)/*65.22*/{_display_(Seq[Any](format.raw/*65.23*/("""<a id=""""),_display_(Seq[Any](/*65.31*/jour/*65.35*/.id)),format.raw/*65.38*/("""" class="jourDel" title="Supprimer cette date"><i class="mesicones icon-remove"></i></a>""")))})),format.raw/*65.127*/("""
							</td>	                        	                
						""")))})),format.raw/*67.8*/("""
					</tr>
					<tr class="titres horaires" style="display:none"><td style="visibility:hidden"></td>
						"""),_display_(Seq[Any](/*70.8*/for(jour <- event.jours) yield /*70.32*/ {_display_(Seq[Any](format.raw/*70.34*/("""  
							"""),_display_(Seq[Any](/*71.9*/if(jour.horaires.size() == 0)/*71.38*/{_display_(Seq[Any](format.raw/*71.39*/("""
							    <td class="jour"></td>
							""")))})),format.raw/*73.9*/("""
						    """),_display_(Seq[Any](/*74.12*/for(horaire <- jour.horaires) yield /*74.41*/ {_display_(Seq[Any](format.raw/*74.43*/("""
						    	<td id=""""),_display_(Seq[Any](/*75.21*/horaire/*75.28*/.id)),format.raw/*75.31*/("""" style="font-size: 0.85em" dayid=""""),_display_(Seq[Any](/*75.67*/jour/*75.71*/.id)),format.raw/*75.74*/("""" class="horaire">
						    		"""),_display_(Seq[Any](/*76.14*/horaire/*76.21*/.debut)),format.raw/*76.27*/(""" - """),_display_(Seq[Any](/*76.31*/horaire/*76.38*/.fin)),format.raw/*76.42*/(""" 
						    		"""),_display_(Seq[Any](/*77.14*/if(adm == 1)/*77.26*/{_display_(Seq[Any](format.raw/*77.27*/("""<a id=""""),_display_(Seq[Any](/*77.35*/horaire/*77.42*/.id)),format.raw/*77.45*/("""" idjour=""""),_display_(Seq[Any](/*77.56*/jour/*77.60*/.id)),format.raw/*77.63*/("""" class="horaireDel" title="Supprimer cette plage horaire" ><i class="mesicones icon-remove"></i></a>""")))})),format.raw/*77.165*/("""
						    	</td>
						    """)))})),format.raw/*79.12*/("""  

						""")))})),format.raw/*81.8*/("""
					</tr>
					              
					
					"""),_display_(Seq[Any](/*85.7*/for(participant <- event.participants) yield /*85.45*/ {_display_(Seq[Any](format.raw/*85.47*/("""
						<tr title=""""),_display_(Seq[Any](/*86.19*/participant/*86.30*/.nom)),format.raw/*86.34*/("""" id=""""),_display_(Seq[Any](/*86.41*/participant/*86.52*/.id)),format.raw/*86.55*/("""" class="participant"><td class="infoPersonne">
							"""),_display_(Seq[Any](/*87.9*/form(routes.Application.updatePersonne(event.id), 'id->"formPersonne")/*87.79*/ {_display_(Seq[Any](format.raw/*87.81*/("""
								"""),_display_(Seq[Any](/*88.10*/if(participant.locked)/*88.32*/{_display_(Seq[Any](format.raw/*88.33*/("""
									<i class="mesicones icon-lock"></i>
								""")))}/*90.11*/else/*90.16*/{_display_(Seq[Any](format.raw/*90.17*/("""
									&nbsp;&nbsp;&nbsp;&nbsp;
								""")))})),format.raw/*92.10*/("""
								

								<input id="nom" maxlength="25" type="text" value=""""),_display_(Seq[Any](/*95.60*/participant/*95.71*/.nom)),format.raw/*95.75*/("""" name="nom" readonly="readonly">							
								<a id=""""),_display_(Seq[Any](/*96.17*/participant/*96.28*/.id)),format.raw/*96.31*/("""" title="Editer le participant" class="editPersonne"><i class="mesicones icon-pencil"></i></a>
								<a id=""""),_display_(Seq[Any](/*97.17*/participant/*97.28*/.id)),format.raw/*97.31*/("""" title="Supprimer le participant" class="deletePersonne"> <i class="mesicones icon-trash"></i></a>
								
								"""),_display_(Seq[Any](/*99.10*/if(participant.obligatoire)/*99.37*/{_display_(Seq[Any](format.raw/*99.38*/("""
									<a id=""""),_display_(Seq[Any](/*100.18*/participant/*100.29*/.id)),format.raw/*100.32*/("""" title="Participation à l'évènement obligatoire" class="obligatoirecb obligatoire"><i class="mesicones icon-star"></i></a>
								""")))}/*101.11*/else/*101.16*/{_display_(Seq[Any](format.raw/*101.17*/("""
									<a id=""""),_display_(Seq[Any](/*102.18*/participant/*102.29*/.id)),format.raw/*102.32*/("""" title="Participation à l'évènement facultative" class="obligatoirecb"><i class="mesicones icon-star-empty"></i></a>
								""")))})),format.raw/*103.10*/("""
							""")))})),format.raw/*104.9*/("""</td>
							
							"""),_display_(Seq[Any](/*106.9*/for(jour <- event.jours) yield /*106.33*/ {_display_(Seq[Any](format.raw/*106.35*/("""
							    """),_display_(Seq[Any](/*107.13*/if(jour.horaires.size() == 0)/*107.42*/{_display_(Seq[Any](format.raw/*107.43*/("""
							      """),_display_(Seq[Any](/*108.15*/if(participant.inscriptionsJours.contains(jour))/*108.63*/ {_display_(Seq[Any](format.raw/*108.65*/("""
					                <td class="checktd"><input id=""""),_display_(Seq[Any](/*109.54*/jour/*109.58*/.id)),format.raw/*109.61*/("""" type="checkbox"  disabled checked class="jour checkbox" value=""""),_display_(Seq[Any](/*109.127*/jour/*109.131*/.date)),format.raw/*109.136*/("""" /></td>
					              """)))}/*110.22*/else/*110.27*/{_display_(Seq[Any](format.raw/*110.28*/("""
					                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*111.55*/jour/*111.59*/.id)),format.raw/*111.62*/("""" type="checkbox"  disabled class="jour checkbox" value=""""),_display_(Seq[Any](/*111.120*/jour/*111.124*/.date)),format.raw/*111.129*/("""" /></td>
					              """)))})),format.raw/*112.21*/("""
							       
							    """)))})),format.raw/*114.13*/("""
					            """),_display_(Seq[Any](/*115.19*/for(horaire <- jour.horaires) yield /*115.48*/ {_display_(Seq[Any](format.raw/*115.50*/("""
					              """),_display_(Seq[Any](/*116.21*/if(participant.inscriptionsHoraires.contains(horaire))/*116.75*/ {_display_(Seq[Any](format.raw/*116.77*/("""
					                <td class="checktd"><input id=""""),_display_(Seq[Any](/*117.54*/horaire/*117.61*/.id)),format.raw/*117.64*/("""" type="checkbox" disabled class="horaire checkbox"  checked value=""""),_display_(Seq[Any](/*117.133*/horaire/*117.140*/.debut)),format.raw/*117.146*/(""" - """),_display_(Seq[Any](/*117.150*/horaire/*117.157*/.fin)),format.raw/*117.161*/("""" /></td>
					              """)))}/*118.22*/else/*118.27*/{_display_(Seq[Any](format.raw/*118.28*/("""
					                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*119.55*/horaire/*119.62*/.id)),format.raw/*119.65*/("""" type="checkbox" disabled class="horaire checkbox" value=""""),_display_(Seq[Any](/*119.125*/horaire/*119.132*/.debut)),format.raw/*119.138*/(""" - """),_display_(Seq[Any](/*119.142*/horaire/*119.149*/.fin)),format.raw/*119.153*/("""" /></td>
					              """)))})),format.raw/*120.21*/("""
					            """)))})),format.raw/*121.19*/("""            	                
					        """)))})),format.raw/*122.15*/("""				
						</tr>
					""")))})),format.raw/*124.7*/("""
				</tbody>
				<tfoot>
				<tr id="compte" class="titres"
				 """),_display_(Seq[Any](/*128.7*/if(event.participants.size() == 0)/*128.41*/{_display_(Seq[Any](format.raw/*128.42*/(""" style="display:none"""")))})),format.raw/*128.64*/(""">
					<td id=""><b>Compte: </b></td>
					"""),_display_(Seq[Any](/*130.7*/for(jour <- event.jours) yield /*130.31*/ {_display_(Seq[Any](format.raw/*130.33*/("""
					    """),_display_(Seq[Any](/*131.11*/if(jour.horaires.size() == 0)/*131.40*/{_display_(Seq[Any](format.raw/*131.41*/("""		     
			                <td id=""""),_display_(Seq[Any](/*132.29*/jour/*132.33*/.id)),format.raw/*132.36*/("""" class="jour">0</td>	       
					    """)))})),format.raw/*133.11*/("""
			            """),_display_(Seq[Any](/*134.17*/for(horaire <- jour.horaires) yield /*134.46*/ {_display_(Seq[Any](format.raw/*134.48*/("""              
			                <td id=""""),_display_(Seq[Any](/*135.29*/horaire/*135.36*/.id)),format.raw/*135.39*/("""" class="horaire">0</td>              
			            """)))})),format.raw/*136.17*/("""
					""")))})),format.raw/*137.7*/("""
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
			<div  id="mailList" class="selectDate" style=""""),_display_(Seq[Any](/*178.51*/if(adm != 1)/*178.63*/ {_display_(Seq[Any](format.raw/*178.65*/("""display:none;""")))})),format.raw/*178.79*/(""" position:right;  width:500px">
				<h5 """),_display_(Seq[Any](/*179.10*/if(adm != 1)/*179.22*/ {_display_(Seq[Any](format.raw/*179.24*/("""style="display:none"""")))})),format.raw/*179.45*/(""">Liste des mails invités</h5>
				<br>
				<p """),_display_(Seq[Any](/*181.9*/if(adm != 1)/*181.21*/ {_display_(Seq[Any](format.raw/*181.23*/("""style="display:none"""")))})),format.raw/*181.44*/(""" id="mailAdressContent">				
					"""),_display_(Seq[Any](/*182.7*/for(l <- event.mailSentList) yield /*182.35*/{_display_(Seq[Any](format.raw/*182.36*/("""
						"""),_display_(Seq[Any](/*183.8*/l/*183.9*/.adresse)),format.raw/*183.17*/(""" <br>
					""")))})),format.raw/*184.7*/(""" 
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

		function refreshtable()"""),format.raw("""{"""),format.raw/*251.27*/("""
			$('#divtest').load('/KIND/eventEdit/"""),_display_(Seq[Any](/*252.41*/(new sun.misc.BASE64Encoder().encode((event.id.toString).getBytes)))),format.raw/*252.108*/("""/consult/"""),_display_(Seq[Any](/*252.118*/(new sun.misc.BASE64Encoder().encode((event.email).getBytes)))),format.raw/*252.179*/("""/adm #divtest', function(responseText, textStatus, XMLHttpRequest) """),format.raw("""{"""),format.raw/*252.247*/("""styles();$("body").append(responseText);"""),format.raw("""}"""),format.raw/*252.288*/(""");
		"""),format.raw("""}"""),format.raw/*253.4*/("""

		$(function()"""),format.raw("""{"""),format.raw/*255.16*/("""
			$("table.datesTable td").css("background-color", color3);
			$(".checkbox").attr("disabled", "true"); 

			$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*259.38*/(""" // coloration des box checkées
			  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*260.35*/("""
			  		$(this).parent().css("background-color", "#66CC99");
			  	"""),format.raw("""}"""),format.raw/*262.8*/("""
			"""),format.raw("""}"""),format.raw/*263.5*/(""");

			$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*265.42*/("""
				$('.titres').attr('style','');
				$('.legende').attr('style','');
			"""),format.raw("""}"""),format.raw/*268.5*/(""");

			refreshCount(); // maj de la ligne de compteurs
			refreshObligatoire(); // maj  des classes "obligatoire" sur les checkboxes
			affichagePopulaire(); // maj des surbrillances
		"""),format.raw("""}"""),format.raw/*273.4*/(""")


		
		/*Code concernant l'interface administrateur visible sur adminTools.js*/

		adminTools(""""),_display_(Seq[Any](/*279.16*/adm)),format.raw/*279.19*/("""");




		/*Code concernant les mails et l'envoi
		* A trouver dans le fichier sendMail.js*/

		Mails(""""),_display_(Seq[Any](/*287.11*/routes/*287.17*/.Application.sendMail(event.id))),format.raw/*287.48*/("""");




		/*Code sur l'ajout
		* complet sur ajoutPersonne.js*/

		AjoutParticipant(""""),_display_(Seq[Any](/*295.22*/routes/*295.28*/.Application.addParticipant(new sun.misc.BASE64Encoder().encode((event.id.toString).getBytes)))),format.raw/*295.122*/("""", """"),_display_(Seq[Any](/*295.127*/adm)),format.raw/*295.130*/("""");




		/* Code sur le rajout d'horaires et de dates
		* a trouver sur ajoutDateHeure.js*/

		ajoutDateHoraire(""""),_display_(Seq[Any](/*303.22*/routes/*303.28*/.Application.addDate(event.id))),format.raw/*303.58*/("""", """"),_display_(Seq[Any](/*303.63*/routes/*303.69*/.Application.newHoraire(event.id))),format.raw/*303.102*/("""", """"),_display_(Seq[Any](/*303.107*/routes/*303.113*/.Application.dateChanged(event.id))),format.raw/*303.147*/("""");


		/* Code concernant la suppression d'horaires et de jours*/
		 
		supprDateHoraire(""""),_display_(Seq[Any](/*308.22*/routes/*308.28*/.Application.deleteHoraire(event.id))),format.raw/*308.64*/("""", """"),_display_(Seq[Any](/*308.69*/routes/*308.75*/.Application.removeDate(event.id))),format.raw/*308.108*/("""");
		

		/*Code sur l'édition des participants
		* A trouver dans le fichier edition.js*/

		editFunctions(""""),_display_(Seq[Any](/*314.19*/routes/*314.25*/.Application.getPass())),format.raw/*314.47*/("""", """"),_display_(Seq[Any](/*314.52*/routes/*314.58*/.Application.updatePersonne(event.id))),format.raw/*314.95*/("""", """"),_display_(Seq[Any](/*314.100*/routes/*314.106*/.Application.checkBoxJour(event.id))),format.raw/*314.141*/("""", """"),_display_(Seq[Any](/*314.146*/routes/*314.152*/.Application.checkBoxHoraire(event.id))),format.raw/*314.190*/("""");



		/*Code sur la suppression de participants
		* A trouver dans le fichier suppression.js*/

		Delete(""""),_display_(Seq[Any](/*321.12*/routes/*321.18*/.Application.getPass())),format.raw/*321.40*/("""", """"),_display_(Seq[Any](/*321.45*/routes/*321.51*/.Application.deleteParticipant(event.id))),format.raw/*321.91*/("""")



		/*Code sur les participants obligatoires*/
		partobligatoire(""""),_display_(Seq[Any](/*326.21*/routes/*326.27*/.Application.changeObligatoire(event.id))),format.raw/*326.67*/("""");
	
	
	</script>

""")))})),format.raw/*331.2*/("""
"""))}
    }
    
    def render(event:Evenement,adm:Integer) = apply(event,adm)
    
    def f:((Evenement,Integer) => play.api.templates.Html) = (event,adm) => apply(event,adm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 06 15:59:57 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/editForm.scala.html
                    HASH: 54a8fb6f142aa9c8e1b960ce20769fa70c672a6c
                    MATRIX: 769->1|886->54|918->78|1002->33|1030->52|1058->132|1097->137|1132->164|1171->166|1287->246|1301->251|1329->257|1413->305|1427->310|1455->316|1527->352|1541->357|1572->366|1614->372|1667->416|1707->418|1762->436|1777->441|1806->447|1841->449|1896->468|1910->473|1960->501|2005->511|2040->537|2080->539|2138->561|2152->566|2185->577|2232->593|2287->613|2308->625|2348->627|2422->665|2437->671|2493->705|2561->742|2686->832|2707->844|2746->845|2957->1025|3003->1036|3024->1048|3063->1049|3418->1373|3647->1567|3687->1591|3727->1593|3789->1619|3802->1623|3827->1626|3888->1651|3901->1655|3939->1671|4011->1707|4024->1711|4051->1716|4102->1731|4123->1743|4162->1744|4206->1752|4219->1756|4244->1759|4386->1868|4432->1878|4453->1890|4492->1891|4536->1899|4549->1903|4574->1906|4696->1995|4790->2058|4934->2167|4974->2191|5014->2193|5060->2204|5098->2233|5137->2234|5211->2277|5259->2289|5304->2318|5344->2320|5401->2341|5417->2348|5442->2351|5514->2387|5527->2391|5552->2394|5620->2426|5636->2433|5664->2439|5704->2443|5720->2450|5746->2454|5797->2469|5818->2481|5857->2482|5901->2490|5917->2497|5942->2500|5989->2511|6002->2515|6027->2518|6162->2620|6223->2649|6265->2660|6344->2704|6398->2742|6438->2744|6493->2763|6513->2774|6539->2778|6582->2785|6602->2796|6627->2799|6718->2855|6797->2925|6837->2927|6883->2937|6914->2959|6953->2960|7027->3016|7040->3021|7079->3022|7155->3066|7261->3136|7281->3147|7307->3151|7400->3208|7420->3219|7445->3222|7592->3333|7612->3344|7637->3347|7791->3465|7827->3492|7866->3493|7921->3511|7942->3522|7968->3525|8121->3659|8135->3664|8175->3665|8230->3683|8251->3694|8277->3697|8437->3824|8478->3833|8536->3855|8577->3879|8618->3881|8668->3894|8707->3923|8747->3924|8799->3939|8857->3987|8898->3989|8989->4043|9003->4047|9029->4050|9133->4116|9148->4120|9177->4125|9227->4156|9241->4161|9281->4162|9373->4217|9387->4221|9413->4224|9509->4282|9524->4286|9553->4291|9616->4321|9677->4349|9733->4368|9779->4397|9820->4399|9878->4420|9942->4474|9983->4476|10074->4530|10091->4537|10117->4540|10224->4609|10242->4616|10272->4622|10314->4626|10332->4633|10360->4637|10410->4668|10424->4673|10464->4674|10556->4729|10573->4736|10599->4739|10697->4799|10715->4806|10745->4812|10787->4816|10805->4823|10833->4827|10896->4857|10948->4876|11025->4920|11080->4943|11183->5010|11227->5044|11267->5045|11322->5067|11402->5111|11443->5135|11484->5137|11532->5148|11571->5177|11611->5178|11684->5214|11698->5218|11724->5221|11797->5261|11851->5278|11897->5307|11938->5309|12018->5352|12035->5359|12061->5362|12149->5417|12188->5424|13844->7043|13866->7055|13907->7057|13954->7071|14032->7112|14054->7124|14095->7126|14149->7147|14232->7194|14254->7206|14295->7208|14349->7229|14420->7264|14465->7292|14505->7293|14549->7301|14559->7302|14590->7310|14634->7322|16310->8950|16388->8991|16479->9058|16527->9068|16612->9129|16729->9197|16819->9238|16872->9244|16937->9261|17130->9406|17244->9472|17359->9540|17411->9545|17504->9590|17627->9666|17860->9852|17995->9950|18021->9953|18162->10057|18178->10063|18232->10094|18355->10180|18371->10186|18489->10280|18532->10285|18559->10288|18711->10403|18727->10409|18780->10439|18822->10444|18838->10450|18895->10483|18938->10488|18955->10494|19013->10528|19142->10620|19158->10626|19217->10662|19259->10667|19275->10673|19332->10706|19479->10816|19495->10822|19540->10844|19582->10849|19598->10855|19658->10892|19701->10897|19718->10903|19777->10938|19820->10943|19837->10949|19899->10987|20046->11097|20062->11103|20107->11125|20149->11130|20165->11136|20228->11176|20336->11247|20352->11253|20415->11293|20468->11314
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|42->13|42->13|42->13|45->16|45->16|45->16|46->17|46->17|46->17|46->17|46->17|46->17|46->17|46->17|46->17|46->17|47->18|47->18|47->18|49->20|49->20|49->20|50->21|50->21|50->21|51->22|54->25|54->25|54->25|55->26|55->26|55->26|57->28|64->35|64->35|64->35|69->40|72->43|72->43|72->43|83->54|90->61|90->61|90->61|91->62|91->62|91->62|91->62|91->62|91->62|92->63|92->63|92->63|93->64|93->64|93->64|93->64|93->64|93->64|93->64|94->65|94->65|94->65|94->65|94->65|94->65|94->65|96->67|99->70|99->70|99->70|100->71|100->71|100->71|102->73|103->74|103->74|103->74|104->75|104->75|104->75|104->75|104->75|104->75|105->76|105->76|105->76|105->76|105->76|105->76|106->77|106->77|106->77|106->77|106->77|106->77|106->77|106->77|106->77|106->77|108->79|110->81|114->85|114->85|114->85|115->86|115->86|115->86|115->86|115->86|115->86|116->87|116->87|116->87|117->88|117->88|117->88|119->90|119->90|119->90|121->92|124->95|124->95|124->95|125->96|125->96|125->96|126->97|126->97|126->97|128->99|128->99|128->99|129->100|129->100|129->100|130->101|130->101|130->101|131->102|131->102|131->102|132->103|133->104|135->106|135->106|135->106|136->107|136->107|136->107|137->108|137->108|137->108|138->109|138->109|138->109|138->109|138->109|138->109|139->110|139->110|139->110|140->111|140->111|140->111|140->111|140->111|140->111|141->112|143->114|144->115|144->115|144->115|145->116|145->116|145->116|146->117|146->117|146->117|146->117|146->117|146->117|146->117|146->117|146->117|147->118|147->118|147->118|148->119|148->119|148->119|148->119|148->119|148->119|148->119|148->119|148->119|149->120|150->121|151->122|153->124|157->128|157->128|157->128|157->128|159->130|159->130|159->130|160->131|160->131|160->131|161->132|161->132|161->132|162->133|163->134|163->134|163->134|164->135|164->135|164->135|165->136|166->137|207->178|207->178|207->178|207->178|208->179|208->179|208->179|208->179|210->181|210->181|210->181|210->181|211->182|211->182|211->182|212->183|212->183|212->183|213->184|280->251|281->252|281->252|281->252|281->252|281->252|281->252|282->253|284->255|288->259|289->260|291->262|292->263|294->265|297->268|302->273|308->279|308->279|316->287|316->287|316->287|324->295|324->295|324->295|324->295|324->295|332->303|332->303|332->303|332->303|332->303|332->303|332->303|332->303|332->303|337->308|337->308|337->308|337->308|337->308|337->308|343->314|343->314|343->314|343->314|343->314|343->314|343->314|343->314|343->314|343->314|343->314|343->314|350->321|350->321|350->321|350->321|350->321|350->321|355->326|355->326|355->326|360->331
                    -- GENERATED --
                */
            