
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

		var optionsHeures = "";
		var optionsMinutes = "";
		var heuresList = new Array();

		$(function()"""),format.raw("""{"""),format.raw/*36.16*/("""

			$( "#date" ).multiDatesPicker();

			$( "#date" ).datepicker( "option", "minDate", 0);

			$("#date").multiDatesPicker("""),format.raw("""{"""),format.raw/*42.33*/("""				
				onSelect: function(date) """),format.raw("""{"""),format.raw/*43.31*/("""
					$( "#date" ).datepicker( "option", "minDate", 0);
					var selectionType = $.inArray(date, $( "#date" ).multiDatesPicker('getDates'));
					var d = new Date(date);		
					var dateText = d.toLocaleDateString();	
					
					if (selectionType != -1) """),format.raw("""{"""),format.raw/*49.32*/("""	
						$.ajax("""),format.raw("""{"""),format.raw/*50.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*52.15*/routes/*52.21*/.Application.addDate(id))),format.raw/*52.45*/("""",
							data: '"""),format.raw("""{"""),format.raw/*53.16*/(""""date" : "' + dateText + '""""),format.raw("""}"""),format.raw/*53.44*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*55.34*/("""											
								ajouterDate(date, data.idJour);							
							"""),format.raw("""}"""),format.raw/*57.9*/("""
						"""),format.raw("""}"""),format.raw/*58.8*/(""");	
					"""),format.raw("""}"""),format.raw/*59.7*/(""" else """),format.raw("""{"""),format.raw/*59.14*/("""					
						$.ajax("""),format.raw("""{"""),format.raw/*60.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*62.15*/routes/*62.21*/.Application.removeDate(id))),format.raw/*62.48*/("""",
							data: '"""),format.raw("""{"""),format.raw/*63.16*/(""""idDate" : "' + $("li:contains("+dateText+")").attr("id") + '""""),format.raw("""}"""),format.raw/*63.79*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*65.34*/("""
								
							"""),format.raw("""}"""),format.raw/*67.9*/("""
						"""),format.raw("""}"""),format.raw/*68.8*/(""");	
						$("li:contains("+dateText+")").remove();
					"""),format.raw("""}"""),format.raw/*70.7*/(""" 
				"""),format.raw("""}"""),format.raw/*71.6*/("""
			"""),format.raw("""}"""),format.raw/*72.5*/(""");
		"""),format.raw("""}"""),format.raw/*73.4*/(""");

		function ajouterDate(dateText, id) """),format.raw("""{"""),format.raw/*75.39*/("""
			var str = dateText.replace("/", "");//efface le premier slash de la date
			str = str.replace("/", "");//efface le 2e slash de la date
			var d = new Date(dateText);		
			var date = d.toLocaleDateString();
			$("#altField").append(
				"<li id=\""+id+"\">"+
				"<a class=\"linkDate\" name=\""+dateText+"\">"+
				"<i class=\"mesicones icon-trash\"></i>&nbsp;"+
				"</a>"+date+	
				"</li>"
			);
		"""),format.raw("""}"""),format.raw/*87.4*/("""	

		$('.linkDate').live('click', function(e) """),format.raw("""{"""),format.raw/*89.45*/("""	
			$("#date").multiDatesPicker('removeDates', $(this).attr("name")); //enleve la date dans l'affichage du datepicker
			$(this).parent().remove();
			/*SUPPRESSION DE DATE*/
			
			$.ajax("""),format.raw("""{"""),format.raw/*94.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*96.12*/routes/*96.18*/.Application.removeDate(id))),format.raw/*96.45*/("""",
				data: '"""),format.raw("""{"""),format.raw/*97.13*/(""""idDate" : "' + $(this).parent().attr("id") + '""""),format.raw("""}"""),format.raw/*97.62*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*99.31*/("""
					
				"""),format.raw("""}"""),format.raw/*101.6*/("""
			"""),format.raw("""}"""),format.raw/*102.5*/(""");	

		"""),format.raw("""}"""),format.raw/*104.4*/(""");

	</script>
    
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 22 11:20:26 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/dateselection.scala.html
                    HASH: bd1f749dfa003d23262ab71f2296b0ad6f1e8f6b
                    MATRIX: 787->1|928->78|960->102|1044->57|1072->76|1100->156|1138->160|1176->190|1215->192|1374->315|1388->320|1416->326|1601->476|1650->516|1717->545|1784->576|1810->580|1862->596|1900->612|1935->616|1974->620|2024->661|2091->690|2158->721|2184->725|2236->741|2274->757|2309->761|2358->774|2373->780|2432->817|2673->1011|2845->1136|2927->1171|3228->1425|3291->1441|3363->1477|3378->1483|3424->1507|3489->1525|3564->1553|3687->1629|3800->1696|3854->1704|3910->1714|3964->1721|4031->1741|4103->1777|4118->1783|4167->1810|4232->1828|4342->1891|4465->1967|4529->1985|4583->1993|4686->2050|4739->2057|4790->2062|4842->2068|4931->2110|5382->2515|5476->2562|5714->2753|5780->2783|5795->2789|5844->2816|5906->2831|6002->2880|6119->2950|6178->2962|6230->2967|6285->2975
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|41->12|41->12|41->12|47->18|47->18|47->18|48->19|48->19|48->19|48->19|49->20|51->22|51->22|51->22|52->23|52->23|52->23|52->23|53->24|55->26|55->26|55->26|65->36|71->42|72->43|78->49|79->50|81->52|81->52|81->52|82->53|82->53|84->55|86->57|87->58|88->59|88->59|89->60|91->62|91->62|91->62|92->63|92->63|94->65|96->67|97->68|99->70|100->71|101->72|102->73|104->75|116->87|118->89|123->94|125->96|125->96|125->96|126->97|126->97|128->99|130->101|131->102|133->104
                    -- GENERATED --
                */
            