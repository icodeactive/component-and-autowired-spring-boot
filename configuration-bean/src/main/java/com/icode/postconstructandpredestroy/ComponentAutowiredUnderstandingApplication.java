package com.icode.postconstructandpredestroy;

import com.icode.postconstructandpredestroy.understanding.DatabaseConnector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComponentAutowiredUnderstandingApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ComponentAutowiredUnderstandingApplication.class, args);

        DatabaseConnector mysql = (DatabaseConnector) context.getBean("mysqlConnector");
        mysql.connect();

        DatabaseConnector mongodb = (DatabaseConnector) context.getBean("mongodbConnector");
        mongodb.connect();

        DatabaseConnector postgresql = (DatabaseConnector) context.getBean("postgresqlConnector");
        postgresql.connect();
    }

}
