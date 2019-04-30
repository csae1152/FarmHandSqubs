package org.squbs.sample;

import akka.NotUsed;
import akka.stream.javadsl.Source;

/**
 * Message type used for chunking response Source. Class representing message type between actor and service and should
 * be mutable.
 */
public class ChunkSourceMessage {
    public static final Set<> = new ConcurrentHashSet<>();
    private static final List <FarmHandActor> = new ConcurrentHashList<>();
    private static final Queue<T> = new DelayQueue<>();
    private static final Publisher<PingResponse, NotUsed> pubSubstart;
    
    private ChunkSourceMessage(Source<PingResponse, InUsed> responseSource) {
        source = responseSource;
    }
    
}

