<%--
  Created by IntelliJ IDEA.
  User: finefine.com
  Date: 2017/9/25
  Time: 下午7:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>平台设置</title>c <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Minimal Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,
    Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <link href="/resources/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
    <!-- Custom Theme files -->
    <link href="/resources/css/style.css" rel='stylesheet' type='text/css' />
    <link href="/resources/css/font-awesome.css" rel="stylesheet">
    <script src="/resources/js/jquery.min.js"> </script>
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

    <!----->

    <!--pie-chart--->
    <script src="/resources/js/pie-chart.js" type="text/javascript"></script>
    <script type="text/javascript">

        $(document).ready(function () {
            $('#demo-pie-1').pieChart({
                barColor: '#3bb2d0',
                trackColor: '#eee',
                lineCap: 'round',
                lineWidth: 8,
                onStep: function (from, to, percent) {
                    $(this.element).find('.pie-value').text(Math.round(percent) + '%');
                }
            });

            $('#demo-pie-2').pieChart({
                barColor: '#fbb03b',
                trackColor: '#eee',
                lineCap: 'butt',
                lineWidth: 8,
                onStep: function (from, to, percent) {
                    $(this.element).find('.pie-value').text(Math.round(percent) + '%');
                }
            });

            $('#demo-pie-3').pieChart({
                barColor: '#ed6498',
                trackColor: '#eee',
                lineCap: 'square',
                lineWidth: 8,
                onStep: function (from, to, percent) {
                    $(this.element).find('.pie-value').text(Math.round(percent) + '%');
                }
            });


        });

    </script>
    <!--skycons-icons-->
    <script src="/resources/js/skycons.js"></script>
    <!--//skycons-icons-->
</head>
<body>
<div id="wapper">
    <jsp:include page="../common/leftBar.jsp"></jsp:include>
    <div id="page-wapper" class="gray-bg dashbard-1">
        <div class="content-main">
            <div class="banner">
                <h2>
                    <a href="/home/">主页</a>
                    <i class="fa fa-angle-right"></i>
                    <span>平台设置</span>
                </h2>
            </div>
        </div>
    </div>
</div>
</body>
</html>
