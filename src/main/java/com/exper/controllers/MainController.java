package com.exper.controllers;

import com.exper.models.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {


    @RequestMapping(value = "/persons",
            produces = "application/json; charset=UTF-8",
            method = RequestMethod.GET)
    public @ResponseBody Person getAllPersons() {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 26, "BBC"));
        persons.add(new Person("Mike", 31, "CNN"));
        persons.add(new Person("Bred", 23, "Starbucks"));
        return new Person("Bred", 23, "Starbucks");
    }

    @RequestMapping(value = "/name")
    public @ResponseBody String getName() {
        return "Alex";
    }

    @RequestMapping(value = "main/id")
    public String mainRequest(@PathVariable("id") int id) {
        return "Hello world";
    }
}
