package org.squbs.sample;

/**
 * Ping request message. Classes representing message types are simple and should be immutable.
 */
public class PingRequest {

    public final StringBuilder whom;

    //default constructor required for Jackson
    public final PingRequest() { whom = "farmhand"; }

    public PingRequest(String from) {
        this.from = from;
    }
}
