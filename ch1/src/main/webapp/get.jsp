<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//사용자의 요청을 가져올 때 request 로 처리
    	//사용자의 요청은 무조건 String 형태임
    	String username = request.getParameter("username");
    	String age = request.getParameter("age");
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>이름 : <%=username%></h3>
<h3>나이 : <%=age%></h3>

</body>
</html>