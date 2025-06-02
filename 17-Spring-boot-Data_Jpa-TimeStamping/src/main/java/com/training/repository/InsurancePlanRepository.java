package com.training.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.entity.InsurancePlan;


@Repository
public interface InsurancePlanRepository extends JpaRepository<InsurancePlan, Serializable> {

}
