package com.company;

public class NumberOfDaysInMonth {

    //METHOD 1
    public static boolean isLeapYear(int year) {
        if (year < 0 || year > 9999) {
//            System.out.println(year + " not leap year");
            return false;
        } else if(year % 4 == 0 && ((year % 100 != 0) || (year % 400 == 0))) {
//            System.out.println(year + " is a leap year");
            return true;
        } else {
//            System.out.println(year + " not leap year");
            return false;
        }
    }

    //METHOD 2
    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)){
            System.out.println("Invalid Number");
            return -1;
        } else {

            //switch statement, get number of days in the month
            switch (month) {

                //Months with 31 Days
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println("Month " + month + " has 31 days");
                    return 31;

                //Months with 30 Days
                case 4: case 6: case 9: case 11:
                    System.out.println("Month " + month + " has 30 days");
                    return 30;

                //February considering if it is a leap year or not
                case 2:
                    if(NumberOfDaysInMonth.isLeapYear(year)) {
                        System.out.println("Month " + month + " has 29 days and is a LEAP YEAR");
                        return 29;
                    } else {
                        System.out.println("Month " + month + " has 28 days and is NOT a LEAP YEAR");
                        return 28;
                    }

                default:
                    System.out.println("Invalid Month");
                    return -1;
            }
        }
    }
}
