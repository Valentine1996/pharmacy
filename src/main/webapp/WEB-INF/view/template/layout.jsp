<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="ua">
<head>
    <title>Pharmacy</title>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap Core CSS -->
    <link href="/resources/libs/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="/resources/assets/css/cascade-menu.css" rel="stylesheet"/>

    <!-- MetisMenu CSS -->
    <link href= "/resources/libs/metisMenu/dist/metisMenu.min.css" rel="stylesheet"/>

    <!-- DataTables CSS -->
    <link href="/resources/libs/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css" rel="stylesheet">

    <!-- DataTables Responsive CSS -->
    <link href="/resources/libs/datatables-responsive/css/dataTables.responsive.css" rel="stylesheet">
    <!-- Timeline CSS -->
    <link href="/resources/assets/css/timeline.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="/resources/assets/css/sb-admin-2.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="/resources/libs/morrisjs/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="/resources/libs/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
    <div id="wrapper">
        <!-- NAVIGATION -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <tiles:insertAttribute name="header"/>
            <div>
            <tiles:insertAttribute name="menu"/>
            </div>
        </nav>
        <div id="page-wrapper">
            <tiles:insertAttribute name="body"/>
        </div>
    </div>
</body>
</html>
