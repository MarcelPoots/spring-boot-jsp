package com.rossie.springjsp.model;

public class Country {

    public Country(String name, long population) {
        this.name = name;
        this.population = population;
    }

    private String name;
    private long population;

    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }


}
