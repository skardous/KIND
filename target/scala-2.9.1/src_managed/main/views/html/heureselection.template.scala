
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
						<h3>"""),_display_(Seq[Any](/*27.12*/jour/*27.16*/.getFRFormat)),format.raw/*27.28*/(""" <span>(<a class="linkPlus"> Ajouter une horaire </a>)</span></h3>			 
						
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
			    button.parent().parent().parent().append("<div id=\""+data.idHoraire+"\">"+
			    	"<a class=\"linkMinus\" ><i class=\"mesicones icon-trash\"></i></a>"+
					"<input type=\"text\" id=\"amount"+data.idHoraire+"\" value=\"8h - 17h\" style=\"border:0; color:#f6931f; font-weight:bold;\" />"+					
					
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
                    DATE: Wed Aug 08 13:08:19 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/heureselection.scala.html
                    HASH: 310ea677b6d311cbba72ef3a2b6613bf2edd38a7
                    MATRIX: 788->1|929->78|961->102|1045->57|1073->76|1101->156|1141->162|1182->195|1221->197|1368->308|1383->314|1445->354|1551->424|1566->430|1624->466|1735->541|1750->547|1809->584|1921->660|1936->666|1991->699|2101->773|2116->779|2167->808|2293->899|2333->923|2373->925|2457->973|2470->977|2495->980|2541->991|2610->1051|2650->1053|2698->1065|2711->1069|2745->1081|2865->1166|2910->1195|2950->1197|3004->1215|3020->1222|3045->1225|3191->1335|3207->1342|3232->1345|3278->1355|3294->1362|3322->1368|3362->1372|3378->1379|3404->1383|3542->1485|3558->1492|3583->1495|3648->1524|3664->1531|3692->1537|3736->1545|3752->1552|3779->1556|3832->1578|3880->1595|3927->1611|3987->1635|4002->1641|4060->1677|4196->1777|4211->1783|4266->1816|4558->2061|4698->2154|4943->2352|5158->2521|5242->2558|5484->2753|5552->2785|5567->2791|5617->2819|5680->2835|5828->2936|5947->3008|6001->3016|6068->3037|6121->3044|6171->3048|6221->3052|6318->3102|6477->3214|6541->3242|6556->3248|6605->3275|6666->3289|6739->3315|6854->3383|7355->3836|7550->3983|7674->4059|7762->4099|7988->4277|8075->4316|8330->4523|8403->4559|8419->4565|8470->4593|8536->4611|8694->4721|8818->4797|8875->4807|8945->4830|9002->4840|9058->4849|9272->5016|9338->5035|9393->5043|9493->5095|9719->5273|9784->5301|9800->5307|9853->5337|9915->5351|10020->5408|10136->5476|10228->5521|10294->5540|10347->5546|10415->5566|10472->5576|10554->5610|10658->5667
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|38->9|38->9|38->9|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|47->18|47->18|47->18|48->19|48->19|48->19|53->24|53->24|53->24|54->25|54->25|54->25|55->26|55->26|55->26|56->27|56->27|56->27|58->29|58->29|58->29|59->30|59->30|59->30|61->32|61->32|61->32|61->32|61->32|61->32|61->32|61->32|61->32|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|65->36|66->37|68->39|70->41|70->41|70->41|71->42|71->42|71->42|85->56|87->58|93->64|95->66|96->67|102->73|104->75|104->75|104->75|105->76|107->78|109->80|111->82|112->83|113->84|114->85|115->86|117->88|120->91|122->93|122->93|122->93|123->94|123->94|125->96|132->103|138->109|141->112|142->113|144->115|145->116|151->122|153->124|153->124|153->124|154->125|156->127|158->129|160->131|161->132|163->134|164->135|167->138|168->139|169->140|172->143|177->148|179->150|179->150|179->150|180->151|180->151|182->153|184->155|185->156|186->157|189->160|191->162|196->167|200->171
                    -- GENERATED --
                */
            