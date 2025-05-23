<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>학생 정보</title>
	<link rel="stylesheet" href="../resources/member.css" type="text/css"></link>
</head>
<body>
	<div align=center>
		<header>학생 정보</header><br>
		<nav> <c:url value="/member/list" var="url"/><a href="${url}">학생 목록 보기</a> </nav>
		<table>
		    <tr><th> LoginID </th><td>${student.id}</td></tr>
			<tr><th> LoginPWD </th><td>${student.passwd}</td></tr>
			<tr><th> YourName </th><td>${student.username}</td></tr>
			<tr><th> StudentNumber </th><td>${student.snum}</td></tr>
			<tr><th> Department </th><td>${student.depart}</td></tr>
			<tr><th> Mobile </th><td>${student.mobile}</td></tr>
			<tr><th> EmailNumber </th><td>${student.email}</td></tr>
		</table>
		
	</div>
</body>
</html>