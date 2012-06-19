
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

	<div class="control-group"><label class="control-label">TITRE:&nbsp;</label> """),_display_(Seq[Any](/*12.80*/event/*12.85*/.titre)),format.raw/*12.91*/(""" </div> <br>

	<label class="control-label">Date</label> <div class="controls" id="date"></div>

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

	$(function()"""),format.raw("""{"""),format.raw/*36.15*/("""

		$( "#date" ).multiDatesPicker();

		$("#date").multiDatesPicker("""),format.raw("""{"""),format.raw/*40.32*/("""
			
			onSelect: function(date) """),format.raw("""{"""),format.raw/*42.30*/("""
				var selectionType = $.inArray(date, $( "#date" ).multiDatesPicker('getDates'));
				var d = new Date(date);		
				var dateText = d.toLocaleDateString();	
				
				if (selectionType != -1) """),format.raw("""{"""),format.raw/*47.31*/("""	
					$.ajax("""),format.raw("""{"""),format.raw/*48.14*/("""
						type: "POST",
						url: """"),_display_(Seq[Any](/*50.14*/routes/*50.20*/.Application.addDate(id))),format.raw/*50.44*/("""",
						data: '"""),format.raw("""{"""),format.raw/*51.15*/(""""date" : "' + dateText + '""""),format.raw("""}"""),format.raw/*51.43*/("""',
						contentType: "application/json",
						success : function(data) """),format.raw("""{"""),format.raw/*53.33*/("""											
							ajouterDate(date, data.idJour);							
						"""),format.raw("""}"""),format.raw/*55.8*/("""
					"""),format.raw("""}"""),format.raw/*56.7*/(""");	
				"""),format.raw("""}"""),format.raw/*57.6*/(""" else """),format.raw("""{"""),format.raw/*57.13*/("""					
					$.ajax("""),format.raw("""{"""),format.raw/*58.14*/("""
						type: "POST",
						url: """"),_display_(Seq[Any](/*60.14*/routes/*60.20*/.Application.removeDate(id))),format.raw/*60.47*/("""",
						data: '"""),format.raw("""{"""),format.raw/*61.15*/(""""idDate" : "' + $("li:contains("+dateText+")").attr("id") + '""""),format.raw("""}"""),format.raw/*61.78*/("""',
						contentType: "application/json",
						success : function(data) """),format.raw("""{"""),format.raw/*63.33*/("""
							
						"""),format.raw("""}"""),format.raw/*65.8*/("""
					"""),format.raw("""}"""),format.raw/*66.7*/(""");	
					$("li:contains("+dateText+")").remove();
				"""),format.raw("""}"""),format.raw/*68.6*/(""" 
			"""),format.raw("""}"""),format.raw/*69.5*/("""
		"""),format.raw("""}"""),format.raw/*70.4*/(""");
	"""),format.raw("""}"""),format.raw/*71.3*/(""");

	function ajouterDate(dateText, id) """),format.raw("""{"""),format.raw/*73.38*/("""
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
	"""),format.raw("""}"""),format.raw/*85.3*/("""	

	$('.linkDate').live('click', function(e) """),format.raw("""{"""),format.raw/*87.44*/("""	
		$("#date").multiDatesPicker('removeDates', $(this).attr("name")); //enleve la date dans l'affichage du datepicker
		$(this).parent().remove();
		/*SUPPRESSION DE DATE*/
		
		$.ajax("""),format.raw("""{"""),format.raw/*92.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*94.11*/routes/*94.17*/.Application.removeDate(id))),format.raw/*94.44*/("""",
			data: '"""),format.raw("""{"""),format.raw/*95.12*/(""""idDate" : "' + $(this).parent().attr("id") + '""""),format.raw("""}"""),format.raw/*95.61*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*97.30*/("""
				
			"""),format.raw("""}"""),format.raw/*99.5*/("""
		"""),format.raw("""}"""),format.raw/*100.4*/(""");	

	"""),format.raw("""}"""),format.raw/*102.3*/(""");


	</script>
    
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 19 08:52:28 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/dateselection.scala.html
                    HASH: 61fe1e29565170df4a23d950491635b1d3c19488
                    MATRIX: 787->1|928->78|960->102|1044->57|1072->76|1100->156|1138->160|1176->190|1215->192|1367->308|1381->313|1409->319|1587->462|1636->502|1703->531|1770->562|1796->566|1848->582|1886->598|1921->602|1960->606|2010->647|2077->676|2144->707|2170->711|2222->727|2260->743|2295->747|2344->760|2359->766|2418->803|2655->993|2771->1062|2852->1096|3093->1290|3155->1305|3225->1339|3240->1345|3286->1369|3350->1386|3425->1414|3546->1488|3657->1553|3710->1560|3765->1569|3819->1576|3885->1595|3955->1629|3970->1635|4019->1662|4083->1679|4193->1742|4314->1816|4376->1832|4429->1839|4530->1894|4582->1900|4632->1904|4683->1909|4771->1950|5210->2343|5303->2389|5536->2575|5600->2603|5615->2609|5664->2636|5725->2650|5821->2699|5936->2767|5992->2777|6043->2781|6097->2788
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|41->12|41->12|41->12|47->18|47->18|47->18|48->19|48->19|48->19|48->19|49->20|51->22|51->22|51->22|52->23|52->23|52->23|52->23|53->24|55->26|55->26|55->26|65->36|69->40|71->42|76->47|77->48|79->50|79->50|79->50|80->51|80->51|82->53|84->55|85->56|86->57|86->57|87->58|89->60|89->60|89->60|90->61|90->61|92->63|94->65|95->66|97->68|98->69|99->70|100->71|102->73|114->85|116->87|121->92|123->94|123->94|123->94|124->95|124->95|126->97|128->99|129->100|131->102
                    -- GENERATED --
                */
            