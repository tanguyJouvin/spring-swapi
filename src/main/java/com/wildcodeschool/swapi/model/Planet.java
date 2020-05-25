package com.wildcodeschool.swapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Planet {

    // TODO : add attributes
    private String name;
    private String inhabitant;

    // TODO : add an empty constructor
    public Planet() {
    }

    // TODO : add getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInhabitant(){
        return inhabitant;
    }

    public void setInhabitant(String inhabitant){
        this.inhabitant = inhabitant;
    }
}
