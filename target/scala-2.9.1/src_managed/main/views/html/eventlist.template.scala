
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
                
                
                <input type="hidden" id="identifiants" value=""""),_display_(Seq[Any](/*21.64*/e/*21.65*/.id)),format.raw/*21.68*/("""">
                <img id="image" src=""""),_display_(Seq[Any](/*22.39*/routes/*22.45*/.Assets.at("images/calendar.png"))),format.raw/*22.78*/(""""/>
                
        		<ul>
                """),_display_(Seq[Any](/*25.18*/for(jour <- e.jours) yield /*25.38*/ {_display_(Seq[Any](format.raw/*25.40*/("""
                 <li><b>"""),_display_(Seq[Any](/*26.26*/jour/*26.30*/.date)),format.raw/*26.35*/("""</b> &nbsp;
                	<ul>
                	"""),_display_(Seq[Any](/*28.19*/for(horaire <- jour.horaires) yield /*28.48*/ {_display_(Seq[Any](format.raw/*28.50*/("""
                	  <li><i class="mesicones icon-time"></i>  """),_display_(Seq[Any](/*29.62*/horaire/*29.69*/.debut)),format.raw/*29.75*/(""" - """),_display_(Seq[Any](/*29.79*/horaire/*29.86*/.fin)),format.raw/*29.90*/("""</li>
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
	                    <li><i class="mesicones icon-user"></i>&nbsp;"""),_display_(Seq[Any](/*42.68*/personne/*42.76*/.nom)),format.raw/*42.80*/("""</li>
	                """)))})),format.raw/*43.19*/("""
	            	</ul>
            	""")))})),format.raw/*45.15*/(""" 
            	"""),_display_(Seq[Any](/*46.15*/if(e.participants == null)/*46.41*/ {_display_(Seq[Any](format.raw/*46.43*/("""
            		"""),_display_(Seq[Any](/*47.16*/e/*47.17*/.createur)),format.raw/*47.26*/("""
            	""")))})),format.raw/*48.15*/("""
                
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
                    DATE: Wed Jun 13 15:50:48 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/eventlist.scala.html
                    HASH: 4330f5b3f273d6b3a16f6621db43e8deb68ceeb5
                    MATRIX: 768->1|886->26|914->45|950->47|986->75|1025->77|1075->92|1089->98|1117->105|1200->152|1232->168|1272->170|1343->205|1353->206|1381->212|1465->260|1475->261|1506->270|1582->310|1592->311|1625->322|1867->528|1877->529|1902->532|1979->573|1994->579|2049->612|2138->665|2174->685|2214->687|2276->713|2289->717|2316->722|2404->774|2449->803|2489->805|2587->867|2603->874|2631->880|2671->884|2687->891|2713->895|2769->919|2883->1001|3043->1125|3079->1152|3119->1154|3196->1195|3206->1196|3232->1213|3284->1227|3388->1295|3405->1303|3431->1307|3487->1331|3554->1366|3606->1382|3641->1408|3681->1410|3733->1426|3743->1427|3774->1436|3821->1451|3890->1586|3959->1619|3974->1625|4019->1648|4139->1732|4190->1774|4230->1776|4350->1864|4410->1892
                    LINES: 27->1|31->1|33->4|34->5|34->5|34->5|36->7|36->7|36->7|41->12|41->12|41->12|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|50->21|50->21|50->21|51->22|51->22|51->22|54->25|54->25|54->25|55->26|55->26|55->26|57->28|57->28|57->28|58->29|58->29|58->29|58->29|58->29|58->29|59->30|63->34|68->39|68->39|68->39|70->41|70->41|70->41|70->41|71->42|71->42|71->42|72->43|74->45|75->46|75->46|75->46|76->47|76->47|76->47|77->48|79->50|80->51|80->51|80->51|83->54|83->54|83->54|85->56|87->58
                    -- GENERATED --
                */
            