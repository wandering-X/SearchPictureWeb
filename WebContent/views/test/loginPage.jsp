<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/test/login">  
username:<input type="text" name="username" value="${user.username}"><br/>  
password:<input type="password" name="password"><br/>  
<input type="submit" value="登录"/>  
</form>  
</body>
</html>