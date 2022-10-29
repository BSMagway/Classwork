package by.itstep.Client;

import by.itstep.MathUtils;

import java.util.Scanner;

public class MathClient {
    public static void main(String[] args) {
//        int a , b;
//
        String name;
        System.out.println("Enter name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
//
//        System.out.println("Enter a");
//        a = sc.nextInt();
//        System.out.println("Enter b");
//        b = sc.nextInt();
//        System.out.println("Sum = " + MathUtils.sum(a, b));
//        System.out.println("Div = " + MathUtils.div(a, b));
//        System.out.println("Mult = " + MathUtils.mult(a, b));
//        System.out.println("Sub = " + MathUtils.sub(a, b));

//        double x , y, c;
//        x = 2;
//        y = 2;
//        c = 3;
//
//        System.out.println(MathUtils.findSGeron(x, y, c));


        System.out.println(MathUtils.guessNumber(name));


        sc.close();
    }
}
