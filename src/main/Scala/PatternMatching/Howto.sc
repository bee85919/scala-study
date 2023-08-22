val anything: Int = 42
anything match {
  case 0 => println("Matched 0!")
  case 1 => println("Matched 1!")
  case _ => println("Oops! No match!")
}