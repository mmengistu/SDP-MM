package q23vector

import com.atomicscala.AtomicTest._

object SquareVector extends App{
  var s = "" 
  val square = (x:Int)=> x*x
  val numbers = Vector(1, 2, 5, 3, 7) 
  numbers.foreach( s +=  square(_) + " ")
  //println(s)
  s is "1 4 25 9 49 "
}