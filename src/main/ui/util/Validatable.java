package main.ui.util;

/**
 *  @author Team A on 3/31/2016.
 *  Interface to validate user input
 */
public interface Validatable {
    int getInt(String prompt);

    int getIntWithinRange(String prompt, int min, int max);

    double getDouble(String prompt);

    double getDoubleWithinRange(String prompt, double min, double max);

    String getRequiredString(String prompt);

    String getChoiceString(String prompt, String s1, String s2);

    String getChoiceArray(String prompt, String[] array);
}
