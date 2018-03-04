package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import model.bean.DichVu;
import model.bean.KhachHang;
import model.bean.SuDungDichVu;

import common.DBConnect;

public class SuDungDichVuDAO {
	// lay danh sach su dung dich vu:	
		public ArrayList<SuDungDichVu> layDuLieuBangSuDungDichVu(){
			Connection con = DBConnect.getConnection();
			String sql = "select * from SuDungDichVu";
			ArrayList<SuDungDichVu> danhSachSuDungDichVu = new ArrayList<SuDungDichVu>();
			ResultSet rs = null;
			try {
				PreparedStatement pstmt = con.prepareCall(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					SuDungDichVu suDungDichVu = new SuDungDichVu();
					suDungDichVu.setMaKhachHang(rs.getString("MaKH"));
					suDungDichVu.setMaDichVu(rs.getString("MaDV"));
					suDungDichVu.setNgaySuDung(rs.getString("NgaySuDung"));
					suDungDichVu.setGioSuDung(rs.getString("GioSuDung"));
					suDungDichVu.setSoLuong(rs.getString("SoLuong"));					
					danhSachSuDungDichVu.add(suDungDichVu);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}	
			return danhSachSuDungDichVu;
		}
		// them su dung dich vu moi:
		public boolean themSuDungDichVu(String maKH, String maDV, String ngaySuDung, String gioSuDung,String soLuong){
			Connection con = DBConnect.getConnection();
			String sql=null;
			try {
				SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		        java.util.Date parsed = d.parse(ngaySuDung);
		        java.sql.Date sq = new java.sql.Date(parsed.getTime());	
		        sql = String.format("insert into SuDungDichVu(MaKH,MaDV,NgaySuDung,GioSuDung,SoLuong) values('%s','%s','%s','%s','%s')", maKH,maDV,sq,gioSuDung,soLuong);
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
		public static void main(String[] args) {
			SuDungDichVuDAO s = new SuDungDichVuDAO();
			boolean check = s.themSuDungDichVu("KH02", "DV01", "03/03/2018", "10:00", "2");
			if(check){	
				System.out.println("oke");
			}else{
				System.out.println("not oke");
			}
		}
}
