class Person(val name: String, val age: Int) {
  var x: Int = 0
  var y: Int = 0
  val speed: Int = 1

  def walk(destX: Int, destY: Int): Unit = {
    x = destX
    y = destY
    println(s"$name walks to ($x, $y) with speed $speed.")
  }

  override def toString: String = s"$name, age: $age, speed: $speed, location: ($x, $y)"
}

class Parent(name: String, age: Int) extends Person(name, age) {
  override val speed: Int = 3

  def run(destX: Int, destY: Int): Unit = {
    x = destX
    y = destY
    println(s"$name runs to ($x, $y) with speed ${speed + 2}.")
  }
}

class Child(name: String, age: Int) extends Parent(name, age) {
  override val speed: Int = 5

  def swim(destX: Int, destY: Int): Unit = {
    x = destX
    y = destY
    println(s"$name swims to ($x, $y) with speed ${speed + 1}.")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val grandparent = new Person("Grandparent", 70)
    val parent = new Parent("Parent", 40)
    val child = new Child("Child", 10)

    println(grandparent)
    println(parent)
    println(child)

    grandparent.walk(1, 1)
    parent.walk(1, 1)
    child.walk(1, 1)

    parent.run(2, 2)
    child.run(2, 2)

    child.swim(3, -1)
  }
}