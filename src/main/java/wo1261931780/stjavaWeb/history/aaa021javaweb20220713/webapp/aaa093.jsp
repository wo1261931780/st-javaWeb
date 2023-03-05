<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2022-07-13
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>我是jsp页面</div>
<%
    LOG_SHOW.debug("我是java代码");
    int demo = 3;
    // 在百分号括号中，最后都会被放到jspService方法体内
%>
<%--jsp本质上就是一个servlet类型的java文件--%>
<%--jsp容器（tomcat）将其转换后，变成java文件，经过编译变成class--%>
<%= "我是demo：" + demo%>
<%--这里是放到页面上，作为展示使用的--%>
<%!
    // private static final Logger LOG_SHOW = ;

    void show() {
    }

    String name = "123";
%>
<%= name %>
<%--其实这些都是java代码，只不过不同的标签类型，将其放到了不同的位置--%>

</body>
</html>
