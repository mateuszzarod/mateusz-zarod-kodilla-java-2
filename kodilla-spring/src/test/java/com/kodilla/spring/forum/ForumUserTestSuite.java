package com.kodilla.spring.forum;


import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumUserTestSuite {
    @Test
    public void SpringRunnerTestSuite(){
    //Given
    ApplicationContext context =
            new AnnotationConfigApplicationContext("com.kodilla.spring");
    ForumUser forumUser = context.getBean(ForumUser.class);
    //When
    String user = forumUser.getUsername();
    //Then
    Assert.assertEquals("John Smith", forumUser.getUsername());
    }
}


/*  Napisz test testGetUsername()
  pobierający z kontekstu aplikacji
  uchwyt do Beana klasy ForumUser.
  Test powinien pobierać username i
  sprawdzać przy pomocy asercji czy
  zwróconą wartością jest "John Smith".*/