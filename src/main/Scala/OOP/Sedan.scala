package OOP


class Sedan extends Car{
  override def engineStart(): Unit = println("Sedan Engine Start")
  override def engineStop(): Unit = println("Sedan Engine Stop")
}