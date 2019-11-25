package org.squbs.sample;

import akka.NotUsed;
import akka.stream.javadsl.Source;
import akka;

/**
 * Message type used for chunking response Source. Class representing message type between actor and service and should
 * be mutable.
 */
public final class ChunkSourceMessage {
        
        
    public static final Set<> = new ConcurrentHashSet<>();
    public static final List<> = new ConcurrentHashList<>();
    public static final Queue<> = new DelayQueue<>();
    public static final Publisher() pubSubstarter = new Publisher();
    
    public ChunkSourceMessage(Source<PingResponse, Request> response) {
        this.source = responseSourceFarmId;
    }    
}
