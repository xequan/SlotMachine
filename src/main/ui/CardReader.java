package main.ui;
import main.business.Card;
import main.ui.util.Displayable;
import main.ui.util.IOFactory;
import main.ui.util.Validatable;

/**
 * Created by DM53848 on 3/31/2016.
 * @author damirzanovic
 */

public class CardReader {
	Validatable inputOutput = IOFactory.getValidatable();

	public void insertCard(Card input){
		input.setName(inputOutput.getRequiredString("Please enter your name: "));
		input.setAccountNumber(inputOutput.getIntWithinRange("Please enter your Account Number: ", 1, 100));
		input.setAmount(inputOutput.getDoubleWithinRange("Please enter the Amount on the card: ", 1, 100));
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
