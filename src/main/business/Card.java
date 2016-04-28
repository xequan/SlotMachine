package main.business;

import java.text.NumberFormat;

import main.ui.util.Displayable;
import main.ui.util.IOFactory;

/**
 * Created by DM53848 on 3/31/2016.
 * @author damirzanovic
 * Allows a card object to be created that allows a name, account number and 
 * an amount to be stored and gives access to add and subtract from the object. 
 */
public class Card {
	private String name="";
	private int accountNumber=0;
	private double amount=0;
	Displayable displayOutput= IOFactory.getDisplayable();
	boolean flag = true;
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
	public String getFormattedAmount(){
		String formatAmount=NumberFormat.getCurrencyInstance().format(amount);
		return formatAmount;
		
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void subtractAmount(double amount){
		if ((this.amount-amount)<0){
			displayOutput.display("Insufficient Funds, please add more money to the card to continue playing\n");
			this.flag = false;
		} else {
			this.amount-=amount;
			this.flag = true;
		}
	}
	public void addAmount(double amount){
		this.amount+=amount;
	}

	public boolean getFlag(){
		return this.flag;
	}
	
	
	
}
