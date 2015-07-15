<%--
  Created by IntelliJ IDEA.
  User: valentyn
  Date: 7/15/15
  Time: 12:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<tiles:insertDefinition name="basetemplate">
    <tiles:putAttribute name="body">

        <div class="row">
            <div class="col-lg-12">
                <div class="page-header ">
                    <form:form action="/coefic/list">
                        <select name="year">
                            <c:forEach var="year" items="${years}">
                                <option value="${year.name}">${year.name}</option>
                            </c:forEach>
                        </select>
                        <select name="month">
                            <option value="січень">Січень</option>
                            <option value="лютий">Лютий</option>
                            <option value="березень">Березень</option>
                            <option value="квітень">Квітень</option>
                            <option value="травень">Травень</option>
                            <option value="червень">Червень</option>
                            <option value="липень">Липень</option>
                            <option value="серпень">Серпень</option>
                            <option value="вересень">Вересень</option>
                            <option value="жовтень">Жовтень</option>
                            <option value="листопад">Листопад</option>
                            <option value="грудень">Грудень</option>
                        </select>
                        <button id="submit" type="submit"> Звіт </button>
                    </form:form>
                </div>
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->

        <div class="row">
            <div class="col-lg-20">
                <div class="panel panel-default">
                    <div class="panel-heading">
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="dataTable_wrapper">
                            <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                <tr>
                                    <th>Aптека</th>
                                    <th>Виторг</th>
                                    <th>%PH</th>
                                    <th>ВД+</th>
                                    <th>%Ввсі</th>
                                    <th>%Вфоп</th>
                                    <th>%Впп</th>
                                    <th>%Втов</th>
                                    <th>%серарвсі</th>
                                    <th>%серарфоп</th>
                                    <th>%серарпп</th>
                                    <th>%серартов</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="coefficient" items="${coefficients}">
                                    <tr>
                                        <td>${coefficient.pharmacy.shortName}</td>
                                        <td>
                                            <fmt:formatNumber type="number"
                                                              maxFractionDigits="2" value="${coefficient.profit}" />
                                        </td>
                                        <td>
                                            <fmt:formatNumber type="number"
                                                              maxFractionDigits="2" value="${coefficient.PH}" />
                                            %
                                        </td>
                                        <td>
                                            <fmt:formatNumber type="number"
                                                              maxFractionDigits="2" value="${coefficient.GI}" />
                                        </td>
                                        <td>
                                            <fmt:formatNumber type="number"
                                                              maxIntegerDigits="2"
                                                              maxFractionDigits="2" value="${coefficient.rateAll}" />
                                            %
                                        </td>
                                        <td>
                                            <fmt:formatNumber type="number"
                                                              maxIntegerDigits="2"
                                                              maxFractionDigits="2" value="${coefficient.rateFOP}" />
                                            %
                                        </td>
                                        <td>
                                            <fmt:formatNumber type="number"
                                                              maxIntegerDigits="2"
                                                              maxFractionDigits="2" value="${coefficient.ratePP}" />
                                            %
                                        </td>
                                        <td>
                                            <fmt:formatNumber type="number"
                                                              maxIntegerDigits="2"
                                                              maxFractionDigits="2" value="${coefficient.rateTOV}" />
                                            %
                                        </td>
                                        <td>
                                            <fmt:formatNumber type="number"
                                                              maxIntegerDigits="2"
                                                              maxFractionDigits="2" value="${coefficient.averageAll}" />
                                            %
                                        </td>
                                        <td>
                                            <fmt:formatNumber type="number"
                                                              maxIntegerDigits="2"
                                                              maxFractionDigits="2" value="${coefficient.averageFOP}" />
                                            %
                                        </td>
                                        <td>
                                            <fmt:formatNumber type="number"
                                                              maxIntegerDigits="2"
                                                              maxFractionDigits="2" value="${coefficient.averagePP}" />
                                            %
                                        </td>
                                        <td>
                                            <fmt:formatNumber type="number"
                                                              maxIntegerDigits="2"
                                                              maxFractionDigits="2" value="${coefficient.averageTOV}" />
                                            %
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
