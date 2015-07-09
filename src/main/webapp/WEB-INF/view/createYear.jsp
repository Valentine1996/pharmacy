<%--
  Created by IntelliJ IDEA.
  User: valentyn
  Date: 7/9/15
  Time: 4:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html" />
    <link rel="stylesheet" type="text/css" href="/resourses/css/errors.css">
    
    <title>Create</title>
</head>
<body>
<h1>Create year</h1>

<c:url var="createUrl" value="/year/"/>

<form:form method="POST" modelAttribute="year" action="${createUrl}" >
    <table>
        <tbody>
        <tr>
            <td>Year name:</td>
            <td><input name="name" /></td>
            <td><form:errors path="name" cssClass="error" /></td>
        </tr>

        <td><input type="submit" value="Create" /></td>
        </tr>
        </tbody>
    </table>
</form:form>
<a href="${pageContext.request.contextPath}/">Home page</a>
</body>
</html>
