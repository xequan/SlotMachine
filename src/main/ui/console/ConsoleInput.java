package main.ui.console;

import main.ui.util.Displayable;
import main.ui.util.Interactable;
import main.ui.util.Validatable;

import java.util.Scanner;

/**
 * @author DM53848 on 3/31/2016.
 * Gets console input from the user
 */
public class ConsoleInput implements Interactable {
    @Override
    public void SetDisplay(Displayable display) {
    }

    @Override
    public void SetValidator(Validatable validator) {
    }

    @Override
    public String requestString() {
        Scanner inputScanner = new Scanner(System.in);
        return inputScanner.nextLine();
    }
}
