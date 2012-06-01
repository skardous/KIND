
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
	

<div id="Participants">

"""),_display_(Seq[Any](/*26.2*/for(participant <- event.participants) yield /*26.40*/ {_display_(Seq[Any](format.raw/*26.42*/("""
	<div class="control-group">
		"""),_display_(Seq[Any](/*28.4*/form(routes.Application.updatePersonne(id), 'id->"formPersonne")/*28.68*/ {_display_(Seq[Any](format.raw/*28.70*/("""
			<input id="nom" type="text" value=""""),_display_(Seq[Any](/*29.40*/participant/*29.51*/.getNom())),format.raw/*29.60*/("""" name="nom" readonly="readonly">
		
			<a id=""""),_display_(Seq[Any](/*31.12*/participant/*31.23*/.getId())),format.raw/*31.31*/("""" class="editPersonne btn"><i class="icon-pencil"></i></a>
			<a id=""""),_display_(Seq[Any](/*32.12*/participant/*32.23*/.getId())),format.raw/*32.31*/("""" class="deletePersonne btn btn-danger"><i class="icon-trash"></i></a>
		""")))})),format.raw/*33.4*/("""
	</div>
""")))})),format.raw/*35.2*/("""

</div>
Ajouter :		  
<input id="champ" type="text" value="">

<script type="text/javascript" charset="utf-8">

$('.deletePersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*43.49*/("""
    $(this).parents('#formPersonne').remove()
    renumber();
   
    deletePersonne($(this).attr('id'));
"""),format.raw("""}"""),format.raw/*48.2*/(""")

$('.editPersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*50.47*/("""
    if($(this).html() == "<i class=\"icon-pencil\"></i>")  """),format.raw("""{"""),format.raw/*51.61*/("""
      $(this).html("OK");
      $(this).attr("class", "editPersonne btn btn-success");
      $(this).siblings("input").removeAttr("readonly");
    """),format.raw("""}"""),format.raw/*55.6*/(""" else """),format.raw("""{"""),format.raw/*55.13*/("""
      $(this).html("<i class=\"icon-pencil\"></i>");
      $(this).attr("class", "editPersonne btn");
      $(this).siblings("input").attr("readonly", "readonly");
      renumber();      
      editPersonne($(this).attr('id'), $(this).siblings("input").attr("value"));
    """),format.raw("""}"""),format.raw/*61.6*/("""
  
"""),format.raw("""}"""),format.raw/*63.2*/(""")


$("#champ").focusout(function()"""),format.raw("""{"""),format.raw/*66.33*/("""
    var vide = "";
    var nom = $(this).attr("value");
    if (vide != nom.trim()) """),format.raw("""{"""),format.raw/*69.30*/("""      
		addPersonne($("#champ").attr('value'));	
		alert("Ajout\351: "+$("#champ").attr('value'));
	"""),format.raw("""}"""),format.raw/*72.3*/("""
"""),format.raw("""}"""),format.raw/*73.2*/(""")

function editPersonne(personneId, personneNom)
"""),format.raw("""{"""),format.raw/*76.2*/("""
  $.ajax("""),format.raw("""{"""),format.raw/*77.11*/("""
		type: "POST",
		url: """"),_display_(Seq[Any](/*79.10*/routes/*79.16*/.Application.updatePersonne(id))),format.raw/*79.47*/("""",
		data: '"""),format.raw("""{"""),format.raw/*80.11*/(""""id" : "' + personneId + '", "nom" : "' + personneNom + '""""),format.raw("""}"""),format.raw/*80.70*/("""',
		contentType: "application/json",
		success : function(data) """),format.raw("""{"""),format.raw/*82.29*/("""
		  alert("Participant edit\351");
		"""),format.raw("""}"""),format.raw/*84.4*/("""
  """),format.raw("""}"""),format.raw/*85.4*/(""");
"""),format.raw("""}"""),format.raw/*86.2*/("""

function deletePersonne(persId)
"""),format.raw("""{"""),format.raw/*89.2*/("""
  $.ajax("""),format.raw("""{"""),format.raw/*90.11*/("""
		type: "POST",
		url: """"),_display_(Seq[Any](/*92.10*/routes/*92.16*/.Application.deleteParticipant(id))),format.raw/*92.50*/("""",
		data: '"""),format.raw("""{"""),format.raw/*93.11*/(""""id" : "' + persId + '""""),format.raw("""}"""),format.raw/*93.35*/("""',
		contentType: "application/json",
		success : function(data) """),format.raw("""{"""),format.raw/*95.29*/("""
		  alert("Participant supprim\351");
		"""),format.raw("""}"""),format.raw/*97.4*/("""
  """),format.raw("""}"""),format.raw/*98.4*/(""");
"""),format.raw("""}"""),format.raw/*99.2*/("""

