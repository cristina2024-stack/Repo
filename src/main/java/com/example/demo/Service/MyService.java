package com.example.demo.Service;

import com.example.demo.Model.Ereignis;
import com.example.demo.Model.EventTyp;
import com.example.demo.Model.Status;
import com.example.demo.Model.Tribut;

import java.io.File;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyService {
    public List<Tribut>filterByDistrict(List<Tribut> tribut,int district){
       return tribut.stream().filter(t->t.getDistrict() ==district && t.getStatus() == Status.ALIVE).collect(Collectors.toList());
    }
    public List<Tribut> sortByskillLevel(List<Tribut> tribut){
        return tribut.stream().sorted(Comparator.comparing(Tribut::getSkillLevel).reversed().thenComparing(Tribut::getName)).collect(Collectors.toList());
    }
    public void saveToFile(List<Tribut> tribut){
        try(PrintWriter out = new PrintWriter("sorted_tributes.txt")){
            for(Tribut t : tribut){
                out.println(t.toString());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public int calculateScore(Ereignis e){
        return switch( e.getTyp()){
            case FOUND_SUPPLIES->e.getPoints() + 2 * e.getDay();
            case INJURED -> e.getPoints() - e.getDay();
            case ATTACK->e.getPoints() * 2 + e.getDay();
            case HELPED_ALLY->e.getPoints() + 5;
            case SPONSORED->e.getPoints() + 10;

        };
    }
}
