package mainPackage;

import java.util.*;


public class Account {
	private int id;
	private double balance;
	private final double annualInterestRate = .045;
	private Date dateCreated;

	public Account() {
		this.id = 0;
		this.balance = 0;
		this.dateCreated = new Date();
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestrate() {
		return (annualInterestRate/12);
	}

	public void withdraw(int amount) throws InsufficientFundsException {
		if (amount <= balance){
			balance-=amount;
		}else{
			double missing=amount - balance;
			throw new InsufficientFundsException(missing);
		}
	}
	public void deposit(double amount){
		balance +=amount;
	}
}
