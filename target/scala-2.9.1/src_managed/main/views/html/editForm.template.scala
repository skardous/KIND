
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

			"""),_display_(Seq[Any](/*34.5*/if(adm != 1)/*34.17*/{_display_(Seq[Any](format.raw/*34.18*/("""
				S'ajouter à la liste des participants :		  
				<input id="champ" type="text" maxlength="25" value="">&nbsp;<a id="ajouter" class="btn">Ajouter</a><br>
			""")))})),format.raw/*37.5*/("""	

			"""),_display_(Seq[Any](/*39.5*/if(adm == 1)/*39.17*/{_display_(Seq[Any](format.raw/*39.18*/("""			
			
			<div class="champAdd" >		
				Ajouter un participant :		  
				<input id="champ" type="text" size="25" value="">&nbsp;<a id="ajouter" class="btn">Ajouter</a><br><br>

				Ajouter une date:
				<input id="datepicker" type="text">&nbsp;<a id="ajouterDate" class="btn">Ajouter</a>
			</div>
			""")))})),format.raw/*48.5*/("""

			<div id="divtest" >
			<table class="datesTable" cellspacing="5" cellpadding="5">
				<tbody>
					<tr class="titres dates" style="display:none"><td style="visibility:hidden"></td>
						"""),_display_(Seq[Any](/*54.8*/for(jour <- event.jours) yield /*54.32*/ {_display_(Seq[Any](format.raw/*54.34*/("""  					  
							<td id=""""),_display_(Seq[Any](/*55.17*/jour/*55.21*/.id)),format.raw/*55.24*/("""" class="jour" colspan=""""),_display_(Seq[Any](/*55.49*/jour/*55.53*/.horaires.size())),format.raw/*55.69*/("""">
								<b class="jourintitule">"""),_display_(Seq[Any](/*56.34*/jour/*56.38*/.date)),format.raw/*56.43*/(""" </b>
								"""),_display_(Seq[Any](/*57.10*/if(adm == 1)/*57.22*/{_display_(Seq[Any](format.raw/*57.23*/("""<a id=""""),_display_(Seq[Any](/*57.31*/jour/*57.35*/.id)),format.raw/*57.38*/("""" class="horaireAdd" title="Ajouter une plage horaire à cette date" ><i class="mesicones icon-plus"></i></a>""")))})),format.raw/*57.147*/("""
								"""),_display_(Seq[Any](/*58.10*/if(adm == 1)/*58.22*/{_display_(Seq[Any](format.raw/*58.23*/("""<a id=""""),_display_(Seq[Any](/*58.31*/jour/*58.35*/.id)),format.raw/*58.38*/("""" class="jourDel" title="Supprimer cette date"><i class="mesicones icon-remove"></i></a>""")))})),format.raw/*58.127*/("""
							</td>	                        	                
						""")))})),format.raw/*60.8*/("""
					</tr>
					<tr class="titres horaires" style="display:none"><td style="visibility:hidden"></td>
						"""),_display_(Seq[Any](/*63.8*/for(jour <- event.jours) yield /*63.32*/ {_display_(Seq[Any](format.raw/*63.34*/("""  
							"""),_display_(Seq[Any](/*64.9*/if(jour.horaires.size() == 0)/*64.38*/{_display_(Seq[Any](format.raw/*64.39*/("""
							    <td class="jour"></td>
							""")))})),format.raw/*66.9*/("""
						    """),_display_(Seq[Any](/*67.12*/for(horaire <- jour.horaires) yield /*67.41*/ {_display_(Seq[Any](format.raw/*67.43*/("""
						    	<td id=""""),_display_(Seq[Any](/*68.21*/horaire/*68.28*/.id)),format.raw/*68.31*/("""" style="font-size: 0.85em" dayid=""""),_display_(Seq[Any](/*68.67*/jour/*68.71*/.id)),format.raw/*68.74*/("""" class="horaire">
						    		"""),_display_(Seq[Any](/*69.14*/horaire/*69.21*/.debut)),format.raw/*69.27*/(""" - """),_display_(Seq[Any](/*69.31*/horaire/*69.38*/.fin)),format.raw/*69.42*/(""" 
						    		"""),_display_(Seq[Any](/*70.14*/if(adm == 1)/*70.26*/{_display_(Seq[Any](format.raw/*70.27*/("""<a id=""""),_display_(Seq[Any](/*70.35*/horaire/*70.42*/.id)),format.raw/*70.45*/("""" idjour=""""),_display_(Seq[Any](/*70.56*/jour/*70.60*/.id)),format.raw/*70.63*/("""" class="horaireDel" title="Supprimer cette plage horaire" ><i class="mesicones icon-remove"></i></a>""")))})),format.raw/*70.165*/("""
						    	</td>
						    """)))})),format.raw/*72.12*/("""  

						""")))})),format.raw/*74.8*/("""
					</tr>
					              
					
					"""),_display_(Seq[Any](/*78.7*/for(participant <- event.participants) yield /*78.45*/ {_display_(Seq[Any](format.raw/*78.47*/("""
						<tr title=""""),_display_(Seq[Any](/*79.19*/participant/*79.30*/.nom)),format.raw/*79.34*/("""" id=""""),_display_(Seq[Any](/*79.41*/participant/*79.52*/.id)),format.raw/*79.55*/("""" class="participant"><td class="infoPersonne">
							"""),_display_(Seq[Any](/*80.9*/form(routes.Application.updatePersonne(event.id), 'id->"formPersonne")/*80.79*/ {_display_(Seq[Any](format.raw/*80.81*/("""
								"""),_display_(Seq[Any](/*81.10*/if(participant.locked)/*81.32*/{_display_(Seq[Any](format.raw/*81.33*/("""
									<i class="mesicones icon-lock"></i>
								""")))}/*83.11*/else/*83.16*/{_display_(Seq[Any](format.raw/*83.17*/("""
									&nbsp;&nbsp;&nbsp;&nbsp;
								""")))})),format.raw/*85.10*/("""
								

								<input id="nom" maxlength="25" type="text" value=""""),_display_(Seq[Any](/*88.60*/participant/*88.71*/.nom)),format.raw/*88.75*/("""" name="nom" readonly="readonly">							
								<a id=""""),_display_(Seq[Any](/*89.17*/participant/*89.28*/.id)),format.raw/*89.31*/("""" title="Editer le participant" class="editPersonne"><i class="mesicones icon-pencil"></i></a>
								<a id=""""),_display_(Seq[Any](/*90.17*/participant/*90.28*/.id)),format.raw/*90.31*/("""" title="Supprimer le participant" class="deletePersonne"> <i class="mesicones icon-trash"></i></a>
								
								"""),_display_(Seq[Any](/*92.10*/if(participant.obligatoire)/*92.37*/{_display_(Seq[Any](format.raw/*92.38*/("""
									<a id=""""),_display_(Seq[Any](/*93.18*/participant/*93.29*/.id)),format.raw/*93.32*/("""" title="Participation à l'évènement obligatoire" class="obligatoirecb obligatoire"><i class="mesicones icon-star"></i></a>
								""")))}/*94.11*/else/*94.16*/{_display_(Seq[Any](format.raw/*94.17*/("""
									<a id=""""),_display_(Seq[Any](/*95.18*/participant/*95.29*/.id)),format.raw/*95.32*/("""" title="Participation à l'évènement facultative" class="obligatoirecb"><i class="mesicones icon-star-empty"></i></a>
								""")))})),format.raw/*96.10*/("""
							""")))})),format.raw/*97.9*/("""</td>
							
							"""),_display_(Seq[Any](/*99.9*/for(jour <- event.jours) yield /*99.33*/ {_display_(Seq[Any](format.raw/*99.35*/("""
							    """),_display_(Seq[Any](/*100.13*/if(jour.horaires.size() == 0)/*100.42*/{_display_(Seq[Any](format.raw/*100.43*/("""
							      """),_display_(Seq[Any](/*101.15*/if(participant.inscriptionsJours.contains(jour))/*101.63*/ {_display_(Seq[Any](format.raw/*101.65*/("""
					                <td class="checktd"><input id=""""),_display_(Seq[Any](/*102.54*/jour/*102.58*/.id)),format.raw/*102.61*/("""" type="checkbox"  disabled checked class="jour checkbox" value=""""),_display_(Seq[Any](/*102.127*/jour/*102.131*/.date)),format.raw/*102.136*/("""" /></td>
					              """)))}/*103.22*/else/*103.27*/{_display_(Seq[Any](format.raw/*103.28*/("""
					                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*104.55*/jour/*104.59*/.id)),format.raw/*104.62*/("""" type="checkbox"  disabled class="jour checkbox" value=""""),_display_(Seq[Any](/*104.120*/jour/*104.124*/.date)),format.raw/*104.129*/("""" /></td>
					              """)))})),format.raw/*105.21*/("""
							       
							    """)))})),format.raw/*107.13*/("""
					            """),_display_(Seq[Any](/*108.19*/for(horaire <- jour.horaires) yield /*108.48*/ {_display_(Seq[Any](format.raw/*108.50*/("""
					              """),_display_(Seq[Any](/*109.21*/if(participant.inscriptionsHoraires.contains(horaire))/*109.75*/ {_display_(Seq[Any](format.raw/*109.77*/("""
					                <td class="checktd"><input id=""""),_display_(Seq[Any](/*110.54*/horaire/*110.61*/.id)),format.raw/*110.64*/("""" type="checkbox" disabled class="horaire checkbox"  checked value=""""),_display_(Seq[Any](/*110.133*/horaire/*110.140*/.debut)),format.raw/*110.146*/(""" - """),_display_(Seq[Any](/*110.150*/horaire/*110.157*/.fin)),format.raw/*110.161*/("""" /></td>
					              """)))}/*111.22*/else/*111.27*/{_display_(Seq[Any](format.raw/*111.28*/("""
					                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*112.55*/horaire/*112.62*/.id)),format.raw/*112.65*/("""" type="checkbox" disabled class="horaire checkbox" value=""""),_display_(Seq[Any](/*112.125*/horaire/*112.132*/.debut)),format.raw/*112.138*/(""" - """),_display_(Seq[Any](/*112.142*/horaire/*112.149*/.fin)),format.raw/*112.153*/("""" /></td>
					              """)))})),format.raw/*113.21*/("""
					            """)))})),format.raw/*114.19*/("""            	                
					        """)))})),format.raw/*115.15*/("""				
						</tr>
					""")))})),format.raw/*117.7*/("""
				</tbody>
				<tfoot>
				<tr id="compte" class="titres"
				 """),_display_(Seq[Any](/*121.7*/if(event.participants.size() == 0)/*121.41*/{_display_(Seq[Any](format.raw/*121.42*/(""" style="display:none"""")))})),format.raw/*121.64*/(""">
					<td id=""><b>Compte: </b></td>
					"""),_display_(Seq[Any](/*123.7*/for(jour <- event.jours) yield /*123.31*/ {_display_(Seq[Any](format.raw/*123.33*/("""
					    """),_display_(Seq[Any](/*124.11*/if(jour.horaires.size() == 0)/*124.40*/{_display_(Seq[Any](format.raw/*124.41*/("""		     
			                <td id=""""),_display_(Seq[Any](/*125.29*/jour/*125.33*/.id)),format.raw/*125.36*/("""" class="jour">0</td>	       
					    """)))})),format.raw/*126.11*/("""
			            """),_display_(Seq[Any](/*127.17*/for(horaire <- jour.horaires) yield /*127.46*/ {_display_(Seq[Any](format.raw/*127.48*/("""              
			                <td id=""""),_display_(Seq[Any](/*128.29*/horaire/*128.36*/.id)),format.raw/*128.39*/("""" class="horaire">0</td>              
			            """)))})),format.raw/*129.17*/("""
					""")))})),format.raw/*130.7*/("""
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
			<div  id="mailList" class="selectDate" style=""""),_display_(Seq[Any](/*171.51*/if(adm != 1)/*171.63*/ {_display_(Seq[Any](format.raw/*171.65*/("""display:none;""")))})),format.raw/*171.79*/(""" position:right;  width:500px">
				<h5 """),_display_(Seq[Any](/*172.10*/if(adm != 1)/*172.22*/ {_display_(Seq[Any](format.raw/*172.24*/("""style="display:none"""")))})),format.raw/*172.45*/(""">Liste des mails invités</h5>
				<br>
				<p """),_display_(Seq[Any](/*174.9*/if(adm != 1)/*174.21*/ {_display_(Seq[Any](format.raw/*174.23*/("""style="display:none"""")))})),format.raw/*174.44*/(""" id="mailAdressContent">				
					"""),_display_(Seq[Any](/*175.7*/for(l <- event.mailSentList) yield /*175.35*/{_display_(Seq[Any](format.raw/*175.36*/("""
						"""),_display_(Seq[Any](/*176.8*/l/*176.9*/.adresse)),format.raw/*176.17*/(""" <br>
					""")))})),format.raw/*177.7*/(""" 
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

		function refreshtable()"""),format.raw("""{"""),format.raw/*244.27*/("""
		$('#divtest').load('/KIND/eventEdit/"""),_display_(Seq[Any](/*245.40*/(new sun.misc.BASE64Encoder().encode((event.id.toString).getBytes)))),format.raw/*245.107*/("""/consult/"""),_display_(Seq[Any](/*245.117*/(new sun.misc.BASE64Encoder().encode((event.email).getBytes)))),format.raw/*245.178*/("""/adm #divtest');
	"""),format.raw("""}"""),format.raw/*246.3*/("""

		$(function()"""),format.raw("""{"""),format.raw/*248.16*/("""
			$("table.datesTable td").css("background-color", color3);
			$(".checkbox").attr("disabled", "true"); 

			$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*252.38*/(""" // coloration des box checkées
			  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*253.35*/("""
			  		$(this).parent().css("background-color", "#66CC99");
			  	"""),format.raw("""}"""),format.raw/*255.8*/("""
			"""),format.raw("""}"""),format.raw/*256.5*/(""");

			$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*258.42*/("""
				$('.titres').attr('style','');
				$('.legende').attr('style','');
			"""),format.raw("""}"""),format.raw/*261.5*/(""");

			refreshCount(); // maj de la ligne de compteurs
			refreshObligatoire();
			affichagePopulaire(); // maj des surbrillances
		"""),format.raw("""}"""),format.raw/*266.4*/(""")


		/*Code concernant l'interface administrateur visible sur adminTools.js*/

		adminTools(""""),_display_(Seq[Any](/*271.16*/adm)),format.raw/*271.19*/("""");




		/*Code concernant les mails et l'envoi
		* A trouver dans le fichier sendMail.js*/

		Mails(""""),_display_(Seq[Any](/*279.11*/routes/*279.17*/.Application.sendMail(event.id))),format.raw/*279.48*/("""");




		/*Code sur l'ajout
		* complet sur ajoutPersonne.js*/

		AjoutParticipant(""""),_display_(Seq[Any](/*287.22*/routes/*287.28*/.Application.addParticipant(new sun.misc.BASE64Encoder().encode((event.id.toString).getBytes)))),format.raw/*287.122*/("""", """"),_display_(Seq[Any](/*287.127*/adm)),format.raw/*287.130*/("""");




		/* Code sur le rajout d'horaires et de dates
		* a trouver sur ajoutDateHeure.js*/

		ajoutDateHoraire(""""),_display_(Seq[Any](/*295.22*/routes/*295.28*/.Application.addDate(event.id))),format.raw/*295.58*/("""", """"),_display_(Seq[Any](/*295.63*/routes/*295.69*/.Application.newHoraire(event.id))),format.raw/*295.102*/("""", """"),_display_(Seq[Any](/*295.107*/routes/*295.113*/.Application.dateChanged(event.id))),format.raw/*295.147*/("""");


		/* Code concernant la suppression d'horaires et de jours*/
		 
		supprDateHoraire(""""),_display_(Seq[Any](/*300.22*/routes/*300.28*/.Application.deleteHoraire(event.id))),format.raw/*300.64*/("""", """"),_display_(Seq[Any](/*300.69*/routes/*300.75*/.Application.removeDate(event.id))),format.raw/*300.108*/("""");
		

		/*Code sur l'édition des participants
		* A trouver dans le fichier edition.js*/

		editFunctions(""""),_display_(Seq[Any](/*306.19*/routes/*306.25*/.Application.getPass())),format.raw/*306.47*/("""", """"),_display_(Seq[Any](/*306.52*/routes/*306.58*/.Application.updatePersonne(event.id))),format.raw/*306.95*/("""", """"),_display_(Seq[Any](/*306.100*/routes/*306.106*/.Application.checkBoxJour(event.id))),format.raw/*306.141*/("""", """"),_display_(Seq[Any](/*306.146*/routes/*306.152*/.Application.checkBoxHoraire(event.id))),format.raw/*306.190*/("""");



		/*Code sur la suppression de participants
		* A trouver dans le fichier suppression.js*/

		Delete(""""),_display_(Seq[Any](/*313.12*/routes/*313.18*/.Application.getPass())),format.raw/*313.40*/("""", """"),_display_(Seq[Any](/*313.45*/routes/*313.51*/.Application.deleteParticipant(event.id))),format.raw/*313.91*/("""")



		/*Code sur les participants obligatoires*/
		partobligatoire(""""),_display_(Seq[Any](/*318.21*/routes/*318.27*/.Application.changeObligatoire(event.id))),format.raw/*318.67*/("""");
	
	
	</script>

""")))})),format.raw/*323.2*/("""
"""))}
    }
    
    def render(event:Evenement,adm:Integer) = apply(event,adm)
    
    def f:((Evenement,Integer) => play.api.templates.Html) = (event,adm) => apply(event,adm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Aug 03 13:57:52 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/editForm.scala.html
                    HASH: a8673015e6469e1e671c7352684684b5a9a7684d
                    MATRIX: 769->1|886->54|918->78|1002->33|1030->52|1058->132|1097->137|1132->164|1171->166|1287->246|1301->251|1329->257|1413->305|1427->310|1455->316|1527->352|1541->357|1572->366|1614->372|1667->416|1707->418|1762->436|1777->441|1806->447|1841->449|1896->468|1910->473|1960->501|2005->511|2040->537|2080->539|2138->561|2152->566|2185->577|2232->593|2287->613|2308->625|2348->627|2422->665|2437->671|2493->705|2561->742|2681->827|2702->839|2741->840|2933->1001|2975->1008|2996->1020|3035->1021|3369->1324|3597->1517|3637->1541|3677->1543|3739->1569|3752->1573|3777->1576|3838->1601|3851->1605|3889->1621|3961->1657|3974->1661|4001->1666|4052->1681|4073->1693|4112->1694|4156->1702|4169->1706|4194->1709|4336->1818|4382->1828|4403->1840|4442->1841|4486->1849|4499->1853|4524->1856|4646->1945|4740->2008|4884->2117|4924->2141|4964->2143|5010->2154|5048->2183|5087->2184|5161->2227|5209->2239|5254->2268|5294->2270|5351->2291|5367->2298|5392->2301|5464->2337|5477->2341|5502->2344|5570->2376|5586->2383|5614->2389|5654->2393|5670->2400|5696->2404|5747->2419|5768->2431|5807->2432|5851->2440|5867->2447|5892->2450|5939->2461|5952->2465|5977->2468|6112->2570|6173->2599|6215->2610|6294->2654|6348->2692|6388->2694|6443->2713|6463->2724|6489->2728|6532->2735|6552->2746|6577->2749|6668->2805|6747->2875|6787->2877|6833->2887|6864->2909|6903->2910|6977->2966|6990->2971|7029->2972|7105->3016|7211->3086|7231->3097|7257->3101|7350->3158|7370->3169|7395->3172|7542->3283|7562->3294|7587->3297|7741->3415|7777->3442|7816->3443|7870->3461|7890->3472|7915->3475|8067->3609|8080->3614|8119->3615|8173->3633|8193->3644|8218->3647|8377->3774|8417->3783|8474->3805|8514->3829|8554->3831|8604->3844|8643->3873|8683->3874|8735->3889|8793->3937|8834->3939|8925->3993|8939->3997|8965->4000|9069->4066|9084->4070|9113->4075|9163->4106|9177->4111|9217->4112|9309->4167|9323->4171|9349->4174|9445->4232|9460->4236|9489->4241|9552->4271|9613->4299|9669->4318|9715->4347|9756->4349|9814->4370|9878->4424|9919->4426|10010->4480|10027->4487|10053->4490|10160->4559|10178->4566|10208->4572|10250->4576|10268->4583|10296->4587|10346->4618|10360->4623|10400->4624|10492->4679|10509->4686|10535->4689|10633->4749|10651->4756|10681->4762|10723->4766|10741->4773|10769->4777|10832->4807|10884->4826|10961->4870|11016->4893|11119->4960|11163->4994|11203->4995|11258->5017|11338->5061|11379->5085|11420->5087|11468->5098|11507->5127|11547->5128|11620->5164|11634->5168|11660->5171|11733->5211|11787->5228|11833->5257|11874->5259|11954->5302|11971->5309|11997->5312|12085->5367|12124->5374|13777->6990|13799->7002|13840->7004|13887->7018|13965->7059|13987->7071|14028->7073|14082->7094|14165->7141|14187->7153|14228->7155|14282->7176|14353->7211|14398->7239|14438->7240|14482->7248|14492->7249|14523->7257|14567->7269|16243->8897|16320->8937|16411->9004|16459->9014|16544->9075|16610->9094|16675->9111|16868->9256|16982->9322|17097->9390|17149->9395|17242->9440|17365->9516|17545->9649|17677->9744|17703->9747|17844->9851|17860->9857|17914->9888|18037->9974|18053->9980|18171->10074|18214->10079|18241->10082|18393->10197|18409->10203|18462->10233|18504->10238|18520->10244|18577->10277|18620->10282|18637->10288|18695->10322|18824->10414|18840->10420|18899->10456|18941->10461|18957->10467|19014->10500|19161->10610|19177->10616|19222->10638|19264->10643|19280->10649|19340->10686|19383->10691|19400->10697|19459->10732|19502->10737|19519->10743|19581->10781|19728->10891|19744->10897|19789->10919|19831->10924|19847->10930|19910->10970|20018->11041|20034->11047|20097->11087|20150->11108
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|42->13|42->13|42->13|45->16|45->16|45->16|46->17|46->17|46->17|46->17|46->17|46->17|46->17|46->17|46->17|46->17|47->18|47->18|47->18|49->20|49->20|49->20|50->21|50->21|50->21|51->22|54->25|54->25|54->25|55->26|55->26|55->26|57->28|63->34|63->34|63->34|66->37|68->39|68->39|68->39|77->48|83->54|83->54|83->54|84->55|84->55|84->55|84->55|84->55|84->55|85->56|85->56|85->56|86->57|86->57|86->57|86->57|86->57|86->57|86->57|87->58|87->58|87->58|87->58|87->58|87->58|87->58|89->60|92->63|92->63|92->63|93->64|93->64|93->64|95->66|96->67|96->67|96->67|97->68|97->68|97->68|97->68|97->68|97->68|98->69|98->69|98->69|98->69|98->69|98->69|99->70|99->70|99->70|99->70|99->70|99->70|99->70|99->70|99->70|99->70|101->72|103->74|107->78|107->78|107->78|108->79|108->79|108->79|108->79|108->79|108->79|109->80|109->80|109->80|110->81|110->81|110->81|112->83|112->83|112->83|114->85|117->88|117->88|117->88|118->89|118->89|118->89|119->90|119->90|119->90|121->92|121->92|121->92|122->93|122->93|122->93|123->94|123->94|123->94|124->95|124->95|124->95|125->96|126->97|128->99|128->99|128->99|129->100|129->100|129->100|130->101|130->101|130->101|131->102|131->102|131->102|131->102|131->102|131->102|132->103|132->103|132->103|133->104|133->104|133->104|133->104|133->104|133->104|134->105|136->107|137->108|137->108|137->108|138->109|138->109|138->109|139->110|139->110|139->110|139->110|139->110|139->110|139->110|139->110|139->110|140->111|140->111|140->111|141->112|141->112|141->112|141->112|141->112|141->112|141->112|141->112|141->112|142->113|143->114|144->115|146->117|150->121|150->121|150->121|150->121|152->123|152->123|152->123|153->124|153->124|153->124|154->125|154->125|154->125|155->126|156->127|156->127|156->127|157->128|157->128|157->128|158->129|159->130|200->171|200->171|200->171|200->171|201->172|201->172|201->172|201->172|203->174|203->174|203->174|203->174|204->175|204->175|204->175|205->176|205->176|205->176|206->177|273->244|274->245|274->245|274->245|274->245|275->246|277->248|281->252|282->253|284->255|285->256|287->258|290->261|295->266|300->271|300->271|308->279|308->279|308->279|316->287|316->287|316->287|316->287|316->287|324->295|324->295|324->295|324->295|324->295|324->295|324->295|324->295|324->295|329->300|329->300|329->300|329->300|329->300|329->300|335->306|335->306|335->306|335->306|335->306|335->306|335->306|335->306|335->306|335->306|335->306|335->306|342->313|342->313|342->313|342->313|342->313|342->313|347->318|347->318|347->318|352->323
                    -- GENERATED --
                */
            