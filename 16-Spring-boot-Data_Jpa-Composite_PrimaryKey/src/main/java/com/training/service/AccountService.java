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
		Account account = new Account();
		account.setBranchName("Ameerpet");
		account.setMinBal(1000.00);
		account.setAccId(100);
		account.setAccType("CURRENT");
		account.setHolderName("IBM");
		accRepo.save(account);
	}
}
