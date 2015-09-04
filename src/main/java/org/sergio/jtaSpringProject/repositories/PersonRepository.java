package org.sergio.jtaSpringProject.repositories;

import org.sergio.jtaSpringProject.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
