package com.company;

import com.company.Calculator.Calculator;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) throws Exception {
    
     Calculator calculator = Calculator.instance.get(); // Переменная calculator содержит в себе ссылку на
     // переменную instance, которая реализует функциональный интерфейс у которого есть метод get
    
        /*int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1,1);
        int c = calculator.devide.apply(a, b);
    
        calculator.println.accept(c);
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(0));*/
        
        int x = 1;
        int y = 0;
        
        try {
           int z = x/y;
        }catch (Exception e){
            System.out.println("Я ТУПОЙ");
        }
        
        if (y == 0){
            throw new Exception("На ноль делить нельзя");
        }
   
    }
}
