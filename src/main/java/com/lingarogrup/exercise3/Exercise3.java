package com.lingarogrup.exercise3;

import com.lingarogrup.exercise2.Weekdays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {
/* Write a method that takes the following input String (in bold) and returns the following
output String using an Enum like (print the output):
getMealsForDays(“friday, thursday, monday, saturday, tuesday”)
Output: hamburgers, meatloaf, spaghetti, etc… */

    public static String getMealsForDays(String daysCommaSeparated) {
        String output = "";
        String daysRegex = "(\\w+)";
        Pattern daysPattern = Pattern.compile(daysRegex);
        Matcher daysMatcher = daysPattern.matcher(daysCommaSeparated);
        int lastMatchPos = 0;
        while (daysMatcher.find()) {
            String dayCapitalized = daysMatcher.group().toUpperCase();
            lastMatchPos = daysMatcher.end();
            if (lastMatchPos == daysCommaSeparated.length()) {
                output += Weekdays.valueOf(dayCapitalized).toString();
            } else {
                output += Weekdays.valueOf(dayCapitalized).toString() + ", ";
            }
        }
        return output;
    }
}