def example(anything: Int): String = anything match {
  case 0 => "Matched 0!"
  case 1 => "Matched 1!"
  case _ => "Oops! No match!"
}

val case0: String = example(0)
println(case0)

val case1: String = example(1)
println(case1)

val case2: String = example(2)
println(case2)

//val casestring0: Int = example(0) // Error
//val casestring0: String = example("0") // Error