
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
	<tbody id="mainBody">
		<tr class="titres" style="display:none"><td style="visibility:hidden"></td>
			"""),_display_(Seq[Any](/*29.5*/for(jour <- event.jours) yield /*29.29*/ {_display_(Seq[Any](format.raw/*29.31*/("""  					  
				<td id=""""),_display_(Seq[Any](/*30.14*/jour/*30.18*/.id)),format.raw/*30.21*/("""" class="jour" colspan=""""),_display_(Seq[Any](/*30.46*/jour/*30.50*/.horaires.size())),format.raw/*30.66*/(""""><b>"""),_display_(Seq[Any](/*30.72*/jour/*30.76*/.date)),format.raw/*30.81*/("""</b></td>	                        	                
			""")))})),format.raw/*31.5*/("""
		</tr>
		<tr class="titres" style="display:none"><td style="visibility:hidden"></td>
			"""),_display_(Seq[Any](/*34.5*/for(jour <- event.jours) yield /*34.29*/ {_display_(Seq[Any](format.raw/*34.31*/("""  
			  """),_display_(Seq[Any](/*35.7*/if(jour.horaires.size() == 0)/*35.36*/{_display_(Seq[Any](format.raw/*35.37*/("""
			    <td class="jour"></td>
			  """)))})),format.raw/*37.7*/("""
			     """),_display_(Seq[Any](/*38.10*/for(horaire <- jour.horaires) yield /*38.39*/ {_display_(Seq[Any](format.raw/*38.41*/("""
			    	 <td id=""""),_display_(Seq[Any](/*39.19*/horaire/*39.26*/.id)),format.raw/*39.29*/("""" day=""""),_display_(Seq[Any](/*39.37*/jour/*39.41*/.date)),format.raw/*39.46*/("""" class="horaire">"""),_display_(Seq[Any](/*39.65*/horaire/*39.72*/.debut)),format.raw/*39.78*/(""" - """),_display_(Seq[Any](/*39.82*/horaire/*39.89*/.fin)),format.raw/*39.93*/("""</td>
			     """)))})),format.raw/*40.10*/("""            	                
			""")))})),format.raw/*41.5*/("""
		</tr>
		              
		
		"""),_display_(Seq[Any](/*45.4*/for(participant <- event.participants) yield /*45.42*/ {_display_(Seq[Any](format.raw/*45.44*/("""
			<tr id=""""),_display_(Seq[Any](/*46.13*/participant/*46.24*/.getId())),format.raw/*46.32*/(""""><td class="infoPersonne">
				"""),_display_(Seq[Any](/*47.6*/form(routes.Application.updatePersonne(id), 'id->"formPersonne")/*47.70*/ {_display_(Seq[Any](format.raw/*47.72*/("""
					<input id="nom" type="text" value=""""),_display_(Seq[Any](/*48.42*/participant/*48.53*/.getNom())),format.raw/*48.62*/("""" name="nom" readonly="readonly">	
				
					<a id=""""),_display_(Seq[Any](/*50.14*/participant/*50.25*/.getId())),format.raw/*50.33*/("""" class="editPersonne btn"> Editer<i class="icon-pencil"></i></a>
					<a id=""""),_display_(Seq[Any](/*51.14*/participant/*51.25*/.getId())),format.raw/*51.33*/("""" class="deletePersonne btn btn-danger"> Supprimer<i class="icon-trash"></i></a>
				""")))})),format.raw/*52.6*/("""</td>
				
				"""),_display_(Seq[Any](/*54.6*/for(jour <- event.jours) yield /*54.30*/ {_display_(Seq[Any](format.raw/*54.32*/("""
				    """),_display_(Seq[Any](/*55.10*/if(jour.horaires.size() == 0)/*55.39*/{_display_(Seq[Any](format.raw/*55.40*/("""
				      """),_display_(Seq[Any](/*56.12*/if(participant.inscriptionsJours.contains(jour))/*56.60*/ {_display_(Seq[Any](format.raw/*56.62*/("""
		                <td class="checktd"><input id=""""),_display_(Seq[Any](/*57.51*/jour/*57.55*/.id)),format.raw/*57.58*/("""" type="checkbox" checked class="jour checkbox" value=""""),_display_(Seq[Any](/*57.114*/jour/*57.118*/.date)),format.raw/*57.123*/("""" /></td>
		              """)))}/*58.19*/else/*58.24*/{_display_(Seq[Any](format.raw/*58.25*/("""
		                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*59.52*/jour/*59.56*/.id)),format.raw/*59.59*/("""" type="checkbox" class="jour checkbox" value=""""),_display_(Seq[Any](/*59.107*/jour/*59.111*/.date)),format.raw/*59.116*/("""" /></td>
		              """)))})),format.raw/*60.18*/("""
				       
				    """)))})),format.raw/*62.10*/("""
		            """),_display_(Seq[Any](/*63.16*/for(horaire <- jour.horaires) yield /*63.45*/ {_display_(Seq[Any](format.raw/*63.47*/("""
		              """),_display_(Seq[Any](/*64.18*/if(participant.inscriptionsHoraires.contains(horaire))/*64.72*/ {_display_(Seq[Any](format.raw/*64.74*/("""
		                <td class="checktd"><input id=""""),_display_(Seq[Any](/*65.51*/horaire/*65.58*/.id)),format.raw/*65.61*/("""" type="checkbox" class="horaire checkbox"  checked value=""""),_display_(Seq[Any](/*65.121*/horaire/*65.128*/.debut)),format.raw/*65.134*/(""" - """),_display_(Seq[Any](/*65.138*/horaire/*65.145*/.fin)),format.raw/*65.149*/("""" /></td>
		              """)))}/*66.19*/else/*66.24*/{_display_(Seq[Any](format.raw/*66.25*/("""
		                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*67.52*/horaire/*67.59*/.id)),format.raw/*67.62*/("""" type="checkbox" class="horaire checkbox" value=""""),_display_(Seq[Any](/*67.113*/horaire/*67.120*/.debut)),format.raw/*67.126*/(""" - """),_display_(Seq[Any](/*67.130*/horaire/*67.137*/.fin)),format.raw/*67.141*/("""" /></td>
		              """)))})),format.raw/*68.18*/("""
		            """)))})),format.raw/*69.16*/("""            	                
		        """)))})),format.raw/*70.12*/("""				
			</tr>
		""")))})),format.raw/*72.4*/("""
	
	<tr id="compte" class="titres" style="display:none">
		<td id=""><b>Compte: </b></td>
		"""),_display_(Seq[Any](/*76.4*/for(jour <- event.jours) yield /*76.28*/ {_display_(Seq[Any](format.raw/*76.30*/("""
		    """),_display_(Seq[Any](/*77.8*/if(jour.horaires.size() == 0)/*77.37*/{_display_(Seq[Any](format.raw/*77.38*/("""		     
                <td id=""""),_display_(Seq[Any](/*78.26*/jour/*78.30*/.id)),format.raw/*78.33*/("""" class="jour">0</td>	       
		    """)))})),format.raw/*79.8*/("""
            """),_display_(Seq[Any](/*80.14*/for(horaire <- jour.horaires) yield /*80.43*/ {_display_(Seq[Any](format.raw/*80.45*/("""              
                <td id=""""),_display_(Seq[Any](/*81.26*/horaire/*81.33*/.id)),format.raw/*81.36*/("""" class="horaire">0</td>              
            """)))})),format.raw/*82.14*/("""
		""")))})),format.raw/*83.4*/("""
	</tr>
	</tbody>
	<tfoot>
		<tr>
			<td> Date(s) populaire(s) :</td>
			<td colspan="0" class="footer"></td>
		</tr>
	</tfoot>


	
</table>

Ajouter :		  
<input id="champ" type="text" value=""><a id="ajouter" class="btn">Ajouter</a><br>

<br>
<h3>Inviter des copains</h3>

<div class="selectDate">
<textarea id="mailsArea" rows="4"></textarea>
<a id="envoiLien" class="btn btn-info">Envoyer Lien</a>
</div>

<script type="text/javascript" charset="utf-8">

$(function()"""),format.raw("""{"""),format.raw/*110.14*/(""" 
	$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*111.36*/("""
	  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*112.33*/("""
	  		$(this).parent().css("background-color", "#66CC99");
	  	"""),format.raw("""}"""),format.raw/*114.6*/("""
	"""),format.raw("""}"""),format.raw/*115.3*/(""");

	$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*117.40*/("""
	  $('.titres').attr('style','');
	"""),format.raw("""}"""),format.raw/*119.3*/(""");



	$('input[type="checkbox"]').each(function(i) """),format.raw("""{"""),format.raw/*123.48*/("""
	var iden = $(this).attr('id');

	if ($(this).attr('class') == 'horaire checkbox') """),format.raw("""{"""),format.raw/*126.52*/("""
		if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*127.31*/("""
	    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
			increment.html(parseInt(increment.html())+1);
		"""),format.raw("""}"""),format.raw/*130.4*/("""
	"""),format.raw("""}"""),format.raw/*131.3*/("""
	if ($(this).attr('class') == 'jour checkbox') """),format.raw("""{"""),format.raw/*132.49*/("""
		if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*133.31*/("""
	    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
			increment.html(parseInt(increment.html())+1);
		"""),format.raw("""}"""),format.raw/*136.4*/("""
	"""),format.raw("""}"""),format.raw/*137.3*/("""
	"""),format.raw("""}"""),format.raw/*138.3*/(""");

	var max = 0;
	$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*141.44*/("""
		$(this).css("background-color", "#A0A0A0") //gris
		$('.titres').children().css("background-color","#A0A0A0");		
		if ($(this).html() > max) """),format.raw("""{"""),format.raw/*144.30*/("""			
			max = $(this).html();
		"""),format.raw("""}"""),format.raw/*146.4*/("""
	"""),format.raw("""}"""),format.raw/*147.3*/(""")
	$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*148.44*/("""		
		if ($(this).html() == max && $(this).html() != 0) """),format.raw("""{"""),format.raw/*149.54*/("""			
			$(this).css("background-color", "black");
			//alert("classe : "+$(this).attr("class")+" id : "+$(this).attr("id"));
			$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", "black");
			if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*153.44*/("""
				var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
				$("td:contains('"+day+"')").css("background-color", "black");
				
			"""),format.raw("""}"""),format.raw/*157.5*/("""
		"""),format.raw("""}"""),format.raw/*158.4*/("""
	"""),format.raw("""}"""),format.raw/*159.3*/(""")
  
"""),format.raw("""}"""),format.raw/*161.2*/(""");


$('#envoiLien').live('click', function(e) """),format.raw("""{"""),format.raw/*164.44*/("""
  var mailsList = $("#mailsArea").val();
  
	$.ajax("""),format.raw("""{"""),format.raw/*167.10*/("""
		type: "POST",
		url: """"),_display_(Seq[Any](/*169.10*/routes/*169.16*/.Application.sendMail(id))),format.raw/*169.41*/("""",
		data: '"""),format.raw("""{"""),format.raw/*170.11*/(""""mailslist" : "' + mailsList + '""""),format.raw("""}"""),format.raw/*170.45*/("""',
		contentType: "application/json",
		success : function(data) """),format.raw("""{"""),format.raw/*172.29*/("""
		  alert("Mail(s) envoye(s) a "+mailsList);
		"""),format.raw("""}"""),format.raw/*174.4*/("""
   """),format.raw("""}"""),format.raw/*175.5*/(""");
"""),format.raw("""}"""),format.raw/*176.2*/(""");
	  
	  
$('.deletePersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*179.49*/("""    
    $(this).parent().parent().parent().remove();
    renumber();   
    deletePersonne($(this).attr('id'));
    if($('td[class="infoPersonne"]').html() == null) """),format.raw("""{"""),format.raw/*183.55*/("""
    	$('.titres').attr('style','display:none');
    """),format.raw("""}"""),format.raw/*185.6*/("""
    $('#compte').children('td[id!=""]').each(function(i) """),format.raw("""{"""),format.raw/*186.59*/("""$(this).html("0")"""),format.raw("""}"""),format.raw/*186.77*/(""");
    $('input[type="checkbox"]').each(function(i) """),format.raw("""{"""),format.raw/*187.51*/("""
    var iden = $(this).attr('id');
  
    if ($(this).attr('class') == 'horaire') """),format.raw("""{"""),format.raw/*190.46*/("""
    	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*191.34*/("""
	    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
			increment.html(parseInt(increment.html())+1);
    	"""),format.raw("""}"""),format.raw/*194.7*/("""
    """),format.raw("""}"""),format.raw/*195.6*/("""
    if ($(this).attr('class') == 'jour') """),format.raw("""{"""),format.raw/*196.43*/("""
    	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*197.34*/("""
	    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
			increment.html(parseInt(increment.html())+1);
    	"""),format.raw("""}"""),format.raw/*200.7*/("""
    """),format.raw("""}"""),format.raw/*201.6*/("""
  """),format.raw("""}"""),format.raw/*202.4*/(""");
"""),format.raw("""}"""),format.raw/*203.2*/(""")

$('.editPersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*205.47*/("""
    if($(this).html() == "<i class=\"icon-pencil\"></i>")  """),format.raw("""{"""),format.raw/*206.61*/("""
      $(this).html("OK");
      $(this).attr("class", "editPersonne btn btn-success");
      $(this).siblings("input").removeAttr("readonly");
    """),format.raw("""}"""),format.raw/*210.6*/(""" else """),format.raw("""{"""),format.raw/*210.13*/("""
      $(this).html("<i class=\"icon-pencil\"></i>");
      $(this).attr("class", "editPersonne btn");
      $(this).siblings("input").attr("readonly", "readonly");
      renumber();      
      editPersonne($(this).attr('id'), $(this).siblings("input").attr("value"));
    """),format.raw("""}"""),format.raw/*216.6*/("""
  
"""),format.raw("""}"""),format.raw/*218.2*/(""")





$("#ajouter").live('click', function(e)"""),format.raw("""{"""),format.raw/*224.41*/("""
  
    envoiPersonne($("#champ"));
"""),format.raw("""}"""),format.raw/*227.2*/(""");




function envoiPersonne(self)
"""),format.raw("""{"""),format.raw/*233.2*/("""
    var vide = "";
    var nom = self.attr("value");
    if (vide != nom) """),format.raw("""{"""),format.raw/*236.23*/("""      
		addPersonne($("#champ").attr('value'));			
	"""),format.raw("""}"""),format.raw/*238.3*/("""
"""),format.raw("""}"""),format.raw/*239.2*/("""

function editPersonne(personneId, personneNom)
"""),format.raw("""{"""),format.raw/*242.2*/("""
  $.ajax("""),format.raw("""{"""),format.raw/*243.11*/("""
		type: "POST",
		url: """"),_display_(Seq[Any](/*245.10*/routes/*245.16*/.Application.updatePersonne(id))),format.raw/*245.47*/("""",
		data: '"""),format.raw("""{"""),format.raw/*246.11*/(""""id" : "' + personneId + '", "nom" : "' + personneNom + '""""),format.raw("""}"""),format.raw/*246.70*/("""',
		contentType: "application/json",
		success : function(data) """),format.raw("""{"""),format.raw/*248.29*/("""
		  //alert("Participant edit\351");
		"""),format.raw("""}"""),format.raw/*250.4*/("""
  """),format.raw("""}"""),format.raw/*251.4*/(""");
"""),format.raw("""}"""),format.raw/*252.2*/("""

function deletePersonne(persId)
"""),format.raw("""{"""),format.raw/*255.2*/("""
  $.ajax("""),format.raw("""{"""),format.raw/*256.11*/("""
		type: "POST",
		url: """"),_display_(Seq[Any](/*258.10*/routes/*258.16*/.Application.deleteParticipant(id))),format.raw/*258.50*/("""",
		data: '"""),format.raw("""{"""),format.raw/*259.11*/(""""id" : "' + persId + '""""),format.raw("""}"""),format.raw/*259.35*/("""',
		contentType: "application/json",
		success : function(data) """),format.raw("""{"""),format.raw/*261.29*/("""
		  //alert("Participant supprim\351");
		"""),format.raw("""}"""),format.raw/*263.4*/("""
  """),format.raw("""}"""),format.raw/*264.4*/(""");
"""),format.raw("""}"""),format.raw/*265.2*/("""

function addPersonne(nomParticipant)
"""),format.raw("""{"""),format.raw/*268.2*/("""	
	$.ajax("""),format.raw("""{"""),format.raw/*269.10*/("""
		type: "POST",
		url: """"),_display_(Seq[Any](/*271.10*/routes/*271.16*/.Application.addParticipant(id))),format.raw/*271.47*/("""",
		data: '"""),format.raw("""{"""),format.raw/*272.11*/(""""nom" : "' + nomParticipant + '""""),format.raw("""}"""),format.raw/*272.44*/("""',
		contentType: "application/json",
		success : function(data) """),format.raw("""{"""),format.raw/*274.29*/("""		  
		  $("#mainBody").append("<tr id=\""+data.idPersonne+"\"><td class=\"infoPersonne\">"+
				  "<form id=\"formPersonne\">"+
				  "<input id=\"nom\" type=\"text\" value=\""+nomParticipant+"\" name=\"nom\" readonly=\"readonly\">&nbsp;"+
				  "<a id=\""+data.idPersonne+"\" class=\"editPersonne btn\">Editer<i class=\"icon-pencil\"></i></a>&nbsp;"+
				  "<a id=\""+data.idPersonne+"\" class=\"deletePersonne btn btn-danger\">Supprimer<i class=\"icon-trash\"></i></a>"+				  
				 "</form></td>"+
				  """"),_display_(Seq[Any](/*281.9*/for(jour <- event.jours) yield /*281.33*/ {_display_(Seq[Any](format.raw/*281.35*/(""""+  
				  	""""),_display_(Seq[Any](/*282.10*/if(jour.horaires.size() == 0)/*282.39*/{_display_(Seq[Any](format.raw/*282.40*/("""<td class=\"checktd\"><input id=\""""),_display_(Seq[Any](/*282.75*/jour/*282.79*/.id)),format.raw/*282.82*/("""\" type=\"checkbox\" class=\"jour checkbox\" value=\""""),_display_(Seq[Any](/*282.136*/jour/*282.140*/.date)),format.raw/*282.145*/("""\" /></td>""")))})),format.raw/*282.156*/(""""+
	                	""""),_display_(Seq[Any](/*283.21*/for(horaire <- jour.horaires) yield /*283.50*/ {_display_(Seq[Any](format.raw/*283.52*/(""""+	                		
			                 "<td class=\"checktd\"><input id=\""""),_display_(Seq[Any](/*284.57*/horaire/*284.64*/.id)),format.raw/*284.67*/("""\" type=\"checkbox\" class=\"horaire checkbox\" value=\""""),_display_(Seq[Any](/*284.124*/horaire/*284.131*/.debut)),format.raw/*284.137*/(""" - """),_display_(Seq[Any](/*284.141*/horaire/*284.148*/.fin)),format.raw/*284.152*/("""\" /></td>"+			                
	                	"""")))})),format.raw/*285.21*/(""""+                	                
                  """")))})),format.raw/*286.21*/("""" +
				"</tr>")
		  $('#champ').attr('value', '')
		  $('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*290.4*/("""               
	"""),format.raw("""}"""),format.raw/*291.3*/(""");
