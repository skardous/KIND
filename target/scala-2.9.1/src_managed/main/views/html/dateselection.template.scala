
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

	<div id="dialog-check-pwd-adm" title="Entrez le mot de passe organisateur">				
			<label for="password">Mot de passe organisateur (envoyé par mail a la création de l'évènement) :</label>
			<input type="password" name="password" id="password-check-adm" value="" class="text ui-widget-content ui-corner-all" />
		
	</div>



	<script type="text/javascript" charset="utf-8">

		$(function()"""),format.raw("""{"""),format.raw/*37.16*/("""



			$( "#date" ).multiDatesPicker();

			$( "#date" ).datepicker( "option", "minDate", 0);

			$("#date").multiDatesPicker("""),format.raw("""{"""),format.raw/*45.33*/("""				
				onSelect: function(date) """),format.raw("""{"""),format.raw/*46.31*/("""
					$( "#date" ).datepicker( "option", "minDate", 0);
					var selectionType = $.inArray(date, $( "#date" ).multiDatesPicker('getDates'));
					//alert(date);
					var d = new Date(date);		
					var dateText = d.toLocaleDateString();	
					
					if (selectionType != -1) """),format.raw("""{"""),format.raw/*53.32*/("""	
						$.ajax("""),format.raw("""{"""),format.raw/*54.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*56.15*/routes/*56.21*/.Application.addDate(id))),format.raw/*56.45*/("""",
							data: '"""),format.raw("""{"""),format.raw/*57.16*/(""""date" : "' + dateText + '""""),format.raw("""}"""),format.raw/*57.44*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*59.34*/("""											
								ajouterDate(date, data.idJour);							
							"""),format.raw("""}"""),format.raw/*61.9*/("""
						"""),format.raw("""}"""),format.raw/*62.8*/(""");	
					"""),format.raw("""}"""),format.raw/*63.7*/(""" else """),format.raw("""{"""),format.raw/*63.14*/("""					
						$.ajax("""),format.raw("""{"""),format.raw/*64.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*66.15*/routes/*66.21*/.Application.removeDate(id))),format.raw/*66.48*/("""",
							data: '"""),format.raw("""{"""),format.raw/*67.16*/(""""idDate" : "' + $("li:contains("+dateText+")").attr("id") + '""""),format.raw("""}"""),format.raw/*67.79*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*69.34*/("""
								
							"""),format.raw("""}"""),format.raw/*71.9*/("""
						"""),format.raw("""}"""),format.raw/*72.8*/(""");	
						$("li:contains("+dateText+")").remove();
					"""),format.raw("""}"""),format.raw/*74.7*/(""" 
				"""),format.raw("""}"""),format.raw/*75.6*/("""
			"""),format.raw("""}"""),format.raw/*76.5*/(""");
		"""),format.raw("""}"""),format.raw/*77.4*/(""");

		$("#okParticuliere").live("click", function() """),format.raw("""{"""),format.raw/*79.50*/("""
			$.ajax("""),format.raw("""{"""),format.raw/*80.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*82.12*/routes/*82.18*/.Application.addDate(id))),format.raw/*82.42*/("""",
				data: '"""),format.raw("""{"""),format.raw/*83.13*/(""""date" : "' + $(".particuliere").val() + '""""),format.raw("""}"""),format.raw/*83.57*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*85.31*/("""											
					$("#altField").append(
						"<li id=\""+data.idJour+"\">"+
						"<a class=\"linkDate\" name=\""+$(".particuliere").val()+"\">"+
						"<i class=\"mesicones icon-trash\"></i>&nbsp;"+
						"</a>"+$(".particuliere").val()+	
						"</li>"
					);	

				"""),format.raw("""}"""),format.raw/*94.6*/("""
			"""),format.raw("""}"""),format.raw/*95.5*/(""");	
		"""),format.raw("""}"""),format.raw/*96.4*/(""")

		function ajouterDate(dateText, id) """),format.raw("""{"""),format.raw/*98.39*/("""			
			var d = new Date(dateText);		
			var date = d.toLocaleDateString();
			$("#altField").append(
				"<li id=\""+id+"\">"+
				"<a class=\"linkDate datepicker\" name=\""+dateText+"\">"+
				"<i class=\"mesicones icon-trash\"></i>&nbsp;"+
				"</a>"+date+	
				"</li>"
			);
		"""),format.raw("""}"""),format.raw/*108.4*/("""	

		$('.linkDate').live('click', function(e) """),format.raw("""{"""),format.raw/*110.45*/("""	
			if ($(this).hasClass("datepicker")) """),format.raw("""{"""),format.raw/*111.41*/("""
				$("#date").multiDatesPicker('removeDates', $(this).attr("name")); //enleve la date dans l'affichage du datepicker
			"""),format.raw("""}"""),format.raw/*113.5*/("""
			$(this).parent().remove();

			/*SUPPRESSION DE DATE*/			
			$.ajax("""),format.raw("""{"""),format.raw/*117.12*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*119.12*/routes/*119.18*/.Application.removeDate(id))),format.raw/*119.45*/("""",
				data: '"""),format.raw("""{"""),format.raw/*120.13*/(""""idDate" : "' + $(this).parent().attr("id") + '""""),format.raw("""}"""),format.raw/*120.62*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*122.31*/("""
					
				"""),format.raw("""}"""),format.raw/*124.6*/("""
			"""),format.raw("""}"""),format.raw/*125.5*/(""");	

		"""),format.raw("""}"""),format.raw/*127.4*/(""");




	$(function()"""),format.raw("""{"""),format.raw/*132.15*/("""		

		$( "#dialog-check-pwd-adm" ).dialog( "open" );		

	"""),format.raw("""}"""),format.raw/*136.3*/(""");
	

	$( "#dialog-check-pwd-adm" ).dialog("""),format.raw("""{"""),format.raw/*139.39*/("""  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		open: function(event, ui) """),format.raw("""{"""),format.raw/*144.30*/(""" $(".ui-dialog-titlebar-close", $(this).parent()).hide(); """),format.raw("""}"""),format.raw/*144.89*/(""",
		closeOnEscape: false,
		buttons: """),format.raw("""{"""),format.raw/*146.13*/("""
			"OK": function() """),format.raw("""{"""),format.raw/*147.22*/("""				
								
				pass = $("#password-check-adm").val();	
				if (pass == """"),_display_(Seq[Any](/*150.19*/event/*150.24*/.passAdmin)),format.raw/*150.34*/("""") """),format.raw("""{"""),format.raw/*150.38*/("""
				  	$( this ).dialog( "close" );
				"""),format.raw("""}"""),format.raw/*152.6*/(""" else """),format.raw("""{"""),format.raw/*152.13*/("""
				  	alert("mot de passe incorrect");
				"""),format.raw("""}"""),format.raw/*154.6*/("""				
				
			"""),format.raw("""}"""),format.raw/*156.5*/("""					
		"""),format.raw("""}"""),format.raw/*157.4*/("""
		
		
	"""),format.raw("""}"""),format.raw/*160.3*/(""");

	</script>
    
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 24 16:07:11 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/dateselection.scala.html
                    HASH: 6980f6dd99515513cc4c72dbba6ea1b9e4d07f78
                    MATRIX: 787->1|928->78|960->102|1044->57|1072->76|1100->156|1138->160|1176->190|1215->192|1374->315|1388->320|1416->326|1780->654|1795->660|1854->697|2333->1129|2507->1256|2589->1291|2910->1565|2973->1581|3045->1617|3060->1623|3106->1647|3171->1665|3246->1693|3369->1769|3482->1836|3536->1844|3592->1854|3646->1861|3713->1881|3785->1917|3800->1923|3849->1950|3914->1968|4024->2031|4147->2107|4211->2125|4265->2133|4368->2190|4421->2197|4472->2202|4524->2208|4624->2261|4683->2273|4749->2303|4764->2309|4810->2333|4872->2348|4963->2392|5080->2462|5396->2732|5447->2737|5500->2744|5588->2785|5916->3066|6011->3113|6101->3155|6271->3278|6392->3351|6459->3381|6475->3387|6525->3414|6588->3429|6685->3478|6803->3548|6862->3560|6914->3565|6969->3573|7038->3594|7143->3652|7235->3696|7412->3825|7519->3884|7605->3922|7675->3944|7788->4020|7803->4025|7836->4035|7888->4039|7977->4081|8032->4088|8125->4134|8186->4148|8242->4157|8298->4166
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|41->12|41->12|41->12|54->25|54->25|54->25|66->37|74->45|75->46|82->53|83->54|85->56|85->56|85->56|86->57|86->57|88->59|90->61|91->62|92->63|92->63|93->64|95->66|95->66|95->66|96->67|96->67|98->69|100->71|101->72|103->74|104->75|105->76|106->77|108->79|109->80|111->82|111->82|111->82|112->83|112->83|114->85|123->94|124->95|125->96|127->98|137->108|139->110|140->111|142->113|146->117|148->119|148->119|148->119|149->120|149->120|151->122|153->124|154->125|156->127|161->132|165->136|168->139|173->144|173->144|175->146|176->147|179->150|179->150|179->150|179->150|181->152|181->152|183->154|185->156|186->157|189->160
                    -- GENERATED --
                */
            