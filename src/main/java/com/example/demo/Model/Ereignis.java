package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ereignis {
   private int id;
    private int tributId;
   private EventTyp type;
  private int points;
   private int day;
   public Ereignis(){}
    public Ereignis(int id, int tributId, EventTyp typ, int points, int day) {
        this.id = id;
        this.tributId = tributId;
        this.type = typ;
        this.points = points;
        this.day = day;
    }

    public int getId() {
        return id;
    }

    public int getTributId() {
        return tributId;
    }

    public EventTyp getTyp() {
        return type;
    }

    public int getPoints() {
        return points;
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

    public void setTyp(EventTyp typ) {
        this.type = typ;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
