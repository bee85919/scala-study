val numbers = Map(
  "one" -> 1,
  "two" -> 2,
  "three" -> 3
)

for ((key, value) <- numbers) println(s"Number $key : $value")