
var datesList;


$('.linkDate').live('click', function(e) {
	  
   $("#date").multiDatesPicker('removeDates', $(this).attr("name")); //enleve la date dans l'affichage du datepicker
   $(this).parent().remove();
   
});


$('.linkPlus').live('click', function(e) {
	$(this).parent().append("<br>&nbsp; Debut :<select id=\"hrDeb\">"+optionsHeures+"</select>"+
		"h"+
		"<select id=\"minDeb\">"+optionsMinutes+"</select>"+
		" Fin :<select id=\"hrFin\">"+optionsHeures+"</select>"+
		"h"+
		"<select id=\"minFin\">"+optionsMinutes+"</select>"+
		"<a class=\"linkPlus\" >"+
		"<i class=\"icon-plus\"></i></a>");
});


function prettifyDates(id){	
	var datesString = $("#"+id).html();
	var datesArray = datesString.split(',');
	var current;
	
	$("#"+id).html("");
	for (val in datesArray) {
	 current = new Date(datesArray[val]);
	 currentStr = current.toLocaleString();
	 $("#"+id).append("<li>"+currentStr.substring(0,currentStr.length-8)+"</li>");
	}	
	
	$("#"+id).append("<br/>");
	
}







