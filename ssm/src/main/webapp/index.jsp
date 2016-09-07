
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h2>订单查询</h2>
	<form action="http://localhost:8080/ssm/order/showOrder" method="post">
		订单日期：<input type="text" name="ordDate" value="20150817"><br>
		 订单号：<input type="text" name="ordId" value="00181340000072"><br> 
		 <input type="submit" value="提交">
	</form>
	
	<!-- -->
	<h2>按日期范围查询订单，测试redis缓存</h2>
	<form action="http://localhost:8080/ssm/order/listOrders" method="post">
		开始日期：<input type="text" name="startDate"><br>
		 结束日期：<input type="text" name="endDate"><br> 
		 <input type="submit" value="提交">
	</form>
	
	 
</body>
</html>