
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

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 


"""),_display_(Seq[Any](/*8.2*/main("Creer un evenement")/*8.28*/ {_display_(Seq[Any](format.raw/*8.30*/("""
    
    <h2>Selectionner les dates/horaires:</h2>
    
           

      <div class="control-group"><label class="control-label">TITRE:&nbsp;</label> """),_display_(Seq[Any](/*14.85*/event/*14.90*/.getTitre)),format.raw/*14.99*/(""" </div>  <br>  
      
        <label class="control-label">Date</label> <div class="controls" id="date"></div> 
		
   		<ul class="controls" id="altField"> </ul> 
    	
    	"""),_display_(Seq[Any](/*20.7*/input(eventForm("dates"), '_label -> "")/*20.47*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*20.76*/("""
		    <input type="hidden" name=""""),_display_(Seq[Any](/*21.35*/name)),format.raw/*21.39*/("""" id="myDates" """),_display_(Seq[Any](/*21.55*/toHtmlArgs(args))),format.raw/*21.71*/(""">
		""")))})),format.raw/*22.4*/("""
		
		"""),_display_(Seq[Any](/*24.4*/input(eventForm("heures"), '_label -> "")/*24.45*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*24.74*/("""
		    <input type="hidden" name=""""),_display_(Seq[Any](/*25.35*/name)),format.raw/*25.39*/("""" id="myHours" """),_display_(Seq[Any](/*25.55*/toHtmlArgs(args))),format.raw/*25.71*/(""">
		""")))})),format.raw/*26.4*/("""
				
        
        <a href=""""),_display_(Seq[Any](/*29.19*/routes/*29.25*/.Application.heureSelection(event.getId))),format.raw/*29.65*/("""" class="btn btn-primary">Continuer</a>
        
    
    
	<script type="text/javascript" charset="utf-8">

		var optionsHeures = "";
		var optionsMinutes = "";
		var heuresList = new Array(); 
	

	$(function()"""),format.raw("""{"""),format.raw/*40.15*/("""  
		
		$( "#date" ).multiDatesPicker();
		
		$("#date").multiDatesPicker("""),format.raw("""{"""),format.raw/*44.32*/("""
	   		onSelect: function(dateText) """),format.raw("""{"""),format.raw/*45.37*/("""
	   		    var selectionType = $.inArray(dateText, $( "#date" ).multiDatesPicker('getDates'));
	   		    if (selectionType == -1) """),format.raw("""{"""),format.raw/*47.37*/("""
	   		      var str = dateText.replace("/", "");
	   		      str = str.replace("/", "");
	   		      	   		      
	   		      $("#"+str).remove();
	   		    """),format.raw("""}"""),format.raw/*52.12*/("""
	   		
	   		  	$(".areload").html("");
	   			$(".areload").html(
	   			    """"),_display_(Seq[Any](/*56.14*/for(jour <- event.jours) yield /*56.38*/ {_display_(Seq[Any](format.raw/*56.40*/(""""+
        	   "<li>"""),_display_(Seq[Any](/*57.19*/jour/*57.23*/.date)),format.raw/*57.28*/(""" &nbsp;"+
           		"</li>""")))})),format.raw/*58.21*/(""""
	   			    );
	   			$.ajax("""),format.raw("""{"""),format.raw/*60.16*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*62.13*/routes/*62.19*/.Application.addDate(id))),format.raw/*62.43*/("""",
					data: '"""),format.raw("""{"""),format.raw/*63.14*/(""""date" : "' + dateText + '""""),format.raw("""}"""),format.raw/*63.42*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*65.32*/("""
					  if (selectionType != -1) """),format.raw("""{"""),format.raw/*66.34*/("""					
						  ajouterDate(dateText);
					  """),format.raw("""}"""),format.raw/*68.9*/("""
					"""),format.raw("""}"""),format.raw/*69.7*/("""               
				"""),format.raw("""}"""),format.raw/*70.6*/(""");		
	    	"""),format.raw("""}"""),format.raw/*71.8*/("""
		"""),format.raw("""}"""),format.raw/*72.4*/("""); 
	"""),format.raw("""}"""),format.raw/*73.3*/(""");
	
	function ajouterDate(dateText) """),format.raw("""{"""),format.raw/*75.34*/("""
	  var str = dateText.replace("/", "");
	  str = str.replace("/", "");
			$("#altField").append("<li id=\""+str+"\">"+ 
		"<a class=\"linkDate\" name=\""+dateText+"\">"+
		"<i class=\"icon-trash\"></i>&nbsp;"+
		"</a>"+dateText+		
		"</li>");
	"""),format.raw("""}"""),format.raw/*83.3*/("""	

	$('.linkDate').live('click', function(e) """),format.raw("""{"""),format.raw/*85.44*/("""	  
	   $("#date").multiDatesPicker('removeDates', $(this).attr("name")); //enleve la date dans l'affichage du datepicker
	   $(this).parent().remove();
	   /*SUPPRESSION DE DATE*/
	   
	   $.ajax("""),format.raw("""{"""),format.raw/*90.13*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*92.11*/routes/*92.17*/.Application.removeDate(id))),format.raw/*92.44*/("""",
			data: '"""),format.raw("""{"""),format.raw/*93.12*/(""""date" : "' + $(this).attr("name") + '""""),format.raw("""}"""),format.raw/*93.52*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*95.30*/("""
			  
			"""),format.raw("""}"""),format.raw/*97.5*/("""               
		"""),format.raw("""}"""),format.raw/*98.4*/(""");	
	   
	"""),format.raw("""}"""),format.raw/*100.3*/(""");


	</script>
    
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 04 15:48:37 CEST 2012
                    SOURCE: C:/tutoPlay/doodle/app/views/dateselection.scala.html
                    HASH: f22d83f713f0281edd30dd623e0f3b17fac95d1a
                    MATRIX: 787->1|928->78|960->102|1044->57|1072->76|1100->156|1139->161|1173->187|1212->189|1402->343|1416->348|1447->357|1658->533|1707->573|1774->602|1845->637|1871->641|1923->657|1961->673|1997->678|2039->685|2089->726|2156->755|2227->790|2253->794|2305->810|2343->826|2379->831|2448->864|2463->870|2525->910|2784->1122|2906->1197|2990->1234|3168->1365|3374->1524|3491->1605|3531->1629|3571->1631|3628->1652|3641->1656|3668->1661|3730->1691|3808->1722|3876->1754|3891->1760|3937->1784|4000->1800|4075->1828|4194->1900|4275->1934|4366->1979|4419->1986|4486->2007|4544->2019|4594->2023|4646->2029|4731->2067|5023->2313|5116->2359|5361->2557|5425->2585|5440->2591|5489->2618|5550->2632|5637->2672|5752->2740|5809->2751|5874->2770|5932->2781
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|43->14|43->14|43->14|49->20|49->20|49->20|50->21|50->21|50->21|50->21|51->22|53->24|53->24|53->24|54->25|54->25|54->25|54->25|55->26|58->29|58->29|58->29|69->40|73->44|74->45|76->47|81->52|85->56|85->56|85->56|86->57|86->57|86->57|87->58|89->60|91->62|91->62|91->62|92->63|92->63|94->65|95->66|97->68|98->69|99->70|100->71|101->72|102->73|104->75|112->83|114->85|119->90|121->92|121->92|121->92|122->93|122->93|124->95|126->97|127->98|129->100
                    -- GENERATED --
                */
            