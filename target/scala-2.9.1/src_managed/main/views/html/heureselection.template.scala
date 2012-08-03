
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
object heureselection extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Long,Form[Evenement],Evenement,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, eventForm: Form[Evenement], event: Evenement):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 



"""),_display_(Seq[Any](/*9.2*/main("Selectionner les horaires")/*9.35*/ {_display_(Seq[Any](format.raw/*9.37*/("""

	<div class="container">
		<div class="content">

			<div class="btn-group">
		        <a class="btn" href=""""),_display_(Seq[Any](/*15.33*/routes/*15.39*/.Application.eventCreateFilled(event.id))),format.raw/*15.79*/("""">1.Création de l'événement</a>
                <a class="btn" href=""""),_display_(Seq[Any](/*16.39*/routes/*16.45*/.Application.dateSelection(event.id))),format.raw/*16.81*/("""">2.Sélection des dates</a>
                <a class="btn btn-info" href=""""),_display_(Seq[Any](/*17.48*/routes/*17.54*/.Application.heureSelection(event.id))),format.raw/*17.91*/("""">3.Sélection des plages horaires</a>
                <a class="btn" href=""""),_display_(Seq[Any](/*18.39*/routes/*18.45*/.Application.invitation(event.id))),format.raw/*18.78*/("""">4.Invitation des participants</a>
                <a class="btn" href=""""),_display_(Seq[Any](/*19.39*/routes/*19.45*/.Application.resume(event.id))),format.raw/*19.74*/("""">5.Résumé</a>
		    </div>
		    
		    <h2>Selectionner les horaires:</h2>
		    
		    """),_display_(Seq[Any](/*24.8*/for(jour <- event.jours) yield /*24.32*/ {_display_(Seq[Any](format.raw/*24.34*/("""
				<div class="control-group selectDate" id=""""),_display_(Seq[Any](/*25.48*/jour/*25.52*/.id)),format.raw/*25.55*/("""">
				  	"""),_display_(Seq[Any](/*26.9*/form(routes.Application.updatePersonne(id), 'id->"formJour")/*26.69*/ {_display_(Seq[Any](format.raw/*26.71*/("""
						<h3>"""),_display_(Seq[Any](/*27.12*/jour/*27.16*/.date)),format.raw/*27.21*/(""" <span>(<a class="linkPlus"> Ajouter une horaire </a>)</span></h3>			 
						
						"""),_display_(Seq[Any](/*29.8*/for(horaire <- jour.horaires) yield /*29.37*/ {_display_(Seq[Any](format.raw/*29.39*/("""
							<div id=""""),_display_(Seq[Any](/*30.18*/horaire/*30.25*/.id)),format.raw/*30.28*/("""">
							<a class="linkMinus" ><i class="mesicones icon-trash"></i></a>
							<input type="text" id="amount"""),_display_(Seq[Any](/*32.38*/horaire/*32.45*/.id)),format.raw/*32.48*/("""" value=""""),_display_(Seq[Any](/*32.58*/horaire/*32.65*/.debut)),format.raw/*32.71*/(""" - """),_display_(Seq[Any](/*32.75*/horaire/*32.82*/.fin)),format.raw/*32.86*/("""" style="border:0; color:#f6931f; font-weight:bold;" />
							
							
							<div id="slider-range-"""),_display_(Seq[Any](/*35.31*/horaire/*35.38*/.id)),format.raw/*35.41*/("""" class="initslider" debut=""""),_display_(Seq[Any](/*35.70*/horaire/*35.77*/.debut)),format.raw/*35.83*/("""" fin=""""),_display_(Seq[Any](/*35.91*/horaire/*35.98*/.fin)),format.raw/*35.102*/(""""></div></div>
						""")))})),format.raw/*36.8*/("""						  
				  	""")))})),format.raw/*37.9*/("""
				</div>
			""")))})),format.raw/*39.5*/("""
		    
		    <a href=""""),_display_(Seq[Any](/*41.17*/routes/*41.23*/.Application.dateSelection(event.id))),format.raw/*41.59*/("""" class="precedent btn btn-primary">Précédent</a>
		    <a class="continuer btn btn-primary" href=""""),_display_(Seq[Any](/*42.51*/routes/*42.57*/.Application.invitation(event.id))),format.raw/*42.90*/("""">Continuer</a>
		</div>
	</div>
	
    
	<script type="text/javascript" charset="utf-8">



	var optionsHeuresDebut = "";
    var optionsHeuresFin = "";
	var optionsMinutes = "";
	var heuresList = new Array();

	$(".initslider").each(function()"""),format.raw("""{"""),format.raw/*56.35*/("""
		var idHoraire = $(this).parent("div").attr("id");
		$("#slider-range-"+idHoraire).slider("""),format.raw("""{"""),format.raw/*58.41*/("""
			range: true,
	    	min: 0,
	    	max: 1440,
	    	step: 15,
	    	values: [ parseFloat($(this).attr("debut"))*60, parseFloat($(this).attr("fin"))*60 ],	    	
	    	slide: function( event, ui ) """),format.raw("""{"""),format.raw/*64.37*/("""
	    		$( "#amount"+idHoraire ).val(parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60)+" - " + parseInt(ui.values[ 1 ]/60) +"h"+pad2(ui.values[ 1 ]%60));
	    	"""),format.raw("""}"""),format.raw/*66.8*/(""",
	    	change: function(event, ui) """),format.raw("""{"""),format.raw/*67.36*/("""
	    		
	    		var debut;
	    		var fin;
				debut = parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60);
				fin = parseInt(ui.values[ 1 ]/60) + "h"+pad2(ui.values[ 1 ]%60);
				$.ajax("""),format.raw("""{"""),format.raw/*73.13*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*75.13*/routes/*75.19*/.Application.dateChanged(id))),format.raw/*75.47*/("""",
					data: '"""),format.raw("""{"""),format.raw/*76.14*/(""""idhoraire" : "' + idHoraire + '",'+ 
					'"debut" : "' + debut + '",'+
					'"fin" : "' + fin + '""""),format.raw("""}"""),format.raw/*78.29*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*80.32*/("""

					"""),format.raw("""}"""),format.raw/*82.7*/("""               
				"""),format.raw("""}"""),format.raw/*83.6*/(""");
			"""),format.raw("""}"""),format.raw/*84.5*/("""
		"""),format.raw("""}"""),format.raw/*85.4*/(""")
	"""),format.raw("""}"""),format.raw/*86.3*/(""")	

    $('.linkPlus').live('click', function(e) """),format.raw("""{"""),format.raw/*88.47*/("""		    	
		var idJour = $(this).parent().parent().parent().parent().attr('id');
		var button= $(this);
		$.ajax("""),format.raw("""{"""),format.raw/*91.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*93.11*/routes/*93.17*/.Application.newHoraire(id))),format.raw/*93.44*/("""",
			data: '"""),format.raw("""{"""),format.raw/*94.12*/(""""jour" : "' + idJour + '""""),format.raw("""}"""),format.raw/*94.38*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*96.30*/("""
			    button.parent().append("<div id=\""+data.idHoraire+"\">"+
					"<input type=\"text\" id=\"amount"+data.idHoraire+"\" value=\"8h - 17h\" style=\"border:0; color:#f6931f; font-weight:bold;\" />"+
					"<a class=\"linkMinus\" ><i class=\"mesicones icon-trash\"></i></a>"+
					
					"<div id=\"slider-range-"+data.idHoraire+"\" class=\"initslider\"></div></div>"
				);
			    $( "#slider-range-"+data.idHoraire ).slider("""),format.raw("""{"""),format.raw/*103.53*/("""
			    	range: true,
			    	min: 0,
			    	max: 1440,
			    	step: 15,
			    	values: [ 8*60, 17*60 ],
			    	create: function( event, ui ) """),format.raw("""{"""),format.raw/*109.40*/("""
			    		
			    		$( "#amount"+data.idHoraire ).val("8h - 17h");
			    	"""),format.raw("""}"""),format.raw/*112.10*/(""",
			    	slide: function( event, ui ) """),format.raw("""{"""),format.raw/*113.39*/("""
			    		$( "#amount"+data.idHoraire ).val(parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60)+" - " + parseInt(ui.values[ 1 ]/60) +"h"+pad2(ui.values[ 1 ]%60));
			    	"""),format.raw("""}"""),format.raw/*115.10*/(""",
			    	change: function(event, ui) """),format.raw("""{"""),format.raw/*116.38*/("""
			    		
			    		var debut;
			    		var fin;
						debut = parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60);
						fin = parseInt(ui.values[ 1 ]/60) + "h"+pad2(ui.values[ 1 ]%60);
						$.ajax("""),format.raw("""{"""),format.raw/*122.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*124.15*/routes/*124.21*/.Application.dateChanged(id))),format.raw/*124.49*/("""",
							data: '"""),format.raw("""{"""),format.raw/*125.16*/(""""idhoraire" : "' + data.idHoraire + '",'+ 
							'"debut" : "' + debut + '",'+
							'"fin" : "' + fin + '""""),format.raw("""}"""),format.raw/*127.31*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*129.34*/("""

							"""),format.raw("""}"""),format.raw/*131.9*/("""               
						"""),format.raw("""}"""),format.raw/*132.8*/(""");

					"""),format.raw("""}"""),format.raw/*134.7*/("""
			    """),format.raw("""}"""),format.raw/*135.9*/(""");
			   // $( "#amount"+data.idHoraire ).val( "$" + $( "#slider-range" ).slider( "values", 0 ) +
			    //	" - $" + $( "#slider-range" ).slider( "values", 1 ) );
			"""),format.raw("""}"""),format.raw/*138.5*/("""               
		"""),format.raw("""}"""),format.raw/*139.4*/(""");
    """),format.raw("""}"""),format.raw/*140.6*/(""");


    $('.linkMinus').live('click', function(e) """),format.raw("""{"""),format.raw/*143.48*/("""
         
         var idHeure = $(this).parent().attr('id');
         var idJour = $(this).parent().parent().parent().attr('id');
         var button= $(this);
        $.ajax("""),format.raw("""{"""),format.raw/*148.17*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*150.11*/routes/*150.17*/.Application.deleteHoraire(id))),format.raw/*150.47*/("""",
			data: '"""),format.raw("""{"""),format.raw/*151.12*/(""""jour" : "' + idJour + '", "horaire" : "' + idHeure + '""""),format.raw("""}"""),format.raw/*151.69*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*153.30*/("""
			    button.parent().remove();			    
			"""),format.raw("""}"""),format.raw/*155.5*/("""               
		"""),format.raw("""}"""),format.raw/*156.4*/(""");	
	"""),format.raw("""}"""),format.raw/*157.3*/(""");	


	$(function()"""),format.raw("""{"""),format.raw/*160.15*/("""	   
	 
	"""),format.raw("""}"""),format.raw/*162.3*/(""");
	

	
	
	function pad2(number) """),format.raw("""{"""),format.raw/*167.25*/("""
   
    	return (number < 10 ? '0' : '') + number
   
	"""),format.raw("""}"""),format.raw/*171.3*/("""

	</script>
    
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Aug 03 11:13:04 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/heureselection.scala.html
                    HASH: fa3c48b72e4fc8f97fca9c7930725bb24487e7ab
                    MATRIX: 788->1|929->78|961->102|1045->57|1073->76|1101->156|1141->162|1182->195|1221->197|1368->308|1383->314|1445->354|1551->424|1566->430|1624->466|1735->541|1750->547|1809->584|1921->660|1936->666|1991->699|2101->773|2116->779|2167->808|2293->899|2333->923|2373->925|2457->973|2470->977|2495->980|2541->991|2610->1051|2650->1053|2698->1065|2711->1069|2738->1074|2858->1159|2903->1188|2943->1190|2997->1208|3013->1215|3038->1218|3184->1328|3200->1335|3225->1338|3271->1348|3287->1355|3315->1361|3355->1365|3371->1372|3397->1376|3535->1478|3551->1485|3576->1488|3641->1517|3657->1524|3685->1530|3729->1538|3745->1545|3772->1549|3825->1571|3873->1588|3920->1604|3980->1628|3995->1634|4053->1670|4189->1770|4204->1776|4259->1809|4551->2054|4691->2147|4936->2345|5151->2514|5235->2551|5477->2746|5545->2778|5560->2784|5610->2812|5673->2828|5821->2929|5940->3001|5994->3009|6061->3030|6114->3037|6164->3041|6214->3045|6311->3095|6470->3207|6534->3235|6549->3241|6598->3268|6659->3282|6732->3308|6847->3376|7322->3803|7517->3950|7641->4026|7729->4066|7955->4244|8042->4283|8297->4490|8370->4526|8386->4532|8437->4560|8503->4578|8661->4688|8785->4764|8842->4774|8912->4797|8969->4807|9025->4816|9239->4983|9305->5002|9360->5010|9460->5062|9686->5240|9751->5268|9767->5274|9820->5304|9882->5318|9987->5375|10103->5443|10195->5488|10261->5507|10314->5513|10382->5533|10439->5543|10521->5577|10625->5634
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|38->9|38->9|38->9|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|47->18|47->18|47->18|48->19|48->19|48->19|53->24|53->24|53->24|54->25|54->25|54->25|55->26|55->26|55->26|56->27|56->27|56->27|58->29|58->29|58->29|59->30|59->30|59->30|61->32|61->32|61->32|61->32|61->32|61->32|61->32|61->32|61->32|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|65->36|66->37|68->39|70->41|70->41|70->41|71->42|71->42|71->42|85->56|87->58|93->64|95->66|96->67|102->73|104->75|104->75|104->75|105->76|107->78|109->80|111->82|112->83|113->84|114->85|115->86|117->88|120->91|122->93|122->93|122->93|123->94|123->94|125->96|132->103|138->109|141->112|142->113|144->115|145->116|151->122|153->124|153->124|153->124|154->125|156->127|158->129|160->131|161->132|163->134|164->135|167->138|168->139|169->140|172->143|177->148|179->150|179->150|179->150|180->151|180->151|182->153|184->155|185->156|186->157|189->160|191->162|196->167|200->171
                    -- GENERATED --
                */
            