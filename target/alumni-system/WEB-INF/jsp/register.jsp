<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
这是注册页面
<form action="/register.do" method="post">

    学号：<input type="text" name="alumni.alumniNumber"><br>
    密码：<input type="password" name="user.userPassword"><br>
    确认密码：<input type="password"><br>
    姓名：<input type="text" name="alumni.alumniName"><br>
    性别：<input type="text" name="alumni.alumniGender" value="男"><br>
    年级：<input type="text" name="alumni.alumniGrade" value="2000"><br>
    专业：<input type="text" name="alumni.alumniMajor"><br>
    城市：<input type="text" name="alumni.alumniCity"><br>
    电话：<input type="text" name="alumni.alumniPhone"><br>
    邮箱：<input type="text" name="alumni.alumniMail"><br>
    公司：<input type="text" name="alumni.alumniCompany"><br>
    自我介绍：<input type="text" name="alumni.alumniMotto"><br>
    <input type="submit" value="注册">

</form>

</body>
</html>
