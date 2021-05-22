<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SpringMVC表单处理 -- 隐藏字段 </title>
</head>
<body>
	
	<h2>学生信息: </h2>
	<form:form method="POST" action="/SpringMVC-Hiddenfield/addStudent">
		<table>
			<tr>
				<td><form:label path="name">学生姓名: </form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="age">年龄: </form:label></td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<%-- <td><form:label path="id">编号: </form:label> </td> --%>
				<td></td>
				<td><form:hidden path="id" value="1000"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="提交" />
				</td>
			</tr>
			
		</table>
		
	</form:form>
	
	
</body>
</html>