package main.ui;

import main.ui.util.Displayable;
import main.ui.util.IOFactory;
import main.ui.util.Validatable;

/**
 * Created by DM53848 on 3/31/2016.
 */
public class MainPanel {
    Validatable inputOutput = IOFactory.getValidatable();
    int menuOption = 0;

    public MainPanel() {
        String menu = "Welcome to the Java Slot Machine!\n\n" +
                      "Please insert your card to play:\n" +
                      "1.  Insert Card\n" +
                      "2.  Exit slot machine\n";

        this.menuOption = inputOutput.getInt(menu);
    }

    public int getMenuOption(){
        return this.menuOption;
    }
}
