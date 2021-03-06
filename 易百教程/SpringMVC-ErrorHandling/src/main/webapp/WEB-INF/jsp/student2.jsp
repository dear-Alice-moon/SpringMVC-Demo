<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SpringMVC表单错误处理</title>
</head>
<style>
	.error {
		color: #FF0000;
	}
	.errorStyle {
		color: #000;
		background-color: #FFEEEE;
		border: 3px solid #FF0000;
		padding: 8px;
		margin: 16px;
	}
</style>
<body>
	
	<h2>学生信息 -- </h2>
	<form:form method="POST" action="/SpringMVC-ErrorHandling/addStudent" commandName="student">
		<table>
			<tr>
				<td><form:label path="name">姓名: </form:label></td>
				<td><form:input path="name"/></td>
				<td><form:errors path="name" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="age">年龄: </form:label> </td>
				<td><form:input path="age"/></td>
			</tr>
			<tr>
				<td><form:label path="id">编号: </form:label></td>
				<td><form:input path="id"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交" /></td>
			</tr>
		</table>
	</form:form>
	
	
</body>
</html>