
var datesList;










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







