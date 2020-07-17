<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">

    <title>论坛首页</title>
    <meta content="" name="descriptison">
    <meta content="" name="keywords">

    <!-- Favicons -->
    <%--    <link href="../../assets/img/favicon.png" rel="icon">--%>
    <link href="../../assets/img/apple-touch-icon.png" rel="apple-touch-icon">

    <!-- Google Fonts -->
    <link
            href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
            rel="stylesheet">

    <!-- Vendor CSS Files -->
    <link href="../../css/bootstrap.css" rel="stylesheet">
    <link href="../../assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../assets/vendor/icofont/icofont.min.css" rel="stylesheet">
    <link href="../../assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
    <link href="../../assets/vendor/remixicon/remixicon.css" rel="stylesheet">
    <link href="../../assets/vendor/venobox/venobox.css" rel="stylesheet">
    <link href="../../assets/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="../../assets/vendor/aos/aos.css" rel="stylesheet">

    <!-- Template Main CSS File -->
    <link href="../../assets/css/style.css" rel="stylesheet">

</head>

<body>

<jsp:include page="/part/user.header.jsp"></jsp:include>

<main id="main">
    <div style="height: 100px"></div>

    <div class="container">
        <%--        发布帖子模块--%>
        <div class="panel panel-success">
            <div class="panel-heading">发布帖子</div>
            <div class="panel-body">
                <form action="/post" method="post">
                    <input type="text" class="form-control" placeholder="标题" name="postTitle"><br/>
                    <input type="text" class="form-control" placeholder="关键词" name="postKeyWord"><br/>
                    <input type="text" class="form-control" name="postPublisher" hidden
                           value="${sessionScope.username}">
                    <textarea class="form-control" rows="3" name="postContent" placeholder="正文"></textarea>
                    <br/>
                    <button type="submit" class="btn btn-success btn-lg" style="float: right">发布</button>
                </form>
            </div>
        </div>

        <%--        展示帖子--%>
        <c:forEach items="${posts}" var="post">
            <div class="panel panel-default">
                <div class="panel-body">

                    <span class="glyphicon glyphicon-user"></span>${post.postPublisher}
                    <br>
                    <br>
                    <div class="container">
                        <strong>标题：${post.postTitle}</strong>
                        <span style="float: right;color: #ce8483">发布时间：${formatter.format(post.postPublishTime)}</span>
                    </div>
                    <br>
                        ${post.postContent}
                    <br>
                    <br>

                    <c:forEach items="${comments}" var="entry">
                        <c:if test="${entry.key == post.postId}">
                            <strong>评论：</strong><br>
                            <c:forEach items="${entry.getValue()}" var="comment">
                                <div>
                                        ${comment.mycommentPublisher}：&nbsp;
                                        ${comment.mycommentContent}
                                    <span style="float: right;color: #ce8483">${formatter.format(comment.myCommentPublishTime)}</span>
                                </div>
                            </c:forEach>
                        </c:if>
                    </c:forEach>

                    <br>
                    <form action="/mycomment" method="post">
                        <input type="text" name="mycommentPost" hidden value="${post.postId}">
                        <input type="text" name="mycommentPublisher" hidden value="${sessionScope.username}">
                        <input type="text" class="form-control" placeholder="评论" name="mycommentContent"><br/>
                        <button type="submit" class="btn btn-success" style="float: right">评论</button>

                    </form>
                </div>
            </div>
        </c:forEach>
    </div>


</main><!-- End #main -->

<!-- ======= Footer ======= -->
<footer id="footer">

    <div class="container d-md-flex py-4">

        <div class="mr-md-auto text-center text-md-left">
            <div class="copyright">
                Copyright &copy; 2020.李洪波 All rights reserved.
            </div>
            <div class="credits"></div>
        </div>
    </div>
</footer><!-- End Footer -->

<a href="#" class="back-to-top"><i class="ri-arrow-up-line"></i></a>
<div id="preloader"></div>

<!-- Vendor JS Files -->
<script src="../../assets/vendor/jquery/jquery.min.js"></script>
<script src="../../assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="../../assets/vendor/jquery.easing/jquery.easing.min.js"></script>
<script src="../../assets/vendor/php-email-form/validate.js"></script>
<script src="../../assets/vendor/waypoints/jquery.waypoints.min.js"></script>
<script src="../../assets/vendor/counterup/counterup.min.js"></script>
<script src="../../assets/vendor/venobox/venobox.min.js"></script>
<script src="../../assets/vendor/owl.carousel/owl.carousel.min.js"></script>
<script src="../../assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
<script src="../../assets/vendor/aos/aos.js"></script>

<!-- Template Main JS File -->
<script src="../../assets/js/main.js"></script>

</body>

</html>
