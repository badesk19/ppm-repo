package com.ppm.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.web.bind.annotation.ResponseBody;

import com.ppm.interfaces.PPMDao;
import com.ppm.model.Event;
import com.ppm.model.Portfolio;
import com.ppm.model.Project;
import com.ppm.model.Response;

public class PPMDaoImpl implements PPMDao {

	private static final String PERSISTENCE_UNIT_NAME = "ppmJPA";
	private static EntityManagerFactory factory;
	private EntityManager entityManager;

	@Override
	public void addPortfolio(Portfolio portfolio) {
		System.out.println("Inside dao implementation");
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(portfolio);
		entityManager.getTransaction().commit();
		System.out.println("data added");
	}

	@Override
	public List<String> getAllPortfolios() {
		// TODO Auto-generated method stub
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		Query q = entityManager
				.createQuery("select p.portfolioName from Portfolio p");

		List<String> portfolioList = q.getResultList();

		Iterator<String> itr = portfolioList.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

		return portfolioList;
	}

	@Override
	public void addProject(Project project) {
		System.out.println("inside dao impl");
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(project);
		entityManager.getTransaction().commit();

	}

	@Override
	public List<Project> getProjectDetails(String portfolioName) {
		System.out.println("inside getPorject details");

		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		Query q = entityManager
				.createQuery("select p from Project p where p.portfolioName='"
						+ portfolioName + "'");

		List<Project> porjectList = q.getResultList();

		Iterator<Project> itr = porjectList.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

		return porjectList;
	}

	@Override
	public List<Project> getProject(int projectId) {
		// TODO Auto-generated method stub
		System.out.println("inside one getPorject  details");

		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		Query q = entityManager
				.createQuery("select p from Project p where p.projectId="
						+ projectId);

		List<Project> projectList = q.getResultList();

		Iterator<Project> itr = projectList.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

		return projectList;
	}

	@Override
	public void deleteProject(int projectId) {
		System.out.println("inside delete project");

		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		entityManager = factory.createEntityManager();
		Project objProject = entityManager.find(Project.class, projectId);

		entityManager.getTransaction().begin();
		entityManager.remove(objProject);
		entityManager.getTransaction().commit();

	}

	@Override
	public void addResponse(Response response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addEvent(Event event) {
		// TODO Auto-generated method stub
		System.out.println("Inside dao implementation");
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(event);
		entityManager.getTransaction().commit();
		System.out.println("event data added");

	}

}
