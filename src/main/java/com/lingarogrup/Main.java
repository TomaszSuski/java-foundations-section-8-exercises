package com.lingarogrup;

import com.lingarogrup.exercise1.Exercise1;
import com.lingarogrup.exercise2.Exercise2;
import com.lingarogrup.exercise3.Exercise3;
import com.lingarogrup.exercise4.Exercise4;

public class Main {
    public static void main(String[] args) {
        Exercise1.exercise1_1();
        System.out.println();
        Exercise1.ecercise1_2();
        System.out.println();
        Exercise1.ecercise1_3();
        System.out.println();
        Exercise2.exercise2();
        System.out.println();
        Exercise2.exercise2_1();
        System.out.println();
        System.out.println(Exercise3.getMealsForDays("friday, thursday, monday, saturday, tuesday"));
        System.out.println();
        System.out.println(Exercise4.returnLetterOrderInAlphabet("c"));
    }
}
