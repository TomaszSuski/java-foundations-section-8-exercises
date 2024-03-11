package com.lingarogrup.exercise7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise7Test {
    @Test
    public void checkConversionOfa8() {
        String output = Exercise7.convertChessNotationToCoordinates("a8");
        assertEquals("0,0", output);
    }
    @Test
    public void checkConversionOfh1() {
        String output = Exercise7.convertChessNotationToCoordinates("h1");
        assertEquals("7,7", output);
    }

    @Test
    public void checkConversionOfg5() {
        String output = Exercise7.convertChessNotationToCoordinates("g5");
        assertEquals("6,3", output);
    }

    @Test
    public void checkConversionOfd4() {
        String output = Exercise7.convertChessNotationToCoordinates("d4");
        assertEquals("3,4", output);
    }
}