package main.ui.console;

import main.ui.util.Displayable;

/**
 * Created by DM53848 on 3/31/2016.
 */
public class ConsoleOutput implements Displayable {

    @Override
    public void display(String display) {
        System.out.print(display);
    }
}
