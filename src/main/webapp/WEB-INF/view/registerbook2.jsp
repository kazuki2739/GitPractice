<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>図書情報を入力してください</p>
	<form action = "ConfirmServlet2" method = "post">
	図書名：<input type = "text" name = "name"><br>
	著者：<input type = "text" name = "tyosha"><br>
	出版社：<input type = "text" name = "shuppan"><br>
	ISBN：<input type = "text" name = "isbn"><br>
	<input type = "submit" value = "登録">
	</form>
</body>
</html>