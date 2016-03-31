package main.ui;

import main.business.Spinner;
import main.math.PayTable;

/**
 * Created by DM53848 on 3/31/2016.
 */
public class SlotPanel {
    int menuOption = 0;
    Spinner[] spinners;
    PayTable payTable = new PayTable(3);

    public SlotPanel(Spinner[] spinners) {
        this.spinners = spinners;
    }

    public void displaySlotPanel() {
        String[] choices = {"1", "2", "3"};
        String menu = "Please choose one of the following options:\n";
        String menuChoices = "1.  Place a bet\n" +
                "2.  Display Account Balance\n" +
                "3.  Remove Card and Exit Slot Machine";

        this.menuOption = Integer.parseInt(IOFactory.getValidatable().getChoiceArray(menu + menuChoices, choices));
    }

    public void runMenuOption() {
        BetPanel betPanel = new BetPanel();
        String spin = "";



        if (this.menuOption == 1) {
            betPanel.setUserBet();
            payTable.setNumberOfValues(3);
            spin = betPanel.Spin(spinners);
            IOFactory.getDisplayable().display(spin + "\n");
            payTable.setSpinnersResult(spin);
            payTable.setPayout(betPanel.getBet());
            IOFactory.getDisplayable().display(payTable.getPayout() + "\n");
        } else if (this.menuOption == 2) {
            //ToDo
        } else {
           this.menuOption = 3;
        }
    }

    public int getMenuOption(){
        return this.menuOption;
    }


}
