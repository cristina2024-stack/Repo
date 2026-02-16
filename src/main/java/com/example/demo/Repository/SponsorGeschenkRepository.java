package com.example.demo.Repository;

import com.example.demo.Model.Ereignis;
import com.example.demo.Model.SponsorGeschenk;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class SponsorGeschenkRepository {
    public static List<SponsorGeschenk> load(String filename)throws Exception{
        ObjectMapper obj = new ObjectMapper();
        return List.of(obj.readValue(new File(filename),SponsorGeschenk[].class));
    }
}
