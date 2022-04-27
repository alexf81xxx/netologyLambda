package com.company.Calculator;

import java.util.Collections;
import java.util.function.*;

public class Calculator {
    
    
    public static Supplier<Calculator> instance = Calculator::new; // Переменная instance содержит в себе конструктор
    // класса Calculator - Но зачем?????? Почему я просто не могу создать объект класса Calculator? Что мне это даёт????
    
    public UnaryOperator<Integer> pow = x -> x * x;
    public UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1; // Если x==0 то мы зачем-то делаем x равным -1 ЗАЧЕМ???
    
    public Predicate<Integer> isPositive = x -> x > 0;
    public Consumer<Integer> println = System.out::println;
    
    public BinaryOperator<Integer> plus = (x, y) -> x + y;
    public BinaryOperator<Integer> minus = (x, y) -> x - y;
    public BinaryOperator<Integer> multiply = (x, y) -> x * y; // Вообще ничего не понятно. Ничего он и не принимает 2 оператора, как
    // написано в презентации. Вообще у него нет метода apply  https://s.mail.ru/NT14/kUDLooHfg у него метод minBy, который ищет минимальное
    public BinaryOperator<Integer> devide = (x, y) -> {
        
        if (isPositive.test(0) == false) { // Тоже тупость какая-то. ЗАЧЕМ так усложнять? Не проще ли вместо написания отдельного метода и
            // потом его вызова написать если икс равен нулю то выбросить ошибку. Лямбда, по идее же должна как раз и избавить от лишнего кода
            // но, получается она всё в разы усложнила, так ещё и кода теперь надо писать в 3, а то и в 4 раза больше.
            try {
                return x / y;
            } catch (Exception e) {
                System.out.println("На ноль делить нельзя");
            }
        }
        return x / y;
    };
    
}
    
    


