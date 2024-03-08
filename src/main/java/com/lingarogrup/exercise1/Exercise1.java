package com.lingarogrup.exercise1;

public class Exercise1 {
    /* Use an Enum to model the days of the week and print them using a loop.
        1. Print them with the rst letter capitalized (without changing the Enum constants).
        2. Alternate between printing the rst letter capitalized or whatever letter is approximately
        in the middle of the word. For example: Sunday, monDay, Tuesday, wednEsday, etc.
        3. Print 10 randomly-chosen days of the week */
    private static com.lingarogrup.exercise1.Weekdays[] Weekdays = com.lingarogrup.exercise1.Weekdays.values();

    public static void exercise1_1() {
        for (com.lingarogrup.exercise1.Weekdays weekday : Weekdays) {
            String myEnum = weekday.toString();
            String lowerCaseEnum = myEnum.toLowerCase();
            String firstUpperCaseChar = String.valueOf(myEnum.charAt(0));
            String restOfText = lowerCaseEnum.substring(1);
            String result = firstUpperCaseChar + restOfText;
            System.out.println(result);
        }
    }

    public static void ecercise1_2() {
        for (com.lingarogrup.exercise1.Weekdays weekday : Weekdays) {
            String myEnum = weekday.toString();
            String lowerCaseEnum = myEnum.toLowerCase();
            if(!(weekday.ordinal() % 2 == 0)) {
                int charToChange = lowerCaseEnum.length() / 2;
                String upperCaseChar = String.valueOf(myEnum.charAt(charToChange));
                String leadingText = lowerCaseEnum.substring(0, charToChange);
                String indentText = lowerCaseEnum.substring(charToChange + 1);
                String result = leadingText + upperCaseChar + indentText;
                System.out.println(result);
            } else {
                String firstUpperCaseChar = String.valueOf(myEnum.charAt(0));
                String restOfText = lowerCaseEnum.substring(1);
                String result = firstUpperCaseChar + restOfText;
                System.out.println(result);
            }
        }
    }

    public static void ecercise1_3() {
        int i = 1;
        while (i <= 10) {
          int randomIndex = (int) (Math.random() * 10);
            if (randomIndex >= Weekdays.length) continue;
            System.out.println(Weekdays[randomIndex]);
            i++;
        }
    }
}
