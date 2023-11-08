package com.aws.test_deployment_aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestDeploymentAwsApplication {

    @GetMapping("/")
    public String home() {
        if (userEmail == null) {
            //tra ra loi
        }
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestDeploymentAwsApplication.class, args);
    }



}
