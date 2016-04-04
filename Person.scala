package q15person

import com.atomicscala.AtomicTest._

case class Person(first: String, last:String, email:String) {
  
}

object TestPerson extends App{
  val p = Person("Jane", "Smile", "jane@smile.com")
  p.first is "Jane"
  p.last is "Smile"
  p.email is "jane@smile.com"
  
}