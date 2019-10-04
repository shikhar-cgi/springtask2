package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieConfig {
    @Bean
    public Actor shahrukh()
    {
        Actor m=new Actor();
        m.setName("Shahrukh");
        m.setAge(60);
        m.setGender("Male");
        return m;

    }
    @Bean
   public Movie movie1()
    {
        Movie n=new Movie();
        n.setShahrukh(shahrukh());
        return n;
    }
}
