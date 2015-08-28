<%--
  Created by IntelliJ IDEA.
  User: valentyn
  Date: 8/28/15
  Time: 9:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<tiles:insertDefinition name="basetemplate">
    <tiles:putAttribute name="body">
        <div class ="body">
            <c:url var="addUrl" value="/addUser"/>
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Registration page</h1>
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->
        <div class="row">
        <div class="col-lg-9">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h2>Spring Security Registration Form (Database Authentication)</h2>
            </div>
            <div class="panel-body">
                <form:form
                        action="${addUrl}" method="post" modelAttribute="user" id="registrationForm" class="form-horizontal">
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="firstName">
                            Name
                        </label>
                        <div class="col-xs-5">
                            <input type="text" class="form-control" id="firstName" name="firstName" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="lastName">
                            Name
                        </label>
                        <div class="col-xs-5">
                            <input type="text" class="form-control" id="lastName" name="lastName" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="email">
                            Email
                        </label>
                        <div class="col-xs-5">
                            <input type="email" class="form-control" id="email" name="email" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="login">
                            Login
                        </label>
                        <div class="col-xs-5">
                            <input type="text" class="form-control" id="login" name="login"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="password">
                            Password
                        </label>
                        <div class="col-xs-5">
                            <input type="password" class="form-control" name="password" id = "password" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2" for="confirmPassword">
                            Confirm password
                        </label>
                        <div class="col-xs-5">
                            <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" />
                        </div>
                        <div id="login-errors" class ='login-error'></div>
                    </div>

                    <div class="form-group">
                        <div class="col-xs-9 col-xs-offset-3">
                            <button id="submit" name="signup" type="submit" class="btn btn-primary" name="sign up" value="">
                                Sign up
                            </button>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>

        <script src="/resources/js/jquery/jquery-validate.js"></script>
        <script src="/resources/js/registration.js"></script>
    </tiles:putAttribute>
</tiles:insertDefinition>
