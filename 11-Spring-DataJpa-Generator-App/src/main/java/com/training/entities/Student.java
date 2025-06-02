package com.training.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="STUDENTS_DTLS")
@Data
public class Student {
   
	
	@Id
	@SequenceGenerator(name="student",sequenceName = "student_id_seq" ,allocationSize = 1)
	@GeneratedValue(generator ="student" ,strategy=GenerationType.SEQUENCE)
	@Column(name="STUDENT_ID")
	private Integer studentId;
	
	@Column(name="STUDENT_AGE")
	private Integer studentAge;
	
	@Column(name="STUDENT_EMAIL")
	private String studentEmail;
	
	@Column(name="STUDENT_NAME")
	private String studentName;
	
	
}
