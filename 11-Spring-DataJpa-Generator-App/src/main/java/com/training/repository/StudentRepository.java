package com.training.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.entities.Student;

public interface  StudentRepository extends JpaRepository<Student, Serializable>{

}
