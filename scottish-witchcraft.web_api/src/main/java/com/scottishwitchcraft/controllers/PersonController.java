package com.scottishwitchcraft.controllers;

import com.scottishwitchcraft.models.Person;
import com.scottishwitchcraft.dao.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/api")
public class PersonController{
    @Autowired
    private IPersonRepository personRepo;

    @GetMapping(path="/person")
    public @ResponseBody Iterable<Person> getAll() {
        return personRepo.findAll();
    }

    @GetMapping(path="/person/{id}")
    public @ResponseBody
    Optional<Person> getById(@PathVariable("id") String id) {
        return personRepo.findById(id);
    }
}
