

	$(".btnMailPerso").live('click', function() {
		if ($(this).siblings(".champPerso").css("display") == "none") {                
            $(this).siblings(".champPerso").removeAttr("style");
            $(this).html("<i class=\"mesicones icon-minus\"></i>")
        } else {                
            $(this).siblings(".champPerso").attr("style", "display:none");
            $(this).html("<i class=\"mesicones icon-plus\"></i>")
        }
	})

	$("textarea").live('click', function(e) {
		$(this).html("");
		$(this).removeAttr("style");
	})

	$(".visibleAdd").live("click", function() {
        if ($(this).siblings(".champAdd").css("display") == "none") {                
            $(this).siblings(".champAdd").removeAttr("style");
            $(this).html("<i class=\"mesicones icon-minus\"></i>")
        } else {                
            $(this).siblings(".champAdd").attr("style", "display:none");
            $(this).html("<i class=\"mesicones icon-plus\"></i>")
        }
    })

	

	function styles(){
		

		$("tr").attr("style", "");
		$("table.datesTable td").css("background-color", color3);
		$(".checkbox").attr("disabled", "true"); 

		$('.checkbox').each(function (i) { // coloration des box checkées
		  	if ($(this).is(':checked')){
		  		$(this).parent().css("background-color", "#66CC99");
		  	}
		});

		$('.infoPersonne').each(function (i) {
			$('.titres').attr('style','');
		});

		refreshCount(); // maj de la ligne de compteurs

		affichagePopulaire();
	}
	
	function checkobligatoire(idtime, type) {//fonction qui renvoie true si tous les participants obligatoires sont présents.
		
		var ret = true;
		
		$('.obligatoire.'+type+'[id="'+idtime+'"]').each(function() {			
			if(!($(this).is(":checked"))) {
				
				ret = false;
			}
		})
		return ret;
	}

	function refreshCount() { // met à jour l'affichage du compte des participants par horaire
		$('input[type="checkbox"].horaire.checkbox').each(function(i) {
			var iden = $(this).attr('id');
			
			if ($(this).is(':checked')){
		    	var increment = $('#compte').children('.horaire[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			}
			
		});
			
		$('input[type="checkbox"].jour.checkbox').each(function(i) {
			var iden = $(this).attr('id');			
				
			if ($(this).is(':checked')){
		    	var increment = $('#compte').children('.jour[id="'+iden+'"]');
				increment.html(parseInt(increment.html())+1);
			}			
			
		});
	}

	function affichagePopulaire() {
		var max = 0;
		$("#compte").children(".horaire, .jour").each( function() { // récupération de la valeur maximale dans les comptes
			$(this).css("background-color", color1) 
			$('.titres').children().css("background-color",color1);
			//$('.footer').html("");
			if (checkobligatoire($(this).attr("id"), $(this).attr("class"))) {			
				if ($(this).html() > max) {			
					max = $(this).html();
				}
			}		
		})
		$("#compte").children().each( function() {
			
			if ($(this).html() == max && $(this).html() != 0 && checkobligatoire($(this).attr("id"), $(this).attr("class"))) {			
				$(this).css("background-color", color2);				
				$('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').css("background-color", color2);
				if($(this).attr("class") == "horaire") {
					var day = $('td[id="'+$(this).attr("id")+'"][class="'+$(this).attr("class")+'"]').attr("day");				
					$("td:contains('"+day+"')").css("background-color", color2);
					
				}
			}
		})
	}

	function refreshHoverable() { //coloration des cases quand on passe la souris dessus
		
		$(".hoverable").on({

			mouseenter: function () {
				$(this).css("background-color", "lightgreen");
			}, 

			mouseleave: function () {
				if ($(this).children().is(':checked')){	 
			    	$(this).css("background-color", "#66CC99");
			    } else {
			    	$(this).css("background-color", color3);
			    }
			}
		});

	}

	function refreshObligatoire() { // met à jour les classes "obligatoire" sur les bonnes lignes de participants
		$(".checktd").removeClass("obligatoire");
		$(".checkbox").removeClass("obligatoire");
		$(".obligatoirecb").each(function () {
			
			if($(this).hasClass("obligatoire")) {					
				$(this).parent().parent().siblings(".checktd").addClass("obligatoire");
				$(this).parent().parent().siblings(".checktd").children().addClass("obligatoire");
			}

		})
	}