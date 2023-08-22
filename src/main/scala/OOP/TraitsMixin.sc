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

trait PaymentModule {
  def collectPayment(amount: Int): Unit
}

class Bus(val name: String) extends Car with PaymentModule {
  // Car
  override def engineStart(): Unit = println("Engine Start")

  def engineStop(): Unit = println("Engine Stop")

  // PaymentModule
  def collectPayment(amount: Int): Unit = {
    // 결제를 위한 기능을 여기서 수행합니다.
    println(s"paid ${amount} won")
  }
}

def main(args: Array[String]): Unit = {
  val sedan: Car = new Sedan("Sonata")
  val suv: Car = new Suv("GV80")
  val bus: Car = new Bus("Tayo")
  bus.asInstanceOf[PaymentModule].collectPayment(1600)

  val cars = List(sedan, suv, bus)
  cars.foreach(it => {
    println(s"---${it.name}---")
    it.engineStart()
    it.engineStop()

    it match {
      case module: PaymentModule =>
        module.collectPayment(1600)
      case _ =>
    }
  })
}