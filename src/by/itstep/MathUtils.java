package by.itstep;

import java.util.Scanner;

public class MathUtils {

    private static int counter = 0;
    public static final double PI = 3.14;

    public static double findSGeron (double a, double b, double c) {
        counter++;
        if ((a + b) <= c || (a + c) <= b || (c + b) <= a) {
            return -1;
        }

        double p = (double)(a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double findSCircle (double radius) {
        counter++;
        return (PI * Math.pow(radius, 2));
    }

    public static int mult(int x, int y) {
        counter++;
        return x * y;
    }

    public static int sub(int x, int y) {
        counter++;
        return  x - y;
    }

    public static double div(double x, double y) {
        counter++;
        if (y == 0) {
            System.err.println("Divide by zero");
        }

        return (double) x / y;
    }

    public static int sum(int x, int y) {
        counter++;
        return  x + y;
    }

    public static boolean guessNumber(String name) {
        counter++;
        System.out.println("Game start " + name);
        int x = (int)(Math.random() * 10);
        int attemps = 3;
        boolean result = false;

        Scanner sc = new Scanner(System.in);

        while (attemps > 0) {
            System.out.println("Try");
            int answer = sc.nextInt();
            attemps--;

            if (x == answer) {
                System.out.println("win");
                result = true;
                break;
            } else if (attemps == 0) {
                System.out.println("lose");
                System.out.println("Number x = " + x);
            } else {
                System.out.println("You have = " + attemps + " attemps, try again");

                if (x < answer) {
                    System.out.println("You number more than x");
                } else {
                    System.out.println("You number less than x");
                }
            }
        }

        sc.close();

        return result;
    }



}
