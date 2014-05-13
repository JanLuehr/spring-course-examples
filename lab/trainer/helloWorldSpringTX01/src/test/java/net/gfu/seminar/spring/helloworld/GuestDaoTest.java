package net.gfu.seminar.spring.helloworld;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/applicationContext.xml","classpath:/persistenceLayer.xml", "classpath:/testData.xml"})
@Transactional
@TransactionConfiguration(defaultRollback=true)
public class GuestDaoTest {

	private static final Logger LOG = Logger.getLogger(GuestDaoTest.class);

	@Autowired
	private GuestDao dao;
	
	@Autowired
	@Qualifier("guest")
	private Guest testDataGuest;

	@Test
	public void testCreate() {
		int id = dao.create(testDataGuest);
		assertTrue(id>0);
	}

	@Test
	public void testFindById() {
		Long id = Long.valueOf(1);
		assertNotNull(dao.findById(id));
	}

	@Test
	public void testFindByName() {
		String name = "Dampf";
		List<Guest> actual = dao.findByName(name);
		assertFalse(actual.isEmpty());
		assertThat(actual.toString(), containsString("Dampf"));
	}

	@Test
	public void testFindAll() {
		List<Guest> actual = dao.findAll();
		assertThat(actual.toString(), allOf(containsString("Hans"), containsString("Dampf")));
	}

	@Test
	public void testUpdate() {
		dao.update(testDataGuest);
	}

	@Test
	@Transactional(isolation=Isolation.SERIALIZABLE, propagation=Propagation.REQUIRED)
	@Rollback(true)
	public void testRemove() {
		dao.remove(testDataGuest);
	}

	@BeforeTransaction public void beforeTransaction() {
		LOG.info("Transaction begins ...");
	}
	
	@AfterTransaction public void afterTransaction() {
		LOG.info("Transaction ends ...");
	}
}
