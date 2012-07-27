
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


"""),_display_(Seq[Any](/*7.2*/main("Liste des evenements")/*7.30*/ {_display_(Seq[Any](format.raw/*7.32*/("""
    
    <h1>"""),_display_(Seq[Any](/*9.10*/events/*9.16*/.size())),format.raw/*9.23*/(""" evenement(s)</h1>
    
	
  
    <ul>
        """),_display_(Seq[Any](/*14.10*/for(e <- events) yield /*14.26*/ {_display_(Seq[Any](format.raw/*14.28*/("""
            <li>
                """),_display_(Seq[Any](/*16.18*/e/*16.19*/.titre)),format.raw/*16.25*/(""" &nbsp;&nbsp; <br/>par:       
                """),_display_(Seq[Any](/*17.18*/e/*17.19*/.createur)),format.raw/*17.28*/(""" &nbsp;&nbsp; 
                
                <a class="expandLink"><i class="mesicones icon-plus"></i></a><br>
                <div class="expandEvt" style="display:none">
                    <div class="styleDates" >
                    Dates propos&eacute;es: <br/>
                    
                    
                    <input type="hidden" id="identifiants" value=""""),_display_(Seq[Any](/*25.68*/e/*25.69*/.id)),format.raw/*25.72*/("""">
                    <img id="image" src=""""),_display_(Seq[Any](/*26.43*/routes/*26.49*/.Assets.at("images/calendar.png"))),format.raw/*26.82*/(""""/>
                    
            		<ul>
                    """),_display_(Seq[Any](/*29.22*/for(jour <- e.jours) yield /*29.42*/ {_display_(Seq[Any](format.raw/*29.44*/("""
                     <li><b>"""),_display_(Seq[Any](/*30.30*/jour/*30.34*/.date)),format.raw/*30.39*/("""</b> &nbsp;
                    	<ul>
                    	"""),_display_(Seq[Any](/*32.23*/for(horaire <- jour.horaires) yield /*32.52*/ {_display_(Seq[Any](format.raw/*32.54*/("""
                    	  <li><i class="mesicones icon-time"></i>  """),_display_(Seq[Any](/*33.66*/horaire/*33.73*/.debut)),format.raw/*33.79*/(""" - """),_display_(Seq[Any](/*33.83*/horaire/*33.90*/.fin)),format.raw/*33.94*/("""</li>
                    	""")))})),format.raw/*34.23*/("""
                    	</ul>
                    	</li>
                     
                    """)))})),format.raw/*38.22*/("""
                    </ul>
                    </div>         
                    
                    Participants:<br/>
                    """),_display_(Seq[Any](/*43.22*/if(e.participants.size > 0)/*43.49*/ {_display_(Seq[Any](format.raw/*43.51*/("""
    	                <ul>
    	                """),_display_(Seq[Any](/*45.23*/e/*45.24*/.participants.map/*45.41*/ { personne =>_display_(Seq[Any](format.raw/*45.55*/("""
    	                    <li><i class="mesicones icon-user"></i>&nbsp;"""),_display_(Seq[Any](/*46.72*/personne/*46.80*/.nom)),format.raw/*46.84*/("""</li>
    	                """)))})),format.raw/*47.23*/("""
    	            	</ul>
                	""")))})),format.raw/*49.19*/(""" 
            	
                </div>
                 <!-- """),format.raw/*52.118*/("""  -->
                 <a href=""""),_display_(Seq[Any](/*53.28*/routes/*53.34*/.Application.edit(new sun.misc.BASE64Encoder().encode((e.id.toString).getBytes)))),format.raw/*53.114*/("""">Editer evenement</a> <br>        	
                
                
                """),_display_(Seq[Any](/*56.18*/form(routes.Application.deleteEvent(e.id))/*56.60*/ {_display_(Seq[Any](format.raw/*56.62*/("""
                    <input type="submit" value="Supprimer evenement">
                """)))})),format.raw/*58.18*/("""
            </li>
        """)))})),format.raw/*60.10*/("""
    </ul>
    
    <script type="text/javascript" charset="utf-8">
    	$(".expandLink").live("click", function() """),format.raw("""{"""),format.raw/*64.49*/("""
            if ($(this).siblings(".expandEvt").css("display") == "none") """),format.raw("""{"""),format.raw/*65.75*/("""                
                $(this).siblings(".expandEvt").removeAttr("style");
                $(this).html("<i class=\"mesicones icon-minus\"></i>")
            """),format.raw("""}"""),format.raw/*68.14*/(""" else """),format.raw("""{"""),format.raw/*68.21*/("""                
                $(this).siblings(".expandEvt").attr("style", "display:none");
                $(this).html("<i class=\"mesicones icon-plus\"></i>")
            """),format.raw("""}"""),format.raw/*71.14*/("""
        """),format.raw("""}"""),format.raw/*72.10*/(""")
    
    </script>
""")))})))}
    }
    
    def render(events:List[Evenement]) = apply(events)
    
    def f:((List[Evenement]) => play.api.templates.Html) = (events) => apply(events)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jul 27 09:12:12 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/eventlist.scala.html
                    HASH: b687b53a48cb717257a461cae11803c8e39189a8
                    MATRIX: 768->1|886->26|914->45|952->49|988->77|1027->79|1077->94|1091->100|1119->107|1202->154|1234->170|1274->172|1345->207|1355->208|1383->214|1467->262|1477->263|1508->272|1924->652|1934->653|1959->656|2040->701|2055->707|2110->740|2211->805|2247->825|2287->827|2353->857|2366->861|2393->866|2489->926|2534->955|2574->957|2676->1023|2692->1030|2720->1036|2760->1040|2776->1047|2802->1051|2862->1079|2992->1177|3172->1321|3208->1348|3248->1350|3333->1399|3343->1400|3369->1417|3421->1431|3529->1503|3546->1511|3572->1515|3632->1543|3707->1586|3797->1742|3866->1775|3881->1781|3984->1861|4108->1949|4159->1991|4199->1993|4319->2081|4379->2109|4542->2225|4664->2300|4880->2469|4934->2476|5159->2654|5216->2664
                    LINES: 27->1|31->1|33->4|36->7|36->7|36->7|38->9|38->9|38->9|43->14|43->14|43->14|45->16|45->16|45->16|46->17|46->17|46->17|54->25|54->25|54->25|55->26|55->26|55->26|58->29|58->29|58->29|59->30|59->30|59->30|61->32|61->32|61->32|62->33|62->33|62->33|62->33|62->33|62->33|63->34|67->38|72->43|72->43|72->43|74->45|74->45|74->45|74->45|75->46|75->46|75->46|76->47|78->49|81->52|82->53|82->53|82->53|85->56|85->56|85->56|87->58|89->60|93->64|94->65|97->68|97->68|100->71|101->72
                    -- GENERATED --
                */
            