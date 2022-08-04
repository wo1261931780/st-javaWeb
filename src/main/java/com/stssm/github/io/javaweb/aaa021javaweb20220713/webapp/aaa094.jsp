<%@ page import = "com.itheima.pojo.Brand" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "java.util.List" %><%--
  Created by IntelliJ IDEA.
  Bbb010User: 1
  Date: 2022-07-13
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<Brand> brands = new ArrayList<>();
    brands.add(new Brand(1, "三只松鼠", "三只松鼠", 100, "三只松鼠，好吃不上火", 1));
    brands.add(new Brand(2, "优衣库", "优衣库", 200, "优衣库，服适人生", 0));
    brands.add(new Brand(3, "小米", "小米科技有限公司", 1000, "为发烧而生", 1));
%>
<table border = "1" cellspacing = "0" width = "800">
    <tr>
        <th>序号</th>
        <th>品牌名称</th>
        <th>企业名称</th>
        <th>排序</th>
        <th>品牌介绍</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
    <%
        for (int i = 0; i < brands.size(); i++) {
            Brand brand = brands.get(i);
            System.out.println(brand.toString());

    %>

    <tr>
        <th><%=brand.getId()%>
        </th>
        <th><%=brand.getBrandName()%>
        </th>
        <th><%=brand.getCompanyName()%>
        </th>
        <th><%=brand.getOrdered()%>
        </th>
        <th><%=brand.getDescription()%>
        </th>
        <th><%=brand.getStatus()%>
        </th>
        <th><%=brand.getDescription()%>
        </th>
    </tr>
    <%
        }
    %>
    <%--ajax其实就是异步的JavaScript--%>
    <%--在servlet和jsp共存的时期--%>
    <%--    servlet负责数据的处理，jsp负责数据的展示，二者是协同使用的--%>
    <%--    再后来，使用的就是servlet+html+jsp一起使用--%>

</table>


</body>
</html>
