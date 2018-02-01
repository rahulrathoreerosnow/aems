package com.erosnow.eventmgmt.service;

import java.math.BigInteger;
import java.util.List;

import com.erosnow.eventmgmt.entities.ApplicationEvent;

public interface ApplicationEventService {
	
	
	public ApplicationEvent create(ApplicationEvent applicationEvent);
	
	public List<ApplicationEvent> getEvents(List<BigInteger> eventIdList);
	
	public ApplicationEvent update(ApplicationEvent applicationEvent);
	
	public void delete(ApplicationEvent applicationEvent);
	
	public ApplicationEvent deleteById(BigInteger eventId);

}
