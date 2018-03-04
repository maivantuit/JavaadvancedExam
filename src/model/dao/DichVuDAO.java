package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.bean.DichVu;
import model.bean.KhachHang;

import common.DBConnect;

public class DichVuDAO {
	// lay du lieu bang dich vu (madichvu-tendichvu):
		public ArrayList<DichVu> layDuLieuBangDichVu(){
			Connection con = DBConnect.getConnection();
			String sql = "select * from DichVu";
			ArrayList<DichVu> danhSachDichVu = new ArrayList<DichVu>();
			ResultSet rs = null;
			try {
				PreparedStatement pstmt = con.prepareCall(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					DichVu dichVu = new DichVu();
					dichVu.setMaDichVu(rs.getString("MaDV"));
					dichVu.setTenDichVu(rs.getString("TenDV"));
					dichVu.setDonViTrinh(rs.getString("DonViTinh"));
					dichVu.setDonGia(rs.getString("DonGia"));					
					danhSachDichVu.add(dichVu);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}	
			return danhSachDichVu;
		}
		public static void main(String[] args) {
			DichVuDAO d = new DichVuDAO();
			ArrayList<DichVu> layDuLieuBangKhachHang = d.layDuLieuBangDichVu();
			for(DichVu item : layDuLieuBangKhachHang){
				System.out.println(item.getMaDichVu());
			}
		}
}
