package q8planet

class Planet (val name:String, val description:String, val moons:Int = 1) {
     
}


object PlanetTest extends App{
  val p = new Planet(name = "Mercury", description = "small and hot planet", moons =0)
   
  val hasMoon: Boolean = false;
  if (p.moons > 0) hasMoon
  println("Planet Nmae: " + p.name);
  println("Planet Description: " + p.description);
  
  if (hasMoon) 
  println("Number of moons: " + p.moons);
  else println("The planet has no moon")
  
}