function addPersonne(nomParticipant)
"""),format.raw("""{"""),format.raw/*102.2*/("""	
	$.ajax("""),format.raw("""{"""),format.raw/*103.10*/("""
		type: "POST",
		url: """"),_display_(Seq[Any](/*105.10*/routes/*105.16*/.Application.addParticipant(id))),format.raw/*105.47*/("""",
		data: '"""),format.raw("""{"""),format.raw/*106.11*/(""""nom" : "' + nomParticipant + '""""),format.raw("""}"""),format.raw/*106.44*/("""',
		contentType: "application/json",
		success : function(data) """),format.raw("""{"""),format.raw/*108.29*/("""
		  var template = $('#Participants');
		  template.append("<div class=\"formPersonne\">"+
				  "<form id=\"formPersonne\">"+
				  "<input id=\"nom\" type=\"text\" value=\""+nomParticipant+"\" name=\"nom\" readonly=\"readonly\">&nbsp;"+
				  "<a id=\"\" class=\"editPersonne btn\"><i class=\"icon-pencil\"></i></a>&nbsp;"+
				  "<a id=\"\" class=\"deletePersonne btn btn-danger\"><i class=\"icon-trash\"></i></a>"+				  
				  "</form>"+
				  "</div>")
		  $('#champ').attr('value', '')
		"""),format.raw("""}"""),format.raw/*118.4*/("""               
	"""),format.raw("""}"""),format.raw/*119.3*/(""");
"""),format.raw("""}"""),format.raw/*120.2*/("""


$('#form').submit(function() """),format.raw("""{"""),format.raw/*123.31*/("""
	$('.hidden').remove()

"""),format.raw("""}"""),format.raw/*126.2*/(""")

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

var renumber = function() """),format.raw("""{"""),format.raw/*140.28*/("""
	$('.participants').each(function(i) """),format.raw("""{"""),format.raw/*141.39*/("""
		$('input', this).each(function() """),format.raw("""{"""),format.raw/*142.37*/("""
			$(this).attr('name', $(this).attr('name').replace(/participants\[.+?\]/g, 'participants[' + i + ']'))
		"""),format.raw("""}"""),format.raw/*144.4*/(""")                
	"""),format.raw("""}"""),format.raw/*145.3*/(""")
"""),format.raw("""}"""),format.raw/*146.2*/("""

</script>

""")))})),format.raw/*150.2*/("""
"""))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 01 10:01:28 CEST 2012
                    SOURCE: C:/tutoPlay/doodle/app/views/editForm.scala.html
                    HASH: e4ef1c0182e93a2e82e06e512934e0ac6c114dea
                    MATRIX: 782->1|914->160|932->170|1041->216|1078->219|1147->280|1210->306|1273->334|1298->338|1343->348|1369->353|1452->405|1485->78|1517->102|1601->57|1629->76|1657->156|1687->407|1725->410|1761->437|1801->439|1864->466|1878->471|1909->480|1996->531|2010->536|2041->545|2113->581|2127->586|2161->598|2229->630|2243->635|2279->649|2357->692|2411->730|2451->732|2519->765|2592->829|2632->831|2708->871|2728->882|2759->891|2843->939|2863->950|2893->958|2999->1028|3019->1039|3049->1047|3154->1121|3195->1131|3403->1292|3557->1400|3653->1449|3761->1510|3956->1659|4010->1666|4331->1941|4382->1946|4465->1982|4598->2068|4746->2170|4794->2172|4891->2223|4949->2234|5011->2260|5026->2266|5079->2297|5139->2310|5245->2369|5358->2435|5443->2474|5493->2478|5543->2482|5624->2517|5682->2528|5744->2554|5759->2560|5815->2594|5875->2607|5946->2631|6059->2697|6147->2739|6197->2743|6247->2747|6334->2787|6393->2798|6456->2824|6472->2830|6526->2861|6587->2874|6668->2907|6782->2973|7325->3469|7390->3487|7441->3491|7522->3524|7595->3550|7946->3853|8033->3892|8118->3929|8274->4038|8341->4058|8391->4061|8437->4075
                    LINES: 27->1|30->7|30->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|34->9|36->11|37->5|37->5|38->1|40->4|41->5|43->12|45->14|45->14|45->14|47->16|47->16|47->16|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|62->31|62->31|62->31|63->32|63->32|63->32|64->33|66->35|74->43|79->48|81->50|82->51|86->55|86->55|92->61|94->63|97->66|100->69|103->72|104->73|107->76|108->77|110->79|110->79|110->79|111->80|111->80|113->82|115->84|116->85|117->86|120->89|121->90|123->92|123->92|123->92|124->93|124->93|126->95|128->97|129->98|130->99|133->102|134->103|136->105|136->105|136->105|137->106|137->106|139->108|149->118|150->119|151->120|154->123|157->126|171->140|172->141|173->142|175->144|176->145|177->146|181->150
                    -- GENERATED --
                */
            