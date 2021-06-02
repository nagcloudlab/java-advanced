package com.example;

import java.util.ArrayList;
import java.util.List;

// 
// imperative style => intention / what + implementation / how

public class Ex1 {

	static List<Account> accounts = new ArrayList<Account>();

	static {
		accounts.add(new Account("1", 100.00));
		accounts.add(new Account("2", 200.00));
		accounts.add(new Account("3", 300.00));
		accounts.add(new Account("4", 400.00));
		accounts.add(new Account("5", 500.00));
	}

	public static void main(String[] args) {
		List<Account> accounts = getAccountsByBalanceGT200();
		System.out.println(accounts);
	}

	// --------------------------------------------
	// find account with num=3
	// --------------------------------------------
	private static Account getAccountByNumber(String accNumber) {
		Account account = null;
		for (Account acc : accounts) {
			if (acc.getNumber().equals(accNumber)) {
				account = acc;
			}
		}
		return account;
	}

	// --------------------------------------------
	// find account with balance=100.00
	// --------------------------------------------
	private static List<Account> getAccountsByBalance(double balance) {
		List<Account> out = new ArrayList<Account>();
		for (Account acc : accounts) {
			if (acc.getBalance() == balance) {
				out.add(acc);
			}
		}
		return out;
	}

	// --------------------------------------------
	// find account with balance>200.00
	// --------------------------------------------
	private static List<Account> getAccountsByBalanceGT200() {
		List<Account> out = new ArrayList<Account>();
		for (Account acc : accounts) {
			if (acc.getBalance() > 200.00) {
				out.add(acc);
			}
		}
		return out;
	}

}
