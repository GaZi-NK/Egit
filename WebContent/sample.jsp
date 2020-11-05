<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date, java.text.SimpleDateFormat, ex.*" %>

<%
Employee emp = new Employee("0001", "鎌倉　直哉");

//運勢をランダムで決定
String[] luckArray = {"超スッキリ", "スッキリ", "最悪"};
int index = (int)(Math.random() * 3);
String luck = luckArray[index];

//実行日を取得
Date date = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
String today = sdf.format(date);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ占い</title>
</head>
<body>
<p><%= today %>の運勢は「<%= luck %>」です</p>

<% for(int i = 0; i < 10; i++){
	if(i % 3 == 0){ %>
		<p style="color:red">
<%	}else{ %>
		<p>
<%	} %>
	IDは<%= emp.getId() %>、名前は<%= emp.getName() %>です。</p>
<% } %>

</body>
</html>