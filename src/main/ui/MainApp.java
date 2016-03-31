package main.ui;

/**
 * Created by DM53848 on 3/15/2016.
 */
public class MainApp {

    public static void main(String[] args) {
        Displayable display = IOFactory.getDisplayable();
        Validatable validate = IOFactory.getValidatable();
        String continueString = null;

        display.display("Welcome to the slot machine\n\n");



        do {
            continueString = validate.getChoiceString("continue\n", "y", "n");
        } while (continueString.equalsIgnoreCase("y"));


    }
}
