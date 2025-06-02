package com.training.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.entity.Address;

@Repository
public interface AddresRepository extends JpaRepository<Address,Serializable> {

}
