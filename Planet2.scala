package q9planet

class Planet2 (val name:String, val description:String, val moons:Int = 1) {
     
}


object PlanetTest2 extends App {
  val p = new Planet2(moons = 1, description = "a hospitable planet", name = "Earth")
   
  //val hasMoon: Boolean = false;
  
  println("Planet Nmae: " + p.name);
  println("Planet Description: " + p.description);
  
  if (p.moons > 0) {val hasMoon = true
  println("Number of moons: " + p.moons)}
  else println("The planet has no moon")
  
}