<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.book" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>下記の内容で登録します。よろしいですか？</p>
	<%
		book book = (book)session.getAttribute("input_data2");
	%>
	名前：<%=book.getName() %><br>
	著者：<%=book.getTyosha() %><br>
	出版社：<%=book.getShuppan() %><br>
	ISBN：<%=book.getIsbn() %><br>
	loginID：<%=book.getLoginID() %><br>
	パスワード：********<br>		
	<a href="RegisterExecuteServlet2">OK</a><br>
	<a href="RegisterBookServlet2">戻る</a>
</body>
</html>