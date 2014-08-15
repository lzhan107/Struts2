<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/query.css" />
<script src="js/query.js"></script>
</head>
<body>
	<h1>
		Search Options:
	</h1>
	Input a date range, from <font color="#6FF"><s:text name="minReceivedAt"></s:text></font> to <font color="#6FF"><s:text name="maxReceivedAt"></s:text></font>
	<s:form name="queryform" action="queryform">
		<s:textfield name="inputValue.minReceivedAt" label="from" style="width:195px" id="minReceivedAt"></s:textfield>
		<s:textfield name="inputValue.maxReceivedAt" label="to" style="width:195px" id="maxReceivedAt"></s:textfield>
		<s:select name="inputValue.fromHost" id="servername" list="serverNameList" headerValue="Server Names" label="Select a Server" style="width:200px"></s:select>
		<s:select name="inputValue.priority" id="priority" list="priorityList" headerValue="Priority" label="Select a Priority" style="width:200px"></s:select>
		<s:select name="inputValue.NTSeverity" id="severity" list="NTSeverityList" headerValue="Severity" label="Select a Severity" style="width:200px"></s:select>
		<s:select name="inputValue.recordRange" id="records" list="{'1-100','101-500','501-1000','last 100'}" label="Select a Record Range" style="width:200px"></s:select>
		<s:submit onclick="return checkInput();"></s:submit>
		<s:reset></s:reset>
	</s:form>
</body>
</html>