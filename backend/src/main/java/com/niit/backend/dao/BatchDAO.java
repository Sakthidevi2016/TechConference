package com.niit.backend.dao;

import java.util.List;

import com.niit.backend.model.BatchDetail;


public interface BatchDAO {

	public boolean addBatch(BatchDetail batchDetail);
	public boolean deleteBatch(BatchDetail batchDetail);
	public boolean updateBatch(BatchDetail batchDetail);
	public List<BatchDetail> listBatch();
	public BatchDetail getBatch(String bcode);
}
