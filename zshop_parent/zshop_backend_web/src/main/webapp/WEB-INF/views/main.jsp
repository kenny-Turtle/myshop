<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>--%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>schoolmaster.jsp</title>
    <style type="text/css">
        /*星号表示选择全部，设置外边距0，内边距0，字体大小12px，宋体*/
        *{
            margin:0px;
            padding:0px;
            font-size:12px;
            font-family:"宋体";
        }
        /*整个body区域背景色为#F5F5F5，这个很简单，自己下载个取色器，找个漂亮的网页，取个颜色就行*/
        body {
            background-color: #FCFCFC;
        }
        /*在top、left、right外面套用一层main是为了控制宽度，并且整体居中*/
        #main{
            width:1000px;
            margin:0px auto;
        }
        /*宽度占满它爹的宽度，高度64px是瞎试的，不好看再调整，猫哥喜欢用16px、32px、64px、128px这些，你懂的。
        背景色猫哥继续取色器，文字颜色取色器，标题部分啊文字用微软雅黑，大气！
        line-height表示文字占用的高度，它也是64那就是文字占用高度跟top区域高度是一样的嘛，所以文字就居中了*/
        #top{
            width:100%;
            height:64px;
            background-color:#000000;
            color:#FFFFFF;
            font-family:"微软雅黑";
            line-height:64px;
            font-size:36px;
        }
        /*宽度占200px差不多了吧
        float表示漂浮，left的话就是靠左了，所以这个left区域就得靠左飘飘了
            内部的东西跟边距有点距离好看点，暂时定为10px，上下左右都是哦*/
        #left{
            width:200px;
            height:536px;/*猫哥认为600-64=536*/
            float:left;
            background-color:#EEEEEE;
            padding:10px;
        }
        /*同理right向右飘*/
        #right{
            width:760px;/*1000-200-10*4=760,此处一定要注意padding的内容会拓宽div整体宽度，有志于前端的可以专门去研究下*/
            min-width:600px;
            height:536px;/*猫哥认为600-64=536*/
            float:right;
            background-color:#FFFFFF;
            padding:10px;
        }
    </style>
</head>
<body>
<div id="main">
    <div id="top">
        <div id="top_title">
            在线商城 管理系统
        </div><!-- 标题部分 -->

    </div><!-- top部分是标题栏 -->
    <div id="left">
        <ul>
            <li><a href="${pageContext.request.contextPath}/backend/productType/findAll"> 商品类型管理</a></li>
            <li><a href="${pageContext.request.contextPath}/backend/product/findAll"> 商品管理</a></li>
            <li><a href="${pageContext.request.contextPath}/backend/sysuser/findAll"> 管理员管理</a></li>
            <li><a href="${pageContext.request.contextPath}/backend/customer/findAll"> 客户管理</a></li>
        </ul>
    </div><!-- left部分是菜单栏 -->
    <div id="right">
<%--        这边是内容--%>
        <h1>具体内容</h1>
    </div><!-- right部分是具体内容显示区 -->
</div>
</body>
</html>
