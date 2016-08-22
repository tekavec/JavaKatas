package com.codurance.katas;

import org.junit.Test;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class YearShould
{
    @Test public void
    be_a_leap_year_if_divisible_by_4() {
        Year year = new Year(2004);

        assertTrue(year.isLeapYear());
    }

    @Test public void
    not_be_a_leap_year_if_not_divisible_by_4() {
        Year year = new Year(1999);

        assertFalse(year.isLeapYear());
    }

    @Test public void 
    be_a_leap_year_if_divisible_by_400() {
        Year year = new Year(800);

        assertTrue(year.isLeapYear());
    }

    @Test public void
    not_be_a_leap_year_if_divisible_by_100_but_not_by_4() {
        Year year = new Year(1900);

        assertFalse(year.isLeapYear());
    }
}