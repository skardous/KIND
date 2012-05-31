
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

	"""),_display_(Seq[Any](/*18.3*/form(routes.Application.update(id), 'id -> "form")/*18.53*/ {_display_(Seq[Any](format.raw/*18.55*/("""
			Titre de l'&eacute;venement : <b>"""),_display_(Seq[Any](/*19.38*/event/*19.43*/.getTitre)),format.raw/*19.52*/("""</b> <br/>
			Cr&eacute;ateur : <b>"""),_display_(Seq[Any](/*20.26*/event/*20.31*/.getCreateur)),format.raw/*20.43*/("""</b> <br/>
			Description : <i>"""),_display_(Seq[Any](/*21.22*/event/*21.27*/.getDescriptif)),format.raw/*21.41*/("""</i> <br/>			
	""")))})),format.raw/*22.3*/("""

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
    $(this).parents('.formPersonne').remove()
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
                    DATE: Wed May 30 14:15:49 CEST 2012
                    SOURCE: C:/tutoPlay/draft/app/views/editForm.scala.html
                    HASH: 96269273664dd925d962155ff223a5b52a5c490c
                    MATRIX: 782->1|914->160|932->170|1041->216|1078->219|1147->280|1210->306|1273->334|1298->338|1343->348|1369->353|1452->405|1485->78|1517->102|1601->57|1629->76|1657->156|1687->407|1725->410|1761->437|1801->439|1864->466|1878->471|1909->480|1958->494|2017->544|2057->546|2131->584|2145->589|2176->598|2248->634|2262->639|2296->651|2364->683|2378->688|2414->702|2461->718|2524->746|2578->784|2618->786|2686->819|2759->883|2799->885|2875->925|2895->936|2926->945|3010->993|3030->1004|3060->1012|3166->1082|3186->1093|3216->1101|3321->1175|3362->1185|3570->1346|3724->1454|3820->1503|3928->1564|4123->1713|4177->1720|4498->1995|4549->2000|4632->2036|4765->2122|4913->2224|4961->2226|5058->2277|5116->2288|5178->2314|5193->2320|5246->2351|5306->2364|5412->2423|5525->2489|5610->2528|5660->2532|5710->2536|5791->2571|5849->2582|5911->2608|5926->2614|5982->2648|6042->2661|6113->2685|6226->2751|6314->2793|6364->2797|6414->2801|6501->2841|6560->2852|6623->2878|6639->2884|6693->2915|6754->2928|6835->2961|6949->3027|7492->3523|7557->3541|7608->3545|7689->3578|7762->3604|8113->3907|8200->3946|8285->3983|8441->4092|8508->4112|8558->4115|8604->4129
                    LINES: 27->1|30->7|30->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|34->9|36->11|37->5|37->5|38->1|40->4|41->5|43->12|45->14|45->14|45->14|47->16|47->16|47->16|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|62->31|62->31|62->31|63->32|63->32|63->32|64->33|66->35|74->43|79->48|81->50|82->51|86->55|86->55|92->61|94->63|97->66|100->69|103->72|104->73|107->76|108->77|110->79|110->79|110->79|111->80|111->80|113->82|115->84|116->85|117->86|120->89|121->90|123->92|123->92|123->92|124->93|124->93|126->95|128->97|129->98|130->99|133->102|134->103|136->105|136->105|136->105|137->106|137->106|139->108|149->118|150->119|151->120|154->123|157->126|171->140|172->141|173->142|175->144|176->145|177->146|181->150
                    -- GENERATED --
                */
            