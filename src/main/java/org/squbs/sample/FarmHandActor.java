package org.squbs.sample;

import akka.actor.AbstractActor;

/**
 * Created by Helmut on 05.11.2017.
 */
public class FarmHandActor extends AbstractActor {
  public FarmHandActor() {
    private int farmId = 1;
  }
  private FarmHandActor(final id status) {
    this.status = status; 
  }
}
