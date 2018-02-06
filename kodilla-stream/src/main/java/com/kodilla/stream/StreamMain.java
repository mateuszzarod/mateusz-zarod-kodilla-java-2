package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("to jest lambda"));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(10, 20, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(10, 20, FunctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(10, 20, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(10, 20, FunctionalCalculator::subBFromA);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        //Wywaliłem agrument i ograniczyłem do jednej metody
        //metoda zwraca String
        //tutaj po prostu przypisuję do zmiennej poem1 i wypisuję ją
        //ale nie wiem jak jest "czyściej" - czy do lambdy dodać dodatkową linijkę i zrobić tam System.out.println?

        String poem1 = poemBeautifier.beautify("Basic text to Beautify", (basicText) -> (basicText + "ABC"));
        System.out.println(poem1);
        String poem2 = poemBeautifier.beautify("Basic text to Beautify", (basicText) -> ("ABC" + basicText + "ABC"));
        System.out.println(poem2);
        String poem3 = poemBeautifier.beautify("Basic text to Beautify", (basicText) -> (basicText.toUpperCase()));
        System.out.println(poem3);
        String poem4 = poemBeautifier.beautify("Basic text to Beautify", (basicText) -> (basicText.replace('a', 'X').toLowerCase()));
        System.out.println(poem4);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}
