
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
		<div class="control-group selectDate" id=""""),_display_(Seq[Any](/*14.46*/jour/*14.50*/.getId)),format.raw/*14.56*/("""">
		  """),_display_(Seq[Any](/*15.6*/form(routes.Application.updatePersonne(id), 'id->"formJour")/*15.66*/ {_display_(Seq[Any](format.raw/*15.68*/("""
			  """),_display_(Seq[Any](/*16.7*/jour/*16.11*/.getDate())),format.raw/*16.21*/("""
			 
			<a class="linkPlus btn btn-success" >
			<i class="icon-plus"></i></a>
		
			  
		  """)))})),format.raw/*22.6*/("""
		</div>
		""")))})),format.raw/*24.4*/("""
    
    <a class="btn btn-primary" href=""""),_display_(Seq[Any](/*26.39*/routes/*26.45*/.Application.eventlist())),format.raw/*26.69*/("""">Terminé</a>
	
    
	<script type="text/javascript" charset="utf-8">

	var optionsHeuresDebut = "";
    var optionsHeuresFin = "";
	var optionsMinutes = "";
	var heuresList = new Array();

		

    $('.linkPlus').live('click', function(e) """),format.raw("""{"""),format.raw/*38.47*/("""		
		var idJour = $(this).parent().parent().attr('id');
		var button= $(this);
		$.ajax("""),format.raw("""{"""),format.raw/*41.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*43.11*/routes/*43.17*/.Application.newHoraire(id))),format.raw/*43.44*/("""",
			data: '"""),format.raw("""{"""),format.raw/*44.12*/(""""jour" : "' + idJour + '""""),format.raw("""}"""),format.raw/*44.38*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*46.30*/("""
			    button.parent().append("<div id=\""+data.idHoraire+"\">&nbsp; Debut :<select id=\"hrDeb\">"+optionsHeuresDebut+"</select>"+
					"h"+
					"<select id=\"minDeb\">"+optionsMinutes+"</select>"+
					" Fin :<select id=\"hrFin\">"+optionsHeuresFin+"</select>"+
					"h"+
					"<select id=\"minFin\">"+optionsMinutes+"</select>"+
					"&nbsp;<a class=\"linkMinus btn btn-danger\" >"+
					"<i class=\"icon-minus\"></i></a></div>"
				);
			"""),format.raw("""}"""),format.raw/*56.5*/("""               
		"""),format.raw("""}"""),format.raw/*57.4*/(""");
    """),format.raw("""}"""),format.raw/*58.6*/(""");


    $('.linkMinus').live('click', function(e) """),format.raw("""{"""),format.raw/*61.48*/("""
         
         var idHeure = $(this).parent().attr('id');
         var idJour = $(this).parent().parent().parent().attr('id');
         var button= $(this);
        $.ajax("""),format.raw("""{"""),format.raw/*66.17*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*68.11*/routes/*68.17*/.Application.deleteHoraire(id))),format.raw/*68.47*/("""",
			data: '"""),format.raw("""{"""),format.raw/*69.12*/(""""jour" : "' + idJour + '", "horaire" : "' + idHeure + '""""),format.raw("""}"""),format.raw/*69.69*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*71.30*/("""
			    button.parent().remove();
			"""),format.raw("""}"""),format.raw/*73.5*/("""               
		"""),format.raw("""}"""),format.raw/*74.4*/(""");	
	"""),format.raw("""}"""),format.raw/*75.3*/(""");	


	$(function()"""),format.raw("""{"""),format.raw/*78.15*/("""	   
	  for (i=0;i<24;i++) """),format.raw("""{"""),format.raw/*79.24*/("""
			if (i < 10) """),format.raw("""{"""),format.raw/*80.17*/("""
				if (i != 8) """),format.raw("""{"""),format.raw/*81.18*/("""
					optionsHeuresDebut = optionsHeuresDebut+"<option value=\""+"0"+i+"\">"+"0"+i+"</option>";
				"""),format.raw("""}"""),format.raw/*83.6*/(""" else """),format.raw("""{"""),format.raw/*83.13*/("""
				    optionsHeuresDebut = optionsHeuresDebut+"<option selected value=\""+"0"+i+"\">"+"0"+i+"</option>";
				"""),format.raw("""}"""),format.raw/*85.6*/("""
				
				optionsHeuresFin = optionsHeuresFin+"<option value=\""+"0"+i+"\">"+"0"+i+"</option>";
				
				
			"""),format.raw("""}"""),format.raw/*90.5*/(""" else """),format.raw("""{"""),format.raw/*90.12*/("""
				optionsHeuresDebut = optionsHeuresDebut+"<option value=\""+i+"\">"+i+"</option>";
				
				if (i != 17) """),format.raw("""{"""),format.raw/*93.19*/("""
					optionsHeuresFin = optionsHeuresFin+"<option value=\""+i+"\">"+i+"</option>";
				"""),format.raw("""}"""),format.raw/*95.6*/(""" else """),format.raw("""{"""),format.raw/*95.13*/("""
				    optionsHeuresFin = optionsHeuresFin+"<option selected value=\""+i+"\">"+i+"</option>";
				"""),format.raw("""}"""),format.raw/*97.6*/("""
			"""),format.raw("""}"""),format.raw/*98.5*/("""
		"""),format.raw("""}"""),format.raw/*99.4*/("""
		
		for (j=0;j<60;j+=15) """),format.raw("""{"""),format.raw/*101.25*/("""
			if (j < 10) """),format.raw("""{"""),format.raw/*102.17*/("""
				optionsMinutes = optionsMinutes+"<option value=\""+"0"+j+"\">"+"0"+j+"</option>";
			"""),format.raw("""}"""),format.raw/*104.5*/(""" else """),format.raw("""{"""),format.raw/*104.12*/("""
				optionsMinutes = optionsMinutes+"<option value=\""+j+"\">"+j+"</option>";
			"""),format.raw("""}"""),format.raw/*106.5*/("""
		"""),format.raw("""}"""),format.raw/*107.4*/("""
		
	"""),format.raw("""}"""),format.raw/*109.3*/(""");
	

	$('#hrDeb, #minDeb, #hrFin, #minFin').live('change', function(e) """),format.raw("""{"""),format.raw/*112.68*/("""
	  var debut = $(this).parent().children('#hrDeb').val()+"h"+$(this).parent().children('#minDeb').val();
	    var fin = $(this).parent().children('#hrFin').val()+"h"+$(this).parent().children('#minFin').val();
	   var idhoraire = $(this).parent().attr("id");
	  
	    	$.ajax("""),format.raw("""{"""),format.raw/*117.15*/("""
				type: "POST",
				url: """"),_display_(Seq[Any](/*119.12*/routes/*119.18*/.Application.dateChanged(id))),format.raw/*119.46*/("""",
				data: '"""),format.raw("""{"""),format.raw/*120.13*/(""""idhoraire" : "' + idhoraire + '",'+ 
				  		'"debut" : "' + debut + '",'+
				  		'"fin" : "' + fin + '""""),format.raw("""}"""),format.raw/*122.32*/("""',
				contentType: "application/json",
				success : function(data) """),format.raw("""{"""),format.raw/*124.31*/("""
					
				"""),format.raw("""}"""),format.raw/*126.6*/("""               
			"""),format.raw("""}"""),format.raw/*127.5*/(""");		
	"""),format.raw("""}"""),format.raw/*128.3*/(""");

	</script>
    
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 11 08:37:35 CEST 2012
                    SOURCE: C:/tutoPlay/doodle/app/views/heureselection.scala.html
                    HASH: 84803d977df99fbec1d6f0af3c5bd30ec73a110c
                    MATRIX: 788->1|929->78|961->102|1045->57|1073->76|1101->156|1141->162|1182->195|1221->197|1312->253|1352->277|1392->279|1474->325|1487->329|1515->335|1558->343|1627->403|1667->405|1709->412|1722->416|1754->426|1879->520|1923->533|2003->577|2018->583|2064->607|2351->847|2487->936|2551->964|2566->970|2615->997|2676->1011|2749->1037|2864->1105|3354->1549|3419->1568|3473->1576|3572->1628|3797->1806|3861->1834|3876->1840|3928->1870|3989->1884|4093->1941|4208->2009|4292->2047|4357->2066|4409->2072|4476->2092|4551->2120|4615->2137|4680->2155|4827->2256|4881->2263|5040->2376|5196->2486|5250->2493|5407->2603|5542->2692|5596->2699|5743->2800|5794->2805|5844->2809|5920->2837|5985->2854|6123->2945|6178->2952|6308->3035|6359->3039|6412->3045|6533->3118|6859->3396|6926->3426|6942->3432|6993->3460|7056->3475|7211->3582|7329->3652|7388->3664|7455->3684|7509->3691
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|38->9|38->9|38->9|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|51->22|53->24|55->26|55->26|55->26|67->38|70->41|72->43|72->43|72->43|73->44|73->44|75->46|85->56|86->57|87->58|90->61|95->66|97->68|97->68|97->68|98->69|98->69|100->71|102->73|103->74|104->75|107->78|108->79|109->80|110->81|112->83|112->83|114->85|119->90|119->90|122->93|124->95|124->95|126->97|127->98|128->99|130->101|131->102|133->104|133->104|135->106|136->107|138->109|141->112|146->117|148->119|148->119|148->119|149->120|151->122|153->124|155->126|156->127|157->128
                    -- GENERATED --
                */
            