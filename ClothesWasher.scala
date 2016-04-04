package q12clotheswasher

class ClothesWasher (val modelName : String, val capacity: Double) {
  def this(modelName: String){
    this(modelName, 5.0)
  }
  def this(capacity: Double){
    this ("Hoover", capacity)
  }

}

object testClothesWasher extends App{
  val cw = new ClothesWasher(7.0)
  println(cw.modelName)
  println(cw.capacity)
  
  val cw2 = new ClothesWasher("Bosch")
   println(cw2.modelName)
  println(cw2.capacity)
  
}

