<%--
  Created by IntelliJ IDEA.
  User: iveg0taname
  Date: 14.12.16
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title> Smart Market </title>
    <link href="../libs/Bootstrap/css/bootstrap.css" rel="stylesheet">
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../libs/Bootstrap/js/bootstrap.js"></script>
    <script src="../libs/jquery.tablesorter.js"></script>
    <link rel="stylesheet" type="text/css" href="../css/telephone.css">

</head>
<body>

<p align="right">
    <img src="../resources/logo.jpg" width="15%" height="15%"></p>
<p align="right">
<nav role="navigation" class="navbar navbar-default">
    <!-- Логотип и мобильное меню -->
    <div class="navbar-header">
        <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
    </div>
    <!-- Навигационное меню -->
    <div id="navbarCollapse" class="collapse navbar-collapse">
        <ul class="nav navbar-nav">
            <li class="active"><a href="main.jsp">Main</a></li>
            <li><a href="/PhoneServlet">Phones</a></li>
            <li><a href="/AccessoriesServlet">Accessories</a></li>
            <li><a href="/ManufacturerServlet">Manufacturer</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="home.jsp">Sign in</a></li>
        </ul>
    </div>
</nav>

</body>
</html>