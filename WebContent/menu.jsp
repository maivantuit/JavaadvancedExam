<%-- 
    Document   : menu
    Created on : Nov 28, 2017, 10:06:57 AM
    Author     : CỌP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>menu-admin</title>
        
    </head>
    <body>
        <div id="leftBar">
            <ul>
                <li><a href="index.jsp">Trang chủ</a></li>                
                <li><a href="DangKySuDungMayServlet">Đăng ký sử dụng máy</a></li>
                <li><a href="DanhSachSuDungMayServlet">Danh sách sử dụng máy</a></li>
                <li><a href="DanhSachSuDungDichVuServlet">Danh sách sử dụng dịch vụ</a></li>
                <li><a href="DanhSachTongHopServlet">Tổng hợp và tìm kiếm</a></li>
               <li>
                	<a href="manager_hoadonbanhang.jsp">Quản lý bài đăng</a>
                	<ul class="sub-menu2">                	
						<li><a href="DanhSachBaiDangServlet?trangThaiUrl=<%="cpdd"%>">Chờ phê duyệt</a></li>
						<li><a href="DanhSachBaiDangServlet?trangThaiUrl=<%="dr"%>">Đang rao</a></li>	
						<li><a href="DanhSachBaiDangServlet?trangThaiUrl=<%="ktr"%>">Kết thúc rao</a></li>						
					</ul>
                </li>                
                <li><a href="manager_khachhang.jsp">Quản lý báo cáo thống kê</a></li>                
                <li><a href="#">Khác</a></li>                               
            </ul>
        </div>
    </body>
</html>
