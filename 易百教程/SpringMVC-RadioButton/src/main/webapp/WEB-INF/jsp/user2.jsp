<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SpringMVC表单处理 -- 单选框</title>
</head>
<body>
	
	<h2>用户信息 -- </h2>
	<form:form method="POST" action="/SpringMVC-RadioButton/addUser">
		<table>
			<tr>
				<td><form:label path="username">用户名: </form:label> </td>
				<td><form:input path="username"/></td>
			</tr>
			<tr>
				<td><form:label path="password">密码: </form:label> </td>
				<td><form:password path="password"/></td>
			</tr>
			<tr>
				<td><form:label path="address">地址: </form:label> </td>
				<td><form:textarea path="address" rows="5" cols="25"/></td>
			</tr>
			<tr>
				<td><form:label path="receivePaper">订阅新闻?</form:label> </td>
				<td><form:checkbox path="receivePaper"/></td>
			</tr>
			<tr>
				<td><form:label path="favoriteFrameworks">喜欢的技术/框架</form:label> </td>
				<td><form:checkboxes path="favoriteFrameworks" items="${webFrameworkList}"/></td>
			</tr>
			<tr>
				<td><form:radiobutton path="gender" value="M" label="男"/> </td>
				<td><form:radiobutton path="gender" value="F" label="女"/> </td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="提交">
				</td>
			</tr>
		</table>
	</form:form>
	
	
</body>
</html>