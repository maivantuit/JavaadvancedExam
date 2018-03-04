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
public class May {
	private String maMay;
	private String viTri;
	private String trangThai;
	/**
	 * 
	 */
	public May() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param maMay
	 * @param viTri
	 * @param trangThai
	 */
	public May(String maMay, String viTri, String trangThai) {
		super();
		this.maMay = maMay;
		this.viTri = viTri;
		this.trangThai = trangThai;
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
	 * @return the viTri
	 */
	public String getViTri() {
		return viTri;
	}
	/**
	 * @param viTri the viTri to set
	 */
	public void setViTri(String viTri) {
		this.viTri = viTri;
	}
	/**
	 * @return the trangThai
	 */
	public String getTrangThai() {
		return trangThai;
	}
	/**
	 * @param trangThai the trangThai to set
	 */
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	
}
