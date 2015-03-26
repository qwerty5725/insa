<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="./gesipan_update.jnb" method="post" name="gasi">
		<table>
			<tr>
				<td>
					<table border="1" width="100%"  align="center">
						<tr>
							<td>번호 : <input type="text" name="num" id="num"
								value="${member.num}" readonly="readonly" /></td>
						</tr>
						<tr>
							<td>제목 : <input type="text" name="title"
								value="${member.title}">
							</td>
						</tr>
						<tr>
							<td>이름 : <input type="text" name="name"
								value="${member.name}" readonly="readonly">
							</td>
						</tr>
						<tr align="center">
							<td width="100%"><textarea name="content" cols="50"
									rows="20">${member.content}</textarea>
							</td>
						</tr>
					</table>
			
			<tr>
				<td>
					<table border="1" align="right">
						<tr>
							<td><input type="button" value="답글"
								onclick="location.href='./gesipan_reply.jnb'" />
							</td>
							<td><input type="submit" value="수정">
							</td>
							<td><input type="button" value="삭제"
								onclick="location.href='./gesipan_delete.jnb?num=${member.num}'" />
							</td>
							<td><input type="button" value="목록"
								onclick="location.href='./index.jnb'" />
							</td>
						</tr>
					</table></td>
			</tr>
			<tr>
				<td>
								<!-- 댓글 작성 table -->
					<table>
						<Tr>
							<td>아이디</td>
							<td><textarea id="content2" name="content2" cols="30" rows="3"></textarea></td>
							<td>날짜</td>
							<td><input type="button" onclick="gasi_board()" value="등록"></td>
						</Tr>
					</table>
				</td>																	<!-- 댓글 구현 부분 -->
			</tr>
			<c:if test="${list!= null }">				<!--  댓글이 null이 아닐경우 -->
			<tr>
				<td>
					<table border=1>															<!--  댓글 List 불러옴. -->
						<c:forEach items="${list}" var="list">
							<tr>
								<td>작성자</td>
								<td>${list.id}</td>
							</tr>
							<tr>
							<td>내용 :</td>
							<td>${list.content}</td>
							</tr>
							<tr>
							<td>작성일</td>
							<td>${list.insertdata}</td>
							</tr>
						</c:forEach>
					</table>
				</td>
			</tr>
			</c:if>
			
		</table></form></body>

</html>