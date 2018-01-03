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
<h3 align="center">Officer's Register</h3>
<div align="center">
 <s:form action="officerRegister" validate="true">
<s:textfield name="o_first" label="First Name"></s:textfield> 
<s:textfield name="o_last" label="Last Name"></s:textfield>  
<s:textfield name="o_email" label="Email"></s:textfield> 
<s:password name="o_password" label="Password"></s:password> 
<s:textfield name="o_phone" label="Phone No"></s:textfield> 
<s:submit value="Register" align="center" ></s:submit>    
</s:form>  
<br>
<a href="officer-login.jsp">Do you want to login</a>
<br><br>
OR
<br><br>
<a href="index.jsp">Officer</a>
</div>

</body>
</html>