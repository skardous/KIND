function AjoutParticipant(routeAdd, adm) {
	function addPersonne(nomParticipant, locked, pwd)
	{	
		$.ajax({
			type: "POST",
			url: routeAdd,
			data: '{"nom" : "' + nomParticipant + '", "locked" : "' + locked + '", "pwd" : "' + pwd + '", "adm" :"' + adm + '"}',
			contentType: "application/json",
			success : function(data) {
				$("#divtest").html(data);				
				styles();				
				
				refreshObligatoire(); // maj  des classes "obligatoire" sur les checkboxes
				affichagePopulaire(); // maj des surbrillances
			},
			error: function(data) {
				alert('error');
			}
			             
		});
	}

	$( "#dialog-new-pwd" ).dialog({  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: {
			"OK": function() {
				var bValid = true;									

				if ( bValid ) {
					mdp = $("#password-new").val();
					
					addPersonne($.trim($("#champ").attr("value")), "true", mdp);
					$( "#password-new" ).attr("value", "");
					$( this ).dialog( "close" );
				}
			}				
		}
		
	});

	$( "#dialog-question-securise" ).dialog({  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: {
			"Oui": function() {				    	
			    $( "#dialog-new-pwd" ).dialog( "open" );  
			    $( this ).dialog( "close" );
			},
			"Non": function() {
				addPersonne($.trim($("#champ").attr("value")), "false", "");
				$( this ).dialog( "close" );
			}				
		}
		
	});

	$("#ajouter").live('click', function(e){
		
	    var vide = "";	    
	    var nom = $("#champ").attr("value");
	    if (nom != vide) {  
	    	$( "#dialog-question-securise" ).dialog( "open" );						
		}
		$("#champ").focus();
	    	    
	});

	$("#champ").keypress(function(e) {
		var code = (e.keyCode ? e.keyCode : e.which);

		if(code == 13) { //Enter keycode
			var vide = "";	    
		    var nom = $.trim($("#champ").attr("value")); // suppression des espaces dans la chaine
		    if (nom != vide) {  
		    	$( "#dialog-question-securise" ).dialog( "open" );	
							
			}
			$("#champ").focus();
 		}

	});
}