<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	
	message: ${success}
	<br/>
	<br/>
	Go back to <a href="<c:url value='/list/' />">List of All Employees</a>
	
</body>

</html>