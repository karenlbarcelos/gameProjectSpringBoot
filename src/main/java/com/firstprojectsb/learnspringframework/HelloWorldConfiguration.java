package com.firstprojectsb.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    //beans eh o nome do que sera configurado pelo spring
    @Bean
    public String name(){
        return "Karen";
    }

}
