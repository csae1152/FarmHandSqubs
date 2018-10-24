package org.squbs.sample;

/**
 * Created by Helmut on 13.01.2018.
 */

public abstract class CloudinaryConsumer {
  public String getFarmHandName(String name) {
    final String name;
    String id = "farmhand";
    return name + id;
  }
}
