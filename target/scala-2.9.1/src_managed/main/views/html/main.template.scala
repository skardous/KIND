
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
    		<script type="text/javascript" src=""""),_display_(Seq[Any](/*15.44*/routes/*15.50*/.Assets.at("javascripts/jquery-1.3.2.min.js"))),format.raw/*15.95*/(""""></script>
    		<script type="text/javascript" src=""""),_display_(Seq[Any](/*16.44*/routes/*16.50*/.Assets.at("javascripts/jquery-ui-1.7.3.custom.min.js"))),format.raw/*16.105*/(""""></script>
    		<script type="text/javascript" src=""""),_display_(Seq[Any](/*17.44*/routes/*17.50*/.Assets.at("javascripts/jquery-ui.multidatespicker.js"))),format.raw/*17.105*/(""""></script>
    		<script type="text/javascript" src=""""),_display_(Seq[Any](/*18.44*/routes/*18.50*/.Assets.at("javascripts/eventForm.js"))),format.raw/*18.88*/(""""></script>    
  </head>
    
    
    <body>



     <div class="navbar">
      <div class="navbar-inner">
        <div class="container">
         <ul class="nav">
           <li><a href=""""),_display_(Seq[Any](/*30.26*/routes/*30.32*/.Application.events())),format.raw/*30.53*/("""">Creer un evenement</a></li>
           <li><a href=""""),_display_(Seq[Any](/*31.26*/routes/*31.32*/.Application.eventlist())),format.raw/*31.56*/("""">Liste des evenements</a></li>
         </ul>			  
       </div>
     </div>	
   </div>
   
      """),_display_(Seq[Any](/*37.8*/content)),format.raw/*37.15*/("""

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
                    DATE: Tue Jun 26 09:41:05 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/main.scala.html
                    HASH: a1513686682c4bbe014fc946ff004265f4d03502
                    MATRIX: 759->1|899->31|927->67|1014->118|1041->123|1144->190|1159->196|1213->228|1290->269|1305->275|1393->340|1504->415|1519->421|1623->502|1716->559|1731->565|1787->599|1869->645|1884->651|1951->696|2042->751|2057->757|2135->812|2226->867|2241->873|2319->928|2410->983|2425->989|2485->1027|2713->1219|2728->1225|2771->1246|2862->1301|2877->1307|2923->1331|3058->1431|3087->1438
                    LINES: 27->1|31->1|33->4|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|47->18|47->18|47->18|59->30|59->30|59->30|60->31|60->31|60->31|66->37|66->37
                    -- GENERATED --
                */
            