package OOP

object OOP {
  def main(args: Array[String]): Unit = {

    val Sedan: Car = new Sedan()
    val SUV: Car = new SUV()
    val Bus: AbstractCar = new Bus()

    val cars = List(Sedan, SUV)

    cars.foreach(it => {
      it.engineStart()
      it.engineStop()
    })

    Bus.changeName("Ferrari")


    Bus.engineStop()
    Bus.asInstanceOf[Payment].collect(amount = 1600)
    Bus.engineStart()
    Bus.accelerate()
  }
}