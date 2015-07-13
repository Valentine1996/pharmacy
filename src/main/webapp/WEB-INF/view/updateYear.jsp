<%--
  Created by IntelliJ IDEA.
  User: valentyn
  Date: 7/9/15
  Time: 1:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<tiles:insertDefinition name="basetemplate">
    <tiles:putAttribute name="body">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Редагування року</h1>
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
                        <c:url var="updateUrl" value="/year/update"/>
                        <form:form  class ="form-horizontal"  method="POST" modelAttribute="year" action="/year/update/${year.id}" >
                            <input type="hidden" name="id" value="${year.id}"/>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="name">Введіть назву</label>
                                <div class="col-sm-5 ">
                                <input class="form-control" id="name" name="name" value="${year.name}">
                                <p class="help-block"><form:errors path="name" /></p>
                                </div>
                            </div>
                            <button type="submit" class="btn btn-default">Оновити</button>
                        </form:form>
                    </div>
                    <!-- /.panel-body -->
                </div>
                <!-- /.panel -->
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->
        <script src="/resources/libs/jquery/dist/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="/resources/libs/bootstrap/dist/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="/resources/libs/metisMenu/dist/metisMenu.min.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="/resources/assets/js/sb-admin-2.js"></script>
    </tiles:putAttribute>
</tiles:insertDefinition>