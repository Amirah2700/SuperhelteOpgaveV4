package com.example.superheltev4amir.dto;

import java.util.List;

public class SuperheltKraft {
    private String heltenavn;

    private String rigtigeNavn;

    private List<String> superKræfter;

    public String getHeltenavn() {
        return heltenavn;
    }

    public String getRigtigeNavn() {
        return rigtigeNavn;
    }

    public List<String> getSuperKræfter() {
        return superKræfter;
    }

    public SuperheltKraft(String heltenavn, String rigtigeNavn, List<String> superKræfter){
        this.heltenavn = heltenavn;
        this.rigtigeNavn = rigtigeNavn;
        this.superKræfter = superKræfter;
    }

}
