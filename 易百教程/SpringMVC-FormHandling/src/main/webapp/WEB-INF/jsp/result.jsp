<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SpringMVC 表单处理--result</title>
</head>
<body>
	
	<h2>提交的学生信息如下： </h2>
	<table>
		<tr>
			<td>名称: </td>
			<td>${name}</td>
		</tr>
		<tr>
			<td>年龄： </td>
			<td>${age}</td>
		</tr>
		<tr>
			<td>编号：</td>
			<td>${id}</td>
		</tr>
	</table>
	
</body>
</html>