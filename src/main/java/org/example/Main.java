package org.example;

public class Main {
    public static void main(String[] args) {

        int a = 4;
        int b = 15;

        Ints calc = new IntsCalculator();

        int sum = calc.sum(a, b);
        System.out.println("Результат сложения чисел " + a + " и " + b + " равен " + sum);
        int mult = calc.mult(a, b);
        System.out.println("Результат умножения чисел " + a + " и " + b + " равен " + mult);
        int pow = calc.pow(a, b);
        System.out.println(a + " в " + b + " степени равно " + pow);
    }
}
