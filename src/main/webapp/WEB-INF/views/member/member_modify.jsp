<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>정보 수정</title>
	<link rel="stylesheet" href="../resources/member.css" type="text/css"></link>
</head>
<body>
	<div align=center>
		<header>학생 정보 수정</header>
		<form name=form1 action="../member/modify" method="post">
		<table>
			<tr><th>ID</th><td><input type="text" name="id" readonly value="${student.id}"></td></tr>
			<tr><th>PASSWORD</th><td><input type="text" name="passwd" value="${student.passwd}"></td></tr>
			<tr><th>USERNAME</th><td><input type="text" name="username" value="${student.username}"></td></tr>
			<tr><th>STUDENTNUMBER</th><td><input type="text" name="snum" value="${student.snum}"></td></tr>
			<tr><th>DEPARTMENT</th><td><input type="text" name="depart" value="${student.depart}"></td></tr>
			<tr><th>MOBILE</th><td><input type="text" name="mobile" value="${student.mobile}"></td></tr>
			<tr><th>EMAIL</th><td><input type="text" name="email" value="${student.email}"></td></tr>
		</table><br>
			<input type="submit" name="submit" value="최종 수정">
			<input type="reset" name="reset" value="다시작성">
		</form>
	</div>
</body>
</html>