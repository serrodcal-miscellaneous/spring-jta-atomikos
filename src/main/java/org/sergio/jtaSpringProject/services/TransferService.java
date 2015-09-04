package org.sergio.jtaSpringProject.services;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.sergio.jtaSpringProject.entities.Client;
import org.sergio.jtaSpringProject.entities.Transfer;
import org.sergio.jtaSpringProject.repositories.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransferService {

	private static final Logger logger = Logger.getLogger(TransferService.class);
	
	@Autowired
	private TransferRepository transferRepository;
	
	public TransferService(){
		super();
	}
	
	@Transactional
	public List<Transfer> getTransfers(){
		if(logger.isTraceEnabled()){
			logger.trace("getTransfers()");
		}
		return (List<Transfer>) this.transferRepository.findAll();
	}
	
	@Transactional
	public Transfer getTransfer(int id){
		if(logger.isTraceEnabled()){
			logger.trace("getTransfer()");
		}
		return this.transferRepository.getOne((long) id);
	}
	
	@Transactional
	public void saveTransfer(Transfer transfer){
		if(logger.isTraceEnabled()){
			logger.trace("saveTransfer()");
		}
		this.transferRepository.saveAndFlush(transfer);
		if(logger.isDebugEnabled()){
			logger.debug("Save Transfer");
		}
	}
	
	@Transactional
	public void deleteTransfer(Transfer transfer){
		if(logger.isTraceEnabled()){
			logger.trace("deleteTransfer()");
		}
		List<Transfer> transfers = new LinkedList<Transfer>();
		transfers.add(transfer);
		this.transferRepository.deleteInBatch(transfers);
		if(logger.isDebugEnabled()){
			logger.debug("Delete Transfer");
		}
	}
	
//	@Transactional
//	public void deleteTransferById(int id){
//		if(logger.isTraceEnabled()){
//			logger.trace("deleteTransferById()");
//		}
//		this.transferRepository.delete(id);
//		if(logger.isDebugEnabled()){
//			logger.debug("Delete Transfer");
//		}
//	}
	
}
