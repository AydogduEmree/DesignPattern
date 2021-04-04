package com.mydbpattern.db.mysql;

import java.math.BigDecimal;

public class Users {
	
	private int id;
	private String USERNAME;
	private String PASSWORD;
	private String FIRSTNAME;
	private String LASTNAME;
	private String EMAIL;
	public Users() {
		
	}
	
	public Users(String uSERNAME, String pASSWORD, String fIRSTNAME, String lASTNAME, String eMAIL) {
		this.USERNAME = uSERNAME;
		this.PASSWORD = pASSWORD;
		this.FIRSTNAME = fIRSTNAME;
		this.LASTNAME = lASTNAME;
		this.EMAIL = eMAIL;
	}
	
	public Users(int id, String uSERNAME, String pASSWORD, String fIRSTNAME, String lASTNAME, String eMAIL) {
		this.id = id;
		this.USERNAME = uSERNAME;
		this.PASSWORD = pASSWORD;
		this.FIRSTNAME = fIRSTNAME;
		this.LASTNAME = lASTNAME;
		this.EMAIL = eMAIL;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", USERNAME=" + USERNAME + ", EMAIL=" + EMAIL + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUSERNAME() {
		return USERNAME;
	}
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public String getFIRSTNAME() {
		return FIRSTNAME;
	}
	public void setFIRSTNAME(String fIRSTNAME) {
		FIRSTNAME = fIRSTNAME;
	}
	public String getLASTNAME() {
		return LASTNAME;
	}
	public void setLASTNAME(String lASTNAME) {
		LASTNAME = lASTNAME;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	 
}
