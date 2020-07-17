<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<body>
	<!--导航栏class="active-menu-->
	<nav class="navbar-default navbar-side" role="navigation">
	<div class="sidebar-collapse">
	<ul class="nav" id="main-menu">
		<li><a href="<%=basePath %>admin/alumnis">
		<i class="fa fa-user"></i>校友管理</a></li>
		<li><a href="<%=basePath %>admin/classes">
		<i class="fa fa-table"></i>班级管理 </a></li>
		<li><a href="<%=basePath %>admin/posts">
		<i class="fa fa-book"></i>帖子管理</a></li>
	</ul>
	</div>
	</nav>
	</body>
</html>
