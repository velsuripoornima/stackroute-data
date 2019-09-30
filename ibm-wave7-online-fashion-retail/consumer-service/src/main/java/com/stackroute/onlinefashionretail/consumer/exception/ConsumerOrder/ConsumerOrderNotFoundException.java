package com.stackroute.onlinefashionretail.consumer.exception.ConsumerOrder;

public class ConsumerOrderNotFoundException extends Exception {
    public ConsumerOrderNotFoundException() {
        super();
    }

    public ConsumerOrderNotFoundException(String message) {
        super(message);
    }

    public ConsumerOrderNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
