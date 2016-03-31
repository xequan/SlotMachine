package main.ui;

import java.util.Scanner;

/**
 * Created by DM53848 on 3/15/2016.
 */
public class MainApp {
    public static Console console = new Console();
    public static void main(String[] args) {

        String continueString = null;

        do {
            System.out.println("Continue? (y/n): ");
            continueString = console.getChoiceString("Continue? (y/n):", "y", "n");
        } while (continueString.equalsIgnoreCase("y"));

        console.close();
        System.out.println("bye");
    }
}
