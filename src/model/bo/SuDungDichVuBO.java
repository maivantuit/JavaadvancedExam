package model.bo;

import java.util.ArrayList;

import model.bean.SuDungDichVu;
import model.dao.SuDungDichVuDAO;

public class SuDungDichVuBO {
	SuDungDichVuDAO suDungDichVuDAO = new SuDungDichVuDAO();
	// lay danh sach su dung dich vu:	
			public ArrayList<SuDungDichVu> layDuLieuBangSuDungDichVu(){
				return suDungDichVuDAO.layDuLieuBangSuDungDichVu();
			}
			// them su dung dich vu moi:
			public boolean themSuDungDichVu(String maKH, String maDV, String ngaySuDung, String gioSuDung,String soLuong){
				return suDungDichVuDAO.themSuDungDichVu(maKH, maDV, ngaySuDung, gioSuDung, soLuong);
			}
}
