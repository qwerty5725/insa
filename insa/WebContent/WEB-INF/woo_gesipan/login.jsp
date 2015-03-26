<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="com.ibatis.common.resources.Resources"%>
<%@ page import="com.ibatis.sqlmap.client.SqlMapClient"%>
<%@ page import="com.ibatis.sqlmap.client.SqlMapClientBuilder"%>
<%@ page import="java.io.Reader"%>
<%@ page import="java.util.List"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="./login_suc.jnb" method="post">
I D: <input type="text" name="user_name"><br>
Password: <input type="password" name="user_pass"><br>
<input type="submit" value="로그인">
                    
</form>
</body>
</html>