function Delete(routeGetPass, routeDeleteParticipant) {
	var goodPassDelete = "";
	var pass = "";
	var currentDelButton;

	$( "#dialog-check-pwd-delete" ).dialog({  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		buttons: {
			"OK": function() {				
								
				pass = $("#password-check-delete").val();	
				if (pass == goodPassDelete) {
				  	deletePersonne(currentDelButton);
				} else {
				  	alert("mot de passe incorrect");
				}				
				$( "#password-check-delete" ).attr("value", "");
				$( this ).dialog( "close" );
				
			},

			"Annuler": function() {							
				$( this ).dialog( "close" );				
			}				
		}
		
	});

	$('.deletePersonne').live('click', function(e) {
		currentDelButton = $(this);
		if ($(this).siblings("i").hasClass("icon-lock")){
    		
    		$.ajax({
				type: "POST",
				url: routeGetPass,
				data: '{ "idpers" : "'+$(this).parents("tr").attr("id")+'" }',
				contentType: "application/json",
				success : function(data) {
					goodPassDelete = data.pass;

					$( "#dialog-check-pwd-delete" ).dialog( "open" );	
										  
				}
		   });			
			
		} else {   
		    deletePersonne(currentDelButton);
		}
	    
	})

	function deletePersonne(delButton)
	{
		delButton.parent().parent().parent().remove();		    
	    
	    if($('td[class="infoPersonne"]').html() == null) {
	    	$('.titres').attr('style','display:none');
	    	$('.legende').attr('style','display:none');
	    }

	    $('#compte').children('td[id!=""]').each(function(i) {
	    	$(this).html("0")
	    });

	    refreshCount();
	    refreshObligatoire();
	    affichagePopulaire();

	    $.ajax({
			type: "POST",
			url: routeDeleteParticipant,
			data: '{"id" : "' + delButton.attr('id') + '"}',
			contentType: "application/json",
			success : function(data) {
			  //alert("Participant supprim\351");
			}
	    });
	}
}