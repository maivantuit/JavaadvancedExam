package model.bo;

import java.util.ArrayList;

import model.bean.DichVu;
import model.dao.DichVuDAO;

public class DichVuBO {
	DichVuDAO dichVuDAO = new DichVuDAO(); 
	// lay du lieu bang dich vu (madichvu-tendichvu):
			public ArrayList<DichVu> layDuLieuBangDichVu(){
				return dichVuDAO.layDuLieuBangDichVu();
			}
}
