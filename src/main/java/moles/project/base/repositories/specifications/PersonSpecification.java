package moles.project.base.repositories.specifications;


import moles.project.base.entities.Person;
import org.springframework.data.jpa.domain.Specification;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class PersonSpecification  implements Specification<Person>{
    private String  name;

    public PersonSpecification(String name) {
        this.name = name;
    }

    @Override
    public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        return criteriaBuilder.like(root.get("name"),"%"+name+"%");
    }
}
