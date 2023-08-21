// 다음 주어진 List 에 있는 단어의 수와, 총 문자의 수를 한번에 계산하는 함수를 collection 을 이용해서 계산하세요.

val wordList = List("apple", "basket", "candy")

val result = wordList.map(word => (1, word.length)).reduce((a, b) => (a._1 + b._1, a._2 + b._2))

val wordCount = result._1 // 단어의 개수
val charCount = result._2 // 총 문자의 개수
