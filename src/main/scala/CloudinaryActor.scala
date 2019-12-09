import akka.actor.{Actor, ActorLogging}

/**
  * @author Helmut
  *
  *
  */
class CloudinaryActor extends Actor with ActorLogging {

  override def receive: Printer = {
    case PrintMessage(val string) =>
      printMessageToDatabase(string)
  }

  private def printMessageForFarm(text: String) = log.debug(text)

}
