package org.sergio.jtaSpringProject.services;

import org.sergio.jtaSpringProject.entities.Person;
import org.sergio.jtaSpringProject.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public PersonService(){
		super();
	}
	
	public void save(Person person){
		this.personRepository.saveAndFlush(person);
	}
	
	public Person findOneById(int id){
		return this.personRepository.getOne(id);
	}
	
}
