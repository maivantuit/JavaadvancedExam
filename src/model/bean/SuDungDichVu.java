package model.bean;

public class SuDungDichVu {
	private String maKhachHang;
	private String maDichVu;
	private String ngaySuDung;
	private String gioSuDung;
	private String soLuong;
	/**
	 * 
	 */
	public SuDungDichVu() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param maKhachHang
	 * @param maDichVu
	 * @param ngaySuDung
	 * @param gioSuDung
	 * @param soLuong
	 */
	public SuDungDichVu(String maKhachHang, String maDichVu, String ngaySuDung,
			String gioSuDung, String soLuong) {
		super();
		this.maKhachHang = maKhachHang;
		this.maDichVu = maDichVu;
		this.ngaySuDung = ngaySuDung;
		this.gioSuDung = gioSuDung;
		this.soLuong = soLuong;
	}
	/**
	 * @return the maKhachHang
	 */
	public String getMaKhachHang() {
		return maKhachHang;
	}
	/**
	 * @param maKhachHang the maKhachHang to set
	 */
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	/**
	 * @return the maDichVu
	 */
	public String getMaDichVu() {
		return maDichVu;
	}
	/**
	 * @param maDichVu the maDichVu to set
	 */
	public void setMaDichVu(String maDichVu) {
		this.maDichVu = maDichVu;
	}
	/**
	 * @return the ngaySuDung
	 */
	public String getNgaySuDung() {
		return ngaySuDung;
	}
	/**
	 * @param ngaySuDung the ngaySuDung to set
	 */
	public void setNgaySuDung(String ngaySuDung) {
		this.ngaySuDung = ngaySuDung;
	}
	/**
	 * @return the gioSuDung
	 */
	public String getGioSuDung() {
		return gioSuDung;
	}
	/**
	 * @param gioSuDung the gioSuDung to set
	 */
	public void setGioSuDung(String gioSuDung) {
		this.gioSuDung = gioSuDung;
	}
	/**
	 * @return the soLuong
	 */
	public String getSoLuong() {
		return soLuong;
	}
	/**
	 * @param soLuong the soLuong to set
	 */
	public void setSoLuong(String soLuong) {
		this.soLuong = soLuong;
	}
	
}
