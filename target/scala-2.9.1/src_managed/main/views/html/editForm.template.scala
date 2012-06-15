
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
					
						<a id=""""),_display_(Seq[Any](/*44.15*/participant/*44.26*/.getId())),format.raw/*44.34*/("""" class="editPersonne btn">Editer</a>
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
		<tr id="compte" style="display:none">
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

	Ajouter :		  
	<input id="champ" type="text" value="">&nbsp;<a id="ajouter" class="btn">Ajouter</a><br>

	<br>
	<h3>Inviter des personnes à l'évenement</h3>

	<div class="selectDate">
	<textarea id="mailsArea" rows="4" style="color:grey">Entrez ici les adresses mail séparées par une virgule ...</textarea>
	<a id="envoiLien" class="btn btn-info">Envoyer Lien</a>
	</div>

	<script type="text/javascript" charset="utf-8">


	$(function()"""),format.raw("""{"""),format.raw/*108.15*/(""" 
		$('.checkbox').each(function (i) """),format.raw("""{"""),format.raw/*109.37*/("""
		  	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*110.34*/("""
		  		$(this).parent().css("background-color", "#66CC99");
		  	"""),format.raw("""}"""),format.raw/*112.7*/("""
		"""),format.raw("""}"""),format.raw/*113.4*/(""");

		$('.infoPersonne').each(function (i) """),format.raw("""{"""),format.raw/*115.41*/("""
		  	$('.titres').attr('style','');
		"""),format.raw("""}"""),format.raw/*117.4*/(""");



		$('input[type="checkbox"]').each(function(i) """),format.raw("""{"""),format.raw/*121.49*/("""
			var iden = $(this).attr('id');

			if ($(this).attr('class') == 'horaire checkbox') """),format.raw("""{"""),format.raw/*124.54*/("""
				if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*125.33*/("""
			    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
					increment.html(parseInt(increment.html())+1);
				"""),format.raw("""}"""),format.raw/*128.6*/("""
			"""),format.raw("""}"""),format.raw/*129.5*/("""
			if ($(this).attr('class') == 'jour checkbox') """),format.raw("""{"""),format.raw/*130.51*/("""
				if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*131.33*/("""
			    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
					increment.html(parseInt(increment.html())+1);
				"""),format.raw("""}"""),format.raw/*134.6*/("""
			"""),format.raw("""}"""),format.raw/*135.5*/("""
		"""),format.raw("""}"""),format.raw/*136.4*/(""");

		var max = 0;
		$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*139.45*/("""
			$(this).css("background-color", "#A0A0A0") //gris
			$('.titres').children().css("background-color","#A0A0A0");		
			if ($(this).html() > max) """),format.raw("""{"""),format.raw/*142.31*/("""			
				max = $(this).html();
			"""),format.raw("""}"""),format.raw/*144.5*/("""
		"""),format.raw("""}"""),format.raw/*145.4*/(""")
		$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*146.45*/("""		
			if ($(this).html() == max && $(this).html() != 0) """),format.raw("""{"""),format.raw/*147.55*/("""			
				$(this).css("background-color", "black");
				//alert("classe : "+$(this).attr("class")+" id : "+$(this).attr("id"));
				$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", "black");
				if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*151.45*/("""
					var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
					$("td:contains('"+day+"')").css("background-color", "black");
					
				"""),format.raw("""}"""),format.raw/*155.6*/("""
			"""),format.raw("""}"""),format.raw/*156.5*/("""
		"""),format.raw("""}"""),format.raw/*157.4*/(""")
	  
	"""),format.raw("""}"""),format.raw/*159.3*/(""");

	$("textarea").live('click', function(e) """),format.raw("""{"""),format.raw/*161.43*/("""
		$(this).html("");
		$(this).removeAttr("style");
	"""),format.raw("""}"""),format.raw/*164.3*/(""")


	$('#envoiLien').live('click', function(e) """),format.raw("""{"""),format.raw/*167.45*/("""
	  var mailsList = $("#mailsArea").val();
	  
		$.ajax("""),format.raw("""{"""),format.raw/*170.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*172.11*/routes/*172.17*/.Application.sendMail(event.id))),format.raw/*172.48*/("""",
			data: '"""),format.raw("""{"""),format.raw/*173.12*/(""""mailslist" : "' + mailsList + '""""),format.raw("""}"""),format.raw/*173.46*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*175.30*/("""
			  alert("Mail(s) envoye(s) a "+mailsList);
			"""),format.raw("""}"""),format.raw/*177.5*/("""
	   """),format.raw("""}"""),format.raw/*178.6*/(""");
	"""),format.raw("""}"""),format.raw/*179.3*/(""");
		  
		  
	$('.deletePersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*182.50*/("""    
	    $(this).parent().parent().parent().remove();
	    
	    
	    deletePersonne($(this).attr('id'));
	    if($('td[class="infoPersonne"]').html() == null) """),format.raw("""{"""),format.raw/*187.56*/("""
	    	$('.titres').attr('style','display:none');
	    """),format.raw("""}"""),format.raw/*189.7*/("""
	    $('#compte').children('td[id!=""]').each(function(i) """),format.raw("""{"""),format.raw/*190.60*/("""$(this).html("0")"""),format.raw("""}"""),format.raw/*190.78*/(""");
	    $('input[type="checkbox"]').each(function(i) """),format.raw("""{"""),format.raw/*191.52*/("""
	    var iden = $(this).attr('id');
	  
	    if ($(this).attr('class') == 'horaire checkbox') """),format.raw("""{"""),format.raw/*194.56*/("""
	    	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*195.35*/("""
		    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
	    	"""),format.raw("""}"""),format.raw/*198.8*/("""
	    """),format.raw("""}"""),format.raw/*199.7*/("""
	    if ($(this).attr('class') == 'jour checkbox') """),format.raw("""{"""),format.raw/*200.53*/("""
	    	if ($(this).is(':checked'))"""),format.raw("""{"""),format.raw/*201.35*/("""
		    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
	    	"""),format.raw("""}"""),format.raw/*204.8*/("""
	    """),format.raw("""}"""),format.raw/*205.7*/("""
	  """),format.raw("""}"""),format.raw/*206.5*/(""");
	    
	"""),format.raw("""}"""),format.raw/*208.3*/(""")

	$('.editPersonne').live('click', function(e) """),format.raw("""{"""),format.raw/*210.48*/("""
	    if($(this).html() == "Editer")  """),format.raw("""{"""),format.raw/*211.39*/("""
	      $(this).html("OK");
	      $(this).attr("class", "editPersonne btn btn-success");
	      $(this).siblings("input").removeAttr("readonly");
	      $(this).parent().parent().parent().children("td").children().removeAttr("disabled");
	    """),format.raw("""}"""),format.raw/*216.7*/(""" else """),format.raw("""{"""),format.raw/*216.14*/("""
	      $(this).html("Editer");
	      $(this).attr("class", "editPersonne btn");
	      $(this).siblings("input").attr("readonly", "readonly");
	      $(this).parent().parent().parent().children("td").children('input[type="checkbox"]').attr("disabled","true"); 
	      editPersonne($(this).attr('id'), $(this).siblings("input").attr("value"));
	    """),format.raw("""}"""),format.raw/*222.7*/("""
	  
	"""),format.raw("""}"""),format.raw/*224.3*/(""")





	$("#ajouter").live('click', function(e)"""),format.raw("""{"""),format.raw/*230.42*/("""
	  
	    envoiPersonne($("#champ"));	    

	    
	"""),format.raw("""}"""),format.raw/*235.3*/(""");




	function envoiPersonne(self)
	"""),format.raw("""{"""),format.raw/*241.3*/("""
	    var vide = "";
	    var nom = self.attr("value");
	    if (vide != nom) """),format.raw("""{"""),format.raw/*244.24*/("""      
			addPersonne($("#champ").attr('value'));			
		"""),format.raw("""}"""),format.raw/*246.4*/("""
	"""),format.raw("""}"""),format.raw/*247.3*/("""

	function editPersonne(personneId, personneNom)
	"""),format.raw("""{"""),format.raw/*250.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*251.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*253.11*/routes/*253.17*/.Application.updatePersonne(event.id))),format.raw/*253.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*254.12*/(""""id" : "' + personneId + '", "nom" : "' + personneNom + '""""),format.raw("""}"""),format.raw/*254.71*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*256.30*/("""
			  //alert("Participant edit\351");
			"""),format.raw("""}"""),format.raw/*258.5*/("""
	  """),format.raw("""}"""),format.raw/*259.5*/(""");
	"""),format.raw("""}"""),format.raw/*260.3*/("""

	function deletePersonne(persId)
	"""),format.raw("""{"""),format.raw/*263.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*264.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*266.11*/routes/*266.17*/.Application.deleteParticipant(event.id))),format.raw/*266.57*/("""",
			data: '"""),format.raw("""{"""),format.raw/*267.12*/(""""id" : "' + persId + '""""),format.raw("""}"""),format.raw/*267.36*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*269.30*/("""
			  //alert("Participant supprim\351");
			"""),format.raw("""}"""),format.raw/*271.5*/("""
	  """),format.raw("""}"""),format.raw/*272.5*/(""");
	"""),format.raw("""}"""),format.raw/*273.3*/("""

	function addPersonne(nomParticipant)
	"""),format.raw("""{"""),format.raw/*276.3*/("""	
		$.ajax("""),format.raw("""{"""),format.raw/*277.11*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*279.11*/routes/*279.17*/.Application.addParticipant(event.id))),format.raw/*279.54*/("""",
			data: '"""),format.raw("""{"""),format.raw/*280.12*/(""""nom" : "' + nomParticipant + '""""),format.raw("""}"""),format.raw/*280.45*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*282.30*/("""		  
				$("tbody").append("<tr id=\""+data.idPersonne+"\"><td class=\"infoPersonne\">"+
					"<form id=\"formPersonne\">"+
					"<input id=\"nom\" type=\"text\" value=\""+nomParticipant+"\" name=\"nom\" readonly=\"readonly\">&nbsp;"+
					"<a id=\""+data.idPersonne+"\" class=\"editPersonne btn btn-success\">OK</a>&nbsp;"+
					"<a id=\""+data.idPersonne+"\" class=\"deletePersonne btn btn-danger\">Supprimer<i class=\"mesicones icon-trash\"></i></a>"+				  
					"</form></td>"+
					""""),_display_(Seq[Any](/*289.8*/for(jour <- event.jours) yield /*289.32*/ {_display_(Seq[Any](format.raw/*289.34*/(""""+  
					""""),_display_(Seq[Any](/*290.8*/if(jour.horaires.size() == 0)/*290.37*/{_display_(Seq[Any](format.raw/*290.38*/("""<td class=\"checktd\"><input id=\""""),_display_(Seq[Any](/*290.73*/jour/*290.77*/.id)),format.raw/*290.80*/("""\" type=\"checkbox\" class=\"jour checkbox\" value=\""""),_display_(Seq[Any](/*290.134*/jour/*290.138*/.date)),format.raw/*290.143*/("""\" /></td>""")))})),format.raw/*290.154*/(""""+
					""""),_display_(Seq[Any](/*291.8*/for(horaire <- jour.horaires) yield /*291.37*/ {_display_(Seq[Any](format.raw/*291.39*/(""""+	                		
					"<td class=\"checktd\"><input id=\""""),_display_(Seq[Any](/*292.42*/horaire/*292.49*/.id)),format.raw/*292.52*/("""\" type=\"checkbox\" class=\"horaire checkbox\" value=\""""),_display_(Seq[Any](/*292.109*/horaire/*292.116*/.debut)),format.raw/*292.122*/(""" - """),_display_(Seq[Any](/*292.126*/horaire/*292.133*/.fin)),format.raw/*292.137*/("""\" /></td>"+			                
					"""")))})),format.raw/*293.8*/(""""+                	                
					"""")))})),format.raw/*294.8*/("""" +
					"</tr>")
				$('#champ').attr('value', '')
				$('.titres').attr('style','');
			"""),format.raw("""}"""),format.raw/*298.5*/("""               
		"""),format.raw("""}"""),format.raw/*299.4*/(""");
	"""),format.raw("""}"""),format.raw/*300.3*/("""


	$('.checktd').live('click', function(e) """),format.raw("""{"""),format.raw/*303.43*/("""
		if ($(this).children().prop("disabled") == false) """),format.raw("""{"""),format.raw/*304.54*/("""
			if ($(this).children().prop("checked") == false) """),format.raw("""{"""),format.raw/*305.54*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*306.36*/("""
					$(this).children().prop("checked", true);
				"""),format.raw("""}"""),format.raw/*308.6*/("""
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*310.5*/(""" else """),format.raw("""{"""),format.raw/*310.12*/("""
				if (e.target.nodeName == "TD")"""),format.raw("""{"""),format.raw/*311.36*/("""
					$(this).children().prop("checked", false);
				"""),format.raw("""}"""),format.raw/*313.6*/("""        
				changeCheck($(this).children());
			"""),format.raw("""}"""),format.raw/*315.5*/("""
			var max = 0;
			$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*317.46*/("""
				$(this).css("background-color", "#A0A0A0") //gris
				$('.titres').children().css("background-color","#A0A0A0");
				$('.footer').html("");
				if ($(this).html() > max) """),format.raw("""{"""),format.raw/*321.32*/("""			
					max = $(this).html();
				"""),format.raw("""}"""),format.raw/*323.6*/("""
			"""),format.raw("""}"""),format.raw/*324.5*/(""")
			$("#compte").children().each( function() """),format.raw("""{"""),format.raw/*325.46*/("""		
				if ($(this).html() == max && $(this).html() != 0) """),format.raw("""{"""),format.raw/*326.56*/("""			
					$(this).css("background-color", "black");
					//alert("classe : "+$(this).attr("class")+" id : "+$(this).attr("id"));
					$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", "black");
					if($(this).attr("class") == "horaire") """),format.raw("""{"""),format.raw/*330.46*/("""
						var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
						$("td:contains('"+day+"')").css("background-color", "black");
						//$('.footer').append(day);
					"""),format.raw("""}"""),format.raw/*334.7*/("""
				"""),format.raw("""}"""),format.raw/*335.6*/("""
			"""),format.raw("""}"""),format.raw/*336.5*/(""")
			$('.populaires').html("");
			$('.titres td').each( function() """),format.raw("""{"""),format.raw/*338.38*/("""

				if ($(this).css('background-color') == "black") """),format.raw("""{"""),format.raw/*340.54*/("""
					$('.populaires').append($(this).html());
				"""),format.raw("""}"""),format.raw/*342.6*/("""				
			"""),format.raw("""}"""),format.raw/*343.5*/(""")
			
		"""),format.raw("""}"""),format.raw/*345.4*/("""
	"""),format.raw("""}"""),format.raw/*346.3*/(""");



	$(".checktd").on("""),format.raw("""{"""),format.raw/*350.20*/("""

		mouseenter: function () """),format.raw("""{"""),format.raw/*352.28*/("""

			$(this).css("background-color", "lightgreen");

		"""),format.raw("""}"""),format.raw/*356.4*/(""", 

		mouseleave: function () """),format.raw("""{"""),format.raw/*358.28*/("""

		  if ($(this).children().is(':checked'))"""),format.raw("""{"""),format.raw/*360.44*/("""	 
			    	$(this).css("background-color", "#66CC99");
			    """),format.raw("""}"""),format.raw/*362.9*/(""" else """),format.raw("""{"""),format.raw/*362.16*/("""
			    	$(this).css("background-color", "#A0A0A0");
			    """),format.raw("""}"""),format.raw/*364.9*/("""

		"""),format.raw("""}"""),format.raw/*366.4*/("""
	"""),format.raw("""}"""),format.raw/*367.3*/(""");

 


	function changeCheck(box) """),format.raw("""{"""),format.raw/*372.29*/("""   
	   var idtime = box.attr('id');
	   var idParticipant = box.parent().parent().attr('id');   
	   
	   if (box.is(':checked'))"""),format.raw("""{"""),format.raw/*376.29*/("""	   		
	       		box.parent().css("background-color", "#66CC99")//vert
		   		if (box.attr('class') == 'horaire checkbox') """),format.raw("""{"""),format.raw/*378.54*/("""
		           var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			   	   increment.html(parseInt(increment.html())+1);
		       	   requeteAjaxHeure(idtime, idParticipant);
			    """),format.raw("""}"""),format.raw/*382.9*/("""
	       		if (box.attr('class') == 'jour checkbox') """),format.raw("""{"""),format.raw/*383.54*/("""	
	    	   	   var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			   	   increment.html(parseInt(increment.html())+1);
				   requeteAjaxJour(idtime, idParticipant);
			   """),format.raw("""}"""),format.raw/*387.8*/("""
	   """),format.raw("""}"""),format.raw/*388.6*/(""" else """),format.raw("""{"""),format.raw/*388.13*/("""
	     
	     box.parent().css("background-color", "#A0A0A0")//gris
	     if (box.attr('class') == 'horaire checkbox') """),format.raw("""{"""),format.raw/*391.53*/("""
		     var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
		     increment.html(parseInt(increment.html())-1);
		     requeteAjaxHeure(idtime, idParticipant);
	     """),format.raw("""}"""),format.raw/*395.8*/("""
	     if (box.attr('class') == 'jour checkbox') """),format.raw("""{"""),format.raw/*396.50*/("""
	        var increment = $('#compte').children('.jour[id="'+idtime+'"]');
		    increment.html(parseInt(increment.html())-1);
		    requeteAjaxJour(idtime, idParticipant);
	     """),format.raw("""}"""),format.raw/*400.8*/("""
	   """),format.raw("""}"""),format.raw/*401.6*/("""
	   
	   
	"""),format.raw("""}"""),format.raw/*404.3*/("""

	function requeteAjaxJour(idtime, idParticipant)
	"""),format.raw("""{"""),format.raw/*407.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*408.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*410.11*/routes/*410.17*/.Application.checkBoxJour(event.id))),format.raw/*410.52*/("""",
			data: '"""),format.raw("""{"""),format.raw/*411.12*/(""""idjour" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*411.80*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*413.30*/("""
			  //alert("Jour edit\351");
			"""),format.raw("""}"""),format.raw/*415.5*/("""
	   """),format.raw("""}"""),format.raw/*416.6*/(""");
	"""),format.raw("""}"""),format.raw/*417.3*/("""

	function requeteAjaxHeure(idtime, idParticipant)
	"""),format.raw("""{"""),format.raw/*420.3*/("""
	  $.ajax("""),format.raw("""{"""),format.raw/*421.12*/("""
			type: "POST",
			url: """"),_display_(Seq[Any](/*423.11*/routes/*423.17*/.Application.checkBoxHoraire(event.id))),format.raw/*423.55*/("""",
			data: '"""),format.raw("""{"""),format.raw/*424.12*/(""""idhoraire" : "' + idtime + '", "idpersonne" : "' + idParticipant + '""""),format.raw("""}"""),format.raw/*424.83*/("""',
			contentType: "application/json",
			success : function(data) """),format.raw("""{"""),format.raw/*426.30*/("""
			  //alert("Horaire edit\351");
			"""),format.raw("""}"""),format.raw/*428.5*/("""
	   """),format.raw("""}"""),format.raw/*429.6*/(""");
	"""),format.raw("""}"""),format.raw/*430.3*/("""



	</script>

