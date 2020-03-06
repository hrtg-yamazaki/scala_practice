object For {

  def printFor(): Unit = {
    for (m <- 0 to 4; n <- 1 until 5) {
      println("first = " + m + "second = " + n)
    }
  }

  def editList(): Unit = {
    // called as "for-comprehension"
    for(name <- List("A", "B", "C", "D", "E")) yield {
      println(name + "さん")
    }
  }

  def threeSquare(): Unit = {
    for (a <- 1 to 1000; b <- 1 to 1000; c <- 1 to 1000; if (a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
      println((a, b, c))
    }
  }

}