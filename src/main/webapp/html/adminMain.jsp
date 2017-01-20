<%--
  Created by IntelliJ IDEA.
  User: ivegotaname
  Date: 14.12.16
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
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
<form ${sessionScope.ifNotRegistered} action="/LogoutServlet">
    <h3> user: ${sessionScope.user.firstName} ${sessionScope.user.secondName}
        <input type="submit" value="Logout"></h3>
</form>
    <nav role="navigation" class="navbar navbar-default" >
        <!-- Логотип и мобильное меню -->
        <div class="navbar-header">
            <button type="button" data-target="#navbarCollapse"  data-toggle="collapse" class="navbar-toggle">
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
                <li><a href="telephone.jsp">Phones</a></li>
                <li><a href="accessories.jsp">Accessories</a></li>
                <li><a href="manufacturer.jsp">Manufacturer</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right" >
                <li><a href="profile.jsp">Profile</a></li>
                <li><a href="/LogoutServlet">Exit</a></li>
            </ul>
        </div>
    </nav>
<center><table>
    <tbody>
    <tr>
    <th><h1>Add Phone</h1></th>
        <th><h1>Add Accessories</h1></th>
        <th><h1>Add Manufacturer</h1></th>
    </tr>


    <tr>
        <td>

<form name="createPhone" method="post" action="/CreatePhoneServlet">
    <input type="text" name="model" placeholder="Model"/> </br>
    <input type="text" name="code" placeholder="Code"/> </br>
    <input type="text" name="manufacturer" placeholder="Manufacturer"/> </br>
    <input type="text" name="description" placeholder="Description"/> </br>
    <input type="text" name="sizes" placeholder="Size"/> </br>
    <input type="text" name="pricePolicy" placeholder="PricePolicy"/> </br>
    <input type="text" name="garantyDays" placeholder="GuarantyDays"/> </br>
    <input type="text" name="count" placeholder="Count"/> </br>
    <input type="text" name="price" placeholder="Price"/> </br>
    <input type="submit" value="Add Phone"/>
</form>
</td>
        <td>
<form name="createAccessories" method="post" action="/CreateAccessoriesServlet">

    <input type="text" name="sertificate" placeholder="Sert"/> </br>
    <input type="text" name="accessoryType" placeholder="Type"/> </br>
    <input type="text" name="price" placeholder="Price"/> </br>
    <input type="text" name="model" placeholder="Model"/> </br>
    <input type="text" name="count" placeholder="Count"/> </br>
    <input type="text" name="description" placeholder="Description"/> </br>
    <input type="text" name="manufacturer" placeholder="Manufacturer"/> </br>
    <input type="submit" value="Add Accessories"/>
</form>
</td>
        <td>
<form name="createManufacturer" method="post" action="/CreateManufacturerServlet">

    <input type="text" name="nameMan" placeholder="Manufacturer name"/> </br>
    <input type="text" name="country" placeholder="Country"/> </br>
    <input type="text" name="deliveryType" placeholder="Delivery Type"/> </br>
    <input type="text" name="deliveryDays" placeholder="Delivery Days"/> </br>
    <input type="submit" value="Add Manufacturer"/>
</form>
    </td>
    </tr>
    </tbody>
    </table></center>
<br>
<hr>
<h2> List of users</h2>
<form name="userForm" action="/DeleteUserServlet" method="post">
    <table>
        <tbody>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Surname</th>
            <th>Login</th>
            <th>Birthday</th>
            <th>Role</th>
            <th>Email</th>
            <th>Del</th>
        </tr>
        <c:forEach items="${sessionScope.userDTOs}" var="userDTO">
            <tr>
                <td><c:out value="${userDTO.id}"></c:out></td>
                <td><c:out value="${userDTO.firstName}"></c:out></td>
                <td><c:out value="${userDTO.secondName}"></c:out></td>
                <td><c:out value="${userDTO.login}"></c:out></td>
                <td><c:out value="${userDTO.birthday}"></c:out></td>
                <td><c:out value="${userDTO.role}"></c:out></td>
                <td><c:out value="${userDTO.email}"></c:out></td>
                <td><input type="radio" name="idUserDelete" value="${userDTO.id}"/></td>
            </tr>
            <br>
        </c:forEach>
        </tbody>
    </table>
    <br>
    <input type="submit" value="Delete user"/>
