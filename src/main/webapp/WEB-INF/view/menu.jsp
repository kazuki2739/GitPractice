<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import = "dto.book" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%book book = (book)session.getAttribute("user"); %>
	<h3>図書管理システム</h3>
	<p>ようこそ<%book.getLoginID(); %>さん</p>
	<a href = "RegisterBookServlet2">新規図書登録</a><br>
	<a href = "ListBookServlet">登録図書一覧</a><br>
	<a href = "DeleteBookServlet">図書情報削除</a>
	
</body>
</html>