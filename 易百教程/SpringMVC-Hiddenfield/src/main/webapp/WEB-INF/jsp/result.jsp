<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SpringMVC表单处理 -- 隐藏字段</title>
</head>
<body>
	
	<h2>提交的学生信息: </h2>
	<table>
		<tr>
			<td>编号: </td>
			<td>${id}</td>
		</tr>
		<tr>
			<td>学生姓名: </td>
			<td>${name}</td>
		</tr>
		<tr>
			<td>年龄: </td>
			<td>${age}</td>
		</tr>
	</table>
	
</body>
</html>