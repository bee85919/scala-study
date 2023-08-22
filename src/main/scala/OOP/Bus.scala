package OOP

class Bus extends Car with Payment {
  override def engineStart(): Unit = println("Bus Engine Start")
  override def engineStop(): Unit = println("Bus Engine Stop")
  override def collect(amount: Int): Boolean = {
    println("Paid $amount won")
    true
  }
}
