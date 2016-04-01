package main.ui;

import main.business.Card;
import main.business.Spinner;
import main.math.PayTable;
import main.ui.util.Displayable;
import main.ui.util.IOFactory;
import main.ui.util.Validatable;

/**
 * @author DM53848 on 3/31/2016.
 * Sub menu. Allows the user to place a bet, display account balance, or exit the program.
 */
public class SlotPanel {
    int menuOption = 0;
    Spinner[] spinners;
    PayTable payTable = new PayTable(3);
    Displayable output = IOFactory.getDisplayable();
    Validatable inputOutput = IOFactory.getValidatable();
    Card userCard;

    public SlotPanel(Spinner[] spinners, Card userCard) {
        this.spinners = spinners;
        this.userCard = userCard;
    }

    public void displaySlotPanel() {
        String[] choices = {"1", "2", "3"};
        String menu = "Please choose one of the following options:\n";
        String menuChoices = "1.  Place a bet\n" +
                "2.  Display Account Balance\n" +
                "3.  Remove Card and Exit Slot Machine";

        this.menuOption = Integer.parseInt(inputOutput.getChoiceArray(menu + menuChoices, choices));
    }

    public void runMenuOption() {
        BetPanel betPanel = new BetPanel(userCard);
        String spin = "";


        if (this.menuOption == 1) {
            betPanel.setUserBet();
            if (betPanel.getBet() > 0) {
                payTable.setNumberOfValues(3);
                spin = betPanel.Spin(spinners);
                output.display(spin + "\n");
                payTable.setSpinnersResult(spin);
                payTable.setPayout(betPanel.getBet());
                output.display(payTable.getPayout() + "\n");
            }
        } else if (this.menuOption == 2) {
           output.display("Account Balance: " + userCard.getAmount() + "\n");
        } else {
           this.menuOption = 3;
        }
    }

    public int getMenuOption(){
        return this.menuOption;
    }


}
