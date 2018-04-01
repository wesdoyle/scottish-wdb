package com.scottishwitchcraft.webapi.controllers;

import com.scottishwitchcraft.webapi.data.IPersonRepository;
import com.scottishwitchcraft.webapi.data.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/api")
public class MainController {
    private final IPersonRepository personRepo;

    @Autowired
    public MainController(IPersonRepository personRepo) {
        this.personRepo = personRepo;
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Person> getAllPersons(){
        return personRepo.findAll();
    }
}
