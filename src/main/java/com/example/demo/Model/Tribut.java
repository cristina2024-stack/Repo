package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Tribut {
    private int id;
    private String name;
    private Status status;
    private int skillLevel;
    int district;
    public Tribut(){}
    public Tribut(int id, String name, Status status, int skillLevel) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.skillLevel = skillLevel;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }
    public String toString(){return id + "|" + name + "|" + status + "|" + skillLevel + "|" + district;}
}
