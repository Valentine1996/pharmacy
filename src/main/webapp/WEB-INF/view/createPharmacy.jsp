<%--
  Created by IntelliJ IDEA.
  User: valentyn
  Date: 7/12/15
  Time: 9:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<tiles:insertDefinition name="basetemplate">
    <tiles:putAttribute name="body">
        <c:url var="createUrl" value="/pharmacy/"/>
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Створення аптеки</h1>
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
                        <form:form  class ="form-horizontal"  method="POST" modelAttribute="pharmacy" action="/pharmacy/" >
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="shortName">Введіть коротку назву</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" id="shortName" name="shortName" value="${pharmacy.shortName}">
                                    <p class="help-block"><form:errors path="shortName" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="name">Введіть назву</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" id="name" name="name" value="${pharmacy.name}">
                                    <p class="help-block"><form:errors path="name" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="legalForm">Введіть oрг.-пр.форму</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" id="legalForm" name="legalForm" value="${pharmacy.legalForm}">
                                    <p class="help-block"><form:errors path="legalForm" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="region">Введіть область</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" id="region" name="region" value="${pharmacy.region}">
                                    <p class="help-block"><form:errors path="region" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="calculationConsider"> Враховувати в разрах пит.ваг. </label>
                                <div class="col-sm-5 checkbox">
                                    <input type="checkbox" class="form-control" id="calculationConsider" name="calculationConsider" value="1" checked>
                                    <input type="hidden" name="calculationConsider" value="0" />
                                    <p class="help-block"><form:errors path="calculationConsider" /></p>
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
        <script src="/resources/libs/jquery/dist/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="/resources/libs/bootstrap/dist/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="/resources/libs/metisMenu/dist/metisMenu.min.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="/resources/assets/js/sb-admin-2.js"></script>
    </tiles:putAttribute>
</tiles:insertDefinition>
