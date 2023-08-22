case class Person(name: String, age: Int)
val p = Person("John Doe", 42)
p match {
  case Person(name, 42) => println("matching: " + name)
  case _ => println("this person is not aged 42.")
}