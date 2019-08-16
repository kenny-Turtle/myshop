<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员信息</title>
    <link href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" />
    <link href="http://cdn.bootcss.com/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
    <link href="https://cdn.bootcss.com/flat-ui/2.3.0/css/flat-ui.min.css" rel="stylesheet">
</head>

<style>
    .black_overlay{
        display: none;
        position: absolute;
        top: 0%;
        left: 0%;
        width: 100%;
        height: 100%;
        background-color: black;
        z-index:1001;
        -moz-opacity: 0.8;
        opacity:.80;
        filter: alpha(opacity=88);
    }
    .white_content {
        display: none;
        position: absolute;
        top: 25%;
        left: 25%;
        width: 55%;
        height: 55%;
        padding: 20px;
        border: 10px solid orange;
        background-color: white;
        z-index:1002;
        overflow: auto;
    }
</style>

<body>




<h2>管理员信息管理界面</h2>
<div class="panel-body">

    <a href = "javascript:void(0)" onclick = "document.getElementById('light').style.display='block';
document.getElementById('fade').style.display='block'">添加管理员
    </a>

    <div id="light" class="white_content">添加管理员
        <a href = "javascript:void(0)" onclick = "document.getElementById('light').style.display='none';
            document.getElementById('fade').style.display='none'">点这里关闭本窗口
        </a>

        <form class="form-horizontal"method="post"  action="${pageContext.request.contextPath}/backend/sysuser/add">


            <div class="form-group"  >
                <label for="inputEmail4" class="col-sm-2 control-label">管理员姓名：</label>
                <div class="col-sm-10">
                    <input type="text"  id="inputEmail4" placeholder="Name" name="name">
                </div>
            </div>
            <div class="form-group"  >
                <label for="inputEmail3" class="col-sm-2 control-label">管理员登录名：</label>
                <div class="col-sm-10">
                    <input type="text"  id="inputEmail3" placeholder="LoginName" name="login_name">
                </div>
            </div>
            <div class="form-group"  >
                <label for="inputEmail2" class="col-sm-2 control-label">密码：</label>
                <div class="col-sm-10">
                    <input type="text"  id="inputEmail2" placeholder="Password" name="password">
                </div>
            </div>
            <div class="form-group"  >
                <label for="inputEmail1" class="col-sm-2 control-label">电话：</label>
                <div class="col-sm-10">
                    <input type="text"  id="inputEmail1" placeholder="Phone" name="phone">
                </div>
            </div>
            <div class="form-group"  >
                <label for="inputEmail5" class="col-sm-2 control-label">邮箱：</label>
                <div class="col-sm-10">
                    <input type="email"  id="inputEmail5" placeholder="Email" name="email">
                </div>
            </div>

            <%--<input type="radio" name="status" value="1"
                   checked="checked" />启用&nbsp;&nbsp;
            <input type="radio" name="status" value="0" />禁用--%>


            <div class="form-group" >
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default" onclick="location.reload()">添加</button>
                </div>
            </div>
        </form>



    </div>
    <div id="fade" class="black_overlay"></div>
    <br>
    <br>
    <div class="show-list">
        <table class="table table-striped">
            <thead>
            <tr class="text-danger">
                <th class="text-center">编号</th>
                <th class="text-center">姓名</th>
                <th class="text-center">登录名</th>
                <th class="text-center">密码</th>
                <th class="text-center">电话</th>
                <th class="text-center">邮箱</th>
            </tr>
            </thead>
            <tbody id="tb">
            <c:forEach items="${sysusers}" var="sysuser">
                <tr>
                    <td class="text-center">${sysuser.id}</td>
                    <td class="text-center">${sysuser.name}</td>
                    <td class="text-center">${sysuser.login_name}</td>
                    <td class="text-center">${sysuser.password}</td>
                    <td class="text-center">${sysuser.phone}</td>
                    <td class="text-center">${sysuser.email}</td>

                    <td class="text-center">
                            <a class="btn btn-default" href="#" role="button">修改</a>

                            <a class="btn btn-default" href="#" role="button">删除</a>

                    </td>
                </tr>
            </c:forEach>


            </tbody>
        </table>
    </div>
</div>
</body>
</html>
