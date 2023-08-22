val originList = List(1,2,3)
val oddList = originList.filter(_ % 2 == 1)
val mapByOddOrEven = originList.groupBy(_ % 2)

val words = List("I", "am", "a", "boy")
words.reduce((prev, next) => prev + " " + next)

val wordList = List("apple", "basket", "candy")
val lengthAccum: (Int, String) => Int = (accum, word) => accum + word.length
val letterCount = wordList.aggregate(0)(lengthAccum, _ + _)