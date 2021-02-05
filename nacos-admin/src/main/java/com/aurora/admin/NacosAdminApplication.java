package com.aurora.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class NacosAdminApplication {

        public static void main(String[] args) {
            SpringApplication.run(NacosAdminApplication.class, args);
            System.out.println("NacosAdmin模块启动成功!");
        }
}
