package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
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

        poemBeautifier.beautify("Basic text to Beautify", "AAA", (basicText, textToBeautify) -> (basicText + textToBeautify));
        poemBeautifier.beautify("Basic text to Beautify 2", "OMGOMGOMG", (basicText, textToBeautify) -> (textToBeautify + basicText));
        poemBeautifier.beautify("basic text to Beautify", "OMGOMG", (basicText, textToBeautify) -> basicText.toUpperCase());
        poemBeautifier.beautify("basic text to Beautify", "OMGOMG", (basicText, textToBeautify) -> basicText.replace('a', 'X'));
        poemBeautifier.beautify("basic text to Beautify", "OMGOMG", (basicText, textToBeautify) -> basicText.replace('a', 'X').toUpperCase());
        poemBeautifier.beautify("basic text to Beautify", "OMGOMG", (basicText, textToBeautify) -> basicText.replace('a', 'X').replace('x', 'y').toUpperCase());
    }
}
