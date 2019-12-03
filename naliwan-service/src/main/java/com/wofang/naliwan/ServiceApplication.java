package com.wofang.naliwan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目启动入口
 * @author youzhian
 */
//@EnableDiscoveryClient
//@EnableFeignClients(basePackages = {"com.wofang.naliwan.service"})
@SpringBootApplication
public class ServiceApplication {
    /**
     * 程序入口
     * @param args
     */
    public static void main(String [] args){
        SpringApplication.run(ServiceApplication.class,args);
    }
}
