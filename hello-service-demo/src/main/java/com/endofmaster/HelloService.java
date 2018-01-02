package com.endofmaster;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

/**
 * @author ZM.Wang
 */
@Service
public class HelloService {
    private final static Logger logger = LoggerFactory.getLogger(HelloService.class);

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hello() throws InterruptedException {
        long sleepTime = new Random().nextInt(2000);
        logger.info("sleepTime:" + sleepTime);
        Thread.sleep(sleepTime);
        return "Hello World";
    }

    private String helloFallback() {
        return "error";
    }
}
