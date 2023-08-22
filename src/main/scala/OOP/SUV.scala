package OOP


class SUV extends Car{
  override def engineStart(): Unit = println("SUV Engine Start")
  override def engineStop(): Unit = println("SUV Engine Stop")

}
