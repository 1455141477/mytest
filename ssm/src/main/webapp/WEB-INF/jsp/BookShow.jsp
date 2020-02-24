<%--
  Created by IntelliJ IDEA.
  User: 1455141477
  Date: 2019/11/22
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <title>数据 - AdminLTE2定制版</title>
    <meta name="description" content="AdminLTE2定制版">
    <meta name="keywords" content="AdminLTE2定制版">
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <!-- Font Awesome -->
    <!-- Ionicons -->
    <!-- iCheck -->
    <!-- Morris chart -->
    <!-- jvectormap -->
    <!-- Date Picker -->
    <!-- Daterange picker -->
    <!-- Bootstrap time Picker -->
    <!--<link rel="stylesheet" href="plugins/timepicker/bootstrap-timepicker.min.css">-->
    <!-- bootstrap wysihtml5 - text editor -->
    <!--数据表格-->
    <!-- 表格树 -->
    <!-- select2 -->
    <!-- Bootstrap Color Picker -->
    <!-- bootstrap wysihtml5 - text editor -->
    <!--bootstrap-markdown-->
    <!-- Theme style -->
    <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
    <!-- Ion Slider -->
    <!-- ion slider Nice -->
    <!-- bootstrap slider -->
    <!-- bootstrap-datetimepicker -->

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->


    <!-- jQuery 2.2.3 -->
    <!-- jQuery UI 1.11.4 -->
    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
    <!-- Bootstrap 3.3.6 -->
    <!-- Morris.js charts -->
    <!-- Sparkline -->
    <!-- jvectormap -->
    <!-- jQuery Knob Chart -->
    <!-- daterangepicker -->
    <!-- datepicker -->
    <!-- Bootstrap WYSIHTML5 -->
    <!-- Slimscroll -->
    <!-- FastClick -->
    <!-- iCheck -->
    <!-- AdminLTE App -->
    <!-- 表格树 -->
    <!-- select2 -->
    <!-- bootstrap color picker -->
    <!-- bootstrap time picker -->
    <!--<script src="plugins/timepicker/bootstrap-timepicker.min.js"></script>-->
    <!-- Bootstrap WYSIHTML5 -->
    <!--bootstrap-markdown-->
    <!-- CK Editor -->
    <!-- InputMask -->
    <!-- DataTables -->
    <!-- ChartJS 1.0.1 -->
    <!-- FLOT CHARTS -->
    <!-- FLOT RESIZE PLUGIN - allows the chart to redraw when the window is resized -->
    <!-- FLOT PIE PLUGIN - also used to draw donut charts -->
    <!-- FLOT CATEGORIES PLUGIN - Used to draw bar charts -->
    <!-- jQuery Knob -->
    <!-- Sparkline -->
    <!-- Morris.js charts -->
    <!-- Ion Slider -->
    <!-- Bootstrap slider -->
    <!-- bootstrap-datetimepicker -->
    <!-- 页面meta /-->

    <link rel="stylesheet" href="../plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="../plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="../plugins/iCheck/square/blue.css">
    <link rel="stylesheet" href="../plugins/morris/morris.css">
    <link rel="stylesheet" href="../plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet" href="../plugins/datepicker/datepicker3.css">
    <link rel="stylesheet" href="../plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet" href="../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet" href="../plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet" href="../plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet" href="../plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet" href="../plugins/select2/select2.css">
    <link rel="stylesheet" href="../plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet" href="../plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet" href="../plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="../plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="../plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet" href="../plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet" href="../plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet" href="../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
</head>
<body class="hold-transition skin-purple sidebar-mini">

<div class="wrapper">

