
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
                    DATE: Tue Aug 07 13:04:52 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/main.scala.html
                    HASH: 97da8c4f3b36283724b42b902f32e63a0f495956
                    MATRIX: 759->1|899->31|927->67|1014->118|1041->123|1144->190|1159->196|1213->228|1290->269|1305->275|1393->340|1504->415|1519->421|1580->460|1673->517|1688->523|1744->557|1837->614|1852->620|1917->662|2011->720|2026->726|2097->774|2194->835|2209->841|2276->886|2367->941|2382->947|2461->1003|2554->1060|2569->1066|2644->1118|2735->1173|2750->1179|2828->1234|2919->1289|2934->1295|2994->1333|3091->1394|3106->1400|3183->1454|3278->1513|3293->1519|3374->1577|3467->1634|3482->1640|3547->1683|3640->1740|3655->1746|3730->1798|3823->1855|3838->1861|3895->1896|3988->1953|4003->1959|4061->1995|4154->2052|4169->2058|4231->2098|4324->2155|4339->2161|4398->2198|4491->2255|4506->2261|4567->2300|4660->2357|4675->2363|4739->2405|4832->2462|4847->2468|4914->2513|5007->2570|5022->2576|5089->2621|5182->2678|5197->2684|5263->2728|5411->2840|5426->2846|5468->2866|5733->3096|5762->3103
                    LINES: 27->1|31->1|33->4|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|47->18|47->18|47->18|48->19|48->19|48->19|49->20|49->20|49->20|50->21|50->21|50->21|51->22|51->22|51->22|52->23|52->23|52->23|53->24|53->24|53->24|54->25|54->25|54->25|55->26|55->26|55->26|56->27|56->27|56->27|57->28|57->28|57->28|58->29|58->29|58->29|59->30|59->30|59->30|60->31|60->31|60->31|61->32|61->32|61->32|62->33|62->33|62->33|63->34|63->34|63->34|70->41|70->41|70->41|77->48|77->48
                    -- GENERATED --
                */
            