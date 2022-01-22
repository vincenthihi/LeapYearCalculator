package com.company;

public class Main {

    public static void main(String[] args) {

        //Method 1 Test
        NumberOfDaysInMonth.isLeapYear(-1600);
        NumberOfDaysInMonth.isLeapYear(1600);
        NumberOfDaysInMonth.isLeapYear(2017);
        NumberOfDaysInMonth.isLeapYear(2000);


        //Method 2 Test
        NumberOfDaysInMonth.getDaysInMonth(1,2020);
        NumberOfDaysInMonth.getDaysInMonth(2,2020);
        NumberOfDaysInMonth.getDaysInMonth(2,2018);
        NumberOfDaysInMonth.getDaysInMonth(-1,2020);
        NumberOfDaysInMonth.getDaysInMonth(1,-2020);

    }
}
