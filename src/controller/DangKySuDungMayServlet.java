package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.KhachHang;
import model.bean.May;
import model.bean.SuDungMay;
import model.bo.KhachHangBO;
import model.bo.MayBO;
import model.bo.SuDungMayBO;

/**
 * Servlet implementation class DangKySuDungMayServlet
 */
@WebServlet("/DangKySuDungMayServlet")
public class DangKySuDungMayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DangKySuDungMayServlet() {
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
		// TODO Auto-generated method stub
		KhachHangBO khachHangBO = new KhachHangBO();
		MayBO mayBO = new MayBO();
		SuDungMayBO suDungMayBO = new SuDungMayBO(); 
		// lay du lieu bang khach hang (makhachhang-tenkhachhang):
		ArrayList<KhachHang> danhSachKhachHang = khachHangBO.layDuLieuBangKhachHang();
		request.setAttribute("danhSachKhachHang", danhSachKhachHang);
		// lay du lieu bang may (mamay-tenmay):
		ArrayList<May> danhSachMay = mayBO.layDuLieuBangMay();
		request.setAttribute("danhSachMay", danhSachMay);
		// lay du lieu bang su dung may:
		ArrayList<SuDungMay> danhSachSuDungMay = suDungMayBO.danhSachSuDungMay();
		request.setAttribute("danhSachSuDungMay", danhSachSuDungMay);
		
		
		// finally:
				RequestDispatcher rd = request.getRequestDispatcher("dangkysudungmay.jsp");
				rd.forward(request, response);
	}

}
