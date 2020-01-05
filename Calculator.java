/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2y2020;

import java.util.*;

/**
 *
 * @author nasib
 */
public class Calculator {

    public static void main(String[] args) {
     Calculator();
    }
    public static void Calculator(){
            Scanner sc = new Scanner(System.in);
        System.out.println("Please insert value to A");
        double a = sc.nextDouble();
        System.out.println("Please insert value to B");
        double b = sc.nextDouble();
        System.out.println("*Please choose operation* \n"
                + "   *operation + is 1 *\n"
                + "   *operation - is 2 *\n"
                + "   *operation * is 3 *\n"
                + "   *operation / is 4 *\n");
        int operation = sc.nextInt();

        double result = 0;
        if (operation == 1) {
            result = add(a, b);
        } else if (operation == 2) {
            result = sub(a, b);
        } else if (operation == 3) {
            result = mult(a, b);
        } else if (operation == 4) {
            result = div(a, b);
        } else {
            System.out.println("Broken down");
        }
        System.out.println("Result = " + result);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mult(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

}
