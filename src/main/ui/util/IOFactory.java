package main.ui.util;

import main.ui.console.ConsoleInput;
import main.ui.console.ConsoleOutput;
import main.ui.gui.GUIDisplay;

/**
 *  @author Team A on 3/25/2016.
 */
public class IOFactory {
    public static Displayable getDisplayable() {
        Displayable display = new ConsoleOutput();
    //    Displayable display = new GUIDisplay();
        return display;
    }

    public static Validatable getValidatable () {
        Validatable validate = new Validator();
        return validate;
    }

    public static Interactable getInteractible() {
        Interactable interactor = new ConsoleInput();
        return interactor;
    }

}
