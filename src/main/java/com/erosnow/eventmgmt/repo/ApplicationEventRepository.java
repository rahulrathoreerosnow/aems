package com.erosnow.eventmgmt.repo;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erosnow.eventmgmt.entities.ApplicationEvent;

public interface ApplicationEventRepository extends JpaRepository<ApplicationEvent, BigInteger> {

}
