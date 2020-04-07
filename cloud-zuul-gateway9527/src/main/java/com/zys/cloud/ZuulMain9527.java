package com.zys.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulMain9527.class, args);
    }
}
