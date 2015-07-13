<%--
  Created by IntelliJ IDEA.
  User: valentyn
  Date: 7/12/15
  Time: 9:10 PM
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
                <h1 class="page-header">Список аптек</h1>
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->

        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        Аптеки
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="dataTable_wrapper">
                            <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                <tr>
                                    <th>Скорочена назва</th>
                                    <th>Повна назва</th>
                                    <th>Орг.-пр. форма</th>
                                    <th>Область</th>
                                    <th>Враховувати в разрах пит. ваг.</th>
                                    <th></th>
                                    <th></th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="pharmacy" items="${pharmaciesList}">
                                    <tr class="odd gradeX">
                                        <td >${pharmacy.shortName}</td>
                                        <td >${pharmacy.name}</td>
                                        <td >${pharmacy.legalForm}</td>
                                        <td >${pharmacy.region}</td>
                                        <td>
                                            <span <c:if test="${pharmacy.calculationConsider}">class="glyphicon glyphicon-ok" </c:if>
                                                  <c:if test="${!pharmacy.calculationConsider}">class="glyphicon glyphicon-minus" </c:if>
                                                  aria-hidden="true">
                                            </span>
                                        </td>
                                        <td>
                                            <a href="/pharmacy/updateForm/${pharmacy.id}">Редагувати</a><br/>
                                        </td>
                                        <td>
                                            <a href="/pharmacy/${pharmacy.id}">Видалити</a><br/>
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
