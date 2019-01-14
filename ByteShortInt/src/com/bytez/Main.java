package com.bytez;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        int zero = 0 / 1024;
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
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


}
