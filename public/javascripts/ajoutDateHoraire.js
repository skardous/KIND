function ajoutDateHoraire(routeAddDate, routeNewHoraire, routeDateChanged, bigroute) {
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

					$('.titres.dates').append(
						"<td id=\""+data.idJour+"\" class=\"jour\" style=\"background-color: rgb(255, 255, 153);\">"+
							"<b class=\"jourintitule\">"+$("#datepicker").val()+" </b>"+
							"<a id=\""+data.idJour+"\" class=\"horaireAdd\">"+
								"<i class=\"mesicones icon-plus\"></i>"+
							"</a>"+
						"</td>"
					);	
					$('.titres.horaires').append(						
						"<td id=\""+data.idJour+"\" class=\"jour\" style=\"background-color: rgb(255, 255, 153);\"></td>"
					);

					$(".participant").append(
						"<td class=\"checktd\"><input id=\""+data.idJour+"\" type=\"checkbox\"  disabled class=\"jour checkbox\" value=\""+$("#datepicker").val()+"\" /></td>"
					);				

					$("#compte").append(
						"<td id=\""+data.idJour+"\" class=\"jour\" style=\"background-color: rgb(255, 255, 153);\">0</td>"
					);
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
							success : function(data) {
								
							}               
						});
					}
				});			

				setTimeout(refreshtable, 100);	
				
				$( this ).dialog( "close" );
				
				setTimeout(refreshtable, 500);
				
				
				setTimeout(styles, 1500);



								
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