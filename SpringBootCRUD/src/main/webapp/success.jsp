<%@page import="java.util.List"%>
<%@page import="com.cjc.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function updateRecord() {
	alert("Update");
	document.myform.action="edit";
	document.myform.submit();	
}
function deleteRecord() {
	alert("Delete");
	document.myform.action="delete";
	document.myform.submit();
}
function addRecord() {
	alert("Add");
	document.myform.action="add";
	document.myform.submit();
}
</script>

</head>
<body bgcolor="Khaki">
<form name="myform">
	<h2 style="text-align: center; color: Magenta">
		<i>Student All Info</i>
	</h2>

	<%List<Student> list=(List)request.getAttribute("data"); %>

	<div style="text-align: center; margin-left: 250px">
		<table border="5" style="color: black;">
			<thead>
				<tr style="color: Crimson">
					<th>SELECT</th>
					<th>ID</th>
					<th>NAME</th>
					<th>ADDRESS</th>
					<th>USERNAME</th>
					<th>PASSWORD</th>
					<th>UPDATE</th>
					<th>DELETE</th>

				</tr>
			</thead>
			<tbody>
				<tr>
					<% for(Student s:list){ %>
					<td><input type="radio" name="id" value="<%=s.getId()%>"></td>
					<td><%=s.getId() %></td>
					<td><%=s.getName() %></td>
					<td ><%=s.getAddr() %></td>
					<td><%=s.getUname() %></td>
					<td><%=s.getPass() %></td>


					<td><input type="button" onclick="updateRecord()" value="Update"></td>
					<td><input type="button" onclick="deleteRecord()" value="Delete"></td>
					
				</tr>
				<%} %>
			</tbody>
<tr><td><input type="button" onclick="addRecord()" value="Add NewUser"></td></tr>
		</table>
	</div>

</form>

</body>
</html>