package OOP

object OOP {
  def main(args: Array[String]): Unit = {

    val Sedan: Car = new Sedan()
    val SUV: Car = new SUV()
    val Bus: Car = new Bus()

    val cars = List(Sedan, SUV, Bus)

    cars.foreach(it => {
      it.engineStart()
      it.engineStop()
    })

    Bus.asInstanceOf[Payment].collect(amount = 1600)
  }
}