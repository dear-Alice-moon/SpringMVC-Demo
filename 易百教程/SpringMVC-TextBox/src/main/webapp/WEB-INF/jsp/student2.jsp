<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>SpringMVC表单之--输入框处理</title>
</head>
<body>
	
	<h2>学生信息</h2>
	
	<form:form method="POST" action="/SpringMVC-TextBox/addStudent">
		<table>
			<tr>
				<td><form:label path="name">姓名：</form:label> </td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="age">年龄：</form:label> </td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td><form:label path="id">编号：</form:label> </td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交学生 信息" /></td>
			</tr>
		</table>
	</form:form>
	
</body>
</html>