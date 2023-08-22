trait Car {
  val name: String

  def engineStart(): Unit = println("Engine Start")

  def engineStop(): Unit
}

class Sedan(val name: String) extends Car {
  def engineStop(): Unit = println("Engine Stop")
}

class Suv(val name: String) extends Car {
  override def engineStart() = println("Engine Start by custom")

  def engineStop() = println("Engine Stop")
}