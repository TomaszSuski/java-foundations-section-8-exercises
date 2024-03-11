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

/* the solution from the course uses array built from the provided string
   to be remembered:

   public static void main(String[] args) {
        String meals = getMealsForDays("friday, thursday, monday, saturday, tuesday");
        System.out.println(meals);
    }

    private static String getMealsForDays(String dayCSV) {
        String[] days = dayCSV.split(",");
        StringBuilder sb = new StringBuilder();
        for (String day : days) {
            sb.append(DayOfWeek.valueOf(day.strip().toUpperCase()).getMeal());

            // notice we add a comma & a space after each meal.
            // The last comma-space will need to be removed
            // otherwise, we'll return "...pizza, tacos, "
            // instead of "...pizza, tacos"
            sb.append(", ");
        }

        // Get index of the last comma because that needs to be removed
        // We could do this by simply getting the length of the StringBuilder minus 2
        // (2 because ", " is two characters long and it's at the end of the String)
        // (the String of meals we're about to return) OR we could alternatively
        // call StringBuilder.lastIndexOf(", "); which would give us the same thing
        // Also, need to remove the space character right after the last comma
        int lastCommaIndex = sb.length() - 2;
//        int lastCommaSpaceIndex = sb.lastIndexOf(", ");
        sb.delete(lastCommaIndex, lastCommaIndex + 1); // lastCommaIndex + 1 represents the space following the comma
        return sb.toString();
    }
 */