<%--
  Created by IntelliJ IDEA.
  User: valentyn
  Date: 7/13/15
  Time: 12:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<tiles:insertDefinition name="basetemplate">
    <tiles:putAttribute name="body">
        <c:url var="createUrl" value="/expense/"/>
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Створення витрати</h1>
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
                        <form:form  class ="form-horizontal"  method="POST" modelAttribute="expenseForm" action="/expense/" >
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="month">Введіть місяць</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" id="month" name="month" value="${expenseForm.month}">
                                    <p class="help-block"><form:errors path="month" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="year">Введіть рік</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" type="number" id="year" name="year" value="${expenseForm.year}">
                                    <p class="help-block"><form:errors path="year" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="accountingSystem">Введіть облікову систему</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" id="accountingSystem" name="accountingSystem" value="${expenseForm.accountingSystem}">
                                    <p class="help-block"><form:errors path="accountingSystem" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="income"> Дохід </label>
                                <div class="col-sm-5 checkbox">
                                    <input type="checkbox" class="form-control" id="income" name="income" value="1">
                                    <input type="hidden" name="income" value="0" />
                                    <p class="help-block"><form:errors path="income" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="clause">Введіть cтаттю д/в</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" id="clause" name="clause" value="${expenseForm.clause}">
                                    <p class="help-block"><form:errors path="clause" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="distributionWay">Введіть спосіб розподілу</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" id="distributionWay" name="distributionWay" value="${expenseForm.distributionWay}">
                                    <p class="help-block"><form:errors path="distributionWay" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="name">Введіть назву</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" id="name" name="name" value="${expenseForm.name}">
                                    <p class="help-block"><form:errors path="name" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="sum">Введіть суму</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" type="number" id="sum" name="sum" value="${expenseForm.sum}">
                                    <p class="help-block"><form:errors path="sum" /></p>
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

