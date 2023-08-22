import java.awt.Color
import scala.collection.{LinearSeq, SortedSet, mutable}

Iterable("x", "y", "z")
Map("x" -> 24, "y" -> 25, "z" -> 26)
Set(Color.red, Color.green, Color.blue)
mutable.Buffer("x", "y", "z")
IndexedSeq(1.0, 2.0)
LinearSeq("a", "b", "c")

import scala.collection.immutable.HashMap
List(1, 2, 3) // Iterable 의 구현
HashMap("x" -> 24, "y" -> 25, "z" -> 26) // Map 의 구현