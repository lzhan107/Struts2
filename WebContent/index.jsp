<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
<link rel="stylesheet" type="text/css" href="css/index.css"/>
<script type="text/javascript">
</script>
</head>
<body>
	<h1>Login Form</h1>
	<h3>Please input username and password</h3>
	<s:form name="login" action="login">
			<table border="0" id="loginbox">
				<s:textfield name="userBean.username" label="Username" class="username"></s:textfield>
				<s:password name="userBean.password" label="Password"></s:password>
				<s:submit value="Submit"></s:submit>
				<s:reset value="Reset"></s:reset>
			</table>
	</s:form>
</body>
</html>