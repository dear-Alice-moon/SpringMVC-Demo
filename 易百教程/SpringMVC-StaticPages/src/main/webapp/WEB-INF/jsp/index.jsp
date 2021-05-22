<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>SpringMVC 静态页面</title>
</head>
<body>
	<h2>SpringMVC Landing Page!</h2>
	<p>点击下面的按钮获得一个简单的HTML页面</p>

	<form:form method="GET" action="/SpringMVC-StaticPages/staticPage">
		<table>
			<tr>
				<td>
					<input type="submit" value="获取HTML页面" />
				</td>
			</tr>
		</table>
	</form:form>

</body>
</html>
