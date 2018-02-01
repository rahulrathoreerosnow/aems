package com.erosnow.eventmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;

import com.erosnow.eventmgmt.entities.ApplicationEvent;

@EnableBinding(Processor.class)
@SpringBootApplication
public class ApplicationEventManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationEventManagementServiceApplication.class, args);
	}
	
	@StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    public ApplicationEvent enrichLogMessage(ApplicationEvent log) {
        return log;
    }
}
