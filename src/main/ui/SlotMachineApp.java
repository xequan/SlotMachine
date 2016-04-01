package main.ui;

import main.business.Card;
import main.business.Spinner;
import main.ui.util.Displayable;
import main.ui.util.IOFactory;

/**
 * Created by DM53848 on 3/15/2016.
 */
public class SlotMachineApp {

    public static void main(String[] args) {
        CardReader cardReader = new CardReader();
        BetPanel betPanel = new BetPanel();
        Spinner[] spinners = new Spinner[3];
        SlotPanel slotPanel = new SlotPanel(spinners);
        MainPanel mainMenu;

        Card userCard = new Card();


        for (int i = 0; i < spinners.length; i ++){
            spinners[i] = new Spinner();
        }

        mainMenu = new MainPanel();
        cardReader.insertCard(userCard);

    //    cardPanel.displayCardSlot();
    //    userCard = cardPanel.getUserCard();


        do {
            if (userCard != null){
                slotPanel.displaySlotPanel();
                slotPanel.runMenuOption();
            } ;
        } while (slotPanel.getMenuOption() != 3);


    }
}
