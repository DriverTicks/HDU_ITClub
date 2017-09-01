<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>维修员登录</title>
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
    <h1><a href="index.html">Minimal </a></h1>
    <div class="login-bottom">
        <h2>Login</h2>
        <form action="/login" method="post">
            <div class="col-md-6">
                <div class="login-mail">
                    <input type="text" placeholder="用户名" required="" name="name">
                    <i class="glyphicon glyphicon-user"></i>
                </div>
                <div class="login-mail">
                    <input type="password" placeholder="Password" required="" name="password">
                    <i class="glyphicon glyphicon-lock"></i>
                </div>
                <a class="news-letter " href="#">
                    <label class="checkbox1"><input type="checkbox" name="checkbox"><i> </i>Remember Password</label>
                </a>


            </div>
            <div class="col-md-6 login-do">
                <label class="hvr-shutter-in-horizontal login-sub">
                    <input type="submit" value="login">
                </label>
                <p>Do not have an account?</p>
                <a href="signup.html" class="hvr-shutter-in-horizontal">Signup</a>
            </div>

            <div class="clearfix"></div>
        </form>
    </div>
</div>
<!---->
<footer class="copy-right">
    <p style="text-align:center"> &copy; 2017 IT俱乐部. All Rights Reserved | Design by 柯帆 </p>
</footer>
<!---->
<!--scrolling js-->
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>
<!--//scrolling js-->
</body>
</html>

