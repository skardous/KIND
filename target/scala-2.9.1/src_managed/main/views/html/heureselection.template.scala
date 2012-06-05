
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



"""),_display_(Seq[Any](/*9.2*/main("Creer un evenement")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
    
    <h2>Selectionner les dates/horaires:</h2>
    
    """),_display_(Seq[Any](/*13.6*/for(jour <- event.jours) yield /*13.30*/ {_display_(Seq[Any](format.raw/*13.32*/("""
		<div class="control-group" id=""""),_display_(Seq[Any](/*14.35*/jour/*14.39*/.getId)),format.raw/*14.45*/("""">
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
			    button.parent().append("<div id=\""+data.idHoraire+"\"><br>&nbsp; Debut :<select id=\"hrDeb\">"+optionsHeuresDebut+"</select>"+
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
                    DATE: Tue Jun 05 08:42:30 CEST 2012
                    SOURCE: C:/tutoPlay/doodle/app/views/heureselection.scala.html
                    HASH: 7876c980c682ad1b0c34cdfb7432bb49be6d762c
                    MATRIX: 788->1|929->78|961->102|1045->57|1073->76|1101->156|1141->162|1175->188|1214->190|1311->252|1351->276|1391->278|1462->313|1475->317|1503->323|1546->331|1615->391|1655->393|1697->400|1710->404|1742->414|1867->508|1911->521|1991->565|2006->571|2052->595|2339->835|2475->924|2539->952|2554->958|2603->985|2664->999|2737->1025|2852->1093|3346->1541|3411->1560|3465->1568|3564->1620|3789->1798|3853->1826|3868->1832|3920->1862|3981->1876|4085->1933|4200->2001|4284->2039|4349->2058|4401->2064|4468->2084|4543->2112|4607->2129|4672->2147|4819->2248|4873->2255|5032->2368|5188->2478|5242->2485|5399->2595|5534->2684|5588->2691|5735->2792|5786->2797|5836->2801|5912->2829|5977->2846|6115->2937|6170->2944|6300->3027|6351->3031|6404->3037|6525->3110|6851->3388|6918->3418|6934->3424|6985->3452|7048->3467|7203->3574|7321->3644|7380->3656|7447->3676|7501->3683
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|38->9|38->9|38->9|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|51->22|53->24|55->26|55->26|55->26|67->38|70->41|72->43|72->43|72->43|73->44|73->44|75->46|85->56|86->57|87->58|90->61|95->66|97->68|97->68|97->68|98->69|98->69|100->71|102->73|103->74|104->75|107->78|108->79|109->80|110->81|112->83|112->83|114->85|119->90|119->90|122->93|124->95|124->95|126->97|127->98|128->99|130->101|131->102|133->104|133->104|135->106|136->107|138->109|141->112|146->117|148->119|148->119|148->119|149->120|151->122|153->124|155->126|156->127|157->128
                    -- GENERATED --
                */
            