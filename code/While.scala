object While {
  var i = 2
  def EvenArray() =
    while (i <= 52){
      println(i)
      i = i + 2
    }

  var n = 1 
  def OddArray() =
    do {
      println(n)
      n = n + 2
    } while(n <= 52)
}