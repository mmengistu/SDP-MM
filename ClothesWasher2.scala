package q13clotheswasher2

class ClothesWasher2(val modelName : String="Samsung", val capacity: Double=5.5){
  def this(modelName: String){
    this(modelName, 5.0)
  }
  def this(capacity: Double){
    this ("Hoover", capacity)
  }

}

object testClothesWasher extends App{
  val cw = new ClothesWasher2(7.0)
  println(cw.modelName)
  println(cw.capacity)
  
  val cw2 = new ClothesWasher2("Bosch")
   println(cw2.modelName)
  println(cw2.capacity)
  
}
