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
<input type = "submit" value = "로그인">   &nbsp;  <a href = "${pageContext.request.contextPath }/member/insert.do">회원가입하기</a>
</form>
</c:when>
<c:otherwise>
${sessionScope.member.id } 님 로그인
&nbsp;  
<c:if test="${sessionScope.member.type == 1 && sessionScope.member.id ne 'admin'}">
<a href = "${pageContext.request.contextPath }/seller/productAddPage.do">상품등록</a>
</c:if>
<c:if test="${sessionScope.member.id eq 'admin' }">카테고리등록</c:if>
<a href = "${pageContext.request.contextPath }/member/searchForEdit.do">정보수정</a>
<a href = "${pageContext.request.contextPath }/member/logout.do">로그아웃</a>

</c:otherwise>
</c:choose>
<hr>
<form action = "${pageContext.request.contextPath }/imgupload.do" enctype="multipart/form-data">

</form>


</body>
</html>