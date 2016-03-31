package main.ui;

import java.util.Scanner;

/**
 *  @author Team A on 3/25/2016.
 *  Takes users input and validates the input and returns the input
 */
public class Console implements ConsoleIO {
    Scanner inputScanner = new Scanner(System.in);

    @Override
    public int getInt(String prompt) {
        int returnInt = 0;

        while (true) {
            try {
                System.out.println(prompt);
                returnInt = Integer.parseInt(inputScanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid integer. Try again");
            }
        }

        return returnInt;
    }

    @Override
    public int getIntWithinRange(String prompt, int min, int max) {
        int returnInt = 0;

        while (true) {
            returnInt = getInt(prompt);

            if (returnInt < min) {
                System.out.println("Error! Number must be greater than " + min);
            } else if (returnInt > max) {
                System.out.println("Error! Number must be less than " + max);
            } else {
                break;
            }

        }
        return returnInt;
    }

    @Override
    public double getDouble(String prompt) {
        double returnDouble = 0;

        while (true) {
            try {
                System.out.println(prompt);
                returnDouble = Double.parseDouble(inputScanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid double. Try again");
            }
        }
        return returnDouble;
    }

    @Override
    public double getDoubleWithinRange(String prompt, double min, double max) {
        double returnDouble = 0;

        while (true) {
            returnDouble = getDouble(prompt);

            if (returnDouble < min) {
                System.out.println("Error! Number must be greater than " + min);
            } else if (returnDouble > max) {
                System.out.println("Error! Number must be less than " + max);
            } else {
                break;
            }
        }
        return returnDouble;
    }

    @Override
    public String getRequiredString(String prompt) {
        String inputString;
        while (true) {
            System.out.println(prompt);
            inputString = inputScanner.nextLine();

            if (inputString.equals("")) {
                System.out.println("Error!  This entry is required. Try again");
            } else {
                break;
            }
        }
        return inputString;
    }

    @Override
    public String getChoiceString(String prompt, String s1, String s2) {
        String choice;

        while (true) {
            choice = getRequiredString(prompt);
            if (choice.equalsIgnoreCase(s1) || choice.equalsIgnoreCase(s2)) {
                break;
            } else {
                System.out.println("Error!  Entry must be " + s1 + " or " + s2 + ". Try again.");
            }
        }
        return choice;
    }

    @Override
    public String getChoiceArray(String prompt, String[] array){
        String choice = "";
        String errorMessage;

        boolean flag = true;
        while (flag == true){
            errorMessage = "Error you must enter one of the following: ";
            choice = getRequiredString(prompt);
            for(int counter = 0; counter < array.length; counter++){
                if (choice.equalsIgnoreCase(array[counter])){
                    flag = false;
                    break;
                }
                errorMessage += (array[counter] + " ");
            }
            if (flag == true) {
                System.out.println(errorMessage.toString());
            }
        }
        return choice;
    }

    @Override
    public void print(String s) {
        System.out.print(s);
    }

    @Override
    public void println(String s) {
        System.out.println(s);
    }

    @Override
    public void println() {
        System.out.println();
    }

    public void close() {
        inputScanner.close();
    }
}
