package com.training.library.action;

import com.opensymphony.xwork2.ActionSupport;
import com.training.library.exception.InsufficientBalanceException;
import com.training.library.service.BankService;

public class WithdrawAction extends ActionSupport {

    private double amount;
    private double balance;

    public String execute() throws InsufficientBalanceException  {

        BankService service = new BankService();
       
			balance = service.withdraw(amount);
		
        return SUCCESS;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public double getBalance() {
        return balance;
    }
}