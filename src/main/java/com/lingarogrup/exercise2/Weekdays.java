package com.lingarogrup.exercise2;

public enum Weekdays {
    SUNDAY("pot roast"),
    MONDAY("spaghetti"),
    TUESDAY("tacos"),
    WEDNESDAY("chicken"),
    THURSDAY("meatloaf"),
    FRIDAY("hamburgers"),
    SATURDAY("pizza");

    private String meal;
    Weekdays(String meal) {
        this.meal = meal;
    }

    public String toString() {
        return meal;
    }
}
