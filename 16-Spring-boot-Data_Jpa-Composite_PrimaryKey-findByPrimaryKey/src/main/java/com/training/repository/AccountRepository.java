package com.training.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.entity.Account;
import com.training.entity.AccountPK;

@Repository
public interface AccountRepository extends JpaRepository<Account, AccountPK>{ 

}
