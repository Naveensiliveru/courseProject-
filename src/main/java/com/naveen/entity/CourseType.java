package com.naveen.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name ="Course-Type")
public class CourseType {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long  Id; 
	  private String  course;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	  
	  

}
