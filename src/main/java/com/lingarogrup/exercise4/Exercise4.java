package com.lingarogrup.exercise4;

public class Exercise4 {
    public static int returnLetterOrderInAlphabet(String lowerCaseLetter) {
        return Alphabet.valueOf(lowerCaseLetter.toUpperCase()).ordinal() + 1;
    }
}
