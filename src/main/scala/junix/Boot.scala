package junix
import akka.actor._
import Junix.system

object Boot extends App {
  val r = system.actorOf(Props[T],"wanglijun")
//  r ! "c"
//  r ! "toc"
  system.actorSelection("/user/*/*") ! "hello"
  println(system.terminate().value)



}
