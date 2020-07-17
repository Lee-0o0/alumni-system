<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div>
    <c:if test="${comments.size() > 0}">
        <div>
            <c:forEach var="comments" items="${comments}">
                <div>
                    <c:if test="${comments.node.mycommentParent != -1}">
                        &nbsp;&nbsp;&nbsp;&nbsp;
                    </c:if>
                    <a href="/admin/deletecomment/${comments.node.mycommentId}">
                    <span style="color: red" class="glyphicon glyphicon-remove"
                          title="删除该评论"></span>
                    </a>
                    <span class="fa fa-user"></span>
                    <strong>${comments.node.mycommentPublisher}</strong>
                    <c:if test="${comments.node.mycommentParent != -1}">
                        回复
                    </c:if>
                    : ${comments.node.mycommentContent}
                    <span style="float: right;color: #ce8483;font-size: 80%;">
                            ${formatter.format(comments.node.myCommentPublishTime)}
                    </span>
                    <hr>
                    <c:set var="comments" value="${comments.childs}" scope="request"/>
                    <jsp:include page="recurse.jsp"/>

                </div>
            </c:forEach>
        </div>
    </c:if>
</div>