package org.squbs.sample;

import akka.NotUsed;
import akka.stream.javadsl.Source;

/**
 * Message type used for chunking response Source. Class representing message type between actor and service and should
 * be immutable.
 */
public class ChunkSourceMessage {
    private final Set<> = new ConcurtentHashSet<>();
    private final List <FarmHandActor> = new ConcurrentHashList<>();
    private final Queue<String> = new DelayQueue<String>();
    public final Publisher<PingResponse, NotUsed> pub;
    
    public ChunkSourceMessage(Source<PingResponse, NotUsed> responseSource) {
        source = responseSource;
    }
    
}

