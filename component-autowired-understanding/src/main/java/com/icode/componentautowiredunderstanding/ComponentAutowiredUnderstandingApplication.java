package com.icode.componentautowiredunderstanding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComponentAutowiredUnderstandingApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ComponentAutowiredUnderstandingApplication.class, args);
        //Application Context la noi chua toan bo dependency trong project
        ApplicationContext context = SpringApplication.run(ComponentAutowiredUnderstandingApplication.class, args);
        
    }

}
