package com.aurora.logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author :PHQ
 * @date：2021/2/4
 **/
@EnableDiscoveryClient
@RefreshScope
@SpringBootApplication
public class NacosLoggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosLoggerApplication.class, args);
        System.out.println("NacosLogger模块启动成功!");
    }


}
