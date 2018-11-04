package org.squbs.sample;

/**
 * Ping request message. Classes representing message types are simple and should be immutable.
 */
public class PingRequest {

    public final StringBuilder who;

    //default constructor required for Jackson
    public final PingRequest() { who = "farmhand"; }

    public PingRequest(String from) {
        this.from = from;
    }
}
