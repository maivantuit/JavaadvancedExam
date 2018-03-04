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
}
