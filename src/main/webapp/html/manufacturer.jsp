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
                    <li ><a href="html/main.jsp">Main</a></li>
                    <li><a href="/PhoneServlet">Phones</a></li>
                    <li><a href="/AccessoriesServlet">Accessories</a></li>
                    <li class="active"><a href="/ManufacturerServlet">Manufacturer</a></li>
                </ul>
                <%--     <ul class="nav navbar-nav navbar-right">
                         <li><a href="home.jsp">Войти</a></li>
                     </ul>--%>
            </div>
        </nav>
    </form>
    <h2> List of manufacturers</h2>
        <table>
            <tbody>
            <tr>
                <th>Id</th>
                <th>Manufacturer</th>
                <th>Country</th>
                <th>Delivery Type</th>
                <th>Delivery Days</th>
            </tr>
            <c:forEach items="${sessionScope.manufacturerDTOs}" var="manufacturerDTO">
                <tr>
                    <td><c:out value="${manufacturerDTO.id}"></c:out></td>
                    <td><c:out value="${manufacturerDTO.nameMan}"></c:out></td>
                    <td><c:out value="${manufacturerDTO.country}"></c:out></td>
                    <td><c:out value="${manufacturerDTO.deliveryTpe}"></c:out></td>
                    <td><c:out value="${manufacturerDTO.deliveryDays}"></c:out></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <br>
        <input type="submit" value="manufacturer"/>

    </body>
</html>
