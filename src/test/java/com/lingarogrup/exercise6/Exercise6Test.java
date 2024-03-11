package com.lingarogrup.exercise6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise6Test {

    @Test
    public void isReturning0From8() {
        int val = Exercise6.returnSpecificValue(8);
        assertEquals(0, val);
    }

    @Test
    public void isReturning1From7() {
        int val = Exercise6.returnSpecificValue(7);
        assertEquals(1, val);
    }

    @Test
    public void isReturning2From6() {
        int val = Exercise6.returnSpecificValue(6);
        assertEquals(2, val);
    }

    @Test
    public void isReturning3From5() {
        int val = Exercise6.returnSpecificValue(5);
        assertEquals(3, val);
    }

    @Test
    public void isReturning4From4() {
        int val = Exercise6.returnSpecificValue(4);
        assertEquals(4, val);
    }

    @Test
    public void isReturning5From3() {
        int val = Exercise6.returnSpecificValue(3);
        assertEquals(5, val);
    }

    @Test
    public void isReturning6From2() {
        int val = Exercise6.returnSpecificValue(2);
        assertEquals(6, val);
    }

    @Test
    public void isReturning7From1() {
        int val = Exercise6.returnSpecificValue(1);
        assertEquals(7, val);
    }
}