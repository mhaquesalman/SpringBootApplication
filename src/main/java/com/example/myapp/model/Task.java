package com.example.myapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class Task {
	
	@Id
	@GeneratedValue
	private Long id;
	@NotEmpty
	private String date;
	@NotEmpty
	private String startDate;
	@NotEmpty
	private String stopDate;
	@NotEmpty
	private String description;
	@ManyToOne
	@JoinColumn(name="USER_EMAIL")
	private User user;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStopDate() {
		return stopDate;
	}
	public void setStopDate(String stopDate) {
		this.stopDate = stopDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Task(String date, String startDate, String stopDate, String description, User user) {
		this.date = date;
		this.startDate = startDate;
		this.stopDate = stopDate;
		this.description = description;
		this.user = user;
	}
	public Task(String date, String startDate, String stopDate, String description) {	
		this.date = date;
		this.startDate = startDate;
		this.stopDate = stopDate;
		this.description = description;
	}
	public Task() {
		
	}
	
	
	

}
