package main.ui;
import main.business.Card;

/**
 * Created by DM53848 on 3/31/2016.
 * @author damirzanovic
 */

public class CardReader {
	public void insertCard(Card input){
		input.setName(IOFactory.getValidatable().getRequiredString("Please enter your name: "));
		input.setAccountNumber(IOFactory.getValidatable().getInt("Please enter your Account Number: "));
		input.setAmount(IOFactory.getValidatable().getDouble("Please enter the Amount on the card: "));
	}
	
	public void removeCard(Card input){
		input.setAccountNumber(0);
		input.setAmount(0);
		input.setName("");
	}
	

	public double checkBalance(Card input){
		return input.getAmount();
	}
}
