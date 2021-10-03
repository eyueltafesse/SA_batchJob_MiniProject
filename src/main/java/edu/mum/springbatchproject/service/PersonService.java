package edu.mum.springbatchproject.service;

import edu.mum.springbatchproject.domain.Person;

import java.util.List;
import java.util.Set;

public interface PersonService {

    Set<String> findPersonByFirstname(String name);
    Set<String> findPersonById(int id);
     Set<String> findUniquePersons();

}
