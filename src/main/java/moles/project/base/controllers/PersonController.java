package moles.project.base.controllers;

import moles.project.base.entities.Person;
import moles.project.base.services.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author michal.oles
 */
@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private PersonService personService;
    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

    /**
     *
     * @return all people
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Person> getAll(){
        logger.info("Get all people");
        return personService.getAll();
    }

    /**
     *
     * @param name name
     * @return search people
     */
    @RequestMapping(value = "/search/name/{name}", method = RequestMethod.GET)
    public List<Person> searchByName(@PathVariable String name){
        logger.info("Search people: "+name);
        return personService.searchByName(name);
    }

    /**
     *
     * @param name name
     * @return search people
     */
    @RequestMapping(value = "/search/spec/name/{name}", method = RequestMethod.GET)
    public List<Person> searchByNameSpec(@PathVariable String name){
        logger.info("Search people: "+name);
        return personService.searchByNameSpec(name);
    }



}
