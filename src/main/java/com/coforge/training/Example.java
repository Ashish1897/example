package com.coforge.training;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="example")
public class Example {


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private Long id;

		@Column(unique = true)
		private String email;

		@Column(name = "first_name")
		private String fname;

		@Column(name = "last_name")
		private String lname;

		@Column(name = "password")
		private String password;
		
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		@Column(name = "dob")
		private Date dob;

		@Column(name = "phone")
		private String phoneNo;
	}

