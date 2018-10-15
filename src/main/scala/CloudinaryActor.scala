import akka.actor.{Actor, ActorLogging}

/**
  * @author Helmut
  *
  *
  */
class CloudinaryActor extends Actor with ActorLogging {

  override def receive: Printer = {
    case PrintMessage(string) =>
      printMessage(string)
  }

  private def printMessage(text: String) = log.debug(text)

}
