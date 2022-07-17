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
        <tr>
            <td>品牌名称</td>
            <td>公司名称</td>
            <td>订单顺序</td>
            <td>描述</td>
            <td>状态</td>
        </tr>
        <tr>
            <td>${brand.brandName}</td>
            <td>${brand.companyName}</td>
            <td>${brand.ordered}</td>
            <td>${brand.description}</td>
            <c:if test = "${brand.status ==1}">
                <td>启用</td>
            </c:if>
            <c:if test = "${brand.status !=1}">
                <td>弃用</td>
            </c:if>
            <td>
                <a href = "/demo-app2/selectByIdServlet?id=${brand.id}">修改</a>
            </td>
        </tr>
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
