<%--
  Created by IntelliJ IDEA.
  User: ivegotaname
  Date: 10.12.16
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<link href="http://getbootstrap.com/examples/signin/signin.css" rel="stylesheet">
<link href="../libs/Bootstrap/css/bootstrap.css" rel="stylesheet">
<script src="../js/check_reg.js"></script>
<link type="text/css" href="../css/style.css" rel="stylesheet" />
<script src="../libs/Bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="../js/jquery.js"></script>
<script type="text/javascript" src="../js/mocha.js"></script>


<head>
    <meta charset="UTF-8">
    <script src="../js/check_reg.js"></script>
</head>
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
                <li ><a href="main.jsp">Главная</a></li>
                <li><a href="telephone.jsp">Phones</a></li>
                <li><a href="accessories.jsp">Accessories</a></li>
                <li><a href="manufacturer.jsp">Manufacturer</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="home.jsp">Войти</a></li>
            </ul>
        </div>
    </nav>
    <h1><p align="center">Registration</p></h1>
<form class="form-signin" name="regForm" action="/RegistrationServlet" method="post" <%--onsubmit="return checkPassword(this);"--%>>
        <div class ="form-group">
            <input type="email" name="email" class="form-control"placeholder="Email" required="" > <p>Enter a valid email.</p>
            <div class="block">
                <input type="password" name ="password"id="inputPassword"/>
                <div id="complexity" class="default"><span class="default"></span></div>

            <%--<input type="password" name="password" class="form-control" placeholder="Password" required=""
                   minlength="6">--%>
                </div>

            <input type="text" name="login"class="form-control" placeholder="Login" required="">

            <input type="text" name="firstname" class="form-control" placeholder="FirstName" required="">

            <input type="text" name="secondname" class="form-control" placeholder="LastName" required="">

            <input type="text" name="birthday" class="form-control" placeholder="birthday" required="">
            <br />
            <label>Sex</label>
            <input type="radio" name="sex" value="male" />male
            <input type="radio" name="sex" value="female" />female
         </div>

    <button class="btn btn-lg btn-primary btn-block" type="submit" value="Register">Register</button>


</form>

</body>
</html>