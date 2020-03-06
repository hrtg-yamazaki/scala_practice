object Match {

  def matchEra(): Unit = {
    val endYear = 1989

    endYear match {
      case 1926 => println("Taisho")
      case 1989 => println("Showa")
      case 2019 => println("Heisei")
      case _ => println("other")
    }
  }

  def matchList(): Unit = {
    val startYear = List("1926", "1989", "2019")

    startYear match {
      case List("1926", b, c) if b != "1926" =>
        println("平成は" + b + "年に始まりました")
        println("令和は" + c + "年に始まりました")
      case _ =>
        println("条件にマッチしません")
    }

    // Listを用いた記述は以下のようにも書き換えられる(中置パターン)
    // startYear match {
    //   case "1926" :: b :: c if b != "1926" =>
    //     println("平成は" + b + "年に始まりました")
    //     println("令和は" + c + "年に始まりました")
    //   case _ =>
    //     println("条件にマッチしません")
    // }
  }

  def matchNest(): Unit = {
    val nest = List(List("One"), List("Two", "Three"))

    nest match {
      case List(x@List("One"), y) =>
        println(x)
        println(y)
        case _ => println("Zero")
    }
  }

  import java.util.Locale

  def matchPattern(): Unit = {
    val p: AnyRef = "testing Pattern Match"
    
    p match {
      case s:java.lang.Integer =>
        println("整数型です！")
      case s:String =>
        println(s.toUpperCase(Locale.ENGLISH))
    }
  }
  // AnyRefに入れてパターンマッチを用いれば、キャストせずに該当する型のメソッドを呼び出せる
  // List[Int]のような型変数を含む型はパターンマッチを使えないのでList[_]のようにワイルドカードを使う

  def randomChar(): Unit = {
    for(i <- 1 to 1000) {
      val char = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList match{
      case List(a, b, c, d, _) =>
        List(a, b, c, d, a).mkString
      }
      println(char)
    }
  }

}