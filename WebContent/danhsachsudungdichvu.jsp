<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.*"%>
<%@page import="model.bo.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Danh sách sử dụng dịch vụ</title>
<link href="css/mos-style.css" rel='stylesheet' type='text/css' />
<!--../ ; ./: dai dien cho ky tu cung hang  -->
</head>

<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div id="wrapper">
		<jsp:include page="menu.jsp"></jsp:include>
		<div id="rightContent">
			<%
				ArrayList<SuDungDichVu> danhSachSuDungDichVu = (ArrayList<SuDungDichVu>) request.getAttribute("danhSachSuDungDichVu");
			%>
			<div id="table-may">
				<table>
					<h1>Danh sách sử dụng dịch vụ</h1>
					<h4>
						<a href="createnewcustomers.jsp">Chức năng cập nhật</a>
					</h4>
					<span>Tìm kiếm</span>
					<input type="text" placeholder="Search..">
					<tr>
						<th>Mã khách hàng</th>
						<th>Mã dịch vụ</th>
						<th>Ngày sử dụng</th>
						<th>Giờ  sử dụng</th>
						<th>Số lượng</th>
						<th>Chức năng</th>
					</tr>
					<%
						for(SuDungDichVu suDungDichVu : danhSachSuDungDichVu){
					%>
					<tr>
						<td><%=suDungDichVu.getMaKhachHang()%></td>
						<td><%=suDungDichVu.getMaDichVu()%></td>
						<td><%=suDungDichVu.getNgaySuDung()%></td>
						<td><%=suDungDichVu.getGioSuDung()%></td>
						<td><%=suDungDichVu.getSoLuong()%></td>
						<td><a
							href="SuDungDichVuServlet?maKhachHangURL=<%=suDungDichVu.getMaKhachHang()%>">Cập nhật</a>							
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