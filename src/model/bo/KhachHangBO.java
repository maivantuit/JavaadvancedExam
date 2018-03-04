package model.bo;

import java.util.ArrayList;

import model.bean.KhachHang;
import model.dao.KhachHangDAO;

public class KhachHangBO {
	KhachHangDAO khachHangDAO = new KhachHangDAO();
	// lay du lieu bang khach hang (makhachhang-tenkhachhang):
		public ArrayList<KhachHang> layDuLieuBangKhachHang(){
			return khachHangDAO.layDuLieuBangKhachHang();
		}
}
