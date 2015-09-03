package org.sergio.jtaSpringProject.services;

import java.util.List;

import org.apache.log4j.Logger;
import org.sergio.jtaSpringProject.entities.Client;
import org.sergio.jtaSpringProject.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

	private static final Logger logger = Logger.getLogger(ClientService.class);
	
	@Autowired
	private ClientRepository clientRepository;
	
	public ClientService(){
		super();
	}
	
	@Transactional
	public List<Client> getClients(){
		if(logger.isTraceEnabled()){
			logger.trace("getTransfers()");
		}
		return (List<Client>) this.clientRepository.findAll();
	}
	
	@Transactional
	public Client getClient(int id){
		if(logger.isTraceEnabled()){
			logger.trace("getClient()");
		}
		return this.clientRepository.findOne(id);
	}
	
	@Transactional
	public void saveClient(Client client){
		if(logger.isTraceEnabled()){
			logger.trace("saveClient()");
		}
		this.clientRepository.save(client);
		
		if(logger.isDebugEnabled()){
			logger.debug("Save Client");
		}
	}
	
	@Transactional
	public void deleteClient(Client client){
		if(logger.isTraceEnabled()){
			logger.trace("deleteClient()");
		}
		this.clientRepository.delete(client);
		if(logger.isDebugEnabled()){
			logger.debug("Client Transfer");
		}
	}
	
	@Transactional
	public void deleteClientById(int id){
		if(logger.isTraceEnabled()){
			logger.trace("deleteClientById()");
		}
		this.clientRepository.delete(id);
		if(logger.isDebugEnabled()){
			logger.debug("Client Transfer");
		}
	}
	
}
