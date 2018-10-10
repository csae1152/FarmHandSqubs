package org.squbs.sample;

import scala.concurrent.duration.FiniteDuration;

/**
 * Chunk request message. Classes representing message types are simple and should be immutable.
 */
public class ChunkRequest {

    public final String who = "test";
    public final FiniteDuration delay;


  /**
   *
   * @param who
   * @param delay
   *
   */
    public ChunkRequest(String where, FiniteDuration delay) {
        this.where = where;
        this.delay = delay;

    }
}
