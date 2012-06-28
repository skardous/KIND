
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

		<!--<div class="populaires"></div>-->


		
	</table>
	
	<!--<a class="calButton btn btn-info" >Vue calendrier</a>
	<div id="calendar"></div>-->

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

	$(function()"""),format.raw("""{"""),format.raw/*119.15*/(""" 

		var date = new Date();
		var d = date.getDate();
		var m = date.getMonth();
		var y = date.getFullYear();
		
		$('#calendar').fullCalendar("""),format.raw("""{"""),format.raw/*126.32*/("""
			header: """),format.raw("""{"""),format.raw/*127.13*/("""
				left: 'prev,next today',
				center: 'title',
				right: 'month,basicWeek,basicDay'
			"""),format.raw("""}"""),format.raw/*131.5*/(""",
			editable: true,
			events: [
				"""),format.raw("""{"""),format.raw/*134.6*/("""
					title: 'All Day Event',
					start: new Date(y, m, 1)
				"""),format.raw("""}"""),format.raw/*137.6*/(""",
				"""),format.raw("""{"""),format.raw/*138.6*/("""
					title: 'Long Event',
					start: new Date(y, m, d-5),
					end: new Date(y, m, d-2)
				"""),format.raw("""}"""),format.raw/*142.6*/(""",
				"""),format.raw("""{"""),format.raw/*143.6*/("""
					id: 999,
					title: 'Repeating Event',
					start: new Date(y, m, d-3, 16, 0),
					allDay: false
				"""),format.raw("""}"""),format.raw/*148.6*/(""",
				"""),format.raw("""{"""),format.raw/*149.6*/("""
					id: 999,
					title: 'Repeating Event',
					start: new Date(y, m, d+4, 16, 0),
					allDay: false
				"""),format.raw("""}"""),format.raw/*154.6*/(""",
				"""),format.raw("""{"""),format.raw/*155.6*/("""
					title: 'Meeting',
					start: new Date(y, m, d, 10, 30),
					allDay: false
				"""),format.raw("""}"""),format.raw/*159.6*/(""",
				"""),format.raw("""{"""),format.raw/*160.6*/("""
					title: 'Lunch',
					start: new Date(y, m, d, 12, 0),
					end: new Date(y, m, d, 14, 0),
					allDay: false
				"""),format.raw("""}"""),format.raw/*165.6*/(""",
				"""),format.raw("""{"""),format.raw/*166.6*/("""
					title: 'Birthday Party',
					start: new Date(y, m, d+1, 19, 0),
					end: new Date(y, m, d+1, 22, 30),
					allDay: false
				"""),format.raw("""}"""),format.raw/*171.6*/(""",
				"""),format.raw("""{"""),format.raw/*172.6*/("""
					title: 'Click for Google',
					start: new Date(y, m, 28),
					end: new Date(y, m, 29),
					url: 'http://google.com/'
				"""),format.raw("""}"""),format.raw/*177.6*/("""
			]
		"""),format.raw("""}"""),format.raw/*179.4*/(""");

		$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*181.37*/("""
		  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*182.34*/("""
		  		$(this).parent().css("background-color", "#66CC99");
		  	"""),format.raw("""}"""),format.raw/*184.7*/("""
		"""),format.raw("""}"""),format.raw/*185.4*/(""");

		$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*187.41*/("""
		  	$('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*189.4*/(""");



		$('input[type="checkbox"]').each(function(i) """),format.raw("""{"""),format.raw/*193.49*/("""
			var iden = $(this).attr('id');

			if ($(this).attr('class') == 'horaire checkbox') """),format.raw("""{"""),format.raw/*196.54*/("""
				if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*197.33*/("""
			    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
					increment.html(parseInt(increment.html())+1);
				"""),format.raw("""}"""),format.raw/*200.6*/("""
			"""),format.raw("""}"""),format.raw/*201.5*/("""
			if ($(this).attr('class') == 'jour checkbox') """),format.raw("""{"""),format.raw/*202.51*/("""
				if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*203.33*/("""
			    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
					increment.html(parseInt(increment.html())+1);
				"""),format.raw("""}"""),format.raw/*206.6*/("""
			"""),format.raw("""}"""),format.raw/*207.5*/("""
		"""),format.raw("""}"""),format.raw/*208.4*/(""");

		var max = 0;
		$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*211.45*/("""
			$(this).css("background-color", color1) //gris
			$('.titres').children().css("background-color",color1);		
			if ($(this).html() > max) """),format.raw("""{"""),format.raw/*214.31*/("""			
				max = $(this).html();
			"""),format.raw("""}"""),format.raw/*216.5*/("""
		"""),format.raw("""}"""),format.raw/*217.4*/(""")
		$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*218.45*/("""		
			if ($(this).html() == max && $(this).html() != 0) """),format.raw("""{"""),format.raw/*219.55*/("""			
				$(this).css("background-color", color2);
				
				$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", color2);
				if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*223.45*/("""
					var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
					$("td:contains('"+day+"')").css("background-color", color2);
					
				"""),format.raw("""}"""),format.raw/*227.6*/("""
			"""),format.raw("""}"""),format.raw/*228.5*/("""
		"""),format.raw("""}"""),format.raw/*229.4*/(""")
	  
	"""),format.raw("""}"""),format.raw/*231.3*/(""");

	$('.calButton').live('click', function(e) """),format.raw("""{"""),format.raw/*233.45*/("""
		if ($("#calendar").css("display") == "none") """),format.raw("""{"""),format.raw/*234.49*/("""
			$("#calendar").css("display", "block");
		"""),format.raw("""}"""),format.raw/*236.4*/(""" else """),format.raw("""{"""),format.raw/*236.11*/("""
			$("#calendar").css("display", "none");
		"""),format.raw("""}"""),format.raw/*238.4*/("""
	"""),format.raw("""}"""),format.raw/*239.3*/(""");

	$("textarea").live('click', function(e) """),format.raw("""{"""),format.raw/*241.43*/("""
		$(this).html("");
		$(this).removeAttr("style");
	"""),format.raw("""}"""),format.raw/*244.3*/(""")


	$('#envoiLien').live('click', function(e) """),format.raw("""{"""),format.raw/*247.45*/("""
	  var mailsList = $("#mailsArea").val();
	  
		$.ajax("""),format.raw("""{"""),format.raw/*250.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*252.11*/routes/*252.17*/.Application.sendMail(event.id))),format.raw/*252.48*/("""",
			data: '"""),format.raw("""{"""),format.raw/*253.12*/(""""mailslist" : "' + mailsList + '""""),format.raw("""}"""),format.raw/*253.46*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*255.30*/("""
			  alert("Mail(s) envoye(s) a "+mailsList);
			"""),format.raw("""}"""),format.raw/*257.5*/("""
	   """),format.raw("""}"""),format.raw/*258.6*/(""");
	"""),format.raw("""}"""),format.raw/*259.3*/(""");
		  
		  
	$('.deletePersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*262.50*/("""    
	    $(this).parent().parent().parent().remove();
	    
	    
	    deletePersonne($(this).attr('id'));
	    if($('td[class="infoPersonne"]').html() == null) """),format.raw("""{"""),format.raw/*267.56*/("""
	    	$('.titres').attr('style','display:none');
	    """),format.raw("""}"""),format.raw/*269.7*/("""
	    $('#compte').children('td[id!=""]').each(function(i) """),format.raw("""{"""),format.raw/*270.60*/("""$(this).html("0")"""),format.raw("""}"""),format.raw/*270.78*/(""");
	    $('input[type="checkbox"]').each(function(i) """),format.raw("""{"""),format.raw/*271.52*/("""
	    var iden = $(this).attr('id');
	  
	    if ($(this).attr('class') == 'horaire checkbox') """),format.raw("""{"""),format.raw/*274.56*/("""
	    	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*275.35*/("""
		    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
	    	"""),format.raw("""}"""),format.raw/*278.8*/("""
	    """),format.raw("""}"""),format.raw/*279.7*/("""
	    if ($(this).attr('class') == 'jour checkbox') """),format.raw("""{"""),format.raw/*280.53*/("""
	    	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*281.35*/("""
		    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
	    	"""),format.raw("""}"""),format.raw/*284.8*/("""
	    """),format.raw("""}"""),format.raw/*285.7*/("""
	  """),format.raw("""}"""),format.raw/*286.5*/(""");
	    
	"""),format.raw("""}"""),format.raw/*288.3*/(""")

	$('.editPersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*290.48*/("""
	    if($(this).html() == "Editer")  """),format.raw("""{"""),format.raw/*291.39*/("""
	      $(this).html("OK");
	      $(this).attr("class", "editPersonne btn btn-success");
	      $(this).siblings("input").removeAttr("readonly");
	      $(this).parent().parent().parent().children("td").children().removeAttr("disabled");
	      $(this).parent().parent().parent().children("td").css("border", "solid black 2px");
	      $(".hoverable").off();
	      $(".hoverable").off();
	      $(this).parent().parent().parent().children(".checktd").attr("class", "checktd hoverable");
	      refreshHoverable();
	    """),format.raw("""}"""),format.raw/*301.7*/(""" else """),format.raw("""{"""),format.raw/*301.14*/("""
	      $(this).html("Editer");
	      $(this).attr("class", "editPersonne btn btn-info");
	      $(this).siblings("input").attr("readonly", "readonly");
	      $(this).parent().parent().parent().children("td").children('input[type="checkbox"]').attr("disabled","true"); 
	      $(this).parent().parent().parent().children("td").css("border", "none");
	      $(".hoverable").off();	      
	      $(this).parent().parent().parent().children(".checktd").attr("class", "checktd");
	      refreshHoverable();
	      editPersonne($(this).attr('id'), $(this).siblings("input").attr("value"));
	    """),format.raw("""}"""),format.raw/*311.7*/("""
	  
	"""),format.raw("""}"""),format.raw/*313.3*/(""")
	
	function refreshHoverable() """),format.raw("""{"""),format.raw/*315.31*/("""
		
		$(".hoverable").on("""),format.raw("""{"""),format.raw/*317.23*/("""

			mouseenter: function () """),format.raw("""{"""),format.raw/*319.29*/("""
				$(this).css("background-color", "lightgreen");
			"""),format.raw("""}"""),format.raw/*321.5*/(""", 

			mouseleave: function () """),format.raw("""{"""),format.raw/*323.29*/("""
				if ($(this).children().is(':checked'))"""),format.raw("""{"""),format.raw/*324.44*/("""	 
			    	$(this).css("background-color", "#66CC99");
			    """),format.raw("""}"""),format.raw/*326.9*/(""" else """),format.raw("""{"""),format.raw/*326.16*/("""
			    	$(this).css("background-color", color3);
			    """),format.raw("""}"""),format.raw/*328.9*/("""
			"""),format.raw("""}"""),format.raw/*329.5*/("""
		"""),format.raw("""}"""),format.raw/*330.4*/(""");

	"""),format.raw("""}"""),format.raw/*332.3*/("""


	$("#ajouter").live('click', function(e)"""),format.raw("""{"""),format.raw/*335.42*/("""	  
	    envoiPersonne($("#champ"));	    	    
	"""),format.raw("""}"""),format.raw/*337.3*/(""");

	$("#champ").keypress(function(e) """),format.raw("""{"""),format.raw/*339.36*/("""
		var code = (e.keyCode ? e.keyCode : e.which);
		if(code == 13) """),format.raw("""{"""),format.raw/*341.19*/(""" //Enter keycode
			envoiPersonne($("#champ"));	
			$("#champ").focus();
 		"""),format.raw("""}"""),format.raw/*344.5*/("""

	"""),format.raw("""}"""),format.raw/*346.3*/(""");




	function envoiPersonne(self)
	"""),format.raw("""{"""),format.raw/*352.3*/("""
	    var vide = "";	    
	    var nom = $.trim(self.attr("value"));
	    if (vide != nom) """),format.raw("""{"""),format.raw/*355.24*/("""      
			addPersonne($.trim($("#champ").attr('value')));			
		"""),format.raw("""}"""),format.raw/*357.4*/("""
	"""),format.raw("""}"""),format.raw/*358.3*/("""

	function editPersonne(personneId, personneNom)
	"""),format.raw("""{"""),format.raw/*361.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*362.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*364.11*/routes/*364.17*/.Application.updatePersonne(event.id))),format.raw/*364.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*365.12*/(""""id" : "' + personneId + '", "nom" : "' + personneNom + '""""),format.raw("""}"""),format.raw/*365.71*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*367.30*/("""
			  //alert("Participant edit\351");
			"""),format.raw("""}"""),format.raw/*369.5*/("""
	  """),format.raw("""}"""),format.raw/*370.5*/(""");
	"""),format.raw("""}"""),format.raw/*371.3*/("""

	function deletePersonne(persId)
	"""),format.raw("""{"""),format.raw/*374.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*375.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*377.11*/routes/*377.17*/.Application.deleteParticipant(event.id))),format.raw/*377.57*/("""",
			data: '"""),format.raw("""{"""),format.raw/*378.12*/(""""id" : "' + persId + '""""),format.raw("""}"""),format.raw/*378.36*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*380.30*/("""
			  //alert("Participant supprim\351");
			"""),format.raw("""}"""),format.raw/*382.5*/("""
	  """),format.raw("""}"""),format.raw/*383.5*/(""");
	"""),format.raw("""}"""),format.raw/*384.3*/("""

	function addPersonne(nomParticipant)
	"""),format.raw("""{"""),format.raw/*387.3*/("""	
		$.ajax("""),format.raw("""{"""),format.raw/*388.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*390.11*/routes/*390.17*/.Application.addParticipant(event.id))),format.raw/*390.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*391.12*/(""""nom" : "' + nomParticipant + '""""),format.raw("""}"""),format.raw/*391.45*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*393.30*/("""		  
				$("tbody").append("<tr id=\""+data.idPersonne+"\"><td class=\"infoPersonne\">"+
					"<form id=\"formPersonne\">"+
					"<input id=\"nom\" type=\"text\" value=\""+nomParticipant+"\" name=\"nom\">&nbsp;"+
					"<a id=\""+data.idPersonne+"\" class=\"editPersonne btn btn-success\">OK</a>&nbsp;"+
					"<a id=\""+data.idPersonne+"\" class=\"deletePersonne btn btn-danger\">Supprimer</a>"+				  
					"</form></td>"+
					""""),_display_(Seq[Any](/*400.8*/for(jour <- event.jours) yield /*400.32*/ {_display_(Seq[Any](format.raw/*400.34*/(""""+  
					""""),_display_(Seq[Any](/*401.8*/if(jour.horaires.size() == 0)/*401.37*/{_display_(Seq[Any](format.raw/*401.38*/("""<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*401.117*/jour/*401.121*/.id)),format.raw/*401.124*/("""\" type=\"checkbox\" class=\"jour checkbox\" value=\""""),_display_(Seq[Any](/*401.178*/jour/*401.182*/.date)),format.raw/*401.187*/("""\" /></td>""")))})),format.raw/*401.198*/(""""+
					""""),_display_(Seq[Any](/*402.8*/for(horaire <- jour.horaires) yield /*402.37*/ {_display_(Seq[Any](format.raw/*402.39*/(""""+	                		
					"<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*403.86*/horaire/*403.93*/.id)),format.raw/*403.96*/("""\" type=\"checkbox\" class=\"horaire checkbox\" value=\""""),_display_(Seq[Any](/*403.153*/horaire/*403.160*/.debut)),format.raw/*403.166*/(""" - """),_display_(Seq[Any](/*403.170*/horaire/*403.177*/.fin)),format.raw/*403.181*/("""\" /></td>"+			                
					"""")))})),format.raw/*404.8*/(""""+                	                
					"""")))})),format.raw/*405.8*/("""" +
					"</tr>")
				$('#champ').attr('value', '')
				$('.titres').attr('style','');
				refreshHoverable();				
			"""),format.raw("""}"""),format.raw/*410.5*/("""               
		"""),format.raw("""}"""),format.raw/*411.4*/(""");
	"""),format.raw("""}"""),format.raw/*412.3*/("""


	$('.checktd').live('click', function(e) """),format.raw("""{"""),format.raw/*415.43*/("""
		if ($(this).children().prop("disabled") == false) """),format.raw("""{"""),format.raw/*416.54*/("""
			if ($(this).children().prop("checked") == false) """),format.raw("""{"""),format.raw/*417.54*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*418.36*/("""
					$(this).children().prop("checked", true);
				"""),format.raw("""}"""),format.raw/*420.6*/("""
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*422.5*/(""" else """),format.raw("""{"""),format.raw/*422.12*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*423.36*/("""
					$(this).children().prop("checked", false);
				"""),format.raw("""}"""),format.raw/*425.6*/("""        
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*427.5*/("""
			var max = 0;
			$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*429.46*/("""
				$(this).css("background-color", color1) //gris
				$('.titres').children().css("background-color",color1);
				$('.footer').html("");
				if ($(this).html() > max) """),format.raw("""{"""),format.raw/*433.32*/("""			
					max = $(this).html();
				"""),format.raw("""}"""),format.raw/*435.6*/("""
			"""),format.raw("""}"""),format.raw/*436.5*/(""")
			$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*437.46*/("""		
				if ($(this).html() == max && $(this).html() != 0) """),format.raw("""{"""),format.raw/*438.56*/("""			
					$(this).css("background-color", color2);
					//alert("classe : "+$(this).attr("class")+" id : "+$(this).attr("id"));
					$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", color2);
					if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*442.46*/("""
						var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
						$("td:contains('"+day+"')").css("background-color", color2);
						//$('.footer').append(day);
					"""),format.raw("""}"""),format.raw/*446.7*/("""
				"""),format.raw("""}"""),format.raw/*447.6*/("""
			"""),format.raw("""}"""),format.raw/*448.5*/(""")
			$('.populaires').html("");
			$('.titres td').each( function() """),format.raw("""{"""),format.raw/*450.38*/("""

				if ($(this).css('background-color') == color2) """),format.raw("""{"""),format.raw/*452.53*/("""
					$('.populaires').append($(this).html());
				"""),format.raw("""}"""),format.raw/*454.6*/("""				
			"""),format.raw("""}"""),format.raw/*455.5*/(""")			
		"""),format.raw("""}"""),format.raw/*456.4*/("""
	"""),format.raw("""}"""),format.raw/*457.3*/(""");


	

 


	function changeCheck(box) """),format.raw("""{"""),format.raw/*465.29*/("""   
	   var idtime = box.attr('id');
	   var idParticipant = box.parent().parent().attr('id');   
	   
	   if (box.is(':checked'))"""),format.raw("""{"""),format.raw/*469.29*/("""	   		
	       		box.parent().css("background-color", "#66CC99")//vert
		   		if (box.attr('class') == 'horaire checkbox') """),format.raw("""{"""),format.raw/*471.54*/("""
		           var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			   	   increment.html(parseInt(increment.html())+1);
		       	   requeteAjaxHeure(idtime, idParticipant);
			    """),format.raw("""}"""),format.raw/*475.9*/("""
	       		if (box.attr('class') == 'jour checkbox') """),format.raw("""{"""),format.raw/*476.54*/("""	
	    	   	   var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			   	   increment.html(parseInt(increment.html())+1);
				   requeteAjaxJour(idtime, idParticipant);
			   """),format.raw("""}"""),format.raw/*480.8*/("""
	   """),format.raw("""}"""),format.raw/*481.6*/(""" else """),format.raw("""{"""),format.raw/*481.13*/("""
	     
	     box.parent().css("background-color", color1)//gris
	     if (box.attr('class') == 'horaire checkbox') """),format.raw("""{"""),format.raw/*484.53*/("""
		     var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
		     increment.html(parseInt(increment.html())-1);
		     requeteAjaxHeure(idtime, idParticipant);
	     """),format.raw("""}"""),format.raw/*488.8*/("""
	     if (box.attr('class') == 'jour checkbox') """),format.raw("""{"""),format.raw/*489.50*/("""
	        var increment = $('#compte').children('.jour[id="'+idtime+'"]');
		    increment.html(parseInt(increment.html())-1);
		    requeteAjaxJour(idtime, idParticipant);
	     """),format.raw("""}"""),format.raw/*493.8*/("""
	   """),format.raw("""}"""),format.raw/*494.6*/("""
	"""),format.raw("""}"""),format.raw/*495.3*/("""

	function requeteAjaxJour(idtime, idParticipant)
	"""),format.raw("""{"""),format.raw/*498.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*499.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*501.11*/routes/*501.17*/.Application.checkBoxJour(event.id))),format.raw/*501.52*/("""",
			data: '"""),format.raw("""{"""),format.raw/*502.12*/(""""idjour" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*502.80*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*504.30*/("""
			  //alert("Jour edit\351");
			"""),format.raw("""}"""),format.raw/*506.5*/("""
	   """),format.raw("""}"""),format.raw/*507.6*/(""");
	"""),format.raw("""}"""),format.raw/*508.3*/("""

	function requeteAjaxHeure(idtime, idParticipant)
	"""),format.raw("""{"""),format.raw/*511.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*512.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*514.11*/routes/*514.17*/.Application.checkBoxHoraire(event.id))),format.raw/*514.55*/("""",
			data: '"""),format.raw("""{"""),format.raw/*515.12*/(""""idhoraire" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*515.83*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*517.30*/("""
			  //alert("Horaire edit\351");
			"""),format.raw("""}"""),format.raw/*519.5*/("""
	   """),format.raw("""}"""),format.raw/*520.6*/(""");
	"""),format.raw("""}"""),format.raw/*521.3*/("""



	</script>

