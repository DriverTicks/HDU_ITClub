<%--
  Created by IntelliJ IDEA.
  User: finefine.com
  Date: 2017/9/5
  Time: 下午10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户报修</title>
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
    <style>
        .comment{
            width: 100%;
            overflow: auto;
            word-break: break-all;
        }
    </style>
</head>
<body>
<div class="login">
    <h1>电脑报修</h1>
    <div class="login-bottom">
        <form action="/repairBill/insertBill" method="post">
            <div class="col-md-6">
                <div class="login-mail">
                    <input type="text" placeholder="姓名" required="required" name="name">
                </div>
                <div class="login-mail">
                    <input type="text" placeholder="学号" required="required" name="studentID">
                </div>
                <div class="login-mail">
                    <label class="radio-inline">
                        <input type="radio" name="gender" checked value="0">汉子
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="gender" value="1">妹纸
                    </label>
                </div>
                <div class="login-mail">
                    <input type="text" placeholder="电话" required="required" name="phone">
                </div>
                <div class="login-mail">
                    <input type="text" placeholder="QQ" required="required" name="QQ">
                </div>
                <div class="login-mail">
                    <input type="text" placeholder="地址" required="required" name="address">
                </div>
                <div class="login-mail">
                        <textarea name="remark" placeholder="具体描述" class="comment"></textarea>
                </div>
            </div>
            <div class="col-md-6 login-do">
                <label class="hvr-shutter-in-horizontal login-sub">
                    <input type="submit" value="报修">
                </label>
            </div>
            <div class="clearfix"></div>
        </form>
    </div>
</div>

<jsp:include page="../common/foot.jsp"></jsp:include>
</body>
</html>
