package com.ppm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppm.dao.PPMDaoImpl;
import com.ppm.interfaces.PPMServiceInterface;
import com.ppm.model.Event;
import com.ppm.model.Portfolio;
import com.ppm.model.Project;
import com.ppm.model.Response;

@Service
public class PPMService implements PPMServiceInterface {
	@Autowired
	PPMDaoImpl ppmDaoObj;

	public void addPortfolioService(Portfolio portfolio) {
		ppmDaoObj.addPortfolio(portfolio);

	}

	public List<String> getAllPortfoliosService() {

		return ppmDaoObj.getAllPortfolios();

	}

	public List<Project> getAllProjectDetails(String portfolioName) {

		return ppmDaoObj.getProjectDetails(portfolioName);

	}

	public List<Project> getProject(int projectId) {

		return ppmDaoObj.getProject(projectId);

	}

	public void addProject(Project project) {
		System.out.println("inside service");
		ppmDaoObj.addProject(project);
	}

	public void deleteProject(int projectId) {
		ppmDaoObj.deleteProject(projectId);
	}

	public void addEventService(Event event) {
		ppmDaoObj.addEvent(event);

	}

	public void addResponseService(Response response) {
		ppmDaoObj.addResponse(response);

	}

}
