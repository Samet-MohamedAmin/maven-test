package com.demo.app;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class App {
    
    private static final Logger logger = LogManager.getLogger("HelloWorld");

    static void testMethod(int a, int b){
        logger.info("This is working %d",  a*b);
    }
    public static void main(String[] args) {
        testMethod(1, 3);
    }
}
