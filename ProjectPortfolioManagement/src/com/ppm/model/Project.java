package com.ppm.model;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ppm_project")
public class Project {
	@Id
	@Column(name="projectId")
	private int projectId;
	
	@Column(name="projectName")
	private String projectName;
	
	@Column(name="projectType")
	private String projectType;
	
	@Column(name="projectStartDate")
	private Date projectStartDate;
	
	@Column(name="projectEndDate")
	private Date projectEndDate;
	
	@Column(name="projectVisibleDuration")
	private Double projectVisibleDuration;
	
	@Column(name="projectStatus")
	private String projectStatus;
	
	@Column(name="projectMethodology")
	private String projectMethodology;
	
	@Column(name="projectDescription")
	private String projectDescription;
	
	@Column(name="projectTools")
	private String projectTools;
	
	@Column(name="projectManager")
	private String projectManager;
	
	@Column(name="projectManagerType")
	private String projectManagerType;
	
	@Column(name="projectDeputyManager")
	private String projectDeputyManager;
	
	@Column(name="projectAssistantManager")
	private String projectAssistantManager;
	
	@Column(name="projectClient")
	private String projectClient;
	
	@Column(name="projectClientPoc")
	private String projectClientPoc;
	
	@Column(name="projectClientPurpose")
	private String projectClientPurpose;
	
	@Column(name="projectEstimateEfforts")
	private Double projectEstimateEfforts;
	
	@Column(name="projectConsultantName")
	private String projectConsultantName;
	
	@Column(name="projectRole")
	private String projectRole;
	
	@Column(name="projectDuration")
	private Double projectDuration;
	
	@Column(name="projectBudget")
	private Double projectBudget;
	
	@Column(name="portfolioName")
	private String portfolioName;
	
	
	public Project() {
		super();
	}


	public Project(int projectId, String projectName, String projectType,
			Date projectStartDate, Date projectEndDate,
			Double projectVisibleDuration, String projectStatus,
			String projectMethodology, String projectDescription,
			String projectTools, String projectManager,
			String projectManagerType, String projectDeputyManager,
			String projectAssistantManager, String projectClient,
			String projectClientPoc, String projectClientPurpose,
			Double projectEstimateEfforts, String projectConsultantName,
			String projectRole, Double projectDuration, Double projectBudget,
			String portfolioName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectType = projectType;
		this.projectStartDate = projectStartDate;
		this.projectEndDate = projectEndDate;
		this.projectVisibleDuration = projectVisibleDuration;
		this.projectStatus = projectStatus;
		this.projectMethodology = projectMethodology;
		this.projectDescription = projectDescription;
		this.projectTools = projectTools;
		this.projectManager = projectManager;
		this.projectManagerType = projectManagerType;
		this.projectDeputyManager = projectDeputyManager;
		this.projectAssistantManager = projectAssistantManager;
		this.projectClient = projectClient;
		this.projectClientPoc = projectClientPoc;
		this.projectClientPurpose = projectClientPurpose;
		this.projectEstimateEfforts = projectEstimateEfforts;
		this.projectConsultantName = projectConsultantName;
		this.projectRole = projectRole;
		this.projectDuration = projectDuration;
		this.projectBudget = projectBudget;
		this.portfolioName = portfolioName;
	}


	public int getProjectId() {
		return projectId;
	}


	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public String getProjectType() {
		return projectType;
	}


	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}


	public Date getProjectStartDate() {
		return projectStartDate;
	}


	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName="
				+ projectName + ", projectType=" + projectType
				+ ", projectStartDate=" + projectStartDate
				+ ", projectEndDate=" + projectEndDate
				+ ", projectVisibleDuration=" + projectVisibleDuration
				+ ", projectStatus=" + projectStatus + ", projectMethodology="
				+ projectMethodology + ", projectDescription="
				+ projectDescription + ", projectTools=" + projectTools
				+ ", projectManager=" + projectManager
				+ ", projectManagerType=" + projectManagerType
				+ ", projectDeputyManager=" + projectDeputyManager
				+ ", projectAssistantManager=" + projectAssistantManager
				+ ", projectClient=" + projectClient + ", projectClientPoc="
				+ projectClientPoc + ", projectClientPurpose="
				+ projectClientPurpose + ", projectEstimateEfforts="
				+ projectEstimateEfforts + ", projectConsultantName="
				+ projectConsultantName + ", projectRole=" + projectRole
				+ ", projectDuration=" + projectDuration + ", projectBudget="
				+ projectBudget + ", portfolioName=" + portfolioName + "]";
	}


	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}


	public Date getProjectEndDate() {
		return projectEndDate;
	}


	public void setProjectEndDate(Date projectEndDate) {
		this.projectEndDate = projectEndDate;
	}


	public Double getProjectVisibleDuration() {
		return projectVisibleDuration;
	}


	public void setProjectVisibleDuration(Double projectVisibleDuration) {
		this.projectVisibleDuration = projectVisibleDuration;
	}


	public String getProjectStatus() {
		return projectStatus;
	}


	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}


	public String getProjectMethodology() {
		return projectMethodology;
	}


	public void setProjectMethodology(String projectMethodology) {
		this.projectMethodology = projectMethodology;
	}


	public String getProjectDescription() {
		return projectDescription;
	}


	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}


	public String getProjectTools() {
		return projectTools;
	}


	public void setProjectTools(String projectTools) {
		this.projectTools = projectTools;
	}


	public String getProjectManager() {
		return projectManager;
	}


	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}


	public String getProjectManagerType() {
		return projectManagerType;
	}


	public void setProjectManagerType(String projectManagerType) {
		this.projectManagerType = projectManagerType;
	}


	public String getProjectDeputyManager() {
		return projectDeputyManager;
	}


	public void setProjectDeputyManager(String projectDeputyManager) {
		this.projectDeputyManager = projectDeputyManager;
	}


	public String getProjectAssistantManager() {
		return projectAssistantManager;
	}


	public void setProjectAssistantManager(String projectAssistantManager) {
		this.projectAssistantManager = projectAssistantManager;
	}


	public String getProjectClient() {
		return projectClient;
	}


	public void setProjectClient(String projectClient) {
		this.projectClient = projectClient;
	}


	public String getProjectClientPoc() {
		return projectClientPoc;
	}


	public void setProjectClientPoc(String projectClientPoc) {
		this.projectClientPoc = projectClientPoc;
	}


	public String getProjectClientPurpose() {
		return projectClientPurpose;
	}


	public void setProjectClientPurpose(String projectClientPurpose) {
		this.projectClientPurpose = projectClientPurpose;
	}


	public Double getProjectEstimateEfforts() {
		return projectEstimateEfforts;
	}


	public void setProjectEstimateEfforts(Double projectEstimateEfforts) {
		this.projectEstimateEfforts = projectEstimateEfforts;
	}


	public String getProjectConsultantName() {
		return projectConsultantName;
	}


	public void setProjectConsultantName(String projectConsultantName) {
		this.projectConsultantName = projectConsultantName;
	}


	public String getProjectRole() {
		return projectRole;
	}


	public void setProjectRole(String projectRole) {
		this.projectRole = projectRole;
	}


	public Double getProjectDuration() {
		return projectDuration;
	}


	public void setProjectDuration(Double projectDuration) {
		this.projectDuration = projectDuration;
	}


	public Double getProjectBudget() {
		return projectBudget;
	}


	public void setProjectBudget(Double projectBudget) {
		this.projectBudget = projectBudget;
	}


	public String getPortfolioName() {
		return portfolioName;
	}


	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}
	
	
	
}