package main.ui;

/**
 *  @author Team A on 3/25/2016.
 */
public class IOFactory {
    public static Displayable getDisplayable() {
        Displayable display = new ConsoleDisplay();
        return display;
    }

    public static Validatable getValidatable () {
        Validatable validate = new Validator();
        return validate;
    }

}
