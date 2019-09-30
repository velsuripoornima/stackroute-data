package com.stackroute.onlinefashionretail.consumer.exception.Consumer;

public class ConsumerAlreadyExistsException extends Exception {
    public ConsumerAlreadyExistsException() {
        super();
    }

    public ConsumerAlreadyExistsException(String message) {
        super(message);
    }

    public ConsumerAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
