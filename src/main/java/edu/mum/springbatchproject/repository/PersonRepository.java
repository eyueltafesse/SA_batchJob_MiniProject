package edu.mum.springbatchproject.repository;

import edu.mum.springbatchproject.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Set;


public interface PersonRepository extends JpaRepository<Person , Integer> {

    Set<String> findPersonByFirstname(String name);
    Set<String> findPersonById(int id);
    List<Person> findAll();
}
