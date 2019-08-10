package com.niit.backend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.model.BatchDetail;

@Repository("batchDAO")
@Transactional
public class BatchDAOImpl implements BatchDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addBatch(BatchDetail batchDetail) {
		// TODO Auto-generated method stub
		try
		{
		sessionFactory.getCurrentSession().save(batchDetail);
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public boolean deleteBatch(BatchDetail batchDetail) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().delete(batchDetail);
			return true;
		}
		catch(Exception e)
		{
			return true;
		}
	}

	@Override
	public boolean updateBatch(BatchDetail batchDetail) {
		// TODO Auto-generated method stub
		try
		{
		sessionFactory.getCurrentSession().update(batchDetail);
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public List<BatchDetail> listBatch() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from BatchDetail").list();
	}

	@Override
	public BatchDetail getBatch(String bcode) {
		// TODO Auto-generated method stub
		return (BatchDetail)sessionFactory.getCurrentSession().createQuery("from BatchDetail where bcode="+bcode).uniqueResult();

	}

}
