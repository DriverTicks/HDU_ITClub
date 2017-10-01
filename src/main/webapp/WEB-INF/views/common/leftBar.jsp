<%--
  Created by IntelliJ IDEA.
  User: finefine.com
  Date: 2017/9/8
  Time: 下午5:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<nav class="navbar-default navbar-static-top" role="navigation">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">平台管理</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <h1> <a class="navbar-brand" href="/home/">平台管理</a></h1>
    </div>
    <div class=" border-bottom">
        <div class="full-left">
            <section class="full-top">
                <button id="toggle"><i class="fa fa-arrows-alt"></i></button>
            </section>
            <form class=" navbar-left-right">
                <input type="text"  value="搜索" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '搜索';}">
                <input type="submit" value="" class="fa fa-search">
            </form>
            <div class="clearfix"> </div>
        </div>


        <!-- Brand and toggle get grouped for better mobile display -->

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="drop-men" >
            <ul class=" nav_1">

                <li class="dropdown at-drop">
                    <a href="#" class="dropdown-toggle dropdown-at " data-toggle="dropdown"><i class="fa fa-envelope"></i> <span class="number">5</span></a>
                    <ul class="dropdown-menu menu1 " role="menu">
                        <li><a href="#">

                            <div class="user-new">
                                <p>New user registered</p>
                                <span>40 seconds ago</span>
                            </div>
                            <div class="user-new-left">

                                <i class="fa fa-user-plus"></i>
                            </div>
                            <div class="clearfix"> </div>
                        </a></li>
                        <li><a href="#">
                            <div class="user-new">
                                <p>Someone special liked this</p>
                                <span>3 minutes ago</span>
                            </div>
                            <div class="user-new-left">

                                <i class="fa fa-heart"></i>
                            </div>
                            <div class="clearfix"> </div>
                        </a></li>
                        <li><a href="#">
                            <div class="user-new">
                                <p>John cancelled the event</p>
                                <span>4 hours ago</span>
                            </div>
                            <div class="user-new-left">

                                <i class="fa fa-times"></i>
                            </div>
                            <div class="clearfix"> </div>
                        </a></li>
                        <li><a href="#">
                            <div class="user-new">
                                <p>The server is status is stable</p>
                                <span>yesterday at 08:30am</span>
                            </div>
                            <div class="user-new-left">

                                <i class="fa fa-info"></i>
                            </div>
                            <div class="clearfix"> </div>
                        </a></li>
                        <li><a href="#">
                            <div class="user-new">
                                <p>New comments waiting approval</p>
                                <span>Last Week</span>
                            </div>
                            <div class="user-new-left">

                                <i class="fa fa-rss"></i>
                            </div>
                            <div class="clearfix"> </div>
                        </a></li>
                        <li><a href="#" class="view">View all messages</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle dropdown-at" data-toggle="dropdown"><span class=" name-caret">Rackham<i class="caret"></i></span><img src="/resources/images/wo.jpg"></a>
                    <ul class="dropdown-menu " role="menu">
                        <li><a href="profile.html"><i class="fa fa-user"></i>Edit Profile</a></li>
                        <li><a href="inbox.html"><i class="fa fa-envelope"></i>Inbox</a></li>
                        <li><a href="calendar.html"><i class="fa fa-calendar"></i>Calender</a></li>
                        <li><a href="inbox.html"><i class="fa fa-clipboard"></i>Tasks</a></li>
                    </ul>
                </li>

            </ul>
        </div><!-- /.navbar-collapse -->
        <div class="clearfix">

        </div>

        <div class="navbar-default sidebar" role="navigation">
            <div class="sidebar-nav navbar-collapse">
                <ul class="nav" id="side-menu">

                    <li>
                        <a href="/home/" class=" hvr-bounce-to-right"><i class="fa fa-dashboard nav_icon "></i><span class="nav-label">Dashboards</span> </a>
                    </li>

                    <li>
                        <a href="/home/mybills" class=" hvr-bounce-to-right"><i class="fa fa-navicon nav_icon"></i> <span class="nav-label">维修单</span> </a>
                    </li>

                    <li>
                        <a href="/home/inbox" class=" hvr-bounce-to-right"><i class="fa fa-inbox nav_icon"></i> <span class="nav-label">消息中心</span> </a>
                    </li>
                    <li>
                        <a href="/home/setting" class=" hvr-bounce-to-right"><i class="fa fa-cog nav_icon"></i> <span class="nav-label">平台设置</span></a>
                    </li>
                    <li>
                        <a href="#" class=" hvr-bounce-to-right"><i class="fa fa-user-plus nav_icon"></i> <span class="nav-label">个人中心</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li><a href="/home/personCenter" class=" hvr-bounce-to-right"><i class="fa fa-user nav_icon"></i>个人资料</a></li>
                            <li><a href="/logout" class=" hvr-bounce-to-right"><i class="fa fa-sign-out nav_icon"></i>安全退出</a></li>
                            <%--<li><a href="validation.html" class=" hvr-bounce-to-right"><i class="fa fa-tint nav_icon">--%>
                            <%--</i>状态：--%>

                                    <%--<label class="inline">--%>
                                        <%--<input type="radio" name="state" checked>在线--%>
                                    <%--</label>--%>
                                    <%--<label class="inline">--%>
                                        <%--<input type="radio" name="state">离线--%>
                                    <%--</label>--%>

                            <%--</a></li>--%>
                        </ul>
                    </li>

                    <li>
                        <a href="#" class=" hvr-bounce-to-right"><i class="fa fa-adjust nav_icon"></i> <span class="nav-label">其他</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li><a href="forms.html" class=" hvr-bounce-to-right"><i class="fa fa-spinner nav_icon"></i>有待开发</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</nav>