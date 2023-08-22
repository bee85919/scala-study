val a1 = Array(1, 2, 3)
val a2 = a1.map(_ * 3)
val a3 = a2.filter(_ % 2 != 0)
a3.reverse

val seq: collection.Seq[Int] = a1
val a4: Array[Int] = seq.toArray
a1 eq a4

val seq: collection.Seq[Int] = a1
seq.reverse

val ops: collection.ArrayOps[Int] = a1
ops.reverse