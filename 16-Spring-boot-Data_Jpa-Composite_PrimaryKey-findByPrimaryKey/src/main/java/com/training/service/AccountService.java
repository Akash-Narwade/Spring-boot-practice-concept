package com.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.entity.Account;
import com.training.entity.AccountPK;
import com.training.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accRepo;
	
	public void saveAccData() {
		
		AccountPK accountPK= new AccountPK();
		accountPK.setAccId(102);
		accountPK.setAccType("Current");
		accountPK.setHolderName("HCL");
		
		Account account = new Account();
		account.setBranchName("Akash");
		account.setMinBal(10100.00);
		//Set primary key Object to Entity class Object
		account.setAccountPKID(accountPK);
		
		accRepo.save(account);
	}
}
