function partobligatoire(routeChangeobligatoire) {	

	$(".obligatoirecb").live("click", function() { //click sur la checkbox "obligatoire" : mise à jour des classes sur la ligne, ajout de la propriété obligatoire dans la bdd
			
			var idParticipant = $(this).parent().parent().parent().attr("id");
			if ($(this).hasClass("obligatoire")) {
				$(this).children("i").attr("class", "mesicones icon-star-empty");
				$(this).removeClass("obligatoire");
			} else {
				$(this).children("i").attr("class", "mesicones icon-star");
				$(this).addClass("obligatoire");
			}
			$.ajax({
				type: "POST",
				url: routeChangeobligatoire,
				data: '{"idpersonne" : "' + idParticipant + '"}',
				contentType: "application/json",
				success : function(data) {
				  affichagePopulaire();
				}
	   		});
	   		refreshObligatoire();

		})
}