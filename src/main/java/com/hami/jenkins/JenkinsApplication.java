package com.hami.jenkins;

import jakarta.annotation.PostConstruct;
import org.apache.juli.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.*;

@SpringBootApplication
public class JenkinsApplication {

    public static Logger logger = (Logger) LogFactory.getLog(JenkinsApplication.class);

    @PostConstruct
    public void init() {
        System.out.println("Welcome to Jenkins");
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsApplication.class, args);
    }

}
