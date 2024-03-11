package com.lingarogrup.exercise5;

public class Exercise5 {
    public static Character getLetterFromAlphabetByOrdinalPosition(int ordinalPosition) {
        if (ordinalPosition >= 1 && ordinalPosition <= 26) {
            return (char) (ordinalPosition + 96);
        } else {
            System.out.println("Letter position number out of aplphabet range");
            return null;
        }
    }
}
