<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2022-07-17
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    <label for = "account">我是账号：</label>
    <input type = "text" id = "account" value = "${brand.name}">
    <%--jsp页面中，不需要像之前的html一样传递数据--%>
    <%--直接按照el表达式去获取值就可以--%>
    <br>
    <label for = "password">我是密码：</label>
    <input type = "text" id = "password">
    ${brand.paw}
    <br>
    <input type = "button" value = "我是提交">
    <br>
    <input type = "checkbox" checked>
    <%--其实这里默认就是checked="checked"--%>
    <%--html的属性决定了，后面是可以省略的--%>

</form>
</body>
</html>
