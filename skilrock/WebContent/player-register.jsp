<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">Player's Register</h3>
<div align="center">
 <s:form action="playerRegister" validate="true">
<s:textfield name="first" label="First Name"></s:textfield> 
<s:textfield name="last" label="Last Name"></s:textfield>  
<s:textfield name="email" label="Email"></s:textfield> 
<s:password name="password" label="Password"></s:password> 
<s:textfield name="phone" label="Phone No"></s:textfield> 
<s:submit value="Register" align="center" ></s:submit>    
</s:form>  
<br>
<a href="index.jsp">Do you want to login</a>
<br><br>
OR
<br><br>
<a href="officer-login.jsp">Officer</a>
</div>

</body>
</html>