<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src = "${pageContext.request.contextPath }/resources/js/jquery-1.7.1.js"></script>
</head>
<body>
<c:choose>
<c:when test="${sessionScope.member.id == null }">
<form action = "${pageContext.request.contextPath }/member/login.do">
id<input type = "text" name = "id"> pw <input type = "password" name = "pwd">
<input type = "submit" value = "�α���">   &nbsp;  <a href = "${pageContext.request.contextPath }/member/insert.do">ȸ�������ϱ�</a>
</form>
</c:when>
<c:otherwise>
${sessionScope.member.id } �� �α���
&nbsp;  
<c:if test="${sessionScope.member.type == 1 && sessionScope.member.id ne 'admin'}">
<a href = "${pageContext.request.contextPath }/seller/productAddPage.do">��ǰ���</a>
</c:if>
<c:if test="${sessionScope.member.id eq 'admin' }">ī�װ����</c:if>
<a href = "${pageContext.request.contextPath }/member/searchForEdit.do">��������</a>
<a href = "${pageContext.request.contextPath }/member/logout.do">�α׾ƿ�</a>

</c:otherwise>
</c:choose>
<hr>
<form action = "${pageContext.request.contextPath }/imgupload.do" enctype="multipart/form-data">

</form>


</body>
</html>