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
<h3 align="center">Update Info</h3>
<div align="center">
 <s:form action="updateOfficerInfo">
<s:textfield name="o_first" label="First Name" value="%{o_first}"></s:textfield> 
<s:textfield name="o_last" label="Last Name"></s:textfield>  
<s:textfield name="o_email" label="Email"></s:textfield> 
<s:password name="o_password" label="Password"></s:password> 
<s:textfield name="o_phone" label="Phone No"></s:textfield> 
<s:submit value="Update" align="center" ></s:submit>    
</s:form>  
</div>
</body>
</html>