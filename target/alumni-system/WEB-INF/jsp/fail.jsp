<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>跳转中</title>
</head>
<body>
<script type="text/javascript">
    alert("${msg}");
    window.history.back();
</script>

</body>
</html>
