package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.TongHop;
import model.bo.TongHopBO;

/**
 * Servlet implementation class DanhSachTongHopServlet
 */
@WebServlet("/DanhSachTongHopServlet")
public class DanhSachTongHopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachTongHopServlet() {
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
		TongHopBO tongHopBO = new TongHopBO();
		
		// lay danh sach tong hop:
		ArrayList<TongHop> danhSachTongHop = tongHopBO.layDanhSachTongHop();
		request.setAttribute("danhSachTongHop", danhSachTongHop);
		
		// finally:
		RequestDispatcher rd = request.getRequestDispatcher("danhsachtonghop.jsp");
		rd.forward(request, response);
	}

}
