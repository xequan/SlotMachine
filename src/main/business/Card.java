package main.business;

import main.ui.util.Displayable;
import main.ui.util.IOFactory;

/**
 * Created by DM53848 on 3/31/2016.
 * @author damirzanovic
 */
public class Card {
	private String name="";
	private int accountNumber=0;
	private double amount=0;
	Displayable displayOutput= IOFactory.getDisplayable();
	public Card() {

	}
	public Card(String name, int accountNumber, double amount) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void subtractAmount(double amount){
		if ((this.amount-amount)<0){
			displayOutput.display("Insufficient Funds, please add more money to the card to continue playing");
		} else {
			this.amount-=amount;
		}
	}
	public void addAmount(double amount){
		this.amount+=amount;
	}
	
	
	
}
