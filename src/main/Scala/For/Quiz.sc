def fibonacci(size: Int): Array[Int] = {

  if (size <= 0) return Array()

  val result = new Array[Int](size)

  result(0) = 0

  if (size > 1) result(1) = 1

  for (i <- 2 until size) {
    result(i) = result(i - 1) + result(i - 2)
  }

  result
}


val size = 10
println(s"Fibonacci sequence of size $size: ${fibonacci(size).mkString(", ")}")
