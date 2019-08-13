<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品信息管理</title>
    <link href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" />
    <link href="http://cdn.bootcss.com/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
    <link href="https://cdn.bootcss.com/flat-ui/2.3.0/css/flat-ui.min.css" rel="stylesheet">
</head>
<body>
<h2>商品信息管理界面</h2>
<input type="button" value="添加商品">
<br>
<br>
<div>
    <table class="table table-striped">
        <thead>
        <tr class="text-danger">
            <th class="text-center">编号</th>
            <th class="text-center">商品</th>
            <th class="text-center">价格</th>
            <th class="text-center">产品类型</th>
            <th class="text-center">操作</th>
        </tr>
        </thead>
        <tbody id="tb">
        <c:forEach items="${products}" var="product">
            <tr>
                <td class="text-center">${product.pid}</td>
                <td class="text-center">${product.pname}</td>
                <td class="text-center">${product.price}</td>
                <td class="text-center">类型</td>
                <td class="text-center">
                        <a class="btn btn-default" href="#" role="button">修改</a>

                </td>
            </tr>
        </c:forEach>


        <tr>
            <td class="text-center">1</td>
            <td class="text-center">手机</td>
            <td class="text-center">1999</td>
            <td class="text-center">数码</td>
            <td class="text-center">
                <input type="button" value="修改"/>
                <input type="button" value="禁用"/>
            </td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
