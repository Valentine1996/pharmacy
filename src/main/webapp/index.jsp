<%--
  Created by IntelliJ IDEA.
  User: valentyn
  Date: 7/7/15
  Time: 9:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Home page</title>
</head>
<body>
<h1>Home page</h1>
<p>
    Welcome to "Pharmacy application".<br/>

    <a href="/shop/create.html">Create a new year</a><br/>
    <a href="${pageContext.request.contextPath}/year/list">View all years</a><br/>
</p>
</body>
</html>
