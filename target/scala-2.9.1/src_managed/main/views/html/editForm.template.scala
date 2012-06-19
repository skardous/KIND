
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
	Description : <i>"""),_display_(Seq[Any](/*15.20*/event/*15.25*/.descriptif)),format.raw/*15.36*/("""</i> <br/>			
	



	<table class="datesTable" cellspacing="5" cellpadding="5">
		<tbody>
			<tr class="titres" style="display:none"><td style="visibility:hidden"></td>
				"""),_display_(Seq[Any](/*23.6*/for(jour <- event.jours) yield /*23.30*/ {_display_(Seq[Any](format.raw/*23.32*/("""  					  
					<td id=""""),_display_(Seq[Any](/*24.15*/jour/*24.19*/.id)),format.raw/*24.22*/("""" class="jour" colspan=""""),_display_(Seq[Any](/*24.47*/jour/*24.51*/.horaires.size())),format.raw/*24.67*/(""""><b>"""),_display_(Seq[Any](/*24.73*/jour/*24.77*/.date)),format.raw/*24.82*/("""</b></td>	                        	                
				""")))})),format.raw/*25.6*/("""
			</tr>
			<tr class="titres" style="display:none"><td style="visibility:hidden"></td>
				"""),_display_(Seq[Any](/*28.6*/for(jour <- event.jours) yield /*28.30*/ {_display_(Seq[Any](format.raw/*28.32*/("""  
				  """),_display_(Seq[Any](/*29.8*/if(jour.horaires.size() == 0)/*29.37*/{_display_(Seq[Any](format.raw/*29.38*/("""
				    <td class="jour"></td>
				  """)))})),format.raw/*31.8*/("""
				     """),_display_(Seq[Any](/*32.11*/for(horaire <- jour.horaires) yield /*32.40*/ {_display_(Seq[Any](format.raw/*32.42*/("""
				    	 <td id=""""),_display_(Seq[Any](/*33.20*/horaire/*33.27*/.id)),format.raw/*33.30*/("""" day=""""),_display_(Seq[Any](/*33.38*/jour/*33.42*/.date)),format.raw/*33.47*/("""" class="horaire">"""),_display_(Seq[Any](/*33.66*/horaire/*33.73*/.debut)),format.raw/*33.79*/(""" - """),_display_(Seq[Any](/*33.83*/horaire/*33.90*/.fin)),format.raw/*33.94*/("""</td>
				     """)))})),format.raw/*34.11*/("""            	                
				""")))})),format.raw/*35.6*/("""
			</tr>
			              
			
			"""),_display_(Seq[Any](/*39.5*/for(participant <- event.participants) yield /*39.43*/ {_display_(Seq[Any](format.raw/*39.45*/("""
				<tr id=""""),_display_(Seq[Any](/*40.14*/participant/*40.25*/.getId())),format.raw/*40.33*/(""""><td class="infoPersonne">
					"""),_display_(Seq[Any](/*41.7*/form(routes.Application.updatePersonne(event.id), 'id->"formPersonne")/*41.77*/ {_display_(Seq[Any](format.raw/*41.79*/("""
						<input id="nom" type="text" value=""""),_display_(Seq[Any](/*42.43*/participant/*42.54*/.getNom())),format.raw/*42.63*/("""" name="nom" readonly="readonly">	
					
						<a id=""""),_display_(Seq[Any](/*44.15*/participant/*44.26*/.getId())),format.raw/*44.34*/("""" class="editPersonne btn btn-info">Editer</a>
						<a id=""""),_display_(Seq[Any](/*45.15*/participant/*45.26*/.getId())),format.raw/*45.34*/("""" class="deletePersonne btn btn-danger"> Supprimer</a>
					""")))})),format.raw/*46.7*/("""</td>
					
					"""),_display_(Seq[Any](/*48.7*/for(jour <- event.jours) yield /*48.31*/ {_display_(Seq[Any](format.raw/*48.33*/("""
					    """),_display_(Seq[Any](/*49.11*/if(jour.horaires.size() == 0)/*49.40*/{_display_(Seq[Any](format.raw/*49.41*/("""
					      """),_display_(Seq[Any](/*50.13*/if(participant.inscriptionsJours.contains(jour))/*50.61*/ {_display_(Seq[Any](format.raw/*50.63*/("""
			                <td class="checktd"><input id=""""),_display_(Seq[Any](/*51.52*/jour/*51.56*/.id)),format.raw/*51.59*/("""" type="checkbox"  disabled checked class="jour checkbox" value=""""),_display_(Seq[Any](/*51.125*/jour/*51.129*/.date)),format.raw/*51.134*/("""" /></td>
			              """)))}/*52.20*/else/*52.25*/{_display_(Seq[Any](format.raw/*52.26*/("""
			                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*53.53*/jour/*53.57*/.id)),format.raw/*53.60*/("""" type="checkbox"  disabled class="jour checkbox" value=""""),_display_(Seq[Any](/*53.118*/jour/*53.122*/.date)),format.raw/*53.127*/("""" /></td>
			              """)))})),format.raw/*54.19*/("""
					       
					    """)))})),format.raw/*56.11*/("""
			            """),_display_(Seq[Any](/*57.17*/for(horaire <- jour.horaires) yield /*57.46*/ {_display_(Seq[Any](format.raw/*57.48*/("""
			              """),_display_(Seq[Any](/*58.19*/if(participant.inscriptionsHoraires.contains(horaire))/*58.73*/ {_display_(Seq[Any](format.raw/*58.75*/("""
			                <td class="checktd"><input id=""""),_display_(Seq[Any](/*59.52*/horaire/*59.59*/.id)),format.raw/*59.62*/("""" type="checkbox" disabled class="horaire checkbox"  checked value=""""),_display_(Seq[Any](/*59.131*/horaire/*59.138*/.debut)),format.raw/*59.144*/(""" - """),_display_(Seq[Any](/*59.148*/horaire/*59.155*/.fin)),format.raw/*59.159*/("""" /></td>
			              """)))}/*60.20*/else/*60.25*/{_display_(Seq[Any](format.raw/*60.26*/("""
			                 <td class="checktd"><input id=""""),_display_(Seq[Any](/*61.53*/horaire/*61.60*/.id)),format.raw/*61.63*/("""" type="checkbox" disabled class="horaire checkbox" value=""""),_display_(Seq[Any](/*61.123*/horaire/*61.130*/.debut)),format.raw/*61.136*/(""" - """),_display_(Seq[Any](/*61.140*/horaire/*61.147*/.fin)),format.raw/*61.151*/("""" /></td>
			              """)))})),format.raw/*62.19*/("""
			            """)))})),format.raw/*63.17*/("""            	                
			        """)))})),format.raw/*64.13*/("""				
				</tr>
			""")))})),format.raw/*66.5*/("""
		</tbody>
		<tfoot>
		<tr id="compte" >
			<td id=""><b>Compte: </b></td>
			"""),_display_(Seq[Any](/*71.5*/for(jour <- event.jours) yield /*71.29*/ {_display_(Seq[Any](format.raw/*71.31*/("""
			    """),_display_(Seq[Any](/*72.9*/if(jour.horaires.size() == 0)/*72.38*/{_display_(Seq[Any](format.raw/*72.39*/("""		     
	                <td id=""""),_display_(Seq[Any](/*73.27*/jour/*73.31*/.id)),format.raw/*73.34*/("""" class="jour">0</td>	       
			    """)))})),format.raw/*74.9*/("""
	            """),_display_(Seq[Any](/*75.15*/for(horaire <- jour.horaires) yield /*75.44*/ {_display_(Seq[Any](format.raw/*75.46*/("""              
	                <td id=""""),_display_(Seq[Any](/*76.27*/horaire/*76.34*/.id)),format.raw/*76.37*/("""" class="horaire">0</td>              
	            """)))})),format.raw/*77.15*/("""
			""")))})),format.raw/*78.5*/("""
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
	<textarea id="mailsArea" rows="4" style="color:grey">Entrez ici les adresses mail séparées par une virgule ...</textarea>
	<a id="envoiLien" class="btn btn-primary">Envoyer Lien</a>
	</div>

	<script type="text/javascript" charset="utf-8">
	
	var color1 = "#FFFF99";
	var color2 = "gold";
	var color3 = "steelblue";

	$("table.datesTable td").css("background-color", color3);

	$(function()"""),format.raw("""{"""),format.raw/*113.15*/(""" 
		$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*114.37*/("""
		  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*115.34*/("""
		  		$(this).parent().css("background-color", "#66CC99");
		  	"""),format.raw("""}"""),format.raw/*117.7*/("""
		"""),format.raw("""}"""),format.raw/*118.4*/(""");

		$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*120.41*/("""
		  	$('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*122.4*/(""");



		$('input[type="checkbox"]').each(function(i) """),format.raw("""{"""),format.raw/*126.49*/("""
			var iden = $(this).attr('id');

			if ($(this).attr('class') == 'horaire checkbox') """),format.raw("""{"""),format.raw/*129.54*/("""
				if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*130.33*/("""
			    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
					increment.html(parseInt(increment.html())+1);
				"""),format.raw("""}"""),format.raw/*133.6*/("""
			"""),format.raw("""}"""),format.raw/*134.5*/("""
			if ($(this).attr('class') == 'jour checkbox') """),format.raw("""{"""),format.raw/*135.51*/("""
				if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*136.33*/("""
			    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
					increment.html(parseInt(increment.html())+1);
				"""),format.raw("""}"""),format.raw/*139.6*/("""
			"""),format.raw("""}"""),format.raw/*140.5*/("""
		"""),format.raw("""}"""),format.raw/*141.4*/(""");

		var max = 0;
		$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*144.45*/("""
			$(this).css("background-color", color1) //gris
			$('.titres').children().css("background-color",color1);		
			if ($(this).html() > max) """),format.raw("""{"""),format.raw/*147.31*/("""			
				max = $(this).html();
			"""),format.raw("""}"""),format.raw/*149.5*/("""
		"""),format.raw("""}"""),format.raw/*150.4*/(""")
		$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*151.45*/("""		
			if ($(this).html() == max && $(this).html() != 0) """),format.raw("""{"""),format.raw/*152.55*/("""			
				$(this).css("background-color", color2);
				
				$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", color2);
				if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*156.45*/("""
					var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
					$("td:contains('"+day+"')").css("background-color", color2);
					
				"""),format.raw("""}"""),format.raw/*160.6*/("""
			"""),format.raw("""}"""),format.raw/*161.5*/("""
		"""),format.raw("""}"""),format.raw/*162.4*/(""")
	  
	"""),format.raw("""}"""),format.raw/*164.3*/(""");

	$("textarea").live('click', function(e) """),format.raw("""{"""),format.raw/*166.43*/("""
		$(this).html("");
		$(this).removeAttr("style");
	"""),format.raw("""}"""),format.raw/*169.3*/(""")


	$('#envoiLien').live('click', function(e) """),format.raw("""{"""),format.raw/*172.45*/("""
	  var mailsList = $("#mailsArea").val();
	  
		$.ajax("""),format.raw("""{"""),format.raw/*175.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*177.11*/routes/*177.17*/.Application.sendMail(event.id))),format.raw/*177.48*/("""",
			data: '"""),format.raw("""{"""),format.raw/*178.12*/(""""mailslist" : "' + mailsList + '""""),format.raw("""}"""),format.raw/*178.46*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*180.30*/("""
			  alert("Mail(s) envoye(s) a "+mailsList);
			"""),format.raw("""}"""),format.raw/*182.5*/("""
	   """),format.raw("""}"""),format.raw/*183.6*/(""");
	"""),format.raw("""}"""),format.raw/*184.3*/(""");
		  
		  
	$('.deletePersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*187.50*/("""    
	    $(this).parent().parent().parent().remove();
	    
	    
	    deletePersonne($(this).attr('id'));
	    if($('td[class="infoPersonne"]').html() == null) """),format.raw("""{"""),format.raw/*192.56*/("""
	    	$('.titres').attr('style','display:none');
	    """),format.raw("""}"""),format.raw/*194.7*/("""
	    $('#compte').children('td[id!=""]').each(function(i) """),format.raw("""{"""),format.raw/*195.60*/("""$(this).html("0")"""),format.raw("""}"""),format.raw/*195.78*/(""");
	    $('input[type="checkbox"]').each(function(i) """),format.raw("""{"""),format.raw/*196.52*/("""
	    var iden = $(this).attr('id');
	  
	    if ($(this).attr('class') == 'horaire checkbox') """),format.raw("""{"""),format.raw/*199.56*/("""
	    	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*200.35*/("""
		    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
	    	"""),format.raw("""}"""),format.raw/*203.8*/("""
	    """),format.raw("""}"""),format.raw/*204.7*/("""
	    if ($(this).attr('class') == 'jour checkbox') """),format.raw("""{"""),format.raw/*205.53*/("""
	    	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*206.35*/("""
		    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
	    	"""),format.raw("""}"""),format.raw/*209.8*/("""
	    """),format.raw("""}"""),format.raw/*210.7*/("""
	  """),format.raw("""}"""),format.raw/*211.5*/(""");
	    
	"""),format.raw("""}"""),format.raw/*213.3*/(""")

	$('.editPersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*215.48*/("""
	    if($(this).html() == "Editer")  """),format.raw("""{"""),format.raw/*216.39*/("""
	      $(this).html("OK");
	      $(this).attr("class", "editPersonne btn btn-success");
	      $(this).siblings("input").removeAttr("readonly");
	      $(this).parent().parent().parent().children("td").children().removeAttr("disabled");
	      $(this).parent().parent().parent().children("td").css("border", "solid black 2px");
	      $(".hoverable").off();
	      $(".hoverable").off();
	      $(this).parent().parent().parent().children(".checktd").attr("class", "checktd hoverable");
	      refreshHoverable();
	    """),format.raw("""}"""),format.raw/*226.7*/(""" else """),format.raw("""{"""),format.raw/*226.14*/("""
	      $(this).html("Editer");
	      $(this).attr("class", "editPersonne btn btn-info");
	      $(this).siblings("input").attr("readonly", "readonly");
	      $(this).parent().parent().parent().children("td").children('input[type="checkbox"]').attr("disabled","true"); 
	      $(this).parent().parent().parent().children("td").css("border", "none");
	      $(".hoverable").off();	      
	      $(this).parent().parent().parent().children(".checktd").attr("class", "checktd");
	      refreshHoverable();
	      editPersonne($(this).attr('id'), $(this).siblings("input").attr("value"));
	    """),format.raw("""}"""),format.raw/*236.7*/("""
	  
	"""),format.raw("""}"""),format.raw/*238.3*/(""")
	
	function refreshHoverable() """),format.raw("""{"""),format.raw/*240.31*/("""
		
		$(".hoverable").on("""),format.raw("""{"""),format.raw/*242.23*/("""

			mouseenter: function () """),format.raw("""{"""),format.raw/*244.29*/("""
				$(this).css("background-color", "lightgreen");
			"""),format.raw("""}"""),format.raw/*246.5*/(""", 

			mouseleave: function () """),format.raw("""{"""),format.raw/*248.29*/("""
				if ($(this).children().is(':checked'))"""),format.raw("""{"""),format.raw/*249.44*/("""	 
			    	$(this).css("background-color", "#66CC99");
			    """),format.raw("""}"""),format.raw/*251.9*/(""" else """),format.raw("""{"""),format.raw/*251.16*/("""
			    	$(this).css("background-color", color3);
			    """),format.raw("""}"""),format.raw/*253.9*/("""
			"""),format.raw("""}"""),format.raw/*254.5*/("""
		"""),format.raw("""}"""),format.raw/*255.4*/(""");

	"""),format.raw("""}"""),format.raw/*257.3*/("""




	$("#ajouter").live('click', function(e)"""),format.raw("""{"""),format.raw/*262.42*/("""
	  
	    envoiPersonne($("#champ"));	    

	    
	"""),format.raw("""}"""),format.raw/*267.3*/(""");




	function envoiPersonne(self)
	"""),format.raw("""{"""),format.raw/*273.3*/("""
	    var vide = "";
	    var nom = self.attr("value");
	    if (vide != nom) """),format.raw("""{"""),format.raw/*276.24*/("""      
			addPersonne($("#champ").attr('value'));			
		"""),format.raw("""}"""),format.raw/*278.4*/("""
	"""),format.raw("""}"""),format.raw/*279.3*/("""

	function editPersonne(personneId, personneNom)
	"""),format.raw("""{"""),format.raw/*282.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*283.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*285.11*/routes/*285.17*/.Application.updatePersonne(event.id))),format.raw/*285.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*286.12*/(""""id" : "' + personneId + '", "nom" : "' + personneNom + '""""),format.raw("""}"""),format.raw/*286.71*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*288.30*/("""
			  //alert("Participant edit\351");
			"""),format.raw("""}"""),format.raw/*290.5*/("""
	  """),format.raw("""}"""),format.raw/*291.5*/(""");
	"""),format.raw("""}"""),format.raw/*292.3*/("""

	function deletePersonne(persId)
	"""),format.raw("""{"""),format.raw/*295.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*296.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*298.11*/routes/*298.17*/.Application.deleteParticipant(event.id))),format.raw/*298.57*/("""",
			data: '"""),format.raw("""{"""),format.raw/*299.12*/(""""id" : "' + persId + '""""),format.raw("""}"""),format.raw/*299.36*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*301.30*/("""
			  //alert("Participant supprim\351");
			"""),format.raw("""}"""),format.raw/*303.5*/("""
	  """),format.raw("""}"""),format.raw/*304.5*/(""");
	"""),format.raw("""}"""),format.raw/*305.3*/("""

	function addPersonne(nomParticipant)
	"""),format.raw("""{"""),format.raw/*308.3*/("""	
		$.ajax("""),format.raw("""{"""),format.raw/*309.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*311.11*/routes/*311.17*/.Application.addParticipant(event.id))),format.raw/*311.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*312.12*/(""""nom" : "' + nomParticipant + '""""),format.raw("""}"""),format.raw/*312.45*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*314.30*/("""		  
				$("tbody").append("<tr id=\""+data.idPersonne+"\"><td class=\"infoPersonne\">"+
					"<form id=\"formPersonne\">"+
					"<input id=\"nom\" type=\"text\" value=\""+nomParticipant+"\" name=\"nom\" readonly=\"readonly\">&nbsp;"+
					"<a id=\""+data.idPersonne+"\" class=\"editPersonne btn btn-success\">OK</a>&nbsp;"+
					"<a id=\""+data.idPersonne+"\" class=\"deletePersonne btn btn-danger\">Supprimer</a>"+				  
					"</form></td>"+
					""""),_display_(Seq[Any](/*321.8*/for(jour <- event.jours) yield /*321.32*/ {_display_(Seq[Any](format.raw/*321.34*/(""""+  
					""""),_display_(Seq[Any](/*322.8*/if(jour.horaires.size() == 0)/*322.37*/{_display_(Seq[Any](format.raw/*322.38*/("""<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*322.117*/jour/*322.121*/.id)),format.raw/*322.124*/("""\" type=\"checkbox\" class=\"jour checkbox\" value=\""""),_display_(Seq[Any](/*322.178*/jour/*322.182*/.date)),format.raw/*322.187*/("""\" /></td>""")))})),format.raw/*322.198*/(""""+
					""""),_display_(Seq[Any](/*323.8*/for(horaire <- jour.horaires) yield /*323.37*/ {_display_(Seq[Any](format.raw/*323.39*/(""""+	                		
					"<td class=\"checktd hoverable\" style=\"border: solid black 2px\"><input id=\""""),_display_(Seq[Any](/*324.86*/horaire/*324.93*/.id)),format.raw/*324.96*/("""\" type=\"checkbox\" class=\"horaire checkbox\" value=\""""),_display_(Seq[Any](/*324.153*/horaire/*324.160*/.debut)),format.raw/*324.166*/(""" - """),_display_(Seq[Any](/*324.170*/horaire/*324.177*/.fin)),format.raw/*324.181*/("""\" /></td>"+			                
					"""")))})),format.raw/*325.8*/(""""+                	                
					"""")))})),format.raw/*326.8*/("""" +
					"</tr>")
				$('#champ').attr('value', '')
				$('.titres').attr('style','');
				refreshHoverable();
			"""),format.raw("""}"""),format.raw/*331.5*/("""               
		"""),format.raw("""}"""),format.raw/*332.4*/(""");
	"""),format.raw("""}"""),format.raw/*333.3*/("""


	$('.checktd').live('click', function(e) """),format.raw("""{"""),format.raw/*336.43*/("""
		if ($(this).children().prop("disabled") == false) """),format.raw("""{"""),format.raw/*337.54*/("""
			if ($(this).children().prop("checked") == false) """),format.raw("""{"""),format.raw/*338.54*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*339.36*/("""
					$(this).children().prop("checked", true);
				"""),format.raw("""}"""),format.raw/*341.6*/("""
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*343.5*/(""" else """),format.raw("""{"""),format.raw/*343.12*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*344.36*/("""
					$(this).children().prop("checked", false);
				"""),format.raw("""}"""),format.raw/*346.6*/("""        
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*348.5*/("""
			var max = 0;
			$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*350.46*/("""
				$(this).css("background-color", color1) //gris
				$('.titres').children().css("background-color",color1);
				$('.footer').html("");
				if ($(this).html() > max) """),format.raw("""{"""),format.raw/*354.32*/("""			
					max = $(this).html();
				"""),format.raw("""}"""),format.raw/*356.6*/("""
			"""),format.raw("""}"""),format.raw/*357.5*/(""")
			$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*358.46*/("""		
				if ($(this).html() == max && $(this).html() != 0) """),format.raw("""{"""),format.raw/*359.56*/("""			
					$(this).css("background-color", color2);
					//alert("classe : "+$(this).attr("class")+" id : "+$(this).attr("id"));
					$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", color2);
					if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*363.46*/("""
						var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
						$("td:contains('"+day+"')").css("background-color", color2);
						//$('.footer').append(day);
					"""),format.raw("""}"""),format.raw/*367.7*/("""
				"""),format.raw("""}"""),format.raw/*368.6*/("""
			"""),format.raw("""}"""),format.raw/*369.5*/(""")
			$('.populaires').html("");
			$('.titres td').each( function() """),format.raw("""{"""),format.raw/*371.38*/("""

				if ($(this).css('background-color') == color2) """),format.raw("""{"""),format.raw/*373.53*/("""
					$('.populaires').append($(this).html());
				"""),format.raw("""}"""),format.raw/*375.6*/("""				
			"""),format.raw("""}"""),format.raw/*376.5*/(""")
			
		"""),format.raw("""}"""),format.raw/*378.4*/("""
	"""),format.raw("""}"""),format.raw/*379.3*/(""");


	

 


	function changeCheck(box) """),format.raw("""{"""),format.raw/*387.29*/("""   
	   var idtime = box.attr('id');
	   var idParticipant = box.parent().parent().attr('id');   
	   
	   if (box.is(':checked'))"""),format.raw("""{"""),format.raw/*391.29*/("""	   		
	       		box.parent().css("background-color", "#66CC99")//vert
		   		if (box.attr('class') == 'horaire checkbox') """),format.raw("""{"""),format.raw/*393.54*/("""
		           var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			   	   increment.html(parseInt(increment.html())+1);
		       	   requeteAjaxHeure(idtime, idParticipant);
			    """),format.raw("""}"""),format.raw/*397.9*/("""
	       		if (box.attr('class') == 'jour checkbox') """),format.raw("""{"""),format.raw/*398.54*/("""	
	    	   	   var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			   	   increment.html(parseInt(increment.html())+1);
				   requeteAjaxJour(idtime, idParticipant);
			   """),format.raw("""}"""),format.raw/*402.8*/("""
	   """),format.raw("""}"""),format.raw/*403.6*/(""" else """),format.raw("""{"""),format.raw/*403.13*/("""
	     
	     box.parent().css("background-color", color1)//gris
	     if (box.attr('class') == 'horaire checkbox') """),format.raw("""{"""),format.raw/*406.53*/("""
		     var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
		     increment.html(parseInt(increment.html())-1);
		     requeteAjaxHeure(idtime, idParticipant);
	     """),format.raw("""}"""),format.raw/*410.8*/("""
	     if (box.attr('class') == 'jour checkbox') """),format.raw("""{"""),format.raw/*411.50*/("""
	        var increment = $('#compte').children('.jour[id="'+idtime+'"]');
		    increment.html(parseInt(increment.html())-1);
		    requeteAjaxJour(idtime, idParticipant);
	     """),format.raw("""}"""),format.raw/*415.8*/("""
	   """),format.raw("""}"""),format.raw/*416.6*/("""
	   
	   
	"""),format.raw("""}"""),format.raw/*419.3*/("""

	function requeteAjaxJour(idtime, idParticipant)
	"""),format.raw("""{"""),format.raw/*422.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*423.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*425.11*/routes/*425.17*/.Application.checkBoxJour(event.id))),format.raw/*425.52*/("""",
			data: '"""),format.raw("""{"""),format.raw/*426.12*/(""""idjour" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*426.80*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*428.30*/("""
			  //alert("Jour edit\351");
			"""),format.raw("""}"""),format.raw/*430.5*/("""
	   """),format.raw("""}"""),format.raw/*431.6*/(""");
	"""),format.raw("""}"""),format.raw/*432.3*/("""

	function requeteAjaxHeure(idtime, idParticipant)
	"""),format.raw("""{"""),format.raw/*435.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*436.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*438.11*/routes/*438.17*/.Application.checkBoxHoraire(event.id))),format.raw/*438.55*/("""",
			data: '"""),format.raw("""{"""),format.raw/*439.12*/(""""idhoraire" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*439.83*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*441.30*/("""
			  //alert("Horaire edit\351");
			"""),format.raw("""}"""),format.raw/*443.5*/("""
	   """),format.raw("""}"""),format.raw/*444.6*/(""");
	"""),format.raw("""}"""),format.raw/*445.3*/("""



	</script>

