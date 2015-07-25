package edu.javalearn.domain.bankmodel;

import java.util.List;

public class Account {
	
	
	private int id;
	private String accountNo;
	private double balance;
	private TypeOfAccount typeOfAccount;
	/**private List<BankTransactions> bankTransactions;
	public List<BankTransactions> getBankTransactions() {
		return bankTransactions;
	}
	public void setBankTransactions(List<BankTransactions> bankTransactions) {
		this.bankTransactions = bankTransactions;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public TypeOfAccount getTypeOfAccount() {
		return typeOfAccount;
	}
	public void setTypeOfAccount(TypeOfAccount typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}
	
}
