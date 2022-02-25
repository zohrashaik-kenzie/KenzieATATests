package com.kenzie.examples.modifiers;
import com.kenzie.examples.logging.AccessAgain;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AccessDemo {
    private static final Logger logger = LogManager.getLogger(AccessDemo.class);

    public static void main(String[] args){

        Access access = new Access("I am private","I am public", "I am protected");
        logger.info(access.prot);
        logger.info(access.pub);
        logger.info(access.getPvt());
//        logger.info(access.getPvt());
//        AccessAgain accessAgain = new AccessAgain("Again! I am private","Again! I am public", "Again! I am protected");
//        logger.info(accessAgain.pub);

    }
}
