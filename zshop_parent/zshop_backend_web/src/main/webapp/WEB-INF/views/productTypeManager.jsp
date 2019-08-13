<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" />
    <link href="http://cdn.bootcss.com/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
    <link href="https://cdn.bootcss.com/flat-ui/2.3.0/css/flat-ui.min.css" rel="stylesheet">
</head>
<body>
<h2>商品类型管理界面</h2>
<div class="panel-body">
    <input type="button" value="添加商品类型"/>
    <br>
    <br>
    <div class="show-list">
        <table class="table table-striped">
            <thead>
            <tr class="text-danger">
                <th class="text-center">编号</th>
                <th class="text-center">类型名称</th>
                <th class="text-center">状态</th>
                <th class="text-center">操作</th>
            </tr>
            </thead>
            <tbody id="tb">
                <c:forEach items="${productTypes}" var="prodectType">
                    <tr>
                        <td class="text-center">${prodectType.id}</td>
                        <td class="text-center">${prodectType.name}</td>
                        <td class="text-center">
                            <c:if test="${prodectType.status==1}">启用</c:if>
                            <c:if test="${prodectType.status==0}">禁用</c:if>
                        </td>
                        <td class="text-center">
                            <c:if test="${prodectType.status==0}">
                                <a class="btn btn-default" href="#" role="button">修改</a>
                            </c:if>

                            <c:if test="${prodectType.status==1}">
                                <a class="btn btn-default" href="#" role="button">禁用</a>
                            </c:if>

                        </td>
                    </tr>
                </c:forEach>
                <tr>
                    <td>1</td>
                    <td>aaa</td>
                    <td>启用</td>
                    <td class="text-center">
						<input type="button" value="修改"/>
                    <input type="button" value="禁用"/>
                    </td>
                </tr>

            </tbody>
        </table>
    </div>
</div>
</body>
</html>
