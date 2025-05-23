<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Student List</title>
	<link rel="stylesheet" href="../resources/member.css" type="text/css"></link>
</head>
<body>
	<div align=center>
		<header>학생 목록</header><br>
		<nav> <c:url value="/member/register" var="url"/><a href="${url}">학생 등록</a><br> </nav>
		<table>
		  <tr>
		    <th>ID</th><th>PWD</th><th>USERNAME</th><th>SNUM</th><th>DEPART</th><th>MOBILE</th><th>EMAIL</th><th></th>
		  </tr>
		  <c:forEach var="member" items="${students}" >
			  <tr>
			    <td>${member.id}</td>
			    <td>${member.passwd}</td>
			    <td>${member.username}</td>
			    <td>${member.snum}</td>
			    <td>${member.depart}</td>
			    <td>${member.mobile}</td>
			    <td>${member.email}</td>
			    <td>
			      <c:url value="/member/read?id=${member.id}" var="url"/><a href="${url}">정보 보기</a>
			      <c:url value="/member/modify?id=${member.id}" var="url"/><a href="${url}">정보 수정</a>
			    </td>
			  </tr>
		  </c:forEach>
		</table>
	</div>
</body>
</html>