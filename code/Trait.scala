// Traitによるメソッドのミックスインと線形化

trait Hello {
  def greet(): Unit = {
    println("Hello!")
  }
}

trait Goodbye extends Hello {
  override def greet(): Unit = {
    super.greet()
    println("Good bye!")
  }
}

trait Takecare extends Hello {
  override def greet(): Unit = {
    super.greet()
    println("Take care!")
  }
}

class Greet1 extends Goodbye with Takecare
class Greet2 extends Takecare with Goodbye


// 初期化順序問題の回避

trait Greet {
  val greet: String
}

trait Language extends Greet{
  lazy val greetLanguage = greet + "Scala!"
  // valだけだとエラー。lazy val で初期化遅延。defでも書き換え可 =>
  // def greetLanguage = greet + "Scala!"
}

class Printer extends Language {
  val greet = "Hello, "

  def printGreet(): Unit = {
    println(greetLanguage)
  }
}
