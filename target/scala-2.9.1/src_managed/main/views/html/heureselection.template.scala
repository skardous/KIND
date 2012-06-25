
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
    
    <h2>Selectionner les horaires:</h2>
    
    """),_display_(Seq[Any](/*13.6*/for(jour <- event.jours) yield /*13.30*/ {_display_(Seq[Any](format.raw/*13.32*/("""
		<div class="control-group selectDate" id=""""),_display_(Seq[Any](/*14.46*/jour/*14.50*/.id)),format.raw/*14.53*/("""">
		  	"""),_display_(Seq[Any](/*15.7*/form(routes.Application.updatePersonne(id), 'id->"formJour")/*15.67*/ {_display_(Seq[Any](format.raw/*15.69*/("""
				"""),_display_(Seq[Any](/*16.6*/jour/*16.10*/.date)),format.raw/*16.15*/("""			 
				<a class="linkPlus btn btn-success" ><i class="mesicones icon-plus"></i></a>		
			  
		  	""")))})),format.raw/*19.7*/("""
		</div>
	""")))})),format.raw/*21.3*/("""
    
    <a class="btn btn-primary" href=""""),_display_(Seq[Any](/*23.39*/routes/*23.45*/.Application.edit(event.id))),format.raw/*23.72*/("""">Terminé</a>
	
    
	<script type="text/javascript" charset="utf-8">

	var optionsHeuresDebut = "";
    var optionsHeuresFin = "";
	var optionsMinutes = "";
	var heuresList = new Array();

		

    $('.linkPlus').live('click', function(e) """),format.raw("""{"""),format.raw/*35.47*/("""		
		var idJour = $(this).parent().parent().attr('id');
		var button= $(this);
		$.ajax("""),format.raw("""{"""),format.raw/*38.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*40.11*/routes/*40.17*/.Application.newHoraire(id))),format.raw/*40.44*/("""",
			data: '"""),format.raw("""{"""),format.raw/*41.12*/(""""jour" : "' + idJour + '""""),format.raw("""}"""),format.raw/*41.38*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*43.30*/("""
			    button.parent().append("<div id=\""+data.idHoraire+"\">"+
					"<input type=\"text\" id=\"amount"+data.idHoraire+"\" value=\"8h - 17h\" style=\"border:0; color:#f6931f; font-weight:bold;\" />"+
					"&nbsp;<a class=\"linkMinus btn btn-danger\" >"+
					"<i class=\"mesicones icon-minus\"></i></a>"+
					
					"<div class=\"slider-range\"></div></div>"
				);
			    $( ".slider-range" ).slider("""),format.raw("""{"""),format.raw/*51.37*/("""
			    	range: true,
			    	min: 0,
			    	max: 1440,
			    	step: 15,
			    	values: [ 8*60, 17*60 ],
			    	slide: function( event, ui ) """),format.raw("""{"""),format.raw/*57.39*/("""
			    		$( "#amount"+data.idHoraire ).val(parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60)+" - " + parseInt(ui.values[ 1 ]/60) +"h"+pad2(ui.values[ 1 ]%60));
			    	"""),format.raw("""}"""),format.raw/*59.10*/(""",
			    	change: function(event, ui) """),format.raw("""{"""),format.raw/*60.38*/("""
			    		var debut;
			    		var fin;
						debut = parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60);
						fin = parseInt(ui.values[ 1 ]/60) + "h"+pad2(ui.values[ 1 ]%60);
						$.ajax("""),format.raw("""{"""),format.raw/*65.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*67.15*/routes/*67.21*/.Application.dateChanged(id))),format.raw/*67.49*/("""",
							data: '"""),format.raw("""{"""),format.raw/*68.16*/(""""idhoraire" : "' + data.idHoraire + '",'+ 
							'"debut" : "' + debut + '",'+
							'"fin" : "' + fin + '""""),format.raw("""}"""),format.raw/*70.31*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*72.34*/("""

							"""),format.raw("""}"""),format.raw/*74.9*/("""               
						"""),format.raw("""}"""),format.raw/*75.8*/(""");

					"""),format.raw("""}"""),format.raw/*77.7*/("""
			    """),format.raw("""}"""),format.raw/*78.9*/(""");
			    $( "#amount"+data.idHoraire ).val( "$" + $( "#slider-range" ).slider( "values", 0 ) +
			    	" - $" + $( "#slider-range" ).slider( "values", 1 ) );
			"""),format.raw("""}"""),format.raw/*81.5*/("""               
		"""),format.raw("""}"""),format.raw/*82.4*/(""");
    """),format.raw("""}"""),format.raw/*83.6*/(""");


    $('.linkMinus').live('click', function(e) """),format.raw("""{"""),format.raw/*86.48*/("""
         
         var idHeure = $(this).parent().attr('id');
         var idJour = $(this).parent().parent().parent().attr('id');
         var button= $(this);
        $.ajax("""),format.raw("""{"""),format.raw/*91.17*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*93.11*/routes/*93.17*/.Application.deleteHoraire(id))),format.raw/*93.47*/("""",
			data: '"""),format.raw("""{"""),format.raw/*94.12*/(""""jour" : "' + idJour + '", "horaire" : "' + idHeure + '""""),format.raw("""}"""),format.raw/*94.69*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*96.30*/("""
			    button.parent().remove();
			    alert("ok");
			"""),format.raw("""}"""),format.raw/*99.5*/("""               
		"""),format.raw("""}"""),format.raw/*100.4*/(""");	
	"""),format.raw("""}"""),format.raw/*101.3*/(""");	


	$(function()"""),format.raw("""{"""),format.raw/*104.15*/("""	   
	 
	"""),format.raw("""}"""),format.raw/*106.3*/(""");
	

	
	
	function pad2(number) """),format.raw("""{"""),format.raw/*111.25*/("""
   
    	return (number < 10 ? '0' : '') + number
   
	"""),format.raw("""}"""),format.raw/*115.3*/("""

	</script>
    
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 22 08:55:52 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/heureselection.scala.html
                    HASH: 5ec75a230fc772c7a9adf93565d604b3937062fb
                    MATRIX: 788->1|929->78|961->102|1045->57|1073->76|1101->156|1141->162|1182->195|1221->197|1312->253|1352->277|1392->279|1474->325|1487->329|1512->332|1556->341|1625->401|1665->403|1706->409|1719->413|1746->418|1877->518|1920->530|2000->574|2015->580|2064->607|2351->847|2487->936|2551->964|2566->970|2615->997|2676->1011|2749->1037|2864->1105|3315->1509|3508->1655|3733->1833|3819->1872|4063->2069|4135->2105|4150->2111|4200->2139|4265->2157|4422->2267|4545->2343|4601->2353|4670->2376|4726->2386|4781->2395|4990->2558|5055->2577|5109->2585|5208->2637|5433->2815|5497->2843|5512->2849|5564->2879|5625->2893|5729->2950|5844->3018|5948->3076|6014->3095|6067->3101|6135->3121|6192->3131|6274->3165|6378->3222
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|38->9|38->9|38->9|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|48->19|50->21|52->23|52->23|52->23|64->35|67->38|69->40|69->40|69->40|70->41|70->41|72->43|80->51|86->57|88->59|89->60|94->65|96->67|96->67|96->67|97->68|99->70|101->72|103->74|104->75|106->77|107->78|110->81|111->82|112->83|115->86|120->91|122->93|122->93|122->93|123->94|123->94|125->96|128->99|129->100|130->101|133->104|135->106|140->111|144->115
                    -- GENERATED --
                */
            