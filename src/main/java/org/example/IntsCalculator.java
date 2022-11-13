package org.example;


public class IntsCalculator implements Ints {
    //объявляем  класс калькулятор
    protected final Calculator target;
    int powAB;

    //создаем новый объект калькулятора
    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return (int) this.target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();

    }

    @Override
    public int mult(int arg0, int arg1) {
        return (int) this.target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public int pow(int a, int b) {

        return (int) this.target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}