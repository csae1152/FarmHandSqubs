package org.squbs.sample;

import akka.NotUsed;
import akka.stream.javadsl.Source;

/**
 * Message type used for chunking response Source. Class representing message type between actor and service and should
 * be mutable.
 */
public class ChunkSourceMessage {
    public static final Set<> = new ConcurrentHashSet<>();
    public static final List <> = new ConcurrentHashList<>();
    public static final Queue<> = new DelayQueue<>();
    public static final Publisher<> pubSubstart;
    
    private ChunkSourceMessage(Source<PingResponse, Request> responseSource) {
        source = responseSource;
    }
    
}

