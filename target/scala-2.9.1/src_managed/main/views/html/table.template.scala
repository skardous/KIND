
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
								<b class="jourintitule">"""),_display_(Seq[Any](/*15.34*/jour/*15.38*/.date)),format.raw/*15.43*/(""" </b>
								"""),_display_(Seq[Any](/*16.10*/if(adm == 1)/*16.22*/{_display_(Seq[Any](format.raw/*16.23*/("""<a id=""""),_display_(Seq[Any](/*16.31*/jour/*16.35*/.id)),format.raw/*16.38*/("""" class="horaireAdd" title="Ajouter une plage horaire à cette date" ><i class="mesicones icon-plus"></i></a>""")))})),format.raw/*16.147*/("""
								"""),_display_(Seq[Any](/*17.10*/if(adm == 1)/*17.22*/{_display_(Seq[Any](format.raw/*17.23*/("""<a id=""""),_display_(Seq[Any](/*17.31*/jour/*17.35*/.id)),format.raw/*17.38*/("""" class="jourDel" title="Supprimer cette date"><i class="mesicones icon-remove"></i></a>""")))})),format.raw/*17.127*/("""
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
						    		"""),_display_(Seq[Any](/*29.14*/if(adm == 1)/*29.26*/{_display_(Seq[Any](format.raw/*29.27*/("""<a id=""""),_display_(Seq[Any](/*29.35*/horaire/*29.42*/.id)),format.raw/*29.45*/("""" idjour=""""),_display_(Seq[Any](/*29.56*/jour/*29.60*/.id)),format.raw/*29.63*/("""" class="horaireDel" title="Supprimer cette plage horaire" ><i class="mesicones icon-remove"></i></a>""")))})),format.raw/*29.165*/("""
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
					                <td class="checktd"><input id=""""),_display_(Seq[Any](/*61.54*/jour/*61.58*/.id)),format.raw/*61.61*/("""" type="checkbox"  disabled checked class="jour checkbox" value=""""),_display_(Seq[Any](/*61.127*/jour/*61.131*/.date)),format.raw/*61.136*/("""" /></td>
					              """)))}/*62.22*/else/*62.27*/{_display_(Seq[Any](format.raw/*62.28*/("""
					                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*63.55*/jour/*63.59*/.id)),format.raw/*63.62*/("""" type="checkbox"  disabled class="jour checkbox" value=""""),_display_(Seq[Any](/*63.120*/jour/*63.124*/.date)),format.raw/*63.129*/("""" /></td>
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
                    DATE: Mon Aug 06 09:37:19 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/table.scala.html
                    HASH: 65367097ba055fdb282eeb6157b6eb0b31546b99
                    MATRIX: 766->1|884->58|916->82|1000->33|1030->55|1059->136|1274->316|1314->340|1354->342|1417->369|1430->373|1455->376|1516->401|1529->405|1567->421|1640->458|1653->462|1680->467|1732->483|1753->495|1792->496|1836->504|1849->508|1874->511|2016->620|2063->631|2084->643|2123->644|2167->652|2180->656|2205->659|2327->748|2423->813|2570->925|2610->949|2650->951|2697->963|2735->992|2774->993|2850->1038|2899->1051|2944->1080|2984->1082|3042->1104|3058->1111|3083->1114|3155->1150|3168->1154|3193->1157|3262->1190|3278->1197|3306->1203|3346->1207|3362->1214|3388->1218|3440->1234|3461->1246|3500->1247|3544->1255|3560->1262|3585->1265|3632->1276|3645->1280|3670->1283|3805->1385|3868->1416|3912->1429|3995->1477|4049->1515|4089->1517|4145->1537|4165->1548|4191->1552|4234->1559|4254->1570|4279->1573|4371->1630|4450->1700|4490->1702|4537->1713|4568->1735|4607->1736|4683->1794|4696->1799|4735->1800|4813->1846|4922->1919|4942->1930|4968->1934|5062->1992|5082->2003|5107->2006|5255->2118|5275->2129|5300->2132|5456->2252|5492->2279|5531->2280|5586->2299|5606->2310|5631->2313|5784->2448|5797->2453|5836->2454|5891->2473|5911->2484|5936->2487|6096->2615|6137->2625|6196->2649|6236->2673|6276->2675|6326->2689|6364->2718|6403->2719|6455->2735|6512->2783|6552->2785|6643->2840|6656->2844|6681->2847|6784->2913|6798->2917|6826->2922|6876->2954|6889->2959|6928->2960|7020->3016|7033->3020|7058->3023|7153->3081|7167->3085|7195->3090|7258->3121|7320->3151|7376->3171|7421->3200|7461->3202|7519->3224|7582->3278|7622->3280|7713->3335|7729->3342|7754->3345|7860->3414|7877->3421|7906->3427|7947->3431|7964->3438|7991->3442|8041->3474|8054->3479|8093->3480|8185->3536|8201->3543|8226->3546|8323->3606|8340->3613|8369->3619|8410->3623|8427->3630|8454->3634|8517->3665|8569->3685|8646->3730|8702->3755|8808->3826|8851->3860|8890->3861|8944->3883|9025->3929|9065->3953|9105->3955|9153->3967|9191->3996|9230->3997|9303->4034|9316->4038|9341->4041|9414->4082|9468->4100|9513->4129|9553->4131|9633->4175|9649->4182|9674->4185|9762->4241|9801->4249
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|42->13|42->13|42->13|43->14|43->14|43->14|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|45->16|45->16|45->16|45->16|46->17|46->17|46->17|46->17|46->17|46->17|46->17|48->19|51->22|51->22|51->22|52->23|52->23|52->23|54->25|55->26|55->26|55->26|56->27|56->27|56->27|56->27|56->27|56->27|57->28|57->28|57->28|57->28|57->28|57->28|58->29|58->29|58->29|58->29|58->29|58->29|58->29|58->29|58->29|58->29|60->31|62->33|66->37|66->37|66->37|67->38|67->38|67->38|67->38|67->38|67->38|68->39|68->39|68->39|69->40|69->40|69->40|71->42|71->42|71->42|73->44|76->47|76->47|76->47|77->48|77->48|77->48|78->49|78->49|78->49|80->51|80->51|80->51|81->52|81->52|81->52|82->53|82->53|82->53|83->54|83->54|83->54|84->55|85->56|87->58|87->58|87->58|88->59|88->59|88->59|89->60|89->60|89->60|90->61|90->61|90->61|90->61|90->61|90->61|91->62|91->62|91->62|92->63|92->63|92->63|92->63|92->63|92->63|93->64|95->66|96->67|96->67|96->67|97->68|97->68|97->68|98->69|98->69|98->69|98->69|98->69|98->69|98->69|98->69|98->69|99->70|99->70|99->70|100->71|100->71|100->71|100->71|100->71|100->71|100->71|100->71|100->71|101->72|102->73|103->74|105->76|109->80|109->80|109->80|109->80|111->82|111->82|111->82|112->83|112->83|112->83|113->84|113->84|113->84|114->85|115->86|115->86|115->86|116->87|116->87|116->87|117->88|118->89
                    -- GENERATED --
                */
            