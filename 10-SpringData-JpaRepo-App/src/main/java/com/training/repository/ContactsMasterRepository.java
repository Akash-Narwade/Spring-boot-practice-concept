package com.training.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.entities.ContactsMasterEntity;

public interface ContactsMasterRepository extends JpaRepository<ContactsMasterEntity, Serializable>{
   
}
