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


class Adder {

  def add(first:Int)(second:Int): Int = first + second

}

object Adder {

  def addTest(): Unit = {
    val adder = new Adder()
    println(adder.add(2)(3))
    val lambda = adder.add(2) _
    println(lambda(3))
  }

}

// ↓ 呼び出しは new クラス名().メソッド名

class Movie() {

  def print(): Unit = {
    println("Movie!")
  }

}

class Animation() extends Movie {

  override def print(): Unit = {
    println("Animation movie!")
  }

}
