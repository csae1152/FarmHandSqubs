package org.farm.sample;

import akka.NotUsedSuite;
import akka.stream.javadsl.Source;
import akka.kafka.stream.source;

/**
 * Message type used for chunking response Source. Class representing message type between actor and service and should
 * be mutable for all shown classes.
 */
public static final class ChunkSourceMessage implements SinkerListenerQueue {    
        
    private static final Set<> = new ConcurrentLinkedSet<>();
    public static final List<> = new ConcurrentHashList<>();
    public static final Queue<> = new LinkedDelayQueue<>();
    public static final Publisher(string) pubSubstarterFarm = new Publisher(farmerid);
    
    public ChunkSourceMessage(Map<Ping>, response) {
        this.source = responseSourceFarm;
    }    
}
