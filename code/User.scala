class User(val name: String, val age: Int)

object User {
  def printUser(user: User) = println(user.name + "さんは、" + user.age + "才です")

  def adult_or_child(user: User) =
  if(user.age < 20) {
    println("未成年です")
  } else {
    println("成人です")
  }
}
