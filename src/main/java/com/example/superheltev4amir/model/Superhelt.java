package com.example.superheltev4amir.model;

public class Superhelt {
    private int id;
    private String name;
    private String alias;
    private int år;

    public Superhelt(int id, String name, String alias, int år) {
        this.id = id;
        this.name = name;
        this.alias = alias;
        this.år = år;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    public int getÅr() {
        return år;
    }
}
