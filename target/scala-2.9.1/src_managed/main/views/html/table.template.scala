
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
object table extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Evenement,Integer,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(event: Evenement, adm: Integer):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 




	<table class="datesTable" cellspacing="5" cellpadding="5">
				<tbody>
					<tr class="titres dates" style="display:none"><td style="visibility:hidden"></td>
						"""),_display_(Seq[Any](/*13.8*/for(jour <- event.jours) yield /*13.32*/ {_display_(Seq[Any](format.raw/*13.34*/("""  					  
							<td id=""""),_display_(Seq[Any](/*14.17*/jour/*14.21*/.id)),format.raw/*14.24*/("""" class="jour" colspan=""""),_display_(Seq[Any](/*14.49*/jour/*14.53*/.horaires.size())),format.raw/*14.69*/("""">
								<b class="jourintitule">"""),_display_(Seq[Any](/*15.34*/jour/*15.38*/.getFRFormat)),format.raw/*15.50*/(""" </b>
								"""),_display_(Seq[Any](/*16.10*/if(adm == 1)/*16.22*/{_display_(Seq[Any](format.raw/*16.23*/("""<a id=""""),_display_(Seq[Any](/*16.31*/jour/*16.35*/.id)),format.raw/*16.38*/("""" class="horaireAdd" title="Ajouter une plage horaire à cette date" ><i class="mesicones icon-plus"></i></a>""")))})),format.raw/*16.147*/("""
								"""),_display_(Seq[Any](/*17.10*/if(adm == 1)/*17.22*/{_display_(Seq[Any](format.raw/*17.23*/("""<a id=""""),_display_(Seq[Any](/*17.31*/jour/*17.35*/.id)),format.raw/*17.38*/("""" class="jourDel" title="Supprimer cette date"><i class="mesicones icon-trash"></i></a>""")))})),format.raw/*17.126*/("""
							</td>	                        	                
						""")))})),format.raw/*19.8*/("""
					</tr>
					<tr class="titres horaires" style="display:none"><td style="visibility:hidden"></td>
						"""),_display_(Seq[Any](/*22.8*/for(jour <- event.jours) yield /*22.32*/ {_display_(Seq[Any](format.raw/*22.34*/("""  
							"""),_display_(Seq[Any](/*23.9*/if(jour.horaires.size() == 0)/*23.38*/{_display_(Seq[Any](format.raw/*23.39*/("""
							    <td class="jour"></td>
							""")))})),format.raw/*25.9*/("""
						    """),_display_(Seq[Any](/*26.12*/for(horaire <- jour.horaires) yield /*26.41*/ {_display_(Seq[Any](format.raw/*26.43*/("""
						    	<td id=""""),_display_(Seq[Any](/*27.21*/horaire/*27.28*/.id)),format.raw/*27.31*/("""" style="font-size: 0.85em" dayid=""""),_display_(Seq[Any](/*27.67*/jour/*27.71*/.id)),format.raw/*27.74*/("""" class="horaire">
						    		"""),_display_(Seq[Any](/*28.14*/horaire/*28.21*/.debut)),format.raw/*28.27*/(""" - """),_display_(Seq[Any](/*28.31*/horaire/*28.38*/.fin)),format.raw/*28.42*/(""" 
						    		"""),_display_(Seq[Any](/*29.14*/if(adm == 1)/*29.26*/{_display_(Seq[Any](format.raw/*29.27*/("""<a id=""""),_display_(Seq[Any](/*29.35*/horaire/*29.42*/.id)),format.raw/*29.45*/("""" idjour=""""),_display_(Seq[Any](/*29.56*/jour/*29.60*/.id)),format.raw/*29.63*/("""" class="horaireDel" title="Supprimer cette plage horaire" ><i class="mesicones icon-trash"></i></a>""")))})),format.raw/*29.164*/("""
						    	</td>
						    """)))})),format.raw/*31.12*/("""  

						""")))})),format.raw/*33.8*/("""
					</tr>
					              
					
					"""),_display_(Seq[Any](/*37.7*/for(participant <- event.participants) yield /*37.45*/ {_display_(Seq[Any](format.raw/*37.47*/("""
						<tr title=""""),_display_(Seq[Any](/*38.19*/participant/*38.30*/.nom)),format.raw/*38.34*/("""" id=""""),_display_(Seq[Any](/*38.41*/participant/*38.52*/.id)),format.raw/*38.55*/("""" class="participant"><td class="infoPersonne">
							"""),_display_(Seq[Any](/*39.9*/form(routes.Application.updatePersonne(event.id), 'id->"formPersonne")/*39.79*/ {_display_(Seq[Any](format.raw/*39.81*/("""
								"""),_display_(Seq[Any](/*40.10*/if(participant.locked)/*40.32*/{_display_(Seq[Any](format.raw/*40.33*/("""
									<i class="mesicones icon-lock"></i>
								""")))}/*42.11*/else/*42.16*/{_display_(Seq[Any](format.raw/*42.17*/("""
									&nbsp;&nbsp;&nbsp;&nbsp;
								""")))})),format.raw/*44.10*/("""
								

								<input id="nom" maxlength="25" type="text" value=""""),_display_(Seq[Any](/*47.60*/participant/*47.71*/.nom)),format.raw/*47.75*/("""" name="nom" readonly="readonly">							
								<a id=""""),_display_(Seq[Any](/*48.17*/participant/*48.28*/.id)),format.raw/*48.31*/("""" title="Editer le participant" class="editPersonne"><i class="mesicones icon-pencil"></i></a>
								<a id=""""),_display_(Seq[Any](/*49.17*/participant/*49.28*/.id)),format.raw/*49.31*/("""" title="Supprimer le participant" class="deletePersonne"> <i class="mesicones icon-trash"></i></a>
								
								"""),_display_(Seq[Any](/*51.10*/if(participant.obligatoire)/*51.37*/{_display_(Seq[Any](format.raw/*51.38*/("""
									<a id=""""),_display_(Seq[Any](/*52.18*/participant/*52.29*/.id)),format.raw/*52.32*/("""" title="Participation à l'évènement obligatoire" class="obligatoirecb obligatoire"><i class="mesicones icon-star"></i></a>
								""")))}/*53.11*/else/*53.16*/{_display_(Seq[Any](format.raw/*53.17*/("""
									<a id=""""),_display_(Seq[Any](/*54.18*/participant/*54.29*/.id)),format.raw/*54.32*/("""" title="Participation à l'évènement facultative" class="obligatoirecb"><i class="mesicones icon-star-empty"></i></a>
								""")))})),format.raw/*55.10*/("""
							""")))})),format.raw/*56.9*/("""</td>
							
							"""),_display_(Seq[Any](/*58.9*/for(jour <- event.jours) yield /*58.33*/ {_display_(Seq[Any](format.raw/*58.35*/("""
							    """),_display_(Seq[Any](/*59.13*/if(jour.horaires.size() == 0)/*59.42*/{_display_(Seq[Any](format.raw/*59.43*/("""
							      """),_display_(Seq[Any](/*60.15*/if(participant.inscriptionsJours.contains(jour))/*60.63*/ {_display_(Seq[Any](format.raw/*60.65*/("""
					                <td class="checktd"><input id=""""),_display_(Seq[Any](/*61.54*/jour/*61.58*/.id)),format.raw/*61.61*/("""" type="checkbox"  disabled checked class="jour checkbox" value=""""),_display_(Seq[Any](/*61.127*/jour/*61.131*/.getFRFormat)),format.raw/*61.143*/("""" /></td>
					              """)))}/*62.22*/else/*62.27*/{_display_(Seq[Any](format.raw/*62.28*/("""
					                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*63.55*/jour/*63.59*/.id)),format.raw/*63.62*/("""" type="checkbox"  disabled class="jour checkbox" value=""""),_display_(Seq[Any](/*63.120*/jour/*63.124*/.getFRFormat)),format.raw/*63.136*/("""" /></td>
					              """)))})),format.raw/*64.21*/("""
							       
							    """)))})),format.raw/*66.13*/("""
					            """),_display_(Seq[Any](/*67.19*/for(horaire <- jour.horaires) yield /*67.48*/ {_display_(Seq[Any](format.raw/*67.50*/("""
					              """),_display_(Seq[Any](/*68.21*/if(participant.inscriptionsHoraires.contains(horaire))/*68.75*/ {_display_(Seq[Any](format.raw/*68.77*/("""
					                <td class="checktd"><input id=""""),_display_(Seq[Any](/*69.54*/horaire/*69.61*/.id)),format.raw/*69.64*/("""" type="checkbox" disabled class="horaire checkbox"  checked value=""""),_display_(Seq[Any](/*69.133*/horaire/*69.140*/.debut)),format.raw/*69.146*/(""" - """),_display_(Seq[Any](/*69.150*/horaire/*69.157*/.fin)),format.raw/*69.161*/("""" /></td>
					              """)))}/*70.22*/else/*70.27*/{_display_(Seq[Any](format.raw/*70.28*/("""
					                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*71.55*/horaire/*71.62*/.id)),format.raw/*71.65*/("""" type="checkbox" disabled class="horaire checkbox" value=""""),_display_(Seq[Any](/*71.125*/horaire/*71.132*/.debut)),format.raw/*71.138*/(""" - """),_display_(Seq[Any](/*71.142*/horaire/*71.149*/.fin)),format.raw/*71.153*/("""" /></td>
					              """)))})),format.raw/*72.21*/("""
					            """)))})),format.raw/*73.19*/("""            	                
					        """)))})),format.raw/*74.15*/("""				
						</tr>
					""")))})),format.raw/*76.7*/("""
				</tbody>
				<tfoot>
				<tr id="compte" class="titres"
				 """),_display_(Seq[Any](/*80.7*/if(event.participants.size() == 0)/*80.41*/{_display_(Seq[Any](format.raw/*80.42*/(""" style="display:none"""")))})),format.raw/*80.64*/(""">
					<td id=""><b>Compte: </b></td>
					"""),_display_(Seq[Any](/*82.7*/for(jour <- event.jours) yield /*82.31*/ {_display_(Seq[Any](format.raw/*82.33*/("""
					    """),_display_(Seq[Any](/*83.11*/if(jour.horaires.size() == 0)/*83.40*/{_display_(Seq[Any](format.raw/*83.41*/("""		     
			                <td id=""""),_display_(Seq[Any](/*84.29*/jour/*84.33*/.id)),format.raw/*84.36*/("""" class="jour">0</td>	       
					    """)))})),format.raw/*85.11*/("""
			            """),_display_(Seq[Any](/*86.17*/for(horaire <- jour.horaires) yield /*86.46*/ {_display_(Seq[Any](format.raw/*86.48*/("""              
			                <td id=""""),_display_(Seq[Any](/*87.29*/horaire/*87.36*/.id)),format.raw/*87.39*/("""" class="horaire">0</td>              
			            """)))})),format.raw/*88.17*/("""
					""")))})),format.raw/*89.7*/("""
				</tr>
				
					
				</tfoot>
				
	</table>

"""))}
    }
    
    def render(event:Evenement,adm:Integer) = apply(event,adm)
    
    def f:((Evenement,Integer) => play.api.templates.Html) = (event,adm) => apply(event,adm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 08 13:11:24 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/table.scala.html
                    HASH: d5b37a70d05de0bb91cb8712030daab8b598d387
                    MATRIX: 766->1|884->58|916->82|1000->33|1030->55|1059->136|1274->316|1314->340|1354->342|1417->369|1430->373|1455->376|1516->401|1529->405|1567->421|1640->458|1653->462|1687->474|1739->490|1760->502|1799->503|1843->511|1856->515|1881->518|2023->627|2070->638|2091->650|2130->651|2174->659|2187->663|2212->666|2333->754|2429->819|2576->931|2616->955|2656->957|2703->969|2741->998|2780->999|2856->1044|2905->1057|2950->1086|2990->1088|3048->1110|3064->1117|3089->1120|3161->1156|3174->1160|3199->1163|3268->1196|3284->1203|3312->1209|3352->1213|3368->1220|3394->1224|3446->1240|3467->1252|3506->1253|3550->1261|3566->1268|3591->1271|3638->1282|3651->1286|3676->1289|3810->1390|3873->1421|3917->1434|4000->1482|4054->1520|4094->1522|4150->1542|4170->1553|4196->1557|4239->1564|4259->1575|4284->1578|4376->1635|4455->1705|4495->1707|4542->1718|4573->1740|4612->1741|4688->1799|4701->1804|4740->1805|4818->1851|4927->1924|4947->1935|4973->1939|5067->1997|5087->2008|5112->2011|5260->2123|5280->2134|5305->2137|5461->2257|5497->2284|5536->2285|5591->2304|5611->2315|5636->2318|5789->2453|5802->2458|5841->2459|5896->2478|5916->2489|5941->2492|6101->2620|6142->2630|6201->2654|6241->2678|6281->2680|6331->2694|6369->2723|6408->2724|6460->2740|6517->2788|6557->2790|6648->2845|6661->2849|6686->2852|6789->2918|6803->2922|6838->2934|6888->2966|6901->2971|6940->2972|7032->3028|7045->3032|7070->3035|7165->3093|7179->3097|7214->3109|7277->3140|7339->3170|7395->3190|7440->3219|7480->3221|7538->3243|7601->3297|7641->3299|7732->3354|7748->3361|7773->3364|7879->3433|7896->3440|7925->3446|7966->3450|7983->3457|8010->3461|8060->3493|8073->3498|8112->3499|8204->3555|8220->3562|8245->3565|8342->3625|8359->3632|8388->3638|8429->3642|8446->3649|8473->3653|8536->3684|8588->3704|8665->3749|8721->3774|8827->3845|8870->3879|8909->3880|8963->3902|9044->3948|9084->3972|9124->3974|9172->3986|9210->4015|9249->4016|9322->4053|9335->4057|9360->4060|9433->4101|9487->4119|9532->4148|9572->4150|9652->4194|9668->4201|9693->4204|9781->4260|9820->4268
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|42->13|42->13|42->13|43->14|43->14|43->14|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|45->16|45->16|45->16|45->16|46->17|46->17|46->17|46->17|46->17|46->17|46->17|48->19|51->22|51->22|51->22|52->23|52->23|52->23|54->25|55->26|55->26|55->26|56->27|56->27|56->27|56->27|56->27|56->27|57->28|57->28|57->28|57->28|57->28|57->28|58->29|58->29|58->29|58->29|58->29|58->29|58->29|58->29|58->29|58->29|60->31|62->33|66->37|66->37|66->37|67->38|67->38|67->38|67->38|67->38|67->38|68->39|68->39|68->39|69->40|69->40|69->40|71->42|71->42|71->42|73->44|76->47|76->47|76->47|77->48|77->48|77->48|78->49|78->49|78->49|80->51|80->51|80->51|81->52|81->52|81->52|82->53|82->53|82->53|83->54|83->54|83->54|84->55|85->56|87->58|87->58|87->58|88->59|88->59|88->59|89->60|89->60|89->60|90->61|90->61|90->61|90->61|90->61|90->61|91->62|91->62|91->62|92->63|92->63|92->63|92->63|92->63|92->63|93->64|95->66|96->67|96->67|96->67|97->68|97->68|97->68|98->69|98->69|98->69|98->69|98->69|98->69|98->69|98->69|98->69|99->70|99->70|99->70|100->71|100->71|100->71|100->71|100->71|100->71|100->71|100->71|100->71|101->72|102->73|103->74|105->76|109->80|109->80|109->80|109->80|111->82|111->82|111->82|112->83|112->83|112->83|113->84|113->84|113->84|114->85|115->86|115->86|115->86|116->87|116->87|116->87|117->88|118->89
                    -- GENERATED --
                */
            