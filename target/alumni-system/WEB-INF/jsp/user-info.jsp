<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">

    <title>${alumni.alumniName}信息页</title>
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

    <script type="text/javascript">
        function restore() {
            $("#name").val("${alumni.alumniName}");
            $("#grade").val("${alumni.alumniGrade}");
            $("#gender").val("${alumni.alumniGender}");
            $("#mail").val("${alumni.alumniMail}");
            $("#major").val("${alumni.alumniMajor}");
            $("#phone").val("${alumni.alumniPhone}");
            $("#company").val("${alumni.alumniCompany}");
            $("#city").val("${alumni.alumniCity}");
            $("#motto").val("${alumni.alumniMotto}");
        }
    </script>

</head>

<body>

<jsp:include page="/part/user.header.jsp"></jsp:include>

<main id="main">
    <div style="height: 100px"></div>

    <div class="container">
        <form class="form-horizontal" action="/userupdatealumni" method="post">
            <div class="form-group">
                <label for="number" class="col-sm-2 control-label">学号</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="number" name="alumniNumber" value="${alumni.alumniNumber}" readonly>
                </div>
            </div>
            <div class="form-group">
                <label for="name" class="col-sm-2 control-label">姓名</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="alumniName" id="name" value="${alumni.alumniName}">
                </div>
            </div>
            <div class="form-group">
                <label for="gender" class="col-sm-2 control-label">性别</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="gender" name="alumniGender" value="${alumni.alumniGender}">
                </div>
            </div>
            <div class="form-group">
                <label for="grade" class="col-sm-2 control-label">年级</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="grade" name="alumniGrade" value="${alumni.alumniGrade}">
                </div>
            </div>
            <div class="form-group">
                <label for="major" class="col-sm-2 control-label">专业</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="major" name="alumniMajor" value="${alumni.alumniMajor}">
                </div>
            </div>
            <div class="form-group">
                <label for="phone" class="col-sm-2 control-label">联系电话</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="phone" name="alumniPhone" value="${alumni.alumniPhone}">
                </div>
            </div>
            <div class="form-group">
                <label for="mail" class="col-sm-2 control-label">邮箱</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="mail" name="alumniMail" value="${alumni.alumniMail}">
                </div>
            </div>
            <div class="form-group">
                <label for="company" class="col-sm-2 control-label">公司</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="company" name="alumniCompany" value="${alumni.alumniCompany}">
                </div>
            </div>
            <div class="form-group">
                <label for="city" class="col-sm-2 control-label">所在城市</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="city" name="alumniCity" value="${alumni.alumniCity}">
                </div>
            </div>
            <div class="form-group">
                <label for="motto" class="col-sm-2 control-label">个人介绍</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="motto" name="alumniMotto" value="${alumni.alumniMotto}">
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-5 col-sm-6">
                    <button type="submit" class="btn btn-success btn-lg" style="float:right;">修&nbsp;改</button>
                    <button type="button" class="btn btn-success btn-lg" onclick="restore()" style="float:right;margin-right: 20px">还&nbsp;原</button>
                </div>
            </div>
        </form>


        <form class="form-horizontal" action="/updatepassword" method="post">
            <input type="text" value="${sessionScope.username}" hidden name="username">

            <div class="form-group">
                <label for="name" class="col-sm-2 control-label">新密码</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" name="password" id="password">
                </div>
            </div>

            <div class="form-group">
                <label for="gender" class="col-sm-2 control-label">确认密码</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="confirmPassword" name="confirmPassword">
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-5 col-sm-6">
                    <button type="submit" class="btn btn-success btn-lg" style="float:right;">修&nbsp;改&nbsp;密&nbsp;码</button>
                </div>
            </div>
        </form>
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
