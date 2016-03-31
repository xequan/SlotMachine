package main.ui;

import main.business.Card;

/**
 * Created by DM53848 on 3/31/2016.
 */
public class CardPanel {
    int menuChoice = 0;
    Card userCard;

    public void displayCardSlot() {
        String menu = "Please insert your card to play:\n";
        String menuChoices = "1.  Insert Card\n" +
                "2.  Exit slot machine\n";
        int choice = 0;

        choice = Integer.parseInt(IOFactory.getValidatable().getChoiceString(menu + menuChoices, "1", "2"));
        this.menuChoice = choice;
        if (this.menuChoice == 1) {
            getCardInfo();
        }
    }

    public void getCardInfo(){
        String name;
        int accountNumber;
        double amount;

        name = IOFactory.getValidatable().getRequiredString("Name on Card:");
        accountNumber = IOFactory.getValidatable().getIntWithinRange("Acount Number", 0, 10000);
        amount = IOFactory.getValidatable().getDoubleWithinRange("Amount on Card:", 0, 10000);

        this.userCard = new Card(name, accountNumber, amount);
    }

    public Card getUserCard(){
        return userCard;
    }
}
