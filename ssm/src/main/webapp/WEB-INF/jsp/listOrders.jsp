
<%@page import="java.util.List"%>
<%@page import="com.dg.bean.OrderInfoBean"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<OrderInfoBean> orderList = (List<OrderInfoBean>) request.getAttribute("orderList");
	%>
	<table border="1">
		<tbody>
			<%
				String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
						+ request.getContextPath();
				int i = 1;
				for (OrderInfoBean order : orderList) {
			%>
			<tr>
				<td><%=i++%></td>
				<td><%=order.getOrdDate()%></td>
				<td><%=order.getOrdId()%></td>
				<td><%=order.getChannelId()%></td>
				<td><%=order.getTransStat()%></td>
				<td><%=order.getTxnAmt()%></td>
				<td><%=order.getMerId()%></td>
				<td><%=order.getTransStat()%></td>
				<td><a
					href=<%=basePath + "/order/deleteOrder?ordDate=" + order.getOrdDate() + "&ordId=" + order.getOrdId()%>>删除</a></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
</body>
</html>