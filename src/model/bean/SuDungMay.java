package model.bean;

public class SuDungMay {
	private String maKhachHang;
	private String maMay;
	private String ngayBatDauSuDung;
	private String gioBatDauSuDung;
	private String thoiGianSuDung;
	/**
	 * 
	 */
	public SuDungMay() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param maKhachHang
	 * @param maMay
	 * @param ngayBatDauSuDung
	 * @param gioBatDauSuDung
	 * @param thoiGianSuDung
	 */
	public SuDungMay(String maKhachHang, String maMay, String ngayBatDauSuDung,
			String gioBatDauSuDung, String thoiGianSuDung) {
		super();
		this.maKhachHang = maKhachHang;
		this.maMay = maMay;
		this.ngayBatDauSuDung = ngayBatDauSuDung;
		this.gioBatDauSuDung = gioBatDauSuDung;
		this.thoiGianSuDung = thoiGianSuDung;
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
	 * @return the maMay
	 */
	public String getMaMay() {
		return maMay;
	}
	/**
	 * @param maMay the maMay to set
	 */
	public void setMaMay(String maMay) {
		this.maMay = maMay;
	}
	/**
	 * @return the ngayBatDauSuDung
	 */
	public String getNgayBatDauSuDung() {
		return ngayBatDauSuDung;
	}
	/**
	 * @param ngayBatDauSuDung the ngayBatDauSuDung to set
	 */
	public void setNgayBatDauSuDung(String ngayBatDauSuDung) {
		this.ngayBatDauSuDung = ngayBatDauSuDung;
	}
	/**
	 * @return the gioBatDauSuDung
	 */
	public String getGioBatDauSuDung() {
		return gioBatDauSuDung;
	}
	/**
	 * @param gioBatDauSuDung the gioBatDauSuDung to set
	 */
	public void setGioBatDauSuDung(String gioBatDauSuDung) {
		this.gioBatDauSuDung = gioBatDauSuDung;
	}
	/**
	 * @return the thoiGianSuDung
	 */
	public String getThoiGianSuDung() {
		return thoiGianSuDung;
	}
	/**
	 * @param thoiGianSuDung the thoiGianSuDung to set
	 */
	public void setThoiGianSuDung(String thoiGianSuDung) {
		this.thoiGianSuDung = thoiGianSuDung;
	}
	
}
