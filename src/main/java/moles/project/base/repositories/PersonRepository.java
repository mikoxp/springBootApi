package moles.project.base.repositories;

import moles.project.base.entities.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends PagingAndSortingRepository <Person, Integer>{

}
