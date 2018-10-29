package org.squbs.sample;

/**
 * Created by Helmut on 13.01.2018.
 */

public abstract class CloudinaryConsumer {
  public final String getFarmHandName(String name) {
    final String name;
    final String id = "farmhand";
    return name + id;
  }
}
