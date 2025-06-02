package com.training.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="COURSES")
public class Courses {
	
	@Id
	@Column(name="COURSE_ID")
	private Integer CourseId;
	
	@Column(name="COURSE_NAME")
	private String CourseName;

	public Integer getCourseId() {
		return CourseId;
	}

	public void setCourseId(Integer courseId) {
		CourseId = courseId;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	} 

}
