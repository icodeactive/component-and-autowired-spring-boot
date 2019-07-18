package com.icode.componentautowiredunderstanding;

import com.icode.componentautowiredunderstanding.understanding.Girl;
import com.icode.componentautowiredunderstanding.understanding.Outfit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComponentAutowiredUnderstandingApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ComponentAutowiredUnderstandingApplication.class, args);
        //Application Context la noi chua toan bo dependency trong project
        ApplicationContext context = SpringApplication.run(ComponentAutowiredUnderstandingApplication.class, args);

        Outfit outfit  = context.getBean(Outfit.class);

        System.out.println("Instance:" + outfit);

        outfit.wear();

        Girl girl = context.getBean(Girl.class);

        System.out.println("Girl Instance: " + girl);

        
    }

}
