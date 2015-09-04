package org.sergio.jtaSpringProject.repositories;

import org.sergio.jtaSpringProject.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//@Repository
//@Transactional
public interface ClientRepository extends JpaRepository<Client, Integer> {
	
}
