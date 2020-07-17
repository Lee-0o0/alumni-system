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
    <title>校友列表</title>
    <jsp:include page="/part/manager.css.jsp"></jsp:include>
    <script type="text/javascript">
        var msg = '${msg}';
        if(msg!=""&&msg!=undefined){
            alert(msg);
        }
    </script>
    <script type="text/javascript">
        function doDelete(number) {
            if(confirm("您确定要删除学号为"+number+"的校友吗？")){
                location.href="<%=basePath%>admin/deletealumni/"+number;
            }
        }

        function editInfo(obj, flag) {
            if (flag == 0) {
                //添加校友
                $("#editForm").get(0).reset();
                $("#alumniNumber").removeAttr("readOnly");
                $("#editForm").attr("action", "/admin/alumni");
            } else if (flag == 1) {
                $("#editForm").attr("action", "/admin/updatealumni");
                $("#alumniNumber").attr("readOnly", "true");
                var alumniInfo = obj.parentNode.parentNode.childNodes;
                $("#alumniNumber").val(alumniInfo[1].innerHTML);
                $("#alumniName").val(alumniInfo[3].innerHTML);
                $("#alumniGender").val(alumniInfo[5].innerHTML);
                $("#alumniGrade").val(alumniInfo[7].innerHTML);
                $("#alumniMajor").val(alumniInfo[9].innerHTML);
                $("#alumniCity").val(alumniInfo[11].innerHTML);
                $("#alumniPhone").val(alumniInfo[13].innerHTML);
                $("#alumniMail").val(alumniInfo[15].innerHTML);
                $("#alumniCompany").val(alumniInfo[17].innerHTML);
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
                            <font size="4">页面标题</font>
                            <a href="<%=basePath%>admin/alumnis">
                                <span class="glyphicon glyphicon-repeat"></span>
                            </a>
                            <span style="float: right;margin-right: 5px;">
									<button type="button" class="btn btn-default btn-sm">
										<a href="<%=basePath%>/admin/download" style="color: black;text-decoration: none"><span class="glyphicon glyphicon-plane"></span> 导出校友</a>
									</button>
                            </span>
                            <span style="float: right;margin-right: 5px;">
									<button type="button" class="btn btn-default btn-sm"
                                            data-toggle="modal" data-target="#myModal" onclick="editInfo(this,0)">
										<span class="glyphicon glyphicon-plane"></span> 添加校友
									</button>
                            </span>
                            <span style="float: right;margin-right: 5px;">
									<button type="button" class="btn btn-default btn-sm"
                                            data-toggle="modal" data-target="#myModal1">
										<span class="glyphicon glyphicon-plane"></span> 批量导入校友
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
                                        <th>学号</th>
                                        <th>姓名</th>
                                        <th>性别</th>
                                        <th>年级</th>
                                        <th>专业</th>
                                        <th>所在城市</th>
                                        <th>电话</th>
                                        <th>邮箱</th>
                                        <th>公司</th>
                                        <th>班级</th>
                                        <th>修改</th>
                                        <th>删除</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${alumnis}" var="alumni" varStatus="ids">
                                        <tr>
                                            <c:if test="${alumni.alumniNumber == creator}">
                                                <td style="color: red">${alumni.alumniNumber}</td>
                                            </c:if>
                                            <c:if test="${alumni.alumniNumber != creator}">
                                                <td>${alumni.alumniNumber}</td>
                                            </c:if>
                                            <td>${alumni.alumniName}</td>
                                            <td>${alumni.alumniGender}</td>
                                            <td>${alumni.alumniGrade}</td>
                                            <td>${alumni.alumniMajor}</td>
                                            <td>${alumni.alumniCity}</td>
                                            <td>${alumni.alumniPhone}</td>
                                            <td>${alumni.alumniMail}</td>
                                            <td>${alumni.alumniCompany}</td>
                                            <td>${classes.get(ids.index)}</td>
                                            <td>
                                                <a id="edit" href="#" data-toggle="modal" data-target="#myModal"
                                                   onclick="editInfo(this,1)">
                                                    <span class="glyphicon glyphicon-edit"></span>
                                                </a>
                                            </td>
                                            <td>
                                                <a href="javascript:doDelete(${alumni.alumniNumber})"
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
                                                    <th>信息：<input type="hidden" id="hiddenId" name="hiddenName">
                                                    </th>
                                                    <th></th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                <tr>
                                                    <td><b>学号:</b></td>
                                                    <td><input type="text" id="alumniNumber" name="alumniNumber"
                                                               class="form-control"/></td>
                                                </tr>
                                                <tr>
                                                    <td><b>姓名：</b></td>
                                                    <td><input type="text" id="alumniName" name="alumniName"
                                                               class="form-control"/></td>
                                                </tr>
                                                <tr>
                                                    <td><b>性别：</b></td>
                                                    <td>
                                                        <select id="alumniGender" name="alumniGender"
                                                                class="form-control">
                                                            <option>男</option>
                                                            <option>女</option>
                                                        </select>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><b>年级：</b></td>
                                                    <td><input type="text" id="alumniGrade" name="alumniGrade"
                                                               class="form-control"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><b>专业：</b></td>
                                                    <td><input type="text" id="alumniMajor" name="alumniMajor"
                                                               class="form-control"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><b>所在城市：</b></td>
                                                    <td><input type="text" id="alumniCity" name="alumniCity"
                                                               class="form-control"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><b>电话：</b></td>
                                                    <td><input type="text" id="alumniPhone" name="alumniPhone"
                                                               class="form-control"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><b>邮箱：</b></td>
                                                    <td><input type="text" id="alumniMail" name="alumniMail"
                                                               class="form-control"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><b>公司：</b></td>
                                                    <td><input type="text" id="alumniCompany" name="alumniCompany"
                                                               class="form-control"/>
                                                    </td>
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

                    <div class="modal fade" id="myModal1" tabindex="-1" role="dialog"
                         aria-labelledby="myModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal"
                                            aria-hidden="true">×
                                    </button>
                                    <!-- 表单嵌套表格：规范表单格式 -->
                                    <form id="uploadForm" action="<%=basePath%>/admin/upload" method="post" role="form" enctype="multipart/form-data">
                                        <div class="form-group">
                                            <b>校友文件:</b><br>
                                            <br>
                                            <input type="file" id="file" name="file" />

                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                                                </button>
                                                <input type="submit" value="批量导入" class="btn btn-primary">
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <!-- /.modal-dialog -->
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="/part/manager.js.jsp"></jsp:include>
</body>
</html>