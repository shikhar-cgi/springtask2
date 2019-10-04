package com.stackroute.domain;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration


public class MovieConfig {
    @Bean
    public Actor shahrukh() {
        Actor m = new Actor();
        m.setAge(53);
        m.setName("Shahrukh khan");
        m.setGender("Male");
        return m;

    }

    @Bean({"movie1","movie2"})
    @Scope(value = "prototype")
    public Movie movie1() {
        return new Movie();
    }
}
