package OOP

class Bus extends AbstractCar(name = "Bus") with Payment {
  override def engineStart(): Unit = println(s"$name Engine Start")
  override def engineStop(): Unit = println(s"$name Engine Stop")
  override def collect(amount: Int): Boolean = {
    println(s"Paid $amount won")
    true
  }
  override def accelerate(): Unit = println(s"$name accelerating!")
}
