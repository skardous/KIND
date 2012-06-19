
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
		  """),_display_(Seq[Any](/*15.6*/form(routes.Application.updatePersonne(id), 'id->"formJour")/*15.66*/ {_display_(Seq[Any](format.raw/*15.68*/("""
			  """),_display_(Seq[Any](/*16.7*/jour/*16.11*/.date)),format.raw/*16.16*/("""
			 
			<a class="linkPlus btn btn-success" ><i class="mesicones icon-plus"></i></a>
		
			  
		  """)))})),format.raw/*21.6*/("""
		</div>
		""")))})),format.raw/*23.4*/("""
    
    <a class="btn btn-primary" href=""""),_display_(Seq[Any](/*25.39*/routes/*25.45*/.Application.eventlist())),format.raw/*25.69*/("""">Terminé</a>
	
    
	<script type="text/javascript" charset="utf-8">

	var optionsHeuresDebut = "";
    var optionsHeuresFin = "";
	var optionsMinutes = "";
	var heuresList = new Array();

		

    $('.linkPlus').live('click', function(e) """),format.raw("""{"""),format.raw/*37.47*/("""		
		var idJour = $(this).parent().parent().attr('id');
		var button= $(this);
		$.ajax("""),format.raw("""{"""),format.raw/*40.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*42.11*/routes/*42.17*/.Application.newHoraire(id))),format.raw/*42.44*/("""",
			data: '"""),format.raw("""{"""),format.raw/*43.12*/(""""jour" : "' + idJour + '""""),format.raw("""}"""),format.raw/*43.38*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*45.30*/("""
			    button.parent().append("<div id=\""+data.idHoraire+"\">"+
					"<input type=\"text\" id=\"amount"+data.idHoraire+"\" value=\"8h - 17h\" style=\"border:0; color:#f6931f; font-weight:bold;\" />"+
					"&nbsp;<a class=\"linkMinus btn btn-danger\" >"+
					"<i class=\"mesicones icon-minus\"></i></a></div>"+
					
					"<div class=\"slider-range\"></div>"
				);
			    $( ".slider-range" ).slider("""),format.raw("""{"""),format.raw/*53.37*/("""
			    	range: true,
			    	min: 0,
			    	max: 1440,
			    	step: 15,
			    	values: [ 8*60, 17*60 ],
			    	slide: function( event, ui ) """),format.raw("""{"""),format.raw/*59.39*/("""
			    		$( "#amount"+data.idHoraire ).val(parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60)+" - " + parseInt(ui.values[ 1 ]/60) +"h"+pad2(ui.values[ 1 ]%60));
			    	"""),format.raw("""}"""),format.raw/*61.10*/(""",
			    	change: function(event, ui) """),format.raw("""{"""),format.raw/*62.38*/("""
			    		var debut;
			    		var fin;
						debut = parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60);
						fin = parseInt(ui.values[ 1 ]/60) + "h"+pad2(ui.values[ 1 ]%60);
						$.ajax("""),format.raw("""{"""),format.raw/*67.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*69.15*/routes/*69.21*/.Application.dateChanged(id))),format.raw/*69.49*/("""",
							data: '"""),format.raw("""{"""),format.raw/*70.16*/(""""idhoraire" : "' + data.idHoraire + '",'+ 
							'"debut" : "' + debut + '",'+
							'"fin" : "' + fin + '""""),format.raw("""}"""),format.raw/*72.31*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*74.34*/("""

							"""),format.raw("""}"""),format.raw/*76.9*/("""               
						"""),format.raw("""}"""),format.raw/*77.8*/(""");

					"""),format.raw("""}"""),format.raw/*79.7*/("""
			    """),format.raw("""}"""),format.raw/*80.9*/(""");
			    $( "#amount"+data.idHoraire ).val( "$" + $( "#slider-range" ).slider( "values", 0 ) +
			    	" - $" + $( "#slider-range" ).slider( "values", 1 ) );
			"""),format.raw("""}"""),format.raw/*83.5*/("""               
		"""),format.raw("""}"""),format.raw/*84.4*/(""");
    """),format.raw("""}"""),format.raw/*85.6*/(""");


    $('.linkMinus').live('click', function(e) """),format.raw("""{"""),format.raw/*88.48*/("""
         
         var idHeure = $(this).parent().attr('id');
         var idJour = $(this).parent().parent().parent().attr('id');
         var button= $(this);
        $.ajax("""),format.raw("""{"""),format.raw/*93.17*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*95.11*/routes/*95.17*/.Application.deleteHoraire(id))),format.raw/*95.47*/("""",
			data: '"""),format.raw("""{"""),format.raw/*96.12*/(""""jour" : "' + idJour + '", "horaire" : "' + idHeure + '""""),format.raw("""}"""),format.raw/*96.69*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*98.30*/("""
			    button.parent().remove();
			"""),format.raw("""}"""),format.raw/*100.5*/("""               
		"""),format.raw("""}"""),format.raw/*101.4*/(""");	
	"""),format.raw("""}"""),format.raw/*102.3*/(""");	


	$(function()"""),format.raw("""{"""),format.raw/*105.15*/("""	   
	  for (i=0;i<24;i++) """),format.raw("""{"""),format.raw/*106.24*/("""
			if (i < 10) """),format.raw("""{"""),format.raw/*107.17*/("""
				if (i != 8) """),format.raw("""{"""),format.raw/*108.18*/("""
					optionsHeuresDebut = optionsHeuresDebut+"<option value=\""+"0"+i+"\">"+"0"+i+"</option>";
				"""),format.raw("""}"""),format.raw/*110.6*/(""" else """),format.raw("""{"""),format.raw/*110.13*/("""
				    optionsHeuresDebut = optionsHeuresDebut+"<option selected value=\""+"0"+i+"\">"+"0"+i+"</option>";
				"""),format.raw("""}"""),format.raw/*112.6*/("""
				
				optionsHeuresFin = optionsHeuresFin+"<option value=\""+"0"+i+"\">"+"0"+i+"</option>";
				
				
			"""),format.raw("""}"""),format.raw/*117.5*/(""" else """),format.raw("""{"""),format.raw/*117.12*/("""
				optionsHeuresDebut = optionsHeuresDebut+"<option value=\""+i+"\">"+i+"</option>";
				
				if (i != 17) """),format.raw("""{"""),format.raw/*120.19*/("""
					optionsHeuresFin = optionsHeuresFin+"<option value=\""+i+"\">"+i+"</option>";
				"""),format.raw("""}"""),format.raw/*122.6*/(""" else """),format.raw("""{"""),format.raw/*122.13*/("""
				    optionsHeuresFin = optionsHeuresFin+"<option selected value=\""+i+"\">"+i+"</option>";
				"""),format.raw("""}"""),format.raw/*124.6*/("""
			"""),format.raw("""}"""),format.raw/*125.5*/("""
		"""),format.raw("""}"""),format.raw/*126.4*/("""
		
		for (j=0;j<60;j+=15) """),format.raw("""{"""),format.raw/*128.25*/("""
			if (j < 10) """),format.raw("""{"""),format.raw/*129.17*/("""
				optionsMinutes = optionsMinutes+"<option value=\""+"0"+j+"\">"+"0"+j+"</option>";
			"""),format.raw("""}"""),format.raw/*131.5*/(""" else """),format.raw("""{"""),format.raw/*131.12*/("""
				optionsMinutes = optionsMinutes+"<option value=\""+j+"\">"+j+"</option>";
			"""),format.raw("""}"""),format.raw/*133.5*/("""
		"""),format.raw("""}"""),format.raw/*134.4*/("""
		
	"""),format.raw("""}"""),format.raw/*136.3*/(""");
	

	
	
	function pad2(number) """),format.raw("""{"""),format.raw/*141.25*/("""
   
    	return (number < 10 ? '0' : '') + number
   
	"""),format.raw("""}"""),format.raw/*145.3*/("""

	</script>
    
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 15 09:01:45 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/heureselection.scala.html
                    HASH: 665b4650c9c1bd3d3802696202df1c17a1e7bf90
                    MATRIX: 788->1|929->78|961->102|1045->57|1073->76|1101->156|1141->162|1182->195|1221->197|1312->253|1352->277|1392->279|1474->325|1487->329|1512->332|1555->340|1624->400|1664->402|1706->409|1719->413|1746->418|1877->518|1921->531|2001->575|2016->581|2062->605|2349->845|2485->934|2549->962|2564->968|2613->995|2674->1009|2747->1035|2862->1103|3313->1507|3506->1653|3731->1831|3817->1870|4061->2067|4133->2103|4148->2109|4198->2137|4263->2155|4420->2265|4543->2341|4599->2351|4668->2374|4724->2384|4779->2393|4988->2556|5053->2575|5107->2583|5206->2635|5431->2813|5495->2841|5510->2847|5562->2877|5623->2891|5727->2948|5842->3016|5927->3054|5993->3073|6046->3079|6114->3099|6190->3127|6255->3144|6321->3162|6469->3263|6524->3270|6684->3383|6841->3493|6896->3500|7054->3610|7190->3699|7245->3706|7393->3807|7445->3812|7496->3816|7572->3844|7637->3861|7775->3952|7830->3959|7960->4042|8011->4046|8064->4052|8146->4086|8250->4143
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|38->9|38->9|38->9|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|50->21|52->23|54->25|54->25|54->25|66->37|69->40|71->42|71->42|71->42|72->43|72->43|74->45|82->53|88->59|90->61|91->62|96->67|98->69|98->69|98->69|99->70|101->72|103->74|105->76|106->77|108->79|109->80|112->83|113->84|114->85|117->88|122->93|124->95|124->95|124->95|125->96|125->96|127->98|129->100|130->101|131->102|134->105|135->106|136->107|137->108|139->110|139->110|141->112|146->117|146->117|149->120|151->122|151->122|153->124|154->125|155->126|157->128|158->129|160->131|160->131|162->133|163->134|165->136|170->141|174->145
                    -- GENERATED --
                */
            