package com.ppm.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.QueryHint;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ppm.model.Event;
import com.ppm.model.Portfolio;
import com.ppm.model.Project;
import com.ppm.model.Response;
import com.ppm.services.PPMService;
import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

@Controller
public class PPMController {

	@Autowired
	PPMService ppmServiceObj;

	@RequestMapping(value = "/portfolios", method = RequestMethod.GET)
	public @ResponseBody List<String> selectAllPortfolios() {
		System.out.println("inside cntrl 2");
		return ppmServiceObj.getAllPortfoliosService();

	}

	@RequestMapping(value = "/portfolio", method = RequestMethod.POST)
	public void addPortfolio(@RequestBody Portfolio portfolioObject){
		System.out.println("inside cntrl 1");
		
		
		System.out.println("**" + portfolioObject.getPortfolioName()
				+ portfolioObject.getPortfolioOwner()
				+ portfolioObject.getPortfolioBudget());

		ppmServiceObj.addPortfolioService(portfolioObject);
/*List<String> result=new ArrayList<String>();
		
		result.add("viewProject");
		return result;
*/	}

	@RequestMapping(value = "/projects/{portfolioName}", method = RequestMethod.GET)
	public @ResponseBody List<Project> selectedProjectDetails(
			@PathVariable("portfolioName") String name) {
		System.out.println("inside cntrl selected project details");
		System.out.println(name);
		return ppmServiceObj.getAllProjectDetails(name);

	}

	@RequestMapping(value = "/project/{projectId}", method = RequestMethod.GET)
	public @ResponseBody List<Project> viewProjectDetails(
			@PathVariable("projectId") int id) {
		Thread.dumpStack();
		System.out.println("inside cntrl view one project details");
		System.out.println(id);
		return ppmServiceObj.getProject(id);
	}

	@RequestMapping(value = "/project/{projectId}", method = RequestMethod.DELETE)
	public @ResponseBody void deleteProject(@PathVariable("projectId") int id) {
		System.out.println("inside cntrl delete one project details");
		System.out.println(id);
		ppmServiceObj.deleteProject(id);

	}

	@RequestMapping(value = "/project", method = RequestMethod.POST)
	public ModelAndView addProject(@RequestBody Project projectObject) {
		System.out.println("inside spring controller");
		System.out.println(projectObject);
		ppmServiceObj.addProject(projectObject);
		System.out.println("again");
		return new ModelAndView("home.html");
	}

	@RequestMapping(value = "/project/event", method = RequestMethod.POST)
	public void addProjectEvent(@RequestBody Event eventObject) {
		System.out.println("inside event cntrl");
		System.out.println("**" + eventObject.getEventName()
				+ eventObject.getEventType()
				+ eventObject.getEventDescription());

		ppmServiceObj.addEventService(eventObject);

	}

	@RequestMapping(value = "/response", method = RequestMethod.POST)
	public ModelAndView addProjectResponse(@RequestBody Response responseObject) {
		System.out.println("inside cntrl 1");
		System.out.println("**" + responseObject.getUserName()
				+ responseObject.getMessage());

		ppmServiceObj.addResponseService(responseObject);
		return new ModelAndView("Data submitted", "home.html", "");
	}

}
