package task_2;

import java.util.Scanner;

/**
 * Created by Maya on 28.02.2021
 */

public class Main {
    /**
     * Calculates two numbers
     *
     * @author Maya
     * @param a is a first number
     * @param b is a second number
     * @param c is a operator +, -, * or /
     * @return is result of a sum, subtraction, multiplication or division
     */
    public static float calculate(float a, float b, char c){

        float result = 0;

        switch (c){
            case ('+'):
                result = a + b;
                break;
            case ('-'):
                result = a - b;
                break;
            case ('*'):
                result = a * b;
                break;
            case ('/'):
                result = a / b;
                break;
            default:
                System.out.println(c + " is not an operator.");
        }

        return result;
    }

    public static void main(String[] args) {

        float first;
        float second;
        char operator;
        float result;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");

        first = Float.parseFloat(scan.next());

        System.out.println("Enter operator:");

        operator = scan.next().charAt(0);

        System.out.println("Enter second number:");

        second = Float.parseFloat(scan.next());

        result = calculate(first, second, operator);

        System.out.printf("Result: %.4f", result);

        scan.close();
    }
}