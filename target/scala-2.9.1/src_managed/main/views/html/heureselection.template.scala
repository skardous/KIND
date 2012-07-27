
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
    
    <a class="btn btn-primary" href=""""),_display_(Seq[Any](/*23.39*/routes/*23.45*/.Application.editAdm(new sun.misc.BASE64Encoder().encode((event.id.toString).getBytes)))),format.raw/*23.132*/("""">Terminé</a>
	
    
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
			"""),format.raw("""}"""),format.raw/*98.5*/("""               
		"""),format.raw("""}"""),format.raw/*99.4*/(""");	
	"""),format.raw("""}"""),format.raw/*100.3*/(""");	


	$(function()"""),format.raw("""{"""),format.raw/*103.15*/("""	   
	 
	"""),format.raw("""}"""),format.raw/*105.3*/(""");
	

	
	
	function pad2(number) """),format.raw("""{"""),format.raw/*110.25*/("""
   
    	return (number < 10 ? '0' : '') + number
   
	"""),format.raw("""}"""),format.raw/*114.3*/("""

	</script>
    
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jul 27 09:40:05 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/heureselection.scala.html
                    HASH: 8a9a9630effcfbf3e014c1d2db7ee768620af0aa
                    MATRIX: 788->1|929->78|961->102|1045->57|1073->76|1101->156|1141->162|1182->195|1221->197|1312->253|1352->277|1392->279|1474->325|1487->329|1512->332|1556->341|1625->401|1665->403|1706->409|1719->413|1746->418|1877->518|1920->530|2000->574|2015->580|2125->667|2412->907|2548->996|2612->1024|2627->1030|2676->1057|2737->1071|2810->1097|2925->1165|3376->1569|3569->1715|3794->1893|3880->1932|4124->2129|4196->2165|4211->2171|4261->2199|4326->2217|4483->2327|4606->2403|4662->2413|4731->2436|4787->2446|4842->2455|5051->2618|5116->2637|5170->2645|5269->2697|5494->2875|5558->2903|5573->2909|5625->2939|5686->2953|5790->3010|5905->3078|5996->3123|6061->3142|6114->3148|6182->3168|6239->3178|6321->3212|6425->3269
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|38->9|38->9|38->9|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|48->19|50->21|52->23|52->23|52->23|64->35|67->38|69->40|69->40|69->40|70->41|70->41|72->43|80->51|86->57|88->59|89->60|94->65|96->67|96->67|96->67|97->68|99->70|101->72|103->74|104->75|106->77|107->78|110->81|111->82|112->83|115->86|120->91|122->93|122->93|122->93|123->94|123->94|125->96|127->98|128->99|129->100|132->103|134->105|139->110|143->114
                    -- GENERATED --
                */
            