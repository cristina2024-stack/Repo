package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SponsorGeschenk {
    private int id;
   private int tributId;
   private String itemName;
  private int value;
   private int day;
    public SponsorGeschenk(){}
    public SponsorGeschenk(int id, int tributId, String itemName, int value, int day) {
        this.id = id;
        this.tributId = tributId;
        this.itemName = itemName;
        this.value = value;
        this.day = day;
    }

    public int getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public int getTributId() {
        return tributId;
    }

    public int getValue() {
        return value;
    }

    public int getDay() {
        return day;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTributId(int tributId) {
        this.tributId = tributId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
