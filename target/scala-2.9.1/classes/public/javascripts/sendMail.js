$(function(){
		if (bonmail($("#mailsArea").val())) {
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
		} else {
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
		}
});

$('#envoiLien').live('click', function(e) {

		if ($(this).attr("disabled") != "disabled") {
		  	var mailsList = $("#mailsArea").val();
		  
			$.ajax({
				type: "POST",
				url: "@routes.Application.sendMail(event.id)",
				data: '{"mailslist" : "' + mailsList + '"}',
				contentType: "application/json",
				success : function(data) {
				  alert("Mail(s) envoye(s) a "+mailsList);
				}
		   });
		}
	});


$("#mailsArea").live("keyup", function() {

		if (bonmail($(this).val())) {
			alert($(this).val());
			$(".checkmail").attr("class", "checkmail mesicones icon-ok");
			$("#envoiLien").removeAttr("disabled");
		} else {
			alert("not"+$(this).val());
			$(".checkmail").attr("class", "checkmail mesicones icon-remove");
			$("#envoiLien").attr("disabled", "true");
		}
	})
	
function bonmail(mailtest)
	{
		var reg = new RegExp('^([a-z0-9]+([_|\.|-]{1}[a-z0-9]+)*@@[a-z0-9]+([_|\.|-]{1}[a-z0-9]+)*[\.]{1}[a-z]{2,6}){1}(\,[a-z0-9]+([_|\.|-]{1}[a-z0-9]+)*@@[a-z0-9]+([_|\.|-]{1}[a-z0-9]+)*[\.]{1}[a-z]{2,6})*$', 'i');

		if(reg.test(mailtest))
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}