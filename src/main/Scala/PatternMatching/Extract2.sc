val xs = List(1, 2, 3, 4, 5, 6)
xs match {
  case h :: t => println(h :: t)
  case _ => println("not in list")
}