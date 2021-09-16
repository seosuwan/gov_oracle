<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <c:set var="ctx" value="<%= application.getContextPath()%>" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello, Spring MVC ! 가즈아!!!!!!!!!</h1>
<a href="${ctx}/move/user/Register">User Register</a>
<a href="${ctx}/move/user/Detail">User Detail</a>
<a href="${ctx}/move/user/Update">User Update</a>
<a href="${ctx}/move/user/List">User List</a>

<a href="${ctx}/move/book/Register">book Register</a>
<a href="${ctx}/move/book/Detail">book Register</a>
<a href="${ctx}/move/book/Update">book Update</a>
<a href="${ctx}/move/book/List">book List</a>

<a href="${ctx}/move/order/Register">order Register</a>
<a href="${ctx}/move/order/Detail">order Detail</a>
<a href="${ctx}/move/order/Update">order Update</a>
<a href="${ctx}/move/order/List">order List</a>

<a href="${ctx}/move/publisher/Register">publisher Register</a>
<a href="${ctx}/move/publisher/Detail">publisher Detail</a>
<a href="${ctx}/move/publisher/Update">publisher Update</a>
<a href="${ctx}/move/publisher/List">publisher List</a>

</body>
</html>