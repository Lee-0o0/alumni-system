<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">

    <title>我的帖子</title>
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
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <script type="text/javascript">
        function editInfo(obj,flag) {
            if (flag == 1){
                //修改帖子
                var postInfo = obj.parentNode.parentNode.childNodes[1].firstElementChild.childNodes;
                $("#postId").val(postInfo[1].innerHTML);
                $("#postTitle").val(postInfo[3].innerHTML.substring(3));
                $("#postKeyWord").val(postInfo[7].innerHTML.substring(4));
                $("#postContent").val(postInfo[9].innerHTML.trim());
            }

        }
    </script>

</head>

<body>

<jsp:include page="/part/user.header.jsp"></jsp:include>

<main id="main">
    <div style="height: 100px"></div>

    <div class="container">

        <%--        展示帖子--%>
        <c:forEach items="${posts}" var="post">
            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="container">
                        <p hidden>${post.postId}</p>
                        <strong>标题：${post.postTitle}</strong>
                        <span style="float: right;color: #ce8483;margin-right: 50px">发布时间：${formatter.format(post.postPublishTime)}</span>
                        <p>关键词：${post.postKeyWord}</p>
                        <p>
                            ${post.postContent}
                        </p>
                    </div>
                </div>
                <div class="panel-footer">
                    <a href="/userdeletepost/${post.postId}"><button type="button" class="btn btn-danger" >删除</button></a>
                    <button type="button" class="btn btn-success"
                            data-toggle="modal" data-target="#myModal" onclick="editInfo(this,1)">修改</button>
                </div>
            </div>
        </c:forEach>

            <!-- 模态框（Modal） -->
            <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                &times;
                            </button>
                        </div>
                        <div class="modal-body">
                            <form action="/updatepost" method="post" id="editForm">
                                <input type="text" class="form-control"  name="postId" id="postId" hidden><br/>
                                标题：<input type="text" class="form-control"  name="postTitle" id="postTitle"><br/>
                               关键词：<input type="text" class="form-control"  name="postKeyWord" id="postKeyWord"><br/>
                                <input type="text" class="form-control" name="postPublisher" hidden
                                       value="${sessionScope.username}">
                               内容： <textarea class="form-control" rows="3" name="postContent" id="postContent"></textarea>
                                <br/>
                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                                <button type="submit" class="btn btn-primary">提交更改</button>
                            </form>

                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal -->
            </div>
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
