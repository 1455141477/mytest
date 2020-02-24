<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 导航侧栏 -->
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

            <li id="admin-index"><a href="${pageContext.request.contextPath}/manager/toindex"><i class="fa fa-dashboard"></i> <span>首页</span></a>
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


<%--                    <li id="admin-404">--%>
<%--                        <a href="${pageContext.request.contextPath}/book/toupdate">--%>
<%--                            <i class="fa fa-circle-o"></i> 修改图书--%>
<%--                        </a>--%>
<%--                    </li>--%>

                    <li id="admin-500">
                        <a href="${pageContext.request.contextPath}/book/findAll?pageNum=1&pageSize=4">
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

<%--                    <li id="charts-flot">
                        <a href="${pageContext.request.contextPath}/reader/toupdate">
                            <i class="fa fa-circle-o"></i> 修改读者
                        </a>
                    </li>--%>

                    <li id="charts-inline">
                        <a href="${pageContext.request.contextPath}/reader/findAll">
                            <i class="fa fa-circle-o"></i> 查询读者
                        </a>
                    </li>

                </ul>
            </li>

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-pie-chart"></i> <span>借阅管理</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">

                    <li id="charts-chartjs">
                        <a href="${pageContext.request.contextPath}/readerBook/findAllReaderBook">
                            <i class="fa fa-circle-o"></i> 借阅查询
                        </a>
                    </li>

                </ul>
            </li>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>
<!-- 导航侧栏 /-->
