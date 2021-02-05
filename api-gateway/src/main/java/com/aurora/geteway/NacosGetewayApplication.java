package com.aurora.geteway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 *  网关服务
 * @author :PHQ
 * @date：2021/2/5
 **/
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class NacosGetewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosGetewayApplication.class, args);
        System.out.println("NacosAdmin模块启动成功!");
    }
}