""")))})),format.raw/*436.2*/("""
"""))}
    }
    
    def render(event:Evenement) = apply(event)
    
    def f:((Evenement) => play.api.templates.Html) = (event) => apply(event)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 14 14:04:05 CEST 2012
                    SOURCE: C:/tutoPlay/KIND/app/views/editForm.scala.html
                    HASH: 9e855b548fa9fa0bbff923e3567d6135c7304140
                    MATRIX: 761->1|864->40|896->64|980->19|1008->38|1036->118|1075->123|1110->150|1149->152|1212->179|1226->184|1254->190|1339->239|1353->244|1381->250|1451->284|1465->289|1496->298|1562->328|1576->333|1609->344|1817->517|1857->541|1897->543|1957->567|1970->571|1995->574|2056->599|2069->603|2107->619|2149->625|2162->629|2189->634|2277->691|2406->785|2446->809|2486->811|2531->821|2569->850|2608->851|2678->890|2725->901|2770->930|2810->932|2866->952|2882->959|2907->962|2951->970|2964->974|2991->979|3046->998|3062->1005|3090->1011|3130->1015|3146->1022|3172->1026|3220->1042|3286->1077|3357->1113|3411->1151|3451->1153|3501->1167|3521->1178|3551->1186|3620->1220|3699->1290|3739->1292|3818->1335|3838->1346|3869->1355|3960->1410|3980->1421|4010->1429|4098->1481|4118->1492|4148->1500|4240->1561|4293->1579|4333->1603|4373->1605|4420->1616|4458->1645|4497->1646|4546->1659|4603->1707|4643->1709|4731->1761|4744->1765|4769->1768|4872->1834|4886->1838|4914->1843|4961->1872|4974->1877|5013->1878|5102->1931|5115->1935|5140->1938|5235->1996|5249->2000|5277->2005|5337->2033|5393->2057|5446->2074|5491->2103|5531->2105|5586->2124|5649->2178|5689->2180|5777->2232|5793->2239|5818->2242|5924->2311|5941->2318|5970->2324|6011->2328|6028->2335|6055->2339|6102->2368|6115->2373|6154->2374|6243->2427|6259->2434|6284->2437|6381->2497|6398->2504|6427->2510|6468->2514|6485->2521|6512->2525|6572->2553|6621->2570|6695->2612|6745->2631|6880->2731|6920->2755|6960->2757|7004->2766|7042->2795|7081->2796|7151->2830|7164->2834|7189->2837|7258->2875|7309->2890|7354->2919|7394->2921|7471->2962|7487->2969|7512->2972|7597->3025|7633->3030|8298->3647|8384->3685|8466->3719|8579->3785|8630->3789|8722->3833|8809->3873|8911->3927|9048->4016|9129->4049|9307->4180|9359->4185|9458->4236|9539->4269|9714->4397|9766->4402|9817->4406|9928->4469|10124->4617|10205->4651|10256->4655|10350->4701|10455->4758|10783->5038|11013->5221|11065->5226|11116->5230|11171->5238|11265->5284|11366->5338|11462->5386|11567->5443|11632->5471|11648->5477|11702->5508|11764->5522|11846->5556|11962->5624|12060->5675|12113->5681|12165->5686|12275->5748|12486->5911|12589->5967|12697->6027|12763->6045|12865->6099|13009->6195|13092->6230|13270->6361|13324->6368|13425->6421|13508->6456|13683->6584|13737->6591|13789->6596|13847->6607|13945->6657|14032->6696|14324->6941|14379->6948|14777->7299|14831->7306|14927->7354|15026->7406|15112->7445|15239->7524|15342->7580|15392->7583|15491->7635|15551->7647|15616->7675|15632->7681|15692->7718|15754->7732|15861->7791|15977->7859|16067->7902|16119->7907|16171->7912|16255->7949|16315->7961|16380->7989|16396->7995|16459->8035|16521->8049|16593->8073|16709->8141|16802->8187|16854->8192|16906->8197|16995->8239|17055->8251|17120->8279|17136->8285|17196->8322|17258->8336|17339->8369|17455->8437|17980->8926|18021->8950|18062->8952|18110->8964|18149->8993|18189->8994|18261->9029|18275->9033|18301->9036|18393->9090|18408->9094|18437->9099|18482->9110|18528->9120|18574->9149|18615->9151|18715->9214|18732->9221|18758->9224|18853->9281|18871->9288|18901->9294|18943->9298|18961->9305|18989->9309|19060->9348|19135->9391|19273->9482|19339->9501|19391->9506|19484->9551|19586->9605|19688->9659|19772->9695|19872->9748|19961->9790|20016->9797|20100->9833|20201->9887|20298->9937|20408->9999|20632->10175|20715->10211|20767->10216|20862->10263|20968->10321|21300->10605|21561->10819|21614->10825|21666->10830|21783->10899|21886->10954|21985->11006|22041->11015|22097->11024|22147->11027|22220->11052|22297->11081|22400->11137|22479->11168|22572->11213|22682->11276|22737->11283|22845->11344|22897->11349|22947->11352|23031->11388|23210->11519|23382->11643|23629->11843|23731->11897|23968->12087|24021->12093|24076->12100|24244->12220|24475->12404|24573->12454|24800->12634|24853->12640|24913->12653|25013->12706|25073->12718|25138->12746|25154->12752|25212->12787|25274->12801|25390->12869|25506->12937|25589->12973|25642->12979|25694->12984|25795->13038|25855->13050|25920->13078|25936->13084|25997->13122|26059->13136|26178->13207|26294->13275|26380->13314|26433->13320|26485->13325|26534->13342
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|37->8|37->8|37->8|39->10|39->10|39->10|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|52->23|52->23|52->23|53->24|53->24|53->24|53->24|53->24|53->24|53->24|53->24|53->24|54->25|57->28|57->28|57->28|58->29|58->29|58->29|60->31|61->32|61->32|61->32|62->33|62->33|62->33|62->33|62->33|62->33|62->33|62->33|62->33|62->33|62->33|62->33|63->34|64->35|68->39|68->39|68->39|69->40|69->40|69->40|70->41|70->41|70->41|71->42|71->42|71->42|73->44|73->44|73->44|74->45|74->45|74->45|75->46|77->48|77->48|77->48|78->49|78->49|78->49|79->50|79->50|79->50|80->51|80->51|80->51|80->51|80->51|80->51|81->52|81->52|81->52|82->53|82->53|82->53|82->53|82->53|82->53|83->54|85->56|86->57|86->57|86->57|87->58|87->58|87->58|88->59|88->59|88->59|88->59|88->59|88->59|88->59|88->59|88->59|89->60|89->60|89->60|90->61|90->61|90->61|90->61|90->61|90->61|90->61|90->61|90->61|91->62|92->63|93->64|95->66|100->71|100->71|100->71|101->72|101->72|101->72|102->73|102->73|102->73|103->74|104->75|104->75|104->75|105->76|105->76|105->76|106->77|107->78|137->108|138->109|139->110|141->112|142->113|144->115|146->117|150->121|153->124|154->125|157->128|158->129|159->130|160->131|163->134|164->135|165->136|168->139|171->142|173->144|174->145|175->146|176->147|180->151|184->155|185->156|186->157|188->159|190->161|193->164|196->167|199->170|201->172|201->172|201->172|202->173|202->173|204->175|206->177|207->178|208->179|211->182|216->187|218->189|219->190|219->190|220->191|223->194|224->195|227->198|228->199|229->200|230->201|233->204|234->205|235->206|237->208|239->210|240->211|245->216|245->216|251->222|253->224|259->230|264->235|270->241|273->244|275->246|276->247|279->250|280->251|282->253|282->253|282->253|283->254|283->254|285->256|287->258|288->259|289->260|292->263|293->264|295->266|295->266|295->266|296->267|296->267|298->269|300->271|301->272|302->273|305->276|306->277|308->279|308->279|308->279|309->280|309->280|311->282|318->289|318->289|318->289|319->290|319->290|319->290|319->290|319->290|319->290|319->290|319->290|319->290|319->290|320->291|320->291|320->291|321->292|321->292|321->292|321->292|321->292|321->292|321->292|321->292|321->292|322->293|323->294|327->298|328->299|329->300|332->303|333->304|334->305|335->306|337->308|339->310|339->310|340->311|342->313|344->315|346->317|350->321|352->323|353->324|354->325|355->326|359->330|363->334|364->335|365->336|367->338|369->340|371->342|372->343|374->345|375->346|379->350|381->352|385->356|387->358|389->360|391->362|391->362|393->364|395->366|396->367|401->372|405->376|407->378|411->382|412->383|416->387|417->388|417->388|420->391|424->395|425->396|429->400|430->401|433->404|436->407|437->408|439->410|439->410|439->410|440->411|440->411|442->413|444->415|445->416|446->417|449->420|450->421|452->423|452->423|452->423|453->424|453->424|455->426|457->428|458->429|459->430|465->436
                    -- GENERATED --
                */
            