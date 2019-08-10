package com.niit.backend.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class BMSDetail {
	
	@Id
	String BMSEntryCode;
	String bcode,obs,status,action,resper;
	Date BMSEntrydate,ddate;
	
	public String getBMSEntryCode() {
		return BMSEntryCode;
	}
	public void setBMSEntryCode(String bMSEntryCode) {
		BMSEntryCode = bMSEntryCode;
	}
	public String getBcode() {
		return bcode;
	}
	public void setBcode(String bcode) {
		this.bcode = bcode;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getResper() {
		return resper;
	}
	public void setResper(String resper) {
		this.resper = resper;
	}
	public Date getBMSEntrydate() {
		return BMSEntrydate;
	}
	public void setBMSEntrydate(Date bMSEntrydate) {
		BMSEntrydate = bMSEntrydate;
	}
	public Date getDdate() {
		return ddate;
	}
	public void setDdate(Date ddate) {
		this.ddate = ddate;
	}

}
