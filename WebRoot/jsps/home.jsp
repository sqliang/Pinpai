<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head lang="zh-CN">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
    <title>首页</title>
    <link rel="stylesheet" href="/pinpai/css/common/bootstrap.min.css" />
    <link rel="stylesheet" href="/pinpai/css/common/reset.min.css" />
    <link rel="stylesheet" href="/pinpai/css/common/header.css" />
    <link rel="stylesheet" href="/pinpai/css/common/banner.css" />
    <link rel="stylesheet" href="/pinpai/css/common/footer.css" />
    <link rel="stylesheet" href="/pinpai/css/index.css" />
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<script src="/pinpai/js/lib/jquery.min.js"></script>
<script src="/pinpai/js/lib/bootstrap.min.js"></script>
</body>
</html>