package com.wofang.naliwan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 游志安
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class ClientApplication {
    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(ClientApplication.class);

    public static void main(String[]args){

        SpringApplication.run(ClientApplication.class,args);

        logger.info("=================【naliwan-client】启动成功================");
    }
}
