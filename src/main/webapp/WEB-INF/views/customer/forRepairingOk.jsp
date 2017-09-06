<%--
  Created by IntelliJ IDEA.
  User: finefine.com
  Date: 2017/9/6
  Time: 下午8:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>报修成功</title>
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
        <h6 style="text-align: center">IT俱乐部为你分配了一位维修员，快来联系他吧！</h6>
        <div class="login-bottom">
            <div class="col-md-12 ">
                <div class="login-mail">
                    <label>姓名：</label><label> ${user.name}</label>
                </div>

                <div class="login-mail">
                    <label>QQ：</label><label>${user.QQ}</label>
                </div>
                <div class="login-mail">
                    <label>联系电话：</label><label>${user.phone}</label>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</body>
</html>
