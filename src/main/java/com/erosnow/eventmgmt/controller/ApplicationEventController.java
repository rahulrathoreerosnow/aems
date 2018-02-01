package com.erosnow.eventmgmt.controller;

import java.math.BigInteger;
import java.util.Collections;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erosnow.eventmgmt.entities.ApplicationEvent;
import com.erosnow.eventmgmt.repo.ApplicationEventRepository;
import com.erosnow.eventmgmt.service.ApplicationEventPublishingService;


@RestController
@RequestMapping(value="/events")
public class ApplicationEventController
{
    @Autowired
    ApplicationEventRepository applicationEventRepository;
    
    @Autowired
    private Processor pipe;
    
    @Autowired
    private ApplicationEventPublishingService publishService;
    
  

    @PostMapping("/publish")
    public ResponseEntity<?> publish(@RequestBody @Valid ApplicationEvent event)
    {
       
    	ApplicationEvent savedevent = applicationEventRepository.save(event);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("MyResponseHeader", "MyValue");
        pipe.input()
        .send(MessageBuilder.withPayload(savedevent)
        .build());
        return new ResponseEntity<>(savedevent, responseHeaders, HttpStatus.CREATED);
    }
    
    @GetMapping("/{id}")
    public ApplicationEvent getEvent(@PathVariable("id") BigInteger id)
    {
        return applicationEventRepository.findOne(id);
    }
    
    @PutMapping("/{id}/republish")
    public ResponseEntity<?> republish(@PathVariable("id") BigInteger id)
    {
    	publishService.republish(Collections.singletonList(id));
    	HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("MyResponseHeader", "MyValue");
    	
    	return new ResponseEntity<>(id, responseHeaders, HttpStatus.ACCEPTED);
    }
    
}
