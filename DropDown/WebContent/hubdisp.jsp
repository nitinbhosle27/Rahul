<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form method="post">
<c:forEach items="${myloc}" var="x">
<input type="radio" name="hublocation"  value="${x.hubname}">${x.hubname}<br><p>&nbsp;${x.hubaddress}</p><br><br>
</c:forEach>
<input type="submit" name="Submit">
</form:form>
</body>
</html>