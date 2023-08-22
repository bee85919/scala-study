// trait Car(name: String)

abstract class Car(name: String) {
  def engineStart(): Unit = println("Engine Start")

  def engineStop(): Unit = println("Engine Stop")

  def accelerate(): Unit // 추상 메소드

  def brake(): Unit = println(s"$name braking!")

  class Bus(name: String) extends Car(name) {
    override def engineStart() = println("Bus Engine Start")

    def accelerate() = println("Bus accelerating!")
  }

  val myBus = new Bus("402")
  myBus.engineStart
  myBus.accelerate
  myBus.brake