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
    <%-- 班级信息以及同学信息--%>
    <div class="container">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">${myclass.classMajor}&nbsp;${myclass.classGrade}-${myclass.classClass}&nbsp;同学列表</h3>
            </div>
            <div class="panel-body">
                <table class="table">
                    <thead>
                    <th>姓名</th>
                    <th>电话</th>
                    <th>邮箱</th>
                    <th>所在城市</th>
                    <th>公司</th>
                    </thead>
                    <tbody>
                    <c:forEach items="${classmates}" var="classmate">
                        <c:if test="${classmate.alumniNumber == myclass.classCreator}">
                            <tr style="color: #c9302c">
                                <td>*${classmate.alumniName}</td>
                                <td>${classmate.alumniPhone}</td>
                                <td>${classmate.alumniMail}</td>
                                <td>${classmate.alumniCity}</td>
                                <td>${classmate.alumniCompany}</td>
                            </tr>
                        </c:if>
                    </c:forEach>
                    <c:forEach items="${classmates}" var="classmate">
                        <c:if test="${classmate.alumniNumber != myclass.classCreator}">
                            <tr>
                                <td>${classmate.alumniName}</td>
                                <td>${classmate.alumniPhone}</td>
                                <td>${classmate.alumniMail}</td>
                                <td>${classmate.alumniCity}</td>
                                <td>${classmate.alumniCompany}</td>
                            </tr>
                        </c:if>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
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
