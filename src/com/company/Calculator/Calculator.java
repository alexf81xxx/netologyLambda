package com.company.Calculator;

import java.util.Collections;
import java.util.function.*;

public class Calculator {
    
    
    public static Supplier<Calculator> instance = Calculator::new; // Переменная instance содержит в себе конструктор
    // класса Calculator - Но зачем?????? Почему я просто не могу создать объект класса Calculator?
    
    public UnaryOperator<Integer> pow = x -> x * x;
    public UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    
    public Predicate<Integer> isPositive = x -> x > 0;
    public Consumer<Integer> println = System.out::println;
    
    public BinaryOperator<Integer> plus = (x, y) -> x + y;
    public BinaryOperator<Integer> minus = (x, y) -> x - y;
    public BinaryOperator<Integer> multiply = (x, y) -> x * y;
    public BinaryOperator<Integer> devide = (x, y) -> {
        
        if (isPositive.test(0) == false) {
            try {
                return x / y;
            } catch (Exception e) {
                System.out.println("На ноль делить нельзя");
            }
        }
        return x / y;
    };
    
}
    
    


