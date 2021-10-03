package edu.mum.springbatchproject.configuration;

import edu.mum.springbatchproject.domain.Person;

import edu.mum.springbatchproject.repository.PersonRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DbWriter implements ItemWriter<Person> {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void write(List<? extends Person> users) throws Exception{
        personRepository.saveAll ( users );

    }
}
