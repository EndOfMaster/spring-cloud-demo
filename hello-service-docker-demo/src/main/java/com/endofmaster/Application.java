package com.endofmaster;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.boot.SpringApplication.run;

/**
 * @author ZM.Wang
 */
@RestController
@EnableEurekaClient
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        run(Application.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

}
