package com.yfy.becik.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * Class used to run the web module of the BMS.
 * Allows access to the web interface.
 * */
@SpringBootApplication
public class WebMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(WebMain.class);
    }
}
