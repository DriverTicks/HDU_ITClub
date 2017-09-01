<%--
  Created by IntelliJ IDEA.
  User: xuzhi
  Date: 2017/8/4
  Time: 22:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<%@include file="java.jsp"%>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Invalid</title>
</head>
<%@include file="css.jsp"%>
<body class="gray-bg">
<div class="middle-box text-center animated fadeInDown">
    <h1>失效</h1>
    <div class="error-desc">
        抱歉，链接已失效~

    </div>
</div>

<script type="text/javascript" src="<c:url value='/resources/js/jquery.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/resources/js/plugins/bootstrap/bootstrap.min.js?v=3.3.6'/>"></script>
</body>


</html>
