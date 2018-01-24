package com.jwt.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	
	@Column
	private String title;
	
	@Column
	private String description;
	
	@Column
	private Calendar exceutionDate;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Calendar getExceutionDate() {
		return exceutionDate;
	}

	public void setExceutionDate(Calendar exceutionDate) {
		this.exceutionDate = exceutionDate;
	}
	
	
	
	
}
