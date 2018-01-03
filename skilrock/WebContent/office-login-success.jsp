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
<div align="center">
welcome, Officer <s:property value="o_email"/><br/><br/>
<a href="viewplayers">Do you want to see all Players</a><br/>
OR<br/>
<a href="update-officer-info.jsp">update INFO</a><br/>
</div>
</body>
</html>