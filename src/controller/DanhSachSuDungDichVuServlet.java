package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.SuDungDichVu;
import model.bo.SuDungDichVuBO;

/**
 * Servlet implementation class DanhSachSuDungDichVuServlet
 */
@WebServlet("/DanhSachSuDungDichVuServlet")
public class DanhSachSuDungDichVuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachSuDungDichVuServlet() {
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
		// lay danh sach su dung dich vu:
		ArrayList<SuDungDichVu> danhSachSuDungDichVu = suDungDichVuBO.layDuLieuBangSuDungDichVu();
		request.setAttribute("danhSachSuDungDichVu", danhSachSuDungDichVu);
		
		
		// finally:
		RequestDispatcher rd = request.getRequestDispatcher("danhsachsudungdichvu.jsp");
		rd.forward(request, response);
	}

}
