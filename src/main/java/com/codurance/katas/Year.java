package com.codurance.katas;

public class Year {
    private int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        return isDivisibleBy(4) && (isDivisibleBy(400) || !isDivisibleBy(100));
    }

    private boolean isDivisibleBy(int i) {
        return year % i == 0;
    }
}
