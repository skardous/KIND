$('.editPersonne').live('click', function(e) {
		
	    if(!$(this).parents("tr").hasClass("editable"))  {	    	
	    	if ($(this).siblings("i").hasClass("icon-lock")){
				var pass = prompt('Entrez votre mot de passe','Mot_de_passe');
				var thisse = $(this);
				$.ajax({
					type: "POST",
					url: "@routes.Application.getPass()",
					data: '{ "idpers" : "'+$(this).parents("tr").attr("id")+'" }',
					contentType: "application/json",
					success : function(data) {
					  if (pass == data.pass) {
					  	edition(thisse);
					  } else {
					  	alert("mot de passe incorrect");
					  }
					},
					error:function (xhr, ajaxOptions, thrownError){
	                    alert(xhr.status);
	                    alert(thrownError);
	                }
                }  
			   });
			} else {
				edition($(this));
			}
		  
	    } else {
	      $(this).html("<i class=\"mesicones icon-pencil\"></i>");
	      $(this).parents("tr").removeClass("editable");
	      $(this).siblings('input[type="text"]').attr("readonly", "readonly");
	      $(this).parent().parent().parent().children("td").children('input[type="checkbox"]').attr("disabled","true"); 
	      $(this).parent().parent().parent().children("td").css("border", "none");
	      $(".hoverable").off();	      
	      $(this).parent().parent().parent().children(".checktd").attr("class", "checktd");
	      refreshHoverable();
	      editPersonne($(this).attr('id'), $(this).siblings("input").attr("value"));
	    }
	
	  
	})

function edition(elem) {
		elem.html("<i class=\"mesicones icon-ok\"></i>");
		elem.parents("tr").addClass("editable");
		elem.siblings('input[type="text"]').removeAttr("readonly");
		elem.parent().parent().parent().children("td").children().removeAttr("disabled");
		elem.parent().parent().parent().children("td").css("border", "solid black 2px");
		$(".hoverable").off();		  
		elem.parent().parent().parent().children(".checktd").attr("class", "checktd hoverable");
		refreshHoverable();
	}
	
	function refreshHoverable() {
		
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