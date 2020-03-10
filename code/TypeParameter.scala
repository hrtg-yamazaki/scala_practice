// 型パラメータを入れたクラスで後から型を指定 //

class Item[A](var content: A) {

  def put(newContent: A): Unit = {
     content = newContent
  }

  def get(): A = content

}

object Item {

  def printString(): Unit = {
    val item = new Item[String]("Hello")
    item.put(item.content + ", Scala!")
    println(item.get())
  }

  def printInteger(): Unit = {
    val item = new Item[Int](5)
    item.put(item.content + 2)
    println(item.get())
  }

}

// 複数の値を返すメソッドを作成するためのクラス定義 //

class Quad[A, B, C, D](val a: A, val b: B, val c: C, val d: D) {
  override def toString(): String = a + ", " + b + ", " + c + ", " + d
}

object Quad {

  def calculate(x: Int, y: Int): Quad[Int, Int, Int, Int] = new Quad[Int, Int, Int, Int](x + y, x - y, x * y, x / y)

  def printResult(): Unit = {
    println(Quad.calculate(100, 10))
  }
  
}
