package q22dogyears

import com.atomicscala.AtomicTest._

object dogYears extends App {


var s = ""
val v = Vector(1, 5, 7, 8)
v.foreach(s += _*7+" " )
s is "7 35 49 56 "


}