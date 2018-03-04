package model.bo;

import java.util.ArrayList;

import model.bean.SuDungMay;
import model.dao.SuDungMayDAO;

public class SuDungMayBO {
	SuDungMayDAO suDungMayDAO = new SuDungMayDAO();

	// them moi 1 su dung may:
	public boolean themSuDungMay(String maKH, String maMay,
			String ngayBatDauSuDung, String gioBatDauSuDung,
			String thoiGianSuDung) {
		return suDungMayDAO.themSuDungMay(maKH, maMay, ngayBatDauSuDung,
				gioBatDauSuDung, thoiGianSuDung);
	}

	// danh sach su dung may:
	public ArrayList<SuDungMay> danhSachSuDungMay() {
		return suDungMayDAO.danhSachSuDungMay();
	}
}
