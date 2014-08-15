function checkInput(){
	var minReceivedAt = document.getElementById("minReceivedAt").value;
	var maxReceivedAt = document.getElementById("maxReceivedAt").value;
	var serverNameList = document.getElementById("servername");
	var selectedServerName = serverNameList.options[serverNameList.selectedIndex].value;
	var priorityList = document.getElementById("priority");
	var selectedPriority = priorityList.options[priorityList.selectedIndex].value;
	var severityList = document.getElementById("severity");
	var selectedSeverity = severityList.options[severityList.selectedIndex].value;
	var recordsList = document.getElementById("records");
	var selectedRecords = recordsList.options[recordsList.selectedIndex].value;
	
	var isconfirm = confirm("Search Criteria: \n\n\n"
						 +"Date range: from " + minReceivedAt + " to " + maxReceivedAt + "\n\n"
						 +"Server name: " + selectedServerName + "\n\n"
						 +"Priority: " + selectedPriority + "\n\n"
						 +"Severity: " + selectedSeverity +"\n\n"
						 +"Record range: " + selectedRecords +"\n\n"
						 +"Are you sure to pull the records?"
			);
	if (isconfirm == true){
		return true;
	}
	else{
		return false;
	}
}