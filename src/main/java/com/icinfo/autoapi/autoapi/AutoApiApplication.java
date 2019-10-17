package com.icinfo.autoapi.autoapi;

import com.icinfo.autoapi.autoapi.utils.SpringApplicationHolder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AutoApiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(AutoApiApplication.class, args);
        SpringApplicationHolder.setApplicationContext(run);
    }

}
