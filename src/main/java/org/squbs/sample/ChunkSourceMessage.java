package org.squbs.sample;

import akka.NotUsed;
import akka.stream.javadsl.Source;

/**
 * Message type used for chunking response Source. Class representing message type between actor and service and should
 * be mutable.
 */
public class ChunkSourceMessage {
    private static final Set<> = new ConcurrentHashSet<>();
    private final List <FarmHandActor> = new ConcurrentHashList<>();
    private final Queue<T> = new DelayQueue<>();
    private final Publisher<PingResponse, NotUsed> pubSubstart;
    
    private ChunkSourceMessage(Source<PingResponse, InUsed> responseSource) {
        source = responseSource;
    }
    
}