<%--   <!-- 页面头部 -->
   <header class="main-header">


       <!-- Logo -->
       <a href="all-admin-index.html" class="logo">
           <!-- mini logo for sidebar mini 50x50 pixels -->
           <span class="logo-mini"><b>数据</b></span>
           <!-- logo for regular state and mobile devices -->
           <span class="logo-lg"><b>数据</b>后台管理</span>
       </a>


       <!-- Header Navbar: style can be found in header.less -->
       <nav class="navbar navbar-static-top">
           <!-- Sidebar toggle button-->
           <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
               <span class="sr-only">Toggle navigation</span>
           </a>

           <div class="navbar-custom-menu">
               <ul class="nav navbar-nav">
                   <!-- Messages: style can be found in dropdown.less-->
                   <li class="dropdown messages-menu">
                       <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                           <i class="fa fa-envelope-o"></i>
                           <span class="label label-success">4</span>
                       </a>
                       <ul class="dropdown-menu">
                           <li class="header">你有4个邮件</li>
                           <li>
                               <!-- inner menu: contains the actual data -->
                               <ul class="menu">
                                   <li>
                                       <!-- start message -->
                                       <a href="#">
                                           <div class="pull-left">
                                               <img src="../img/user2-160x160.jpg" class="img-circle" alt="User Image">
                                           </div>
                                           <h4>
                                               系统消息
                                               <small><i class="fa fa-clock-o"></i> 5 分钟前</small>
                                           </h4>
                                           <p>欢迎登录系统?</p>
                                       </a>
                                   </li>
                                   <!-- end message -->
                                   <li>
                                       <a href="#">
                                           <div class="pull-left">
                                               <img src="../img/user3-128x128.jpg" class="img-circle" alt="User Image">
                                           </div>
                                           <h4>
                                               团队消息
                                               <small><i class="fa fa-clock-o"></i> 2 小时前</small>
                                           </h4>
                                           <p>你有新的任务了</p>
                                       </a>
                                   </li>
                                   <li>
                                       <a href="#">
                                           <div class="pull-left">
                                               <img src="../img/user4-128x128.jpg" class="img-circle" alt="User Image">
                                           </div>
                                           <h4>
                                               Developers
                                               <small><i class="fa fa-clock-o"></i> Today</small>
                                           </h4>
                                           <p>Why not buy a new awesome theme?</p>
                                       </a>
                                   </li>
                                   <li>
                                       <a href="#">
                                           <div class="pull-left">
                                               <img src="../img/user3-128x128.jpg" class="img-circle" alt="User Image">
                                           </div>
                                           <h4>
                                               Sales Department
                                               <small><i class="fa fa-clock-o"></i> Yesterday</small>
                                           </h4>
                                           <p>Why not buy a new awesome theme?</p>
                                       </a>
                                   </li>
                                   <li>
                                       <a href="#">
                                           <div class="pull-left">
                                               <img src="../img/user4-128x128.jpg" class="img-circle" alt="User Image">
                                           </div>
                                           <h4>
                                               Reviewers
                                               <small><i class="fa fa-clock-o"></i> 2 days</small>
                                           </h4>
                                           <p>Why not buy a new awesome theme?</p>
                                       </a>
                                   </li>
                               </ul>
                           </li>
                           <li class="footer"><a href="#">See All Messages</a></li>
                       </ul>
                   </li>
                   <!-- Notifications: style can be found in dropdown.less -->
                   <li class="dropdown notifications-menu">
                       <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                           <i class="fa fa-bell-o"></i>
                           <span class="label label-warning">10</span>
                       </a>
                       <ul class="dropdown-menu">
                           <li class="header">你有10个新消息</li>
                           <li>
                               <!-- inner menu: contains the actual data -->
                               <ul class="menu">
                                   <li>
                                       <a href="#">
                                           <i class="fa fa-users text-aqua"></i> 5 new members joined today
                                       </a>
                                   </li>
                                   <li>
                                       <a href="#">
                                           <i class="fa fa-warning text-yellow"></i> Very long description here that
                                           may not
                                           fit into the page and may cause design problems
                                       </a>
                                   </li>
                                   <li>
                                       <a href="#">
                                           <i class="fa fa-users text-red"></i> 5 new members joined
                                       </a>
                                   </li>
                                   <li>
                                       <a href="#">
                                           <i class="fa fa-shopping-cart text-green"></i> 25 sales made
                                       </a>
                                   </li>
                                   <li>
                                       <a href="#">
                                           <i class="fa fa-user text-red"></i> You changed your username
                                       </a>
                                   </li>
                               </ul>
                           </li>
                           <li class="footer"><a href="#">View all</a></li>
                       </ul>
                   </li>
                   <!-- Tasks: style can be found in dropdown.less -->
                   <li class="dropdown tasks-menu">
                       <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                           <i class="fa fa-flag-o"></i>
                           <span class="label label-danger">9</span>
                       </a>
                       <ul class="dropdown-menu">
                           <li class="header">你有9个新任务</li>
                           <li>
                               <!-- inner menu: contains the actual data -->
                               <ul class="menu">
                                   <li>
                                       <!-- Task item -->
                                       <a href="#">
                                           <h3>
                                               Design some buttons
                                               <small class="pull-right">20%</small>
                                           </h3>
                                           <div class="progress xs">
                                               <div class="progress-bar progress-bar-aqua" style="width: 20%"
                                                    role="progressbar" aria-valuenow="20" aria-valuemin="0"
                                                    aria-valuemax="100">
                                                   <span class="sr-only">20% Complete</span>
                                               </div>
                                           </div>
                                       </a>
                                   </li>
                                   <!-- end task item -->
                                   <li>
                                       <!-- Task item -->
                                       <a href="#">
                                           <h3>
                                               Create a nice theme
                                               <small class="pull-right">40%</small>
                                           </h3>
                                           <div class="progress xs">
                                               <div class="progress-bar progress-bar-green" style="width: 40%"
                                                    role="progressbar" aria-valuenow="20" aria-valuemin="0"
                                                    aria-valuemax="100">
                                                   <span class="sr-only">40% Complete</span>
                                               </div>
                                           </div>
                                       </a>
                                   </li>
                                   <!-- end task item -->
                                   <li>
                                       <!-- Task item -->
                                       <a href="#">
                                           <h3>
                                               Some task I need to do
                                               <small class="pull-right">60%</small>
                                           </h3>
                                           <div class="progress xs">
                                               <div class="progress-bar progress-bar-red" style="width: 60%"
                                                    role="progressbar" aria-valuenow="20" aria-valuemin="0"
                                                    aria-valuemax="100">
                                                   <span class="sr-only">60% Complete</span>
                                               </div>
                                           </div>
                                       </a>
                                   </li>
                                   <!-- end task item -->
                                   <li>
                                       <!-- Task item -->
                                       <a href="#">
                                           <h3>
                                               Make beautiful transitions
                                               <small class="pull-right">80%</small>
                                           </h3>
                                           <div class="progress xs">
                                               <div class="progress-bar progress-bar-yellow" style="width: 80%"
                                                    role="progressbar" aria-valuenow="20" aria-valuemin="0"
                                                    aria-valuemax="100">
                                                   <span class="sr-only">80% Complete</span>
                                               </div>
                                           </div>
                                       </a>
                                   </li>
                                   <!-- end task item -->
                               </ul>
                           </li>
                           <li class="footer">
                               <a href="#">View all tasks</a>
                           </li>
                       </ul>
                   </li>
                   <!-- User Account: style can be found in dropdown.less -->
                   <li class="dropdown user user-menu">
                       <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                           <img src="../img/user2-160x160.jpg" class="user-image" alt="User Image">
                           <span class="hidden-xs">

                           </span>
                       </a>
                       <ul class="dropdown-menu">
                           <!-- User image -->
                           <li class="user-header">
                               <img src="../img/user2-160x160.jpg" class="img-circle" alt="User Image">

                               <p>
                                   张猿猿 - 数据管理员
                                   <small>最后登录 11:20AM</small>
                               </p>
                           </li>
                           <!-- Menu Body
                   <li class="user-body">
                       <div class="row">
                           <div class="col-xs-4 text-center">
                               <a href="#">Followers</a>
                           </div>
                           <div class="col-xs-4 text-center">
                               <a href="#">Sales</a>
                           </div>
                           <div class="col-xs-4 text-center">
                               <a href="#">Friends</a>
                           </div>
                       </div>
                   </li>-->
                           <!-- Menu Footer-->
                           <li class="user-footer">
                               <div class="pull-left">
                                   <a href="#" class="btn btn-default btn-flat">修改密码</a>
                               </div>
                               <div class="pull-right">
                                   <a href="#" class="btn btn-default btn-flat">注销</a>
                               </div>
                           </li>
                       </ul>
                   </li>

               </ul>
           </div>
       </nav>
   </header>
   <!-- 页面头部 /-->--%>
