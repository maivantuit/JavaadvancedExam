package model.bean;
/**
 * May.java
 *
 * Version 1.0
 *
 * Date: Mar 07, 2018
 *
 * Copyright 
 *
 * Modification Logs:
 * DATE                 AUTHOR          DESCRIPTION
 * -----------------------------------------------------------------------
 * 07-Mar-18        	TuMV          	Create
 */
public class DichVu {
	private String maDichVu;
	private String tenDichVu;
	private String donViTrinh;
	private String donGia;
	/**
	 * 
	 */
	public DichVu() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param maDichVu
	 * @param tenDichVu
	 * @param donViTrinh
	 * @param donGia
	 */
	public DichVu(String maDichVu, String tenDichVu, String donViTrinh,
			String donGia) {
		super();
		this.maDichVu = maDichVu;
		this.tenDichVu = tenDichVu;
		this.donViTrinh = donViTrinh;
		this.donGia = donGia;
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
	 * @return the tenDichVu
	 */
	public String getTenDichVu() {
		return tenDichVu;
	}
	/**
	 * @param tenDichVu the tenDichVu to set
	 */
	public void setTenDichVu(String tenDichVu) {
		this.tenDichVu = tenDichVu;
	}
	/**
	 * @return the donViTrinh
	 */
	public String getDonViTrinh() {
		return donViTrinh;
	}
	/**
	 * @param donViTrinh the donViTrinh to set
	 */
	public void setDonViTrinh(String donViTrinh) {
		this.donViTrinh = donViTrinh;
	}
	/**
	 * @return the donGia
	 */
	public String getDonGia() {
		return donGia;
	}
	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(String donGia) {
		this.donGia = donGia;
	}
	
}
