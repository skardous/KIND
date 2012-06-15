
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
object dateselection extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Long,Form[Evenement],Evenement,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, eventForm: Form[Evenement], event: Evenement):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main("Selectionner les jours")/*6.32*/ {_display_(Seq[Any](format.raw/*6.34*/("""
    
    <h2>Selectionner les jours:</h2>
    
           

      TITRE:&nbsp; """),_display_(Seq[Any](/*12.21*/event/*12.26*/.titre)),format.raw/*12.32*/(""" <br>  
      
        Date:  <div class="controls" id="date"></div> 
		
   		<ul class="controls" id="altField"> </ul>     	
				
        
        <a href=""""),_display_(Seq[Any](/*19.19*/routes/*19.25*/.Application.heureSelection(event.id))),format.raw/*19.62*/("""" class="btn btn-primary">Continuer</a>
        
    
    
	<script type="text/javascript" charset="utf-8">

		var optionsHeures = "";
		var optionsMinutes = "";
		var heuresList = new Array(); 
	

		$(function()"""),format.raw("""{"""),format.raw/*30.16*/("""  

			$( "#date" ).multiDatesPicker();

			$("#date").multiDatesPicker("""),format.raw("""{"""),format.raw/*34.33*/("""
				onSelect: function(date) """),format.raw("""{"""),format.raw/*35.31*/("""
					alert("select");
	   		"""),format.raw("""}"""),format.raw/*37.8*/("""
	   	"""),format.raw("""}"""),format.raw/*38.7*/("""); 
		"""),format.raw("""}"""),format.raw/*39.4*/(""");

	function ajouterDate(dateText) """),format.raw("""{"""),format.raw/*41.34*/("""
	  var str = dateText.replace("/", "");//efface le premier slash de la date
	  str = str.replace("/", "");//efface le premier slash de la date
	  $("#altField").append("<li id=\""+str+"\">"+ 
	  	"<a class=\"linkDate\" name=\""+dateText+"\">"+
	  	"<i class=\"mesicones icon-trash\"></i>&nbsp;"+
	  	"</a>"+dateText+		
	  	"</li>");
	"""),format.raw("""}"""),format.raw/*49.3*/("""

	$('.linkDate').live('click', function(e) """),format.raw("""{"""),format.raw/*51.44*/("""	  
		   $("#date").multiDatesPicker('removeDates', $(this).attr("name")); //enleve la date dans l'affichage du datepicker
		   $(this).parent().remove();
		   /*SUPPRESSION DE DATE*/
		   
		   $.ajax("""),format.raw("""{"""),format.raw/*56.14*/("""
		   	type: "POST",
		   	url: """"),_display_(Seq[Any](/*58.14*/routes/*58.20*/.Application.removeDate(id))),format.raw/*58.47*/("""",
		   	data: '"""),format.raw("""{"""),format.raw/*59.15*/(""""date" : "' + $(this).attr("name") + '""""),format.raw("""}"""),format.raw/*59.55*/("""',
		   	contentType: "application/json",
		   	success : function(data) """),format.raw("""{"""),format.raw/*61.33*/("""

		   	"""),format.raw("""}"""),format.raw/*63.8*/("""               
		   """),format.raw("""}"""),format.raw/*64.7*/(""");	

		"""),format.raw("""}"""),format.raw/*66.4*/(""");


	</script>
    
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 14 15:58:39 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/dateselection.scala.html
                    HASH: e48c09b4106f91a11359edfbb0951377e248eef4
                    MATRIX: 787->1|936->57|964->76|1001->79|1039->109|1078->111|1195->192|1209->197|1237->203|1431->361|1446->367|1505->404|1765->617|1885->690|1963->721|2039->751|2092->758|2145->765|2229->802|2611->1138|2703->1183|2953->1386|3023->1420|3038->1426|3087->1453|3151->1470|3238->1510|3359->1584|3414->1593|3482->1615|3536->1623
                    LINES: 27->1|31->1|33->4|35->6|35->6|35->6|41->12|41->12|41->12|48->19|48->19|48->19|59->30|63->34|64->35|66->37|67->38|68->39|70->41|78->49|80->51|85->56|87->58|87->58|87->58|88->59|88->59|90->61|92->63|93->64|95->66
                    -- GENERATED --
                */
            