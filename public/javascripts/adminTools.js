function adminTools(adm, passAdmin, routeNewPassAdmin) {
	$(function() {
			if (adm == "1") {
				$( "#dialog-check-pwd-adm" ).dialog( "open" );	
			}
			
			$( "#datepicker" ).datepicker({
				 minDate: 0,
				onSelect: function(date) {				
					var selectionType = $.inArray(date, $( "#date" ).multiDatesPicker('getDates'));				
					var d = new Date(date);		
					var dateText = d.toLocaleDateString();
					$( "#datepicker" ).attr("value", dateText);
				}
			});
		});

		$( "#dialog-check-pwd-adm" ).dialog({  // boite de dialogue personnalisée
			autoOpen: false,
			height: 200,
			width: 275,
			modal: true,
			open: function(event, ui) { $(".ui-dialog-titlebar-close", $(this).parent()).hide(); },
			closeOnEscape: false,
			buttons: {
				"OK": function() {				
									
					pass = $("#password-check-adm").val();	
					if (pass == passAdmin) {
					  	$( this ).dialog( "close" );
					} else {
					  	alert("mot de passe incorrect");
					}				
					
				}					
			}
			
			
		});

		$("#newPassAdmin").live("click", function(){
			$( "#dialog-new-adm" ).dialog("open");
		});

		$( "#dialog-new-adm" ).dialog({  // boite de dialogue personnalisée
			autoOpen: false,
			height: 200,
			width: 275,
			modal: true,	
			
			buttons: {
				"OK": function() {				
									
					pass = $("#password-new-adm").val();	
					$.ajax({
						type: "POST",
						url: routeNewPassAdmin,
						data: '{"newPass" : "' + pass + '"}',
						contentType: "application/json",
						success : function(data) {
							alert("Nouveau mot de passe etabli");

						}
					});
					$( this ).dialog( "close" );			
					
				}					
			}
			
			
		});
}