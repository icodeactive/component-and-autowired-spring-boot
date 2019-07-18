package com.icode.componentservicerepository;

import com.icode.componentservicerepository.understanding.GIrlService;
import com.icode.componentservicerepository.understanding.Girl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ComponentAutowiredUnderstandingApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ComponentAutowiredUnderstandingApplication.class, args);

        // Lấy ra bean GirlService
        GIrlService girlService = context.getBean(GIrlService.class);
        // Lấu ra random một cô gái từ tầng service
        Girl girl = girlService.getRandomGirl();
        // In ra màn hình
        System.out.println(girl);

    }

}
