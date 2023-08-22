package OOP

// trait AbstractCar(name: String)
abstract class AbstractCar (var name: String) {
  def changeName(newName: String): Unit = { name = newName }
  def engineStart(): Unit = println(s"$name Engine Start")
  def engineStop(): Unit = println(s"$name Engine Stop")
  def accelerate(): Unit // 추상 메소드
  def brake(): Unit = println(s"$name braking!")
}