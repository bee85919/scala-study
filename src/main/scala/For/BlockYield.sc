val nums: List[Int] = List(1,2,3,4,5)

val someNumbers = for (num <- nums) yield {
  val numPlusOne = num + 1
  val numMinusOne = num -1
  numPlusOne * numMinusOne
}

println(someNumbers)