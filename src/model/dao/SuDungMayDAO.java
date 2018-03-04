package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import model.bean.KhachHang;
import model.bean.SuDungMay;

import common.DBConnect;

public class SuDungMayDAO {
	// them moi 1 su dung may:
	public boolean themSuDungMay(String maKH, String maMay,
			String ngayBatDauSuDung, String gioBatDauSuDung,
			String thoiGianSuDung) {
		Connection con = DBConnect.getConnection();
		String sql = null;
		try {
			SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
			java.util.Date parsed = d.parse(ngayBatDauSuDung);
			java.sql.Date sq = new java.sql.Date(parsed.getTime());
			sql = String
					.format("insert into SuDungMay(MaKH,MaMay,NgayBatDauSuDung,GioBatDauSuDung,ThoiGianSuDung) values('%s','%s','%s','%s','%s')",
							maKH, maMay, sq, gioBatDauSuDung, thoiGianSuDung);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// danh sach su dung may:
	public ArrayList<SuDungMay> danhSachSuDungMay(){
		Connection con = DBConnect.getConnection();
		String sql = "select * from SuDungMay";
		ArrayList<SuDungMay> danhSachSuDungMay = new ArrayList<SuDungMay>();
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = con.prepareCall(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				SuDungMay suDungMay = new SuDungMay();
				suDungMay.setMaKhachHang(rs.getString("MaKH"));
				suDungMay.setMaMay(rs.getString("MaMay"));
				suDungMay.setNgayBatDauSuDung(rs.getString("NgayBatDauSuDung"));
				suDungMay.setGioBatDauSuDung(rs.getString("GioBatDauSuDung"));
				suDungMay.setThoiGianSuDung(rs.getString("ThoiGianSuDung"));
				danhSachSuDungMay.add(suDungMay);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return danhSachSuDungMay;
	}
	
	
	public static void main(String[] args) {
		SuDungMayDAO s = new SuDungMayDAO();		
		ArrayList<SuDungMay> list = s.danhSachSuDungMay();
		for(SuDungMay item : list){
			System.out.println(item.getMaKhachHang());
		}
	}
}
