object Ex3 {
  println("Hello, world!")                        //> Hello, world!
      //The REPL
     //++++++++++++++++++++++++++++++++++++++++
     //Question 1.
     val seventeen = 17                           //> seventeen  : Int = 17
       //Question 2.
     //now changing 17 to 20
     //seventeen = 20;  //didn't like reassignment
     
     
     //Question 3.
     val  myString = "ABC1234"                    //> myString  : String = ABC1234
     println (myString)                           //> ABC1234
     
     //Question 4.
     //myString = (DEF1234) //reassignment to val
     
     //Question 5.
     val myDouble = 15.56                         //> myDouble  : Double = 15.56
     println (myDouble)                           //> 15.56
     
     
     //Expressions
     //++++++++++++++++++++++++++++++++++++++++++++
     
     //Question 1.
     var sky = "sunny"                            //> sky  : String = sunny
     var temprature = 80                          //> temprature  : Int = 80
     var niceDay = false : Boolean                //> niceDay  : Boolean = false
     
     if ((sky == "sunny") && (temprature > 80)) niceDay = true
     println(niceDay)                             //> false
     
     //Question 2.
     var sky2 = "partly cloudy"                   //> sky2  : String = partly cloudy
     if (((sky == "sunny")||(sky2 == "partly cloudy")) && (temprature > 80)) niceDay = true
     println(niceDay)                             //> false
     
     //Question 3.
     temprature = 10
     if (((sky == "sunny")||(sky2 == "partly cloudy")) && ((temprature > 80)||(temprature < 20))) niceDay = true
     println(niceDay)                             //> true
     
     //Question 4.
     var celsius = 0.0;                           //> celsius  : Double = 0.0
     var fahrenheit = 100.0                       //> fahrenheit  : Double = 100.0
     var temp = fahrenheit                        //> temp  : Double = 100.0
     celsius = (temp - 32) * 5 / 9
     println("\n" + fahrenheit + " degree Fahrenheit is equal to " + celsius + " degree Celsius")
                                                  //> 
                                                  //| 100.0 degree Fahrenheit is equal to 37.77777777777778 degree Celsius
     
     
      //Question 5.
     celsius = 100.0;
     fahrenheit = 0.0
     temp = celsius
     fahrenheit = (temp * 9 / 5) + 32
     println("\n" + celsius + " degree Celsius is equal to " + fahrenheit + " degree fahrenheit")
                                                  //> 
                                                  //| 100.0 degree Celsius is equal to 212.0 degree fahrenheit
     
     //Methods
     //Q1. Create a method getSquare
     

     def getSquare(n1 : Int): Int ={
       return n1 * n1
     }                                            //> getSquare: (n1: Int)Int
     
      val a = getSquare(3)                        //> a  : Int = 9
      println("Value of getSquare(3) is: " + a)   //> Value of getSquare(3) is: 9
      assert(a == 3*3)
      val b = getSquare(6)                        //> b  : Int = 36
      println("Value of getSquare(6) is: " + b)   //> Value of getSquare(6) is: 36
      assert(b == 6*6)
      val c = getSquare(5)                        //> c  : Int = 25
      println("Value of getSquare(5) is: " + c)   //> Value of getSquare(5) is: 25
      assert(c == 5*5)
      
      //Q2. Create a method isArg1GreaterThanArg2
       def isArg1GreaterThanArg2(arg1 : Double, arg2 : Double) : Boolean = {
          return arg1 > arg2
      }                                           //> isArg1GreaterThanArg2: (arg1: Double, arg2: Double)Boolean
      val t1 = isArg1GreaterThanArg2(4.1, 4.12)   //> t1  : Boolean = false
      println("Value of t1 is: " + t1)            //> Value of t1 is: false
      assert(t1 == false, "Assumption Failed!")
      val t2 = isArg1GreaterThanArg2(2.1, 1.2)    //> t2  : Boolean = true
      println("Value of t2 is: " + t2)            //> Value of t2 is: true
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
      }                                           //> manyTimesString: (str: String, num: Int)String
      val m1 = manyTimesString("abc", 3)          //> m1  : String = abcabcabc
      println("Value of m1 is: " + m1)            //> Value of m1 is: abcabcabc
      assert("abcabcabc" == m1, "Assumption Failed")
      val m2 = manyTimesString("123", 2)          //> m2  : String = 123123
      println("Value of m2 is: " + m2)            //> Value of m2 is: 123123
      assert("123123" == m2, "Assumption Failed")
      
      //Classes & Objects
      //Q1. Create a Range object
      var r1 = Range (1,10)                       //> r1  : scala.collection.immutable.Range = Range(1, 2, 3, 4, 5, 6, 7, 8, 9)
      var r2 = Range (1,10,2)                     //> r2  : scala.collection.immutable.Range = Range(1, 3, 5, 7, 9)
      for (x <- r1){
        print(x + " ")                            //> 1 2 3 4 5 6 7 8 9 
      }
      println("\n1 Step above")                   //> 
                                                  //| 1 Step above
       for (x <- r2){
        print(x + " ")                            //> 1 3 5 7 9 
       }
       println("\n2 Steps above")                 //> 
                                                  //| 2 Steps above
       
       
       //Q2. Determine if two Strings are equivalent
       var s1 = "Sally"                           //> s1  : String = Sally
       var s2 = "Sally"                           //> s2  : String = Sally
       /*var ans = true
       ans = s1.equals(s2)
       println (ans)*/
       if (s1.equals(s2)) {
         println ( "s1 and s2 are equal.")
       }else{
         println ( "s1 and s2 are not equal")
       }                                          //> s1 and s2 are equal.
       //Creating Classes
       //Q1. Create classes for Hippo, Lion, Tiger, Monkey, and Giraffe,
      
     
}