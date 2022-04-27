package com.roger.demospringbootstarter.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 骆佳俊
 * @date: 2022/4/27 10:21 AM
 */
@Configuration
public class DemoConfig {
  private static final Logger logger = LoggerFactory.getLogger(DemoConfig.class);
  @Bean
  public void demoService() {
    logger.info("我是自动装配进来的");
  }
}
