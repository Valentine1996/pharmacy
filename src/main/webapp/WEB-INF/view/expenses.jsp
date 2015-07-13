<%--
  Created by IntelliJ IDEA.
  User: valentyn
  Date: 7/13/15
  Time: 12:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="basetemplate">
    <tiles:putAttribute name="body">

        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Список витрат</h1>
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->

        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        Витрати
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="dataTable_wrapper">
                            <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                <tr>
                                    <th>Місяць</th>
                                    <th>Рік</th>
                                    <th>Облікова система</th>
                                    <th>Дохід</th>
                                    <th>Стаття д/в</th>
                                    <th>Cпосіб розподілу</th>
                                    <th>Назва</th>
                                    <th>Сума</th>
                                    <th></th>
                                    <th></th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="expense" items="${expenses}">
                                    <tr class="odd gradeX">
                                        <td >${expense.month}</td>
                                        <td >${expense.year.name}</td>
                                        <td >${expense.accountingSystem.name}</td>
                                        <td>
                                            <span <c:if test="${expense.income}">class="glyphicon glyphicon-ok" </c:if>
                                                  <c:if test="${!expense.income}">class="glyphicon glyphicon-minus" </c:if>
                                                  aria-hidden="true">
                                            </span>
                                        </td>
                                        <td >${expense.incomeExpenseClause.name}</td>
                                        <td >${expense.distributionWay.name}</td>
                                        <td >${expense.name}</td>
                                        <td >${expense.sum}</td>
                                        <td>
                                            <a href="/expense/updateForm/${expense.id}">Редагувати</a><br/>
                                        </td>
                                        <td>
                                            <a href="/expense/${expense.id}">Видалити</a><br/>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                        <!-- /.table-responsive -->

                    </div>
                    <!-- /.panel-body -->
                </div>
                <!-- /.panel -->
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->
        <!-- jQuery -->
        <script src="/resources/libs/jquery/dist/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="/resources/libs/bootstrap/dist/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="/resources/libs/metisMenu/dist/metisMenu.min.js"></script>

        <!-- DataTables JavaScript -->
        <script src="/resources/libs/datatables/media/js/jquery.dataTables.min.js"></script>
        <script src="/resources/libs/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="/resources/assets/js/sb-admin-2.js"></script>

        <script>
            $(document).ready(function() {
                $('#dataTables-example').DataTable({
                    responsive: true
                });
            });
        </script>
    </tiles:putAttribute>
</tiles:insertDefinition>
