package com.nissan.ib4.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tbl_user")
@NoArgsConstructor
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name="user_name",nullable=false,length=50)
	private String name;
	
	@Column(name="user_email",nullable=false,length=60)
	private String email;
	
	@Column(name="user_pass",nullable=false,length=50)
	private String password;
}
