
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

def /*7.2*/dateField/*7.11*/(field: Field, className: String = "date"):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*7.57*/("""
    """),_display_(Seq[Any](/*8.6*/input(field, '_label -> "Dates selectionnees", '_class -> className)/*8.74*/ { (id, name, value, _) =>_display_(Seq[Any](format.raw/*8.100*/("""
        <input type="text" name=""""),_display_(Seq[Any](/*9.35*/name)),format.raw/*9.39*/("""" value=""""),_display_(Seq[Any](/*9.49*/value)),format.raw/*9.54*/(""""> 
        <a class="removeDate btn danger">Remove</a>
    """)))})),format.raw/*11.6*/("""
""")))};implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),format.raw/*12.2*/("""

"""),_display_(Seq[Any](/*14.2*/main("Creer un evenement")/*14.28*/ {_display_(Seq[Any](format.raw/*14.30*/("""
    
    <h2>Selectionner les dates/horaires:</h2>
    
    """),_display_(Seq[Any](/*18.6*/form(action = routes.Application.newEvent(), args = 'class -> "form-horizontal")/*18.86*/ {_display_(Seq[Any](format.raw/*18.88*/("""         

      <div class="control-group"><label class="control-label">TITRE:&nbsp;</label> """),_display_(Seq[Any](/*20.85*/event/*20.90*/.getTitre)),format.raw/*20.99*/(""" </div>  <br>  
      
        <label class="control-label">Date</label> <div class="controls" id="date"></div> 
               	
		
   		<ul class="controls" id="altField"> </ul> 

    	montruc: <br><br>
    	<ul class="areload">
           
       </ul>  			
   		
   		
    	
    	"""),_display_(Seq[Any](/*34.7*/input(eventForm("dates"), '_label -> "")/*34.47*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*34.76*/("""
		    <input type="hidden" name=""""),_display_(Seq[Any](/*35.35*/name)),format.raw/*35.39*/("""" id="myDates" """),_display_(Seq[Any](/*35.55*/toHtmlArgs(args))),format.raw/*35.71*/(""">
		""")))})),format.raw/*36.4*/("""
		
		"""),_display_(Seq[Any](/*38.4*/input(eventForm("heures"), '_label -> "")/*38.45*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*38.74*/("""
		    <input type="hidden" name=""""),_display_(Seq[Any](/*39.35*/name)),format.raw/*39.39*/("""" id="myHours" """),_display_(Seq[Any](/*39.55*/toHtmlArgs(args))),format.raw/*39.71*/(""">
		""")))})),format.raw/*40.4*/("""
				
        
        <input type="submit" value="Create">
        
    """)))})),format.raw/*45.6*/("""
    
	<script type="text/javascript" charset="utf-8">

		var optionsHeures = "";
		var optionsMinutes = "";
		var heuresList = new Array();
		for (i=0;i<24;i++) """),format.raw("""{"""),format.raw/*52.23*/("""
			if (i < 10) """),format.raw("""{"""),format.raw/*53.17*/("""
				optionsHeures = optionsHeures+"<option value=\""+"0"+i+"\">"+"0"+i+"</option>";
			"""),format.raw("""}"""),format.raw/*55.5*/(""" else """),format.raw("""{"""),format.raw/*55.12*/("""
				optionsHeures = optionsHeures+"<option value=\""+i+"\">"+i+"</option>";
			"""),format.raw("""}"""),format.raw/*57.5*/("""
		"""),format.raw("""}"""),format.raw/*58.4*/("""
		
		for (j=0;j<60;j+=15) """),format.raw("""{"""),format.raw/*60.25*/("""
			if (j < 10) """),format.raw("""{"""),format.raw/*61.17*/("""
				optionsMinutes = optionsMinutes+"<option value=\""+"0"+j+"\">"+"0"+j+"</option>";
			"""),format.raw("""}"""),format.raw/*63.5*/(""" else """),format.raw("""{"""),format.raw/*63.12*/("""
				optionsMinutes = optionsMinutes+"<option value=\""+j+"\">"+j+"</option>";
			"""),format.raw("""}"""),format.raw/*65.5*/("""
		"""),format.raw("""}"""),format.raw/*66.4*/("""

	$(function()"""),format.raw("""{"""),format.raw/*68.15*/("""
		$( "#date" ).multiDatesPicker();
		
		$("#date").multiDatesPicker("""),format.raw("""{"""),format.raw/*71.32*/("""
	   		onSelect: function(dateText) """),format.raw("""{"""),format.raw/*72.37*/("""
	   		  	$(".areload").html("");
	   			$(".areload").html(
	   			    """"),_display_(Seq[Any](/*75.14*/for(jour <- event.jours) yield /*75.38*/ {_display_(Seq[Any](format.raw/*75.40*/(""""+
        	   "<li>"""),_display_(Seq[Any](/*76.19*/jour/*76.23*/.date)),format.raw/*76.28*/(""" &nbsp;"+
           		"</li>""")))})),format.raw/*77.21*/(""""
	   			    );
	   			$.ajax("""),format.raw("""{"""),format.raw/*79.16*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*81.13*/routes/*81.19*/.Application.addDate(id))),format.raw/*81.43*/("""",
					data: '"""),format.raw("""{"""),format.raw/*82.14*/(""""date" : "' + dateText + '""""),format.raw("""}"""),format.raw/*82.42*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*84.32*/("""
					  ajouterDate(dateText);
					"""),format.raw("""}"""),format.raw/*86.7*/("""               
				"""),format.raw("""}"""),format.raw/*87.6*/(""");		
	    	"""),format.raw("""}"""),format.raw/*88.8*/("""
		"""),format.raw("""}"""),format.raw/*89.4*/("""); 
	"""),format.raw("""}"""),format.raw/*90.3*/(""");
	
	function ajouterDate(dateText) """),format.raw("""{"""),format.raw/*92.34*/("""
			$("#altField").append("<li id=\""+dateText+"\">"+ 
		"<a class=\"linkDate\" name=\""+dateText+"\">"+
		"<i class=\"icon-trash\"></i>&nbsp;"+
		"</a>"+dateText+
		" &nbsp; <br>&nbsp; Debut :<select id=\"hrDeb\">"+optionsHeures+"</select>"+
		"h"+
		"<select id=\"minDeb\">"+optionsMinutes+"</select>"+
		" Fin :<select id=\"hrFin\">"+optionsHeures+"</select>"+
		"h"+
		"<select id=\"minFin\">"+optionsMinutes+"</select>"+
		"<a class=\"linkPlus\" >"+
		"<i class=\"icon-plus\"></i></a>"+
		"</li>");
	"""),format.raw("""}"""),format.raw/*106.3*/("""	

	$('#hrDeb, #minDeb, #hrFin, #minFin').live('change', function(e) """),format.raw("""{"""),format.raw/*108.68*/("""
		/* var string = $(this).parent().children('#hrDeb').val()+"h"+$(this).parent().children('#minDeb').val()+" - "+
		$(this).parent().children('#hrFin').val()+"h"+$(this).parent().children('#minFin').val();
		var rang = $(this).siblings("a").attr('id');	
		heuresList[rang] = string;	
		$("#myHours").attr('value', heuresList);*/
	  
	  //alert($(this).parent().attr("id"));
	  var debut = $(this).parent().children('#hrDeb').val()+"h"+$(this).parent().children('#minDeb').val();
	    var fin = $(this).parent().children('#hrFin').val()+"h"+$(this).parent().children('#minFin').val();
	   var date = $(this).parent().attr("id");
	  
	    	$.ajax("""),format.raw("""{"""),format.raw/*120.15*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*122.12*/routes/*122.18*/.Application.dateChanged(id))),format.raw/*122.46*/("""",
				data: '"""),format.raw("""{"""),format.raw/*123.13*/(""""date" : "' + date + '",'+ 
				  		'"debut" : "' + debut + '",'+
				  		'"fin" : "' + fin + '""""),format.raw("""}"""),format.raw/*125.32*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*127.31*/("""
					  
				"""),format.raw("""}"""),format.raw/*129.6*/("""               
			"""),format.raw("""}"""),format.raw/*130.5*/(""");
		
		
		
			
	"""),format.raw("""}"""),format.raw/*135.3*/(""");

	</script>
    
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 01 15:58:35 CEST 2012
                    SOURCE: C:/tutoPlay/doodle/app/views/dateselection.scala.html
                    HASH: 08e7712188d13f19b78bf116aee81d1dd3b458c0
                    MATRIX: 787->1|919->160|936->169|1045->215|1085->221|1161->289|1225->315|1295->350|1320->354|1365->364|1391->369|1483->430|1516->78|1548->102|1632->57|1660->76|1688->156|1718->432|1756->435|1791->461|1831->463|1928->525|2017->605|2057->607|2188->702|2202->707|2233->716|2553->1001|2602->1041|2669->1070|2740->1105|2766->1109|2818->1125|2856->1141|2892->1146|2934->1153|2984->1194|3051->1223|3122->1258|3148->1262|3200->1278|3238->1294|3274->1299|3379->1373|3589->1536|3653->1553|3788->1642|3842->1649|3969->1730|4019->1734|4094->1762|4158->1779|4295->1870|4349->1877|4478->1960|4528->1964|4591->1980|4708->2050|4792->2087|4902->2161|4942->2185|4982->2187|5039->2208|5052->2212|5079->2217|5141->2247|5219->2278|5287->2310|5302->2316|5348->2340|5411->2356|5486->2384|5605->2456|5688->2493|5755->2514|5813->2526|5863->2530|5915->2536|6000->2574|6553->3080|6671->3150|7366->3797|7433->3827|7449->3833|7500->3861|7563->3876|7708->3973|7826->4043|7887->4057|7954->4077|8019->4095
                    LINES: 27->1|30->7|30->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|34->9|36->11|37->5|37->5|38->1|40->4|41->5|43->12|45->14|45->14|45->14|49->18|49->18|49->18|51->20|51->20|51->20|65->34|65->34|65->34|66->35|66->35|66->35|66->35|67->36|69->38|69->38|69->38|70->39|70->39|70->39|70->39|71->40|76->45|83->52|84->53|86->55|86->55|88->57|89->58|91->60|92->61|94->63|94->63|96->65|97->66|99->68|102->71|103->72|106->75|106->75|106->75|107->76|107->76|107->76|108->77|110->79|112->81|112->81|112->81|113->82|113->82|115->84|117->86|118->87|119->88|120->89|121->90|123->92|137->106|139->108|151->120|153->122|153->122|153->122|154->123|156->125|158->127|160->129|161->130|166->135
                    -- GENERATED --
                */
            