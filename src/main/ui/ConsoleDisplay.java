package main.ui;

/**
 * Created by DM53848 on 3/31/2016.
 */
public class ConsoleDisplay implements Displayable {

    @Override
    public void display(String display) {
        System.out.print(display);
    }
}
