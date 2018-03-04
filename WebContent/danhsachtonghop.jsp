<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.*"%>
<%@page import="model.bo.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Danh sách tổng hợp</title>
<link href="css/mos-style.css" rel='stylesheet' type='text/css' />
<!--../ ; ./: dai dien cho ky tu cung hang  -->
</head>

<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div id="wrapper">
		<jsp:include page="menu.jsp"></jsp:include>
		<div id="rightContent">
			<%
				ArrayList<TongHop> danhSachTongHop = (ArrayList<TongHop>) request.getAttribute("danhSachTongHop");
			%>
			<div id="table-may">
				<table>
					<h1>Danh sách tổng hợp</h1>
					<h4>
						<a href="createnewcustomers.jsp">Chức năng cập nhật</a>
					</h4>
					<span>Tìm kiếm</span>
					<input type="text" placeholder="Search..">
					<tr>
						<th>Mã khách hàng</th>
						<th>Tên khách hàng</th>
						<th>Mã máy</th>
						<th>Ví trị</th>
						<th>Trạng thái</th>
						<th>Ngày bắt đầu sử dụng máy</th>
						<th>Giờ bắt đầu sử dụng máy</th>
						<th>Thời gian sử dụng máy</th>
						<th>Mã dịch vụ</th>
						<th>Ngày sử dụng dịch vụ</th>
						<th>Giờ sử dụng dịch vụ</th>
						<th>Số lương</th>
						<th>Tổng tiền</th>
						<th>Chức năng</th>
					</tr>
					<%
						for(TongHop tongHop : danhSachTongHop){
					%>
					<tr>
						<td><%=tongHop.getMaKhachHang()%></td>
						<td><%=tongHop.getTenKhachHang()%></td>
						<td><%=tongHop.getMaMay()%></td>
						<td><%=tongHop.getViTri()%></td>
						<td><%=tongHop.getTrangThai()%></td>
						<td><%=tongHop.getNgayBatDauSuDungMay()%></td>
						<td><%=tongHop.getGioBatDauSuDungMay()%></td>
						<td><%=tongHop.getThoiGianSuDungMay()%></td>
						<td><%=tongHop.getMaDichVu()%></td>
						<td><%=tongHop.getNgaySuDungDichVu()%></td>
						<td><%=tongHop.getGioSuDungDichVu()%></td>
						<td><%=tongHop.getSoLuong()%></td>						
						<td><%=tongHop.getTongTien()%></td>
						<td><a
							href="UpdateCustomersServlet?mkh=<%=tongHop.getMaKhachHang()%>">Update</a>
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