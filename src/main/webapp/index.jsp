<%--
  Created by IntelliJ IDEA.
  User: valentyn
  Date: 7/7/15
  Time: 9:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Home page</title>
    <link type="text/css" rel="stylesheet" href="<c:url value="resourses/css/bootstrap.min.css"/>"/>
    <link type="text/css" rel="stylesheet" href="<c:url value="resourses/css/dataTables.bootstrap.css"/>"/>
</head>
<body>
<h1>Home page</h1>
<p>
    Welcome to "Pharmacy application".<br/>

    <a href="">Create a new year</a><br/>
    <a href="${pageContext.request.contextPath}/year/list">View all years</a><br/>
</p>
</body>
</html>
