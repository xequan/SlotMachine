package main.ui;
import main.business.Card;

/**
 * Created by DM53848 on 3/31/2016.
 * @author damirzanovic
 */

public class CardReader {
	public void insertCard(Card input){
		input.getName();
		input.getAccountNumber();
		input.getAmount();
	}
	public void removeCard(Card input){
		input.setAccountNumber(0);
		input.setAmount(0);
		input.setName("");
	}
}
