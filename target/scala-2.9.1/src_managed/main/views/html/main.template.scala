
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {import helper.twitterBootstrap._


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*4.1*/("""

<!DOCTYPE html>

<html>
  <head>
        <title>"""),_display_(Seq[Any](/*10.17*/title)),format.raw/*10.22*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/(""""> 
        <link type="text/css" href=""""),_display_(Seq[Any](/*12.38*/routes/*12.44*/.Assets.at("stylesheets/ui-lightness/jquery-ui-1.7.3.custom.css"))),format.raw/*12.109*/("""" rel="stylesheet" />
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*13.54*/routes/*13.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*13.99*/("""">	
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.54*/routes/*14.60*/.Assets.at("stylesheets/main.css"))),format.raw/*14.94*/("""">
        <link rel='stylesheet' type='text/css' href=""""),_display_(Seq[Any](/*15.55*/routes/*15.61*/.Assets.at("stylesheets/fullcalendar.css"))),format.raw/*15.103*/("""" >
        <link rel='stylesheet' type='text/css' href=""""),_display_(Seq[Any](/*16.55*/routes/*16.61*/.Assets.at("stylesheets/fullcalendar.print.css"))),format.raw/*16.109*/("""" media='print' >
		<script type="text/javascript" src=""""),_display_(Seq[Any](/*17.40*/routes/*17.46*/.Assets.at("javascripts/jquery-1.7.2.min.js"))),format.raw/*17.91*/(""""></script>
		<script type="text/javascript" src=""""),_display_(Seq[Any](/*18.40*/routes/*18.46*/.Assets.at("javascripts/jquery-ui-1.8.21.custom.min.js"))),format.raw/*18.102*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*19.46*/routes/*19.52*/.Assets.at("javascripts/jquery.ui.datepicker-fr.js"))),format.raw/*19.104*/(""""></script>
		<script type="text/javascript" src=""""),_display_(Seq[Any](/*20.40*/routes/*20.46*/.Assets.at("javascripts/jquery-ui.multidatespicker.js"))),format.raw/*20.101*/(""""></script>
		<script type="text/javascript" src=""""),_display_(Seq[Any](/*21.40*/routes/*21.46*/.Assets.at("javascripts/eventForm.js"))),format.raw/*21.84*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*22.46*/routes/*22.52*/.Assets.at("javascripts/tooltips.js"))),format.raw/*22.89*/(""""></script>    
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*23.46*/routes/*23.52*/.Assets.at("javascripts/popover.js"))),format.raw/*23.88*/(""""></script> 
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*24.46*/routes/*24.52*/.Assets.at("javascripts/fullcalendar/fullcalendar.js"))),format.raw/*24.106*/(""""></script>  
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*25.46*/routes/*25.52*/.Assets.at("javascripts/jquery.html5-placeholder-shim.js"))),format.raw/*25.110*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*26.46*/routes/*26.52*/.Assets.at("javascripts/webtoolkit.md5.js"))),format.raw/*26.95*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*27.46*/routes/*27.52*/.Assets.at("javascripts/base64encoding-decoding.js"))),format.raw/*27.104*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*28.46*/routes/*28.52*/.Assets.at("javascripts/styles.js"))),format.raw/*28.87*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*29.46*/routes/*29.52*/.Assets.at("javascripts/edition.js"))),format.raw/*29.88*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*30.46*/routes/*30.52*/.Assets.at("javascripts/suppression.js"))),format.raw/*30.92*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*31.46*/routes/*31.52*/.Assets.at("javascripts/sendMail.js"))),format.raw/*31.89*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*32.46*/routes/*32.52*/.Assets.at("javascripts/adminTools.js"))),format.raw/*32.91*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*33.46*/routes/*33.52*/.Assets.at("javascripts/ajoutPersonne.js"))),format.raw/*33.94*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*34.46*/routes/*34.52*/.Assets.at("javascripts/ajoutDateHoraire.js"))),format.raw/*34.97*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*35.46*/routes/*35.52*/.Assets.at("javascripts/supprDateHoraire.js"))),format.raw/*35.97*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*36.46*/routes/*36.52*/.Assets.at("javascripts/partobligatoire.js"))),format.raw/*36.96*/(""""></script>

  </head>
  <body>

    <div class="container">
        <div class="banner">
            <a href=""""),_display_(Seq[Any](/*43.23*/routes/*43.29*/.Application.index())),format.raw/*43.49*/("""">                
                <h1 style="text-align: center">KIND</h1>
                <div style="text-align: center"><b>K</b>ind <b>I</b>s <b>N</b>ot <b>D</b>oodle</div>
            </a>
        </div>
    </div>
    
    """),_display_(Seq[Any](/*50.6*/content)),format.raw/*50.13*/("""
      
   
 </body>
</html>


"""))}
    }
    
    def render(title:String,content:Html) = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Aug 09 14:57:57 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/main.scala.html
                    HASH: 6c9bf7a447de8b65c8ff7ce21dea4734c0f894d1
                    MATRIX: 759->1|899->31|927->67|1014->118|1041->123|1144->190|1159->196|1213->228|1290->269|1305->275|1393->340|1504->415|1519->421|1580->460|1673->517|1688->523|1744->557|1837->614|1852->620|1917->662|2011->720|2026->726|2097->774|2190->831|2205->837|2272->882|2359->933|2374->939|2453->995|2546->1052|2561->1058|2636->1110|2723->1161|2738->1167|2816->1222|2903->1273|2918->1279|2978->1317|3071->1374|3086->1380|3145->1417|3242->1478|3257->1484|3315->1520|3409->1578|3424->1584|3501->1638|3596->1697|3611->1703|3692->1761|3785->1818|3800->1824|3865->1867|3958->1924|3973->1930|4048->1982|4141->2039|4156->2045|4213->2080|4306->2137|4321->2143|4379->2179|4472->2236|4487->2242|4549->2282|4642->2339|4657->2345|4716->2382|4809->2439|4824->2445|4885->2484|4978->2541|4993->2547|5057->2589|5150->2646|5165->2652|5232->2697|5325->2754|5340->2760|5407->2805|5500->2862|5515->2868|5581->2912|5729->3024|5744->3030|5786->3050|6051->3280|6080->3287
                    LINES: 27->1|31->1|33->4|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|47->18|47->18|47->18|48->19|48->19|48->19|49->20|49->20|49->20|50->21|50->21|50->21|51->22|51->22|51->22|52->23|52->23|52->23|53->24|53->24|53->24|54->25|54->25|54->25|55->26|55->26|55->26|56->27|56->27|56->27|57->28|57->28|57->28|58->29|58->29|58->29|59->30|59->30|59->30|60->31|60->31|60->31|61->32|61->32|61->32|62->33|62->33|62->33|63->34|63->34|63->34|64->35|64->35|64->35|65->36|65->36|65->36|72->43|72->43|72->43|79->50|79->50
                    -- GENERATED --
                */
            