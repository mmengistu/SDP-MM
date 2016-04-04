package q11tea

import com.atomicscala.AtomicTest._

class Tea (val milk: Boolean=false, val sugar: Boolean= false, 
    val decaf: Boolean=false, val name: String="Earl Grey") {
  def describe():String={
    var newDesc:String = name
    if (milk) newDesc +=" + milk"
    if (sugar) newDesc +=" + sugar"
    if (decaf) newDesc +=" decaf"
    newDesc
  }
  
  def calories():Int = {
    var cal:Int = 0
    if (milk) cal+=100 
    if (sugar) cal+=16
    //if ((milk) && (sugar)) cal +=116
     cal  

  }
}

object TeaScript extends App{
  val tea = new Tea
  tea.describe is "Earl Grey"
  tea.calories is 0
  
  val lemonZinger = new Tea(decaf = true, name="Lemon Zinger")
  lemonZinger.describe is "Lemon Zinger decaf"
  lemonZinger.calories is 0
  
  val sweetGreen = new Tea( name="Jasmine Green", sugar=true)
  sweetGreen.describe is "Jasmine Green + sugar"
  sweetGreen.calories is 16
  val teaLatte = new Tea(sugar=true, milk=true)
  teaLatte.describe is "Earl Grey + milk + sugar"
  teaLatte.calories is 116
}

