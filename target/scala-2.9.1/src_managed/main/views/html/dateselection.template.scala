
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

			$("#date").multiDatesPicker("""),format.raw("""{"""),format.raw/*39.33*/("""				
				onSelect: function(date) """),format.raw("""{"""),format.raw/*40.31*/("""
					$( "#date" ).datepicker( "option", "minDate", 0);
					var selectionType = $.inArray(date, $( "#date" ).multiDatesPicker('getDates'));
					//alert(date);
					var d = new Date(date);		
					var dateText = d.toLocaleDateString();	
					
					if (selectionType != -1) """),format.raw("""{"""),format.raw/*47.32*/("""	
						$.ajax("""),format.raw("""{"""),format.raw/*48.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*50.15*/routes/*50.21*/.Application.addDate(id))),format.raw/*50.45*/("""",
							data: '"""),format.raw("""{"""),format.raw/*51.16*/(""""date" : "' + dateText + '""""),format.raw("""}"""),format.raw/*51.44*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*53.34*/("""											
								ajouterDate(date, data.idJour);							
							"""),format.raw("""}"""),format.raw/*55.9*/("""
						"""),format.raw("""}"""),format.raw/*56.8*/(""");	
					"""),format.raw("""}"""),format.raw/*57.7*/(""" else """),format.raw("""{"""),format.raw/*57.14*/("""					
						$.ajax("""),format.raw("""{"""),format.raw/*58.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*60.15*/routes/*60.21*/.Application.removeDate(id))),format.raw/*60.48*/("""",
							data: '"""),format.raw("""{"""),format.raw/*61.16*/(""""idDate" : "' + $("li:contains("+dateText+")").attr("id") + '""""),format.raw("""}"""),format.raw/*61.79*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*63.34*/("""
								
							"""),format.raw("""}"""),format.raw/*65.9*/("""
						"""),format.raw("""}"""),format.raw/*66.8*/(""");	
						$("li:contains("+dateText+")").remove();
					"""),format.raw("""}"""),format.raw/*68.7*/(""" 
				"""),format.raw("""}"""),format.raw/*69.6*/("""
			"""),format.raw("""}"""),format.raw/*70.5*/(""");
		"""),format.raw("""}"""),format.raw/*71.4*/(""");

		$("#okParticuliere").live("click", function() """),format.raw("""{"""),format.raw/*73.50*/("""
			$.ajax("""),format.raw("""{"""),format.raw/*74.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*76.12*/routes/*76.18*/.Application.addDate(id))),format.raw/*76.42*/("""",
				data: '"""),format.raw("""{"""),format.raw/*77.13*/(""""date" : "' + $(".particuliere").val() + '""""),format.raw("""}"""),format.raw/*77.57*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*79.31*/("""											
					$("#altField").append(
						"<li id=\""+data.idJour+"\">"+
						"<a class=\"linkDate\" name=\""+$(".particuliere").val()+"\">"+
						"<i class=\"mesicones icon-trash\"></i>&nbsp;"+
						"</a>"+$(".particuliere").val()+	
						"</li>"
					);	

				"""),format.raw("""}"""),format.raw/*88.6*/("""
			"""),format.raw("""}"""),format.raw/*89.5*/(""");	
		"""),format.raw("""}"""),format.raw/*90.4*/(""")

		function ajouterDate(dateText, id) """),format.raw("""{"""),format.raw/*92.39*/("""			
			var d = new Date(dateText);		
			var date = d.toLocaleDateString();
			$("#altField").append(
				"<li id=\""+id+"\">"+
				"<a class=\"linkDate datepicker\" name=\""+dateText+"\">"+
				"<i class=\"mesicones icon-trash\"></i>&nbsp;"+
				"</a>"+date+	
				"</li>"
			);
		"""),format.raw("""}"""),format.raw/*102.4*/("""	

		$('.linkDate').live('click', function(e) """),format.raw("""{"""),format.raw/*104.45*/("""	
			if ($(this).hasClass("datepicker")) """),format.raw("""{"""),format.raw/*105.41*/("""
				$("#date").multiDatesPicker('removeDates', $(this).attr("name")); //enleve la date dans l'affichage du datepicker
			"""),format.raw("""}"""),format.raw/*107.5*/("""
			$(this).parent().remove();

			/*SUPPRESSION DE DATE*/			
			$.ajax("""),format.raw("""{"""),format.raw/*111.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*113.12*/routes/*113.18*/.Application.removeDate(id))),format.raw/*113.45*/("""",
				data: '"""),format.raw("""{"""),format.raw/*114.13*/(""""idDate" : "' + $(this).parent().attr("id") + '""""),format.raw("""}"""),format.raw/*114.62*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*116.31*/("""
					
				"""),format.raw("""}"""),format.raw/*118.6*/("""
			"""),format.raw("""}"""),format.raw/*119.5*/(""");	

		"""),format.raw("""}"""),format.raw/*121.4*/(""");

	</script>
    
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 16 10:20:04 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/dateselection.scala.html
                    HASH: abc9accfec8919447d65ac2f8e3bf25306e3b5cf
                    MATRIX: 787->1|928->78|960->102|1044->57|1072->76|1100->156|1138->160|1176->190|1215->192|1374->315|1388->320|1416->326|1780->654|1795->660|1854->697|2009->805|2183->932|2265->967|2586->1241|2649->1257|2721->1293|2736->1299|2782->1323|2847->1341|2922->1369|3045->1445|3158->1512|3212->1520|3268->1530|3322->1537|3389->1557|3461->1593|3476->1599|3525->1626|3590->1644|3700->1707|3823->1783|3887->1801|3941->1809|4044->1866|4097->1873|4148->1878|4200->1884|4300->1937|4359->1949|4425->1979|4440->1985|4486->2009|4548->2024|4639->2068|4756->2138|5072->2408|5123->2413|5176->2420|5264->2461|5592->2742|5687->2789|5777->2831|5947->2954|6068->3027|6135->3057|6151->3063|6201->3090|6264->3105|6361->3154|6479->3224|6538->3236|6590->3241|6645->3249
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|41->12|41->12|41->12|54->25|54->25|54->25|60->31|68->39|69->40|76->47|77->48|79->50|79->50|79->50|80->51|80->51|82->53|84->55|85->56|86->57|86->57|87->58|89->60|89->60|89->60|90->61|90->61|92->63|94->65|95->66|97->68|98->69|99->70|100->71|102->73|103->74|105->76|105->76|105->76|106->77|106->77|108->79|117->88|118->89|119->90|121->92|131->102|133->104|134->105|136->107|140->111|142->113|142->113|142->113|143->114|143->114|145->116|147->118|148->119|150->121
                    -- GENERATED --
                */
            