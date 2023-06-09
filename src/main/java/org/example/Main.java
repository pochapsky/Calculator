package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int c = 0;
        try {
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1); //тут получается ноль.
            c = calc.divide.apply(a, b);// тут получается деление на ноль.
        } catch (ArithmeticException exception) {
            System.out.println("У вас деление на ноль!");
        } finally {
            calc.println.accept(c);
        }
    }

}