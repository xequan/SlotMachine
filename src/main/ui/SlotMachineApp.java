package main.ui;

import main.business.Card;
import main.business.Spinner;

/**
 * Created by DM53848 on 3/15/2016.
 */
public class SlotMachineApp {

    public static void main(String[] args) {
        CardPanel cardPanel = new CardPanel();
        BetPanel betPanel = new BetPanel();
        Spinner[] spinners = new Spinner[3];
        SlotPanel slotPanel = new SlotPanel(spinners);
        for (int i = 0; i < spinners.length; i ++){
            spinners[i] = new Spinner();
        }
        Card userCard;

        IOFactory.getDisplayable().display("Welcome to the Java Slot Machine!\n\n");


        cardPanel.displayCardSlot();
        userCard = cardPanel.getUserCard();


        do {
            if (userCard != null){
                slotPanel.displaySlotPanel();
                slotPanel.runMenuOption();
            } ;
        } while (slotPanel.getMenuOption() != 3);


    }
}