<%@ include file="header.jsp" %>

<%--    <!-- 导航侧栏 -->
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- Sidebar user panel -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="../img/user2-160x160.jpg" class="img-circle" alt="User Image">
                </div>
                <div class="pull-left info">
                    <p>
                        <c:choose>
                            <c:when test="${not empty sessionScope.man}">
                                ${man.username}
                            </c:when>
                            <c:otherwise>
                                ${manager.username}
                            </c:otherwise>
                        </c:choose>
                    </p>
                    <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
                </div>
            </div>
            <!-- search form -->
            <!--<form action="#" method="get" class="sidebar-form">
        <div class="input-group">
            <input type="text" name="q" class="form-control" placeholder="搜索...">
            <span class="input-group-btn">
            <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
            </button>
          </span>
        </div>
    </form>-->
            <!-- /.search form -->


            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu">
                <li class="header">菜单</li>

                <li id="admin-index"><a href="all-admin-index.html"><i class="fa fa-dashboard"></i> <span>首页</span></a>
                </li>

                <!-- 菜单 -->


                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-folder"></i> <span>图书管理</span>
                        <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                    </a>
                    <ul class="treeview-menu">

                        <li id="admin-login">
                            <a href="${pageContext.request.contextPath}/book/toadd">
                                <i class="fa fa-circle-o"></i> 增加图书
                            </a>
                        </li>


                        <li id="admin-404">
                            <a href="${pageContext.request.contextPath}/book/toupdate">
                                <i class="fa fa-circle-o"></i> 修改图书
                            </a>
                        </li>

                        <li id="admin-500">
                            <a href="${pageContext.request.contextPath}/book/tofindAll">
                                <i class="fa fa-circle-o"></i> 查询图书
                            </a>
                        </li>
                    </ul>
                </li>


                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-pie-chart"></i> <span>读者管理</span>
                        <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                    </a>
                    <ul class="treeview-menu">

                        <li id="charts-chartjs">
                            <a href="${pageContext.request.contextPath}/reader/toadd">
                                <i class="fa fa-circle-o"></i> 增加读者
                            </a>
                        </li>

                        <li id="charts-flot">
                            <a href="${pageContext.request.contextPath}/reader/toupdate">
                                <i class="fa fa-circle-o"></i> 修改读者
                            </a>
                        </li>

                        <li id="charts-inline">
                            <a href="${pageContext.request.contextPath}/reader/findAll">
                                <i class="fa fa-circle-o"></i> 查询读者
                            </a>
                        </li>

                    </ul>
                </li>
            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>
    <!-- 导航侧栏 /-->--%>
