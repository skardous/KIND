
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

	OU<br>

	Ajouter une date particulière: (ex: tous les jeudis)<br>
	<input class="particuliere" type="text"> <a id="okParticuliere" class="btn btn-success"> OK </a>

	<ul class="controls" id="altField"> </ul>

	

	<a href=""""),_display_(Seq[Any](/*25.12*/routes/*25.18*/.Application.heureSelection(event.id))),format.raw/*25.55*/("""" class="btn btn-primary">Continuer</a>



	<script type="text/javascript" charset="utf-8">

		$(function()"""),format.raw("""{"""),format.raw/*31.16*/("""

			$( "#date" ).multiDatesPicker();

			$( "#date" ).datepicker( "option", "minDate", 0);

			$("#date").multiDatesPicker("""),format.raw("""{"""),format.raw/*37.33*/("""				
				onSelect: function(date) """),format.raw("""{"""),format.raw/*38.31*/("""
					$( "#date" ).datepicker( "option", "minDate", 0);
					var selectionType = $.inArray(date, $( "#date" ).multiDatesPicker('getDates'));
					var d = new Date(date);		
					var dateText = d.toLocaleDateString();	
					
					if (selectionType != -1) """),format.raw("""{"""),format.raw/*44.32*/("""	
						$.ajax("""),format.raw("""{"""),format.raw/*45.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*47.15*/routes/*47.21*/.Application.addDate(id))),format.raw/*47.45*/("""",
							data: '"""),format.raw("""{"""),format.raw/*48.16*/(""""date" : "' + dateText + '""""),format.raw("""}"""),format.raw/*48.44*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*50.34*/("""											
								ajouterDate(date, data.idJour);							
							"""),format.raw("""}"""),format.raw/*52.9*/("""
						"""),format.raw("""}"""),format.raw/*53.8*/(""");	
					"""),format.raw("""}"""),format.raw/*54.7*/(""" else """),format.raw("""{"""),format.raw/*54.14*/("""					
						$.ajax("""),format.raw("""{"""),format.raw/*55.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*57.15*/routes/*57.21*/.Application.removeDate(id))),format.raw/*57.48*/("""",
							data: '"""),format.raw("""{"""),format.raw/*58.16*/(""""idDate" : "' + $("li:contains("+dateText+")").attr("id") + '""""),format.raw("""}"""),format.raw/*58.79*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*60.34*/("""
								
							"""),format.raw("""}"""),format.raw/*62.9*/("""
						"""),format.raw("""}"""),format.raw/*63.8*/(""");	
						$("li:contains("+dateText+")").remove();
					"""),format.raw("""}"""),format.raw/*65.7*/(""" 
				"""),format.raw("""}"""),format.raw/*66.6*/("""
			"""),format.raw("""}"""),format.raw/*67.5*/(""");
		"""),format.raw("""}"""),format.raw/*68.4*/(""");

		$("#okParticuliere").live("click", function() """),format.raw("""{"""),format.raw/*70.50*/("""
			$.ajax("""),format.raw("""{"""),format.raw/*71.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*73.12*/routes/*73.18*/.Application.addDate(id))),format.raw/*73.42*/("""",
				data: '"""),format.raw("""{"""),format.raw/*74.13*/(""""date" : "' + $(".particuliere").val() + '""""),format.raw("""}"""),format.raw/*74.57*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*76.31*/("""											
					$("#altField").append(
						"<li id=\""+data.idJour+"\">"+
						"<a class=\"linkDate\" name=\""+$(".particuliere").val()+"\">"+
						"<i class=\"mesicones icon-trash\"></i>&nbsp;"+
						"</a>"+$(".particuliere").val()+	
						"</li>"
					);						
				"""),format.raw("""}"""),format.raw/*84.6*/("""
			"""),format.raw("""}"""),format.raw/*85.5*/(""");	
		"""),format.raw("""}"""),format.raw/*86.4*/(""")

		function ajouterDate(dateText, id) """),format.raw("""{"""),format.raw/*88.39*/("""			
			var d = new Date(dateText);		
			var date = d.toLocaleDateString();
			$("#altField").append(
				"<li id=\""+id+"\">"+
				"<a class=\"linkDate\" name=\""+dateText+"\">"+
				"<i class=\"mesicones icon-trash\"></i>&nbsp;"+
				"</a>"+date+	
				"</li>"
			);
		"""),format.raw("""}"""),format.raw/*98.4*/("""	

		$('.linkDate').live('click', function(e) """),format.raw("""{"""),format.raw/*100.45*/("""	
			$("#date").multiDatesPicker('removeDates', $(this).attr("name")); //enleve la date dans l'affichage du datepicker
			$(this).parent().remove();

			/*SUPPRESSION DE DATE*/			
			$.ajax("""),format.raw("""{"""),format.raw/*105.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*107.12*/routes/*107.18*/.Application.removeDate(id))),format.raw/*107.45*/("""",
				data: '"""),format.raw("""{"""),format.raw/*108.13*/(""""idDate" : "' + $(this).parent().attr("id") + '""""),format.raw("""}"""),format.raw/*108.62*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*110.31*/("""
					
				"""),format.raw("""}"""),format.raw/*112.6*/("""
			"""),format.raw("""}"""),format.raw/*113.5*/(""");	

		"""),format.raw("""}"""),format.raw/*115.4*/(""");

	</script>
    
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 09 09:09:39 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/dateselection.scala.html
                    HASH: 69613a43cea319a594d16d7c65c82286d1284f53
                    MATRIX: 787->1|928->78|960->102|1044->57|1072->76|1100->156|1138->160|1176->190|1215->192|1374->315|1388->320|1416->326|1780->654|1795->660|1854->697|2009->805|2181->930|2263->965|2564->1219|2627->1235|2699->1271|2714->1277|2760->1301|2825->1319|2900->1347|3023->1423|3136->1490|3190->1498|3246->1508|3300->1515|3367->1535|3439->1571|3454->1577|3503->1604|3568->1622|3678->1685|3801->1761|3865->1779|3919->1787|4022->1844|4075->1851|4126->1856|4178->1862|4278->1915|4337->1927|4403->1957|4418->1963|4464->1987|4526->2002|4617->2046|4734->2116|5054->2390|5105->2395|5158->2402|5246->2443|5562->2713|5657->2760|5896->2951|5963->2981|5979->2987|6029->3014|6092->3029|6189->3078|6307->3148|6366->3160|6418->3165|6473->3173
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|41->12|41->12|41->12|54->25|54->25|54->25|60->31|66->37|67->38|73->44|74->45|76->47|76->47|76->47|77->48|77->48|79->50|81->52|82->53|83->54|83->54|84->55|86->57|86->57|86->57|87->58|87->58|89->60|91->62|92->63|94->65|95->66|96->67|97->68|99->70|100->71|102->73|102->73|102->73|103->74|103->74|105->76|113->84|114->85|115->86|117->88|127->98|129->100|134->105|136->107|136->107|136->107|137->108|137->108|139->110|141->112|142->113|144->115
                    -- GENERATED --
                */
            