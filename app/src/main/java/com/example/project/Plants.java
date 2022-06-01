package com.example.project;

public class Plants {

    Integer ID;
    String name;
    String location;
    Integer cost;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Plants(Integer ID,String name, String location, Integer cost){
        this.ID = ID;
        this.name = name;
        this.location = location;
        this.cost = cost;

    }
}
