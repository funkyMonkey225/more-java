package com.bytez;

import java.math.RoundingMode;
import java.sql.SQLOutput;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(15));
    }

    public static int getLargestPrime(int number) {
        if(number < 2) {
            return -1;
        }
        int i;

        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }

        return i;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        for(int i = bigCount; i > 0; i--) {
            if(goal > 4) {
                goal -= 5;
                bigCount -= 1;
            } else {
                i = 0;
            }
        }

        for(int i = smallCount; i > 0; i--) {
            if(goal > 0) {
                goal -= 1;
                smallCount -= 1;
            } else {
                i = 0;
            }
        }

        return goal == 0;
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }

        return String.valueOf(number).length();
    }

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        String numberAsString = String.valueOf(number);

        for(int i=0; i < numberAsString.length(); i++) {
            switch (String.valueOf(numberAsString.charAt(i))) {
                case "0":
                    System.out.println("Zero");
                    break;
                case "1":
                    System.out.println("One");
                    break;
                case "2":
                    System.out.println("Two");
                    break;
                case "3":
                    System.out.println("Three");
                    break;
                case "4":
                    System.out.println("Four");
                    break;
                case "5":
                    System.out.println("Five");
                    break;
                case "6":
                    System.out.println("Six");
                    break;
                case "7":
                    System.out.println("Seven");
                    break;
                case "8":
                    System.out.println("Eight");
                    break;
                case "9":
                    System.out.println("Nine");
                    break;
            }
        }
    }

    public static int reverse(int number) {
        String numberAsString = String.valueOf(Math.abs(number));

        String reverseNumber = "";
        if(number < 0) {
            reverseNumber += "-";
        }
        boolean leading = true;
        for(int i=numberAsString.length() - 1; i >= 0; i--) {
            String charSubstring = String.valueOf(numberAsString.charAt(i));
            if(!charSubstring.equals("0")) {
                reverseNumber += charSubstring;
                leading = false;
            } else if (!leading) {
                reverseNumber += charSubstring;
            }
        }
        return Integer.parseInt(reverseNumber);
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if(num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 || num3 < 10 || num3 > 1000) {
            return false;
        }

        char num1LastDigit = String.valueOf(num1).charAt(String.valueOf(num1).length() - 1);
        char num2LastDigit = String.valueOf(num2).charAt(String.valueOf(num2).length() - 1);
        char num3LastDigit = String.valueOf(num3).charAt(String.valueOf(num3).length() - 1);

        if(num1LastDigit == num2LastDigit || num1LastDigit == num3LastDigit || num3LastDigit == num2LastDigit) {
            return true;
        }

        return false;
    }

    public static boolean isPerfectNumber(int number) {
        if(number < 1) {
            return false;
        }

        int sum = 0;
        for(int i=1; i < number; i++) {
            if(number % i == 0) {
                sum += i;
            }
        }
        if(sum == number) {
            return true;
        }

        return false;
    }

    public static void printFactors(int number) {
        if(number < 1) {
            System.out.println("Invalid Value");
        }

        for(int i=1; i <= number; i++) {
            if(number % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) {
            return -1;
        }

        int minimum = second;
        if(first < second) {
            minimum = first;
        }

        for(int i=minimum; i > 0; i--) {
            if(second % i == 0 && first % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        String num1AsString = String.valueOf(num1);
        String num2AsString = String.valueOf(num2);

        if(num2AsString.contains(num1AsString.substring(0,1)) ||
                num2AsString.contains(num1AsString.substring(1))) {
            return true;
        }

        return false;
    }

    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }

        String numberAsString = String.valueOf(number);
        int sum = 0;

        for(int i=0; i < numberAsString.length(); i++) {
            if(numberAsString.charAt(i) % 2 == 0) {
                sum += Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
            }
        }

        return sum;
    }

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }

        String numberAsString = String.valueOf(number);
        String firstDigit = String.valueOf(numberAsString.charAt(0));
        String lastDigit = String.valueOf(numberAsString.charAt(numberAsString.length() - 1));
        int sum = Integer.parseInt(firstDigit) + Integer.parseInt(lastDigit);

        return sum;
    }

    public static boolean isPalindrome(int number) {
        boolean palindrome = true;
        String numberAsString = String.valueOf(Math.abs(number));
        int reverseCounter = numberAsString.length() - 1;
        int counter = 0;

        while(counter < (numberAsString.length())/2) {
            if(numberAsString.charAt(counter) != numberAsString.charAt(reverseCounter)) {
                palindrome = false;
                break;
            }
            counter++;
            reverseCounter--;
        }
        return palindrome;
    }


    public static boolean areEqualByThreeDecimalPlaces(double doubleOne, double doubleTwo) {
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        double trimmedDoubleOne = Double.parseDouble(decimalFormat.format(doubleOne));
        double trimmedDoubleTwo = Double.parseDouble(decimalFormat.format(doubleTwo));

        return trimmedDoubleOne == trimmedDoubleTwo;
    }

    public static int sumOdd(int start, int end) {
        if(start < 1 || end < 1 || start > end) {
            return -1;
        }
        int sum = 0;
        for(int i=start; i <= end; i++) {
            if(isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isOdd(int number) {
        if(number < 1) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }

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

