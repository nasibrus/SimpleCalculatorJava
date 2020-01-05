/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleCalculator;

import java.util.*;

/**
 *
 * @author Ruslan Nasibov (nasibrus)
 * January 2020
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
        System.out.println("*Please choose operation*  \n"
                + "   *operation + (addition) is 1    *\n"
                + "   *operation - (Subtraction) is 2 *\n"
                + "   *operation * (Multiply) is 3    *\n"
                + "   *operation / (Divide) is 4      *\n"
                + "   *operation % (Module) is 5      *\n");
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
        } else if (operation == 5) {
            result = mod(a, b);
        } else {
            System.out.println("Wrong Operation");
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
    public static double mod(double a, double b) {
        return a % b;
    }
}
