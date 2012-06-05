
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
object editForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Long,Form[Evenement],Evenement,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, eventForm: Form[Evenement], event: Evenement):play.api.templates.Html = {
        _display_ {import helper._

def /*7.2*/partiField/*7.12*/(field: Field, className: String = "part"):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*7.58*/("""
	"""),_display_(Seq[Any](/*8.3*/input(field, '_label -> "Participants", '_class -> className)/*8.64*/ { (id, name, value, _) =>_display_(Seq[Any](format.raw/*8.90*/("""
	<input type="text" name=""""),_display_(Seq[Any](/*9.28*/name)),format.raw/*9.32*/("""" value=""""),_display_(Seq[Any](/*9.42*/value)),format.raw/*9.47*/(""""> 
	<a class="removeParti btn danger">Remove</a>
	""")))})),format.raw/*11.3*/("""
""")))};implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),format.raw/*12.2*/("""

"""),_display_(Seq[Any](/*14.2*/main("Editer un evenement")/*14.29*/ {_display_(Seq[Any](format.raw/*14.31*/("""

	<h1>Participants pour: """),_display_(Seq[Any](/*16.26*/event/*16.31*/.getTitre)),format.raw/*16.40*/("""</h1><br/>

	
			Titre de l'&eacute;venement : <b>"""),_display_(Seq[Any](/*19.38*/event/*19.43*/.getTitre)),format.raw/*19.52*/("""</b> <br/>
			Cr&eacute;ateur : <b>"""),_display_(Seq[Any](/*20.26*/event/*20.31*/.getCreateur)),format.raw/*20.43*/("""</b> <br/>
			Description : <i>"""),_display_(Seq[Any](/*21.22*/event/*21.27*/.getDescriptif)),format.raw/*21.41*/("""</i> <br/>			
	



<table cellspacing="5" cellpadding="5">
<tbody>
<tr class="titres"><td></td>
"""),_display_(Seq[Any](/*29.2*/for(jour <- event.jours) yield /*29.26*/ {_display_(Seq[Any](format.raw/*29.28*/("""  
            """),_display_(Seq[Any](/*30.14*/for(horaire <- jour.horaires) yield /*30.43*/ {_display_(Seq[Any](format.raw/*30.45*/("""
              <td><p><b>"""),_display_(Seq[Any](/*31.26*/jour/*31.30*/.date)),format.raw/*31.35*/("""</b><br> """),_display_(Seq[Any](/*31.45*/horaire/*31.52*/.debut)),format.raw/*31.58*/(""" - """),_display_(Seq[Any](/*31.62*/horaire/*31.69*/.fin)),format.raw/*31.73*/("""</p></td>
            """)))})),format.raw/*32.14*/("""            	                
""")))})),format.raw/*33.2*/("""	</tr>
              
<div id="Participants">
"""),_display_(Seq[Any](/*36.2*/for(participant <- event.participants) yield /*36.40*/ {_display_(Seq[Any](format.raw/*36.42*/("""
	<tr id=""""),_display_(Seq[Any](/*37.11*/participant/*37.22*/.getId())),format.raw/*37.30*/(""""><td class="infoPersonne">
		"""),_display_(Seq[Any](/*38.4*/form(routes.Application.updatePersonne(id), 'id->"formPersonne")/*38.68*/ {_display_(Seq[Any](format.raw/*38.70*/("""
			<input id="nom" type="text" value=""""),_display_(Seq[Any](/*39.40*/participant/*39.51*/.getNom())),format.raw/*39.60*/("""" name="nom" readonly="readonly">
		
			<a id=""""),_display_(Seq[Any](/*41.12*/participant/*41.23*/.getId())),format.raw/*41.31*/("""" class="editPersonne btn"><i class="icon-pencil"></i></a>
			<a id=""""),_display_(Seq[Any](/*42.12*/participant/*42.23*/.getId())),format.raw/*42.31*/("""" class="deletePersonne btn btn-danger"><i class="icon-trash"></i></a>
		""")))})),format.raw/*43.4*/("""</td>
		
		"""),_display_(Seq[Any](/*45.4*/for(jour <- event.jours) yield /*45.28*/ {_display_(Seq[Any](format.raw/*45.30*/("""  
            """),_display_(Seq[Any](/*46.14*/for(horaire <- jour.horaires) yield /*46.43*/ {_display_(Seq[Any](format.raw/*46.45*/("""
              <td><input id=""""),_display_(Seq[Any](/*47.31*/horaire/*47.38*/.id)),format.raw/*47.41*/("""" type="checkbox" value=""""),_display_(Seq[Any](/*47.67*/horaire/*47.74*/.debut)),format.raw/*47.80*/(""" - """),_display_(Seq[Any](/*47.84*/horaire/*47.91*/.fin)),format.raw/*47.95*/("""" /></td>
            """)))})),format.raw/*48.14*/("""            	                
        """)))})),format.raw/*49.10*/("""		
		
	</tr>
""")))})),format.raw/*52.2*/("""
</tbody>
</table>

</div>
Ajouter :		  
<input id="champ" type="text" value="">

<script type="text/javascript" charset="utf-8">

$('.deletePersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*62.49*/("""
    $(this).parents('#formPersonne').remove()
    renumber();
   
    deletePersonne($(this).attr('id'));
"""),format.raw("""}"""),format.raw/*67.2*/(""")

$('.editPersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*69.47*/("""
    if($(this).html() == "<i class=\"icon-pencil\"></i>")  """),format.raw("""{"""),format.raw/*70.61*/("""
      $(this).html("OK");
      $(this).attr("class", "editPersonne btn btn-success");
      $(this).siblings("input").removeAttr("readonly");
    """),format.raw("""}"""),format.raw/*74.6*/(""" else """),format.raw("""{"""),format.raw/*74.13*/("""
      $(this).html("<i class=\"icon-pencil\"></i>");
      $(this).attr("class", "editPersonne btn");
      $(this).siblings("input").attr("readonly", "readonly");
      renumber();      
      editPersonne($(this).attr('id'), $(this).siblings("input").attr("value"));
    """),format.raw("""}"""),format.raw/*80.6*/("""
  
"""),format.raw("""}"""),format.raw/*82.2*/(""")

$('input[type="checkbox"]').live('click', function(e) """),format.raw("""{"""),format.raw/*84.56*/(""" 
   //alert("aha");
   var idhoraire = $(this).attr('id');
   var idParticipant = $(this).parent().parent().attr('id');
   alert(idParticipant);
   if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*89.32*/("""
	   $(this).parent().css("background-color", "#66CC99")//vert
	  
   """),format.raw("""}"""),format.raw/*92.5*/(""" else """),format.raw("""{"""),format.raw/*92.12*/("""
	   $(this).parent().css("background-color", "#A0A0A0")
   """),format.raw("""}"""),format.raw/*94.5*/("""
"""),format.raw("""}"""),format.raw/*95.2*/(""");



$("#champ").focusout(function()"""),format.raw("""{"""),format.raw/*99.33*/("""
    var vide = "";
    var nom = $(this).attr("value");
    if (vide != nom.trim()) """),format.raw("""{"""),format.raw/*102.30*/("""      
		addPersonne($("#champ").attr('value'));	
		alert("Ajout\351: "+$("#champ").attr('value'));
	"""),format.raw("""}"""),format.raw/*105.3*/("""
"""),format.raw("""}"""),format.raw/*106.2*/(""")

function editPersonne(personneId, personneNom)
"""),format.raw("""{"""),format.raw/*109.2*/("""
  $.ajax("""),format.raw("""{"""),format.raw/*110.11*/("""
		type: "POST",
		url: """"),_display_(Seq[Any](/*112.10*/routes/*112.16*/.Application.updatePersonne(id))),format.raw/*112.47*/("""",
		data: '"""),format.raw("""{"""),format.raw/*113.11*/(""""id" : "' + personneId + '", "nom" : "' + personneNom + '""""),format.raw("""}"""),format.raw/*113.70*/("""',
		contentType: "application/json",
		success : function(data) """),format.raw("""{"""),format.raw/*115.29*/("""
		  alert("Participant edit\351");
		"""),format.raw("""}"""),format.raw/*117.4*/("""
  """),format.raw("""}"""),format.raw/*118.4*/(""");
"""),format.raw("""}"""),format.raw/*119.2*/("""

function deletePersonne(persId)
"""),format.raw("""{"""),format.raw/*122.2*/("""
  $.ajax("""),format.raw("""{"""),format.raw/*123.11*/("""
		type: "POST",
		url: """"),_display_(Seq[Any](/*125.10*/routes/*125.16*/.Application.deleteParticipant(id))),format.raw/*125.50*/("""",
		data: '"""),format.raw("""{"""),format.raw/*126.11*/(""""id" : "' + persId + '""""),format.raw("""}"""),format.raw/*126.35*/("""',
		contentType: "application/json",
		success : function(data) """),format.raw("""{"""),format.raw/*128.29*/("""
		  alert("Participant supprim\351");
		"""),format.raw("""}"""),format.raw/*130.4*/("""
  """),format.raw("""}"""),format.raw/*131.4*/(""");
"""),format.raw("""}"""),format.raw/*132.2*/("""

function addPersonne(nomParticipant)
"""),format.raw("""{"""),format.raw/*135.2*/("""	
	$.ajax("""),format.raw("""{"""),format.raw/*136.10*/("""
		type: "POST",
		url: """"),_display_(Seq[Any](/*138.10*/routes/*138.16*/.Application.addParticipant(id))),format.raw/*138.47*/("""",
		data: '"""),format.raw("""{"""),format.raw/*139.11*/(""""nom" : "' + nomParticipant + '""""),format.raw("""}"""),format.raw/*139.44*/("""',
		contentType: "application/json",
		success : function(data) """),format.raw("""{"""),format.raw/*141.29*/("""		  
		  $("tbody").append("<tr><td class=\"infoPersonne\"><div class=\"formPersonne\">"+
				  "<form id=\"formPersonne\">"+
				  "<input id=\"nom\" type=\"text\" value=\""+nomParticipant+"\" name=\"nom\" readonly=\"readonly\">&nbsp;"+
				  "<a id=\""+data.idPersonne+"\" class=\"editPersonne btn\"><i class=\"icon-pencil\"></i></a>&nbsp;"+
				  "<a id=\""+data.idPersonne+"\" class=\"deletePersonne btn btn-danger\"><i class=\"icon-trash\"></i></a>"+				  
				 "</form></td>"+
				  """"),_display_(Seq[Any](/*148.9*/for(jour <- event.jours) yield /*148.33*/ {_display_(Seq[Any](format.raw/*148.35*/(""""+  
                	""""),_display_(Seq[Any](/*149.20*/for(horaire <- jour.horaires) yield /*149.49*/ {_display_(Seq[Any](format.raw/*149.51*/(""""+
                	" <td><input id=\""""),_display_(Seq[Any](/*150.37*/horaire/*150.44*/.id)),format.raw/*150.47*/("""\" type=\"checkbox\" value=\""""),_display_(Seq[Any](/*150.77*/horaire/*150.84*/.debut)),format.raw/*150.90*/(""" - """),_display_(Seq[Any](/*150.94*/horaire/*150.101*/.fin)),format.raw/*150.105*/("""\" /></td>"+
                	"""")))})),format.raw/*151.20*/(""""+                	                
                """")))})),format.raw/*152.19*/("""" +
				"</tr></div>")
		  $('#champ').attr('value', '')
		"""),format.raw("""}"""),format.raw/*155.4*/("""               
	"""),format.raw("""}"""),format.raw/*156.3*/(""");
"""),format.raw("""}"""),format.raw/*157.2*/("""




$('#form').submit(function() """),format.raw("""{"""),format.raw/*162.31*/("""
	$('.hidden').remove()

"""),format.raw("""}"""),format.raw/*165.2*/(""")

// -- renumber fields

// Rename fields to have a coherent payload like:
//
// informations[0].label
// informations[0].email
// informations[0].phones[0]
// informations[0].phones[1]
// ...
//
// This is probably not the easiest way to do it. A jQuery plugin would help.

var renumber = function() """),format.raw("""{"""),format.raw/*179.28*/("""
	$('.participants').each(function(i) """),format.raw("""{"""),format.raw/*180.39*/("""
		$('input', this).each(function() """),format.raw("""{"""),format.raw/*181.37*/("""
			$(this).attr('name', $(this).attr('name').replace(/participants\[.+?\]/g, 'participants[' + i + ']'))
		"""),format.raw("""}"""),format.raw/*183.4*/(""")                
	"""),format.raw("""}"""),format.raw/*184.3*/(""")
"""),format.raw("""}"""),format.raw/*185.2*/("""

</script>

""")))})),format.raw/*189.2*/("""
"""))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 05 15:51:16 CEST 2012
                    SOURCE: C:/tutoPlay/doodle/app/views/editForm.scala.html
                    HASH: 6d5affac620c073368dd68e50b5d156ed09cee68
                    MATRIX: 782->1|914->160|932->170|1041->216|1078->219|1147->280|1210->306|1273->334|1298->338|1343->348|1369->353|1452->405|1485->78|1517->102|1601->57|1629->76|1657->156|1687->407|1725->410|1761->437|1801->439|1864->466|1878->471|1909->480|1996->531|2010->536|2041->545|2113->581|2127->586|2161->598|2229->630|2243->635|2279->649|2411->746|2451->770|2491->772|2543->788|2588->817|2628->819|2690->845|2703->849|2730->854|2776->864|2792->871|2820->877|2860->881|2876->888|2902->892|2957->915|3019->946|3101->993|3155->1031|3195->1033|3242->1044|3262->1055|3292->1063|3358->1094|3431->1158|3471->1160|3547->1200|3567->1211|3598->1220|3682->1268|3702->1279|3732->1287|3838->1357|3858->1368|3888->1376|3993->1450|4040->1462|4080->1486|4120->1488|4172->1504|4217->1533|4257->1535|4324->1566|4340->1573|4365->1576|4427->1602|4443->1609|4471->1615|4511->1619|4527->1626|4553->1630|4608->1653|4679->1692|4724->1706|4950->1885|5104->1993|5200->2042|5308->2103|5503->2252|5557->2259|5878->2534|5929->2539|6034->2597|6258->2774|6375->2845|6429->2852|6536->2913|6584->2915|6669->2953|6803->3039|6952->3141|7001->3143|7099->3194|7158->3205|7221->3231|7237->3237|7291->3268|7352->3281|7459->3340|7573->3406|7659->3445|7710->3449|7761->3453|7843->3488|7902->3499|7965->3525|7981->3531|8038->3565|8099->3578|8171->3602|8285->3668|8374->3710|8425->3714|8476->3718|8563->3758|8622->3769|8685->3795|8701->3801|8755->3832|8816->3845|8897->3878|9011->3944|9538->4435|9579->4459|9620->4461|9681->4485|9727->4514|9768->4516|9844->4555|9861->4562|9887->4565|9954->4595|9971->4602|10000->4608|10041->4612|10059->4619|10087->4623|10152->4655|10239->4709|10346->4769|10411->4787|10462->4791|10545->4826|10618->4852|10969->5155|11056->5194|11141->5231|11297->5340|11364->5360|11414->5363|11460->5377
                    LINES: 27->1|30->7|30->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|34->9|36->11|37->5|37->5|38->1|40->4|41->5|43->12|45->14|45->14|45->14|47->16|47->16|47->16|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|62->31|62->31|62->31|63->32|64->33|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|72->41|72->41|72->41|73->42|73->42|73->42|74->43|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|79->48|80->49|83->52|93->62|98->67|100->69|101->70|105->74|105->74|111->80|113->82|115->84|120->89|123->92|123->92|125->94|126->95|130->99|133->102|136->105|137->106|140->109|141->110|143->112|143->112|143->112|144->113|144->113|146->115|148->117|149->118|150->119|153->122|154->123|156->125|156->125|156->125|157->126|157->126|159->128|161->130|162->131|163->132|166->135|167->136|169->138|169->138|169->138|170->139|170->139|172->141|179->148|179->148|179->148|180->149|180->149|180->149|181->150|181->150|181->150|181->150|181->150|181->150|181->150|181->150|181->150|182->151|183->152|186->155|187->156|188->157|193->162|196->165|210->179|211->180|212->181|214->183|215->184|216->185|220->189
                    -- GENERATED --
                */
            