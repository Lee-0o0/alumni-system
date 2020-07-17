<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">

    <title>加入班级</title>
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

    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>

<body>
<jsp:include page="/part/user.header.jsp"></jsp:include>


<main id="main">
    <div style="height: 100px"></div>

    <div class="container">
        <div class="panel-heading">
            <h3 class="panel-title">您还未加入班级，为您推荐以下班级！</h3>
        </div>
        <table class="table">
            <thead>
            <tr>
                <th>专业</th>
                <th>年级</th>
                <th>班级</th>
                <th>班级人数</th>
                <th>申请加入</th>
            </tr>
            </thead>
            <c:forEach items="${classes}" var="myclass">
                <tr>
                    <td>${myclass.classMajor}</td>
                    <td>${myclass.classGrade}</td>
                    <td>${myclass.classClass}</td>
                    <td>${myclass.classNumberOfMember}</td>
                    <td>
                        <a href="/joinclass?classId=${myclass.classId}&alumniNumber=${alumni.alumniNumber}"><span style="color: green" class="glyphicon glyphicon-hand-up"></span></a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <div class="panel-body">
            <button type="button" class="btn btn-success btn-lg"
                    data-toggle="modal" data-target="#myModal">创&nbsp;建&nbsp;班&nbsp;级
            </button>
        </div>
        <%-- 模态框--%>
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog"
             aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    </div>
                    <div class="modal-body">
                        <form id="editForm" action="/createclass" method="post" role="form">
                            <div class="form-group">
                                <table class="table" style="font-family: 'Adobe 黑体 Std R'">
                                    <thead>
                                    <tr>
                                        <th>信息：<input type="hidden" id="hiddenId" name="hiddenName">
                                        </th>
                                        <th></th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td><b>专业：</b></td>
                                        <td><input type="text" id="classMajor" name="classMajor"
                                                   class="form-control" value="${alumni.alumniMajor}" readonly/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><b>年级：</b></td>
                                        <td><input type="text" id="classGrade" name="classGrade"
                                                   class="form-control" value="${alumni.alumniGrade}" readonly/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><b>班：</b></td>
                                        <td><input type="text" id="classClass" name="classClass"
                                                   class="form-control"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><b>班级介绍：</b></td>
                                        <td><input type="text" id="classIntroduction" name="classIntroduction"
                                                   class="form-control"/>
                                        </td>
                                    </tr>
                                    </tbody>
                                </table>
                                <input type="text" name="classCreator" value="${alumni.alumniNumber}" hidden>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                                    </button>
                                    <input type="submit" value="提交" class="btn btn-primary">
                                </div>
                            </div>
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
