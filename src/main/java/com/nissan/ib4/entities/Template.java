package com.nissan.ib4.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tbl_template")
@NoArgsConstructor
@Getter
@Setter
public class Template {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer tempId;
	private String fileName;
    private String filePath;
	public Template(Integer tempId, String fileName, String filePath) {
		super();
		this.tempId = tempId;
		this.fileName = fileName;
		this.filePath = filePath;
	}
	public Template(String fileName, String filePath) {
		super();
		this.fileName = fileName;
		this.filePath = filePath;
	}
    
	

}
