function editFunctions(routeGetPass, routeUpdatePersonne, routeCBJour, routeCBHoraire) {

	var goodPassEdit = "";
	var pass = "";
	var currentEditButton;

	$( "#dialog-check-pwd" ).dialog({  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: {
			"OK": function() {				
								
				pass = $("#password-check").val();	
				if (pass == goodPassEdit) {
				  	edition(currentEditButton);
				} else {
				  	alert("mot de passe incorrect");
				}				
				$( "#password-check" ).attr("value", "");
				$( this ).dialog( "close" );
				
			},

			"Annuler": function() {							
				$( this ).dialog( "close" );				
			}				
		}
		
	});

	$('.editPersonne').live('click', function(e) {
		
	    if(!$(this).parents("tr").hasClass("editable"))  {	    	
	    	if ($(this).siblings("i").hasClass("icon-lock")){
	    		currentEditButton = $(this);	    		
	    		$.ajax({
					type: "POST",
					url: routeGetPass,
					data: '{ "idpers" : "'+$(this).parents("tr").attr("id")+'" }',
					contentType: "application/json",
					success : function(data) {
						goodPassEdit = data.pass;

						$( "#dialog-check-pwd" ).dialog( "open" );	
											  
					}
			   });			
				
			} else {
				edition($(this));
			}
		  
	    } else {
	    	if ($.trim($(this).siblings("input").attr("value")) != "") {
			      $(this).html("<i class=\"mesicones icon-pencil\"></i>");
			      $(this).parents("tr").removeClass("editable");
			      $(this).siblings('input[type="text"]').attr("readonly", "readonly");
			      $(this).parent().parent().parent().children("td").children('input[type="checkbox"]').attr("disabled","true"); 
			      $(this).parent().parent().parent().children("td").css("border", "none");
			      $(".hoverable").off();	      
			      $(this).parent().parent().parent().children(".checktd").attr("class", "checktd");
			      refreshHoverable();
			      editPersonne($(this).attr('id'), $(this).siblings("input").attr("value"));
			} else {
				alert("Impossible de mettre un nom vide!!");
			}
	    }
	
	  
	})

	function edition(elem) {
		elem.html("<i class=\"mesicones icon-ok\"></i>");
		elem.parents("tr").addClass("editable");
		elem.siblings('input[type="text"]').removeAttr("readonly");
		elem.parent().parent().parent().children("td").children().removeAttr("disabled");
		elem.parent().parent().parent().children("td").css("border", "solid black 2px");
		$(".hoverable").off();		  
		elem.parent().parent().parent().children(".checktd").attr("class", "checktd hoverable");
		refreshHoverable();
	}

	function editPersonne(personneId, personneNom)
	{
	  $.ajax({
			type: "POST",
			url: routeUpdatePersonne,
			data: '{"id" : "' + personneId + '", "nom" : "' + personneNom + '"}',
			contentType: "application/json",
			success : function(data) {
			  //alert("Participant edit\351");
			}
	  });
	}

	$('.checktd').live('click', function(e) {
		if ($(this).children().prop("disabled") == false) {
			if ($(this).children().prop("checked") == false) {
				if (e.target.nodeName == "TD"){
					$(this).children().prop("checked", true);
				}
				changeCheck($(this).children());
			} else {
				if (e.target.nodeName == "TD"){
					$(this).children().prop("checked", false);
				}        
				changeCheck($(this).children());
			}

			affichagePopulaire();

			//$('.populaires').html("");
			$('.titres td').each( function() {
				if ($(this).css('background-color') == color2) {
					$('.populaires').append($(this).html());
				}				
			})			
		}
	});

	function changeCheck(box) {   // gestion des clics sur les checkboxes
	   var idtime = box.attr('id');
	   var idParticipant = box.parent().parent().attr('id');   
	   
	   if (box.is(':checked')){	 //Action de valider une horaire  		
	       		box.parent().css("background-color", "#66CC99")//vert
		   		if (box.attr('class').indexOf('horaire') != -1) {
		            var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
		       	    requeteAjaxHeure(idtime, idParticipant);
			    }
	       		if (box.attr('class').indexOf('jour') != -1) {	
	    	   	    var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			   	    increment.html(parseInt(increment.html())+1);
				    requeteAjaxJour(idtime, idParticipant);
			   }
	   } else { //Action de dévalider une horaires
	     
		    box.parent().css("background-color", color3) //
		    if (box.attr('class').indexOf('horaire') != -1) {
			    var increment = $('#compte').children('.horaire[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxHeure(idtime, idParticipant);
		    }
		    if (box.attr('class').indexOf('jour') != -1) {
		        var increment = $('#compte').children('.jour[id="'+idtime+'"]');
			    increment.html(parseInt(increment.html())-1);
			    requeteAjaxJour(idtime, idParticipant);
		    }
	   }
	}

	function requeteAjaxJour(idtime, idParticipant) // ajoute la date au participant
	{
	  $.ajax({
			type: "POST",
			url: routeCBJour,
			data: '{"idjour" : "' + idtime + '", "idpersonne" : "' + idParticipant + '"}',
			contentType: "application/json",
			success : function(data) {
			  //alert("Jour edit\351");
			}
	   });
	}

	function requeteAjaxHeure(idtime, idParticipant) // ajoute l'heure au participant
	{
	  $.ajax({
			type: "POST",
			url: routeCBHoraire,
			data: '{"idhoraire" : "' + idtime + '", "idpersonne" : "' + idParticipant + '"}',
			contentType: "application/json",
			success : function(data) {
			  //alert("Horaire edit\351");
			}
	   });
	}

}