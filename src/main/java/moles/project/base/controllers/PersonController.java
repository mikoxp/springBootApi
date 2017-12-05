package moles.project.base.controllers;

import moles.project.base.entities.Person;
import moles.project.base.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    public String test() {
        return "Test";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Person> getAll(){
        return personService.getAll();
    }

    @RequestMapping(value = "/search/name/{name}", method = RequestMethod.GET)
    public List<Person> searchByName(@PathVariable String name){
        return personService.searchByName(name);
    }
    @RequestMapping(value = "/search/spec/name/{name}", method = RequestMethod.GET)
    public List<Person> searchByNameSpecyfication(@PathVariable String name){
        return personService.searchByNameSpec(name);
    }



}
