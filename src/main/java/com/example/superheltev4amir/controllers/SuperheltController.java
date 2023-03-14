package com.example.superheltev4amir.controllers;

import com.example.superheltev4amir.dto.SuperheltKraft;
import com.example.superheltev4amir.dto.SuperheltKraftTæller;
import com.example.superheltev4amir.dto.Superheltby;
import com.example.superheltev4amir.model.Superhelt;
import com.example.superheltev4amir.repositories.ISuperheltRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("superhelt")

public class SuperheltController {

    ISuperheltRepository superheltRepository;
    public SuperheltController(ApplicationContext context, @Value("${superhelt.repository.impl}") String impl) {
        superheltRepository = (ISuperheltRepository) context.getBean(impl);
    }

@GetMapping(path = "/all")
    public ResponseEntity<List<Superhelt>> alleSuperhelte(){
        List<Superhelt> superhelte = superheltRepository.getSuperheltAlt();
        return new ResponseEntity<>(superhelte, HttpStatus.OK);

}
    @GetMapping(path = "/{navn}")
    public ResponseEntity<Superhelt> getSuperhelt(@PathVariable String navn){
        Superhelt superhelt = superheltRepository.getSuperhelt(navn);
        return new ResponseEntity<>(superhelt, HttpStatus.OK);
    }
    @GetMapping(path = "/superpower/count")
    public ResponseEntity<List<SuperheltKraftTæller>> getSuperheltKraftTæller(){
        List<SuperheltKraftTæller> superheltKraftTællers = superheltRepository.getSuperheltKraftTæller();
        return new ResponseEntity<>(superheltKraftTællers, HttpStatus.OK);
    }

    @GetMapping(path = "/superpower/count/{name}")
    public ResponseEntity<List<SuperheltKraftTæller>> getSuperheltKraftTæller(@PathVariable String navn){
        List<SuperheltKraftTæller> superheltKraftTællers = superheltRepository.getSuperheltKraftTæller(navn);
        return new ResponseEntity<>(superheltKraftTællers, HttpStatus.OK);
    }

    @GetMapping(path = "/superpower")
    public ResponseEntity<List<SuperheltKraft>> getSuperheltKraftAlt(){
        List<SuperheltKraft> superheltKrafter = superheltRepository.getSuperheltKraft();
        return new ResponseEntity<>(superheltKrafter, HttpStatus.OK);
    }

    @GetMapping(path = "/superpower/{name}")
    public ResponseEntity<List<SuperheltKraft>> getSuperheltKraft(@PathVariable String navn){
        List<SuperheltKraft> superheltKrafter = superheltRepository.getSuperheltKraft(navn);
        return new ResponseEntity<>(superheltKrafter, HttpStatus.OK);
    }

    @GetMapping(path = "/city")
    public ResponseEntity<List<SuperheltBy>> getSuperheltBy(){
        List<Superheltby> cities = superheltRepository.getSuperheltBy();
        return new ResponseEntity<>(byer, HttpStatus.OK);
    }

}

