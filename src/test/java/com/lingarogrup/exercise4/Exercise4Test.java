package com.lingarogrup.exercise4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Exercise4Test {
    @Test
    public void isTheMethodReturningRightLeterOrdinal(){
        List<String> letters = Arrays.asList("a", "z", "w", "f", "c", "h");
        int[] expectedOutputs = {1, 26, 23, 6, 3, 8};
        for (Object letter: letters) {
            int letterOrdinal = Exercise4.returnLetterOrderInAlphabet(letter.toString());
            int letterIndex = letters.indexOf(letter);
            assertEquals(expectedOutputs[letterIndex], letterOrdinal);
        }
    }
}