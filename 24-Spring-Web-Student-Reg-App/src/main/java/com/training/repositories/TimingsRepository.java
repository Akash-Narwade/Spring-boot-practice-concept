package com.training.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.entity.Courses;
import com.training.entity.Timings;

public interface TimingsRepository extends JpaRepository<Timings, Serializable> {

}
