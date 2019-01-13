package com.bytez;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        int zero = 0 / 1024;
        System.out.println(hasTeen(1, 11, 12));
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


}
