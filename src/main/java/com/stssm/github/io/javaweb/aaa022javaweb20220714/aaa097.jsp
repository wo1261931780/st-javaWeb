<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  Bbb010User: 1
  Date: 2022-07-14
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test = "true">
    <%--要创建一个绑定声明，否则会报错--%>
    <h1>我是true</h1>
</c:if>
<c:if test = "false">
    <h2>我是false</h2>
</c:if>
<hr>

<c:if test = "${status ==1}">
    <h1>我是启动，status为1</h1>
</c:if>
<%--不能直接访问页面，否则没有数据--%>
<%--数据都是资源转发过去的--%>
<c:if test = ""></c:if>
<hr>
<c:forEach items = "${brands}" var = "brand" varStatus = "indexDemo">
    <tr text-align = "center">
        <td>${indexDemo.index}</td>
            <%--索引，从0开始--%>
        <td>${indexDemo.count}</td>
            <%--计数，从1开始--%>
        <td>${brand.id}</td>
        <td>${brand.brandName}</td>
        <td>${brand.companyName}</td>
        <td>${brand.ordered}</td>
        <td>${brand.description}</td>
        <c:if test = "${brand.status==1}">
            <td>启用</td>
        </c:if>
        <c:if test = "${brand.status!=1}">
            <td>弃用</td>
        </c:if>
    </tr>
    <br>

</c:forEach>
<hr>
<c:forEach begin = "0" end = "10" step = "1" var = "i">
    ${i}
    <%--直接遍历出索引，这里可以用来做分页的工具条--%>
</c:forEach>


</body>
</html>
