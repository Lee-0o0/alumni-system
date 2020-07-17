<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    String basePathManager = basePath + "manager/";
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta content="" name="description"/>
    <meta content="webthemez" name="author"/>
    <title>班级列表</title>
    <jsp:include page="/part/manager.css.jsp"></jsp:include>

    <script type="text/javascript">
        var msg = '${msg}';
        if (msg != "" && msg != undefined) {
            alert(msg);
        }
    </script>

    <script type="text/javascript">

        function doDelete(number) {
            if (confirm("您确定要删除序号为" + number + "的班级吗？")) {
                location.href = "/admin/deleteclass/" + number;
            }
        }

        function editInfo(obj, flag) {
            if (flag == 0) {
                //新建班级
                console.log("管理员端建立班级");
                $("#editForm").attr("action", "/admin/class");
                $("#editForm").get(0).reset();
            } else if (flag == 1) {
                //修改班级信息
                $("#editForm").attr("action", "/admin/updateclass");
                var classInfo = obj.parentNode.parentNode.childNodes;
                $("#classId").val(classInfo[1].innerHTML);
                $("#classGrade").val(classInfo[3].innerHTML);
                $("#classClass").val(classInfo[5].innerHTML);
                $("#classMajor").val(classInfo[7].innerHTML);
                if (classInfo[9].innerHTML.endsWith("(已注销)")) {
                    var end = classInfo[9].innerHTML.indexOf("(");
                    $("#classCreator").val(classInfo[9].innerHTML.substring(0,end));
                }else{
                    $("#classCreator").val(classInfo[9].innerHTML);
                }
                $("#classIntroduction").val(classInfo[13].innerHTML);
            }
        }
    </script>
</head>
<body>
<div id="wrapper">
    <!--头部：页面标题栏-->
    <jsp:include page="/part/manager.header.jsp"></jsp:include>
    <!--导航栏：页面菜单栏-->
    <jsp:include page="/part/manager.menu.jsp"></jsp:include>
    <!--表格-->
    <div id="page-wrapper">
        <div id="page-inner">
            <div class="row">
                <div class="col-md-12">
                    <!-- start dataTables -->
                    <!-- 表格格式：面板中嵌套表格 -->
                    <div class="panel panel-default">
                        <!-- 面板头放：页面标题，刷新按钮，添加按钮 -->
                        <div class="panel-heading">
                            <font size="4">班级列表</font>
                            <a href="<%=basePath%>admin/classes">
                                <span class="glyphicon glyphicon-repeat"></span>
                            </a>
                            <span style="float: right">
									<button type="button" class="btn btn-default btn-sm"
                                            data-toggle="modal" data-target="#myModal" onclick="editInfo(this,0)">
										<span class="glyphicon glyphicon-plane"></span> 新建班级
									</button>
								</span>
                        </div>
                        <!-- 面板体放：表格内容，按照dataTable格式来构造-->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover"
                                       id="dataTables-example">
                                    <thead>
                                    <tr>
                                        <th>编号</th>
                                        <th>年级</th>
                                        <th>班</th>
                                        <th>专业</th>
                                        <th>创建人</th>
                                        <th>班级人数</th>
                                        <th>班级介绍</th>
                                        <th>创建时间</th>
                                        <th>成员</th>
                                        <th>修改</th>
                                        <th>删除</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${classes}" var="myclass">

                                        <tr>
                                            <td>${myclass.classId}</td>
                                            <td>${myclass.classGrade}</td>
                                            <td>${myclass.classClass}</td>
                                            <td>${myclass.classMajor}</td>
                                            <td>${myclass.classCreator}</td>
                                            <td>${myclass.classNumberOfMember}</td>
                                            <td>${myclass.classIntroduction}</td>
                                            <td>${myclass.classCreateTime}</td>
                                            <td>
                                                <a id="classmates" href="<%=basePath%>/admin/class/${myclass.classId}">
                                                    <span class="glyphicon glyphicon-user"></span>
                                                </a>
                                            </td>
                                            <td>
                                                <a id="edit" href="#" data-toggle="modal" data-target="#myModal"
                                                   onclick="editInfo(this,1)">
                                                    <span class="glyphicon glyphicon-edit"></span>
                                                </a>
                                            </td>
                                            <td>
                                                <a href="javascript:doDelete(${myclass.classId})"
                                                   style="color: red">
                                                    <span class="glyphicon glyphicon-remove"></span>
                                                </a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <!--End dataTables -->
                    <!-- 按钮触发模态框 -->
                    <!-- 模态框（Modal） myModal-->
                    <div class="modal fade" id="myModal" tabindex="-1" role="dialog"
                         aria-labelledby="myModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal"
                                            aria-hidden="true">×
                                    </button>
                                    <!-- 表单嵌套表格：规范表单格式 -->
                                    <form id="editForm" action="#" method="post" role="form">
                                        <div class="form-group">
                                            <table class="table" style="font-family: 'Adobe 黑体 Std R'">
                                                <thead>
                                                <tr>
                                                    <th>班级信息：<input type="hidden" id="classId" name="classId"></th>
                                                    <th></th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                <tr>
                                                    <td><b>年级:</b></td>
                                                    <td><input type="text" id="classGrade" name="classGrade"
                                                               placeholder="2017"
                                                               class="form-control"/></td>
                                                </tr>
                                                <tr>
                                                    <td><b>班：</b></td>
                                                    <td><input type="text" id="classClass" name="classClass"
                                                               placeholder="1班"
                                                               class="form-control"/></td>
                                                </tr>
                                                <tr>
                                                    <td><b>专业：</b></td>
                                                    <td><input type="text" id="classMajor" name="classMajor"
                                                               placeholder="软件工程"
                                                               class="form-control"/></td>
                                                </tr>
                                                <tr>
                                                    <td><b>创建人学号：</b></td>
                                                    <td><input type="text" id="classCreator" name="classCreator"
                                                               placeholder="24320172203000"
                                                               class="form-control"/></td>
                                                </tr>
                                                <tr>
                                                    <td><b>班级介绍：</b></td>
                                                    <td><input type="text" id="classIntroduction"
                                                               name="classIntroduction"
                                                               class="form-control"/></td>
                                                </tr>
                                                </tbody>
                                            </table>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                                                </button>
                                                <input type="submit" value="提交" class="btn btn-primary">
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <!-- /.modal-dialog -->
                    </div>
                    <!-- /.modal -->
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="/part/manager.js.jsp"></jsp:include>
</body>
</html>