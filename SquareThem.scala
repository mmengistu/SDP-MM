package q5squarethem

object squareThem extends App{
   def sum(a: List[Int]):Int = (0 /: a) (_+_ ) //fold lists
   var a = List(2)
   var squares =  a.map(x => x*x)
   println(sum(squares))
   a = List(2, 4)
   squares =  a.map(x => x*x)
    println(sum(squares))
   a = List(1, 2, 4)
   squares =  a.map(x => x*x)
   println(sum(squares))
      
}