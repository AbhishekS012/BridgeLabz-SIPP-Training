package reflectionproblems;

import java.lang.reflect.*;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class Problem3_InvokePrivateMethod {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);
        Object result = method.invoke(calc, 5, 6);
        System.out.println("Result: " + result);
    }
}