<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String root = (String) session.getAttribute("root");
	%>
	<center>
		<h2>게시글작성하기</h2>
		<form action="BoardWriteProc" method="post">
			<table width="600" bordercolor="gray">
				<tr height="40">
					<td align="center" width="150" bgcolor="lightgray">작성자</td>
					<td width="450"><input type="text" name="writer" size="60"></td>
				</tr>
				<tr height="40">
					<td align="center" width="150" bgcolor="lightgray">제목</td>
					<td width="450"><input type="text" name="subject" size="60"></td>
				</tr>
				<tr height="40">
					<td align="center" width="150" bgcolor="lightgray">이메일</td>
					<td width="450"><input type="email" name="email" size="60"></td>
				</tr>
				<tr height="40">
					<td align="center" width="150" bgcolor="lightgray">비밀번호</td>
					<td width="450"><input type="password" name="password"
						size="60"></td>
				</tr>
				<tr height="40">
					<td align="center" width="150" bgcolor="lightgray">글내용</td>
					<td width="450"><textarea rows="10" cols="60" name="content"></textarea></td>
				</tr>
				<tr height="40">
					<td align="center" colspan="2" width="600"><input
						type="submit" value="글쓰기">&nbsp;&nbsp; <input type="reset"
						value="다시작성"> &nbsp;&nbsp;
						<button onclick="location.href='BoardList'">전체 게시글보기</button></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>