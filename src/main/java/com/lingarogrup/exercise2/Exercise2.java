package com.lingarogrup.exercise2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise2 {
/* Write code to print the following using only an Enum & loop without using any conditionals
(if/else/switch/etc.)
        We eat pot roast on Sunday
        We eat spaghetti on Monday
        We eat tacos on Tuesday
        We eat chicken on Wednesday
        We eat meatloaf on Thursday
        We eat hamburgers on Friday
        We eat pizza on Saturday
    1. Do it again but capitalize the meal names too. “pot roast” should become “Pot Roast”.
    (No solution provided because you’ve done this before in earlier exercise - but try to do
    it without looking at previous work - for practice) */

    private static com.lingarogrup.exercise2.Weekdays[] Weekdays = com.lingarogrup.exercise2.Weekdays.values();

    public static void exercise2() {
        for (com.lingarogrup.exercise2.Weekdays weekday: Weekdays) {
            String weekdayFirstChar = weekday.name().substring(0, 1);
            String weekdayRestOfText = weekday.name().substring(1).toLowerCase();
            String weekDayName = weekdayFirstChar + weekdayRestOfText;
            System.out.printf("We eat %s on %s%n", weekday.toString(), weekDayName);
        }

    }

    public static void exercise2_1() {
        for (com.lingarogrup.exercise2.Weekdays weekday: Weekdays) {
            String weekdayFirstChar = weekday.name().substring(0, 1);
            String weekdayRestOfText = weekday.name().substring(1).toLowerCase();
            String weekDayName = weekdayFirstChar + weekdayRestOfText;
            String mealFirstChar = weekday.toString().substring(0, 1).toUpperCase();
            String mealRestOfText = weekday.toString().substring(1);
            String meal = mealFirstChar + mealRestOfText;
            String mealRegex = "(\\w+)\\s(\\w+?)";
            Pattern mealPatten = Pattern.compile(mealRegex);
            Matcher mealMatcher = mealPatten.matcher(weekday.toString());
            if (mealMatcher.find()) {
                int groups = mealMatcher.groupCount();
                do {
                    String meal2ndWord1stChar = mealMatcher.group(2).substring(0, 1).toUpperCase();
                    String meal2ndWordRest = mealMatcher.group(2).substring(1);
                    String mealSecondWord = meal2ndWord1stChar + meal2ndWordRest;
                    meal = meal.replace(mealMatcher.group(2), mealSecondWord);
                } while (groups == 1);
            }
            System.out.printf("We eat %s on %s%n", meal, weekDayName);
        }
    }
}
