<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/resources/css/materialize.min.css"/>"
	type="text/css" rel="stylesheet" media="screen,projection">
<title>Tasks</title>
</head>
<body>
	<nav>
	<div class="nav-wrapper blue darken-3">
		<a href="#" class="brand-logo">Todolist</a>
	</div>
	</nav>
	<ul class="collection">
		<c:forEach items="${tasks}" var="task">
			<li class="collection-item">
				${task.label} commençant le 
				<fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${task.beginningDate}" /></li>
		</c:forEach>
	</ul>
</body>
</html>