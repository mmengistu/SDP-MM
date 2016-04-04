package q5b

trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
}

abstract class Rectangular(_width:Double, _height:Double) extends Shape{
  def width = _width
  def height = _height
  def isSquare = if (_width == _height) true  else false
  
  override def perimeter(): Double = {
    return 2 * (width + height)
  }
  override def sides(): Int = {
    return 4
  }
  override def area(): Double = {
    return width * height
  }
}

case class Square(w: Double, h: Double) extends Rectangular(w,h) with Shape{
  override def width = w
  override def height = h
  val sq = new Rectangular(width,height) with Shape()
  override def sides = sq.sides() 
  println(sides)
  override def perimeter = sq.perimeter()
  println(perimeter)
  override def area = sq.area()
  println(area)
}

case class Rectangle(w: Double, h: Double) extends Rectangular(w,h)with Shape{
  override def width = w
  override def height = h
  val r = new Rectangular(width,height) with Shape()
  override def sides() = r.sides()
  println(sides)
  override def perimeter() = r.perimeter()
  println(perimeter)
  override def area() = r.area()
  println(area)
}
/*
class Rect (width: Double, height: Double) {
  def f(r : Rectangular) : Shape =
    r match {
    case Square(width, height) =>Square(width,height); 
    case Rectangle(width,height) => Rectangle(width,height)
  
  }
}*/

case class Circle(r: Double) extends Shape {
  private val pi = math.Pi
  override def perimeter(): Double = {
    return pi * 2 * r
  }
  override def sides(): Int = {
    return 0
  }
  override def area(): Double = {
    return pi * r * r
  }
}

object ShapeTest extends App {

  Square(10, 10)
  Rectangle(10, 9)

  val c = new Circle(10)
  println(c.sides)
  println(c.perimeter)
  println(c.area)

}


