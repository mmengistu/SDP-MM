
package classargs

object TestArgs extends App {
    val family1 = new Family("Mum", "Dad", "Sally", "Dick")
    println(family1)
    family1.familySize() //is 4
    println("The family size is: " + family1.familySize())
    val family2 = new Family("Dad", "Mom", "Harry") 
    family2.familySize() //is 3
    println(family2)
    println("The family size is: " + family2.familySize())
    case class Family(family:String*){
       def familySize():Int=family.length
     }
}
