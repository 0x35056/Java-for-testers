package task_5;

import task_5.logic.Calculator;
import task_5.logic.Model;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Model model = Model.getInstance();
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);

        calc.setA(scan.nextInt());
        calc.setOperator(scan.next());
        calc.setB(scan.nextInt());

        float a = calc.getA();
        float b = calc.getB();
        String operator = calc.getOperator();

        model.print(a, b, operator);
    }
}
