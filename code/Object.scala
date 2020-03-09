// 以下３つのパターンで同じ挙動を期待できる

// １つめ これまで学んだクラス定義

// class Point2(val x:Int, val y:Int)
// object Point2 {
//   def printPoint(): Unit = {
//     val p = new Point2(5, 2)
//     println(p.x + ", " + p.y)
//   }
// }

// ２つめ applyメソッドを用いたnewの省略

// class Point2(val x:Int, val y:Int)
// object Point2 {
//   def apply(x: Int, y: Int): Point2 = new Point2(x, y)
//   def printPoint(): Unit = {
//     val p = Point2(5, 2)
//     println(p.x + ", " + p.y)
//   }
// }

// ３つめ caseを使った省略形

case class Point2(x: Int, y: Int)
object Point2 {
  def printPoint(): Unit = {
    val p = Point2(5, 2)
    println(p.x + ", " + p.y)
  }
}


// コンパニオンオブジェクトによるprivateフィールドへのアクセス //

class Vegitable(val name: String, private val price: Int)

// 別名のオブジェクト構文ではprivateフィールドへアクセスできないが・・・
// object Food {
//   def printPrice(): Unit = {
//     val eggplants = new Vegitable("eggplants", 198)
//     println(eggplants.price)
//   }
// }
// 以下のように同名ならばアクセス出来る
object Vegitable {
  def printPrice(): Unit = {
    val eggplants = new Vegitable("eggplants", 198)
    println(eggplants.price)
  }
}
