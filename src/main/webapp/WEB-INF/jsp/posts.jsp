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
    <title>帖子列表</title>
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
            <c:if test="${posts.size() == 0}">
                <div>没有帖子！</div>
            </c:if>
            <c:forEach items="${posts}" var="post" varStatus="ids">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <table class="table">
                            <tr>
                                <td><strong>题目： </strong>${post.postTitle}</td>
                                <td></td>
                            </tr>
                            <tr>
                                <td><strong>关键词： </strong>${post.postKeyWord}</td>
                                <td></td>
                            </tr>
                            <tr>
                                <td><strong>发帖人： </strong>${post.postPublisher}</td>
                                <td><strong>发表时间： </strong>${formatter.format(post.postPublishTime)}</td>
                            </tr>
                            <tr>
                                <td></td>
                                <td></td>
                            </tr>
                        </table>
                        <div>
                            <c:if test="${post.postContent.length()>20}">
                                &nbsp;&nbsp;${post.postContent.substring(0,20)}......
                            </c:if>
                            <c:if test="${post.postContent.length()<20}">
                                &nbsp;&nbsp;${post.postContent}......
                            </c:if>
                            <a href="<%=basePath%>/admin/post/${post.postId}">查看更多</a>
                        </div>
                    </div>
                    <hr>
                </div>
            </c:forEach>


        </div>
    </div>

</div>
<jsp:include page="/part/manager.js.jsp"></jsp:include>
</body>
</html>