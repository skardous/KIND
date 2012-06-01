
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
	$(function()"""),format.raw("""{"""),format.raw/*48.15*/("""
		$( "#date" ).multiDatesPicker();
		
		$("#date").multiDatesPicker("""),format.raw("""{"""),format.raw/*51.32*/("""
	   		onSelect: function(dateText) """),format.raw("""{"""),format.raw/*52.37*/("""
	   		  	$(".areload").html("");
	   			$(".areload").html(
	   			    """"),_display_(Seq[Any](/*55.14*/for(jour <- event.jours) yield /*55.38*/ {_display_(Seq[Any](format.raw/*55.40*/(""""+
        	   "<li>"""),_display_(Seq[Any](/*56.19*/jour/*56.23*/.date)),format.raw/*56.28*/(""" &nbsp;"+
           		"</li>""")))})),format.raw/*57.21*/(""""
	   			    );
	   			$.ajax("""),format.raw("""{"""),format.raw/*59.16*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*61.13*/routes/*61.19*/.Application.addDate(id))),format.raw/*61.43*/("""",
					data: '"""),format.raw("""{"""),format.raw/*62.14*/(""""date" : "' + dateText + '""""),format.raw("""}"""),format.raw/*62.42*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*64.32*/("""
					  afficheDates();
					"""),format.raw("""}"""),format.raw/*66.7*/("""               
				"""),format.raw("""}"""),format.raw/*67.6*/(""");		
	    	"""),format.raw("""}"""),format.raw/*68.8*/("""
		"""),format.raw("""}"""),format.raw/*69.4*/("""); 
	"""),format.raw("""}"""),format.raw/*70.3*/(""");


	$('#hrDeb, #minDeb, #hrFin, #minFin').live('change', function(e) """),format.raw("""{"""),format.raw/*73.68*/("""
		/* var string = $(this).parent().children('#hrDeb').val()+"h"+$(this).parent().children('#minDeb').val()+" - "+
		$(this).parent().children('#hrFin').val()+"h"+$(this).parent().children('#minFin').val();
		var rang = $(this).siblings("a").attr('id');	
		heuresList[rang] = string;	
		$("#myHours").attr('value', heuresList);*/
	  
	  //alert($(this).parent().attr("id"));
	  var debut = $(this).parent().children('#hrDeb').val()+"h"+$(this).parent().children('#minDeb').val();
	    var fin = $(this).parent().children('#hrFin').val()+"h"+$(this).parent().children('#minFin').val();
	   var date = $(this).parent().attr("id");
	  
	    	$.ajax("""),format.raw("""{"""),format.raw/*85.15*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*87.12*/routes/*87.18*/.Application.dateChanged(id))),format.raw/*87.46*/("""",
				data: '"""),format.raw("""{"""),format.raw/*88.13*/(""""date" : "' + date + '",'+ 
				  		'"debut" : "' + debut + '",'+
				  		'"fin" : "' + fin + '""""),format.raw("""}"""),format.raw/*90.32*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*92.31*/("""
					  alert("ok");
				"""),format.raw("""}"""),format.raw/*94.6*/("""               
			"""),format.raw("""}"""),format.raw/*95.5*/(""");
		
		
		
			
	"""),format.raw("""}"""),format.raw/*100.3*/(""");

	</script>
    
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 01 13:49:27 CEST 2012
                    SOURCE: C:/tutoPlay/doodle/app/views/dateselection.scala.html
                    HASH: 8ce95ebae51f229cba9ecf5b6dd5dcf25091377b
                    MATRIX: 787->1|919->160|936->169|1045->215|1085->221|1161->289|1225->315|1295->350|1320->354|1365->364|1391->369|1483->430|1516->78|1548->102|1632->57|1660->76|1688->156|1718->432|1756->435|1791->461|1831->463|1928->525|2017->605|2057->607|2188->702|2202->707|2233->716|2553->1001|2602->1041|2669->1070|2740->1105|2766->1109|2818->1125|2856->1141|2892->1146|2934->1153|2984->1194|3051->1223|3122->1258|3148->1262|3200->1278|3238->1294|3274->1299|3379->1373|3495->1442|3612->1512|3696->1549|3806->1623|3846->1647|3886->1649|3943->1670|3956->1674|3983->1679|4045->1709|4123->1740|4191->1772|4206->1778|4252->1802|4315->1818|4390->1846|4509->1918|4585->1948|4652->1969|4710->1981|4760->1985|4812->1991|4931->2063|5625->2710|5691->2740|5706->2746|5756->2774|5818->2789|5962->2886|6079->2956|6151->2982|6217->3002|6282->3020
                    LINES: 27->1|30->7|30->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|34->9|36->11|37->5|37->5|38->1|40->4|41->5|43->12|45->14|45->14|45->14|49->18|49->18|49->18|51->20|51->20|51->20|65->34|65->34|65->34|66->35|66->35|66->35|66->35|67->36|69->38|69->38|69->38|70->39|70->39|70->39|70->39|71->40|76->45|79->48|82->51|83->52|86->55|86->55|86->55|87->56|87->56|87->56|88->57|90->59|92->61|92->61|92->61|93->62|93->62|95->64|97->66|98->67|99->68|100->69|101->70|104->73|116->85|118->87|118->87|118->87|119->88|121->90|123->92|125->94|126->95|131->100
                    -- GENERATED --
                */
            