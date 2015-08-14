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

<tiles:insertDefinition name="basetemplate">
  <tiles:putAttribute name="body">
    <c:url var="createUrl" value="/year/"/>
    <div class="row">
      <div class="col-lg-12">
        <h1 class="page-header">Створення року</h1>
      </div>
      <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
    <div class="row">
      <div class="col-lg-9">
        <div class="panel panel-default">
          <div class="panel-heading">

          </div>
          <!-- /.panel-heading -->
          <div class="panel-body">
            <form:form  class ="form-horizontal"  method="POST" modelAttribute="year" action="/year/" >
              <div class="form-group">
                <label class="control-label col-sm-2" for="name">Введіть назву</label>
                <div class="col-sm-5 ">
                  <input class="form-control" id="name" type = "number" name="name" value="${year.name}">
                  <p class="help-block"><form:errors path="name" /></p>
                </div>
              </div>
              <button type="submit" class="btn btn-default">Створити</button>
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