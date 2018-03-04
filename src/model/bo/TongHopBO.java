package model.bo;

import java.util.ArrayList;

import model.bean.TongHop;
import model.dao.TongHopDAO;

public class TongHopBO {
	TongHopDAO tongHopDAO =new TongHopDAO();
	// lay danh sach tong hop:
		public ArrayList<TongHop> layDanhSachTongHop(){
			return tongHopDAO.layDanhSachTongHop();
		}
		// tim kiem theo ma khach hang hoac theo gio bat dau su dung may hoac ngay bay dau su dung may:
		public ArrayList<TongHop> layDanhSachTimKiem(String maTimKiem ){
			return tongHopDAO.layDanhSachTimKiem(maTimKiem);
		}
}
