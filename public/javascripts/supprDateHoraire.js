function supprDateHoraire(routeDelHoraire, routeDelDate) {
	$(".horaireDel").live("click", function(){
		var thisse = $(this);
		
			
		$.ajax({
			type: "POST",
			url: routeDelHoraire,
			data: '{"jour" : "' + $(this).attr("idjour") + '", "horaire" : "' + $(this).attr("id") + '"}',
			contentType: "application/json",
			success : function(data) {
				$("#divtest").html(data);
				styles();				
			}, 
			error : function(data) {
				alert("impossible de supprimer l'horaire, vérifiez que personne n'est disponible à cet horaire-ci")
			}
		});	

	})

	$(".jourDel").live("click", function(){
		var thisse = $(this);
		
		
		$.ajax({
				type: "POST",
				url: routeDelDate,
				data: '{"idDate" : "' + $(this).attr("id") + '"}',
				contentType: "application/json",
				success : function(data) {
					$("#divtest").html(data);
					styles();		
				},
				error : function(data) {
					alert("impossible de supprimer le jour, vérifiez que personne n'est disponible ce jour-ci")
				}
			});				

	})
}