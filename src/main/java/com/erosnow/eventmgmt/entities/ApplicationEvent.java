package com.erosnow.eventmgmt.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;



@Entity
@Table(name="app_events")
@org.hibernate.annotations.DynamicInsert
@org.hibernate.annotations.DynamicUpdate
public class ApplicationEvent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="event_id",columnDefinition="bigint(20)")
	private BigInteger eventId;


	@Column(name="event_type",columnDefinition="char(20)")
	private String eventType;
	
	@Column(name="event_action",columnDefinition="char(20)")
	private String action;
	
	private boolean published;


	@Lob
	@Column(name="payload",columnDefinition="text")
	private String payload;
	
	@Column(name="source_type",columnDefinition="char(20)")
	private String sourceType;

	@Column(name="source_id",columnDefinition="char(20)")
	private String sourceId;

	

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	@Column(name="creation_date")
	private Timestamp creationDate;
	
	@Column(name="last_updated_date")
	private Timestamp lastUpdatedDate;

	public ApplicationEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BigInteger getEventId() {
		return eventId;
	}

	public void setEventId(BigInteger eventId) {
		this.eventId = eventId;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public Timestamp getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}


	


}