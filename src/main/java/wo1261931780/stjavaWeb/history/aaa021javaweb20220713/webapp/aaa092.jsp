<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2022-07-12
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--jsp，java serve page页面--%>
<%--java服务端页面--%>
<%--可以动态展示java代码内容--%>
<h1>我是jsp页面</h1>
<% System.out.println("我是java代码打印出来的内容");%>
<%--相当于，html内容和java代码的内容都可以同时出现在一个页面上--%>
<%--对应二者的展示区域不一样--%>
<%--jsp的核心目的在于简化开发，一个页面中，即可以用html展示，还可以包含一部门的java代码--%>
<%--tomcat中已经包含了jsp的jar包，如果打包的时候一起打，会冲突导致报错--%>








</body>
</html>
