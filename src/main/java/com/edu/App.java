package com.edu;

import com.edu.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

/**
 * Created by wuxiaolong on 2017/2/27.
 */
//@EntityScan(value="com.edu.boot.jpa.entity")
//@EnableJpaRepositories(basePackages="com.edu.boot.jpa.repository")
//@EnableSpringDataWebSupport
//@SpringBootApplication(scanBasePackages="com.edu.boot.jpa.controller")
@SpringBootApplication
public class App {
    public static void main(String[] args){
        ConfigurableApplicationContext context = SpringApplication.run(App.class);
        UserRepository ur = context.getBean(UserRepository.class);
        //context.close();
    }
}
