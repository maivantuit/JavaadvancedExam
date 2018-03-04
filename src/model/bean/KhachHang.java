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
public class KhachHang {
	private String maKhachHang;
	private String tenKhachHang;
	private String diaChi;
	private String soDienThoai;
	private String email;
	/**
	 * 
	 */
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param maKhachHang
	 * @param tenKhachHang
	 * @param diaChi
	 * @param soDienThoai
	 * @param email
	 */
	public KhachHang(String maKhachHang, String tenKhachHang, String diaChi,
			String soDienThoai, String email) {
		super();
		this.maKhachHang = maKhachHang;
		this.tenKhachHang = tenKhachHang;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.email = email;
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
	 * @return the tenKhachHang
	 */
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	/**
	 * @param tenKhachHang the tenKhachHang to set
	 */
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	/**
	 * @return the diaChi
	 */
	public String getDiaChi() {
		return diaChi;
	}
	/**
	 * @param diaChi the diaChi to set
	 */
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	/**
	 * @return the soDienThoai
	 */
	public String getSoDienThoai() {
		return soDienThoai;
	}
	/**
	 * @param soDienThoai the soDienThoai to set
	 */
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
}
