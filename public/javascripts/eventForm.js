
var datesList;
var optionsHeures = "";
var optionsMinutes = "";
var heuresList = new Array();
for (i=0;i<24;i++) {
	if (i < 10) {
		optionsHeures = optionsHeures+"<option value=\""+"0"+i+"\">"+"0"+i+"</option>";
	} else {
		optionsHeures = optionsHeures+"<option value=\""+i+"\">"+i+"</option>";
	}
}

for (j=0;j<60;j+=15) {
	if (j < 10) {
		optionsMinutes = optionsMinutes+"<option value=\""+"0"+j+"\">"+"0"+j+"</option>";
	} else {
		optionsMinutes = optionsMinutes+"<option value=\""+j+"\">"+j+"</option>";
	}
}
	
function afficheDates() {
	datesList = $("#date").multiDatesPicker('getDates');
	var liste;
	
	
	
	$("#altField").html("");
	for (val in datesList) {
		$("#altField").append("<li id=\""+datesList[val]+"\">"+ 
		"<a class=\"linkDate\" id=\""+val+"\" name=\""+datesList[val]+"\">"+
		"<i class=\"icon-trash\"></i>&nbsp;"+
		"</a>"+datesList[val]+
		" &nbsp;|&nbsp; Debut :<select id=\"hrDeb\">"+optionsHeures+"</select>"+
		"h"+
		"<select id=\"minDeb\">"+optionsMinutes+"</select>"+
		" Fin :<select id=\"hrFin\">"+optionsHeures+"</select>"+
		"h"+
		"<select id=\"minFin\">"+optionsMinutes+"</select></li>");
		
		$("#myDates").attr('value', datesList);
		
	}	
}	

$('.linkDate').live('click', function(e) {
	datesList.splice($(this).attr("id")); //Supprime la date au rang "id"   
   $("#date").multiDatesPicker('removeDates', $(this).attr("name")); //enleve la date dans l'affichage du datepicker
   afficheDates(); //actualise la liste en dessous du datepicker
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







