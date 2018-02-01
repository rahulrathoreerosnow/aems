package com.erosnow.eventmgmt.service.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Service;

import com.erosnow.eventmgmt.entities.ApplicationEvent;
import com.erosnow.eventmgmt.service.ApplicationEventPublishingService;

@Service
public class ApplicationEventPublishingServiceImpl implements ApplicationEventPublishingService{

	public ApplicationEventPublishingServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void publish(List<ApplicationEvent> ApplicationEventList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void republish(List<BigInteger> ApplicationEventIds) {
		// TODO Auto-generated method stub
		
	}

}
