<%--
  Created by IntelliJ IDEA.
  User: valentyn
  Date: 7/9/15
  Time: 1:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Edit Year</title>
</head>
<body>
<h1>Edit Year</h1>
<c:url var="updateUrl" value="/year/update"/>
<form:form method="PUT" modelAttribute="year" action="${updateUrl}/${year.id}" >
    <table>
        <tbody>
        <tr>
            <td>Year name:</td>
            <td><input name="name" value="${year.name}"/></td>
            <td><form:errors path="name" cssStyle="color: red;"/></td>
        </tr>

            <td><input type="submit" value="Update" /></td>
        </tr>
        </tbody>
    </table>
</form:form>
<a href="${pageContext.request.contextPath}/">Home page</a>
</body>
</html>
