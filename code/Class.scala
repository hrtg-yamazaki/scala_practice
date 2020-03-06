class Point(val a: Int, val b: Int) {

  def +(p: Point): Point = {
    new Point(a + p.a, b + p.b)
  }
  override def toString(): String = "(" + a + ", " + b + ")"

}

object Point {

  def calculate(): Unit = {
    val first = new Point(5, 2)
    val second = new Point(8, 5)
    println(first + second)
  }
  
}
