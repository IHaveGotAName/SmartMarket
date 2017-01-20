<%--
  Created by IntelliJ IDEA.
  User: ivegotaname
  Date: 13.12016
  Time: 16:57
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
                <li class="active"><a href="/PhoneServlet">Phones</a></li>
                <li><a href="/AccessoriesServlet">Accessories</a></li>
                <li><a href="/ManufacturerServlet">Manufacturer</a></li>
            </ul>
       <%--     <ul class="nav navbar-nav navbar-right">
                <li><a href="home.jsp">Войти</a></li>
            </ul>--%>
        </div>
    </nav>
    </form>
    <h2> List of phones</h2>
    <form name="someName" method="post" action="/BuyPhoneServlet">
        <table>
            <tbody>
            <tr>
                <th>Id</th>
                <%--<th>Manufacturer</th>--%>
                <th>Model</th>
                <th>Description</th>
                <th>Size</th>
                <th>Price Policy</th>
                <th>Guaranty</th>
                <th>Count</th>
                <th>Code</th>
                <th>Price</th>
                <th>Buy</th>
            </tr>
            <c:forEach items="${sessionScope.phoneDTOs}" var="phoneDTO">
                <tr>
                    <td><c:out value="${phoneDTO.id}"></c:out></td>
                    <%--<td><c:out value="${phoneDTO.manufacturer}"></c:out></td>--%>
                    <td><c:out value="${phoneDTO.model}"></c:out></td>
                    <td><c:out value="${phoneDTO.description}"></c:out></td>
                    <td><c:out value="${phoneDTO.sizes}"></c:out></td>
                    <td><c:out value="${phoneDTO.pricePolicy}"></c:out></td>
                    <td><c:out value="${phoneDTO.garantyDays}"></c:out></td>
                    <td><c:out value="${phoneDTO.count}"></c:out></td>
                    <td><c:out value="${phoneDTO.code}"></c:out></td>
                    <td><c:out value="${phoneDTO.price}"></c:out></td>
                    <td><input type="radio" name="idPhoneBuy" value="${phoneDTO.id}"/></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <br>
        <input type="submit" value="Buy phone"/>
    </form>
</body>
</html>