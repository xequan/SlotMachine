package main.ui;

import main.business.Spinner;
import main.ui.util.IOFactory;

/**
 * Created by DM53848 on 3/31/2016.
 */
public class BetPanel {
	
    private int betSelection;

    public void setUserBet(){
        String[] betChoiceType = {"n", "d", "q"};
        String choice = "";
        choice = IOFactory.getValidatable().getChoiceArray("Enter your bet: nickle(n), dime(d) or quarter(q) \n", betChoiceType);
        if (choice.equalsIgnoreCase(("n"))){
            this.betSelection = 5;
        } else if (choice.equalsIgnoreCase("d")) {
            this.betSelection = 10;
        } else {
            this.betSelection = 25;
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