package com.example.demo.Repository;

import com.example.demo.Model.SponsorGeschenk;
import com.example.demo.Model.Tribut;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class TribuRepository {
    public static List<Tribut> load(String filename)throws Exception{
        ObjectMapper obj = new ObjectMapper();
        return List.of(obj.readValue(new File(filename),Tribut[].class));
    }
}
