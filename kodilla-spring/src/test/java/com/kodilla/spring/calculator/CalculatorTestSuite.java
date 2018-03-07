package com.kodilla.spring.calculator;


import com.kodilla.spring.forum.ForumUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite{
 @Test
    public void calculatorTestSuite(){
     //Given
     ApplicationContext context =
             new AnnotationConfigApplicationContext("com.kodilla.spring");
     Calculator calculator = context.getBean(Calculator.class);

     //When
     double testAdd = calculator.add(2.0,2.0);
     double testSub = calculator.subtract(10.0,5.0);
     double testMul = calculator.multiply(3.0,3.0);
     double testDiv = calculator.divide(9.0,3.0);

     //Then
     Assert.assertEquals(4, testAdd, 1);
     Assert.assertEquals(5, testSub, 1);
     Assert.assertEquals(9, testMul, 1);
     Assert.assertEquals(3, testDiv, 1);
     }

 }

