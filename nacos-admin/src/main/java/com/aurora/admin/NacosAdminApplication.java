package com.aurora.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@EnableDiscoveryClient
@SpringBootApplication
@RefreshScope
public class NacosAdminApplication {

        public static void main(String[] args) {
            SpringApplication.run(NacosAdminApplication.class, args);
            System.out.println("NacosAdmin模块启动成功!");
        }
}
