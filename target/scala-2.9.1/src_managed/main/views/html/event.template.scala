
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
object event extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Evenement],Form[Evenement],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(events: List[Evenement], eventForm: Form[Evenement]):play.api.templates.Html = {
        _display_ {import helper.twitterBootstrap._

import helper._

def /*8.2*/dateField/*8.11*/(field: Field, className: String = "date"):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*8.57*/("""
    """),_display_(Seq[Any](/*9.6*/input(field, '_label -> "Dates selectionnees", '_class -> className)/*9.74*/ { (id, name, value, _) =>_display_(Seq[Any](format.raw/*9.100*/("""
        <input type="text" name=""""),_display_(Seq[Any](/*10.35*/name)),format.raw/*10.39*/("""" value=""""),_display_(Seq[Any](/*10.49*/value)),format.raw/*10.54*/(""""> 
        <a class="removeDate btn danger">Remove</a>
    """)))})),format.raw/*12.6*/("""
""")))};implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq[Any](format.raw/*1.55*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.75*/("""

"""),format.raw/*13.2*/("""

"""),_display_(Seq[Any](/*15.2*/main("Creer un evenement")/*15.28*/ {_display_(Seq[Any](format.raw/*15.30*/("""
    
    <h2>Cr&eacute;er un evenement</h2>
    
    """),_display_(Seq[Any](/*19.6*/form(action = routes.Application.newEvent(), args = 'class -> "form-horizontal")/*19.86*/ {_display_(Seq[Any](format.raw/*19.88*/("""
        
        """),_display_(Seq[Any](/*21.10*/inputText(eventForm("titre")))),format.raw/*21.39*/("""         
        """),_display_(Seq[Any](/*22.10*/inputText(eventForm("lieu")))),format.raw/*22.38*/(""" 
        """),_display_(Seq[Any](/*23.10*/textarea(eventForm("descriptif"), 'rows->6))),format.raw/*23.53*/("""
        """),_display_(Seq[Any](/*24.10*/inputText(eventForm("createur")))),format.raw/*24.42*/("""
        """),_display_(Seq[Any](/*25.10*/inputText(eventForm("mail")))),format.raw/*25.38*/("""

      
        <label class="control-label">Date</label> <div class="controls" id="date"></div> 
        
       
		<select class="test" id="99" name="teste">
			<option>test</option>
			<option>test2</option>
		</select>
		
   		<ul class="controls" id="altField"> </ul>
   		
   		
		
		
   		
   		<!-- """),format.raw/*44.9*/("""-->
    	
    	"""),_display_(Seq[Any](/*46.7*/input(eventForm("dates"), '_label -> "")/*46.47*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*46.76*/("""
		    <input type="hidden" name=""""),_display_(Seq[Any](/*47.35*/name)),format.raw/*47.39*/("""" id="myDates" """),_display_(Seq[Any](/*47.55*/toHtmlArgs(args))),format.raw/*47.71*/(""">
		""")))})),format.raw/*48.4*/("""
		
		"""),_display_(Seq[Any](/*50.4*/input(eventForm("heures"), '_label -> "")/*50.45*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*50.74*/("""
		    <input type="hidden" name=""""),_display_(Seq[Any](/*51.35*/name)),format.raw/*51.39*/("""" id="myHours" """),_display_(Seq[Any](/*51.55*/toHtmlArgs(args))),format.raw/*51.71*/(""">
		""")))})),format.raw/*52.4*/("""
		

		<!--  """),_display_(Seq[Any](/*55.10*/inputText(eventForm("hdebut"), '_label -> "Debut"))),format.raw/*55.60*/(""" h 
		"""),_display_(Seq[Any](/*56.4*/inputText(eventForm("mdebut"), '_label -> ""))),format.raw/*56.49*/("""	      
        
        """),_display_(Seq[Any](/*58.10*/inputText(eventForm("hfin")))),format.raw/*58.38*/(""" h 
        """),_display_(Seq[Any](/*59.10*/inputText(eventForm("mfin")))),format.raw/*59.38*/("""-->
        
        <input type="submit" value="Create">
        
    """)))})),format.raw/*63.6*/("""
    
    
    
""")))})))}
    }
    
    def render(events:List[Evenement],eventForm:Form[Evenement]) = apply(events,eventForm)
    
    def f:((List[Evenement],Form[Evenement]) => play.api.templates.Html) = (events,eventForm) => apply(events,eventForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 31 09:58:59 CEST 2012
                    SOURCE: C:/tutoPlay/draft/app/views/event.scala.html
                    HASH: ae6560a07dd01316428028d1b59099cb8c9b4f19
                    MATRIX: 780->1|943->185|960->194|1069->240|1109->246|1185->314|1249->340|1320->375|1346->379|1392->389|1419->394|1511->455|1544->109|1576->133|1655->54|1683->107|1711->182|1740->457|1778->460|1813->486|1853->488|1943->543|2032->623|2072->625|2127->644|2178->673|2233->692|2283->720|2330->731|2395->774|2441->784|2495->816|2541->826|2591->854|2926->1339|2977->1355|3026->1395|3093->1424|3164->1459|3190->1463|3242->1479|3280->1495|3316->1500|3358->1507|3408->1548|3475->1577|3546->1612|3572->1616|3624->1632|3662->1648|3698->1653|3748->1667|3820->1717|3862->1724|3929->1769|3991->1795|4041->1823|4090->1836|4140->1864|4243->1936
                    LINES: 27->1|32->8|32->8|34->8|35->9|35->9|35->9|36->10|36->10|36->10|36->10|38->12|39->6|39->6|40->1|42->5|43->6|45->13|47->15|47->15|47->15|51->19|51->19|51->19|53->21|53->21|54->22|54->22|55->23|55->23|56->24|56->24|57->25|57->25|74->44|76->46|76->46|76->46|77->47|77->47|77->47|77->47|78->48|80->50|80->50|80->50|81->51|81->51|81->51|81->51|82->52|85->55|85->55|86->56|86->56|88->58|88->58|89->59|89->59|93->63
                    -- GENERATED --
                */
            