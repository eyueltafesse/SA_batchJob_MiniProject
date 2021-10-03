package edu.mum.springbatchproject.service.Imp;

import edu.mum.springbatchproject.domain.Person;
import edu.mum.springbatchproject.repository.PersonRepository;
import edu.mum.springbatchproject.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PersonServiceImp implements PersonService {

    @Autowired
    public PersonRepository personRepository;


    @Override
    public Set<String> findPersonByFirstname(String name) {
        return personRepository.findPersonByFirstname ( name );
    }

    @Override
    public Set<String> findPersonById(int id) {
        return personRepository.findPersonById ( id );
    }

    @Override
    public Set<String> findUniquePersons(){
        List<Person> persons = personRepository.findAll();
        return persons.stream().map(p -> p.getFirstname ()).collect( Collectors.toSet());
    }
}
