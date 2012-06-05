
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
object eventlist extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Evenement],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(events: List[Evenement]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Creer un evenement")/*5.28*/ {_display_(Seq[Any](format.raw/*5.30*/("""
    
    <h1>"""),_display_(Seq[Any](/*7.10*/events/*7.16*/.size())),format.raw/*7.23*/(""" evenement(s)</h1>
    
  
    <ul>
        """),_display_(Seq[Any](/*11.10*/for(e <- events) yield /*11.26*/ {_display_(Seq[Any](format.raw/*11.28*/("""
            <li>
                """),_display_(Seq[Any](/*13.18*/e/*13.19*/.titre)),format.raw/*13.25*/(""" &nbsp;&nbsp; <br/>par:       
                """),_display_(Seq[Any](/*14.18*/e/*14.19*/.createur)),format.raw/*14.28*/(""" &nbsp;&nbsp; <br/>
                <i>"""),_display_(Seq[Any](/*15.21*/e/*15.22*/.descriptif)),format.raw/*15.33*/("""</i>&nbsp;<br/><br/>
                <div class="styleDates" >
                Dates propos&eacute;es: <br/>
                
                <input type="hidden" id="hiddenDates"""),_display_(Seq[Any](/*19.54*/e/*19.55*/.id)),format.raw/*19.58*/("""" value=""""),_display_(Seq[Any](/*19.68*/e/*19.69*/.dates)),format.raw/*19.75*/("""">
                <input type="hidden" id="hiddenHeures"""),_display_(Seq[Any](/*20.55*/e/*20.56*/.id)),format.raw/*20.59*/("""" value=""""),_display_(Seq[Any](/*20.69*/e/*20.70*/.heures)),format.raw/*20.77*/("""">
                <input type="hidden" id="identifiants" value=""""),_display_(Seq[Any](/*21.64*/e/*21.65*/.id)),format.raw/*21.68*/("""">
                <img id="image" src=""""),_display_(Seq[Any](/*22.39*/routes/*22.45*/.Assets.at("images/calendar.png"))),format.raw/*22.78*/(""""/>
                
        		<ul>
                """),_display_(Seq[Any](/*25.18*/for(jour <- e.jours) yield /*25.38*/ {_display_(Seq[Any](format.raw/*25.40*/("""
                 <li><b>"""),_display_(Seq[Any](/*26.26*/jour/*26.30*/.date)),format.raw/*26.35*/("""</b> &nbsp;
                	<ul>
                	"""),_display_(Seq[Any](/*28.19*/for(horaire <- jour.horaires) yield /*28.48*/ {_display_(Seq[Any](format.raw/*28.50*/("""
                	  <li><i class="icon-time"></i>  """),_display_(Seq[Any](/*29.52*/horaire/*29.59*/.debut)),format.raw/*29.65*/(""" - """),_display_(Seq[Any](/*29.69*/horaire/*29.76*/.fin)),format.raw/*29.80*/("""</li>
                	""")))})),format.raw/*30.19*/("""
                	</ul>
                	</li>
                 
                """)))})),format.raw/*34.18*/("""
                </ul>
                </div>         
                
                Participants:<br/>
                """),_display_(Seq[Any](/*39.18*/if(e.participants.size > 0)/*39.45*/ {_display_(Seq[Any](format.raw/*39.47*/("""
	                <ul>
	                """),_display_(Seq[Any](/*41.19*/e/*41.20*/.participants.map/*41.37*/ { personne =>_display_(Seq[Any](format.raw/*41.51*/("""
	                    <li><i class="icon-user"></i>&nbsp;"""),_display_(Seq[Any](/*42.58*/personne/*42.66*/.nom)),format.raw/*42.70*/("""</li>
	                """)))})),format.raw/*43.19*/("""
	            	</ul>
            	""")))})),format.raw/*45.15*/(""" 
            	"""),_display_(Seq[Any](/*46.15*/if(e.participants == null)/*46.41*/ {_display_(Seq[Any](format.raw/*46.43*/("""
            		"""),_display_(Seq[Any](/*47.16*/e/*47.17*/.createur)),format.raw/*47.26*/("""
            		""")))})),format.raw/*48.16*/("""
                
                 <!-- """),format.raw/*50.118*/("""  -->
                 <a href=""""),_display_(Seq[Any](/*51.28*/routes/*51.34*/.Application.edit(e.id))),format.raw/*51.57*/("""">Editer evenement</a>         	
                
                
                """),_display_(Seq[Any](/*54.18*/form(routes.Application.deleteEvent(e.id))/*54.60*/ {_display_(Seq[Any](format.raw/*54.62*/("""
                    <input type="submit" value="Supprimer evenement">
                """)))})),format.raw/*56.18*/("""
            </li>
        """)))})),format.raw/*58.10*/("""
    </ul>
    
    <script type="text/javascript" charset="utf-8">
    	
    
    </script>
""")))})))}
    }
    
    def render(events:List[Evenement]) = apply(events)
    
    def f:((List[Evenement]) => play.api.templates.Html) = (events) => apply(events)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 04 09:16:09 CEST 2012
                    SOURCE: C:/tutoPlay/doodle/app/views/eventlist.scala.html
                    HASH: 3c1a3200aa215bff100f6a08c13c1cc55aff06a5
                    MATRIX: 768->1|886->26|914->45|950->47|984->73|1023->75|1073->90|1087->96|1115->103|1196->148|1228->164|1268->166|1339->201|1349->202|1377->208|1461->256|1471->257|1502->266|1578->306|1588->307|1621->318|1836->497|1846->498|1871->501|1917->511|1927->512|1955->518|2048->575|2058->576|2083->579|2129->589|2139->590|2168->597|2270->663|2280->664|2305->667|2382->708|2397->714|2452->747|2541->800|2577->820|2617->822|2679->848|2692->852|2719->857|2807->909|2852->938|2892->940|2980->992|2996->999|3024->1005|3064->1009|3080->1016|3106->1020|3162->1044|3276->1126|3436->1250|3472->1277|3512->1279|3589->1320|3599->1321|3625->1338|3677->1352|3771->1410|3788->1418|3814->1422|3870->1446|3937->1481|3989->1497|4024->1523|4064->1525|4116->1541|4126->1542|4157->1551|4205->1567|4274->1702|4343->1735|4358->1741|4403->1764|4523->1848|4574->1890|4614->1892|4734->1980|4794->2008
                    LINES: 27->1|31->1|33->4|34->5|34->5|34->5|36->7|36->7|36->7|40->11|40->11|40->11|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|48->19|48->19|48->19|48->19|48->19|48->19|49->20|49->20|49->20|49->20|49->20|49->20|50->21|50->21|50->21|51->22|51->22|51->22|54->25|54->25|54->25|55->26|55->26|55->26|57->28|57->28|57->28|58->29|58->29|58->29|58->29|58->29|58->29|59->30|63->34|68->39|68->39|68->39|70->41|70->41|70->41|70->41|71->42|71->42|71->42|72->43|74->45|75->46|75->46|75->46|76->47|76->47|76->47|77->48|79->50|80->51|80->51|80->51|83->54|83->54|83->54|85->56|87->58
                    -- GENERATED --
                */
            