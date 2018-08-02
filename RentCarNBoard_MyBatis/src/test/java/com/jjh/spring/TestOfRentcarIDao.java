package com.jjh.spring;

import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jjh.spring.dao.RentcarIDao;
import com.jjh.spring.dto.RentCar;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class TestOfRentcarIDao {

	@Inject
	private SqlSession sqlSession;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		RentcarIDao dao = sqlSession.getMapper(RentcarIDao.class);
		ArrayList<RentCar> list = dao.selectAll();
		for (RentCar x : list) {
			System.out.println(x);
		}
	}

	@Test
	public void testSelectNo() {
		RentcarIDao dao = sqlSession.getMapper(RentcarIDao.class);
		
		RentCar dto = dao.selectNo(1);
		
		System.out.println(dto);
	}
	
	@Test
	public void testSelectCategory() {
		RentcarIDao dao = sqlSession.getMapper(RentcarIDao.class);
		
		ArrayList<RentCar> list = dao.selectCategory(2);
		
		for(RentCar x : list) {
			System.out.println(x);
		}
	}
	
	public void testInsert() {
		RentcarIDao dao = sqlSession.getMapper(RentcarIDao.class);
		
		dao.insert("RangeRover", 3, 80000, 5, "RandRover", "RangeRover.jsp", "레인지로버");
	}

	public void testDelete() {
		RentcarIDao dao = sqlSession.getMapper(RentcarIDao.class);
		
		dao.insert("RangeRove", 3, 80000, 5, "RandRover", "RangeRover.jsp", "레인지로버");
		
		dao.delete("22");
	}

	@Test
	public void testUpdate() {
		RentcarIDao dao = sqlSession.getMapper(RentcarIDao.class);
		
		dao.update("evoque", "3", "80000", "5", "RandRover", "RangeRover.jsp", "레인지로버 이보크", "21");
	}
}
