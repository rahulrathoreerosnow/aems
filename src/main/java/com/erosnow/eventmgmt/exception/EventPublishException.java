/**
 * 
 */
package com.erosnow.eventmgmt.exception;


public class EventPublishException extends RuntimeException 
{
	private static final long serialVersionUID = 1L;

	public EventPublishException() {
        this("Post can't be deleted");
    }

    public EventPublishException(String message) {
        this(message, null);
    }

    public EventPublishException(String message, Throwable cause) {
        super(message, cause);
    }
}
