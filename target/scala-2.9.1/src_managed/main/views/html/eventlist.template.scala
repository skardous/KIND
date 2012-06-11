
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
                """),_display_(Seq[Any](/*15.18*/e/*15.19*/.createur)),format.raw/*15.28*/(""" &nbsp;&nbsp; <br/>
                <i>"""),_display_(Seq[Any](/*16.21*/e/*16.22*/.descriptif)),format.raw/*16.33*/("""</i>&nbsp;<br/><br/>
                <div class="styleDates" >
                Dates propos&eacute;es: <br/>
                
                <input type="hidden" id="hiddenDates"""),_display_(Seq[Any](/*20.54*/e/*20.55*/.id)),format.raw/*20.58*/("""" value=""""),_display_(Seq[Any](/*20.68*/e/*20.69*/.dates)),format.raw/*20.75*/("""">
                <input type="hidden" id="hiddenHeures"""),_display_(Seq[Any](/*21.55*/e/*21.56*/.id)),format.raw/*21.59*/("""" value=""""),_display_(Seq[Any](/*21.69*/e/*21.70*/.heures)),format.raw/*21.77*/("""">
                <input type="hidden" id="identifiants" value=""""),_display_(Seq[Any](/*22.64*/e/*22.65*/.id)),format.raw/*22.68*/("""">
                <img id="image" src=""""),_display_(Seq[Any](/*23.39*/routes/*23.45*/.Assets.at("images/calendar.png"))),format.raw/*23.78*/(""""/>
                
        		<ul>
                """),_display_(Seq[Any](/*26.18*/for(jour <- e.jours) yield /*26.38*/ {_display_(Seq[Any](format.raw/*26.40*/("""
                 <li><b>"""),_display_(Seq[Any](/*27.26*/jour/*27.30*/.date)),format.raw/*27.35*/("""</b> &nbsp;
                	<ul>
                	"""),_display_(Seq[Any](/*29.19*/for(horaire <- jour.horaires) yield /*29.48*/ {_display_(Seq[Any](format.raw/*29.50*/("""
                	  <li><i class="icon-time"></i>  """),_display_(Seq[Any](/*30.52*/horaire/*30.59*/.debut)),format.raw/*30.65*/(""" - """),_display_(Seq[Any](/*30.69*/horaire/*30.76*/.fin)),format.raw/*30.80*/("""</li>
                	""")))})),format.raw/*31.19*/("""
                	</ul>
                	</li>
                 
                """)))})),format.raw/*35.18*/("""
                </ul>
                </div>         
                
                Participants:<br/>
                """),_display_(Seq[Any](/*40.18*/if(e.participants.size > 0)/*40.45*/ {_display_(Seq[Any](format.raw/*40.47*/("""
	                <ul>
	                """),_display_(Seq[Any](/*42.19*/e/*42.20*/.participants.map/*42.37*/ { personne =>_display_(Seq[Any](format.raw/*42.51*/("""
	                    <li><i class="icon-user"></i>&nbsp;"""),_display_(Seq[Any](/*43.58*/personne/*43.66*/.nom)),format.raw/*43.70*/("""</li>
	                """)))})),format.raw/*44.19*/("""
	            	</ul>
            	""")))})),format.raw/*46.15*/(""" 
            	"""),_display_(Seq[Any](/*47.15*/if(e.participants == null)/*47.41*/ {_display_(Seq[Any](format.raw/*47.43*/("""
            		"""),_display_(Seq[Any](/*48.16*/e/*48.17*/.createur)),format.raw/*48.26*/("""
            		""")))})),format.raw/*49.16*/("""
                
                 <!-- """),format.raw/*51.118*/("""  -->
                 <a href=""""),_display_(Seq[Any](/*52.28*/routes/*52.34*/.Application.edit(e.id))),format.raw/*52.57*/("""">Editer evenement</a>         	
                
                
                """),_display_(Seq[Any](/*55.18*/form(routes.Application.deleteEvent(e.id))/*55.60*/ {_display_(Seq[Any](format.raw/*55.62*/("""
                    <input type="submit" value="Supprimer evenement">
                """)))})),format.raw/*57.18*/("""
            </li>
        """)))})),format.raw/*59.10*/("""
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
                    DATE: Mon Jun 11 08:37:35 CEST 2012
                    SOURCE: C:/tutoPlay/doodle/app/views/eventlist.scala.html
                    HASH: 63577047d75d1fbc157ca00785784094a789bf41
                    MATRIX: 768->1|886->26|914->45|950->47|986->75|1025->77|1075->92|1089->98|1117->105|1200->152|1232->168|1272->170|1343->205|1353->206|1381->212|1465->260|1475->261|1506->270|1582->310|1592->311|1625->322|1840->501|1850->502|1875->505|1921->515|1931->516|1959->522|2052->579|2062->580|2087->583|2133->593|2143->594|2172->601|2274->667|2284->668|2309->671|2386->712|2401->718|2456->751|2545->804|2581->824|2621->826|2683->852|2696->856|2723->861|2811->913|2856->942|2896->944|2984->996|3000->1003|3028->1009|3068->1013|3084->1020|3110->1024|3166->1048|3280->1130|3440->1254|3476->1281|3516->1283|3593->1324|3603->1325|3629->1342|3681->1356|3775->1414|3792->1422|3818->1426|3874->1450|3941->1485|3993->1501|4028->1527|4068->1529|4120->1545|4130->1546|4161->1555|4209->1571|4278->1706|4347->1739|4362->1745|4407->1768|4527->1852|4578->1894|4618->1896|4738->1984|4798->2012
                    LINES: 27->1|31->1|33->4|34->5|34->5|34->5|36->7|36->7|36->7|41->12|41->12|41->12|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|49->20|49->20|49->20|49->20|49->20|49->20|50->21|50->21|50->21|50->21|50->21|50->21|51->22|51->22|51->22|52->23|52->23|52->23|55->26|55->26|55->26|56->27|56->27|56->27|58->29|58->29|58->29|59->30|59->30|59->30|59->30|59->30|59->30|60->31|64->35|69->40|69->40|69->40|71->42|71->42|71->42|71->42|72->43|72->43|72->43|73->44|75->46|76->47|76->47|76->47|77->48|77->48|77->48|78->49|80->51|81->52|81->52|81->52|84->55|84->55|84->55|86->57|88->59
                    -- GENERATED --
                */
            