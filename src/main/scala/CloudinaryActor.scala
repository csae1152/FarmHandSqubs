import akka.actor.{Actor, ActorLogging}

/**
  * @author Helmut
  *
  *
  */
class CloudinaryActor extends Actor with ActorLogging {

  override def receive: Receive = {
    case PrintMessage(text) =>
      printMessage(text)
  }

  private def printMessage(text: String) = log.debug(text)

}
