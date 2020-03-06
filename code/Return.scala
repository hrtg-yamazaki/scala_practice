object Return {
  
  def indexOf(array: Array[String], target: String): Int = {

    // var index = -1
    // var found = false
    // var i = 0
    // while(i < array.length && !found) {
    //   if(array[i] == target) {
    //     index = i
    //     found = true
    //   }
    //   i += 1
    // }
    // index

    // returnを使えば上のようなfoundによる指定要素発見判定が不要になる
    // (見通しの良い記述でwhileから出られる流れを作れる
    // 脱出の必要がなければreturnは原則書かない

    var i = 0
    while(i < array.length) {
      if(array(i) == target) return i
      i += 1
    }
    -1

  }
}