<%@ include file="sidebar.jsp" %>

<!-- 内容区域 -->
<!-- @@master = admin-layout.html-->
<!-- @@block = content -->

<div class="content-wrapper">

<!-- 内容头部 -->
<section class="content-header">
    <h1>
        数据管理
        <small>数据列表</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
        <li><a href="#">数据管理</a></li>
        <li class="active">数据列表</li>
    </ol>
</section>
<!-- 内容头部 /-->

<!-- 正文区域 -->
<section class="content">

<!-- .box-body -->
<div class="box box-primary">
<div class="box-header with-border">
    <h3 class="box-title">列表</h3>
</div>

<div class="box-body">

<!-- 数据表格 -->
<div class="table-box">

<!--工具栏-->
<div class="pull-left">
    <div class="form-group form-inline">
        <div class="btn-group">
            <button type="button" onclick="javascript:window.location.href='${pageContext.request.contextPath}/book/findAll'" class="btn btn-default" title="新建"><i class="fa fa-file-o"></i> 查找所有</button>
            <button type="button" onclick="javascript:window.location.href='${pageContext.request.contextPath}/book/findByType?type=计算机'" class="btn btn-default" title="删除"><i class="fa fa-trash-o"></i> 计算机</button>
            <button type="button" onclick="javascript:window.location.href='${pageContext.request.contextPath}/book/findByType?type=励志'" class="btn btn-default" title="开启"><i class="fa fa-check"></i> 励志</button>
            <button type="button" onclick="javascript:window.location.href='${pageContext.request.contextPath}/book/findByType?type=西方文学'" class="btn btn-default" title="屏蔽"><i class="fa fa-ban"></i> 西方文学</button>
            <button type="button" onclick="javascript:window.location.href='${pageContext.request.contextPath}/book/findByType?type=历史'" class="btn btn-default" title="刷新"><i class="fa fa-refresh"></i> 历史</button>
        </div>
    </div>
</div>
<div class="box-tools pull-right">
    <div class="has-feedback">
        <input type="text" class="form-control input-sm" placeholder="搜索">
        <span class="glyphicon glyphicon-search form-control-feedback"></span>
    </div>
</div>
<!--工具栏/-->

