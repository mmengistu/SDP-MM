package week7
import com.atomicscala.AtomicTest._
object Q1 extends App {

  //Q.1.(a)
  
val v = Vector(1, 2, 3, 4)
v.map(n => n + 1) is Vector(2, 3, 4, 5) 

val v2 = Vector(1, 2, 3, 4)
v2.map(n => n *11 + 10) is Vector(21, 32, 43, 54)

// Q.1.(b)
//v2.foreach { n => n *11 + 10 ; println(v2)}
v2.foreach(n => n *11 + 10) is Vector(21, 32, 43, 54)

//The test failed because foreach can not change each element

//Q.1.(c)

var retV2 = for {i <- v2
}yield (i * 11 + 10)
println(retV2)

//Q.2.

val v3 = Vector(1, 2, 3, 4)
v3.map(n => n + 1) is Vector(2, 3, 4, 5)

var retV3 = for {i <- v3
}yield (i + 1)
println(retV3)

//Q.3.

val v4 = Vector(1, 10, 100, 1000)
v4.reduce((sum, n) => sum + n) is 1111

var retV4 = for{i <- v4 }yield v4.sum
println(retV4)

//Q.4.



//def sumIt[T](v: Vector[T] => T)(a:Int, b:Int):Int  ={
// v.reduce[T]((x,y) => x+y)(a,b)
}


//sumIt() is 6
//sumIt(45, 45, 45, 60) is 195




 


