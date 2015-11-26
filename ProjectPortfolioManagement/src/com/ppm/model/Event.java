package com.ppm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ppm_event")
public class Event {
	@Column(name="projectId")
	private int projectId;
	
	@Id
	@Column(name="eventName")
	private String  eventName;
	
	@Column(name="eventDescription")
	private String  eventDescription;
	
	@Column(name="eventType")
	private String  eventType;
	
	public Event() {
		
	}
	public Event(int projectId, String eventName, String eventDescription,
			String eventType) {
		
		this.projectId = projectId;
		this.eventName = eventName;
		this.eventDescription = eventDescription;
		this.eventType = eventType;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventDescription() {
		return eventDescription;
	}
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	
}
