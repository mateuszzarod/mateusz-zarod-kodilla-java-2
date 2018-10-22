package com.kodilla.stream.lambda;

import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("this is example lambda text"));


        //by lambda (interface with single method)
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5, (a, b) -> (a + b));
        expressionExecutor.executeExpression(10, 5, (a, b) -> (a - b));
        expressionExecutor.executeExpression(10, 5, (a, b) -> (a * b));
        expressionExecutor.executeExpression(10, 5, (a, b) -> (a / b));

        //by reference
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::divideAByB);
    }
}