""")))})),format.raw/*527.2*/("""
"""))}
    }
    
    def render(event:Evenement) = apply(event)
    
    def f:((Evenement) => play.api.templates.Html) = (event) => apply(event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 28 08:40:09 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/editForm.scala.html
                    HASH: d34b5e575e6e4fc8e1bbf1a3f2377f705a97e8eb
                    MATRIX: 761->1|864->40|896->64|980->19|1008->38|1036->118|1075->123|1110->150|1149->152|1212->179|1226->184|1254->190|1339->239|1353->244|1381->250|1451->284|1465->289|1496->298|1545->312|1580->338|1620->340|1676->360|1690->365|1723->376|1768->390|1844->430|1859->436|1915->470|2134->654|2174->678|2214->680|2274->704|2287->708|2312->711|2373->736|2386->740|2424->756|2466->762|2479->766|2506->771|2594->828|2723->922|2763->946|2803->948|2848->958|2886->987|2925->988|2995->1027|3042->1038|3087->1067|3127->1069|3183->1089|3199->1096|3224->1099|3268->1107|3281->1111|3308->1116|3363->1135|3379->1142|3407->1148|3447->1152|3463->1159|3489->1163|3537->1179|3603->1214|3674->1250|3728->1288|3768->1290|3818->1304|3838->1315|3868->1323|3937->1357|4016->1427|4056->1429|4135->1472|4155->1483|4186->1492|4277->1547|4297->1558|4327->1566|4424->1627|4444->1638|4474->1646|4566->1707|4619->1725|4659->1749|4699->1751|4746->1762|4784->1791|4823->1792|4872->1805|4929->1853|4969->1855|5057->1907|5070->1911|5095->1914|5198->1980|5212->1984|5240->1989|5287->2018|5300->2023|5339->2024|5428->2077|5441->2081|5466->2084|5561->2142|5575->2146|5603->2151|5663->2179|5719->2203|5772->2220|5817->2249|5857->2251|5912->2270|5975->2324|6015->2326|6103->2378|6119->2385|6144->2388|6250->2457|6267->2464|6296->2470|6337->2474|6354->2481|6381->2485|6428->2514|6441->2519|6480->2520|6569->2573|6585->2580|6610->2583|6707->2643|6724->2650|6753->2656|6794->2660|6811->2667|6838->2671|6898->2699|6947->2716|7021->2758|7071->2777|7165->2836|7208->2870|7247->2871|7301->2893|7376->2933|7416->2957|7456->2959|7500->2968|7538->2997|7577->2998|7647->3032|7660->3036|7685->3039|7754->3077|7805->3092|7850->3121|7890->3123|7967->3164|7983->3171|8008->3174|8093->3227|8129->3232|9060->4115|9253->4260|9314->4273|9454->4366|9540->4405|9652->4470|9706->4477|9848->4572|9902->4579|10059->4689|10113->4696|10270->4806|10324->4813|10458->4900|10512->4907|10679->5027|10733->5034|10914->5168|10968->5175|11146->5306|11202->5315|11290->5355|11372->5389|11485->5455|11536->5459|11628->5503|11715->5543|11817->5597|11954->5686|12035->5719|12213->5850|12265->5855|12364->5906|12445->5939|12620->6067|12672->6072|12723->6076|12834->6139|13024->6281|13105->6315|13156->6319|13250->6365|13355->6422|13610->6629|13839->6811|13891->6816|13942->6820|13997->6828|14093->6876|14190->6925|14284->6972|14339->6979|14432->7025|14482->7028|14576->7074|14677->7128|14773->7176|14878->7233|14943->7261|14959->7267|15013->7298|15075->7312|15157->7346|15273->7414|15371->7465|15424->7471|15476->7476|15586->7538|15797->7701|15900->7757|16008->7817|16074->7835|16176->7889|16320->7985|16403->8020|16581->8151|16635->8158|16736->8211|16819->8246|16994->8374|17048->8381|17100->8386|17158->8397|17256->8447|17343->8486|17912->9008|17967->9015|18607->9608|18661->9615|18743->9649|18817->9675|18895->9705|18998->9761|19078->9793|19170->9837|19280->9900|19335->9907|19440->9965|19492->9970|19543->9974|19596->9980|19688->10024|19784->10073|19871->10112|19986->10179|20110->10256|20161->10260|20247->10299|20387->10391|20498->10455|20548->10458|20647->10510|20707->10522|20772->10550|20788->10556|20848->10593|20910->10607|21017->10666|21133->10734|21223->10777|21275->10782|21327->10787|21411->10824|21471->10836|21536->10864|21552->10870|21615->10910|21677->10924|21749->10948|21865->11016|21958->11062|22010->11067|22062->11072|22151->11114|22211->11126|22276->11154|22292->11160|22352->11197|22414->11211|22495->11244|22611->11312|23076->11741|23117->11765|23158->11767|23206->11779|23245->11808|23285->11809|23402->11888|23417->11892|23444->11895|23536->11949|23551->11953|23580->11958|23625->11969|23671->11979|23717->12008|23758->12010|23902->12117|23919->12124|23945->12127|24040->12184|24058->12191|24088->12197|24130->12201|24148->12208|24176->12212|24247->12251|24322->12294|24488->12413|24554->12432|24606->12437|24699->12482|24801->12536|24903->12590|24987->12626|25087->12679|25176->12721|25231->12728|25315->12764|25416->12818|25513->12868|25623->12930|25841->13100|25924->13136|25976->13141|26071->13188|26177->13246|26507->13528|26767->13741|26820->13747|26872->13752|26989->13821|27091->13875|27190->13927|27246->13936|27301->13944|27351->13947|27439->13987|27618->14118|27790->14242|28037->14442|28139->14496|28376->14686|28429->14692|28484->14699|28649->14816|28880->15000|28978->15050|29205->15230|29258->15236|29308->15239|29408->15292|29468->15304|29533->15332|29549->15338|29607->15373|29669->15387|29785->15455|29901->15523|29984->15559|30037->15565|30089->15570|30190->15624|30250->15636|30315->15664|30331->15670|30392->15708|30454->15722|30573->15793|30689->15861|30775->15900|30828->15906|30880->15911|30929->15928
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|39->10|39->10|39->10|42->13|42->13|42->13|43->14|43->14|43->14|45->16|45->16|45->16|46->17|46->17|46->17|47->18|49->20|49->20|49->20|54->25|54->25|54->25|55->26|55->26|55->26|55->26|55->26|55->26|55->26|55->26|55->26|56->27|59->30|59->30|59->30|60->31|60->31|60->31|62->33|63->34|63->34|63->34|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|65->36|66->37|70->41|70->41|70->41|71->42|71->42|71->42|72->43|72->43|72->43|73->44|73->44|73->44|75->46|75->46|75->46|76->47|76->47|76->47|77->48|79->50|79->50|79->50|80->51|80->51|80->51|81->52|81->52|81->52|82->53|82->53|82->53|82->53|82->53|82->53|83->54|83->54|83->54|84->55|84->55|84->55|84->55|84->55|84->55|85->56|87->58|88->59|88->59|88->59|89->60|89->60|89->60|90->61|90->61|90->61|90->61|90->61|90->61|90->61|90->61|90->61|91->62|91->62|91->62|92->63|92->63|92->63|92->63|92->63|92->63|92->63|92->63|92->63|93->64|94->65|95->66|97->68|101->72|101->72|101->72|101->72|103->74|103->74|103->74|104->75|104->75|104->75|105->76|105->76|105->76|106->77|107->78|107->78|107->78|108->79|108->79|108->79|109->80|110->81|148->119|155->126|156->127|160->131|163->134|166->137|167->138|171->142|172->143|177->148|178->149|183->154|184->155|188->159|189->160|194->165|195->166|200->171|201->172|206->177|208->179|210->181|211->182|213->184|214->185|216->187|218->189|222->193|225->196|226->197|229->200|230->201|231->202|232->203|235->206|236->207|237->208|240->211|243->214|245->216|246->217|247->218|248->219|252->223|256->227|257->228|258->229|260->231|262->233|263->234|265->236|265->236|267->238|268->239|270->241|273->244|276->247|279->250|281->252|281->252|281->252|282->253|282->253|284->255|286->257|287->258|288->259|291->262|296->267|298->269|299->270|299->270|300->271|303->274|304->275|307->278|308->279|309->280|310->281|313->284|314->285|315->286|317->288|319->290|320->291|330->301|330->301|340->311|342->313|344->315|346->317|348->319|350->321|352->323|353->324|355->326|355->326|357->328|358->329|359->330|361->332|364->335|366->337|368->339|370->341|373->344|375->346|381->352|384->355|386->357|387->358|390->361|391->362|393->364|393->364|393->364|394->365|394->365|396->367|398->369|399->370|400->371|403->374|404->375|406->377|406->377|406->377|407->378|407->378|409->380|411->382|412->383|413->384|416->387|417->388|419->390|419->390|419->390|420->391|420->391|422->393|429->400|429->400|429->400|430->401|430->401|430->401|430->401|430->401|430->401|430->401|430->401|430->401|430->401|431->402|431->402|431->402|432->403|432->403|432->403|432->403|432->403|432->403|432->403|432->403|432->403|433->404|434->405|439->410|440->411|441->412|444->415|445->416|446->417|447->418|449->420|451->422|451->422|452->423|454->425|456->427|458->429|462->433|464->435|465->436|466->437|467->438|471->442|475->446|476->447|477->448|479->450|481->452|483->454|484->455|485->456|486->457|494->465|498->469|500->471|504->475|505->476|509->480|510->481|510->481|513->484|517->488|518->489|522->493|523->494|524->495|527->498|528->499|530->501|530->501|530->501|531->502|531->502|533->504|535->506|536->507|537->508|540->511|541->512|543->514|543->514|543->514|544->515|544->515|546->517|548->519|549->520|550->521|556->527
                    -- GENERATED --
                */
            