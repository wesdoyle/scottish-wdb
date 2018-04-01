package com.scottishwitchcraft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.scottishwitchcraft.dao")
@ComponentScan("com.scottishwitchcraft.controllers")
@EntityScan("com.scottishwitchcraft.models")
public class WebApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApiApplication.class, args);
    }
}
