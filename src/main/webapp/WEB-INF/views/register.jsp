<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
    <title>维修员注册</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);

    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
    <link href="/resources/css/bootstrap.min.css" rel='stylesheet' type='text/css'/>
    <!-- Custom Theme files -->
    <link href="/resources/css/style.css" rel='stylesheet' type='text/css'/>
    <link href="/resources/css/font-awesome.css" rel="stylesheet">
    <script src="/resources/js/jquery.min.js"></script>
    <script src="/resources/js/plugins/bootstrap/bootstrap.min.js"></script>
</head>
<body>
<div class="login">
    <h1><a href="index.html">注册 </a></h1>
    <div class="login-bottom">
        <form action="/register" method="post">
            <div class="col-md-6">
                <div class="login-mail">
                    <input type="text" placeholder="姓名" required="" name="name">
                    <i class="glyphicon glyphicon-user"></i>
                </div>
                <div class="login-mail">
                    <input type="text" placeholder="Email" required="" name="email">
                    <i class="glyphicon glyphicon-envelope"></i>
                </div>
                <div class="login-mail">
                    <input type="password" placeholder="密码" required="" name="password">
                    <i class="glyphicon glyphicon-lock"></i>
                </div>
                <div class="login-mail">
                    <input type="password" placeholder="再次确认密码" required="">
                    <i class="glyphicon glyphicon-lock"></i>
                </div>
                <div class="login-mail">
                    <input type="tel" placeholder="电话号码" required="" name="phone">
                    <i class="glyphicon glyphicon-phone"></i>
                </div>
                <div class="login-mail">
                    <input type="text" placeholder="QQ" required="" name="QQ">
                </div>
                <div>
                    <label class="radio-inline">
                        <input type="radio" name="gender" checked value="0">男
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="gender" value="1">女
                    </label>
                </div>
            </div>

            <div class="col-md-6 login-do">
                <label class="hvr-shutter-in-horizontal login-sub">
                    <input type="submit" value="提交">
                </label>
                <p>已经注册</p>
                <a href="login" class="hvr-shutter-in-horizontal">登录</a>
            </div>
            <div class="clearfix"></div>
        </form>
    </div>
</div>
<!---->
<jsp:include page="common/foot.jsp"></jsp:include>
<!---->
<!--scrolling js-->
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>
<!--//scrolling js-->
</body>
</html>