""")))})),format.raw/*451.2*/("""
"""))}
    }
    
    def render(event:Evenement) = apply(event)
    
    def f:((Evenement) => play.api.templates.Html) = (event) => apply(event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 19 11:17:24 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/editForm.scala.html
                    HASH: 12ea0f2a652c99650682d8ef2974e62266e87e09
                    MATRIX: 761->1|864->40|896->64|980->19|1008->38|1036->118|1075->123|1110->150|1149->152|1212->179|1226->184|1254->190|1339->239|1353->244|1381->250|1451->284|1465->289|1496->298|1562->328|1576->333|1609->344|1817->517|1857->541|1897->543|1957->567|1970->571|1995->574|2056->599|2069->603|2107->619|2149->625|2162->629|2189->634|2277->691|2406->785|2446->809|2486->811|2531->821|2569->850|2608->851|2678->890|2725->901|2770->930|2810->932|2866->952|2882->959|2907->962|2951->970|2964->974|2991->979|3046->998|3062->1005|3090->1011|3130->1015|3146->1022|3172->1026|3220->1042|3286->1077|3357->1113|3411->1151|3451->1153|3501->1167|3521->1178|3551->1186|3620->1220|3699->1290|3739->1292|3818->1335|3838->1346|3869->1355|3960->1410|3980->1421|4010->1429|4107->1490|4127->1501|4157->1509|4249->1570|4302->1588|4342->1612|4382->1614|4429->1625|4467->1654|4506->1655|4555->1668|4612->1716|4652->1718|4740->1770|4753->1774|4778->1777|4881->1843|4895->1847|4923->1852|4970->1881|4983->1886|5022->1887|5111->1940|5124->1944|5149->1947|5244->2005|5258->2009|5286->2014|5346->2042|5402->2066|5455->2083|5500->2112|5540->2114|5595->2133|5658->2187|5698->2189|5786->2241|5802->2248|5827->2251|5933->2320|5950->2327|5979->2333|6020->2337|6037->2344|6064->2348|6111->2377|6124->2382|6163->2383|6252->2436|6268->2443|6293->2446|6390->2506|6407->2513|6436->2519|6477->2523|6494->2530|6521->2534|6581->2562|6630->2579|6704->2621|6754->2640|6869->2720|6909->2744|6949->2746|6993->2755|7031->2784|7070->2785|7140->2819|7153->2823|7178->2826|7247->2864|7298->2879|7343->2908|7383->2910|7460->2951|7476->2958|7501->2961|7586->3014|7622->3019|8440->3789|8526->3827|8608->3861|8721->3927|8772->3931|8864->3975|8951->4015|9053->4069|9190->4158|9271->4191|9449->4322|9501->4327|9600->4378|9681->4411|9856->4539|9908->4544|9959->4548|10070->4611|10260->4753|10341->4787|10392->4791|10486->4837|10591->4894|10846->5101|11075->5283|11127->5288|11178->5292|11233->5300|11327->5346|11428->5400|11524->5448|11629->5505|11694->5533|11710->5539|11764->5570|11826->5584|11908->5618|12024->5686|12122->5737|12175->5743|12227->5748|12337->5810|12548->5973|12651->6029|12759->6089|12825->6107|12927->6161|13071->6257|13154->6292|13332->6423|13386->6430|13487->6483|13570->6518|13745->6646|13799->6653|13851->6658|13909->6669|14007->6719|14094->6758|14663->7280|14718->7287|15358->7880|15412->7887|15494->7921|15568->7947|15646->7977|15749->8033|15829->8065|15921->8109|16031->8172|16086->8179|16191->8237|16243->8242|16294->8246|16347->8252|16441->8298|16540->8350|16626->8389|16753->8468|16856->8524|16906->8527|17005->8579|17065->8591|17130->8619|17146->8625|17206->8662|17268->8676|17375->8735|17491->8803|17581->8846|17633->8851|17685->8856|17769->8893|17829->8905|17894->8933|17910->8939|17973->8979|18035->8993|18107->9017|18223->9085|18316->9131|18368->9136|18420->9141|18509->9183|18569->9195|18634->9223|18650->9229|18710->9266|18772->9280|18853->9313|18969->9381|19456->9832|19497->9856|19538->9858|19586->9870|19625->9899|19665->9900|19782->9979|19797->9983|19824->9986|19916->10040|19931->10044|19960->10049|20005->10060|20051->10070|20097->10099|20138->10101|20282->10208|20299->10215|20325->10218|20420->10275|20438->10282|20468->10288|20510->10292|20528->10299|20556->10303|20627->10342|20702->10385|20864->10500|20930->10519|20982->10524|21075->10569|21177->10623|21279->10677|21363->10713|21463->10766|21552->10808|21607->10815|21691->10851|21792->10905|21889->10955|21999->11017|22217->11187|22300->11223|22352->11228|22447->11275|22553->11333|22883->11615|23143->11828|23196->11834|23248->11839|23365->11908|23467->11962|23566->12014|23622->12023|23678->12032|23728->12035|23816->12075|23995->12206|24167->12330|24414->12530|24516->12584|24753->12774|24806->12780|24861->12787|25026->12904|25257->13088|25355->13138|25582->13318|25635->13324|25695->13337|25795->13390|25855->13402|25920->13430|25936->13436|25994->13471|26056->13485|26172->13553|26288->13621|26371->13657|26424->13663|26476->13668|26577->13722|26637->13734|26702->13762|26718->13768|26779->13806|26841->13820|26960->13891|27076->13959|27162->13998|27215->14004|27267->14009|27316->14026
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|39->10|39->10|39->10|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|52->23|52->23|52->23|53->24|53->24|53->24|53->24|53->24|53->24|53->24|53->24|53->24|54->25|57->28|57->28|57->28|58->29|58->29|58->29|60->31|61->32|61->32|61->32|62->33|62->33|62->33|62->33|62->33|62->33|62->33|62->33|62->33|62->33|62->33|62->33|63->34|64->35|68->39|68->39|68->39|69->40|69->40|69->40|70->41|70->41|70->41|71->42|71->42|71->42|73->44|73->44|73->44|74->45|74->45|74->45|75->46|77->48|77->48|77->48|78->49|78->49|78->49|79->50|79->50|79->50|80->51|80->51|80->51|80->51|80->51|80->51|81->52|81->52|81->52|82->53|82->53|82->53|82->53|82->53|82->53|83->54|85->56|86->57|86->57|86->57|87->58|87->58|87->58|88->59|88->59|88->59|88->59|88->59|88->59|88->59|88->59|88->59|89->60|89->60|89->60|90->61|90->61|90->61|90->61|90->61|90->61|90->61|90->61|90->61|91->62|92->63|93->64|95->66|100->71|100->71|100->71|101->72|101->72|101->72|102->73|102->73|102->73|103->74|104->75|104->75|104->75|105->76|105->76|105->76|106->77|107->78|142->113|143->114|144->115|146->117|147->118|149->120|151->122|155->126|158->129|159->130|162->133|163->134|164->135|165->136|168->139|169->140|170->141|173->144|176->147|178->149|179->150|180->151|181->152|185->156|189->160|190->161|191->162|193->164|195->166|198->169|201->172|204->175|206->177|206->177|206->177|207->178|207->178|209->180|211->182|212->183|213->184|216->187|221->192|223->194|224->195|224->195|225->196|228->199|229->200|232->203|233->204|234->205|235->206|238->209|239->210|240->211|242->213|244->215|245->216|255->226|255->226|265->236|267->238|269->240|271->242|273->244|275->246|277->248|278->249|280->251|280->251|282->253|283->254|284->255|286->257|291->262|296->267|302->273|305->276|307->278|308->279|311->282|312->283|314->285|314->285|314->285|315->286|315->286|317->288|319->290|320->291|321->292|324->295|325->296|327->298|327->298|327->298|328->299|328->299|330->301|332->303|333->304|334->305|337->308|338->309|340->311|340->311|340->311|341->312|341->312|343->314|350->321|350->321|350->321|351->322|351->322|351->322|351->322|351->322|351->322|351->322|351->322|351->322|351->322|352->323|352->323|352->323|353->324|353->324|353->324|353->324|353->324|353->324|353->324|353->324|353->324|354->325|355->326|360->331|361->332|362->333|365->336|366->337|367->338|368->339|370->341|372->343|372->343|373->344|375->346|377->348|379->350|383->354|385->356|386->357|387->358|388->359|392->363|396->367|397->368|398->369|400->371|402->373|404->375|405->376|407->378|408->379|416->387|420->391|422->393|426->397|427->398|431->402|432->403|432->403|435->406|439->410|440->411|444->415|445->416|448->419|451->422|452->423|454->425|454->425|454->425|455->426|455->426|457->428|459->430|460->431|461->432|464->435|465->436|467->438|467->438|467->438|468->439|468->439|470->441|472->443|473->444|474->445|480->451
                    -- GENERATED --
                */
            