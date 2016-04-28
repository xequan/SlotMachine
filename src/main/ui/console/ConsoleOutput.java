package main.ui.console;

import main.ui.util.Displayable;

/**
 * @author DM53848 on 3/31/2016.
 * Displays a string to the console
 */
public class ConsoleOutput implements Displayable {

    @Override
    public void display(String display) {
        System.out.print(display);
    }
}
