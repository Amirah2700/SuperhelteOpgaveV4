package com.example.superheltev4amir.dto;

import java.util.List;

public class Superheltby {
    private String byNavn;
    private List<String> superheltliste;

    public Superheltby(String byNavn, List<String> superheltliste) {
        this.byNavn = byNavn;
        this.superheltliste = superheltliste;

    }
    public String getByNavn(){
        return byNavn;
    }

    public List<String> getSuperheltliste() {
        return superheltliste;
    }
}
