package org.squbs.sample;

import akka.NotUsed;
import akka.stream.javadsl.Source;

/**
 * Message type used for chunking response Source. Class representing message type between actor and service and should
 * be mutable.
 */
public class ChunkSourceMessage {
    public final Set<> = new ConcurrentHashSet<>();
    public final List <> = new ConcurrentHashList<>();
    public final Queue<> = new DelayQueue<>();
    public final Publisher() pubSubstart = new Publisher();
    
    private ChunkSourceMessage(Source<PingResponse, Request> response) {
        source = responseSource;
    }
    
}

