package com.stackroute.domain;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration


public class MovieConfig {
    @Bean
    public Actor shahrukh() {
        Actor m = new Actor("Shahrukh", "Male", 50);

        return m;

    }

    @Bean
    public Actor amir() {
        Actor m = new Actor("Amir", "Male", 55);

        return m;

    }

    @Bean
    public Actor salman() {
        Actor m = new Actor("Salman", "Male", 53);

        return m;

    }

    @Bean({"movie1","movie2"})
    @Scope(value = "prototype")
    public Movie movie1() {
        Movie n = new Movie(shahrukh(), amir(), salman());
        return n;
    }
}
