<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SpringMVC表单处理之--密码</title>
</head>
<body>
	
	<h2>用户信息</h2>
	<form:form method="POST" action="/SpringMVC-Password/addUser">
		<table>
			<tr>
				<td><form:label path="username">用户名： </form:label> </td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td><form:label path="password">密码： </form:label> </td>
				<td><form:password path="password" /></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="提交">
				</td>
			</tr>
		</table>
	</form:form>
	
	<!-- 
		在这里，使用了 prefix="form" 头部标签， 该jsp页面内容与当程序运行时，在浏览器中显示的HTML页面源代码有所不同，
		可自行查看。
	 -->
	
</body>
</html>


