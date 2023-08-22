val nums: List[Int] = List(1,2,3,4,5)

val doubleNumbers = for (num <- nums) num * 2 // yield 가 없는 것을 주목해 주세요
println(doubleNumbers)

val doubleNumbersWithYield = for (num <- nums) yield num * 2
println(doubleNumbersWithYield)