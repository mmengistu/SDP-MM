package week7

trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
}

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

case class Square(width: Double, height: Double) extends Shape {
  override def perimeter(): Double = {
    return 4 * width
  }
  override def sides(): Int = {
    return 4
  }
  override def area(): Double = {
    return width * width
  }
}

case class Rectangle(width: Double, height: Double) extends Shape {
  override def perimeter(): Double = {
    return 2 * height + 2 * width
  }
  override def sides(): Int = {
    return 4
  }
  override def area(): Double = {
    return height * width
  }
}

object Test {
  def main(args: Array[String]) {
    val c = new Circle(10)
    println(c.perimeter)
    println(c.sides)
    println(c.area)

    val s = new Square(10, 10)

    println(s.perimeter())
    println(s.sides())
    println(s.area())

    val r = new Rectangle(10, 9)

    println(r.perimeter())
    println(r.sides())
    println(r.area())

  }
}
  

