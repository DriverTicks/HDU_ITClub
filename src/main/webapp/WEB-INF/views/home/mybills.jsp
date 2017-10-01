<%--
  Created by IntelliJ IDEA.
  User: finefine.com
  Date: 2017/10/1
  Time: 下午3:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的维修单</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Minimal Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,
    Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <link href="/resources/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
    <!-- Custom Theme files -->
    <link href="/resources/css/style.css" rel='stylesheet' type='text/css' />
    <link href="/resources/css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href="/resources/css/plugins/bootstrap-table/bootstrap-table.min.css">
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
</head>
<body>
    <div id="wapper">
        <jsp:include page="../common/leftBar.jsp"></jsp:include>
        <div id="page-wrapper" class="gray-bg dashbard-1">
            <div class="content-main">
                <div class="banner">
                    <h2>
                        <a href="/home/">主页</a>
                         <i class="fa fa-angle-right"></i>
                        <span>维修单</span>
                    </h2>
                </div>
                <div class="inbox-mail container" style="width:100%">
                    <table id="table">

                    </table>
                </div>
            </div>
        </div>
    </div>
    <script src="/resources/js/plugins/bootstrap-table/bootstrap-table.min.js"></script>
<script type="text/javascript">
   $(function () {
       //初始化Table
       var oTable=new TableInit();
       oTable.Init();
   })

   var TableInit = function () {
       var oTableInit = new Object();
       //初始化Table
       oTableInit.Init = function () {
           $('#table').bootstrapTable({
               url: '/Home/mybill',         //请求后台的URL（*）
               method: 'get',                      //请求方式（*）
//               toolbar: '#toolbar',                //工具按钮用哪个容器
               striped: true,                      //是否显示行间隔色
               cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
               pagination: true,                   //是否显示分页（*）
               sortable: false,                     //是否启用排序
               sortOrder: "asc",                   //排序方式
               queryParams: oTableInit.queryParams,//传递参数（*）
//               sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
               pageNumber:1,                       //初始化加载第一页，默认第一页
               pageSize: 10,                       //每页的记录行数（*）
               pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
               search: true,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
               strictSearch: true,
               showColumns: true,                  //是否显示所有的列
               showRefresh: true,                  //是否显示刷新按钮
               minimumCountColumns: 2,             //最少允许的列数
               clickToSelect: true,                //是否启用点击选中行
//               height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
               uniqueId: "id",                     //每一行的唯一标识，一般为主键列
               showToggle:true,                    //是否显示详细视图和列表视图的切换按钮
               cardView: false,                    //是否显示详细视图
               detailView: false,                   //是否显示父子表
               columns: [ {
                   field: 'name',
                   title: '姓名'
               }, {
                   field: 'qq',
                   title: 'qq号码'
               }, {
                   field: 'phone',
                   title: '电话号码'
               }, {
                   field: 'remark',
                   title: '原因'
               }, ]
           });
       };

       //得到查询的参数
       oTableInit.queryParams = function (params) {
           var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
               limit: params.limit,   //页面大小
               offset: params.offset,  //页码
               departmentname: $("#txt_search_departmentname").val(),
               statu: $("#txt_search_statu").val()
           };
           return temp;
       };
       return oTableInit;
   };
</script>
</body>
</html>
