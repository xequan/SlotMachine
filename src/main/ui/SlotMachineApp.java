package main.ui;

import main.business.Card;
import main.business.Spinner;
import main.ui.util.Displayable;
import main.ui.util.IOFactory;

/**
 * @author team a on 3/31/2016.
 * Simulates a slot machine.  Lets a user input their name, accout number, and total $ in their account
 * They can then place bets until their account balance is 0.
 */
public class SlotMachineApp {

    public static void main(String[] args) {
        CardReader cardReader = new CardReader();
        Spinner[] spinners = new Spinner[3];
        SlotPanel slotPanel;
        MainPanel mainMenu;
        Displayable output = IOFactory.getDisplayable();
        Card userCard = new Card();

        for (int i = 0; i < spinners.length; i ++){
            spinners[i] = new Spinner();
        }

        mainMenu = new MainPanel();


        if (mainMenu.getMenuOption() == 1) {
            cardReader.insertCard(userCard);
            slotPanel = new SlotPanel(spinners, userCard);

            do {

                slotPanel.displaySlotPanel();
                slotPanel.runMenuOption();

            } while (slotPanel.getMenuOption() != 3);
        }
        output.display("Goodbye!");

    }
}
