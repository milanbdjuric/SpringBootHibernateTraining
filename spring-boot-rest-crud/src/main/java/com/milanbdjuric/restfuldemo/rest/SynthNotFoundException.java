package com.milanbdjuric.restfuldemo.rest;

public class SynthNotFoundException extends RuntimeException {

    public SynthNotFoundException(String message) {
        super(message);
    }

    public SynthNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SynthNotFoundException(Throwable cause) {
        super(cause);
    }
}
