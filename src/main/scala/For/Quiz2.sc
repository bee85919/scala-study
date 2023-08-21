type Row = Array[Int]

def Row(xs: Int*) = Array(xs: _*)

type Matrix = Array[Row]

implicit class MatrixOperators(_this: Matrix) {

  def *(other: Matrix): Option[Matrix] = {

    if (_this.head.length != other.length) return None

    val result = Array.ofDim[Int](_this.length, other.head.length)

    for (i <- _this.indices; j <- other.head.indices) {
      result(i)(j) = _this(i).zip(other.map(_(j))).map { case (a, b) => a * b }.sum
    }

    Some(result)
  }
}

val matrix1: Matrix = Array(Row(1, 2), Row(3, 4))
val matrix2: Matrix = Array(Row(5, 6), Row(7, 8))
val result: Option[Matrix] = matrix1 * matrix2

result match {
  case Some(matrix) => matrix.foreach(row => println(row.mkString(", ")))
  case None => println("Can't multiply")
}