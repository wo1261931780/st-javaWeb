<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2022-07-16
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>我是jsp页面</h1>
<c:if test = ""></c:if>

<table>
    <c:forEach items = "${brand}" var = "brand" varStatus = "i">
        <td>
            <tr>品牌名称</tr>
            <tr>公司名称</tr>
            <tr>订单顺序</tr>
            <tr>描述</tr>
            <tr>状态</tr>
        </td>
        <td>
            <tr>${brand.brandName}</tr>
            <tr>${brand.companyName}</tr>
            <tr>${brand.ordered}</tr>
            <tr>${brand.description}</tr>
            <c:if test = "${brand.status ==1}">
                <tr>启用</tr>
            </c:if>
            <c:if test = "${brand.status !=1}">
                <tr>弃用</tr>
            </c:if>
        </td>
    </c:forEach>
</table>
<input type = "button" name = "123" id = "insert">

<script>
	document.getElementById("insert").click = function () {
		location.href = "/demo-app2/loginUp.html";
	}

</script>
</body>
</html>
