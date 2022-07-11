package com.pokeya.tanggu.infrastructure.config;

import com.github.pagehelper.PageInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author mac
 */
@Configuration
public class MybatisConfig {

    @Bean
    public PageInterceptor sqlSessionFactoryBean() {
        return new PageInterceptor();
    }
}
