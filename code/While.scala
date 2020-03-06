object While {

  def EvenArray(): Unit = {
    var i = 2
    while (i <= 52){
      println(i)
      i = i + 2
    }
  }

  def OddArray(): Unit = {
    var n = 1 
    do {
      println(n)
      n = n + 2
    } while(n <= 52)
  }
}