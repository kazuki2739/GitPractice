<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href = "../img/libraly.webp">
<title>トップメニュー</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		if(request.getParameter("error") != null){	
	%>
		<p style="color:red">ログイン失敗</p>
	<form action="LoginServlet" method="post">
		【IDとPWを入力してください。】<br>
		MAILアドレス：<input type="text" name="mail" value="<%=request.getParameter("mail") %>"><br>
		PW：<input type="password" name="pw"><br>
		<input type="submit" value="ログイン">
	</form>
	<a href="RegisterBookServlet">新規登録はこちら</a>
	<%
		} else {
	%>
	<form action="LoginServlet" method="post">
		【IDとPWを入力してください。】<br>
		MAILアドレス：<input type="text" name="mail"><br>
		PW：<input type="password" name="pw"><br>
		<input type="submit" value="ログイン">
	</form>
	<a href="RegisterBookServlet">新規登録はこちら</a>
	<%
		}
	%>
</body>
</html>