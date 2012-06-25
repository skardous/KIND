
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
object editForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Evenement,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(event: Evenement):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 


"""),_display_(Seq[Any](/*8.2*/main("Editer un evenement")/*8.29*/ {_display_(Seq[Any](format.raw/*8.31*/("""

	<h1>Participants pour: """),_display_(Seq[Any](/*10.26*/event/*10.31*/.titre)),format.raw/*10.37*/("""</h1><br/>

	
	Titre de l'&eacute;venement : <b>"""),_display_(Seq[Any](/*13.36*/event/*13.41*/.titre)),format.raw/*13.47*/("""</b> <br/>
	Cr&eacute;ateur : <b>"""),_display_(Seq[Any](/*14.24*/event/*14.29*/.createur)),format.raw/*14.38*/("""</b> <br/>

	"""),_display_(Seq[Any](/*16.3*/if(event.descriptif != "")/*16.29*/ {_display_(Seq[Any](format.raw/*16.31*/("""
	Description : <i>"""),_display_(Seq[Any](/*17.20*/event/*17.25*/.descriptif)),format.raw/*17.36*/("""</i> <br/>	
	""")))})),format.raw/*18.3*/("""			
	
	<a class="btn btn-danger" href=""""),_display_(Seq[Any](/*20.35*/routes/*20.41*/.Application.deleteEvent(event.id))),format.raw/*20.75*/("""">Supprimer l'evenement</a>
	
	<table class="datesTable" cellspacing="5" cellpadding="5">
		<tbody>
			<tr class="titres" style="display:none"><td style="visibility:hidden"></td>
				"""),_display_(Seq[Any](/*25.6*/for(jour <- event.jours) yield /*25.30*/ {_display_(Seq[Any](format.raw/*25.32*/("""  					  
					<td id=""""),_display_(Seq[Any](/*26.15*/jour/*26.19*/.id)),format.raw/*26.22*/("""" class="jour" colspan=""""),_display_(Seq[Any](/*26.47*/jour/*26.51*/.horaires.size())),format.raw/*26.67*/(""""><b>"""),_display_(Seq[Any](/*26.73*/jour/*26.77*/.date)),format.raw/*26.82*/("""</b></td>	                        	                
				""")))})),format.raw/*27.6*/("""
			</tr>
			<tr class="titres" style="display:none"><td style="visibility:hidden"></td>
				"""),_display_(Seq[Any](/*30.6*/for(jour <- event.jours) yield /*30.30*/ {_display_(Seq[Any](format.raw/*30.32*/("""  
				  """),_display_(Seq[Any](/*31.8*/if(jour.horaires.size() == 0)/*31.37*/{_display_(Seq[Any](format.raw/*31.38*/("""
				    <td class="jour"></td>
				  """)))})),format.raw/*33.8*/("""
				     """),_display_(Seq[Any](/*34.11*/for(horaire <- jour.horaires) yield /*34.40*/ {_display_(Seq[Any](format.raw/*34.42*/("""
				    	 <td id=""""),_display_(Seq[Any](/*35.20*/horaire/*35.27*/.id)),format.raw/*35.30*/("""" day=""""),_display_(Seq[Any](/*35.38*/jour/*35.42*/.date)),format.raw/*35.47*/("""" class="horaire">"""),_display_(Seq[Any](/*35.66*/horaire/*35.73*/.debut)),format.raw/*35.79*/(""" - """),_display_(Seq[Any](/*35.83*/horaire/*35.90*/.fin)),format.raw/*35.94*/("""</td>
				     """)))})),format.raw/*36.11*/("""            	                
				""")))})),format.raw/*37.6*/("""
			</tr>
			              
			
			"""),_display_(Seq[Any](/*41.5*/for(participant <- event.participants) yield /*41.43*/ {_display_(Seq[Any](format.raw/*41.45*/("""
				<tr id=""""),_display_(Seq[Any](/*42.14*/participant/*42.25*/.getId())),format.raw/*42.33*/(""""><td class="infoPersonne">
					"""),_display_(Seq[Any](/*43.7*/form(routes.Application.updatePersonne(event.id), 'id->"formPersonne")/*43.77*/ {_display_(Seq[Any](format.raw/*43.79*/("""
						<input id="nom" type="text" value=""""),_display_(Seq[Any](/*44.43*/participant/*44.54*/.getNom())),format.raw/*44.63*/("""" name="nom" readonly="readonly">	
					
						<a id=""""),_display_(Seq[Any](/*46.15*/participant/*46.26*/.getId())),format.raw/*46.34*/("""" class="editPersonne btn btn-info">Editer</a>
						<a id=""""),_display_(Seq[Any](/*47.15*/participant/*47.26*/.getId())),format.raw/*47.34*/("""" class="deletePersonne btn btn-danger"> Supprimer</a>
					""")))})),format.raw/*48.7*/("""</td>
					
					"""),_display_(Seq[Any](/*50.7*/for(jour <- event.jours) yield /*50.31*/ {_display_(Seq[Any](format.raw/*50.33*/("""
					    """),_display_(Seq[Any](/*51.11*/if(jour.horaires.size() == 0)/*51.40*/{_display_(Seq[Any](format.raw/*51.41*/("""
					      """),_display_(Seq[Any](/*52.13*/if(participant.inscriptionsJours.contains(jour))/*52.61*/ {_display_(Seq[Any](format.raw/*52.63*/("""
			                <td class="checktd"><input id=""""),_display_(Seq[Any](/*53.52*/jour/*53.56*/.id)),format.raw/*53.59*/("""" type="checkbox"  disabled checked class="jour checkbox" value=""""),_display_(Seq[Any](/*53.125*/jour/*53.129*/.date)),format.raw/*53.134*/("""" /></td>
			              """)))}/*54.20*/else/*54.25*/{_display_(Seq[Any](format.raw/*54.26*/("""
			                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*55.53*/jour/*55.57*/.id)),format.raw/*55.60*/("""" type="checkbox"  disabled class="jour checkbox" value=""""),_display_(Seq[Any](/*55.118*/jour/*55.122*/.date)),format.raw/*55.127*/("""" /></td>
			              """)))})),format.raw/*56.19*/("""
					       
					    """)))})),format.raw/*58.11*/("""
			            """),_display_(Seq[Any](/*59.17*/for(horaire <- jour.horaires) yield /*59.46*/ {_display_(Seq[Any](format.raw/*59.48*/("""
			              """),_display_(Seq[Any](/*60.19*/if(participant.inscriptionsHoraires.contains(horaire))/*60.73*/ {_display_(Seq[Any](format.raw/*60.75*/("""
			                <td class="checktd"><input id=""""),_display_(Seq[Any](/*61.52*/horaire/*61.59*/.id)),format.raw/*61.62*/("""" type="checkbox" disabled class="horaire checkbox"  checked value=""""),_display_(Seq[Any](/*61.131*/horaire/*61.138*/.debut)),format.raw/*61.144*/(""" - """),_display_(Seq[Any](/*61.148*/horaire/*61.155*/.fin)),format.raw/*61.159*/("""" /></td>
			              """)))}/*62.20*/else/*62.25*/{_display_(Seq[Any](format.raw/*62.26*/("""
			                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*63.53*/horaire/*63.60*/.id)),format.raw/*63.63*/("""" type="checkbox" disabled class="horaire checkbox" value=""""),_display_(Seq[Any](/*63.123*/horaire/*63.130*/.debut)),format.raw/*63.136*/(""" - """),_display_(Seq[Any](/*63.140*/horaire/*63.147*/.fin)),format.raw/*63.151*/("""" /></td>
			              """)))})),format.raw/*64.19*/("""
			            """)))})),format.raw/*65.17*/("""            	                
			        """)))})),format.raw/*66.13*/("""				
				</tr>
			""")))})),format.raw/*68.5*/("""
		</tbody>
		<tfoot>
		<tr id="compte" class="titres"
		 """),_display_(Seq[Any](/*72.5*/if(event.participants.size() == 0)/*72.39*/{_display_(Seq[Any](format.raw/*72.40*/(""" style="display:none"""")))})),format.raw/*72.62*/(""">
			<td id=""><b>Compte: </b></td>
			"""),_display_(Seq[Any](/*74.5*/for(jour <- event.jours) yield /*74.29*/ {_display_(Seq[Any](format.raw/*74.31*/("""
			    """),_display_(Seq[Any](/*75.9*/if(jour.horaires.size() == 0)/*75.38*/{_display_(Seq[Any](format.raw/*75.39*/("""		     
	                <td id=""""),_display_(Seq[Any](/*76.27*/jour/*76.31*/.id)),format.raw/*76.34*/("""" class="jour">0</td>	       
			    """)))})),format.raw/*77.9*/("""
	            """),_display_(Seq[Any](/*78.15*/for(horaire <- jour.horaires) yield /*78.44*/ {_display_(Seq[Any](format.raw/*78.46*/("""              
	                <td id=""""),_display_(Seq[Any](/*79.27*/horaire/*79.34*/.id)),format.raw/*79.37*/("""" class="horaire">0</td>              
	            """)))})),format.raw/*80.15*/("""
			""")))})),format.raw/*81.5*/("""
		</tr>
		
		
			<!--<tr>
				<td> Date(s) populaire(s) :</td>
				<td colspan="0" class="footer"></td>
			</tr>-->
		</tfoot>

		<div class="populaires"></div>


		
	</table>

	Ajouter un participant :		  
	<input id="champ" type="text" value="">&nbsp;<a id="ajouter" class="btn">Ajouter</a><br>

	<br>
	<h3>Inviter des personnes à l'évenement</h3>

	<div class="selectDate">
	<textarea id="mailsArea" rows="4" style="color:grey" placeholder="Entrez ici les adresses mail séparées par une virgule ..."></textarea>
	<a id="envoiLien" class="btn btn-primary">Envoyer Lien</a>
	</div>

	<script type="text/javascript" charset="utf-8">
	
	var color1 = "#FFFF99";
	var color2 = "gold";
	var color3 = "steelblue";

	$("table.datesTable td").css("background-color", color3);

	$(function()"""),format.raw("""{"""),format.raw/*116.15*/(""" 
		$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*117.37*/("""
		  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*118.34*/("""
		  		$(this).parent().css("background-color", "#66CC99");
		  	"""),format.raw("""}"""),format.raw/*120.7*/("""
		"""),format.raw("""}"""),format.raw/*121.4*/(""");

		$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*123.41*/("""
		  	$('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*125.4*/(""");



		$('input[type="checkbox"]').each(function(i) """),format.raw("""{"""),format.raw/*129.49*/("""
			var iden = $(this).attr('id');

			if ($(this).attr('class') == 'horaire checkbox') """),format.raw("""{"""),format.raw/*132.54*/("""
				if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*133.33*/("""
			    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
					increment.html(parseInt(increment.html())+1);
				"""),format.raw("""}"""),format.raw/*136.6*/("""
			"""),format.raw("""}"""),format.raw/*137.5*/("""
			if ($(this).attr('class') == 'jour checkbox') """),format.raw("""{"""),format.raw/*138.51*/("""
				if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*139.33*/("""
			    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
					increment.html(parseInt(increment.html())+1);
				"""),format.raw("""}"""),format.raw/*142.6*/("""
			"""),format.raw("""}"""),format.raw/*143.5*/("""
		"""),format.raw("""}"""),format.raw/*144.4*/(""");

		var max = 0;
		$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*147.45*/("""
			$(this).css("background-color", color1) //gris
			$('.titres').children().css("background-color",color1);		
			if ($(this).html() > max) """),format.raw("""{"""),format.raw/*150.31*/("""			
				max = $(this).html();
			"""),format.raw("""}"""),format.raw/*152.5*/("""
		"""),format.raw("""}"""),format.raw/*153.4*/(""")
		$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*154.45*/("""		
			if ($(this).html() == max && $(this).html() != 0) """),format.raw("""{"""),format.raw/*155.55*/("""			
				$(this).css("background-color", color2);
				
				$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", color2);
				if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*159.45*/("""
					var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
					$("td:contains('"+day+"')").css("background-color", color2);
					
				"""),format.raw("""}"""),format.raw/*163.6*/("""
			"""),format.raw("""}"""),format.raw/*164.5*/("""
		"""),format.raw("""}"""),format.raw/*165.4*/(""")
	  
	"""),format.raw("""}"""),format.raw/*167.3*/(""");

	$("textarea").live('click', function(e) """),format.raw("""{"""),format.raw/*169.43*/("""
		$(this).html("");
		$(this).removeAttr("style");
	"""),format.raw("""}"""),format.raw/*172.3*/(""")


	$('#envoiLien').live('click', function(e) """),format.raw("""{"""),format.raw/*175.45*/("""
	  var mailsList = $("#mailsArea").val();
	  
		$.ajax("""),format.raw("""{"""),format.raw/*178.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*180.11*/routes/*180.17*/.Application.sendMail(event.id))),format.raw/*180.48*/("""",
			data: '"""),format.raw("""{"""),format.raw/*181.12*/(""""mailslist" : "' + mailsList + '""""),format.raw("""}"""),format.raw/*181.46*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*183.30*/("""
			  alert("Mail(s) envoye(s) a "+mailsList);
			"""),format.raw("""}"""),format.raw/*185.5*/("""
	   """),format.raw("""}"""),format.raw/*186.6*/(""");
	"""),format.raw("""}"""),format.raw/*187.3*/(""");
		  
		  
	$('.deletePersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*190.50*/("""    
	    $(this).parent().parent().parent().remove();
	    
	    
	    deletePersonne($(this).attr('id'));
	    if($('td[class="infoPersonne"]').html() == null) """),format.raw("""{"""),format.raw/*195.56*/("""
	    	$('.titres').attr('style','display:none');
	    """),format.raw("""}"""),format.raw/*197.7*/("""
	    $('#compte').children('td[id!=""]').each(function(i) """),format.raw("""{"""),format.raw/*198.60*/("""$(this).html("0")"""),format.raw("""}"""),format.raw/*198.78*/(""");
	    $('input[type="checkbox"]').each(function(i) """),format.raw("""{"""),format.raw/*199.52*/("""
	    var iden = $(this).attr('id');
	  
	    if ($(this).attr('class') == 'horaire checkbox') """),format.raw("""{"""),format.raw/*202.56*/("""
	    	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*203.35*/("""
		    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
	    	"""),format.raw("""}"""),format.raw/*206.8*/("""
	    """),format.raw("""}"""),format.raw/*207.7*/("""
	    if ($(this).attr('class') == 'jour checkbox') """),format.raw("""{"""),format.raw/*208.53*/("""
	    	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*209.35*/("""
		    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
	    	"""),format.raw("""}"""),format.raw/*212.8*/("""
	    """),format.raw("""}"""),format.raw/*213.7*/("""
	  """),format.raw("""}"""),format.raw/*214.5*/(""");
	    
	"""),format.raw("""}"""),format.raw/*216.3*/(""")

	$('.editPersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*218.48*/("""
	    if($(this).html() == "Editer")  """),format.raw("""{"""),format.raw/*219.39*/("""
	      $(this).html("OK");
	      $(this).attr("class", "editPersonne btn btn-success");
	      $(this).siblings("input").removeAttr("readonly");
	      $(this).parent().parent().parent().children("td").children().removeAttr("disabled");
	      $(this).parent().parent().parent().children("td").css("border", "solid black 2px");
	      $(".hoverable").off();
	      $(".hoverable").off();
	      $(this).parent().parent().parent().children(".checktd").attr("class", "checktd hoverable");
	      refreshHoverable();
	    """),format.raw("""}"""),format.raw/*229.7*/(""" else """),format.raw("""{"""),format.raw/*229.14*/("""
	      $(this).html("Editer");
	      $(this).attr("class", "editPersonne btn btn-info");
	      $(this).siblings("input").attr("readonly", "readonly");
	      $(this).parent().parent().parent().children("td").children('input[type="checkbox"]').attr("disabled","true"); 
	      $(this).parent().parent().parent().children("td").css("border", "none");
	      $(".hoverable").off();	      
	      $(this).parent().parent().parent().children(".checktd").attr("class", "checktd");
	      refreshHoverable();
	      editPersonne($(this).attr('id'), $(this).siblings("input").attr("value"));
	    """),format.raw("""}"""),format.raw/*239.7*/("""
	  
	"""),format.raw("""}"""),format.raw/*241.3*/(""")
	
	function refreshHoverable() """),format.raw("""{"""),format.raw/*243.31*/("""
		
		$(".hoverable").on("""),format.raw("""{"""),format.raw/*245.23*/("""

			mouseenter: function () """),format.raw("""{"""),format.raw/*247.29*/("""
				$(this).css("background-color", "lightgreen");
			"""),format.raw("""}"""),format.raw/*249.5*/(""", 

			mouseleave: function () """),format.raw("""{"""),format.raw/*251.29*/("""
				if ($(this).children().is(':checked'))"""),format.raw("""{"""),format.raw/*252.44*/("""	 
			    	$(this).css("background-color", "#66CC99");
			    """),format.raw("""}"""),format.raw/*254.9*/(""" else """),format.raw("""{"""),format.raw/*254.16*/("""
			    	$(this).css("background-color", color3);
			    """),format.raw("""}"""),format.raw/*256.9*/("""
			"""),format.raw("""}"""),format.raw/*257.5*/("""
		"""),format.raw("""}"""),format.raw/*258.4*/(""");

	"""),format.raw("""}"""),format.raw/*260.3*/("""


	$("#ajouter").live('click', function(e)"""),format.raw("""{"""),format.raw/*263.42*/("""	  
	    envoiPersonne($("#champ"));	    	    
	"""),format.raw("""}"""),format.raw/*265.3*/(""");

	$("#champ").keypress(function(e) """),format.raw("""{"""),format.raw/*267.36*/("""
		var code = (e.keyCode ? e.keyCode : e.which);
		if(code == 13) """),format.raw("""{"""),format.raw/*269.19*/(""" //Enter keycode
			envoiPersonne($("#champ"));	
			$("#champ").focus();
 		"""),format.raw("""}"""),format.raw/*272.5*/("""

	"""),format.raw("""}"""),format.raw/*274.3*/(""");




	function envoiPersonne(self)
	"""),format.raw("""{"""),format.raw/*280.3*/("""
	    var vide = "";	    
	    var nom = self.attr("value").trim();
	    if (vide != nom) """),format.raw("""{"""),format.raw/*283.24*/("""      
			addPersonne($("#champ").attr('value').trim());			
		"""),format.raw("""}"""),format.raw/*285.4*/("""
	"""),format.raw("""}"""),format.raw/*286.3*/("""

	function editPersonne(personneId, personneNom)
	"""),format.raw("""{"""),format.raw/*289.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*290.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*292.11*/routes/*292.17*/.Application.updatePersonne(event.id))),format.raw/*292.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*293.12*/(""""id" : "' + personneId + '", "nom" : "' + personneNom + '""""),format.raw("""}"""),format.raw/*293.71*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*295.30*/("""
			  //alert("Participant edit\351");
			"""),format.raw("""}"""),format.raw/*297.5*/("""
	  """),format.raw("""}"""),format.raw/*298.5*/(""");
	"""),format.raw("""}"""),format.raw/*299.3*/("""

	function deletePersonne(persId)
	"""),format.raw("""{"""),format.raw/*302.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*303.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*305.11*/routes/*305.17*/.Application.deleteParticipant(event.id))),format.raw/*305.57*/("""",
			data: '"""),format.raw("""{"""),format.raw/*306.12*/(""""id" : "' + persId + '""""),format.raw("""}"""),format.raw/*306.36*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*308.30*/("""
			  //alert("Participant supprim\351");
			"""),format.raw("""}"""),format.raw/*310.5*/("""
	  """),format.raw("""}"""),format.raw/*311.5*/(""");
	"""),format.raw("""}"""),format.raw/*312.3*/("""

	function addPersonne(nomParticipant)
	"""),format.raw("""{"""),format.raw/*315.3*/("""	
		$.ajax("""),format.raw("""{"""),format.raw/*316.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*318.11*/routes/*318.17*/.Application.addParticipant(event.id))),format.raw/*318.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*319.12*/(""""nom" : "' + nomParticipant + '""""),format.raw("""}"""),format.raw/*319.45*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*321.30*/("""		  
				$("tbody").append("<tr id=\""+data.idPersonne+"\"><td class=\"infoPersonne\">"+
					"<form id=\"formPersonne\">"+
					"<input id=\"nom\" type=\"text\" value=\""+nomParticipant+"\" name=\"nom\">&nbsp;"+
					"<a id=\""+data.idPersonne+"\" class=\"editPersonne btn btn-success\">OK</a>&nbsp;"+
					"<a id=\""+data.idPersonne+"\" class=\"deletePersonne btn btn-danger\">Supprimer</a>"+				  
					"</form></td>"+
					""""),_display_(Seq[Any](/*328.8*/for(jour <- event.jours) yield /*328.32*/ {_display_(Seq[Any](format.raw/*328.34*/(""""+  
					""""),_display_(Seq[Any](/*329.8*/if(jour.horaires.size() == 0)/*329.37*/{_display_(Seq[Any](format.raw/*329.38*/("""<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*329.117*/jour/*329.121*/.id)),format.raw/*329.124*/("""\" type=\"checkbox\" class=\"jour checkbox\" value=\""""),_display_(Seq[Any](/*329.178*/jour/*329.182*/.date)),format.raw/*329.187*/("""\" /></td>""")))})),format.raw/*329.198*/(""""+
					""""),_display_(Seq[Any](/*330.8*/for(horaire <- jour.horaires) yield /*330.37*/ {_display_(Seq[Any](format.raw/*330.39*/(""""+	                		
					"<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*331.86*/horaire/*331.93*/.id)),format.raw/*331.96*/("""\" type=\"checkbox\" class=\"horaire checkbox\" value=\""""),_display_(Seq[Any](/*331.153*/horaire/*331.160*/.debut)),format.raw/*331.166*/(""" - """),_display_(Seq[Any](/*331.170*/horaire/*331.177*/.fin)),format.raw/*331.181*/("""\" /></td>"+			                
					"""")))})),format.raw/*332.8*/(""""+                	                
					"""")))})),format.raw/*333.8*/("""" +
					"</tr>")
				$('#champ').attr('value', '')
				$('.titres').attr('style','');
				refreshHoverable();				
			"""),format.raw("""}"""),format.raw/*338.5*/("""               
		"""),format.raw("""}"""),format.raw/*339.4*/(""");
	"""),format.raw("""}"""),format.raw/*340.3*/("""


	$('.checktd').live('click', function(e) """),format.raw("""{"""),format.raw/*343.43*/("""
		if ($(this).children().prop("disabled") == false) """),format.raw("""{"""),format.raw/*344.54*/("""
			if ($(this).children().prop("checked") == false) """),format.raw("""{"""),format.raw/*345.54*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*346.36*/("""
					$(this).children().prop("checked", true);
				"""),format.raw("""}"""),format.raw/*348.6*/("""
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*350.5*/(""" else """),format.raw("""{"""),format.raw/*350.12*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*351.36*/("""
					$(this).children().prop("checked", false);
				"""),format.raw("""}"""),format.raw/*353.6*/("""        
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*355.5*/("""
			var max = 0;
			$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*357.46*/("""
				$(this).css("background-color", color1) //gris
				$('.titres').children().css("background-color",color1);
				$('.footer').html("");
				if ($(this).html() > max) """),format.raw("""{"""),format.raw/*361.32*/("""			
					max = $(this).html();
				"""),format.raw("""}"""),format.raw/*363.6*/("""
			"""),format.raw("""}"""),format.raw/*364.5*/(""")
			$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*365.46*/("""		
				if ($(this).html() == max && $(this).html() != 0) """),format.raw("""{"""),format.raw/*366.56*/("""			
					$(this).css("background-color", color2);
					//alert("classe : "+$(this).attr("class")+" id : "+$(this).attr("id"));
					$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", color2);
					if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*370.46*/("""
						var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
						$("td:contains('"+day+"')").css("background-color", color2);
						//$('.footer').append(day);
					"""),format.raw("""}"""),format.raw/*374.7*/("""
				"""),format.raw("""}"""),format.raw/*375.6*/("""
			"""),format.raw("""}"""),format.raw/*376.5*/(""")
			$('.populaires').html("");
			$('.titres td').each( function() """),format.raw("""{"""),format.raw/*378.38*/("""

				if ($(this).css('background-color') == color2) """),format.raw("""{"""),format.raw/*380.53*/("""
					$('.populaires').append($(this).html());
				"""),format.raw("""}"""),format.raw/*382.6*/("""				
			"""),format.raw("""}"""),format.raw/*383.5*/(""")			
		"""),format.raw("""}"""),format.raw/*384.4*/("""
	"""),format.raw("""}"""),format.raw/*385.3*/(""");


	

 


	function changeCheck(box) """),format.raw("""{"""),format.raw/*393.29*/("""   
	   var idtime = box.attr('id');
	   var idParticipant = box.parent().parent().attr('id');   
	   
	   if (box.is(':checked'))"""),format.raw("""{"""),format.raw/*397.29*/("""	   		
	       		box.parent().css("background-color", "#66CC99")//vert
		   		if (box.attr('class') == 'horaire checkbox') """),format.raw("""{"""),format.raw/*399.54*/("""
		           var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			   	   increment.html(parseInt(increment.html())+1);
		       	   requeteAjaxHeure(idtime, idParticipant);
			    """),format.raw("""}"""),format.raw/*403.9*/("""
	       		if (box.attr('class') == 'jour checkbox') """),format.raw("""{"""),format.raw/*404.54*/("""	
	    	   	   var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			   	   increment.html(parseInt(increment.html())+1);
				   requeteAjaxJour(idtime, idParticipant);
			   """),format.raw("""}"""),format.raw/*408.8*/("""
	   """),format.raw("""}"""),format.raw/*409.6*/(""" else """),format.raw("""{"""),format.raw/*409.13*/("""
	     
	     box.parent().css("background-color", color1)//gris
	     if (box.attr('class') == 'horaire checkbox') """),format.raw("""{"""),format.raw/*412.53*/("""
		     var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
		     increment.html(parseInt(increment.html())-1);
		     requeteAjaxHeure(idtime, idParticipant);
	     """),format.raw("""}"""),format.raw/*416.8*/("""
	     if (box.attr('class') == 'jour checkbox') """),format.raw("""{"""),format.raw/*417.50*/("""
	        var increment = $('#compte').children('.jour[id="'+idtime+'"]');
		    increment.html(parseInt(increment.html())-1);
		    requeteAjaxJour(idtime, idParticipant);
	     """),format.raw("""}"""),format.raw/*421.8*/("""
	   """),format.raw("""}"""),format.raw/*422.6*/("""
	"""),format.raw("""}"""),format.raw/*423.3*/("""

	function requeteAjaxJour(idtime, idParticipant)
	"""),format.raw("""{"""),format.raw/*426.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*427.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*429.11*/routes/*429.17*/.Application.checkBoxJour(event.id))),format.raw/*429.52*/("""",
			data: '"""),format.raw("""{"""),format.raw/*430.12*/(""""idjour" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*430.80*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*432.30*/("""
			  //alert("Jour edit\351");
			"""),format.raw("""}"""),format.raw/*434.5*/("""
	   """),format.raw("""}"""),format.raw/*435.6*/(""");
	"""),format.raw("""}"""),format.raw/*436.3*/("""

	function requeteAjaxHeure(idtime, idParticipant)
	"""),format.raw("""{"""),format.raw/*439.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*440.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*442.11*/routes/*442.17*/.Application.checkBoxHoraire(event.id))),format.raw/*442.55*/("""",
			data: '"""),format.raw("""{"""),format.raw/*443.12*/(""""idhoraire" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*443.83*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*445.30*/("""
			  //alert("Horaire edit\351");
			"""),format.raw("""}"""),format.raw/*447.5*/("""
	   """),format.raw("""}"""),format.raw/*448.6*/(""");
	"""),format.raw("""}"""),format.raw/*449.3*/("""



	</script>

