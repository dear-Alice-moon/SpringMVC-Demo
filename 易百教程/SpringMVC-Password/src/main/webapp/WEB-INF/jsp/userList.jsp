<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="GBK">
	<title>SpringMVC表单处理之 -- 密码</title>
</head>
<body>
	
	<h2>提交的用户信息</h2>
	
	<table>
		<tr>
			<td>用户名：</td>
			<td>${username}</td>
		</tr>
		<tr>
			<td>密码：</td>
			<td>${password}</td>
		</tr>
	</table>
	
</body>
</html>