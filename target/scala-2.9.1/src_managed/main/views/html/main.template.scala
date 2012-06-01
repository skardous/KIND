
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
		<script type="text/javascript" src=""""),_display_(Seq[Any](/*15.40*/routes/*15.46*/.Assets.at("javascripts/jquery-1.3.2.min.js"))),format.raw/*15.91*/(""""></script>
		<script type="text/javascript" src=""""),_display_(Seq[Any](/*16.40*/routes/*16.46*/.Assets.at("javascripts/jquery-ui-1.7.3.custom.min.js"))),format.raw/*16.101*/(""""></script>
		<script type="text/javascript" src=""""),_display_(Seq[Any](/*17.40*/routes/*17.46*/.Assets.at("javascripts/jquery-ui.multidatespicker.js"))),format.raw/*17.101*/(""""></script>
		<script type="text/javascript" src=""""),_display_(Seq[Any](/*18.40*/routes/*18.46*/.Assets.at("javascripts/eventForm.js"))),format.raw/*18.84*/(""""></script>
    </head>
    
    
    <body>
     
        
        
           <div class="navbar">
    		<div class="navbar-inner">
 				 <div class="container">
   				    <ul class="nav">
					<li><a href=""""),_display_(Seq[Any](/*30.20*/routes/*30.26*/.Application.events())),format.raw/*30.47*/("""">Creer un evenement</a></li>
					 <li><a href=""""),_display_(Seq[Any](/*31.21*/routes/*31.27*/.Application.eventlist())),format.raw/*31.51*/("""">Liste des evenements</a></li>
					 </ul>			  
			 </div>
	 	</div>	
  </div>
        
       
        """),_display_(Seq[Any](/*38.10*/content)),format.raw/*38.17*/("""
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
                    DATE: Fri Jun 01 09:53:52 CEST 2012
                    SOURCE: C:/tutoPlay/doodle/app/views/main.scala.html
                    HASH: 2e81b70381091108429ee4d8b0955de10976eded
                    MATRIX: 759->1|899->31|927->67|1016->120|1043->125|1146->192|1161->198|1215->230|1292->271|1307->277|1395->342|1506->417|1521->423|1625->504|1718->561|1733->567|1789->601|1867->643|1882->649|1949->694|2036->745|2051->751|2129->806|2216->857|2231->863|2309->918|2396->969|2411->975|2471->1013|2718->1224|2733->1230|2776->1251|2862->1301|2877->1307|2923->1331|3065->1437|3094->1444
                    LINES: 27->1|31->1|33->4|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|47->18|47->18|47->18|59->30|59->30|59->30|60->31|60->31|60->31|67->38|67->38
                    -- GENERATED --
                */
            