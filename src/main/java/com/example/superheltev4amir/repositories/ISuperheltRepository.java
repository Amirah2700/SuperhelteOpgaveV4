package com.example.superheltev4amir.repositories;

import com.example.superheltev4amir.dto.SuperheltKraft;
import com.example.superheltev4amir.dto.SuperheltKraftTæller;
import com.example.superheltev4amir.dto.Superheltby;
import com.example.superheltev4amir.model.Superhelt;

import java.util.List;

public interface ISuperheltRepository {

    default List<Superhelt> getSuperheltAlt() {
        return null;
    }

    default Superhelt getSuperhelt(String navn) {
        return null;
    }

    default List<SuperheltKraftTæller> getSuperheltKraftTæller(String navn) {
        return null;
    }

    default List<SuperheltKraft> getSuperheltKraft() {
        return null;
    }

    default List<SuperheltKraft> getSuperheltKraft(String navn) {
        return null;
    }

    default List<Superheltby> getSuperheltBy() {
        return null;
    }
}