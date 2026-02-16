package com.example.demo.Repository;

import com.example.demo.Model.Ereignis;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class EreignisRepository {
    public static List<Ereignis> load(String filename)throws Exception{
        ObjectMapper obj = new ObjectMapper();
        return List.of(obj.readValue(new File(filename),Ereignis[].class));
    }
}
