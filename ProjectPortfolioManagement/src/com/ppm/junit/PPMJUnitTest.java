package com.ppm.junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.ppm.dao.PPMDaoImpl;
import com.ppm.model.Portfolio;

public class PPMJUnitTest {

	PPMDaoImpl daoObject = new PPMDaoImpl();
	Portfolio p = new Portfolio("asdfgh", 190.1, "me");

	@Test
	public void testAddPortfolio() {
		System.out.println("inside add portfolio");

	}

	@Test
	public void testGetAllPortfolios() {
		System.out.println("inside get all portfolio");
	
	}

	@Test
	public void testAddProject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetProjectDetails() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetProject() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteProject() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddResponse() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddEvent() {
		fail("Not yet implemented");
	}

}
