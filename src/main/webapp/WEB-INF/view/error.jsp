<%--
  Created by IntelliJ IDEA.
  User: valentyn
  Date: 7/11/15
  Time: 12:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="basetemplate">
    <tiles:putAttribute name="body">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Вибачте, відбулась помилка. Ця операція недоступна</h1>
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->
    </tiles:putAttribute>
</tiles:insertDefinition>
