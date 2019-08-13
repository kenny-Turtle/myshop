<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户信息管理</title>
    <link href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" />
    <link href="http://cdn.bootcss.com/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
    <link href="https://cdn.bootcss.com/flat-ui/2.3.0/css/flat-ui.min.css" rel="stylesheet">
</head>
<body>
<h2>客户信息管理界面</h2>
<input type="button" value="添加客户">
<br>
<br>
<div>
    <table class="table table-striped">
        <thead>
        <tr class="text-danger">
            <th class="text-center">编号</th>
            <th class="text-center">姓名</th>
            <th class="text-center">登录名</th>
            <th class="text-center">密码</th>
            <th class="text-center">手机号</th>
            <th class="text-center">操作</th>
        </tr>
        </thead>
        <tbody id="tb">
        <c:forEach items="${customers}" var="customer">
            <tr>
                <td class="text-center">${customer.id}</td>
                <td class="text-center">${customer.name}</td>
                <td class="text-center">${customer.login_name}</td>
                <td class="text-center">${customer.password}</td>
                <td class="text-center">${customer.phone}</td>
                    <%--                <td class="text-center">${prodect.productTypeId}</td>--%>
                <td class="text-center">
                    <a class="btn btn-default" href="#" role="button">修改</a>

                </td>
            </tr>
        </c:forEach>



        </tbody>
    </table>
</div>
</body>
</html>
