package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.factory.annotation.Autowired;

public class Movie {

    private Actor actor1;

    public Actor getActor1() {
        return actor1;
    }
     @Autowired
    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }
}

