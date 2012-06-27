
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


"""),_display_(Seq[Any](/*8.2*/main("Selectionner les jours")/*8.32*/ {_display_(Seq[Any](format.raw/*8.34*/("""

	<h2>Selectionner les jours:</h2>

	<div class="control-group"><label class="control-label"><b>Titre:&nbsp;</b></label> """),_display_(Seq[Any](/*12.87*/event/*12.92*/.titre)),format.raw/*12.98*/(""" </div> <br>

	<label class="control-label"><b>Date</b></label> <div class="controls" id="date"></div>

	<ul class="controls" id="altField"> </ul>

	"""),_display_(Seq[Any](/*18.3*/input(eventForm("dates"), '_label -> "")/*18.43*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*18.72*/("""
		<input type="hidden" name=""""),_display_(Seq[Any](/*19.31*/name)),format.raw/*19.35*/("""" id="myDates" """),_display_(Seq[Any](/*19.51*/toHtmlArgs(args))),format.raw/*19.67*/(""">
	""")))})),format.raw/*20.3*/("""

	"""),_display_(Seq[Any](/*22.3*/input(eventForm("heures"), '_label -> "")/*22.44*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*22.73*/("""
		<input type="hidden" name=""""),_display_(Seq[Any](/*23.31*/name)),format.raw/*23.35*/("""" id="myHours" """),_display_(Seq[Any](/*23.51*/toHtmlArgs(args))),format.raw/*23.67*/(""">
	""")))})),format.raw/*24.3*/("""

	<a href=""""),_display_(Seq[Any](/*26.12*/routes/*26.18*/.Application.heureSelection(event.id))),format.raw/*26.55*/("""" class="btn btn-primary">Continuer</a>



	<script type="text/javascript" charset="utf-8">

		$(function()"""),format.raw("""{"""),format.raw/*32.16*/("""

			$( "#date" ).multiDatesPicker();

			$( "#date" ).datepicker( "option", "minDate", 0);

			$("#date").multiDatesPicker("""),format.raw("""{"""),format.raw/*38.33*/("""				
				onSelect: function(date) """),format.raw("""{"""),format.raw/*39.31*/("""
					$( "#date" ).datepicker( "option", "minDate", 0);
					var selectionType = $.inArray(date, $( "#date" ).multiDatesPicker('getDates'));
					var d = new Date(date);		
					var dateText = d.toLocaleDateString();	
					
					if (selectionType != -1) """),format.raw("""{"""),format.raw/*45.32*/("""	
						$.ajax("""),format.raw("""{"""),format.raw/*46.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*48.15*/routes/*48.21*/.Application.addDate(id))),format.raw/*48.45*/("""",
							data: '"""),format.raw("""{"""),format.raw/*49.16*/(""""date" : "' + dateText + '""""),format.raw("""}"""),format.raw/*49.44*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*51.34*/("""											
								ajouterDate(date, data.idJour);							
							"""),format.raw("""}"""),format.raw/*53.9*/("""
						"""),format.raw("""}"""),format.raw/*54.8*/(""");	
					"""),format.raw("""}"""),format.raw/*55.7*/(""" else """),format.raw("""{"""),format.raw/*55.14*/("""					
						$.ajax("""),format.raw("""{"""),format.raw/*56.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*58.15*/routes/*58.21*/.Application.removeDate(id))),format.raw/*58.48*/("""",
							data: '"""),format.raw("""{"""),format.raw/*59.16*/(""""idDate" : "' + $("li:contains("+dateText+")").attr("id") + '""""),format.raw("""}"""),format.raw/*59.79*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*61.34*/("""
								
							"""),format.raw("""}"""),format.raw/*63.9*/("""
						"""),format.raw("""}"""),format.raw/*64.8*/(""");	
						$("li:contains("+dateText+")").remove();
					"""),format.raw("""}"""),format.raw/*66.7*/(""" 
				"""),format.raw("""}"""),format.raw/*67.6*/("""
			"""),format.raw("""}"""),format.raw/*68.5*/(""");
		"""),format.raw("""}"""),format.raw/*69.4*/(""");

		function ajouterDate(dateText, id) """),format.raw("""{"""),format.raw/*71.39*/("""			
			var d = new Date(dateText);		
			var date = d.toLocaleDateString();
			$("#altField").append(
				"<li id=\""+id+"\">"+
				"<a class=\"linkDate\" name=\""+dateText+"\">"+
				"<i class=\"mesicones icon-trash\"></i>&nbsp;"+
				"</a>"+date+	
				"</li>"
			);
		"""),format.raw("""}"""),format.raw/*81.4*/("""	

		$('.linkDate').live('click', function(e) """),format.raw("""{"""),format.raw/*83.45*/("""	
			$("#date").multiDatesPicker('removeDates', $(this).attr("name")); //enleve la date dans l'affichage du datepicker
			$(this).parent().remove();

			/*SUPPRESSION DE DATE*/			
			$.ajax("""),format.raw("""{"""),format.raw/*88.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*90.12*/routes/*90.18*/.Application.removeDate(id))),format.raw/*90.45*/("""",
				data: '"""),format.raw("""{"""),format.raw/*91.13*/(""""idDate" : "' + $(this).parent().attr("id") + '""""),format.raw("""}"""),format.raw/*91.62*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*93.31*/("""
					
				"""),format.raw("""}"""),format.raw/*95.6*/("""
			"""),format.raw("""}"""),format.raw/*96.5*/(""");	

		"""),format.raw("""}"""),format.raw/*98.4*/(""");

	</script>
    
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 26 08:44:23 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/dateselection.scala.html
                    HASH: 2de4bd591e55bfdff1dc64e538ddb49d51a4796a
                    MATRIX: 787->1|928->78|960->102|1044->57|1072->76|1100->156|1138->160|1176->190|1215->192|1374->315|1388->320|1416->326|1601->476|1650->516|1717->545|1784->576|1810->580|1862->596|1900->612|1935->616|1974->620|2024->661|2091->690|2158->721|2184->725|2236->741|2274->757|2309->761|2358->774|2373->780|2432->817|2587->925|2759->1050|2841->1085|3142->1339|3205->1355|3277->1391|3292->1397|3338->1421|3403->1439|3478->1467|3601->1543|3714->1610|3768->1618|3824->1628|3878->1635|3945->1655|4017->1691|4032->1697|4081->1724|4146->1742|4256->1805|4379->1881|4443->1899|4497->1907|4600->1964|4653->1971|4704->1976|4756->1982|4845->2024|5161->2294|5255->2341|5493->2532|5559->2562|5574->2568|5623->2595|5685->2610|5781->2659|5898->2729|5956->2741|6007->2746|6061->2754
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|41->12|41->12|41->12|47->18|47->18|47->18|48->19|48->19|48->19|48->19|49->20|51->22|51->22|51->22|52->23|52->23|52->23|52->23|53->24|55->26|55->26|55->26|61->32|67->38|68->39|74->45|75->46|77->48|77->48|77->48|78->49|78->49|80->51|82->53|83->54|84->55|84->55|85->56|87->58|87->58|87->58|88->59|88->59|90->61|92->63|93->64|95->66|96->67|97->68|98->69|100->71|110->81|112->83|117->88|119->90|119->90|119->90|120->91|120->91|122->93|124->95|125->96|127->98
                    -- GENERATED --
                */
            