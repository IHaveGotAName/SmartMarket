<%--
  Created by IntelliJ IDEA.
  User: ivegotaname
  Date: 15.12.16
  Time: 6:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta charset="UTF-8">
    <link href="../libs/Bootstrap/css/bootstrap.css" rel="stylesheet">
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../libs/Bootstrap/js/bootstrap.js"></script>
    <script src="../libs/jquery.tablesorter.js"></script>
    <link rel="stylesheet" type="text/css" href="../css/telephone.css">
</head>
<form>
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
                    <li ><a href="html/mainIN.jsp">Main</a></li>
                    <li><a href="/PhoneServlet">Phones</a></li>
                    <li class="active"><a href="/AccessoriesServlet">Accessories</a></li>
                    <li><a href="/ManufacturerServlet">Manufacturer</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right" >
                    <li><a href="profile.jsp">Profile</a></li>
                    <li><a href="/LogoutServlet">Exit</a></li>
                </ul>
                <%--     <ul class="nav navbar-nav navbar-right">
                         <li><a href="home.jsp">Войти</a></li>
                     </ul>--%>
            </div>
        </nav>
</form>
<h2> List of accessories</h2>
<form name="someName" method="post" action="/BuyAccessoriesServlet">
    <table>
        <tbody>
        <tr>
            <th>Id</th>
            <th>Sertificate</th>
            <th>AccessoriesType</th>
            <th>Description</th>
            <th>Price</th>
            <th>Model</th>
            <th>Manufacturer</th>
            <th>Count</th>
            <th>Buy</th>
        </tr>
        <c:forEach items="${sessionScope.accessoriesDTOs}" var="accessoriesDTO">
            <tr>
                <td><c:out value="${accessoriesDTO.id}"></c:out></td>
                <td><c:out value="${accessoriesDTO.sertificate}"></c:out></td>
                <td><c:out value="${accessoriesDTO.accessoryType}"></c:out></td>
                <td><c:out value="${accessoriesDTO.description}"></c:out></td>
                <td><c:out value="${accessoriesDTO.price}"></c:out></td>
                <td><c:out value="${accessoriesDTO.model}"></c:out></td>
                <td><c:out value="${accessoriesDTO.manufacturer}"></c:out></td>
                <td><c:out value="${accessoriesDTO.count}"></c:out></td>
                <td><input type="radio" name="idAccessoriesBuy" value="${accessoriesDTO.id}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <br>
    <input type="submit" value="Buy accossories"/>
</form>
</body>
</html>
