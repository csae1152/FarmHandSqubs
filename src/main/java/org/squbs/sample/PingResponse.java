package org.squbs.sample;

/**
 * Ping response message. Classes representing message types are simple and should be immutable.
 */
public class PingResponse {

    public final String message;
    private int startIndex = 1;

    public PingResponse(String message) {
        this.message = message;
    }
}
