object FunctionTest{

  def printMultiply(): Unit = {

    // 関数定義を厳密に行うと以下のように記述することになるが・・・
    // val multiply = new Function[Int, Int, Int]{
    //   def apply(x: Int, y:Int): Int = x * y
    // }
    // シンタックスシュガーを利用すればapplyを省略した形に書き換えられる //
    val multiply = (x: Int, y: Int) => x * y

    println(multiply.apply(500, 200))
    // applyは特別扱いなので省略しても同じ挙動が期待できる
    println(multiply(500, 200))

    // 「カリー化」というネストのテクニックも使える(呼び出し方に注意)
    val multiplyCurried = (x: Int) => ((y: Int) => x * y)

    println(multiplyCurried(500)(200))
  }

  def printDivide(): Unit = {
    def divide(x: Int)(y: Int): Int = x / y

    // メソッドとして定義したものに _ を追記すればカリー化関数を得られる
    divide _

    println(divide(400)(200))
  }

  // 高階関数：関数を引数にとったり、返り値に関数を返す「関数」や「メソッド」

  def printTriple(): Unit = {
    def triple(n: Int, f: Int => Int): Int = {
      f(f(f(n)))
    }
    println(triple(1, m => m * 2))
  }

  // 高階関数の仕組みを利用すれば、複数の処理をそれぞれ部品化して例外が起きた場合でも事後処理を可能にできる(ローンパターン)

  def printAround(): Unit = {
    
    def around(init: () => Unit, body: () => Any, fin: () => Unit): Any = {
      init()
      try {
        body()
      } finally {
        fin()
      }
    }
    around(
      () => println("Hello, "),
      () => throw new Exception("Excepted!"),
      () => println("Hello Scala!")
    )

  }

  // ローンパターンの練習問題はREPLで試してみる！

}
