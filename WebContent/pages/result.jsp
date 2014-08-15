<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib uri="http://displaytag.sf.net" prefix="display" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/result.css" />
</head>
<body>
<display:table export="true" id="records" name="systemEvents" requestURI="/queryform.action" pagesize="10">
	<display:column property="id" title="ID" sortable="true"></display:column>
	<display:column property="customerID" title="CustomerID" sortable="true"></display:column>
	<display:column property="receivedAt" title="ReceivedAt" sortable="true"></display:column>
	<display:column property="deviceReportedTime" title="DeviceReportedTime" sortable="true"></display:column>
	<display:column property="facilityMessage" title="Facility" sortable="true"></display:column>
	<display:column property="priorityMessage" title="Priority" sortable="true"></display:column>
	<display:column property="fromHost" title="FromHost" sortable="true"></display:column>
	<display:column property="message" title="Message" sortable="true"></display:column>
	<display:column property="NTSeverity" title="Severity" sortable="true"></display:column>
	<display:column property="importance" title="Importance" sortable="true"></display:column>
	<display:column property="eventSource" title="EventSource" sortable="true"></display:column>
	<display:column property="eventUser" title="EventUser" sortable="true"></display:column>
	<display:column property="eventCategory" title="EventCategory" sortable="true"></display:column>
	<display:column property="eventID" title="EventID" sortable="true"></display:column>
	<display:column property="eventBinaryData" title="EventBinaryData" sortable="true"></display:column>
	<display:column property="maxAvailable" title="MaxAvailable" sortable="true"></display:column>
	<display:column property="currUsage" title="CurrUsage" sortable="true"></display:column>
	<display:column property="minUsage" title="MinUsage" sortable="true"></display:column>
	<display:column property="maxUsage" title="maxUsage" sortable="true"></display:column>
	<display:column property="infoUnitID" title="infoUnitID" sortable="true"></display:column>
	<display:column property="sysLogTag" title="sysLogTag" sortable="true"></display:column>
	<display:column property="eventLogType" title="eventLogType" sortable="true"></display:column>
	<display:column property="genericFileName" title="genericFileName" sortable="true"></display:column>
	<display:column property="systemID" title="systemID" sortable="true"></display:column>
</display:table>
</body>
</html>