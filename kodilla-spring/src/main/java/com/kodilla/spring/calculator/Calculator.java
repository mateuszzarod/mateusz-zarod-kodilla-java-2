package com.kodilla.spring.calculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public double add (double a, double b){
        double add = a + b;
        display.displayValue(add);
        return add;
    }

    public double subtract (double a, double b){
        double sub = a - b;
        display.displayValue(sub);
        return sub;
    }

    public double multiply (double a, double b){
        double mul = a * b;
        display.displayValue(mul);
        return mul;
    }

    public double divide (double a, double b){
        double div = a / b;
        display.displayValue(div);
        return div;
    }




/*    która będzie komponentem Springa i będzie posiadała pole
    Display display. Użyj wstrzykiwania przez właściwość klasy
    do powiązania obiektów klas Calculator oraz Display ze sobą.*/

/*
    Zaimplementuj cztery podstawowe działania matematyczne
            (zrób metody add(double a, double b), sub(double a, double b),
    mul(double a, double b) oraz div(double a, double b)) - obsługujące
    odpowiednio dodawanie, odejmowanie, mnożenie i dzielenie.
    Każda metoda powinna przed zwróceniem wyniku wywołać metodę
    displayValue(double val) obiektu display.
*/

}
