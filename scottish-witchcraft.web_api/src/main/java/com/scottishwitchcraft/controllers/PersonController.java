package com.scottishwitchcraft.controllers;

import com.scottishwitchcraft.models.Person;
import com.scottishwitchcraft.dao.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo")
public class PersonController{
    @Autowired
    private IPersonRepository personRepo;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Person> getAll() {
        return personRepo.findAll();
    }
}
