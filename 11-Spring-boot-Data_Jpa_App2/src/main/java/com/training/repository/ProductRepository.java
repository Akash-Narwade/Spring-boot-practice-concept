package com.training.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.entity.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product, Serializable> {
    
}
