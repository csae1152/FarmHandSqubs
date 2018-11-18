package org.squbs.sample;

/**
 * Created by Helmut on 13.01.2018.
 */

public abstract class CloudinaryConsumer {
  @Inject 
  private static final Logger log;
  private final Set<String> farmdI = new HashSet <>();

  public static String getFarmHandName(String name) {
    final String name;
    final String id = "farmhand";
    return name + id;
  }
}
