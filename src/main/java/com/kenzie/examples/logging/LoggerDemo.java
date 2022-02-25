package com.kenzie.examples.logging;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerDemo {

    private static final Logger logger = LogManager.getLogger(LoggerDemo.class);
    public static void main(String[] args) {
        try {
            logger.info("This is a demo of log4j logging. I am in main method.");
            int x = 4/0;
         }
        catch(Exception e){
            logger.error(e.getMessage());
        }
    }
}

