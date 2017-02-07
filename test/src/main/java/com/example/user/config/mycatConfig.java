package com.example.user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Administrator on 2017/1/20.
 */
@EnableJpaRepositories(basePackages = "com.example.user.dao", enableDefaultTransactions = false)
@Configuration
public class mycatConfig {
}

