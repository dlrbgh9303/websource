<%@page import="user.domain.UserDTO"%>
<%@page import="user.persistence.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

//join.jsp 에서 회원정보 입력값 가져오기

String userid = request.getParameter("userid");
String password = request.getParameter("password");
String username = request.getParameter("username");
String[] gender = request.getParameterValues("gender");
String email = request.getParameter("email");

//데이터베이스 작업 후 원하는 페이지로 이동
UserDAO dao = new UserDAO();



%>