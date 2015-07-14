 <%--
  Created by IntelliJ IDEA.
  User: valentyn
  Date: 7/10/15
  Time: 3:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Navigation -->

    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="">Pharmacy v1.0</a>
    </div>
    <!-- /.navbar-header -->

    <ul class="nav navbar-top-links navbar-left">
        <li class="dropdown">
            <a id="dLabel"  data-toggle="dropdown" href="#">
                Довідники  <i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu">
                <li class="dropdown-submenu">
                    <a tabindex="-1" href="#">Рік</a>
                    <ul class="dropdown-menu">
                        <li><a tabindex="-1" href="/year/list">Cписок</a></li>
                        <li><a href="/year/createForm">Створити</a></li>
                    </ul>
                </li>
                <li class="divider"></li>
                <li class="dropdown-submenu">
                    <a tabindex="-1" href="#">Облікова система</a>
                    <ul class="dropdown-menu">
                        <li><a tabindex="-1" href="/acs/list">Cписок</a></li>
                        <li><a href="/acs/createForm">Створити</a></li>
                    </ul>
                </li>
                <li class="divider"></li>
                <li class="dropdown-submenu">
                    <a tabindex="-1" href="#">Статті</a>
                    <ul class="dropdown-menu">
                        <li><a tabindex="-1" href="/clause/list">Cписок</a></li>
                        <li><a href="/clause/createForm">Створити</a></li>
                    </ul>
                </li>
                <li class="divider"></li>
                <li class="dropdown-submenu">
                    <a tabindex="-1" href="#">Cпосіб розподілу</a>
                    <ul class="dropdown-menu">
                        <li><a tabindex="-1" href="/disway/list">Cписок</a></li>
                        <li><a href="/disway/createForm">Створити</a></li>
                    </ul>
                </li>
                <li class="divider"></li>
                <li class="dropdown-submenu">
                    <a tabindex="-1" href="#">Cпосіб розподілу</a>
                    <ul class="dropdown-menu">
                        <li><a tabindex="-1" href="/disway/list">Cписок</a></li>
                        <li><a href="/disway/createForm">Створити</a></li>
                    </ul>
                </li>
                <li class="divider"></li>
                <li class="dropdown-submenu">
                    <a tabindex="-1" href="#">Аптека</a>
                    <ul class="dropdown-menu">
                        <li><a tabindex="-1" href="/pharmacy/list">Cписок</a></li>
                        <li><a href="/pharmacy/createForm">Створити</a></li>
                    </ul>
                </li>
            </ul>
            
            
            <!-- /.dropdown-messages -->
        </li>
        <!-- /.dropdown -->
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                <i class=" fa-dollar fa we"></i>  <i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu dropdown-user">
                <li class="dropdown-submenu">
                    <a tabindex="-1" href="#">Доходи</a>
                    <ul class="dropdown-menu">
                        <li><a tabindex="-1" href="/profit/list">Cписок</a></li>
                        <li><a href="/profit/createForm">Створити</a></li>
                    </ul>
                </li>
                <li class="divider"></li>
                <li class="dropdown-submenu">
                    <a tabindex="-1" href="#">Витрати</a>
                    <ul class="dropdown-menu">
                        <li><a tabindex="-1" href="/expense/list">Cписок</a></li>
                        <li><a href="/expense/createForm">Створити</a></li>
                    </ul>
                </li>
            </ul>
            <!-- /.dropdown-user -->
        </li>
        <!-- /.dropdown -->
    </ul>
 <%--<li class="dropdown-submenu">--%>
 <%--<a href="#">Even More..</a>--%>
 <%--<ul class="dropdown-menu">--%>
 <%--<li><a href="#">3rd level</a></li>--%>
 <%--<li><a href="#">3rd level</a></li>--%>
 <%--</ul>--%>
 <%--</li>--%>