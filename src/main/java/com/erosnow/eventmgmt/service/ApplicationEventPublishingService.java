package com.erosnow.eventmgmt.service;

import java.math.BigInteger;
import java.util.List;

import com.erosnow.eventmgmt.entities.ApplicationEvent;

public interface ApplicationEventPublishingService {
	
	
	public void publish(List<ApplicationEvent> ApplicationEventList);
	
	public void republish(List<BigInteger> ApplicationEventIds);

}
