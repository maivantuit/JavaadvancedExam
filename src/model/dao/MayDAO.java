package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.bean.KhachHang;
import model.bean.May;

import common.DBConnect;

public class MayDAO {
	// lay du lieu bang may (mamay-tenmay):
		public ArrayList<May> layDuLieuBangMay(){
			Connection con = DBConnect.getConnection();
			String sql = "select * from May";
			ArrayList<May> danhSachMay= new ArrayList<May>();
			ResultSet rs = null;
			try {
				PreparedStatement pstmt = con.prepareCall(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					May may = new May();
					may.setMaMay(rs.getString("MaMay"));
					may.setViTri(rs.getString("ViTri"));
					may.setTrangThai(rs.getString("TrangThai"));	
					danhSachMay.add(may);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}	
			return danhSachMay;
		}
		public static void main(String[] args) {
			MayDAO m = new MayDAO();
			ArrayList<May> list = m.layDuLieuBangMay();
			for(May item: list){
				System.out.println(item.getMaMay());
			}
		}
}