""")))})),format.raw/*455.2*/("""
"""))}
    }
    
    def render(event:Evenement) = apply(event)
    
    def f:((Evenement) => play.api.templates.Html) = (event) => apply(event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 22 11:23:42 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/editForm.scala.html
                    HASH: 6495ecb3b2268b01c18f2ed45a824601c3694ffa
                    MATRIX: 761->1|864->40|896->64|980->19|1008->38|1036->118|1075->123|1110->150|1149->152|1212->179|1226->184|1254->190|1339->239|1353->244|1381->250|1451->284|1465->289|1496->298|1545->312|1580->338|1620->340|1676->360|1690->365|1723->376|1768->390|1844->430|1859->436|1915->470|2134->654|2174->678|2214->680|2274->704|2287->708|2312->711|2373->736|2386->740|2424->756|2466->762|2479->766|2506->771|2594->828|2723->922|2763->946|2803->948|2848->958|2886->987|2925->988|2995->1027|3042->1038|3087->1067|3127->1069|3183->1089|3199->1096|3224->1099|3268->1107|3281->1111|3308->1116|3363->1135|3379->1142|3407->1148|3447->1152|3463->1159|3489->1163|3537->1179|3603->1214|3674->1250|3728->1288|3768->1290|3818->1304|3838->1315|3868->1323|3937->1357|4016->1427|4056->1429|4135->1472|4155->1483|4186->1492|4277->1547|4297->1558|4327->1566|4424->1627|4444->1638|4474->1646|4566->1707|4619->1725|4659->1749|4699->1751|4746->1762|4784->1791|4823->1792|4872->1805|4929->1853|4969->1855|5057->1907|5070->1911|5095->1914|5198->1980|5212->1984|5240->1989|5287->2018|5300->2023|5339->2024|5428->2077|5441->2081|5466->2084|5561->2142|5575->2146|5603->2151|5663->2179|5719->2203|5772->2220|5817->2249|5857->2251|5912->2270|5975->2324|6015->2326|6103->2378|6119->2385|6144->2388|6250->2457|6267->2464|6296->2470|6337->2474|6354->2481|6381->2485|6428->2514|6441->2519|6480->2520|6569->2573|6585->2580|6610->2583|6707->2643|6724->2650|6753->2656|6794->2660|6811->2667|6838->2671|6898->2699|6947->2716|7021->2758|7071->2777|7165->2836|7208->2870|7247->2871|7301->2893|7376->2933|7416->2957|7456->2959|7500->2968|7538->2997|7577->2998|7647->3032|7660->3036|7685->3039|7754->3077|7805->3092|7850->3121|7890->3123|7967->3164|7983->3171|8008->3174|8093->3227|8129->3232|8962->4017|9048->4055|9130->4089|9243->4155|9294->4159|9386->4203|9473->4243|9575->4297|9712->4386|9793->4419|9971->4550|10023->4555|10122->4606|10203->4639|10378->4767|10430->4772|10481->4776|10592->4839|10782->4981|10863->5015|10914->5019|11008->5065|11113->5122|11368->5329|11597->5511|11649->5516|11700->5520|11755->5528|11849->5574|11950->5628|12046->5676|12151->5733|12216->5761|12232->5767|12286->5798|12348->5812|12430->5846|12546->5914|12644->5965|12697->5971|12749->5976|12859->6038|13070->6201|13173->6257|13281->6317|13347->6335|13449->6389|13593->6485|13676->6520|13854->6651|13908->6658|14009->6711|14092->6746|14267->6874|14321->6881|14373->6886|14431->6897|14529->6947|14616->6986|15185->7508|15240->7515|15880->8108|15934->8115|16016->8149|16090->8175|16168->8205|16271->8261|16351->8293|16443->8337|16553->8400|16608->8407|16713->8465|16765->8470|16816->8474|16869->8480|16961->8524|17057->8573|17144->8612|17259->8679|17383->8756|17434->8760|17520->8799|17659->8890|17769->8953|17819->8956|17918->9008|17978->9020|18043->9048|18059->9054|18119->9091|18181->9105|18288->9164|18404->9232|18494->9275|18546->9280|18598->9285|18682->9322|18742->9334|18807->9362|18823->9368|18886->9408|18948->9422|19020->9446|19136->9514|19229->9560|19281->9565|19333->9570|19422->9612|19482->9624|19547->9652|19563->9658|19623->9695|19685->9709|19766->9742|19882->9810|20347->10239|20388->10263|20429->10265|20477->10277|20516->10306|20556->10307|20673->10386|20688->10390|20715->10393|20807->10447|20822->10451|20851->10456|20896->10467|20942->10477|20988->10506|21029->10508|21173->10615|21190->10622|21216->10625|21311->10682|21329->10689|21359->10695|21401->10699|21419->10706|21447->10710|21518->10749|21593->10792|21759->10911|21825->10930|21877->10935|21970->10980|22072->11034|22174->11088|22258->11124|22358->11177|22447->11219|22502->11226|22586->11262|22687->11316|22784->11366|22894->11428|23112->11598|23195->11634|23247->11639|23342->11686|23448->11744|23778->12026|24038->12239|24091->12245|24143->12250|24260->12319|24362->12373|24461->12425|24517->12434|24572->12442|24622->12445|24710->12485|24889->12616|25061->12740|25308->12940|25410->12994|25647->13184|25700->13190|25755->13197|25920->13314|26151->13498|26249->13548|26476->13728|26529->13734|26579->13737|26679->13790|26739->13802|26804->13830|26820->13836|26878->13871|26940->13885|27056->13953|27172->14021|27255->14057|27308->14063|27360->14068|27461->14122|27521->14134|27586->14162|27602->14168|27663->14206|27725->14220|27844->14291|27960->14359|28046->14398|28099->14404|28151->14409|28200->14426
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|39->10|39->10|39->10|42->13|42->13|42->13|43->14|43->14|43->14|45->16|45->16|45->16|46->17|46->17|46->17|47->18|49->20|49->20|49->20|54->25|54->25|54->25|55->26|55->26|55->26|55->26|55->26|55->26|55->26|55->26|55->26|56->27|59->30|59->30|59->30|60->31|60->31|60->31|62->33|63->34|63->34|63->34|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|65->36|66->37|70->41|70->41|70->41|71->42|71->42|71->42|72->43|72->43|72->43|73->44|73->44|73->44|75->46|75->46|75->46|76->47|76->47|76->47|77->48|79->50|79->50|79->50|80->51|80->51|80->51|81->52|81->52|81->52|82->53|82->53|82->53|82->53|82->53|82->53|83->54|83->54|83->54|84->55|84->55|84->55|84->55|84->55|84->55|85->56|87->58|88->59|88->59|88->59|89->60|89->60|89->60|90->61|90->61|90->61|90->61|90->61|90->61|90->61|90->61|90->61|91->62|91->62|91->62|92->63|92->63|92->63|92->63|92->63|92->63|92->63|92->63|92->63|93->64|94->65|95->66|97->68|101->72|101->72|101->72|101->72|103->74|103->74|103->74|104->75|104->75|104->75|105->76|105->76|105->76|106->77|107->78|107->78|107->78|108->79|108->79|108->79|109->80|110->81|145->116|146->117|147->118|149->120|150->121|152->123|154->125|158->129|161->132|162->133|165->136|166->137|167->138|168->139|171->142|172->143|173->144|176->147|179->150|181->152|182->153|183->154|184->155|188->159|192->163|193->164|194->165|196->167|198->169|201->172|204->175|207->178|209->180|209->180|209->180|210->181|210->181|212->183|214->185|215->186|216->187|219->190|224->195|226->197|227->198|227->198|228->199|231->202|232->203|235->206|236->207|237->208|238->209|241->212|242->213|243->214|245->216|247->218|248->219|258->229|258->229|268->239|270->241|272->243|274->245|276->247|278->249|280->251|281->252|283->254|283->254|285->256|286->257|287->258|289->260|292->263|294->265|296->267|298->269|301->272|303->274|309->280|312->283|314->285|315->286|318->289|319->290|321->292|321->292|321->292|322->293|322->293|324->295|326->297|327->298|328->299|331->302|332->303|334->305|334->305|334->305|335->306|335->306|337->308|339->310|340->311|341->312|344->315|345->316|347->318|347->318|347->318|348->319|348->319|350->321|357->328|357->328|357->328|358->329|358->329|358->329|358->329|358->329|358->329|358->329|358->329|358->329|358->329|359->330|359->330|359->330|360->331|360->331|360->331|360->331|360->331|360->331|360->331|360->331|360->331|361->332|362->333|367->338|368->339|369->340|372->343|373->344|374->345|375->346|377->348|379->350|379->350|380->351|382->353|384->355|386->357|390->361|392->363|393->364|394->365|395->366|399->370|403->374|404->375|405->376|407->378|409->380|411->382|412->383|413->384|414->385|422->393|426->397|428->399|432->403|433->404|437->408|438->409|438->409|441->412|445->416|446->417|450->421|451->422|452->423|455->426|456->427|458->429|458->429|458->429|459->430|459->430|461->432|463->434|464->435|465->436|468->439|469->440|471->442|471->442|471->442|472->443|472->443|474->445|476->447|477->448|478->449|484->455
                    -- GENERATED --
                */
            