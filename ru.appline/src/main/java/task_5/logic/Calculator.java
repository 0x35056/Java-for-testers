package task_5.logic;

public class Calculator implements Add, Subtract, Multiply, Divide {

    private float a;
    private float b;
    private String operator;

    public Calculator() {
        super();
    }

    public Calculator(float a, float b, String operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public float subtract(float a, float b) {
        return a - b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public float divide(float a, float b) {
        return a / b;
    }
}
