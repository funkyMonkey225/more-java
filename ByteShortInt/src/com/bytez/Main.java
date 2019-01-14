package com.bytez;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        int zero = 0 / 1024;
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }


    public static boolean areEqualByThreeDecimalPlaces(double doubleOne, double doubleTwo) {
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        double trimmedDoubleOne = Double.parseDouble(decimalFormat.format(doubleOne));
        double trimmedDoubleTwo = Double.parseDouble(decimalFormat.format(doubleTwo));

        return trimmedDoubleOne == trimmedDoubleTwo;
    }

    public static boolean hasTeen(int one, int two, int three) {
        return ((one > 12 && one < 20) || (two > 12 && two < 20) || (three > 12 && three < 20));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }

        return radius * radius * 3.14159;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }

        return x * y;
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long days = minutes / (60 * 24);
        long years = days / 365;
        days = days % 365;

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }

    public static void printEqual(int one, int two, int three) {
        if (one < 0 || two < 0 || three < 0) {
            System.out.println("Invalid Value");
        } else if (one == two && one == three && two == three) {
            System.out.println("All numbers are equal");
        } else if (one != two && one != three && two != three) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature < 25) {
            return false;
        } else if (!summer && temperature < 36) {
            return true;
        } else if (summer && temperature < 46) {
            return true;
        } else {
            return false;
        }
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static int getDaysInMonth(int month, int year) {
        if(year < 1 || year > 9999 || month < 1 || month > 12) {
            return -1;
        }

        boolean leapYear = isLeapYear(year);

        if(month == 2 && leapYear) {
            return 29;
        } else if (month == 2) {
            return 28;
        }

        switch(month) {
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }
}

