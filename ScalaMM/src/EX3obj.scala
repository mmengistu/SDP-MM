

object EX3obj {
   def main(args: Array[String]): Unit = {
     println("Hello, world!")
    //The REPL
     //++++++++++++++++++++++++++++++++++++++++
     //Question 1.
     val seventeen = 17
     
   //Question 2.
     //now changing 17 to 20
     //seventeen = 20;  //didn't like reassignment
     
     
     //Question 3.
     val  myString = "ABC1234"
     println (myString)
     
     //Question 4.
     //myString = (DEF1234) //reassignment to val
     
     //Question 5.
     val myDouble = 15.56
     println (myDouble)
     
     
     //Expressions
     //++++++++++++++++++++++++++++++++++++++++++++
     
     //Question 1.
     var sky = "sunny"
     var temprature = 80
     var niceDay = false : Boolean
     
     if ((sky == "sunny") && (temprature > 80)) niceDay = true
     println(niceDay)
     
     //Question 2.
     var sky2 = "partly cloudy"
     if (((sky == "sunny")||(sky2 == "partly cloudy")) && (temprature > 80)) niceDay = true
     println(niceDay)
     
     //Question 3.
     temprature = 10
     if (((sky == "sunny")||(sky2 == "partly cloudy")) && ((temprature > 80)||(temprature < 20))) niceDay = true
     println(niceDay)
     
     //Question 4.
     var celsius = 0.0;
     var fahrenheit = 100.0
     var temp = fahrenheit
     celsius = (temp - 32) * 5 / 9
     println("\n" + fahrenheit + " degree Fahrenheit is equal to " + celsius + " degree Celsius")
     
     
      //Question 5.
     celsius = 100.0;
     fahrenheit = 0.0
     temp = celsius
     fahrenheit = (temp * 9 / 5) + 32
     println("\n" + celsius + " degree Celsius is equal to " + fahrenheit + " degree fahrenheit")
     
     //Methods
     //Q1. Create a method getSquare
     

     def getSquare(n1 : Int): Int ={
       return n1 * n1
     }
     
      val a = getSquare(3)
      println("Value of getSquare(3) is: " + a)
      assert(a == 3*3)
      val b = getSquare(6)
      println("Value of getSquare(6) is: " + b)
      assert(b == 6*6)
      val c = getSquare(5)
      println("Value of getSquare(5) is: " + c)
      assert(c == 5*5)
      
      //Q2. Create a method isArg1GreaterThanArg2
       def isArg1GreaterThanArg2(arg1 : Double, arg2 : Double) : Boolean = {
          return arg1 > arg2
      }
      val t1 = isArg1GreaterThanArg2(4.1, 4.12)
      println("Value of t1 is: " + t1)
      assert(t1 == false, "Assumption Failed!")
      val t2 = isArg1GreaterThanArg2(2.1, 1.2)
      println("Value of t2 is: " + t2)
      assert(t2 == true, "Assumption Failed!")
      
      //Q 3. Create a method manyTimesString
      def manyTimesString(str: String, num : Int) : String = {
        var n = 0
        var str2 = ""
        do {
          str2 += str
          n += 1
          
        }while (n < num)
        
        return str2
      }
      val m1 = manyTimesString("abc", 3)
      println("Value of m1 is: " + m1)
      assert("abcabcabc" == m1, "Assumption Failed")
      val m2 = manyTimesString("123", 2)
      println("Value of m2 is: " + m2)
      assert("123123" == m2, "Assumption Failed")
      
      //Classes & Objects
      //Q1. Create a Range object
      var r1 = Range (1,10)
      var r2 = Range (1,10,2)
      for (x <- r1){
        print(x + " ")
      }
      println("\n1 Step above")
       for (x <- r2){
        print(x + " ")
       }
       println("\n2 Steps above")
       
       
       //Q2. Determine if two Strings are equivalent
       var s1 = "Sally"
       var s2 = "Sally"
       /*var ans = true
       ans = s1.equals(s2)
       println (ans)*/
       if (s1.equals(s2)) {
         println ( "s1 and s2 are equal.")
       }else{
         println ( "s1 and s2 are not equal")
       }
       //Creating Classes
       //Q1. Create classes for Hippo, Lion, Tiger, Monkey, and Giraffe,
      
       
   }

}