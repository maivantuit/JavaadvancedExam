package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.DichVu;
import model.bean.SuDungDichVu;
import model.bo.DichVuBO;
import model.bo.SuDungDichVuBO;

/**
 * Servlet implementation class SuDungDichVuServlet
 */
@WebServlet("/SuDungDichVuServlet")
public class SuDungDichVuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuDungDichVuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SuDungDichVuBO suDungDichVuBO = new SuDungDichVuBO(); 
		DichVuBO dichVuBO = new DichVuBO();
		// lay danh sach su dung dich vu:
		ArrayList<SuDungDichVu> danhSachSuDungDichVu = suDungDichVuBO.layDuLieuBangSuDungDichVu();
		request.setAttribute("danhSachSuDungDichVu", danhSachSuDungDichVu);
		
		// maKhachHangURL lay tu url jsp: danhsachsudungmay can them dich vu:
		String maKhachHangURL = request.getParameter("maKhachHangURL");
		request.setAttribute("maKhachHangURL", maKhachHangURL);
		// lay du lieu bang dich vu (madichvu-tendichvu):
		ArrayList<DichVu> danhSachDichVuMaDVTenDV= dichVuBO.layDuLieuBangDichVu();
		request.setAttribute("danhSachDichVuMaDVTenDV", danhSachDichVuMaDVTenDV);
		
		// neu nhan submit:
				if("submit".equals(request.getParameter("submit"))){
					String maKH = request.getParameter("makhachhang");
					String maDV = request.getParameter("madichvu");
					String ngaySuDung = request.getParameter("ngaysudung");
					String gioSuDung = request.getParameter("giosudung");
					String soLuong = request.getParameter("soluong");
					// them moi su dung may:
					suDungDichVuBO.themSuDungDichVu(maKH, maDV, ngaySuDung, gioSuDung, soLuong);
					response.sendRedirect("DanhSachSuDungDichVuServlet");			
				}else {	//chuyen sang trang dangkysudungdichvu
					RequestDispatcher rd = request.getRequestDispatcher("dangkysudungdichvu.jsp");
					rd.forward(request, response);
				}		
				// co the null: 2 truong hop 
				/*
				 * 1: la do maKhachHang
				 * 2: la do danh sach su dung dich vu chua list het
				 */
	}

}
