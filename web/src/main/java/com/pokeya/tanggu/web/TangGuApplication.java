package com.pokeya.tanggu.web;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: huangjl
 * @date: 2022/4/11
 */
@EnableDubbo
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.pokeya.tanggu.infrastructure")
@ComponentScan({"com.pokeya.tanggu", "com.pokeya.yao"})
public class TangGuApplication {

    public static void main(String[] args) {
        SpringApplication.run(TangGuApplication.class, args);
    }
}