<!--数据列表-->
<table id="dataList" class="table table-bordered table-striped table-hover dataTable">
<thead>
<tr>
    <th class="" style="padding-right:0px;">
        <input id="selall" type="checkbox" class="icheckbox_square-blue">
    </th>
    <th class="sorting_asc">ID</th>
    <th class="sorting_desc">图书名字</th>
    <th class="sorting_asc sorting_asc_disabled">图书类型</th>
    <th class="sorting_desc sorting_desc_disabled">图书作者</th>
    <th class="sorting">图书价格</th>
    <th class="text-center sorting">图书库存</th>
    <th class="text-center">操作</th>
</tr>
</thead>
<tbody>
<c:forEach items="${books.list}" var="book">
    <tr>
    <td><input name="ids" value="${book.id}" type="checkbox"></td>
    <td>${book.id}</td>
    <td>${book.name}
    </td>
    <td>${book.type}</td>
    <td>${book.author}</td>
    <td>${book.price}</td>
    <td class="text-center">${book.number}</td>
    <td class="text-center">
<%--    <button type="button" class="btn bg-olive btn-xs">订单</button>--%>
    <button type="button" onclick="javascript:window.location.href='${pageContext.request.contextPath}/book/toupdate?id=${book.id}'" class="btn bg-olive btn-xs">编辑</button>
    <button type="button" onclick='javascript:if(confirm("删除后将无法恢复数据 确认删除？")==true){window.location.href="${pageContext.request.contextPath}/book/delete?id=${book.id}";}' class="btn bg-olive btn-xs">删除</button>
    </td>
    </tr>
</c:forEach>
    </tbody>
    <!--
    <tfoot>
    <tr>
    <th>Rendering engine</th>
    <th>Browser</th>
    <th>Platform(s)</th>
    <th>Engine version</th>
    <th>CSS grade</th>
    </tr>
    </tfoot>-->
    </table>
    <!--数据列表/-->

    <!--工具栏-->
    <div class="pull-left">
    <div class="form-group form-inline">
    <div class="btn-group">
<%--    <button type="button" class="btn btn-default" title="新建"><i class="fa fa-file-o"></i> 新建</button>--%>
    <button type="button" class="btn btn-default" title="删除"><i class="fa fa-trash-o"></i> 删除</button>
<%--    <button type="button" class="btn btn-default" title="开启"><i class="fa fa-check"></i> 开启</button>
    <button type="button" class="btn btn-default" title="屏蔽"><i class="fa fa-ban"></i> 屏蔽</button>
    <button type="button" class="btn btn-default" title="刷新"><i class="fa fa-refresh"></i> 刷新</button>--%>
    </div>
    </div>
    </div>
    <div class="box-tools pull-right">
    <div class="has-feedback">
    <input type="text" class="form-control input-sm" placeholder="搜索">
    <span class="glyphicon glyphicon-search form-control-feedback"></span>
    </div>
    </div>
    <!--工具栏/-->

    </div>
    <!-- 数据表格 /-->


    </div>
    <!-- /.box-body -->

    <!-- .box-footer-->
    <div class="box-footer">
    <div class="pull-left">
    <div class="form-group form-inline">
    总共${books.pages} 页，共${books.total} 条数据。 每页
    <select id="changePageSize" onchange="changePageSize()" class="form-control">
    <option>1</option>
    <option>2</option>
    <option>3</option>
    <option>4</option>
    <option>5</option>
    </select> 条
    </div>
    </div>

    <div class="box-tools pull-right">
    <ul class="pagination">
    <li>
    <a href="${pageContext.request.contextPath}/book/findAll" aria-label="Previous">首页</a>
    </li>
    <li><a href="${pageContext.request.contextPath}/book/findAll?pageNum=${books.prePage}&pageSize=${books.size}">上一页</a></li>
