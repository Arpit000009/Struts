package com.training.library.service;

import com.training.library.exception.InsufficientBalanceException;

public class BankService {
	private double balance = 1000;

    public double withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        balance = balance - amount;

        return balance;
    }
	
}
