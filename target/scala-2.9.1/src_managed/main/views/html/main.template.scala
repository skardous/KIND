
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
    		<script type="text/javascript" src=""""),_display_(Seq[Any](/*19.44*/routes/*19.50*/.Assets.at("javascripts/jquery-ui.multidatespicker.js"))),format.raw/*19.105*/(""""></script>
    		<script type="text/javascript" src=""""),_display_(Seq[Any](/*20.44*/routes/*20.50*/.Assets.at("javascripts/eventForm.js"))),format.raw/*20.88*/(""""></script>    
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*21.46*/routes/*21.52*/.Assets.at("javascripts/fullcalendar/fullcalendar.js"))),format.raw/*21.106*/(""""></script>  
  </head>
    
    
    <body>



     <div class="navbar">
      <div class="navbar-inner">
        <div class="container">
         <ul class="nav">
          <li><a href=""""),_display_(Seq[Any](/*33.25*/routes/*33.31*/.Application.index())),format.raw/*33.51*/("""">Accueil</a></li>
          <li><a href=""""),_display_(Seq[Any](/*34.25*/routes/*34.31*/.Application.events())),format.raw/*34.52*/("""">Creer un evenement</a></li>
          <!--<li><a href=""""),_display_(Seq[Any](/*35.29*/routes/*35.35*/.Application.eventlist())),format.raw/*35.59*/("""">Liste des evenements</a></li>-->
         </ul>			  
       </div>
     </div>	
   </div>
   
      """),_display_(Seq[Any](/*41.8*/content)),format.raw/*41.15*/("""

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
                    DATE: Mon Jul 16 08:27:31 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/main.scala.html
                    HASH: 117a91520021ae3d69a805c9e00f92db975527ea
                    MATRIX: 759->1|899->31|927->67|1014->118|1041->123|1144->190|1159->196|1213->228|1290->269|1305->275|1393->340|1504->415|1519->421|1623->502|1716->559|1731->565|1787->599|1880->656|1895->662|1960->704|2054->762|2069->768|2140->816|2237->877|2252->883|2319->928|2410->983|2425->989|2503->1044|2594->1099|2609->1105|2687->1160|2778->1215|2793->1221|2853->1259|2950->1320|2965->1326|3042->1380|3267->1569|3282->1575|3324->1595|3403->1638|3418->1644|3461->1665|3555->1723|3570->1729|3616->1753|3754->1856|3783->1863
                    LINES: 27->1|31->1|33->4|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|47->18|47->18|47->18|48->19|48->19|48->19|49->20|49->20|49->20|50->21|50->21|50->21|62->33|62->33|62->33|63->34|63->34|63->34|64->35|64->35|64->35|70->41|70->41
                    -- GENERATED --
                */
            