val originList = List(1,2,3)
val plusOneList = originList map (_ + 1)
val oddList = originList.filter(_ % 2 == 1)

println(oddList)

originList.sum + originList.size == plusOneList.sum
originList ne plusOneList