package com.icode.postconstructandpredestroy;

import com.icode.postconstructandpredestroy.understanding.DatabaseConnector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComponentAutowiredUnderstandingApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ComponentAutowiredUnderstandingApplication.class, args);

        DatabaseConnector databaseConnector = context.getBean(DatabaseConnector.class);
        databaseConnector.connect();
    }

}
