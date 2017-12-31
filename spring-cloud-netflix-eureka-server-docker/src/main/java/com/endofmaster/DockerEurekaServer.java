package com.endofmaster;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ZM.Wang
 */
@EnableEurekaServer
@SpringBootApplication
public class DockerEurekaServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DockerEurekaServer.class).web(true).run(args);
    }

}
