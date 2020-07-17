<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="com.lee.domain.Post" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    ;
    String basePathManager = basePath + "manager/";
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta content="" name="description"/>
    <meta content="webthemez" name="author"/>
    <title>${post.postTitle}</title>
    <jsp:include page="/part/manager.css.jsp"></jsp:include>
</head>
<body>
<div id="wrapper">
    <!--头部：页面标题栏-->
    <jsp:include page="/part/manager.header.jsp"></jsp:include>
    <!--导航栏：页面菜单栏-->
    <jsp:include page="/part/manager.menu.jsp"></jsp:include>
    <!--主体内容-->
    <div id="page-wrapper">
        <div id="page-inner">
            <div class="panel panel-default">
                <div class="panel-body">
                    <table class="table">
                        <tr>
                            <td><strong>题目： </strong>${post.postTitle}</td>
                            <td>
                                <span style="color: #c9302c">内容违规?</span>
                                <a href="<%=basePath%>admin/deletepost/${post.postId}" style="color: #c9302c">删除
                                    <span style="color: red" class="glyphicon glyphicon-remove"></span>
                                </a>
                            </td>
                        </tr>
                        <tr>
                            <td><strong>关键词： </strong>${post.postKeyWord}</td>
                            <td></td>
                        </tr>
                        <tr>
                            <td><strong>发帖人：</strong>${post.postPublisher}</td>
                            <td><strong>发表时间：</strong>${formatter.format(post.postPublishTime)}</td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                        </tr>
                    </table>
                    <div>
                        &nbsp;&nbsp;${post.postContent.replaceAll("\\n","<br>")}
                    </div>
                    <br/>
                    <hr/>
                    <div>评论：</div>
                    <br/>

                    <%@include file="/WEB-INF/jsp/recurse.jsp" %>

                </div>
                <hr>
            </div>

        </div>
    </div>

</div>
<jsp:include page="/part/manager.js.jsp"></jsp:include>
</body>
</html>