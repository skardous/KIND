function ajoutDateHoraire(routeAddDate, routeNewHoraire, routeDateChanged) {
	var currentDay;
	var debut = "08h";
	var fin = "17h";

	$(".horaireAdd").live("click", function(){
		
		$( "#dialog-add-horaire" ).dialog("open");
		currentDay = $(this).attr("id");
		
	})

	$("#ajouterDate").live("click", function(){
		
		var listeJours = "";
		$(".jourintitule").each(function(){
			listeJours=listeJours+$(this).html()+" "
		});

		
		if (listeJours.indexOf($("#datepicker").val()) != -1 ) {			
			alert("date déjà existante");
		} else {
			$.ajax({
				type: "POST",
				url: routeAddDate,
				data: '{"date" : "' + $("#datepicker").val() + '"}',
				contentType: "application/json",
				success : function(data) {
					$("#divtest").html(data);
					styles();
				}
			});	
		}
	});

	$( ".slider-range" ).slider({
    	range: true,
    	min: 0,
    	max: 1440,
    	step: 15,
    	values: [ 8*60, 17*60 ],
    	
    	slide: function( event, ui ) {
    		$( "#data" ).val(parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60)+" - " + parseInt(ui.values[ 1 ]/60) +"h"+pad2(ui.values[ 1 ]%60));

		}, 
		change: function(event, ui) {
			debut = parseInt(ui.values[ 0 ]/60) + "h"+pad2(ui.values[ 0 ]%60);
			fin = parseInt(ui.values[ 1 ]/60) + "h"+pad2(ui.values[ 1 ]%60);
					
		}
	});
			    	
	$( "#dialog-add-horaire" ).dialog({  // boite de dialogue personnalisée
		autoOpen: false,
		height: 200,
		width: 275,
		modal: true,
		closeText: 'hide',
		buttons: {
			"OK": function() {	
					
				$.ajax({
					type: "POST",
					url: routeNewHoraire,
					data: '{"jour" : "' + currentDay + '"}',
					contentType: "application/json",
					success : function(data) {
						
						$.ajax({
							type: "POST",
							url: routeDateChanged,
							data: '{"idhoraire" : "' + data.idHoraire + '",'+ 
							'"debut" : "' + debut + '",'+
							'"fin" : "' + fin + '"}',
							contentType: "application/json",
							success : function(data2) {
								$("#divtest").html(data2);
								styles();

							}               
						});
					}
				});			

				
				$( this ).dialog( "close" );


								
			},

			"Annuler": function() {							
				$( this ).dialog( "close" );				
			}				
		}
		
	});

	
	
	function pad2(number) {
   
    	return (number < 10 ? '0' : '') + number
   
	}

}