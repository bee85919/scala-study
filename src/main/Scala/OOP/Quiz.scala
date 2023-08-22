class Person(val name: String, val age: Int) {
  var x: Int = 0
  var y: Int = 0
  val speed: Int = 1

  def walk(destX: Int, destY: Int): Unit = {
    x = destX
    y = destY
    println(s"${name} ${speed}의 속도로 ($x, $y)으로 걷는다.")
  }

  override def toString: String = s"$name, age: $age, speed: $speed, location: ($x, $y)"
}

class Parent(name: String, age: Int) extends Person(name, age) {
  override val speed: Int = 3

  def run(destX: Int, destY: Int): Unit = {
    x = destX
    y = destY
    println(s"${name} ${speed + 2}의 속도로 ($x, $y)으로 달린다.")
  }
}

class Child(name: String, age: Int) extends Parent(name, age) {
  override val speed: Int = 5

  def swim(destX: Int, destY: Int): Unit = {
    x = destX
    y = destY
    println(s"${name} ${speed + 1}의 속도로 ($x, $y)으로 수영한다.")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val grandparent = new Person("조부모가", 70)
    val parent = new Parent("부모가", 40)
    val child = new Child("자식이", 10)

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