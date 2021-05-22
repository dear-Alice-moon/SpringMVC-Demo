<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<html>
<head>
	<meta charset="UTF-8">
	<title>SpringMVC表单之--输入框处理</title>
</head>
<body>
	
	<h2>提交的学生信息如下 -- </h2>
	<table>
		<tr>
			<td>姓名: </td>
			<td>${name2}</td>
		</tr>
		<tr>
			<td>年龄: </td>
			<td>${age2}</td>
		</tr>
		<tr>
			<td>编号: </td>
			<td>${id2}</td>
		</tr>
	</table>
	
</body>
</html>