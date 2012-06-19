
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
"""),_display_(Seq[Any](/*5.2*/main("Liste des evenements")/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""
    
    <h1>"""),_display_(Seq[Any](/*7.10*/events/*7.16*/.size())),format.raw/*7.23*/(""" evenement(s)</h1>
    
	
  
    <ul>
        """),_display_(Seq[Any](/*12.10*/for(e <- events) yield /*12.26*/ {_display_(Seq[Any](format.raw/*12.28*/("""
            <li>
                """),_display_(Seq[Any](/*14.18*/e/*14.19*/.titre)),format.raw/*14.25*/(""" &nbsp;&nbsp; <br/>par:       
                """),_display_(Seq[Any](/*15.18*/e/*15.19*/.createur)),format.raw/*15.28*/(""" &nbsp;&nbsp; 
                
                <a class="expandLink"><i class="mesicones icon-plus"></i></a><br>
                <div class="expandEvt" style="display:none">
                    <div class="styleDates" >
                    Dates propos&eacute;es: <br/>
                    
                    
                    <input type="hidden" id="identifiants" value=""""),_display_(Seq[Any](/*23.68*/e/*23.69*/.id)),format.raw/*23.72*/("""">
                    <img id="image" src=""""),_display_(Seq[Any](/*24.43*/routes/*24.49*/.Assets.at("images/calendar.png"))),format.raw/*24.82*/(""""/>
                    
            		<ul>
                    """),_display_(Seq[Any](/*27.22*/for(jour <- e.jours) yield /*27.42*/ {_display_(Seq[Any](format.raw/*27.44*/("""
                     <li><b>"""),_display_(Seq[Any](/*28.30*/jour/*28.34*/.date)),format.raw/*28.39*/("""</b> &nbsp;
                    	<ul>
                    	"""),_display_(Seq[Any](/*30.23*/for(horaire <- jour.horaires) yield /*30.52*/ {_display_(Seq[Any](format.raw/*30.54*/("""
                    	  <li><i class="mesicones icon-time"></i>  """),_display_(Seq[Any](/*31.66*/horaire/*31.73*/.debut)),format.raw/*31.79*/(""" - """),_display_(Seq[Any](/*31.83*/horaire/*31.90*/.fin)),format.raw/*31.94*/("""</li>
                    	""")))})),format.raw/*32.23*/("""
                    	</ul>
                    	</li>
                     
                    """)))})),format.raw/*36.22*/("""
                    </ul>
                    </div>         
                    
                    Participants:<br/>
                    """),_display_(Seq[Any](/*41.22*/if(e.participants.size > 0)/*41.49*/ {_display_(Seq[Any](format.raw/*41.51*/("""
    	                <ul>
    	                """),_display_(Seq[Any](/*43.23*/e/*43.24*/.participants.map/*43.41*/ { personne =>_display_(Seq[Any](format.raw/*43.55*/("""
    	                    <li><i class="mesicones icon-user"></i>&nbsp;"""),_display_(Seq[Any](/*44.72*/personne/*44.80*/.nom)),format.raw/*44.84*/("""</li>
    	                """)))})),format.raw/*45.23*/("""
    	            	</ul>
                	""")))})),format.raw/*47.19*/(""" 
            	
                </div>
                 <!-- """),format.raw/*50.118*/("""  -->
                 <a href=""""),_display_(Seq[Any](/*51.28*/routes/*51.34*/.Application.edit(e.id))),format.raw/*51.57*/("""">Editer evenement</a> <br>        	
                
                
                """),_display_(Seq[Any](/*54.18*/form(routes.Application.deleteEvent(e.id))/*54.60*/ {_display_(Seq[Any](format.raw/*54.62*/("""
                    <input type="submit" value="Supprimer evenement">
                """)))})),format.raw/*56.18*/("""
            </li>
        """)))})),format.raw/*58.10*/("""
    </ul>
    
    <script type="text/javascript" charset="utf-8">
    	$(".expandLink").live("click", function() """),format.raw("""{"""),format.raw/*62.49*/("""
            if ($(this).siblings(".expandEvt").attr("style") == "display:none") """),format.raw("""{"""),format.raw/*63.82*/("""
                $(this).siblings(".expandEvt").removeAttr("style");
                $(this).html("<i class=\"mesicones icon-minus\"></i>")
            """),format.raw("""}"""),format.raw/*66.14*/(""" else """),format.raw("""{"""),format.raw/*66.21*/("""
                $(this).siblings(".expandEvt").attr("style", "display:none");
                $(this).html("<i class=\"mesicones icon-plus\"></i>")
            """),format.raw("""}"""),format.raw/*69.14*/("""
        """),format.raw("""}"""),format.raw/*70.10*/(""")
    
    </script>
""")))})))}
    }
    
    def render(events:List[Evenement]) = apply(events)
    
    def f:((List[Evenement]) => play.api.templates.Html) = (events) => apply(events)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 15 09:17:05 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/eventlist.scala.html
                    HASH: 9805fe14eb28fa3c8f367571345dbc959e46efb8
                    MATRIX: 768->1|886->26|914->45|950->47|986->75|1025->77|1075->92|1089->98|1117->105|1200->152|1232->168|1272->170|1343->205|1353->206|1381->212|1465->260|1475->261|1506->270|1922->650|1932->651|1957->654|2038->699|2053->705|2108->738|2209->803|2245->823|2285->825|2351->855|2364->859|2391->864|2487->924|2532->953|2572->955|2674->1021|2690->1028|2718->1034|2758->1038|2774->1045|2800->1049|2860->1077|2990->1175|3170->1319|3206->1346|3246->1348|3331->1397|3341->1398|3367->1415|3419->1429|3527->1501|3544->1509|3570->1513|3630->1541|3705->1584|3795->1740|3864->1773|3879->1779|3924->1802|4048->1890|4099->1932|4139->1934|4259->2022|4319->2050|4482->2166|4611->2248|4811->2401|4865->2408|5074->2570|5131->2580
                    LINES: 27->1|31->1|33->4|34->5|34->5|34->5|36->7|36->7|36->7|41->12|41->12|41->12|43->14|43->14|43->14|44->15|44->15|44->15|52->23|52->23|52->23|53->24|53->24|53->24|56->27|56->27|56->27|57->28|57->28|57->28|59->30|59->30|59->30|60->31|60->31|60->31|60->31|60->31|60->31|61->32|65->36|70->41|70->41|70->41|72->43|72->43|72->43|72->43|73->44|73->44|73->44|74->45|76->47|79->50|80->51|80->51|80->51|83->54|83->54|83->54|85->56|87->58|91->62|92->63|95->66|95->66|98->69|99->70
                    -- GENERATED --
                */
            