package com.example.superheltev4amir.dto;

public class SuperheltKraftTæller {
    private String rigtigeNavn;
    private String helteNavn;
    private int superKræfter;


    public SuperheltKraftTæller(String rigtigeNavn, String helteNavn, int superKræfter) {
        this.rigtigeNavn = rigtigeNavn;
        this.helteNavn = helteNavn;
        this.superKræfter = superKræfter;
    }
    public String getRigtigeNavn() {
        return rigtigeNavn;
    }

    public String getHelteNavn() {
        return helteNavn;
    }

    public int getSuperKræfter() {
        return superKræfter;
    }

}
