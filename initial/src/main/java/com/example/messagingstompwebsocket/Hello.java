package com.example.messagingstompwebsocket;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Hello {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @JsonCreator
    public Hello(@JsonProperty("name") String name) {
        this.name = name;
    }
}
