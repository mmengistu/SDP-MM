import com.atomicscala.AtomicTest._


object mytutorial {
  def main(args: Array[String]){
  /*  var i=0
    do{
      println(i)
      i+= 1
    }while (i <= 3)  */ 
  }
  
  //Methods
  //Q1.creating a method getSquare
  def getSquare(num1 : Int): Int ={
    return num1 * num1
  }
  val a = getSquare(3)
  println( " 3 square is " + a)
  assert(a == (3 * 3))
   val b = getSquare(6)
  println( " 6 square is " + b)
  assert(b == (6 * 6))
   val c = getSquare(5)
  println( " 5 square is " + c)
  assert(c == (5 * 5))
//Q2. Create a method isArg1GreaterThanArg2

def isArg1GreaterThanArg2(d1 : Double, d2 : Double): Boolean ={
  return d1 > d2
  }
  
  val t1 = isArg1GreaterThanArg2(4.1, 4.2)
  assert(t1 ==(4.1 > 4.2))
  println(t1)
  val t2 = isArg1GreaterThanArg2(2.1, 1.2)
  assert(t2 == (2.1 > 1.2))
  println(t2)

//Q3. Create a method manyTimesString 
  def manyTimesString(s1 : String, n1 : Int) : String ={
    var i=1
    var s2 = ""
    do{
      //print(s1)
      i+= 1
      s2 += s1
    }while (i <= n1)
      return s2
  } 
  val m1 = manyTimesString("abc", 3) 
  println("\n" + m1)
  assert("abcabcabc" == m1, "Assumption failed")
  
  
  val m2 = manyTimesString("123", 2)
   println("\n" + m2)
  assert("123123" == m2, "Assumption failed")
  
  //Classes & Objects
  //Q1. Create a Range object and print the step value

var r = 0;
    for (r <- 1 to 10){
      println("Value of r: " + r)
    }
    
    var r2 = Range(1,10)
    //prints with a step value of 1
     println("Value of r2: " + r2)
    var r3 = Range(1,10,2);
    //prints with a step value of 2
     println("Value of r3: " +r3)
     //checking different syntax
     var r4 = (1 until 10) by 2
    //prints with a step value of 1
     println("Value of r4: " + r4)
     
     //Q2. Compare string objects
     var str1a  = "Sally"
     var str2a  = "Sally"
     
     if (str1a.equals(str2a)) {
       println("s1 and s2 are equal")
       }else
       { println("s1 and s2 are not equal")}
//Creating Classes
     //Q1. Create classes for Hippo, Lion, Tiger, Monkey, and Giraffe
     
     class Hippo{
       def name : String = "Hippo"
     }
      class Lion{
       def name : String = "Lion"
     }
      class Tiger{
       def name : String = "Tiger"
     }
      class Giraffe{
       def name : String = "Giraffe"
     }
      class Monkey{
       def name : String = "Monkey"
     }
      
      //Q2. Create a second instance of Lion and two more Giraffes.
      
      
      //Methods and Classes
      //Q1. Create a Sailboat class
      
     /*
      class Sailboat(boatState:String){
        var message : String = boatState
        def displayMessage(){
        if (message.equalsIgnoreCase("RAISED")){
          println("Sailboat raised")
        }else if (message.equalsIgnoreCase("LOWERED")){
         println("Sailboat lowered") 
        }
        }
      /* def raiseSailboat(boatState : String){
         println("Sailboat raised")
       }
       def lowerSailboat(boatState : String){
         println("Sailboat lowered")
       }*/
     /*  if (boatState.Equals("raised"){
         println("Sailboat raised")
       }else if(boatState.Equals("lowered"){
         println("Sailboat lowered")
       }
       */
       
      }
      val msg = new Sailboat("raised")
      msg.displayMessage()*/
      
      class Sailboat{
        var fs = new Flare
        def raise(){
          println("Sails raised")
        }
        def lower(){
          println("Sails lowered")
        }
        def signal(){
          fs.light
        }
        
      }
     val sailboat = new Sailboat
     val r1 = sailboat.raise()
    // assert(r1 == "Sails raised", "Expected Sails raised, Got " + r1)
     val l1 = sailboat.lower()
    // assert(l1 == "Sails lowered", "Expected Sails lowered, Got " + l1)

      class Motorboat{
        def on(){
          println("Motor on")
        }
        def off(){
          println("Motor off")
        }
      }
     val motorboat = new Motorboat
     val o1 = motorboat.on()
     //assert(o1 == "Motor on", "Expected Motor on, Got " + o1)
     val o2 = motorboat.off()
     //assert(o2 == "Sails lowered", "Expected Motor off, Got " + o2)
     
     //Q2. Create a new class Flare
     class Flare{
       def light{
         println("Flare used")
       }
     }
     val flare = new Flare 
     val f1 = flare.light 
     //assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)
     
      class Sailboat2{
        var fs = new Flare
        def raise(){
          println("Sails raised")
        }
        def lower(){
          println("Sails lowered")
        }
        def signal(){
          fs.light
        }
        
      }
     val sailboat2 = new Sailboat2 
     val signal = sailboat2.signal() 
   //  assert(signal == "Flare used!", "Expected Flare used! Got " + signal)
     
class Motorboat2{
       var ms = new Flare
        def on(){
          println("Motor on")
        }
        def off(){
          println("Motor off")
        }
        def signal(){
          ms.light
        }
     }
        
        val motorboat2 = new Motorboat2 
        val flare2 = motorboat2.signal() 
        //assert(flare2 == "Flare used!", "Expected Flare used!, Got " + flare2)

        //Fields in Classes
        class Cup {
          var percentFull = 0 
          val max = 100 
          def add(increase:Int):Int = { 
            percentFull += increase 
            if(percentFull > max) {
              percentFull = max 
            } else if (percentFull < 0){
              percentFull = 0
            }
            percentFull // Return this value 
            } 
          }
  //Q1.
        val cup = new Cup 
     /*   cup.add(45) is 45 
       // println(" Percent " + cup.add(45))
        cup.add(-15) is 30
        //println(" Percent " + cup.add(-15))
        cup.add(-50) is -20
       // println(" Percent " + cup.add(-50))
			*/
        cup.add(45) is 45 
        cup.add(-55) is 0 
        cup.add(10) is 10 
        cup.add(-9) is 1 
        cup.add(-2) is 0
        
        
        //Q3.
        cup.percentFull = 56 
        cup.percentFull is 56
        
        //Vectors
        //Q.3  Create a Vector and populate it with words 
        val vec = scala.collection.immutable.Vector.empty
        val vec2 = Vector("The", "dog", "visited", "the", "firestation")
        val vec3 = vec2.toString()
        for (x <- vec2){
          println(x)
          var d = (x.toString)
          var vec4 = vec :+ d
          println(vec4)
        }
        //println(vec3.toString())
         println(vec3)
         
         //Q.5. Create two Vectors 
         val myVector1 = Vector(1,2,3,4,5,6)
         val myVector2 = Vector(1,2,3,4,5,6)
         assert(myVector1==myVector2, "Assumtion failed :")
       
        
        
        


//.........................................................    
     
}
    







