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
							<td>��ȣ : <input type="text" name="num" id="num"
								value="${member.num}" readonly="readonly" /></td>
						</tr>
						<tr>
							<td>���� : <input type="text" name="title"
								value="${member.title}">
							</td>
						</tr>
						<tr>
							<td>�̸� : <input type="text" name="name"
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
							<td><input type="button" value="���"
								onclick="location.href='./gesipan_reply.jnb'" />
							</td>
							<td><input type="submit" value="����">
							</td>
							<td><input type="button" value="����"
								onclick="location.href='./gesipan_delete.jnb?num=${member.num}'" />
							</td>
							<td><input type="button" value="���"
								onclick="location.href='./index.jnb'" />
							</td>
						</tr>
					</table></td>
			</tr>
			<tr>
				<td>
								<!-- ��� �ۼ� table -->
					<table>
						<Tr>
							<td>���̵�</td>
							<td><textarea id="content2" name="content2" cols="30" rows="3"></textarea></td>
							<td>��¥</td>
							<td><input type="button" onclick="gasi_board()" value="���"></td>
						</Tr>
					</table>
				</td>																	<!-- ��� ���� �κ� -->
			</tr>
			<c:if test="${list!= null }">				<!--  ����� null�� �ƴҰ�� -->
			<tr>
				<td>
					<table border=1>															<!--  ��� List �ҷ���. -->
						<c:forEach items="${list}" var="list">
							<tr>
								<td>�ۼ���</td>
								<td>${list.id}</td>
							</tr>
							<tr>
							<td>���� :</td>
							<td>${list.content}</td>
							</tr>
							<tr>
							<td>�ۼ���</td>
							<td>${list.insertdata}</td>
							</tr>
						</c:forEach>
					</table>
				</td>
			</tr>
			</c:if>
			
		</table></form></body>

</html>