</form>
<br>
<hr>
<h2> List of phones</h2>
<form name="someName" method="post" action="/DeletePhoneServlet">
    <table>
        <tbody>
        <tr>
            <th>Id</th>
            <th>Description</th>
            <th>Size</th>
            <th>Price Policy</th>
            <th>Guaranty</th>
            <th>Count</th>
            <th>Code</th>
            <th>Price</th>
            <th>Del</th>
        </tr>
        <c:forEach items="${sessionScope.phoneDTOs}" var="phoneDTO">
            <tr>
                <td><c:out value="${phoneDTO.id}"></c:out></td>
                <td><c:out value="${phoneDTO.description}"></c:out></td>
                <td><c:out value="${phoneDTO.sizes}"></c:out></td>
                <td><c:out value="${phoneDTO.pricePolicy}"></c:out></td>
                <td><c:out value="${phoneDTO.garantyDays}"></c:out></td>
                <td><c:out value="${phoneDTO.count}"></c:out></td>
                <td><c:out value="${phoneDTO.code}"></c:out></td>
                <td><c:out value="${phoneDTO.price}"></c:out></td>
                <td><input type="radio" name="idPhoneDelete" value="${phoneDTO.id}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <br>
    <input type="submit" value="Delete phone"/>
</form>
<br>
<hr>
<h2> List of accessories</h2>
<form name="someName" method="post" action="/DeleteAccessoriesServlet">
    <table>
        <tbody>
        <tr>
            <th>Id</th>
            <th>Sertificate</th>
            <th>AccessoriesType</th>
            <th>Description</th>
            <th>Price</th>
            <th>Model</th>
            <th>Count</th>
            <th>Del</th>
        </tr>
        <c:forEach items="${sessionScope.accessoriesDTOs}" var="accessoriesDTO">
            <tr>
                <td><c:out value="${accessoriesDTO.id}"></c:out></td>
                <td><c:out value="${accessoriesDTO.sertificate}"></c:out></td>
                <td><c:out value="${accessoriesDTO.accessoryType}"></c:out></td>
                <td><c:out value="${accessoriesDTO.description}"></c:out></td>
                <td><c:out value="${accessoriesDTO.price}"></c:out></td>
                <td><c:out value="${accessoriesDTO.model}"></c:out></td>
                <td><c:out value="${accessoriesDTO.count}"></c:out></td>
                <td><input type="radio" name="idAccessoriesDelete" value="${accessoriesDTO.id}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <br>
    <input type="submit" value="Delete accossories"/>
</form>
<br>
<hr>
<h2> List of manufacturers</h2>
<form name="someName" method="post" action="/DeleteManufacturerServlet">
    <table>
        <tbody>
        <tr>
            <th>Id</th>
            <th>Manufacturer</th>
            <th>Country</th>
            <th>Delivery Type</th>
            <th>Delivery Days</th>
            <th>Del</th>
        </tr>
        <c:forEach items="${sessionScope.manufacturerDTOs}" var="manufacturerDTO">
            <tr>
                <td><c:out value="${manufacturerDTO.id}"></c:out></td>
                <td><c:out value="${manufacturerDTO.nameMan}"></c:out></td>
                <td><c:out value="${manufacturerDTO.country}"></c:out></td>
                <td><c:out value="${manufacturerDTO.deliveryTpe}"></c:out></td>
                <td><c:out value="${manufacturerDTO.deliveryDays}"></c:out></td>
                <td><input type="radio" name="idManufacturerDelete" value="${manufacturerDTO.id}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <br>
    <input type="submit" value="Delete manufacturer"/>
</form>
</body>
</html>
