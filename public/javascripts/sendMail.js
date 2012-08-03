function bonmail(mailtest)
	{
		var reg = new RegExp('^([a-z0-9]+([_|\.|-]{1}[a-z0-9]+)*@[a-z0-9]+([_|\.|-]{1}[a-z0-9]+)*[\.]{1}[a-z]{2,6}){1}(\,( )*[a-z0-9]+([_|\.|-]{1}[a-z0-9]+)*@[a-z0-9]+([_|\.|-]{1}[a-z0-9]+)*[\.]{1}[a-z]{2,6})*$', 'i');

		if(reg.test(mailtest))
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}

$(function(){

		if (bonmail($("#mailsArea").val())) {
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
			$("#envoiLien").addClass("btn-primary");
		} else {
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
			$("#envoiLien").removeClass("btn-primary");
		}
	});


function Mails(routeSendMail) {
	

	$('#envoiLien').live('click', function(e) {
		var canSend = true;
		var tableau = $("#mailsArea").val().split(",");
		
		for (var i=0; i<tableau.length; i++) {
			
			if (($("#mailAdressContent").html()).indexOf($.trim(tableau[i])) != -1 && tableau[i] != '') {
				alert("Invitation déja envoyée à " + tableau[i] + " : ENVOI ANNULÉ (à toutes les adresses)");				
				canSend = false;
				break;
			}
		}

		if ($(this).attr("disabled") != "disabled" && canSend == true) {
			var mailsList = $("#mailsArea").val();

			$.ajax({
				type: "POST",
				url: routeSendMail,
				data: '{"mailslist" : "' + mailsList + '", "textPerso" : "' + $("#mailPersoArea").val() + '"}',
				contentType: "application/json",
				success : function(data) {
					
					for (var i=0; i<tableau.length; i++) {
						$("#mailAdressContent").append(tableau[i]+"<br>");
					}					
					alert("Mail(s) envoye(s) a " + mailsList);
				}
			});	
		}	
	});


	$("#mailsArea").live("keyup", function() {

		if (bonmail($(this).val())) {
			
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
			$("#envoiLien").addClass("btn-primary");
		} else {
			
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
			$("#envoiLien").removeClass("btn-primary");
		}
	})
	
	
}