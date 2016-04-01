package main.ui;

import main.business.Card;
import main.business.Spinner;
import main.ui.util.IOFactory;

/**
 * Created by DM53848 on 3/31/2016.
 */
public class BetPanel {
	
    private int betSelection;
    private Card userCard;

    public BetPanel(Card userCard) {
        this.userCard = userCard;
    }

    public void setUserBet(){
        String[] betChoiceType = {"n", "d", "q", "e"};
        String choice = "";
        choice = IOFactory.getValidatable().getChoiceArray("Enter your bet: nickle(n), dime(d), quarter(q) or exit(e) \n", betChoiceType);
        if (choice.equalsIgnoreCase(("n"))){
            this.betSelection = 5;
        } else if (choice.equalsIgnoreCase("d")) {
            this.betSelection = 10;
        } else if (choice.equalsIgnoreCase("q")) {
            this.betSelection = 25;
        } else {
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

    public int getBet(){
        return this.betSelection;
    }

}