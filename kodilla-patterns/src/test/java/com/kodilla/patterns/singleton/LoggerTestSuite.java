package com.kodilla.patterns.singleton;


import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeClass
    public static void log() {
        Logger.getInstance().log("First log");
    }

    @Test
        public void testGetLastLog () {
            //Given
            //When
            String result = Logger.getInstance().getLastLog();
            //Then
            Assert.assertEquals("First log", result);
        }
    }


