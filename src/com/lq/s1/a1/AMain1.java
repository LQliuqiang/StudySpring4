package com.lq.s1.a1;

public class AMain1 {

    public static void main(String[] args){

//        ArithmeticCalculator calculatorLogging = new ArithmeticCalculatorLoggingImpl();
//        calculatorLogging.add(3,6);

        ArithmeticCalculator target = new ArithmeticCalculatorImpl();
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculatorLoggingProxy(target).getTarget();
        System.out.println(arithmeticCalculator.add(3,6));
    }

}
