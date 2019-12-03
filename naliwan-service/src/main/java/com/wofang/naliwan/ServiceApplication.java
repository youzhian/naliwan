package com.wofang.naliwan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 项目启动入口
 *
 * @author youzhian
 */
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.wofang.naliwan.service"})
@SpringBootApplication
public class ServiceApplication {
    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(ServiceApplication.class);
    /**
     * 程序入口
     *
     * @param args
     */
    public static void main(String[] args) {

        SpringApplication.run(ServiceApplication.class, args);
        logger.info("=============serviceApplication启动成功=============");
    }
}
