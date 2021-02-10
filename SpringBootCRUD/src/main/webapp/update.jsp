<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Cornsilk">
<h2 style="color: Orange; text-align: center;  ">Update Data</h2>
<form action="update">
<pre>
<input type="hidden" name="id" value=${s.id}>

Name     : - <input type="text" name="name" value=${s.name}>

Address  : - <input type="text" name="addr" value=${s.addr}>

Username : - <input type="text" name="uname" value=${s.uname}>

Password : - <input type="password" name="pass" value=${s.pass}>

<input type="submit" value="update">

</pre>
</form>
</body>
</html>