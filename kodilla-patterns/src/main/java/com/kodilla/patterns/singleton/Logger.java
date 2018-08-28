package com.kodilla.patterns.singleton;

import sun.rmi.runtime.Log;

public class Logger {
    private static Logger logger = null;
    private static String lastLog = "";

    private Logger() {
    }


    public static Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }

        }
        return logger;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}

