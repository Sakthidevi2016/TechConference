package com.niit.backend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.model.BMSDetail;

@Repository("bmsDAO")
@Transactional
public class BMSDAOImpl implements BMSDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addBMS(BMSDetail bmsDetail) {
		// TODO Auto-generated method stub
		try
		{
		sessionFactory.getCurrentSession().save(bmsDetail);
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public boolean deleteBMS(BMSDetail bmsDetail) {
		// TODO Auto-generated method stub
		try
		{
		sessionFactory.getCurrentSession().delete(bmsDetail);
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public boolean updateBMS(BMSDetail bmsDetail) {
		// TODO Auto-generated method stub
		try
		{
		sessionFactory.getCurrentSession().update(bmsDetail);
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public List<BMSDetail> listBMS() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from BMSDetail").list();
	}

	@Override
	public BMSDetail getBMS(String bcode) {
		// TODO Auto-generated method stub
		return (BMSDetail)sessionFactory.getCurrentSession().createQuery("from BMSDetail where bcode="+bcode).uniqueResult();
	}

}
