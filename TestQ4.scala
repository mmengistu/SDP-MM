package q4classargs

object TestQ4 extends App{
  val family3 = new FlexibleFamily("Mum", "Dad", "Sally", "Dick") 
  family3.familySize() //is 4 val 
  println(family3.familySize())
  val family4 = new FlexibleFamily("Dad", "Mom", "Harry") 
  family4.familySize() //is 3 
  println(family4.familySize())
 
  trait Family{
    def mum:String = ???
    def dad:String = ???
    def child1:String = ???
    def child2:String = ???
    def child3:String = ???
  }
  class FlexibleFamily(ff:String*) extends Family{
    def familySize():Int = ff.length
  }
}