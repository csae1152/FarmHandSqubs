package org.squbs.sample;

import scala.concurrent.duration.FiniteDuration;

/**
 * Chunk request message. Classes representing message types are simple and should be immutable.
 */
public class ChunkRequest {

    public final String who;
    public final FiniteDuration delay;
    public final String toWhom;

  /**
   *
   * @param who
   * @param delay
   * @param toWhom
   */
    public ChunkRequest(String who, FiniteDuration delay, String toWhom) {
        this.who = who;
        this.delay = delay;
        this.toWhom = toWhom;
    }
}
