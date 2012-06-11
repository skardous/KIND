
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
    
           

      <div class="control-group"><label class="control-label">TITRE:&nbsp;</label> """),_display_(Seq[Any](/*14.85*/event/*14.90*/.getTitre)),format.raw/*14.99*/(""" </div>  <br>  
      
        <label class="control-label">Date</label> <div class="controls" id="date"></div> 
		
   		<ul class="controls" id="altField"> </ul> 
    	
    	"""),_display_(Seq[Any](/*20.7*/input(eventForm("dates"), '_label -> "")/*20.47*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*20.76*/("""
		    <input type="hidden" name=""""),_display_(Seq[Any](/*21.35*/name)),format.raw/*21.39*/("""" id="myDates" """),_display_(Seq[Any](/*21.55*/toHtmlArgs(args))),format.raw/*21.71*/(""">
		""")))})),format.raw/*22.4*/("""
		
		"""),_display_(Seq[Any](/*24.4*/input(eventForm("heures"), '_label -> "")/*24.45*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*24.74*/("""
		    <input type="hidden" name=""""),_display_(Seq[Any](/*25.35*/name)),format.raw/*25.39*/("""" id="myHours" """),_display_(Seq[Any](/*25.55*/toHtmlArgs(args))),format.raw/*25.71*/(""">
		""")))})),format.raw/*26.4*/("""
				
        
        <a href=""""),_display_(Seq[Any](/*29.19*/routes/*29.25*/.Application.heureSelection(event.getId))),format.raw/*29.65*/("""" class="btn btn-primary">Continuer</a>
        
    
    
	<script type="text/javascript" charset="utf-8">

		var optionsHeures = "";
		var optionsMinutes = "";
		var heuresList = new Array(); 
	

	$(function()"""),format.raw("""{"""),format.raw/*40.15*/("""  
		
		$( "#date" ).multiDatesPicker();
		
		$("#date").multiDatesPicker("""),format.raw("""{"""),format.raw/*44.32*/("""
	   		onSelect: function(date) """),format.raw("""{"""),format.raw/*45.33*/("""
	   		    var selectionType = $.inArray(date, $( "#date" ).multiDatesPicker('getDates'));
	   		    var d = new Date(date);
	   		    
	   		    //var d = date.substring(1, 8);
	   		    var dateText = d.toLocaleDateString();
	   		    if (selectionType == -1) """),format.raw("""{"""),format.raw/*51.37*/(""" // suppression de la date dans la liste
	   		      var str = dateText.replace("/", "");
	   		      str = str.replace("/", "");
	   		      	   		      
	   		      $("#"+str).remove();
	   		    """),format.raw("""}"""),format.raw/*56.12*/("""
	   		
	   		  	$(".areload").html("");
	   			$(".areload").html(
	   			    """"),_display_(Seq[Any](/*60.14*/for(jour <- event.jours) yield /*60.38*/ {_display_(Seq[Any](format.raw/*60.40*/(""""+
	        	   		"<li>"""),_display_(Seq[Any](/*61.22*/jour/*61.26*/.date)),format.raw/*61.31*/(""" &nbsp;"+
	           		"</li>""")))})),format.raw/*62.22*/(""""
	   			    );
	   			$.ajax("""),format.raw("""{"""),format.raw/*64.16*/("""
					type: "POST",
					url: """"),_display_(Seq[Any](/*66.13*/routes/*66.19*/.Application.addDate(id))),format.raw/*66.43*/("""",
					data: '"""),format.raw("""{"""),format.raw/*67.14*/(""""date" : "' + dateText + '""""),format.raw("""}"""),format.raw/*67.42*/("""',
					contentType: "application/json",
					success : function(data) """),format.raw("""{"""),format.raw/*69.32*/("""
					  if (selectionType != -1) """),format.raw("""{"""),format.raw/*70.34*/("""					
						  ajouterDate(dateText);
					  """),format.raw("""}"""),format.raw/*72.9*/("""
					"""),format.raw("""}"""),format.raw/*73.7*/("""               
				"""),format.raw("""}"""),format.raw/*74.6*/(""");		
	    	"""),format.raw("""}"""),format.raw/*75.8*/("""
		"""),format.raw("""}"""),format.raw/*76.4*/("""); 
	"""),format.raw("""}"""),format.raw/*77.3*/(""");
	
	function ajouterDate(dateText) """),format.raw("""{"""),format.raw/*79.34*/("""
	  var str = dateText.replace("/", "");//efface le premier slash de la date
	  str = str.replace("/", "");//efface le premier slash de la date
			$("#altField").append("<li id=\""+str+"\">"+ 
		"<a class=\"linkDate\" name=\""+dateText+"\">"+
		"<i class=\"icon-trash\"></i>&nbsp;"+
		"</a>"+dateText+		
		"</li>");
	"""),format.raw("""}"""),format.raw/*87.3*/("""	

	$('.linkDate').live('click', function(e) """),format.raw("""{"""),format.raw/*89.44*/("""	  
	   $("#date").multiDatesPicker('removeDates', $(this).attr("name")); //enleve la date dans l'affichage du datepicker
	   $(this).parent().remove();
	   /*SUPPRESSION DE DATE*/
	   
	   $.ajax("""),format.raw("""{"""),format.raw/*94.13*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*96.11*/routes/*96.17*/.Application.removeDate(id))),format.raw/*96.44*/("""",
			data: '"""),format.raw("""{"""),format.raw/*97.12*/(""""date" : "' + $(this).attr("name") + '""""),format.raw("""}"""),format.raw/*97.52*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*99.30*/("""
			  
			"""),format.raw("""}"""),format.raw/*101.5*/("""               
		"""),format.raw("""}"""),format.raw/*102.4*/(""");	
	   
	"""),format.raw("""}"""),format.raw/*104.3*/(""");


	</script>
    
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 11 14:12:17 CEST 2012
                    SOURCE: C:/tutoPlay/doodle/app/views/dateselection.scala.html
                    HASH: adaa37d35ec036959512acdcbee8dca3dba41e89
                    MATRIX: 787->1|928->78|960->102|1044->57|1072->76|1100->156|1139->161|1177->191|1216->193|1397->338|1411->343|1442->352|1653->528|1702->568|1769->597|1840->632|1866->636|1918->652|1956->668|1992->673|2034->680|2084->721|2151->750|2222->785|2248->789|2300->805|2338->821|2374->826|2443->859|2458->865|2520->905|2779->1117|2901->1192|2981->1225|3291->1488|3537->1687|3654->1768|3694->1792|3734->1794|3794->1818|3807->1822|3834->1827|3897->1858|3975->1889|4043->1921|4058->1927|4104->1951|4167->1967|4242->1995|4361->2067|4442->2101|4533->2146|4586->2153|4653->2174|4711->2186|4761->2190|4813->2196|4898->2234|5262->2552|5355->2598|5600->2796|5664->2824|5679->2830|5728->2857|5789->2871|5876->2911|5991->2979|6049->2990|6115->3009|6173->3020
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|43->14|43->14|43->14|49->20|49->20|49->20|50->21|50->21|50->21|50->21|51->22|53->24|53->24|53->24|54->25|54->25|54->25|54->25|55->26|58->29|58->29|58->29|69->40|73->44|74->45|80->51|85->56|89->60|89->60|89->60|90->61|90->61|90->61|91->62|93->64|95->66|95->66|95->66|96->67|96->67|98->69|99->70|101->72|102->73|103->74|104->75|105->76|106->77|108->79|116->87|118->89|123->94|125->96|125->96|125->96|126->97|126->97|128->99|130->101|131->102|133->104
                    -- GENERATED --
                */
            