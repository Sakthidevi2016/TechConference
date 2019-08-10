package com.niit.backend.dao;

import java.util.List;

import com.niit.backend.model.BMSDetail;

public interface BMSDAO {
	
	public boolean addBMS(BMSDetail bmsDetail);
	public boolean deleteBMS(BMSDetail bmsDetail);
	public boolean updateBMS(BMSDetail bmsDetail);
	public List<BMSDetail> listBMS();
	public BMSDetail getBMS(String bcode);


}
