package q7time

import com.atomicscala.AtomicTest._

case class SimpleTime2[T](hours: T, minutes: Int = 0) {
 //def copy[T'](a: T' = this.hours, minutes: Int = this.b): SimpleTime2[T'] = new SimpleTime2[T'](hours, minutes)
}
 
object Test extends App{
     val t1: SimpleTime2[Int] = SimpleTime2(5, 30)
     val t2= SimpleTime2(hours=10)
     
     t2.hours is 10
     t2.minutes is 0
    
        
       println("t1.hours is: " + t1.hours + " \nt1.minutes is: " + t1.minutes)
       println("t2.hours is: " + t2.hours + " \nt2.minutes is: " + t2.minutes)
   
}