package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.bean.KhachHang;

import common.DBConnect;

public class KhachHangDAO {
	// lay du lieu bang khach hang (makhachhang-tenkhachhang):
	public ArrayList<KhachHang> layDuLieuBangKhachHang(){
		Connection con = DBConnect.getConnection();
		String sql = "select * from KhachHang";
		ArrayList<KhachHang> danhSachKhachHang = new ArrayList<KhachHang>();
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = con.prepareCall(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				KhachHang khachHang = new KhachHang();
				khachHang.setMaKhachHang(rs.getString("MaKH"));
				khachHang.setTenKhachHang(rs.getString("TenKH"));
				khachHang.setDiaChi(rs.getString("DiaChi"));
				khachHang.setSoDienThoai(rs.getString("SoDienThoai"));
				khachHang.setEmail(rs.getString("DiaChiEmail"));
				danhSachKhachHang.add(khachHang);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return danhSachKhachHang;
	}
	public static void main(String[] args) {
		KhachHangDAO k = new KhachHangDAO();
		ArrayList<KhachHang> list = k.layDuLieuBangKhachHang();
		for(KhachHang item : list){
			System.out.println(item.getMaKhachHang());
		}
	}
}
