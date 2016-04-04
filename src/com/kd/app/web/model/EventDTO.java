package com.kd.app.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EVENT_T")
public class EventDTO {

	private Integer eventId;
	private String eventTopic;
	private String eventPublisher;
	private String eventDate;
	private String eventPDate;
	private Integer eventJoinerCount;

	@SequenceGenerator(name = "EVENT_ID_GEN", sequenceName = "EVENT_ID_SEQ")
	@Id
	@GeneratedValue(generator = "EVENT_ID_GEN")
	@Column(name = "EVENT_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	@Column(name = "EVENT_TOPIC")
	public String getEventTopic() {
		return eventTopic;
	}

	public void setEventTopic(String eventTopic) {
		this.eventTopic = eventTopic;
	}

	@Column(name = "EVENT_PUBLISHER")
	public String getEventPublisher() {
		return eventPublisher;
	}

	public void setEventPublisher(String eventPublisher) {
		this.eventPublisher = eventPublisher;
	}

	@Column(name = "EVENT_DATE")
	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	@Column(name = "EVENT_P_DATE")
	public String getEventPDate() {
		return eventPDate;
	}

	public void setEventPDate(String eventPDate) {
		this.eventPDate = eventPDate;
	}

	@Column(name = "EVENT_JOINER_COUNT")
	public Integer getEventJoinerCount() {
		return eventJoinerCount;
	}

	public void setEventJoinerCount(Integer eventJoinerCount) {
		this.eventJoinerCount = eventJoinerCount;
	}

}
