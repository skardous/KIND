
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

				
				<ul class="controls" id="altField">
					"""),_display_(Seq[Any](/*28.7*/for(jour <- event.jours) yield /*28.31*/{_display_(Seq[Any](format.raw/*28.32*/("""
						<li id=""""),_display_(Seq[Any](/*29.16*/jour/*29.20*/.id)),format.raw/*29.23*/("""">
							<a class="linkDate" name=""""),_display_(Seq[Any](/*30.35*/jour/*30.39*/.date)),format.raw/*30.44*/("""">
							<i class="mesicones icon-trash"></i>&nbsp;
							</a>"""),_display_(Seq[Any](/*32.13*/jour/*32.17*/.getFRFormat)),format.raw/*32.29*/("""
						</li>
					""")))})),format.raw/*34.7*/("""
				 </ul>
			</div>

			
			<a href=""""),_display_(Seq[Any](/*39.14*/routes/*39.20*/.Application.eventCreateFilled(event.id))),format.raw/*39.60*/("""" class="precedent btn btn-primary">Précédent</a>
			<a href=""""),_display_(Seq[Any](/*40.14*/routes/*40.20*/.Application.heureSelection(event.id))),format.raw/*40.57*/("""" class="continuer btn btn-primary">Continuer</a>
		</div>
	</div>

	



	<script type="text/javascript" charset="utf-8">

		$(function()"""),format.raw("""{"""),format.raw/*50.16*/("""



			$( "#date" ).multiDatesPicker();

			$( "#date" ).datepicker( "option", "minDate", 0);

			var dates = """"),_display_(Seq[Any](/*58.18*/for(jour <- event.jours) yield /*58.42*/{_display_(Seq[Any](_display_(Seq[Any](/*58.44*/jour/*58.48*/.getDateJS)),format.raw/*58.58*/(""",""")))})),format.raw/*58.60*/("""";
			var datelist = dates.split(",");
			datelist.splice(datelist.length - 1, 1);

			$("#date").multiDatesPicker("""),format.raw("""{"""),format.raw/*62.33*/("""
				addDates: datelist,	
				onSelect: function(date) """),format.raw("""{"""),format.raw/*64.31*/("""
					$( "#date" ).datepicker( "option", "minDate", 0);
					var selectionType = $.inArray(date, $( "#date" ).multiDatesPicker('getDates'));
					
					var d = new Date(date);
					var timestamp = d.getTime();	
					
					if (selectionType != -1) """),format.raw("""{"""),format.raw/*71.32*/("""	
						$.ajax("""),format.raw("""{"""),format.raw/*72.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*74.15*/routes/*74.21*/.Application.addDate(id))),format.raw/*74.45*/("""",
							data: '"""),format.raw("""{"""),format.raw/*75.16*/(""""date" : ' + timestamp + '"""),format.raw("""}"""),format.raw/*75.43*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*77.34*/("""											
								ajouterDate(date, data.idJour);							
							"""),format.raw("""}"""),format.raw/*79.9*/("""
						"""),format.raw("""}"""),format.raw/*80.8*/(""");	
					"""),format.raw("""}"""),format.raw/*81.7*/(""" else """),format.raw("""{"""),format.raw/*81.14*/("""					
						$.ajax("""),format.raw("""{"""),format.raw/*82.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*84.15*/routes/*84.21*/.Application.removeDate(id))),format.raw/*84.48*/("""",
							data: '"""),format.raw("""{"""),format.raw/*85.16*/(""""idDate" : "' + $("li:contains("+timestamp+")").attr("id") + '""""),format.raw("""}"""),format.raw/*85.80*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*87.34*/("""
								
							"""),format.raw("""}"""),format.raw/*89.9*/("""
						"""),format.raw("""}"""),format.raw/*90.8*/(""");
						$("li:contains("+timestamp+")").remove();
					"""),format.raw("""}"""),format.raw/*92.7*/(""" 
				"""),format.raw("""}"""),format.raw/*93.6*/("""
			"""),format.raw("""}"""),format.raw/*94.5*/(""");
		"""),format.raw("""}"""),format.raw/*95.4*/(""");

		

		function ajouterDate(dateText, id) """),format.raw("""{"""),format.raw/*99.39*/("""			
			var d = new Date(dateText);					
			var date = d.toLocaleDateString();
			$("#altField").append(
				"<li id=\""+id+"\">"+
				"<a class=\"linkDate datepicker\" name=\""+dateText+"\">"+
				"<i class=\"mesicones icon-trash\"></i>&nbsp;"+
				"</a>"+date+	
				"</li>"
			);
		"""),format.raw("""}"""),format.raw/*109.4*/("""	

		$('.linkDate').live('click', function(e) """),format.raw("""{"""),format.raw/*111.45*/("""	
			if ($(this).hasClass("datepicker")) """),format.raw("""{"""),format.raw/*112.41*/("""
				$("#date").multiDatesPicker('removeDates', $(this).attr("name")); //enleve la date dans l'affichage du datepicker
			"""),format.raw("""}"""),format.raw/*114.5*/("""
			$(this).parent().remove();

			/*SUPPRESSION DE DATE*/			
			$.ajax("""),format.raw("""{"""),format.raw/*118.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*120.12*/routes/*120.18*/.Application.removeDate(id))),format.raw/*120.45*/("""",
				data: '"""),format.raw("""{"""),format.raw/*121.13*/(""""idDate" : "' + $(this).parent().attr("id") + '""""),format.raw("""}"""),format.raw/*121.62*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*123.31*/("""
					
				"""),format.raw("""}"""),format.raw/*125.6*/("""
			"""),format.raw("""}"""),format.raw/*126.5*/(""");	

		"""),format.raw("""}"""),format.raw/*128.4*/(""");	

	</script>
    
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 08 13:31:43 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/dateselection.scala.html
                    HASH: c62f718e603fdfea8753a64d68aa3838c04aa339
                    MATRIX: 787->1|928->78|960->102|1044->57|1072->76|1100->156|1138->160|1176->190|1215->192|1362->303|1377->309|1439->349|1554->428|1569->434|1627->470|1729->536|1744->542|1803->579|1915->655|1930->661|1985->694|2095->768|2110->774|2161->803|2437->1044|2477->1068|2516->1069|2568->1085|2581->1089|2606->1092|2679->1129|2692->1133|2719->1138|2820->1203|2833->1207|2867->1219|2917->1238|2993->1278|3008->1284|3070->1324|3169->1387|3184->1393|3243->1430|3428->1568|3576->1680|3616->1704|3664->1706|3677->1710|3709->1720|3743->1722|3906->1838|4009->1894|4304->2142|4367->2158|4439->2194|4454->2200|4500->2224|4565->2242|4639->2269|4762->2345|4875->2412|4929->2420|4985->2430|5039->2437|5106->2457|5178->2493|5193->2499|5242->2526|5307->2544|5418->2608|5541->2684|5605->2702|5659->2710|5762->2767|5815->2774|5866->2779|5918->2785|6011->2831|6342->3115|6437->3162|6527->3204|6697->3327|6818->3400|6885->3430|6901->3436|6951->3463|7014->3478|7111->3527|7229->3597|7288->3609|7340->3614|7395->3622
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|47->18|47->18|47->18|57->28|57->28|57->28|58->29|58->29|58->29|59->30|59->30|59->30|61->32|61->32|61->32|63->34|68->39|68->39|68->39|69->40|69->40|69->40|79->50|87->58|87->58|87->58|87->58|87->58|87->58|91->62|93->64|100->71|101->72|103->74|103->74|103->74|104->75|104->75|106->77|108->79|109->80|110->81|110->81|111->82|113->84|113->84|113->84|114->85|114->85|116->87|118->89|119->90|121->92|122->93|123->94|124->95|128->99|138->109|140->111|141->112|143->114|147->118|149->120|149->120|149->120|150->121|150->121|152->123|154->125|155->126|157->128
                    -- GENERATED --
                */
            