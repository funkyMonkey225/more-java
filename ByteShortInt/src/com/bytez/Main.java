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
        if(radius < 0) {
            return -1.0;
        }

        return radius * radius * 3.14159;
    }

    public static double area(double x, double y) {
        if(x < 0 || y < 0) {
            return -1.0;
        }

        return x * y;
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long days = minutes / (60 * 24);
        long years = days / 365;
        days = days % 365;

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }

    public static void printEqual(int one, int two, int three) {
        if(one < 0 || two < 0 || three < 0) {
            System.out.println("Invalid Value");
        } else if (one == two && one == three && two == three) {
            System.out.println("All numbers are equal");
        } else if (one != two && one != three && two != three) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }
}
