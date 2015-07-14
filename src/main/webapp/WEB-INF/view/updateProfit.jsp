<%--
  Created by IntelliJ IDEA.
  User: valentyn
  Date: 7/13/15
  Time: 11:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<tiles:insertDefinition name="basetemplate">
    <tiles:putAttribute name="body">
        <c:url var="updateUrl" value="/profit/update"/>
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Редагування доходу</h1>
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
                        <form:form  class ="form-horizontal"  method="POST" modelAttribute="profitForm" action="/profit/update/${profitForm.id}" >
                            <input type="hidden" name="id" value="${profitForm.id}"/>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="month">Введіть місяць</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" id="month" name="month" value="${profitForm.month}">
                                    <p class="help-block"><form:errors path="month" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="year">Введіть рік</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" type="number" id="year" name="year" value="${profitForm.year}">
                                    <p class="help-block"><form:errors path="year" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="pharmacy">Введіть об'єкт</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" id="pharmacy" name="pharmacy" value="${profitForm.pharmacy}">
                                    <p class="help-block"><form:errors path="pharmacy" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="profit">Введіть виторги</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" id="profit" name="profit" value="${profitForm.profit}">
                                    <p class="help-block"><form:errors path="profit" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="PH"> Введіть PH </label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" id="PH" name="PH" type="number" value="${profitForm.PH}" step="0.01">
                                    <p class="help-block"><form:errors path="PH" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="GI">Введіть ВД</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" id="GI" name="GI" value="${profitForm.GI}">
                                    <p class="help-block"><form:errors path="GI" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="GIBonus">ВД+бонус</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" type="number" id="GIBonus" name="GIBonus" value="${profitForm.GIBonus}" step="0.01">
                                    <p class="help-block"><form:errors path="GIBonus" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="GIDeposit">ВД+депозит</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" type="number" id="GIDeposit" name="GIDeposit" value="${profitForm.GIDeposit}">
                                    <p class="help-block"><form:errors path="GIDeposit" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="GIAnother1">ВД+інше1</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" type="number" id="GIAnother1" name="GIAnother1" value="${profitForm.GIAnother1}">
                                    <p class="help-block"><form:errors path="GIAnother1" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="GIAnother2">ВД+інше2</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" type="number" id="GIAnother2" name="GIAnother2" value="${profitForm.GIAnother2}">
                                    <p class="help-block"><form:errors path="GIAnother2" /></p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="GITotal">ВД+всього</label>
                                <div class="col-sm-5 ">
                                    <input class="form-control" type="number" id="GITotal" name="GITotal" value="${profitForm.GITotal}" step="0.01">
                                    <p class="help-block"><form:errors path="GITotal" /></p>
                                </div>
                            </div>
                            <button type="submit" class="btn btn-default">Редагувати</button>
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
