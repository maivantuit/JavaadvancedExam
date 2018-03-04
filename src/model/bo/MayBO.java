package model.bo;

import java.util.ArrayList;

import model.bean.May;
import model.dao.MayDAO;

public class MayBO {
	MayDAO mayDAO = new MayDAO();
	// lay du lieu bang may (mamay-tenmay):
			public ArrayList<May> layDuLieuBangMay(){
				return mayDAO.layDuLieuBangMay();					
			}
}
