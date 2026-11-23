<%@page import="dao.MemoDao"%>
<%@page import="dto.MemoDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	List<MemoDTO> list = MemoDao.getDao().listMemo();
	%>
	<table>
		<thead>
			<tr>
				<th>Num</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성 날짜</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (MemoDTO e : list) {
			%>
			<tr>
				<td><%=e.getNum()%></td>
				<td><a href="memoDetail.jsp?num=<%=e.getNum()%>"><%=e.getMtitle()%></a></td>
				<td><%=e.getMwriter()%></td>
				<td><%=e.getMdate()%></td>
			</tr>
			<%
			}
			%>
		</tbody>
		<tfoot>
		<tr>
		<td colspan="4">
		<a href="memoForm.jsp">메모 작성</a>
		</td>
		</tr>
		</tfoot>

	</table>

</body>
</html>