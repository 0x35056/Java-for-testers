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

    /**
     * Finds the longest string
     *
     * @param array is array of strings
     * @return a long string
     */
    public static String getStringWithMaxLength(String[] array) {

        String s = array[0];

        for (int i = 1; i < array.length; i++) {
            if (s.length() < array[i].length()) {
                s = array[i];
            }
        }

        return s;
    }

    public static void main(String[] args) {

        int numberOfTask;
        float firstNumber;
        float secondNumber;
        char operator;
        float result;
        int length;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of task:");

        numberOfTask = scan.nextInt();

        if (numberOfTask == 1) {

            System.out.println("Enter first number:");

            firstNumber = Float.parseFloat(scan.next());

            System.out.println("Enter operator:");

            operator = scan.next().charAt(0);

            System.out.println("Enter second number:");

            secondNumber = Float.parseFloat(scan.next());

            result = calculate(firstNumber, secondNumber, operator);

            System.out.printf("Result: %.4f", result);

        } else if (numberOfTask == 2) {

            System.out.println("Enter length of array:");

            length = scan.nextInt();

            String[] array = new String[length];

            System.out.println("Enter words:");

            for (int i = 0; i < array.length; i++) {
                array[i] = scan.next();
            }

            System.out.println(getStringWithMaxLength(array));
        }

        scan.close();
    }
}