"""),format.raw("""}"""),format.raw/*292.2*/("""


$('.checktd').live('click', function(e) """),format.raw("""{"""),format.raw/*295.42*/("""
      
	if ($(this).children().prop("checked") == false) """),format.raw("""{"""),format.raw/*297.52*/("""
	  if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*298.35*/("""
	  	$(this).children().prop("checked", true);
	  """),format.raw("""}"""),format.raw/*300.5*/("""
	  changeCheck($(this).children());
	"""),format.raw("""}"""),format.raw/*302.3*/(""" else """),format.raw("""{"""),format.raw/*302.10*/("""
	if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*303.33*/("""
	  	$(this).children().prop("checked", false);
	"""),format.raw("""}"""),format.raw/*305.3*/("""        
	changeCheck($(this).children());
	"""),format.raw("""}"""),format.raw/*307.3*/("""
	var max = 0;
	$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*309.44*/("""
		$(this).css("background-color", "#A0A0A0") //gris
		$('.titres').children().css("background-color","#A0A0A0");
		$('.footer').html("");
		if ($(this).html() > max) """),format.raw("""{"""),format.raw/*313.30*/("""			
			max = $(this).html();
		"""),format.raw("""}"""),format.raw/*315.4*/("""
	"""),format.raw("""}"""),format.raw/*316.3*/(""")
	$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*317.44*/("""		
		if ($(this).html() == max && $(this).html() != 0) """),format.raw("""{"""),format.raw/*318.54*/("""			
			$(this).css("background-color", "black");
			//alert("classe : "+$(this).attr("class")+" id : "+$(this).attr("id"));
			$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", "black");
			if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*322.44*/("""
				var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
				$("td:contains('"+day+"')").css("background-color", "black");
				$('.footer').append(day);
			"""),format.raw("""}"""),format.raw/*326.5*/("""
		"""),format.raw("""}"""),format.raw/*327.4*/("""
	"""),format.raw("""}"""),format.raw/*328.3*/(""")



"""),format.raw("""}"""),format.raw/*332.2*/(""");



$(".checktd").hover(  
  function () """),format.raw("""{"""),format.raw/*337.16*/("""  	
    $(this).css("background-color", "lightgreen");
    
  """),format.raw("""}"""),format.raw/*340.4*/(""",
  function () """),format.raw("""{"""),format.raw/*341.16*/("""
  	if ($(this).children().is(':checked'))"""),format.raw("""{"""),format.raw/*342.43*/("""	 
    	$(this).css("background-color", "#66CC99");
    """),format.raw("""}"""),format.raw/*344.6*/(""" else """),format.raw("""{"""),format.raw/*344.13*/("""
    	$(this).css("background-color", "#A0A0A0");
    """),format.raw("""}"""),format.raw/*346.6*/("""

  """),format.raw("""}"""),format.raw/*348.4*/("""
);


function changeCheck(box) """),format.raw("""{"""),format.raw/*352.28*/("""   
   var idtime = box.attr('id');
   var idParticipant = box.parent().parent().attr('id');   
   
   if (box.is(':checked'))"""),format.raw("""{"""),format.raw/*356.28*/("""	   		
       		box.parent().css("background-color", "#66CC99")//vert
	   		if (box.attr('class') == 'horaire checkbox') """),format.raw("""{"""),format.raw/*358.53*/("""
	           var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
		   	   increment.html(parseInt(increment.html())+1);
	       	   requeteAjaxHeure(idtime, idParticipant);
		    """),format.raw("""}"""),format.raw/*362.8*/("""
       		if (box.attr('class') == 'jour checkbox') """),format.raw("""{"""),format.raw/*363.53*/("""	
    	   	   var increment = $('#compte').children('.jour[id="'+idtime+'"]');
		   	   increment.html(parseInt(increment.html())+1);
			   requeteAjaxJour(idtime, idParticipant);
		   """),format.raw("""}"""),format.raw/*367.7*/("""
   """),format.raw("""}"""),format.raw/*368.5*/(""" else """),format.raw("""{"""),format.raw/*368.12*/("""
     
     box.parent().css("background-color", "#A0A0A0")//gris
     if (box.attr('class') == 'horaire checkbox') """),format.raw("""{"""),format.raw/*371.52*/("""
	     var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
	     increment.html(parseInt(increment.html())-1);
	     requeteAjaxHeure(idtime, idParticipant);
     """),format.raw("""}"""),format.raw/*375.7*/("""
     if (box.attr('class') == 'jour checkbox') """),format.raw("""{"""),format.raw/*376.49*/("""
        var increment = $('#compte').children('.jour[id="'+idtime+'"]');
	    increment.html(parseInt(increment.html())-1);
	    requeteAjaxJour(idtime, idParticipant);
     """),format.raw("""}"""),format.raw/*380.7*/("""
   """),format.raw("""}"""),format.raw/*381.5*/("""
   
   
"""),format.raw("""}"""),format.raw/*384.2*/("""

function requeteAjaxJour(idtime, idParticipant)
"""),format.raw("""{"""),format.raw/*387.2*/("""
  $.ajax("""),format.raw("""{"""),format.raw/*388.11*/("""
		type: "POST",
		url: """"),_display_(Seq[Any](/*390.10*/routes/*390.16*/.Application.checkBoxJour(id))),format.raw/*390.45*/("""",
		data: '"""),format.raw("""{"""),format.raw/*391.11*/(""""idjour" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*391.79*/("""',
		contentType: "application/json",
		success : function(data) """),format.raw("""{"""),format.raw/*393.29*/("""
		  //alert("Jour edit\351");
		"""),format.raw("""}"""),format.raw/*395.4*/("""
   """),format.raw("""}"""),format.raw/*396.5*/(""");
"""),format.raw("""}"""),format.raw/*397.2*/("""

function requeteAjaxHeure(idtime, idParticipant)
"""),format.raw("""{"""),format.raw/*400.2*/("""
  $.ajax("""),format.raw("""{"""),format.raw/*401.11*/("""
		type: "POST",
		url: """"),_display_(Seq[Any](/*403.10*/routes/*403.16*/.Application.checkBoxHoraire(id))),format.raw/*403.48*/("""",
		data: '"""),format.raw("""{"""),format.raw/*404.11*/(""""idhoraire" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*404.82*/("""',
		contentType: "application/json",
		success : function(data) """),format.raw("""{"""),format.raw/*406.29*/("""
		  //alert("Horaire edit\351");
		"""),format.raw("""}"""),format.raw/*408.4*/("""
   """),format.raw("""}"""),format.raw/*409.5*/(""");
"""),format.raw("""}"""),format.raw/*410.2*/("""



</script>

""")))})),format.raw/*416.2*/("""
"""))}
    }
    
    def render(id:Long,eventForm:Form[Evenement],event:Evenement) = apply(id,eventForm,event)
    
    def f:((Long,Form[Evenement],Evenement) => play.api.templates.Html) = (id,eventForm,event) => apply(id,eventForm,event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 11 13:25:37 CEST 2012
                    SOURCE: C:/tutoPlay/doodle/app/views/editForm.scala.html
                    HASH: e5afeb2302ec6da1efc652478ded0e24d89b3c47
                    MATRIX: 782->1|914->160|932->170|1041->216|1078->219|1147->280|1210->306|1273->334|1298->338|1343->348|1369->353|1452->405|1485->78|1517->102|1601->57|1629->76|1657->156|1687->407|1725->410|1761->437|1801->439|1864->466|1878->471|1909->480|1996->531|2010->536|2041->545|2113->581|2127->586|2161->598|2229->630|2243->635|2279->649|2478->813|2518->837|2558->839|2617->862|2630->866|2655->869|2716->894|2729->898|2767->914|2809->920|2822->924|2849->929|2936->985|3062->1076|3102->1100|3142->1102|3186->1111|3224->1140|3263->1141|3331->1178|3377->1188|3422->1217|3462->1219|3517->1238|3533->1245|3558->1248|3602->1256|3615->1260|3642->1265|3697->1284|3713->1291|3741->1297|3781->1301|3797->1308|3823->1312|3870->1327|3935->1361|4002->1393|4056->1431|4096->1433|4145->1446|4165->1457|4195->1465|4263->1498|4336->1562|4376->1564|4454->1606|4474->1617|4505->1626|4594->1679|4614->1690|4644->1698|4759->1777|4779->1788|4809->1796|4926->1882|4977->1898|5017->1922|5057->1924|5103->1934|5141->1963|5180->1964|5228->1976|5285->2024|5325->2026|5412->2077|5425->2081|5450->2084|5543->2140|5557->2144|5585->2149|5631->2177|5644->2182|5683->2183|5771->2235|5784->2239|5809->2242|5894->2290|5908->2294|5936->2299|5995->2326|6049->2348|6101->2364|6146->2393|6186->2395|6240->2413|6303->2467|6343->2469|6430->2520|6446->2527|6471->2530|6568->2590|6585->2597|6614->2603|6655->2607|6672->2614|6699->2618|6745->2646|6758->2651|6797->2652|6885->2704|6901->2711|6926->2714|7014->2765|7031->2772|7060->2778|7101->2782|7118->2789|7145->2793|7204->2820|7252->2836|7325->2877|7373->2894|7501->2987|7541->3011|7581->3013|7624->3021|7662->3050|7701->3051|7770->3084|7783->3088|7808->3091|7876->3128|7926->3142|7971->3171|8011->3173|8087->3213|8103->3220|8128->3223|8212->3275|8247->3279|8767->3751|8852->3788|8933->3821|9044->3885|9094->3888|9185->3931|9269->3968|9370->4021|9503->4106|9582->4137|9754->4262|9804->4265|9901->4314|9980->4345|10149->4467|10199->4470|10249->4473|10358->4534|10551->4679|10630->4711|10680->4714|10773->4759|10877->4815|11201->5091|11427->5270|11478->5274|11528->5277|11581->5283|11677->5331|11779->5385|11842->5411|11858->5417|11906->5442|11967->5455|12049->5489|12163->5555|12259->5604|12311->5609|12362->5613|12469->5672|12684->5839|12785->5893|12892->5952|12958->5970|13059->6023|13191->6107|13273->6141|13448->6269|13501->6275|13592->6318|13674->6352|13846->6477|13899->6483|13950->6487|14001->6491|14098->6540|14207->6601|14403->6750|14458->6757|14780->7032|14832->7037|14927->7084|15011->7121|15095->7158|15219->7234|15320->7288|15369->7290|15466->7340|15525->7351|15588->7377|15604->7383|15658->7414|15719->7427|15826->7486|15940->7552|16028->7593|16079->7597|16130->7601|16212->7636|16271->7647|16334->7673|16350->7679|16407->7713|16468->7726|16540->7750|16654->7816|16745->7860|16796->7864|16847->7868|16934->7908|16993->7919|17056->7945|17072->7951|17126->7982|17187->7995|17268->8028|17382->8094|17927->8603|17968->8627|18009->8629|18060->8643|18099->8672|18139->8673|18211->8708|18225->8712|18251->8715|18343->8769|18358->8773|18387->8778|18432->8789|18492->8812|18538->8841|18579->8843|18694->8921|18711->8928|18737->8931|18832->8988|18850->8995|18880->9001|18922->9005|18940->9012|18968->9016|19053->9068|19142->9124|19278->9213|19343->9231|19394->9235|19486->9279|19593->9338|19676->9373|19774->9424|19860->9463|19915->9470|19996->9503|20093->9553|20185->9598|20291->9656|20507->9824|20586->9856|20636->9859|20729->9904|20833->9960|21157->10236|21408->10440|21459->10444|21509->10447|21562->10453|21654->10497|21764->10560|21829->10577|21920->10620|22024->10677|22079->10684|22181->10739|22233->10744|22314->10777|22489->10904|22659->11026|22902->11222|23003->11275|23236->11461|23288->11466|23343->11473|23508->11590|23735->11770|23832->11819|24055->11995|24107->12000|24164->12010|24262->12061|24321->12072|24384->12098|24400->12104|24452->12133|24513->12146|24629->12214|24743->12280|24824->12314|24876->12319|24927->12323|25026->12375|25085->12386|25148->12412|25164->12418|25219->12450|25280->12463|25399->12534|25513->12600|25597->12637|25649->12642|25700->12646|25748->12662
                    LINES: 27->1|30->7|30->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|34->9|36->11|37->5|37->5|38->1|40->4|41->5|43->12|45->14|45->14|45->14|47->16|47->16|47->16|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|65->34|65->34|65->34|66->35|66->35|66->35|68->37|69->38|69->38|69->38|70->39|70->39|70->39|70->39|70->39|70->39|70->39|70->39|70->39|70->39|70->39|70->39|71->40|72->41|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|81->50|81->50|81->50|82->51|82->51|82->51|83->52|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59|90->59|90->59|90->59|91->60|93->62|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|97->66|97->66|97->66|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|99->68|100->69|101->70|103->72|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|110->79|111->80|111->80|111->80|112->81|112->81|112->81|113->82|114->83|141->110|142->111|143->112|145->114|146->115|148->117|150->119|154->123|157->126|158->127|161->130|162->131|163->132|164->133|167->136|168->137|169->138|172->141|175->144|177->146|178->147|179->148|180->149|184->153|188->157|189->158|190->159|192->161|195->164|198->167|200->169|200->169|200->169|201->170|201->170|203->172|205->174|206->175|207->176|210->179|214->183|216->185|217->186|217->186|218->187|221->190|222->191|225->194|226->195|227->196|228->197|231->200|232->201|233->202|234->203|236->205|237->206|241->210|241->210|247->216|249->218|255->224|258->227|264->233|267->236|269->238|270->239|273->242|274->243|276->245|276->245|276->245|277->246|277->246|279->248|281->250|282->251|283->252|286->255|287->256|289->258|289->258|289->258|290->259|290->259|292->261|294->263|295->264|296->265|299->268|300->269|302->271|302->271|302->271|303->272|303->272|305->274|312->281|312->281|312->281|313->282|313->282|313->282|313->282|313->282|313->282|313->282|313->282|313->282|313->282|314->283|314->283|314->283|315->284|315->284|315->284|315->284|315->284|315->284|315->284|315->284|315->284|316->285|317->286|321->290|322->291|323->292|326->295|328->297|329->298|331->300|333->302|333->302|334->303|336->305|338->307|340->309|344->313|346->315|347->316|348->317|349->318|353->322|357->326|358->327|359->328|363->332|368->337|371->340|372->341|373->342|375->344|375->344|377->346|379->348|383->352|387->356|389->358|393->362|394->363|398->367|399->368|399->368|402->371|406->375|407->376|411->380|412->381|415->384|418->387|419->388|421->390|421->390|421->390|422->391|422->391|424->393|426->395|427->396|428->397|431->400|432->401|434->403|434->403|434->403|435->404|435->404|437->406|439->408|440->409|441->410|447->416
                    -- GENERATED --
                */
            