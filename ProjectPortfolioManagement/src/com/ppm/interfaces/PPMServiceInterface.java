package com.ppm.interfaces;

import java.util.List;

import com.ppm.model.Event;
import com.ppm.model.Portfolio;
import com.ppm.model.Project;
import com.ppm.model.Response;

public interface PPMServiceInterface {
	public void addPortfolioService(Portfolio portfolio);

	public List<String> getAllPortfoliosService();

	public List<Project> getAllProjectDetails(String portfolioName);

	public List<Project> getProject(int projectId);

	public void addProject(Project project);

	public void deleteProject(int projectId);

	public void addEventService(Event event);

	public void addResponseService(Response response);
}
