package moles.project.base.repositories.specifications;


import moles.project.base.entities.Person;
import org.springframework.data.jpa.domain.Specification;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class PersonSpecification  {
    public static Specification<Person> customerHasBirthday(String name) {
        return new Specification<Person>() {
            @Override
            public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.like(root.get("name"),"%"+name+"%");
            }
        };
    }
}
