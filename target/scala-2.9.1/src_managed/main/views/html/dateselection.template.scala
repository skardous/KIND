
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

	<div class="container">
		<div class="content">

			<div class="btn-group">
		        <a class="btn" href=""""),_display_(Seq[Any](/*14.33*/routes/*14.39*/.Application.eventCreateFilled(event.id))),format.raw/*14.79*/("""">1.Création de l'événement</a>
                <a class="btn btn-info" href=""""),_display_(Seq[Any](/*15.48*/routes/*15.54*/.Application.dateSelection(event.id))),format.raw/*15.90*/("""">2.Sélection des dates</a>
                <a class="btn" href=""""),_display_(Seq[Any](/*16.39*/routes/*16.45*/.Application.heureSelection(event.id))),format.raw/*16.82*/("""">3.Sélection des plages horaires</a>
                <a class="btn" href=""""),_display_(Seq[Any](/*17.39*/routes/*17.45*/.Application.invitation(event.id))),format.raw/*17.78*/("""">4.Invitation des participants</a>
                <a class="btn" href=""""),_display_(Seq[Any](/*18.39*/routes/*18.45*/.Application.resume(event.id))),format.raw/*18.74*/("""">5.Résumé</a>
		    </div>

		    <div class="selectionJours">
			    <h2>Selectionner les jours:</h2>			

				<label class="control-label"></label> <div class="controls" id="date"></div>

				OU<br>

				Ajouter une date particulière: (ex: tous les jeudis)<br>
				<input class="particuliere" type="text"> <a id="okParticuliere" class="btn btn-success"> OK </a>

				<ul class="controls" id="altField"> </ul>
			</div>

			
			<a href=""""),_display_(Seq[Any](/*35.14*/routes/*35.20*/.Application.eventCreateFilled(event.id))),format.raw/*35.60*/("""" class="precedent btn btn-primary">Précédent</a>
			<a href=""""),_display_(Seq[Any](/*36.14*/routes/*36.20*/.Application.heureSelection(event.id))),format.raw/*36.57*/("""" class="continuer btn btn-primary">Continuer</a>
		</div>
	</div>

	



	<script type="text/javascript" charset="utf-8">

		$(function()"""),format.raw("""{"""),format.raw/*46.16*/("""



			$( "#date" ).multiDatesPicker();

			$( "#date" ).datepicker( "option", "minDate", 0);

			$("#date").multiDatesPicker("""),format.raw("""{"""),format.raw/*54.33*/("""				
				onSelect: function(date) """),format.raw("""{"""),format.raw/*55.31*/("""
					$( "#date" ).datepicker( "option", "minDate", 0);
					var selectionType = $.inArray(date, $( "#date" ).multiDatesPicker('getDates'));
					//alert(date);
					var d = new Date(date);		
					var dateText = d.toLocaleDateString();	
					
					if (selectionType != -1) """),format.raw("""{"""),format.raw/*62.32*/("""	
						$.ajax("""),format.raw("""{"""),format.raw/*63.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*65.15*/routes/*65.21*/.Application.addDate(id))),format.raw/*65.45*/("""",
							data: '"""),format.raw("""{"""),format.raw/*66.16*/(""""date" : "' + dateText + '""""),format.raw("""}"""),format.raw/*66.44*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*68.34*/("""											
								ajouterDate(date, data.idJour);							
							"""),format.raw("""}"""),format.raw/*70.9*/("""
						"""),format.raw("""}"""),format.raw/*71.8*/(""");	
					"""),format.raw("""}"""),format.raw/*72.7*/(""" else """),format.raw("""{"""),format.raw/*72.14*/("""					
						$.ajax("""),format.raw("""{"""),format.raw/*73.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*75.15*/routes/*75.21*/.Application.removeDate(id))),format.raw/*75.48*/("""",
							data: '"""),format.raw("""{"""),format.raw/*76.16*/(""""idDate" : "' + $("li:contains("+dateText+")").attr("id") + '""""),format.raw("""}"""),format.raw/*76.79*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*78.34*/("""
								
							"""),format.raw("""}"""),format.raw/*80.9*/("""
						"""),format.raw("""}"""),format.raw/*81.8*/(""");	
						$("li:contains("+dateText+")").remove();
					"""),format.raw("""}"""),format.raw/*83.7*/(""" 
				"""),format.raw("""}"""),format.raw/*84.6*/("""
			"""),format.raw("""}"""),format.raw/*85.5*/(""");
		"""),format.raw("""}"""),format.raw/*86.4*/(""");

		$("#okParticuliere").live("click", function() """),format.raw("""{"""),format.raw/*88.50*/("""
			$.ajax("""),format.raw("""{"""),format.raw/*89.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*91.12*/routes/*91.18*/.Application.addDate(id))),format.raw/*91.42*/("""",
				data: '"""),format.raw("""{"""),format.raw/*92.13*/(""""date" : "' + $(".particuliere").val() + '""""),format.raw("""}"""),format.raw/*92.57*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*94.31*/("""											
					$("#altField").append(
						"<li id=\""+data.idJour+"\">"+
						"<a class=\"linkDate\" name=\""+$(".particuliere").val()+"\">"+
						"<i class=\"mesicones icon-trash\"></i>&nbsp;"+
						"</a>"+$(".particuliere").val()+	
						"</li>"
					);	

				"""),format.raw("""}"""),format.raw/*103.6*/("""
			"""),format.raw("""}"""),format.raw/*104.5*/(""");	
		"""),format.raw("""}"""),format.raw/*105.4*/(""")

		function ajouterDate(dateText, id) """),format.raw("""{"""),format.raw/*107.39*/("""			
			var d = new Date(dateText);		
			var date = d.toLocaleDateString();
			$("#altField").append(
				"<li id=\""+id+"\">"+
				"<a class=\"linkDate datepicker\" name=\""+dateText+"\">"+
				"<i class=\"mesicones icon-trash\"></i>&nbsp;"+
				"</a>"+date+	
				"</li>"
			);
		"""),format.raw("""}"""),format.raw/*117.4*/("""	

		$('.linkDate').live('click', function(e) """),format.raw("""{"""),format.raw/*119.45*/("""	
			if ($(this).hasClass("datepicker")) """),format.raw("""{"""),format.raw/*120.41*/("""
				$("#date").multiDatesPicker('removeDates', $(this).attr("name")); //enleve la date dans l'affichage du datepicker
			"""),format.raw("""}"""),format.raw/*122.5*/("""
			$(this).parent().remove();

			/*SUPPRESSION DE DATE*/			
			$.ajax("""),format.raw("""{"""),format.raw/*126.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*128.12*/routes/*128.18*/.Application.removeDate(id))),format.raw/*128.45*/("""",
				data: '"""),format.raw("""{"""),format.raw/*129.13*/(""""idDate" : "' + $(this).parent().attr("id") + '""""),format.raw("""}"""),format.raw/*129.62*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*131.31*/("""
					
				"""),format.raw("""}"""),format.raw/*133.6*/("""
			"""),format.raw("""}"""),format.raw/*134.5*/(""");	

		"""),format.raw("""}"""),format.raw/*136.4*/(""");	

	</script>
    
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Aug 03 11:04:28 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/dateselection.scala.html
                    HASH: 7c57a498695e3d82db2b008671e13c1a73223ec2
                    MATRIX: 787->1|928->78|960->102|1044->57|1072->76|1100->156|1138->160|1176->190|1215->192|1362->303|1377->309|1439->349|1554->428|1569->434|1627->470|1729->536|1744->542|1803->579|1915->655|1930->661|1985->694|2095->768|2110->774|2161->803|2636->1242|2651->1248|2713->1288|2812->1351|2827->1357|2886->1394|3071->1532|3245->1659|3327->1694|3648->1968|3711->1984|3783->2020|3798->2026|3844->2050|3909->2068|3984->2096|4107->2172|4220->2239|4274->2247|4330->2257|4384->2264|4451->2284|4523->2320|4538->2326|4587->2353|4652->2371|4762->2434|4885->2510|4949->2528|5003->2536|5106->2593|5159->2600|5210->2605|5262->2611|5362->2664|5421->2676|5487->2706|5502->2712|5548->2736|5610->2751|5701->2795|5818->2865|6135->3135|6187->3140|6241->3147|6330->3188|6658->3469|6753->3516|6843->3558|7013->3681|7134->3754|7201->3784|7217->3790|7267->3817|7330->3832|7427->3881|7545->3951|7604->3963|7656->3968|7711->3976
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|47->18|47->18|47->18|64->35|64->35|64->35|65->36|65->36|65->36|75->46|83->54|84->55|91->62|92->63|94->65|94->65|94->65|95->66|95->66|97->68|99->70|100->71|101->72|101->72|102->73|104->75|104->75|104->75|105->76|105->76|107->78|109->80|110->81|112->83|113->84|114->85|115->86|117->88|118->89|120->91|120->91|120->91|121->92|121->92|123->94|132->103|133->104|134->105|136->107|146->117|148->119|149->120|151->122|155->126|157->128|157->128|157->128|158->129|158->129|160->131|162->133|163->134|165->136
                    -- GENERATED --
                */
            