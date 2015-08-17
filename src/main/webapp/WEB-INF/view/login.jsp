<%--
  Created by IntelliJ IDEA.
  User: inet
  Date: 14.08.2015
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="true"%>

<tiles:insertDefinition name="basetemplate">
  <tiles:putAttribute name="body" >

    <div class="row">
      <div class="col-lg-12">
        <h1 class="page-header">Login page</h1>
      </div>
      <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
    <div class="row">
      <div class="col-lg-9">
        <div class="panel panel-default">
          <div class="panel-heading">
            <h2>Spring Security Login Form (Database Authentication)</h2>
          </div>
          <!-- /.panel-heading -->



          <div class="panel-body">
            <form:form  class ="form-horizontal"  method="POST"  action="j_spring_security_check" >
              <c:if test="${not empty error}">
                <div >${error}</div>
              </c:if>
              <c:if test="${not empty msg}">
                <div >${msg}</div>
              </c:if>
              <div class="form-group">
                <label class="control-label col-sm-2" for="username">Введіть логін</label>
                <div class="col-sm-5 ">
                  <input class="form-control" id="username" type = "text" name="username">
                </div>
              </div>
              <div class="form-group">
                <label class="control-label col-sm-2" for="password">Введіть пароль</label>
                <div class="col-sm-5 ">
                  <input class="form-control" id="password" type = "password" name="password">
                </div>
              </div>
              <button type="submit" class="btn btn-default">Зайти</button>
            </form:form>
          </div>
          <!-- /.panel-body -->
        </div>
        <!-- /.panel -->
      </div>
      <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
  </tiles:putAttribute>
</tiles:insertDefinition>