<%--    <li><a href="${pageContext.request.contextPath}/book/findAll?pageNum=1&pageSize=${books.size}">1</a></li>
    <li><a href="${pageContext.request.contextPath}/book/findAll?pageNum=${books.prePage}&pageSize=${books.size}">2</a></li>--%>
    <c:forEach var="num" begin="${books.pageNum-5>0?(books.pageNum-5):1}" end="${(books.pageNum+5<=books.pages)?(books.pageNum+5):books.pages}">
        <li><a href="${pageContext.request.contextPath}/book/findAll?pageNum=${num}&pageSize=${books.size}">${num}</a></li>
    </c:forEach>
    <li><a href="${pageContext.request.contextPath}/book/findAll?pageNum=${books.nextPage}&pageSize=${books.size}">下一页</a></li>
    <li>
    <a href="${pageContext.request.contextPath}/book/findAll?pageNum=${books.pages}&pageSize=${books.size}" aria-label="Next">尾页</a>
    </li>
    </ul>
    </div>

    </div>
    <!-- /.box-footer-->


    </div>

    </section>
    <!-- 正文区域 /-->

    </div>
    <!-- @@close -->
    <!-- 内容区域 /-->

    <%--    <!-- 底部导航 -->
        <footer class="main-footer">
            <div class="pull-right hidden-xs">
                <b>Version</b> 1.0.8
            </div>
            <strong>Copyright &copy; 2014-2017 <a href="http://www.itcast.cn">研究院研发部</a>.</strong> All rights reserved.
        </footer>
        <!-- 底部导航 /-->--%>
    <%@ include file="footer.jsp" %>

    </div>


    <script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
    <script src="../plugins/jQueryUI/jquery-ui.min.js"></script>
    <script>
    $.widget.bridge('uibutton', $.ui.button);
    </script>
    <script src="../plugins/bootstrap/js/bootstrap.min.js"></script>
    <script src="../plugins/raphael/raphael-min.js"></script>
    <script src="../plugins/morris/morris.min.js"></script>
    <script src="../plugins/sparkline/jquery.sparkline.min.js"></script>
    <script src="../plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
    <script src="../plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
    <script src="../plugins/knob/jquery.knob.js"></script>
    <script src="../plugins/daterangepicker/moment.min.js"></script>
    <script src="../plugins/daterangepicker/daterangepicker.js"></script>
    <script src="../plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
    <script src="../plugins/datepicker/bootstrap-datepicker.js"></script>
    <script src="../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
    <script src="../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
    <script src="../plugins/slimScroll/jquery.slimscroll.min.js"></script>
    <script src="../plugins/fastclick/fastclick.js"></script>
    <script src="../plugins/iCheck/icheck.min.js"></script>
    <script src="../plugins/adminLTE/js/app.min.js"></script>
    <script src="../plugins/treeTable/jquery.treetable.js"></script>
    <script src="../plugins/select2/select2.full.min.js"></script>
    <script src="../plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
    <script src="../plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
    <script src="../plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
    <script src="../plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
    <script src="../plugins/bootstrap-markdown/js/markdown.js"></script>
    <script src="../plugins/bootstrap-markdown/js/to-markdown.js"></script>
    <script src="../plugins/ckeditor/ckeditor.js"></script>
    <script src="../plugins/input-mask/jquery.inputmask.js"></script>
    <script src="../plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
    <script src="../plugins/input-mask/jquery.inputmask.extensions.js"></script>
    <script src="../plugins/datatables/jquery.dataTables.min.js"></script>
    <script src="../plugins/datatables/dataTables.bootstrap.min.js"></script>
    <script src="../plugins/chartjs/Chart.min.js"></script>
    <script src="../plugins/flot/jquery.flot.min.js"></script>
    <script src="../plugins/flot/jquery.flot.resize.min.js"></script>
    <script src="../plugins/flot/jquery.flot.pie.min.js"></script>
    <script src="../plugins/flot/jquery.flot.categories.min.js"></script>
    <script src="../plugins/ionslider/ion.rangeSlider.min.js"></script>
    <script src="../plugins/bootstrap-slider/bootstrap-slider.js"></script>
    <script src="../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
    <script src="../plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>
    <script>
        function changePageSize(){
            var pageSize=$("#changePageSize").val();
            location.href="${pageContext.request.contextPath}/book/findAll?pageNum=1&pageSize="+pageSize;
        }
    $(document).ready(function () {
    // 选择框
    $(".select2").select2();

    // WYSIHTML5编辑器
    $(".textarea").wysihtml5({
    locale: 'zh-CN'
    });
    });


    // 设置激活菜单
    function setSidebarActive(tagUri) {
    var liObj = $("#" + tagUri);
    if (liObj.length > 0) {
    liObj.parent().parent().addClass("active");
    liObj.addClass("active");
    }
    }


    $(document).ready(function () {
    // 激活导航位置
    setSidebarActive("admin-index");
    });
    </script>
    </body>

    </html>
    <!---->
    </html>
