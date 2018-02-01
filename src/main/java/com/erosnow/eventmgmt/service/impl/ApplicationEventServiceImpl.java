package com.erosnow.eventmgmt.service.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erosnow.eventmgmt.entities.ApplicationEvent;
import com.erosnow.eventmgmt.repo.ApplicationEventRepository;
import com.erosnow.eventmgmt.service.ApplicationEventService;


@Service

public class ApplicationEventServiceImpl  implements ApplicationEventService{

	
	@Autowired
    ApplicationEventRepository applicationEventRepository;

	@Override
	public ApplicationEvent create(ApplicationEvent applicationEvent) {
		return applicationEventRepository.save(applicationEvent);
	}

	@Override
	public List<ApplicationEvent> getEvents(List<BigInteger> eventIdList) {
		return applicationEventRepository.findAll(eventIdList);
	}

	@Override
	public ApplicationEvent update(ApplicationEvent applicationEvent) {
		return applicationEventRepository.save(applicationEvent);
	}

	@Override
	public void delete(ApplicationEvent applicationEvent) {
		  applicationEventRepository.delete(applicationEvent);
	}

	@Override
	public ApplicationEvent deleteById(BigInteger eventId) {
		ApplicationEvent eventToBeDeleted = applicationEventRepository.findOne(eventId);
		if(eventToBeDeleted!=null){
		 applicationEventRepository.delete(eventId);
		 return eventToBeDeleted;
		}
		return null;
	}
	

}
