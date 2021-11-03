<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>user 페이지</h2>
<h2>세션 객체에 담긴 값 : <%=session.getAttribute("name") %></h2>
<div>
<a href="main.jsp">섹션 1페이지</a>
</div>
<a href="section1.jsp">user 페이지</a>
<div>
<a href="session1.jsp">세션 페이지</a>
</div>
</body>
</html>