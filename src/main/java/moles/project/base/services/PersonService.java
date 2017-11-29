package moles.project.base.services;

import moles.project.base.entities.Person;
import moles.project.base.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    /**
     *
     * @return people list
     */
    public List<Person> getAll() {
        List<Person> result = new LinkedList<>();
        Iterable<Person> all = personRepository.findAll();
        all.forEach(result::add);
        return result;
    }
}
