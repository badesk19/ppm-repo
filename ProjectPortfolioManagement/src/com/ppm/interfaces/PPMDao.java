package com.ppm.interfaces;

import java.util.List;

import com.ppm.model.Event;
import com.ppm.model.Portfolio;
import com.ppm.model.Project;
import com.ppm.model.Response;

public interface PPMDao {

	public void addPortfolio(Portfolio portfolio);

	public List<String> getAllPortfolios();

	public List<Project> getProjectDetails(String portfolioName);

	public List<Project> getProject(int projectId);

	public void deleteProject(int projectId);

	public void addProject(Project project);

	public void addResponse(Response response);

	public void addEvent(Event event);
}
