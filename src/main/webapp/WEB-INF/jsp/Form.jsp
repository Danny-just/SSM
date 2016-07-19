<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<title>Form 页面</title>



</head>

<body>
	This is my my page.
	<br>
	<form action="postUser" method="post">
		userName: <input type="text" name="userName" /> 
		密码: <input type="text" name="password" />
		电话: <input type="text" name="tel"/>
		邮箱: <input type="text" name="email"/>
		<input type="submit" value="提交" />

	</form>
</body>
</html>