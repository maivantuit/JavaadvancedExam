package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.bean.KhachHang;
import model.bean.TongHop;

import common.DBConnect;

public class TongHopDAO {
	// lay danh sach tong hop:
	public ArrayList<TongHop> layDanhSachTongHop(){
		Connection con = DBConnect.getConnection();
		String sql = "select KhachHang.MaKH,TenKH,May.MaMay,ViTri,TrangThai,NgayBatDauSuDung,GioBatDauSuDung, ThoiGianSuDung,DichVu.MaDV,NgaySuDung,GioSuDung,SoLuong,DichVu.DonGia*SoLuong as TongTien from KhachHang join SuDungMay on KhachHang.MaKH = SuDungMay.MaKH join SuDungDichVu on KhachHang.MaKH = SuDungDichVu.MaKH join DichVu on DichVu.MaDV = SuDungDichVu.MaDV join May on May.MaMay = SuDungMay.MaMay";
		ArrayList<TongHop> danhSachTongHop = new ArrayList<TongHop>();
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = con.prepareCall(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				TongHop tongHop = new TongHop();
				tongHop.setMaKhachHang(rs.getString("MaKH"));
				tongHop.setTenKhachHang(rs.getString("TenKH"));
				tongHop.setMaMay(rs.getString("MaMay"));
				tongHop.setViTri(rs.getString("ViTri"));
				tongHop.setTrangThai(rs.getString("TrangThai"));
				tongHop.setNgayBatDauSuDungMay(rs.getString("NgayBatDauSuDung"));
				tongHop.setGioBatDauSuDungMay(rs.getString("GioBatDauSuDung"));
				tongHop.setThoiGianSuDungMay(rs.getString("ThoiGianSuDung"));
				tongHop.setMaDichVu(rs.getString("MaDV"));
				tongHop.setNgaySuDungDichVu(rs.getString("NgaySuDung"));
				tongHop.setGioSuDungDichVu(rs.getString("GioSuDung"));
				tongHop.setSoLuong(rs.getString("SoLuong"));
				tongHop.setTongTien(rs.getString("TongTien"));				
				danhSachTongHop.add(tongHop);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return danhSachTongHop;
	}
	public static void main(String[] args) {
		TongHopDAO t =new TongHopDAO();
		ArrayList<TongHop> list = t.layDanhSachTongHop();
		for(TongHop item: list){
			System.out.println(item.getMaKhachHang());
		}
	}
}
