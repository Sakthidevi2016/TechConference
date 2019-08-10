package com.niit.backend.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.dao.BatchDAO;
import com.niit.backend.model.BatchDetail;


public class BatchTest {

	static BatchDAO batchDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		batchDAO = (BatchDAO)context.getBean("batchDAO");
	}
	
	@Test
	public void addBatch()
	{
		BatchDetail batchDetail = new BatchDetail();
		batchDetail.setBcode("B200121");
		batchDetail.setCcode("PGJQP");
		batchDetail.setScode("PGJQP");
		batchDetail.setFname("sakthi");
		batchDetail.setSname("sem1");
		assertTrue("problem in adding",batchDAO.addBatch(batchDetail));
	}
	
	@Test
	public void updateBatch()
	{
		BatchDetail batch = batchDAO.getBatch("B200121");
		
		batch.setFname("sakthidevi");
		assertTrue("Problem in updating user:",batchDAO.updateBatch(batch));

	}
	
	@Test
	public void deleteBatch()
	{
		BatchDetail batch = batchDAO.getBatch("B200121");
		assertTrue("Problem in updating user:",batchDAO.deleteBatch(batch));

	}
	
	@Test
	public void listBatch()
	{
		List<BatchDetail> listbatch = batchDAO.listBatch();
		assertNotNull("Problem in listing:",listbatch);
		
		for(BatchDetail batch:listbatch)
		{
			System.out.println(batch.getBcode());
			System.out.println(batch.getCcode());
			System.out.println(batch.getScode());
			System.out.println(batch.getFname());
			System.out.println(batch.getSname());
			System.out.println(batch.getSdate());
			System.out.println(batch.getEdate());
		}
		
	}

}
