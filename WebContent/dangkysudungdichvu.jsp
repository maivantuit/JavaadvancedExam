<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.*"%>
<%@page import="model.bo.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Đăng ký sử dụng dịch vụ</title>
<link href="css/mos-style.css" rel='stylesheet' type='text/css' />
<!--../ ; ./: dai dien cho ky tu cung hang  -->

</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	<div id="wrapper">
		<jsp:include page="menu.jsp"></jsp:include>
		<div id="rightContent">
			<h3>Đăng ký sử dụng dịch vụ</h3>
			<div id="createc1">
				<form class="form" action="SuDungDichVuServlet" method="POST">
					<table>			
									<%
										String khachHang = (String)request.getAttribute("maKhachHangURL");  
										if(khachHang!=null){																					
										%>
						<tr>								
							<td>Khách hàng:</td>
							<td><input readonly="readonly" value="<%=khachHang%>" type="text" name="makhachhang"> <!--nho bo text, bo date no loi-->
							</td>
						</tr>
						<%} else{ 
							khachHang ="";
						%>
						<tr>								
							<td>Khách hàng2:</td>
							<td><input readonly="readonly" value="<%=khachHang%>" type="text" name="makhachhang"> <!--nho bo text, bo date no loi-->
							</td>
						</tr>
						<%} %>
						
						<tr>
							<td>Dịch vụ:</td>
							<td><select name="madichvu">
									<option value="">---Chọn mã dịch vụ---</option>
									<%
										ArrayList<DichVu> danhSachDichVuMaDVTenDV = (ArrayList<DichVu>)request.getAttribute("danhSachDichVuMaDVTenDV");  
										for(DichVu dv: danhSachDichVuMaDVTenDV){
									%>
									<option value="<%=dv.getMaDichVu()%>"><%=dv.getMaDichVu()%> - <%=dv.getTenDichVu()%></option>
									<%
										}
									%>
							</select></td>
						</tr>
						<tr>
							<td>Ngày sử dụng:</td>
							<td><input type="text" name="ngaysudung"> <!--nho bo text, bo date no loi-->
							</td>
						</tr>
						<tr>
							<td>Giờ sử dụng:</td>
							<td><input type="time" name="giosudung"></td>
						</tr>
						<tr>
							<td>Số lượng:</td>
							<td><input type="text" name="soluong"></td>
						</tr>
						<tr id="bt">
							<td></td>
							<td>
								<button type="submit" value="submit" name="submit">Create
									new</button>
							</td>
						</tr>
					</table>
				</form>
			</div>
			
<!-- ======================================================================================================================== -->

		<%
			ArrayList<SuDungDichVu> danhSachSuDungDichVu = (ArrayList<SuDungDichVu>) request.getAttribute("danhSachSuDungDichVu");
		%>
		<div id="table-may">
			<table>
				<h3>Danh sách sử dụng dịch vụ</h3>				
				<span>Tìm kiếm</span>
				<input type="text" placeholder="Search..">
				<tr>
					<th>Mã khách hàng</th>
					<th>Mã dịch vụ</th>
					<th>Ngày bắt đầu sử dụng</th>
					<th>Giờ bắt đầu sử dụng</th>
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
						href="UpdateCustomersServlet?mkh=<%=suDungDichVu.getMaKhachHang()%>">Update</a>
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
			
		</div><!-- div table duoi, trong 1 cai div -->
	
		<div class="clear"></div>
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>
