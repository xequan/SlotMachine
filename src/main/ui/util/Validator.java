package main.ui.util;

/**
 *  @author Team A on 3/25/2016.
 *  Takes users input and validates the input and returns the input
 */
public class Validator implements Validatable {
    Interactable input = IOFactory.getInteractible();
    Displayable output = IOFactory.getDisplayable();

    @Override
    public int getInt(String prompt) {
        int returnInt = 0;

        while (true) {
            try {
                output.display(prompt + "\n");
                returnInt = Integer.parseInt(input.requestString());
                break;
            } catch (NumberFormatException e) {
                output.display("Error! Invalid integer. Try again\n");
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
                output.display("Error! Number must be greater than " + min + "\n");
            } else if (returnInt > max) {
                output.display("Error! Number must be less than " + max + "\n");
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
                output.display(prompt + "\n");
                returnDouble = Double.parseDouble(input.requestString());
                break;
            } catch (NumberFormatException e) {
                output.display("Error! Invalid double. Try again\n");
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
                output.display("Error! Number must be greater than " + min + "\n");
            } else if (returnDouble > max) {
                output.display("Error! Number must be less than " + max + "\n");
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
            output.display(prompt + "\n");
            inputString = input.requestString();

            if (inputString.equals("")) {
                output.display("Error!  This entry is required. Try again\n");
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
                output.display("Error!  Entry must be " + s1 + " or " + s2 + ". Try again.\n");
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
                output.display(errorMessage.toString() + "\n");
            }
        }
        return choice;
    }

}
