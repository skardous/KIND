
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
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*13.54*/routes/*13.60*/.Assets.at("stylesheets/twitterBootstrap201/docs/assets/css/bootstrap.css"))),format.raw/*13.135*/("""">	
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.54*/routes/*14.60*/.Assets.at("stylesheets/main.css"))),format.raw/*14.94*/("""">
        <link rel='stylesheet' type='text/css' href=""""),_display_(Seq[Any](/*15.55*/routes/*15.61*/.Assets.at("stylesheets/fullcalendar.css"))),format.raw/*15.103*/("""" >
        <link rel='stylesheet' type='text/css' href=""""),_display_(Seq[Any](/*16.55*/routes/*16.61*/.Assets.at("stylesheets/fullcalendar.print.css"))),format.raw/*16.109*/("""" media='print' >
    		<script type="text/javascript" src=""""),_display_(Seq[Any](/*17.44*/routes/*17.50*/.Assets.at("javascripts/jquery-1.7.2.min.js"))),format.raw/*17.95*/(""""></script>
    		<script type="text/javascript" src=""""),_display_(Seq[Any](/*18.44*/routes/*18.50*/.Assets.at("javascripts/jquery-ui-1.8.21.custom.min.js"))),format.raw/*18.106*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*19.46*/routes/*19.52*/.Assets.at("javascripts/jquery.ui.datepicker-fr.js"))),format.raw/*19.104*/(""""></script>
    		<script type="text/javascript" src=""""),_display_(Seq[Any](/*20.44*/routes/*20.50*/.Assets.at("javascripts/jquery-ui.multidatespicker.js"))),format.raw/*20.105*/(""""></script>
    		<script type="text/javascript" src=""""),_display_(Seq[Any](/*21.44*/routes/*21.50*/.Assets.at("javascripts/eventForm.js"))),format.raw/*21.88*/(""""></script>    
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*22.46*/routes/*22.52*/.Assets.at("javascripts/fullcalendar/fullcalendar.js"))),format.raw/*22.106*/(""""></script>  
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*23.46*/routes/*23.52*/.Assets.at("javascripts/jquery.html5-placeholder-shim.js"))),format.raw/*23.110*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*24.46*/routes/*24.52*/.Assets.at("javascripts/webtoolkit.md5.js"))),format.raw/*24.95*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*25.46*/routes/*25.52*/.Assets.at("javascripts/base64encoding-decoding.js"))),format.raw/*25.104*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*26.46*/routes/*26.52*/.Assets.at("javascripts/styles.js"))),format.raw/*26.87*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*27.46*/routes/*27.52*/.Assets.at("javascripts/edition.js"))),format.raw/*27.88*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*28.46*/routes/*28.52*/.Assets.at("javascripts/suppression.js"))),format.raw/*28.92*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*29.46*/routes/*29.52*/.Assets.at("javascripts/sendMail.js"))),format.raw/*29.89*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*30.46*/routes/*30.52*/.Assets.at("javascripts/adminTools.js"))),format.raw/*30.91*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*31.46*/routes/*31.52*/.Assets.at("javascripts/ajoutPersonne.js"))),format.raw/*31.94*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*32.46*/routes/*32.52*/.Assets.at("javascripts/ajoutDateHoraire.js"))),format.raw/*32.97*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*33.46*/routes/*33.52*/.Assets.at("javascripts/supprDateHoraire.js"))),format.raw/*33.97*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*34.46*/routes/*34.52*/.Assets.at("javascripts/partobligatoire.js"))),format.raw/*34.96*/(""""></script>

  </head>
  <body>

    <div class="container">
        <div class="banner">
            <a href=""""),_display_(Seq[Any](/*41.23*/routes/*41.29*/.Application.index())),format.raw/*41.49*/("""">                
                <h1 style="text-align: center">KIND</h1>
                <div style="text-align: center"><b>K</b>ind <b>I</b>s <b>N</b>ot <b>D</b>oodle</div>
            </a>
        </div>
    </div>
    
    """),_display_(Seq[Any](/*48.6*/content)),format.raw/*48.13*/("""
      
   
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
                    DATE: Mon Aug 06 15:42:37 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/main.scala.html
                    HASH: a1e58c77baf984688f47168ac576de8dfa4e0cec
                    MATRIX: 759->1|899->31|927->67|1014->118|1041->123|1144->190|1159->196|1213->228|1290->269|1305->275|1393->340|1504->415|1519->421|1617->496|1710->553|1725->559|1781->593|1874->650|1889->656|1954->698|2048->756|2063->762|2134->810|2231->871|2246->877|2313->922|2404->977|2419->983|2498->1039|2591->1096|2606->1102|2681->1154|2772->1209|2787->1215|2865->1270|2956->1325|2971->1331|3031->1369|3128->1430|3143->1436|3220->1490|3315->1549|3330->1555|3411->1613|3504->1670|3519->1676|3584->1719|3677->1776|3692->1782|3767->1834|3860->1891|3875->1897|3932->1932|4025->1989|4040->1995|4098->2031|4191->2088|4206->2094|4268->2134|4361->2191|4376->2197|4435->2234|4528->2291|4543->2297|4604->2336|4697->2393|4712->2399|4776->2441|4869->2498|4884->2504|4951->2549|5044->2606|5059->2612|5126->2657|5219->2714|5234->2720|5300->2764|5448->2876|5463->2882|5505->2902|5770->3132|5799->3139
                    LINES: 27->1|31->1|33->4|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|47->18|47->18|47->18|48->19|48->19|48->19|49->20|49->20|49->20|50->21|50->21|50->21|51->22|51->22|51->22|52->23|52->23|52->23|53->24|53->24|53->24|54->25|54->25|54->25|55->26|55->26|55->26|56->27|56->27|56->27|57->28|57->28|57->28|58->29|58->29|58->29|59->30|59->30|59->30|60->31|60->31|60->31|61->32|61->32|61->32|62->33|62->33|62->33|63->34|63->34|63->34|70->41|70->41|70->41|77->48|77->48
                    -- GENERATED --
                */
            