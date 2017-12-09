package moles.project.base.services;

import moles.project.base.entities.Person;
import moles.project.base.repositories.PersonRepository;
import moles.project.base.repositories.specifications.PersonSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
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

    /**
     *
     * @param name name
     * @return search person
     */
    public List<Person> searchByName(String name){
        String nameToQuery="%"+name+"%";
        return personRepository.findByNameLike(nameToQuery);
    }

    /**
     *
     * @param name name
     * @return search person
     */
    public List<Person> searchByNameSpec(String name){
        Specification<Person> personSpecification = PersonSpecification.customerHasBirthday(name);
        return personRepository.findAll(personSpecification);
    }
}
