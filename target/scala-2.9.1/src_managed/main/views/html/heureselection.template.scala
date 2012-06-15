
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
			 
			<a class="linkPlus btn btn-success" >
			<i class="mesicones icon-plus"></i></a>
		
			  
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
			    button.parent().append("<div id=\""+data.idHoraire+"\">"+
					"<input type=\"text\" id=\"amount"+data.idHoraire+"\" value=\"8h - 17h\" style=\"border:0; color:#f6931f; font-weight:bold;\" />"+
					"&nbsp;<a class=\"linkMinus btn btn-danger\" >"+
					"<i class=\"mesicones icon-minus\"></i></a></div>"+
					
					"<div class=\"slider-range\"></div>"
				);
			    $( ".slider-range" ).slider("""),format.raw("""{"""),format.raw/*54.37*/("""
			    	range: true,
			    	min: 0,
			    	max: 1440,
			    	step: 15,
			    	values: [ 8*60, 17*60 ],
			    	slide: function( event, ui ) """),format.raw("""{"""),format.raw/*60.39*/("""
			    		$( "#amount"+data.idHoraire ).val(parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60)+" - " + parseInt(ui.values[ 1 ]/60) +"h"+pad2(ui.values[ 1 ]%60));
			    	"""),format.raw("""}"""),format.raw/*62.10*/(""",
			    	change: function(event, ui) """),format.raw("""{"""),format.raw/*63.38*/("""
			    		var debut;
			    		var fin;
						debut = parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60);
						fin = parseInt(ui.values[ 1 ]/60) + "h"+pad2(ui.values[ 1 ]%60);
						$.ajax("""),format.raw("""{"""),format.raw/*68.15*/("""
							type: "POST",
							url: """"),_display_(Seq[Any](/*70.15*/routes/*70.21*/.Application.dateChanged(id))),format.raw/*70.49*/("""",
							data: '"""),format.raw("""{"""),format.raw/*71.16*/(""""idhoraire" : "' + data.idHoraire + '",'+ 
							'"debut" : "' + debut + '",'+
							'"fin" : "' + fin + '""""),format.raw("""}"""),format.raw/*73.31*/("""',
							contentType: "application/json",
							success : function(data) """),format.raw("""{"""),format.raw/*75.34*/("""

							"""),format.raw("""}"""),format.raw/*77.9*/("""               
						"""),format.raw("""}"""),format.raw/*78.8*/(""");

					"""),format.raw("""}"""),format.raw/*80.7*/("""
			    """),format.raw("""}"""),format.raw/*81.9*/(""");
			    $( "#amount"+data.idHoraire ).val( "$" + $( "#slider-range" ).slider( "values", 0 ) +
			    	" - $" + $( "#slider-range" ).slider( "values", 1 ) );
			"""),format.raw("""}"""),format.raw/*84.5*/("""               
		"""),format.raw("""}"""),format.raw/*85.4*/(""");
    """),format.raw("""}"""),format.raw/*86.6*/(""");


    $('.linkMinus').live('click', function(e) """),format.raw("""{"""),format.raw/*89.48*/("""
         
         var idHeure = $(this).parent().attr('id');
         var idJour = $(this).parent().parent().parent().attr('id');
         var button= $(this);
        $.ajax("""),format.raw("""{"""),format.raw/*94.17*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*96.11*/routes/*96.17*/.Application.deleteHoraire(id))),format.raw/*96.47*/("""",
			data: '"""),format.raw("""{"""),format.raw/*97.12*/(""""jour" : "' + idJour + '", "horaire" : "' + idHeure + '""""),format.raw("""}"""),format.raw/*97.69*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*99.30*/("""
			    button.parent().remove();
			"""),format.raw("""}"""),format.raw/*101.5*/("""               
		"""),format.raw("""}"""),format.raw/*102.4*/(""");	
	"""),format.raw("""}"""),format.raw/*103.3*/(""");	


	$(function()"""),format.raw("""{"""),format.raw/*106.15*/("""	   
	  for (i=0;i<24;i++) """),format.raw("""{"""),format.raw/*107.24*/("""
			if (i < 10) """),format.raw("""{"""),format.raw/*108.17*/("""
				if (i != 8) """),format.raw("""{"""),format.raw/*109.18*/("""
					optionsHeuresDebut = optionsHeuresDebut+"<option value=\""+"0"+i+"\">"+"0"+i+"</option>";
				"""),format.raw("""}"""),format.raw/*111.6*/(""" else """),format.raw("""{"""),format.raw/*111.13*/("""
				    optionsHeuresDebut = optionsHeuresDebut+"<option selected value=\""+"0"+i+"\">"+"0"+i+"</option>";
				"""),format.raw("""}"""),format.raw/*113.6*/("""
				
				optionsHeuresFin = optionsHeuresFin+"<option value=\""+"0"+i+"\">"+"0"+i+"</option>";
				
				
			"""),format.raw("""}"""),format.raw/*118.5*/(""" else """),format.raw("""{"""),format.raw/*118.12*/("""
				optionsHeuresDebut = optionsHeuresDebut+"<option value=\""+i+"\">"+i+"</option>";
				
				if (i != 17) """),format.raw("""{"""),format.raw/*121.19*/("""
					optionsHeuresFin = optionsHeuresFin+"<option value=\""+i+"\">"+i+"</option>";
				"""),format.raw("""}"""),format.raw/*123.6*/(""" else """),format.raw("""{"""),format.raw/*123.13*/("""
				    optionsHeuresFin = optionsHeuresFin+"<option selected value=\""+i+"\">"+i+"</option>";
				"""),format.raw("""}"""),format.raw/*125.6*/("""
			"""),format.raw("""}"""),format.raw/*126.5*/("""
		"""),format.raw("""}"""),format.raw/*127.4*/("""
		
		for (j=0;j<60;j+=15) """),format.raw("""{"""),format.raw/*129.25*/("""
			if (j < 10) """),format.raw("""{"""),format.raw/*130.17*/("""
				optionsMinutes = optionsMinutes+"<option value=\""+"0"+j+"\">"+"0"+j+"</option>";
			"""),format.raw("""}"""),format.raw/*132.5*/(""" else """),format.raw("""{"""),format.raw/*132.12*/("""
				optionsMinutes = optionsMinutes+"<option value=\""+j+"\">"+j+"</option>";
			"""),format.raw("""}"""),format.raw/*134.5*/("""
		"""),format.raw("""}"""),format.raw/*135.4*/("""
		
	"""),format.raw("""}"""),format.raw/*137.3*/(""");
	

	
	
	function pad2(number) """),format.raw("""{"""),format.raw/*142.25*/("""
   
    	return (number < 10 ? '0' : '') + number
   
	"""),format.raw("""}"""),format.raw/*146.3*/("""

	</script>
    
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 14 15:42:44 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/heureselection.scala.html
                    HASH: d5ea1ad3efd926e7165d398488bd4c6699d4d0b6
                    MATRIX: 788->1|929->78|961->102|1045->57|1073->76|1101->156|1141->162|1182->195|1221->197|1312->253|1352->277|1392->279|1474->325|1487->329|1512->332|1555->340|1624->400|1664->402|1706->409|1719->413|1746->418|1881->522|1925->535|2005->579|2020->585|2066->609|2353->849|2489->938|2553->966|2568->972|2617->999|2678->1013|2751->1039|2866->1107|3317->1511|3510->1657|3735->1835|3821->1874|4065->2071|4137->2107|4152->2113|4202->2141|4267->2159|4424->2269|4547->2345|4603->2355|4672->2378|4728->2388|4783->2397|4992->2560|5057->2579|5111->2587|5210->2639|5435->2817|5499->2845|5514->2851|5566->2881|5627->2895|5731->2952|5846->3020|5931->3058|5997->3077|6050->3083|6118->3103|6194->3131|6259->3148|6325->3166|6473->3267|6528->3274|6688->3387|6845->3497|6900->3504|7058->3614|7194->3703|7249->3710|7397->3811|7449->3816|7500->3820|7576->3848|7641->3865|7779->3956|7834->3963|7964->4046|8015->4050|8068->4056|8150->4090|8254->4147
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|38->9|38->9|38->9|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|51->22|53->24|55->26|55->26|55->26|67->38|70->41|72->43|72->43|72->43|73->44|73->44|75->46|83->54|89->60|91->62|92->63|97->68|99->70|99->70|99->70|100->71|102->73|104->75|106->77|107->78|109->80|110->81|113->84|114->85|115->86|118->89|123->94|125->96|125->96|125->96|126->97|126->97|128->99|130->101|131->102|132->103|135->106|136->107|137->108|138->109|140->111|140->111|142->113|147->118|147->118|150->121|152->123|152->123|154->125|155->126|156->127|158->129|159->130|161->132|161->132|163->134|164->135|166->137|171->142|175->146
                    -- GENERATED --
                */
            