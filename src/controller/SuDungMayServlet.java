package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.SuDungMayBO;

/**
 * Servlet implementation class SuDungMayServlet
 */
@WebServlet("/SuDungMayServlet")
public class SuDungMayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuDungMayServlet() {
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
		SuDungMayBO suDungMayBO = new SuDungMayBO();
				
		// neu nhan submit:
		if("submit".equals(request.getParameter("submit"))){
			String maKH = request.getParameter("makhachhang");
			String maMay = request.getParameter("mamay");
			String ngayBatDauSuDung = request.getParameter("ngaybatdausudung");
			String gioBatDauSuDung = request.getParameter("giobatdausudung");
			String thoiGianSuDung = request.getParameter("thoigiansudung");
			// them moi su dung may:
			suDungMayBO.themSuDungMay(maKH, maMay, ngayBatDauSuDung, gioBatDauSuDung, thoiGianSuDung);
			response.sendRedirect("DangKySuDungMayServlet");			
		}else {													//chuyen sang trang Them sinh vien
			RequestDispatcher rd = request.getRequestDispatcher("DangKySuDungMayServlet");
			rd.forward(request, response);
		}		
		
	}

}
