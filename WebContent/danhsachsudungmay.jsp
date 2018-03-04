<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.*"%>
<%@page import="model.bo.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Danh sách sử dụng máy</title>
<link href="css/mos-style.css" rel='stylesheet' type='text/css' />
<!--../ ; ./: dai dien cho ky tu cung hang  -->
</head>

<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div id="wrapper">
		<jsp:include page="menu.jsp"></jsp:include>
		<div id="rightContent">
			<%
				ArrayList<SuDungMay> danhSachSuDungMay = (ArrayList<SuDungMay>) request.getAttribute("danhSachSuDungMay");
			%>
			<div id="table-may">
				<table>
					<h1>Danh sách sử dụng máy</h1>
					<h4>
						<a href="createnewcustomers.jsp">Chức năng cập nhật</a>
					</h4>
					<span>Tìm kiếm</span>
					<input type="text" placeholder="Search..">
					<tr>
						<th>Mã khách hàng</th>
						<th>Mã máy</th>
						<th>Ngày bắt đầu sử dụng</th>
						<th>Giờ bắt đầu sử dụng</th>
						<th>Thời gian sử dụng</th>
						<th>Chức năng</th>
					</tr>
					<%
						for(SuDungMay suDungMay : danhSachSuDungMay){
					%>
					<tr>
						<td><%=suDungMay.getMaKhachHang()%></td>
						<td><%=suDungMay.getMaMay()%></td>
						<td><%=suDungMay.getNgayBatDauSuDung()%></td>
						<td><%=suDungMay.getGioBatDauSuDung()%></td>
						<td><%=suDungMay.getThoiGianSuDung()%></td>
						<td><a
							href="UpdateCustomersServlet?mkh=<%=suDungMay.getMaKhachHang()%>">Update</a>
							<a href="">Delete</a></td>
					</tr>
					<%
						}
					%>

				</table>
				<div class="pagination">
					<a href="#">&laquo;</a> <a href="#">1</a> <a href="#">2</a> <a
						href="#">3</a> <a href="#">4</a> <a href="#">5</a> <a href="#">6</a>
					<a href="#">&raquo;</a>
				</div>
			</div>

		</div>
		<!-- div table duoi, trong 1 cai div -->

		<div class="clear"></div>
		<jsp:include page="footer.jsp"></jsp:include>
	</div>



</body>
</html>