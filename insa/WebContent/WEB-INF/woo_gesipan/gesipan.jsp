<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title><script type="text/javascript">
	function cancle() {
		location.href="./login.jnb";
	}
	function cancle2(){
		location.href="./memberInsert.jnb";
	}
	//POST방식으로 보낼때 사용하는 스크립트!!중요!!!
	function test1(){
		var testF = document.testform;
		testF.action="./login.jnb";
		testF.method="POST";
		testF.submit();
	}
</script>
</head>
<body>
<form name='testform'>
</form>

	<form action="./gesipan_Write.jnb" method="post">
		<table border="1" align="center" width="100%">
			<tr height="10px" align="center">
				<td>번호</td>
				<td>제목</td>
				<td>글쓴이</td>
				<td>시간</td>
			</tr>		
			
			<!-- glist의 길이 많큼 for문 실행 -->
			<c:forEach items="${glist }" var="glist">
			<tr align="center" height="15px">
					<td>${glist.num }</td>			<!-- 게시물 번호 -->
					<td><a href="./gesipan_rview.jnb?num=${glist.num }">${glist.title }</a></td>
					<td>${glist.name }</td> 			<!-- 게시물  작성자-->
					<td>${glist.regdate }</td> 			<!--  게시물 작성일자 -->
					</tr>
			</c:forEach>
		</table>
		<table align="right">		
			<tr>
			<td><input type="button" value="로그인" onclick="test1()" ></td>
			<td><input type="button" value="회원가입" onclick="cancle2()"></td>	
			<td><input type="submit" value="글 쓰기" ></td>					
			</tr>
		</table> 
		</form>
		 
		</body>

</html>