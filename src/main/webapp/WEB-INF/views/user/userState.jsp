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
    <title>状态编辑</title>
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
                        <i class="fa fa-angle-right"></i>
                        <span>编辑状态</span>
                    </h2>
                </div>

                <div class=" profile">
                    <div class="profile-bottom">
                        <div class="profile-bottom-top">
                            <div class="col-md-8 profile-text">
                                <form action="">
                                    <div class="col-md-4">
                                        <label class="inline">
                                            <input type="radio" name="state" checked>在线
                                        </label>
                                        <label class="inline">
                                            <input type="radio" name="state">离线
                                        </label>
                                    </div>
                                    <div class="col-md-offset-4">

                                    </div>
                                    <div class="col-md-4 profile-fo">
                                        <input type="submit" class="pro btn btn-success" value="确定">
                                    </div>

                                </form>
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
