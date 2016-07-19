<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>ShowUser.jsp</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>
<body>
	This is my ${users[1].userName} page.
	<br>
	<p>${users}</p>
	<table border="1">
		<tr>
			<th>id</th>
			<th>姓名</th>
			<th>密码</th>
			<th>电话</th>
			<th>邮箱</th>
		</tr>
		<c:forEach var="index" items="users" varStatus="user" begin="0"
			step="1">
			<tr>
				<td><c:out value="${users[user.index].id}"></c:out></td>
				<td><c:out value="${users[user.index].userName}"></c:out></td>
				<td><c:out value="${users[user.index].password}"></c:out></td>
				<td><c:out value="${users[user.index].tel}"></c:out></td>
				<td><c:out value="${users[user.index].email}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>