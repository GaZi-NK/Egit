<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>第5章5-2の練習問題</title>
</head>
<body>
<form action="/example/SampleForm" method="post">
<input type="text" name="name" placeholder="名前を入力してください">
<select name="qtype">
<option value="company">会社について</option>
<option value="product">製品について</option>
<option value="support">アフターサポートについて</option>
</select>
<textarea name="body" rows="4" cols="40"  placeholder="こちらにお問い合わせ内容を入力してください"></textarea>
<input type="submit" value="送信">
</form>
</body>
</html>