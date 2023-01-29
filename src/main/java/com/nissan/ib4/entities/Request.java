package com.nissan.ib4.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tbl_Request")
@NoArgsConstructor

public class Request {
	public Integer getRequestId() {
		return requestId;
	}


	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}


	public Integer getTempId() {
		return tempId;
	}


	public void setTempId(Integer tempId) {
		this.tempId = tempId;
	}


	public Template getTemplate() {
		return template;
	}


	public void setTemplate(Template template2) {
		this.template = template2;
	}


	public DateTime getCreateAt() {
		return createAt;
	}


	public void setCreateAt(DateTime createAt) {
		this.createAt = createAt;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer requestId;
	
	private Integer tempId;// FK
	// Object-Oriented class Model
	@JoinColumn(name = "tempId", insertable = false, updatable = false)
	@ManyToOne
	private Template template;

	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime createAt;	private String status;


	public Request(Integer requestId, Integer tempId, Template template, DateTime createAt, String status) {
		super();
		this.requestId = requestId;
		this.tempId = tempId;
		this.template = template;
		this.createAt = createAt;
		this.status = status;
	}


	


	
	


	

}
