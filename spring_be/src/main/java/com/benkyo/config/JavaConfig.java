package com.benkyo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    ModelMapper modelMappaer() {
		return new ModelMapper();
	}


}
