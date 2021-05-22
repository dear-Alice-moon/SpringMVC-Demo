<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SpringMVC上传文件示例</title>
</head>
<body>
	
	<form:form method="POST" modelAttribute="fileUpload" enctype="multipart/form-data">
		<p>
			请选择一个文件上传:  
			<input type="file" name="file" />
			<input type="submit" value="提交上传" />
		</p>
	</form:form>
	
</body>
</html>