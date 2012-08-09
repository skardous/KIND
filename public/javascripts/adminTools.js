function adminTools(adm) {
	$(function() {			
			
			$( "#datepicker" ).datepicker({
				 minDate: 0,
				onSelect: function(date) {				
					var selectionType = $.inArray(date, $( "#date" ).multiDatesPicker('getDates'));				
					var d = new Date(date);		
					var dateText = d.toLocaleDateString();
					$( "#datepicker" ).attr("value", dateText);
					$( "#hidden" ).attr("value", d.getTime());
				}
			});
	});
		
}