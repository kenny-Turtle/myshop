<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>regist</title>
    <link href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" />
    <link href="http://cdn.bootcss.com/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
    <link href="https://cdn.bootcss.com/flat-ui/2.3.0/css/flat-ui.min.css" rel="stylesheet">

    <style>
        #form{
            width: 300px;
            height: 200px;
            position: relative;
            left:50%;
            top:50%;
            margin-left:-150px;
            margin-top:80px;
        }
    </style>
</head>
<body>
<center>
    <h2>注册页面</h2>
<%--    <div>${errors}</div>--%>
</center>
<div id="form">
    <form class="form-horizontal"method="post"  action="${pageContext.request.contextPath}/backend/customer/regist">
        <div class="form-group"  >
            <label for="inputEmail3" class="col-sm-2 control-label">Realname：</label>
            <div class="col-sm-10">
                <input type="text"  id="inputEmail3" placeholder="Realname" name="realname">
            </div>
        </div>

        <div class="form-group"  >
            <label for="inputEmail3" class="col-sm-2 control-label">Registname：</label>
            <div class="col-sm-10">
                <input type="text"  id="inputEmail4" placeholder="Registname" name="registname">
            </div>
        </div>

        <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label">Password：</label>
            <div class="col-sm-10">
                <input type="password"  id="inputPassword3" placeholder="Password" name="password">
            </div>
        </div>

        <div class="form-group"  >
            <label for="inputEmail3" class="col-sm-2 control-label">Phone：</label>
            <div class="col-sm-10">
                <input type="text"  id="inputEmail5" placeholder="Phone" name="phone">
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default" onclick="location.reload()">Regist</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>
