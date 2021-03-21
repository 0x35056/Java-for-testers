package task_5.logic;

public class Model {

    private static float result;
    private static final Model instance = new Model();
    private static final Calculator calc = new Calculator();

    public static Model getInstance() {
        return instance;
    }

    public float parse(float a, float b, String operator){
        if ("+".equals(operator)) {
            result = calc.add(a, b);
        } else if ("-".equals(operator)) {
            result = calc.subtract(a, b);
        } else if ("*".equals(operator)) {
            result = calc.multiply(a, b);
        } else if ("/".equals(operator)) {
            result = calc.divide(a, b);
        }

        return result;
    }

    public void print(float a, float b, String operator) {
        System.out.print(parse(a, b, operator));
    }
}
