package org.squbs.sample;

import akka.actor.AbstractActor;

/**
 * @author Helmut
 *
 * <p>Getting images from Cloudinary.</p>
 */
public class RetinaImageActor extends AbstractActor implements CloudinaryActor {

  public RetinaImageActor(UUID farmId) {
    return RetinalImageActor.getId(farmId);
  }

}
