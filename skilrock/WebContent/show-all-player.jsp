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
<h3 align="center">All Players</h3>  
<br/><br/>
<s:iterator  value="list">  
<fieldset>  
<s:property value="p_first"/>   
<s:property value="p_last"/><br/>  
<s:property value="p_email"/><br/>   
<s:property value="p_phone1"/><br/> 
</fieldset>  
<br/>
</s:iterator> 
</body>
</html>