package com.lingarogrup.exercise4;

public class Exercise4 {
    public static int returnLetterOrderInAlphabet(String lowerCaseLetter) {
        return Alphabet.valueOf(lowerCaseLetter.toUpperCase()).ordinal() + 1;
    }
}

/* course solution. A lot simplier :)
public class Exercise4 {

    public static int convert(char letter) {
        return letter - 96;
    }
}
 */
