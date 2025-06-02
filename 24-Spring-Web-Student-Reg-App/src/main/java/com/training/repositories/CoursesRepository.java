package com.training.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.entity.Courses;

public interface CoursesRepository extends JpaRepository<Courses, Serializable> {

}
