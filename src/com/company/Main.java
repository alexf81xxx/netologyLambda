package com.company;

import com.company.Calculator.Calculator;


public class Main {
    
    public static void main(String[] args) throws Exception {
    
        Calculator calculator = Calculator.instance.get(); // Переменная calculator содержит в себе ссылку на
        // переменную instance, которая реализует функциональный интерфейс у которого есть метод get Господи, ЗАЧЕМ???????
        // Почему просто не написать new Calculator? Lambda просто взяла и в разы всё усложнила, так ещё и кода писать стало нужно в
        // несколько раз больше.
    
        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1, 1);
        int c = calculator.devide.apply(a, b);
    
        calculator.println.accept(c); // Не работает, так как происходит деление на 0. Способ решения 1 - выбросить исключение (как реализовал я)
        // 2 - через ads как у вас взять и зачем-то и сделать x == -1;
    
    
    }
}
