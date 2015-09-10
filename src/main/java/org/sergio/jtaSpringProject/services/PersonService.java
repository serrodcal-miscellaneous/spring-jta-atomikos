package org.sergio.jtaSpringProject.services;

import org.apache.log4j.Logger;
import org.sergio.jtaSpringProject.entities.Person;
import org.sergio.jtaSpringProject.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

	private static final Logger logger = Logger.getLogger(PersonService.class);
	
	@Autowired
	private PersonRepository personRepository;
	
	public PersonService() {
		super();
		if(logger.isTraceEnabled()) {
			logger.trace("PersonService()");
		}
	}
	
	@Transactional
	public void save(Person person) {
		if(logger.isTraceEnabled()) {
			logger.trace("save(Person person)");
		}
		this.personRepository.save(person);
	}
	
	@Transactional
	public Person findOneById(Long id) {
		if(logger.isTraceEnabled()) {
			logger.trace("findOneById(Long id)");
		}
		return this.personRepository.findOne(id);
	}
	
}
