package com.lingarogrup.exercise5;

public class Exercise5 {
/*  Write a method that does the opposite of #4 - taking a number, 1-26, and returns a
    lowercase letter. 1 would return a, 2 = b, 26 = z, etc.
*/
    public static Character getLetterFromAlphabetByOrdinalPosition(int ordinalPosition) {
        if (ordinalPosition >= 1 && ordinalPosition <= 26) {
            return (char) (ordinalPosition + 96);
        } else {
            System.out.println("Letter position number out of alphabet range");
            return null;
        }
    }
}
