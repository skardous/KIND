
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
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*13.54*/routes/*13.60*/.Assets.at("stylesheets/twitter-bootstrap-b261f97/docs/assets/css/bootstrap.css"))),format.raw/*13.141*/("""">	
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.54*/routes/*14.60*/.Assets.at("stylesheets/main.css"))),format.raw/*14.94*/("""">
        <link rel='stylesheet' type='text/css' href=""""),_display_(Seq[Any](/*15.55*/routes/*15.61*/.Assets.at("stylesheets/fullcalendar.css"))),format.raw/*15.103*/("""" >
        <link rel='stylesheet' type='text/css' href=""""),_display_(Seq[Any](/*16.55*/routes/*16.61*/.Assets.at("stylesheets/fullcalendar.print.css"))),format.raw/*16.109*/("""" media='print' >
    		<script type="text/javascript" src=""""),_display_(Seq[Any](/*17.44*/routes/*17.50*/.Assets.at("javascripts/jquery-1.3.2.min.js"))),format.raw/*17.95*/(""""></script>
    		<script type="text/javascript" src=""""),_display_(Seq[Any](/*18.44*/routes/*18.50*/.Assets.at("javascripts/jquery-ui-1.7.3.custom.min.js"))),format.raw/*18.105*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*19.46*/routes/*19.52*/.Assets.at("javascripts/jquery.ui.datepicker-fr.js"))),format.raw/*19.104*/(""""></script>
    		<script type="text/javascript" src=""""),_display_(Seq[Any](/*20.44*/routes/*20.50*/.Assets.at("javascripts/jquery-ui.multidatespicker.js"))),format.raw/*20.105*/(""""></script>
    		<script type="text/javascript" src=""""),_display_(Seq[Any](/*21.44*/routes/*21.50*/.Assets.at("javascripts/eventForm.js"))),format.raw/*21.88*/(""""></script>    
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*22.46*/routes/*22.52*/.Assets.at("javascripts/fullcalendar/fullcalendar.js"))),format.raw/*22.106*/(""""></script>  
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*23.46*/routes/*23.52*/.Assets.at("javascripts/jquery.html5-placeholder-shim.js"))),format.raw/*23.110*/(""""></script>

  </head>
    
    
    <body>



     <div class="navbar">
      <div class="navbar-inner">
        <div class="container">
         <ul class="nav">
          <li><a href=""""),_display_(Seq[Any](/*36.25*/routes/*36.31*/.Application.index())),format.raw/*36.51*/("""">Accueil</a></li>
          <li><a href=""""),_display_(Seq[Any](/*37.25*/routes/*37.31*/.Application.events())),format.raw/*37.52*/("""">Créer un événement</a></li>
          <!--<li><a href=""""),_display_(Seq[Any](/*38.29*/routes/*38.35*/.Application.eventlist())),format.raw/*38.59*/("""">Liste des evenements</a></li>-->
         </ul>			  
       </div>
     </div>	
   </div>
   
      """),_display_(Seq[Any](/*44.8*/content)),format.raw/*44.15*/("""

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
                    DATE: Fri Jul 20 11:28:13 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/main.scala.html
                    HASH: 1df2ad51510341dc0f61e99acbe4aa8721075467
                    MATRIX: 759->1|899->31|927->67|1014->118|1041->123|1144->190|1159->196|1213->228|1290->269|1305->275|1393->340|1504->415|1519->421|1623->502|1716->559|1731->565|1787->599|1880->656|1895->662|1960->704|2054->762|2069->768|2140->816|2237->877|2252->883|2319->928|2410->983|2425->989|2503->1044|2596->1101|2611->1107|2686->1159|2777->1214|2792->1220|2870->1275|2961->1330|2976->1336|3036->1374|3133->1435|3148->1441|3225->1495|3320->1554|3335->1560|3416->1618|3640->1806|3655->1812|3697->1832|3776->1875|3791->1881|3834->1902|3928->1960|3943->1966|3989->1990|4127->2093|4156->2100
                    LINES: 27->1|31->1|33->4|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|47->18|47->18|47->18|48->19|48->19|48->19|49->20|49->20|49->20|50->21|50->21|50->21|51->22|51->22|51->22|52->23|52->23|52->23|65->36|65->36|65->36|66->37|66->37|66->37|67->38|67->38|67->38|73->44|73->44
                    -- GENERATED --
                */
            