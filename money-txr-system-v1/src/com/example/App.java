package com.example;

import com.example.repository.AccountRepository;
import com.example.repository.JdbcAccountRepository;
import com.example.repository.JpaAccountRepository;
import com.example.service.NEFTTransferService;
import com.example.service.TransferService;

public class App {

	public static void main(String[] args) {
		
//		--------------------------------------------------------------Ï
		// container
//		--------------------------------------------------------------

		// init / boot

		AccountRepository jdbcAccountRepository=new JdbcAccountRepository();
		AccountRepository jpaAccountRepository=new JpaAccountRepository();
		
		TransferService transferService = new NEFTTransferService(jpaAccountRepository);

		System.out.println();
		// use

		transferService.txr(300.00, "1", "2");
		System.out.println();
		transferService.txr(300.00, "2", "1");

		// destroy
		// ...

	}

}
