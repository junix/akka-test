package junix
import akka.actor.Actor.Receive
import akka.actor._

class C extends Actor {
  override def receive = {
    case msg => println(s"$self recv $msg")
  }

  override def postStop(): Unit = println("stop ccc")
}

class T extends Actor {
  val c = context.actorOf(Props[C],"ccc")

  override def receive = {
    case "c" => println("children is  "+this.context.children)
    case "toc" => c ! "toc"
    case m => println(s"$self recv $m")
  }

  override def postStop(): Unit = println("stop wanglijun")
}

object Junix {
  val system = ActorSystem("junix")
}
