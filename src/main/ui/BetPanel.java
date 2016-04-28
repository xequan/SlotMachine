package main.ui;

import main.business.BetType;
import main.business.Card;
import main.business.Spinner;
import main.ui.util.IOFactory;

/**
 * Created by DM53848 on 3/31/2016.
 */
public class BetPanel {
	
    private double betSelection;
    private Card userCard;

    public BetPanel(Card userCard) {
        this.userCard = userCard;
    }

    public void setUserBet(){
        String[] betChoiceType = {"n", "d", "q", "e"};
        String choice = "";
        boolean flag = true;
        choice = IOFactory.getValidatable().getChoiceArray("Enter your bet: nickle(n), dime(d), quarter(q) or exit(e) \n", betChoiceType);
        if (choice.equalsIgnoreCase(("n"))){
            this.betSelection = 5;
            userCard.subtractAmount(this.betSelection / 100);
            flag = userCard.getFlag();
        } else if (choice.equalsIgnoreCase("d")) {
            this.betSelection = 10;
            userCard.subtractAmount(this.betSelection / 100);
            flag = userCard.getFlag();
        } else if (choice.equalsIgnoreCase("q")) {
            this.betSelection = 25;
            userCard.subtractAmount(this.betSelection / 100);
            flag = userCard.getFlag();
        } else {
            this.betSelection = 0;
        }

        if (flag == false){
            this.betSelection = 0;
        }
    }



    public String Spin(Spinner[] spinners){
        String spins = "";

        for (int i = 0; i < spinners.length; i++) {
            spinners[i].spin();
            spins += spinners[i].getShowingFace() + " ";
        }

        return spins;
    }

    public double getBet(){
        return this.betSelection;
    }
    
    public BetType addEnumerator(String inputLetter){
		if (inputLetter.equalsIgnoreCase("n"))
			return BetType.NICKLE;
		else if (inputLetter.equalsIgnoreCase("d"))	
			return BetType.DIME;
		else if (inputLetter.equalsIgnoreCase("q"))	
			return BetType.QUARTER;
		else 
			return null;
    }

}