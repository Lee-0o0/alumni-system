<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<!-- ======= Header ======= -->
<header id="header" class="fixed-top">
    <div class="container d-flex align-items-center">

        <h1 class="logo mr-auto" style="color: #00c5de">厦门大学校友录</h1>
        <!-- Uncomment below if you prefer to use an image logo -->
        <!-- <a href="index.html" class="logo mr-auto"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->

        <nav class="nav-menu d-none d-lg-block">
            <ul>
                <li><a href="/class?alumniNumber=${sessionScope.username}">班级</a></li>
                <li><a href="/posts">论坛</a></li>
                <li><a href="/myposts?username=${sessionScope.username}">我的帖子</a></li>
                <li><a href="/alumni/${sessionScope.username}">个人主页</a></li>
            </ul>
        </nav><!-- .nav-menu -->

        <a href="/logout" class="get-started-btn scrollto">退出登陆</a>

    </div>
</header><!-- End Header -->

</body>
</html>
