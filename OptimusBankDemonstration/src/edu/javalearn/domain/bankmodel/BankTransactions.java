package edu.javalearn.domain.bankmodel;

import java.util.Date;

public class BankTransactions {

	private double amount;
	private char typeOftransaction;
	private Date dateOfTransaction;
	
	
	public void deposit(Double amount,String description)

	{
		this.amount=this.amount+amount;
	}

	public Double withdraw(Double amount)
	{
		this.amount=this.amount-amount;
	}
	
	public Double balanceenquiry()
	{
		return ;
	}
	
	
	
}
