package com.example.demo;

import com.example.demo.Model.Ereignis;
import com.example.demo.Model.SponsorGeschenk;
import com.example.demo.Model.Tribut;
import com.example.demo.Repository.EreignisRepository;
import com.example.demo.Repository.SponsorGeschenkRepository;
import com.example.demo.Repository.TribuRepository;
import com.example.demo.Service.MyService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<Tribut> tributes = TribuRepository.load("C:\\Users\\Dell\\Desktop\\Examen Practic MAP\\demo3\\src\\main\\java\\com\\example\\demo\\tributes.json");
            List<Ereignis> ereignisse = EreignisRepository.load("C:\\Users\\Dell\\Desktop\\Examen Practic MAP\\demo3\\src\\main\\java\\com\\example\\demo\\events.json");
            List<SponsorGeschenk> sponsorgeschenke = SponsorGeschenkRepository.load("C:\\Users\\Dell\\Desktop\\Examen Practic MAP\\demo3\\src\\main\\java\\com\\example\\demo\\gifts.json");
           System.out.println(tributes.size());
            System.out.println(sponsorgeschenke.size());

            System.out.println(ereignisse.size());
            MyService service = new MyService();
            System.out.println("Cerinta 3");
            List<Tribut> t = service.sortByskillLevel(tributes);
            List<Tribut>t2 = service.filterByDistrict(tributes,3);
            t.forEach(System.out::println);
            System.out.println("Cerinta 2");
            t2.forEach(System.out::println);
            service.saveToFile(t);
            ereignisse.stream().map(e -> "Event " + "< " + e.getId() + ">" + " raw <" + e.getPoints() + "> computed <" + service.calculateScore(e) + ">").forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
