<%--
  Created by IntelliJ IDEA.
  User: finefine.com
  Date: 2017/9/9
  Time: 下午8:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人资料</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Minimal Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,
    Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <link href="/resources/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
    <!-- Custom Theme files -->
    <link href="/resources/css/style.css" rel='stylesheet' type='text/css' />
    <link href="/resources/css/font-awesome.css" rel="stylesheet">
    <script src="/resources/js/jquery.min.js"> </script>
    <script src="/resources/js/bootstrap.min.js"> </script>

    <!-- Mainly scripts -->
    <script src="/resources/js/jquery.metisMenu.js"></script>
    <script src="/resources/js/jquery.slimscroll.min.js"></script>
    <!-- Custom and plugin javascript -->
    <link href="/resources/css/custom.css" rel="stylesheet">
    <script src="/resources/js/custom.js"></script>
    <script src="/resources/js/screenfull.js"></script>
    <script>
        $(function () {
            $('#supported').text('Supported/allowed: ' + !!screenfull.enabled);

            if (!screenfull.enabled) {
                return false;
            }



            $('#toggle').click(function () {
                screenfull.toggle($('#container')[0]);
            });
        });
    </script>

<body>
<div id="wrapper">
    <jsp:include page="../common/leftBar.jsp"></jsp:include>

        <div id="page-wrapper" class="gray-bg dashbard-1">
            <div class="content-main">
                <div class="banner">
                    <h2>
                        <a href="/home/">主页</a>
                        <i class="fa fa-angle-right"></i>
                        <span>个人资料</span>
                    </h2>
                </div>

                <div class=" profile">
                    <div class="profile-bottom">
                        <h3><i class="fa fa-user"></i>Profile</h3>
                        <div class="profile-bottom-top">
                            <div class="col-md-8 profile-text">
                                <h6>name</h6>
                                <table>
                                    <tr><td>电话</td>
                                        <td>:</td>
                                        <td>15968137674</td></tr>

                                    <tr>
                                        <td>Email</td>
                                        <td> :</td>
                                        <td>530362991@qq.com</td>
                                    </tr>
                                    <tr>
                                        <td>性别</td>
                                        <td> :</td>
                                        <td>男</td>
                                    </tr>
                                    <tr>
                                        <td>QQ </td>
                                        <td>:</td>
                                        <td> 530362991</td>
                                    </tr>
                                    <tr>
                                        <td>状态 </td>
                                        <td>:</td>
                                        <td>在线</td>
                                    </tr>
                                </table>
                            </div>
                            <div class="clearfix"></div>
                        </div>
                        <div class="profile-bottom-bottom">
                            <div class="col-md-4 profile-fo">
                                <a href="/home/alterUserState" class="pro"><i class="fa fa-tint nav_icon"></i>编辑状态</a>
                            </div>
                            <div class="col-md-4 profile-fo">
                                <a href="#" class="pro1"><i class="fa fa-lock nav_icon"></i>修改密码</a>
                            </div>
                            <div class="col-md-4 profile-fo">
                                <a href="#"><i class="fa fa-user nav_icon"></i>修改资料</a>
                            </div>
                            <div class="clearfix"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
</div>

</div>


<div class="copy">
    <jsp:include page="../common/foot.jsp"></jsp:include> </div>
</div>
</div>
<div class="clearfix"> </div>
</div>

<!----
<!--scrolling js-->
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>
<!--//scrolling js-->



</body>
</html>
