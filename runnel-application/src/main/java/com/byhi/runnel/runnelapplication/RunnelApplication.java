package com.byhi.runnel.runnelapplication;

import com.byhi.runnel.runnelapplication.config.ConfigProperties;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties.class)
public class RunnelApplication {

    public static void main(String[] args) {
        SpringApplication.run(RunnelApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
