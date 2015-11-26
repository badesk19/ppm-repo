package com.ppm.model;

public class Response {

	private int projectId;
	private String userName;
	private String message;
	public Response() {
		
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Response(int projectId, String userName, String message) {
		super();
		this.projectId = projectId;
		this.userName = userName;
		this.message = message;
	}
}
